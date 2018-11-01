package naruter.com.outsourcing.service;

import java.util.List;

import naruter.com.outsourcing.vo.ClientInfo;

public interface ClientService {
	public List<ClientInfo> getClientInfoList(ClientInfo ci);

	public ClientInfo getCiientInfo(ClientInfo ci);

	public int insertClientInfo(ClientInfo ci);

	public int updateClientInfo(ClientInfo ci);

	public int deleteClientInfo(int membernum);
	
	public int getMembernum();

}
