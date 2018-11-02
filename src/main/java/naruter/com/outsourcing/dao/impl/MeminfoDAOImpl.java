package naruter.com.outsourcing.dao.impl;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import lombok.extern.slf4j.Slf4j;
import naruter.com.outsourcing.dao.MeminfoDAO;
import naruter.com.outsourcing.vo.MemberInfo;

@Slf4j
@Repository
public class MeminfoDAOImpl implements MeminfoDAO{
	@Autowired
	private SqlSession ss;
	MemberInfo m = new MemberInfo();
	
	@Override
	public Integer loginSelect(MemberInfo memInfo) {
		memInfo=ss.selectOne("SQL.MEMBERINFO.login",memInfo);
		return memInfo.getMembernum();
	}

	@Override
	public Integer join(MemberInfo memInfo) {
		log.info(memInfo.toString());
		return ss.insert("SQL.MEMBERINFO.join",memInfo);
	}

}
