package naruter.com.outsourcing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naruter.com.outsourcing.dao.ClientDAO;
import naruter.com.outsourcing.service.ClientService;
import naruter.com.outsourcing.vo.ClientInfo;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientDAO cdao;

	@Override
	public List<ClientInfo> getClientInfoList(ClientInfo ci) {
		return cdao.getClientInfoList(ci);
	}

	@Override
	public ClientInfo getCiientInfo(ClientInfo ci) {

		return cdao.getCiientInfo(ci);
	}

	@Override
	public int insertClientInfo(ClientInfo ci) {

		return cdao.insertClientInfo(ci);
	}

	@Override
	public int updateClientInfo(ClientInfo ci) {

		return cdao.updateClientInfo(ci);
	}

	@Override
	public int deleteClientInfo(int membernum) {

		return cdao.deleteClientInfo(membernum);
	}

	@Override
	public int getMembernum() {
		// TODO Auto-generated method stub
		return cdao.getmembernum();
	}

}
