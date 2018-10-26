package naruter.com.outsourcing.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naruter.com.outsourcing.dao.SignDAO;
import naruter.com.outsourcing.service.SignService;
import naruter.com.outsourcing.vo.MemberInfo;

@Service
public class SignServiceImpl implements SignService {

	@Autowired
	private SignDAO sdao;

	@Override
	public Integer loginGet(MemberInfo memInfo) {
		int cnt = -1;
		if (memInfo != null && memInfo.getMemberid() != null && memInfo.getMemberpw() != null) {
			cnt = sdao.loginSelect(memInfo);
		}
		return cnt;
	}

}
