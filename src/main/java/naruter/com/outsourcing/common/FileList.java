package naruter.com.outsourcing.common;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.multipart.MultipartHttpServletRequest;

public class FileList {

	public static  List<String> fileList(MultipartHttpServletRequest req){
		List<MultipartFile> fileList = req.getFiles("file");
        String path = "F:\\develop\\workspace\\remyp\\src\\main\\webapp\\resources\\upload\\";
        List<String> l= new ArrayList<>();
        for (MultipartFile f : fileList) {
            String originFileName = f.getOriginalFilename(); // 원본 파일 명
            String safeFile = path + System.currentTimeMillis() + originFileName;
            try {
                f.transferTo(new File(safeFile));
                l.add(safeFile);
            } catch (IllegalStateException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }


		return l;
	}
}
