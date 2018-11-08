package naruter.com.outsourcing.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartHttpServletRequest;

import naruter.com.outsourcing.dao.ProjectDAO;
import naruter.com.outsourcing.service.ProjectService;
import naruter.com.outsourcing.vo.Project;

@Service
public class ProjectServiceImpl implements ProjectService {
	@Autowired
	private ProjectDAO pdao;

	@Override
	public List<Project> selectProjectList(Project pr) {
		return pdao.selectProjectList(pr);
	}

	@Override
	public Project selectProject(int pjnum) {
		return pdao.selectProject(pjnum);
	}

	@Override
	public int updateProject(Project pr) {
		return pdao.updateProject(pr);
	}

	@Override
	public int insertProject(Project pr) {
		return pdao.insertProject(pr);
	}

	@Override
	public int deleteProject(int pjnum) {
		return pdao.deleteProject(pjnum);
	}

}
