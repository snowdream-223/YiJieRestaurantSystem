package tools;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;

public class MulToFile {
    //    将multiparfile转为file
    public static File multipartFile2File(MultipartFile multipartFile) {
        // 创建临时文件
        String path = "export/demo.xlsx";
        File file = new File(path);
        InputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            // 获取文件输入流
            inputStream = multipartFile.getInputStream();

            if (!file.exists()) {
                file.createNewFile();
            }
            // 创建输出流
            outputStream = new FileOutputStream(file);
            byte[] bytes = new byte[1024];
            int len;
            // 写入到创建的临时文件
            while ((len = inputStream.read(bytes)) > 0) {
                outputStream.write(bytes, 0, len);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            // 关流
            try {
                if (outputStream != null) {
                    outputStream.close();
                }
                if (outputStream != null) {
                    inputStream.close();
                }
                outputStream.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return file;
    }

}
