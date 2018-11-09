package naruter.com.outsourcing.dao;

import java.util.List;

import naruter.com.outsourcing.vo.FileList;

public interface FileListDAO {
	public List<FileList> selectFileList(FileList fl);
	public FileList selectFile(int pnum);
	public int updateFileList(List<FileList> fl);
	public int insertFileList(List<FileList> fl);
	public int deleteFileList(List<FileList> fl);

}