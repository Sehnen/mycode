package tk.sehnen;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.WebResource;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.UUID;

@Controller
public class UpFileTest {
    @RequestMapping("/upfile")
    public String Upfile(MultipartFile upload) throws Exception {
        // 定义图片服务器的请求路径
        String path = "http://localhost:9090/uploads/";
// 获取到上传文件的名称
        String filename = upload.getOriginalFilename();
        String uuid = UUID.randomUUID().toString().replaceAll("-", "").toUpperCase();
// 把文件的名称唯一化
        filename = uuid+"_"+filename;
// 向图片服务器上传文件
// 创建客户端对象
        Client client = Client.create();
// 连接图片服务器
        WebResource webResource = client.resource(path+filename);
// 上传文件
        webResource.put(upload.getBytes());
        return "success";
    }

}
