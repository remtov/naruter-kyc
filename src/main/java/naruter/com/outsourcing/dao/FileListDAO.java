package naruter.com.outsourcing.dao;

import java.util.List;

import naruter.com.outsourcing.vo.FileList;

public interface FileListDAO {
	public List<FileList> selectFileList(FileList fl);
	public FileList selectFile(FileList fl);
	public int updateFile(List<FileList> fl);
	public int insertFile(List<FileList> fl);
	public int deleteFile(List<FileList> fl);

}