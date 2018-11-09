package naruter.com.outsourcing;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import naruter.com.outsourcing.vo.FileList;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class FileListTest {
	
	@Autowired
	SqlSession ss;

	@Test
	public void DAOtest1() {
		List<FileList> flList = ss.selectList("SQL.FILELIST.selectFileList");
		assertNotNull(flList);
		assertEquals(2, flList.size());
		System.out.println(flList);
	}
//	
//	@Test
//	public void DAOtest2() {
//		FileList file = new FileList();
//		file.setPnum(1);
//		FileList fl = ss.selectOne("SQL.FILELIST.selectFile",file);
//		assertNotNull(fl);
//	}
	
//	@Test
//	public void DAOtest3() {
//		int cnt = 0;
//		List<FileList> flList = ss.selectList("SQL.FILELIST.selectFileList");
//		for(FileList fl:flList) {
//			cnt += ss.delete("SQL.FILELIST.deleteFileList",fl);
//		}
//		assertEquals(2,cnt);
//	}
}
