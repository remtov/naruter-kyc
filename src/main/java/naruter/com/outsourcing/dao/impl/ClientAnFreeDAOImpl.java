package naruter.com.outsourcing.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import naruter.com.outsourcing.dao.ClientAnFreeDAO;
import naruter.com.outsourcing.vo.AdditionalFreeInfo;
import naruter.com.outsourcing.vo.ClientInfo;
import naruter.com.outsourcing.vo.FreelancerInfo;

@Slf4j
@Repository
public class ClientAnFreeDAOImpl implements ClientAnFreeDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public Integer clientInsert(ClientInfo ci) {
		// TODO Auto-generated method stub
		return ss.insert("SQL.CLIENTANFREE.inClient", ci);
	}
	@Override
	public Integer freeInsert(FreelancerInfo fi) {
		// TODO Auto-generated method stub
		return ss.insert("SQL.CLIENTANFREE.inFree", fi);
	}
	@Override
	public Integer freeEduInsertList(List<AdditionalFreeInfo> eduList) {
		// TODO Auto-generated method stub
		int hap=0;
		for(AdditionalFreeInfo edu : eduList) {
			hap += ss.insert("SQL.CLIENTANFREE.inEdu",edu);
		}
		return hap;
	}
	@Override
	public Integer freeEduInsert(AdditionalFreeInfo edu) {
		// TODO Auto-generated method stub
		return ss.insert("SQL.CLIENTANFREE.inEdu",edu);
	}

	@Override
	public Integer clientUpdate(ClientInfo ci) {
		// TODO Auto-generated method stub
		return ss.update("SQL.CLIENTANFREE.upClient", ci);
	}
	@Override
	public Integer freeUpdate(FreelancerInfo fi) {
		// TODO Auto-generated method stub
		return ss.update("SQL.CLIENTANFREE.upFree", fi);
	}
	@Override
	public Integer freeEduUpdate(AdditionalFreeInfo edu) {
		// TODO Auto-generated method stub
		return ss.update("SQL.CLIENTANFREE.upEdu", edu);
	}
	
	@Override
	public ClientInfo clientSelect(Integer memberNum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.CLIENTANFREE.selClient", memberNum);
	}
	@Override
	public FreelancerInfo freeSelect(Integer memberNum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.CLIENTANFREE.selFree", memberNum);
	}
	@Override
	public List<AdditionalFreeInfo> freeEduSelect(Integer memberNum) {
		// TODO Auto-generated method stub
		return ss.selectList("SQL.CLIENTANFREE.selEdu", memberNum);
	}
	
	@Override
	public Integer additionalDel(AdditionalFreeInfo addinfo) {
		// TODO Auto-generated method stub
		return ss.delete("SQL.CLIENTANFREE.delEdu", addinfo);
	}
	
	@Override
	public Character getMemType(Integer memberNum) {
		String type = ss.selectOne("SQL.CLIENTANFREE.getType", memberNum);
		return type.charAt(0);
	}
	@Override
	public Integer chSkill(Integer skillNum) {
		// TODO Auto-generated method stub
		return ss.selectOne("SQL.CLIENTANFREE.chSkill", skillNum);
	}

}
