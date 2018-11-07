package naruter.com.outsourcing.dao.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import naruter.com.outsourcing.dao.ProjectDAO;
import naruter.com.outsourcing.vo.Project;

@Repository
public class ProjectDAOImpl implements ProjectDAO {
	@Autowired
	private SqlSession ss;

	@Override
	public List<Project> selectProjectList(Project pr) {
		return ss.selectList("SQL.PROJECT.selectList",pr);
	}

	@Override
	public Project selectProject(Project pr) {
		return ss.selectOne("SQL.PROJECT.selectProject",pr);
	}

	@Override
	public int updateProject(Project pr) {
		return ss.update("SQL.PROJECT.updateProject",pr);
	}

	@Override
	public int insertProject(Project pr) {
		return ss.insert("SQL.PROJECT.insertProject",pr);
	}

	@Override
	public int deleteProject(Project pr) {
		return ss.delete("SQL.PROJECT.deleteProject",pr);
	}

}
