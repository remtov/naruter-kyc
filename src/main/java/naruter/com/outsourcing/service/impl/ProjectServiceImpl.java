package naruter.com.outsourcing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import naruter.com.outsourcing.dao.ProjectDAO;
import naruter.com.outsourcing.service.FileListService;
import naruter.com.outsourcing.service.ProjectService;
import naruter.com.outsourcing.vo.FileList;
import naruter.com.outsourcing.vo.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO pdao;
	@Autowired
	private FileListService fileService;

	@Override
	public List<Project> selectProjectList(Project pr) { //잘 모르겠음(알듯말듯)
		List<FileList> flList = pr.getFilelist();
		fileService.selectFileList((FileList) flList);
		return pdao.selectProjectList(pr);
	}

	@Override
	public Project selectProject(int pjnum) {
		return pdao.selectProject(pjnum);
	}

	@Override
	public int insertProject(Project pr) {
		int result = 0;
		List<FileList> fileList = (List<FileList>)pr.getFilelist();
		result += fileService.insertFileList(fileList);
		result += pdao.insertProject(pr);
		return result;
	}
	
	@Override
	public int updateProject(Project pr) {
		int result = 0;
		List<FileList> fileList = (List<FileList>)pr.getFilelist();
		result += fileService.updateFileList(fileList);
		result += pdao.updateProject(pr);
		return result;
	}

	@Override
	public int deleteProject(int pjnum) {
		int result = 0;
		return pdao.deleteProject(pjnum);
	}

}
