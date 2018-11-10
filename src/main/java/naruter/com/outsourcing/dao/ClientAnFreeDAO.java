package naruter.com.outsourcing.dao;


import java.util.List;

import naruter.com.outsourcing.vo.AdditionalFreeInfo;
import naruter.com.outsourcing.vo.ClientInfo;
import naruter.com.outsourcing.vo.FreelancerInfo;

public interface ClientAnFreeDAO {
	public Integer clientInsert(ClientInfo ci);
	public Integer freeInsert(FreelancerInfo fi);
	public Integer freeEduInsert(AdditionalFreeInfo edu);
	public Integer freeEduInsertList(List<AdditionalFreeInfo> eduList);
	
	public ClientInfo clientSelect(Integer memberNum);
	public FreelancerInfo freeSelect(Integer memberNum);
	public List<AdditionalFreeInfo> freeEduSelect(Integer memberNum);
	
	public Integer clientUpdate(ClientInfo ci);
	public Integer freeUpdate(FreelancerInfo fi);
	public Integer freeEduUpdate(AdditionalFreeInfo edu);
	
	public Integer additionalDel(AdditionalFreeInfo addinfo);
	
	public Integer chSkill(Integer skillNum);
	public Character getMemType(Integer memberNum);
}