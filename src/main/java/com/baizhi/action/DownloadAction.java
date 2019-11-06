package com.baizhi.action;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.net.URLEncoder;

@Controller
@RequestMapping("/down")
public class DownloadAction {

    /*@RequestMapping("/load")
    public ResponseEntity<byte[]> load(String  filename, HttpSession session) throws Exception{
        //获取目标文件夹的路径
        String realPath = session.getServletContext().getRealPath("/upload");
        //获取目标文件
        File file = new File(realPath + "/" + filename);
        //把目标文件转换为字节数组
        byte[] bytes = FileUtils.readFileToByteArray(file);
        //请求头
        HttpHeaders httpHeaders = new HttpHeaders();
        //避免乱码问题
        String newname = new String(filename.getBytes("UTF-8"), "ISO-8859-1");
        //设置下载过后的打开方式
        httpHeaders.setContentDispositionFormData("attachment",newname);
        //设置下载时的方式  以二进制流的形式下载
        httpHeaders.setContentType(MediaType.APPLICATION_OCTET_STREAM);

        return new ResponseEntity<byte[]>(bytes,httpHeaders, HttpStatus.CREATED);
    }
*/

    @RequestMapping("/load")
    public void download(String filename, HttpServletRequest request, HttpServletResponse response) throws Exception {
        //获取目标文件夹的路径
        String realPath = request.getRealPath("/upload");
        //获取目标文件    File file = new File(realPath + "/" + filename); 等价
        File file = new File(realPath, filename);
        //把文件传入到文件输入流中
        FileInputStream is = new FileInputStream(file);
        //获取文件输出流
        ServletOutputStream os = response.getOutputStream();
        //设置文件下载的请求头   文件以附件的形式打开    解决文件名乱码问题
        response.setHeader("content-disposition","attachment;fileName="+ URLEncoder.encode(filename,"UTF-8"));
        //把带有文件的输入流中的内容复制到输出流中
        IOUtils.copy(is,os);
        //关闭资源
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
    }
}
