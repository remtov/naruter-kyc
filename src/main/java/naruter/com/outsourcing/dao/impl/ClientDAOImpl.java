package naruter.com.outsourcing.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naruter.com.outsourcing.dao.ClientDAO;
import naruter.com.outsourcing.vo.ClientInfo;

@Repository
public class ClientDAOImpl implements ClientDAO {

	@Autowired
	private SqlSession ss;

	@Override
	public List<ClientInfo> getClientInfoList(ClientInfo ci) {

		return ss.selectList("SQL.CLIENTINFO.selectClientInfoList", ci);
	}

	@Override
	public ClientInfo getCiientInfo(ClientInfo ci) {

		return ss.selectOne("SQL.CLIENTINFO.selectClientInfo", ci);
	}

	@Override
	public int insertClientInfo(ClientInfo ci) {

		return ss.insert("SQL.CLIENTINFO.insetClientInfo", ci);
	}

	@Override
	public int updateClientInfo(ClientInfo ci) {

		return ss.update("SQL.CLIENTINFO.updateClientInfo", ci);
	}

	@Override
	public int deleteClientInfo(int membernum) {

		return ss.delete("SQL.CLIENTINFO.deleteInfo", membernum);
	}

	@Override
	public int getmembernum() {
		
		return ss.selectOne("SQL.CLIENTINFO.selectmembernum");
	}

}
