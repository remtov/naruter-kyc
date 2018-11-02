package naruter.com.outsourcing.dao;


import java.util.Map;

import naruter.com.outsourcing.vo.ClientInfo;
import naruter.com.outsourcing.vo.FreelancerInfo;

public interface ClientAnFreeDAO {
	public Integer clientInsert(ClientInfo ci);
	public Integer freeInsert(FreelancerInfo fi);
	public Map<String,String> clientSelect(Integer memberNum);
	public Map<String,String> freeSelect(Integer memberNum);
	public Integer clientUpdate(ClientInfo ci);
	public Integer freeUpdate(FreelancerInfo fi);
	
	public Integer chSkill(Integer skillNum);
	public Character getMemType(Integer memberNum);
}