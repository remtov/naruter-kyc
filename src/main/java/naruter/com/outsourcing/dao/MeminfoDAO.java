package naruter.com.outsourcing.dao;

import naruter.com.outsourcing.vo.MemberInfo;

public interface MeminfoDAO {
	public Integer loginSelect(MemberInfo memInfo);
	public Integer join(MemberInfo memInfo);
}
