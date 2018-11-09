package naruter.com.outsourcing.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naruter.com.outsourcing.dao.FileListDAO;
import naruter.com.outsourcing.vo.FileList;

@Repository
public class FileListDAOImpl implements FileListDAO {
	@Autowired
	private SqlSession ss;

	@Override
	public List<FileList> selectFileList(FileList fl) { //리스트조회o
		return ss.selectList("SQL.FILELIST.selectFileList",fl);
	}

	@Override
	public FileList selectFile(int pnum) { //조회o
		return ss.selectOne("SQL.FILELIST.selectFile",pnum);
	}

	@Override
	public int updateFileList(List<FileList> fl) {
		return ss.update("SQL.FILELIST.updateFileList",fl);
	}

	@Override
	public int insertFileList(List<FileList> fl) {
		return ss.insert("SQL.FILELIST.insertFileList",fl);
	}

	@Override
	public int deleteFileList(List<FileList> fl) { //리스트로 삭제o
		return ss.delete("SQL.FILELIST.deleteFileList",fl);
	}

}
