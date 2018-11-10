package naruter.com.outsourcing.service.impl;

import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Map;

import org.apache.commons.beanutils.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import naruter.com.outsourcing.dao.ClientAnFreeDAO;
import naruter.com.outsourcing.service.ClientAnFreeService;
import naruter.com.outsourcing.vo.AdditionalFreeInfo;
import naruter.com.outsourcing.vo.ClientInfo;
import naruter.com.outsourcing.vo.FreelancerInfo;

@JsonInclude(JsonInclude.Include.NON_NULL)
@Service
public class ClientAnFreeServiceImpl implements ClientAnFreeService {

	@Autowired
	private ClientAnFreeDAO cfdao;

	@Override
	public Integer cfInsert(Map<String, Object> m) throws IllegalAccessException, InvocationTargetException {
		int suc = 0;
		Object obj = conversionMap(m);
		if (obj instanceof ClientInfo) {
			suc = cfdao.clientInsert((ClientInfo) obj);
		} else if (obj instanceof FreelancerInfo) {
			suc = cfdao.freeInsert((FreelancerInfo) obj);
			suc += cfdao.freeEduInsertList(((FreelancerInfo) obj).getEcl());
		} else {
			suc = -1;
		}
		return suc;
	}

	@Override
	public Integer cfUpdate(Map<String, Object> m) throws IllegalAccessException, InvocationTargetException {
		int suc = 0;
		Object obj = conversionMap(m);
		if (obj instanceof ClientInfo) {
			suc = cfdao.clientUpdate((ClientInfo) obj);
		} else if (obj instanceof FreelancerInfo) {
			suc = cfdao.freeUpdate((FreelancerInfo) obj);
			for (AdditionalFreeInfo e : ((FreelancerInfo) obj).getEcl()) {
				if (e.getAdditionalnum() != null) {
					// 업데이트
					suc += cfdao.freeEduUpdate(e);
					continue;
				}
				// 인설트
				suc += cfdao.freeEduInsert(e);
			}
		} else {
			suc = -1;
		}
		return suc;
	}

	@Override
	public Object cfGet(Integer memberNum) {
		Character type = cfdao.getMemType(memberNum);
		if (type.equals('1')) {
			return cfdao.clientSelect(memberNum);
		} else if (type.equals('2')) {
			FreelancerInfo fi = new FreelancerInfo();
			fi = cfdao.freeSelect(memberNum);
			fi.setEcl(cfdao.freeEduSelect(memberNum));
			return (Object) fi;
		} else {
			return null;
		}
	}
	
	@Override
	public Integer additionalDel(AdditionalFreeInfo addinfo) {
		return cfdao.additionalDel(addinfo);
	}
	private Object conversionMap(Map<String, Object> m) throws IllegalAccessException, InvocationTargetException {
		Character type = cfdao.getMemType(Integer.parseInt((String) m.get("membernum")));

		if (type.equals('1')) {
			// client
			ClientInfo ci = new ClientInfo();
			BeanUtils.populate(ci, m);
			return ci;
		} else if (type.equals('2')) {
			// freelancer
			FreelancerInfo fi = new FreelancerInfo();
			BeanUtils.populate(fi, m);
			if (cfdao.chSkill(fi.getSkillnum()) == 0) { // db에 있는 기술 조회 없으면 return;
				fi = null;
			}
			if (fi.getEcl() != null && fi != null) {
				ObjectMapper mapper = new ObjectMapper();
				List<AdditionalFreeInfo> elist = mapper.convertValue(fi.getEcl(),
						new TypeReference<List<AdditionalFreeInfo>>() {});
				fi.setEcl(elist);
				for (AdditionalFreeInfo e : fi.getEcl()) {
					e.setMembernum(fi.getMembernum());
					if(e.getAdditionaltype()=='3') {
						e.setAdditionalenddate("000000");
					}
				}
			}
			return fi;
		} else {
			return null;
		}
	}


}
