package naruter.com.outsourcing.dao;

import naruter.com.outsourcing.vo.MemberInfo;

public interface MeminfoDAO {
	public Integer loginSelect(MemberInfo memInfo);
	public Integer join(MemberInfo memInfo);
	//아이디 중복 조회 필요쓰
}
