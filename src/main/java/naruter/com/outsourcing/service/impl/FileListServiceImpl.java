package naruter.com.outsourcing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naruter.com.outsourcing.dao.FileListDAO;
import naruter.com.outsourcing.service.FileListService;
import naruter.com.outsourcing.vo.FileList;

@Service
public class FileListServiceImpl implements FileListService {
	@Autowired
	private FileListDAO fdao;

	@Override
	public List<FileList> selectFileList(FileList fl) {
		return fdao.selectFileList(fl);
	}

	@Override
	public FileList selectFile(int pnum) {
		return fdao.selectFile(pnum);
	}

	@Override
	public int updateFileList(List<FileList> fl) {
		return fdao.updateFileList(fl);
	}

	@Override
	public int insertFileList(List<FileList> fl) {
		return fdao.insertFileList(fl);
	}

	@Override
	public int deleteFileList(List<FileList> fl) {
		return fdao.deleteFileList(fl);
	}

}
