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
	public FileList selectFile(FileList fl) {
		return fdao.selectFile(fl);
	}

	@Override
	public int updateFile(List<FileList> fl) {
		return fdao.updateFile(fl);
	}

	@Override
	public int insertFile(List<FileList> fl) {
		return fdao.insertFile(fl);
	}

	@Override
	public int deleteFile(List<FileList> fl) {
		return fdao.deleteFile(fl);
	}

}
