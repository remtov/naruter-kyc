package naruter.com.outsourcing.service;

import java.util.List;

import naruter.com.outsourcing.vo.Project;

public interface ProjectService {
	public List<Project> selectProjectList(Project pr);
	public Project selectProject(int pjnum);
	public int updateProject(Project pr);
	public int insertProject(Project pr);
	public int deleteProject(int pjnum);
}
