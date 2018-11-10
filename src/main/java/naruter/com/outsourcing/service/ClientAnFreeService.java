package naruter.com.outsourcing.service;

import java.lang.reflect.InvocationTargetException;
import java.util.Map;

import naruter.com.outsourcing.vo.AdditionalFreeInfo;

public interface ClientAnFreeService {
	public Integer cfInsert(Map<String,Object> m) throws IllegalAccessException, InvocationTargetException;
	public Integer cfUpdate(Map<String,Object> m) throws IllegalAccessException, InvocationTargetException;
	public Object cfGet(Integer memberNum);
	public Integer additionalDel(AdditionalFreeInfo addinfo);
}
