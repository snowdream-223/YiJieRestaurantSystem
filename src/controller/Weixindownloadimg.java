package controller;

import org.apache.commons.io.FileUtils;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;

@Controller
public class Weixindownloadimg {

    @RequestMapping(value = "/image/{imageName:.+}", method = RequestMethod.GET)
    @ResponseBody
    public void getImage(@PathVariable String imageName, HttpServletResponse response, HttpServletRequest request) throws IOException {
        //下载文件的路径(这里绝对路径)
        String filepath = request.getSession().getServletContext().getRealPath("assets" + File.separator + "img") + File.separator + imageName;

        //设置下载资源的MIME类型?
        //设置响应头,告诉浏览器下载的资源需要存储到客户端的硬盘中，而不是解析打开。
        response.setHeader("Content-Disposition", "attachment;filename=" + imageName);
        //1.获取要下载的资源的流对象

        //获取文件的二进制数据
        byte[] bytes = FileUtils.readFileToByteArray(new File(filepath));
        //2.响应浏览器
        //获取输出流对象
        ServletOutputStream outputStream = response.getOutputStream();
        //响应资源
        outputStream.write(bytes);

    }
}
