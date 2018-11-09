package naruter.com.outsourcing.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import naruter.com.outsourcing.service.FileListService;
import naruter.com.outsourcing.vo.FileList;

@Controller
public class FileListController {
	@Autowired
	private FileListService flService;
	
	@ResponseBody
	@RequestMapping(value="/filelist", method=RequestMethod.GET) //조회x
	public List<FileList> selectFileList(@ModelAttribute FileList fl){
		return flService.selectFileList(fl);
	}
	
	@ResponseBody
	@RequestMapping(value="/filelist/{pnum}", method=RequestMethod.GET) //조회x
	public FileList selectFile(@PathVariable int pnum){
		return flService.selectFile(pnum);
	}
	
	@ResponseBody
	@RequestMapping(value="/filelist", method=RequestMethod.POST) //입력x
	public int insertFileList(@RequestBody List<FileList> flList) {
		return flService.insertFileList(flList);
	}
	
	@ResponseBody
	@RequestMapping(value="/filelist", method=RequestMethod.PUT) //수정x
	public int updateFileList(@RequestBody List<FileList> flList) {
		return flService.updateFileList(flList);
	}
	
	@ResponseBody
	@RequestMapping(value="/filelist", method=RequestMethod.DELETE) //삭제x
	public int deleteFileList(@RequestBody List<FileList> flList) {
		return flService.deleteFileList(flList);
	}

}