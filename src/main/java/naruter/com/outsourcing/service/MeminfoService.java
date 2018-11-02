package naruter.com.outsourcing.service;

import naruter.com.outsourcing.vo.MemberInfo;

public interface MeminfoService {
	public Integer loginGet(MemberInfo memInfo);
	public Integer join(MemberInfo memInfo);
}
