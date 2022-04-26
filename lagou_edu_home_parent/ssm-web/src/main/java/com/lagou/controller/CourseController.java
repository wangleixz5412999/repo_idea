package com.lagou.controller;

import com.lagou.domain.Course;
import com.lagou.domain.CourseVO;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-24-07:42
 * @Description:课程controller
 */
@RestController
@RequestMapping("/course")
public class CourseController {

    @Autowired
    private CourseService courseService;

    /*
    查询课程信息，多条件查询
     */
    @RequestMapping("/findCourseByCondition")
    public ResponseResult findCourseByCondition(@RequestBody CourseVO courseVO){
        List<Course> courseByCondition = courseService.findCourseByCondition(courseVO);
        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功！", courseByCondition);
        return responseResult;
    }

    /*
    图片上传接口
     */
    @RequestMapping("/courseUpload")
    public ResponseResult fileUpload(@RequestParam("file")MultipartFile file, HttpServletRequest request) throws IOException {
        //1. 判断文件是否为空
        if (file.isEmpty()) {
            throw new RuntimeException();
        }
        //2. 获取项目部署路径
        String realPath = request.getServletContext().getRealPath("/");
        String webappsPath = realPath.substring(0, realPath.indexOf("ssm_web"));

        //3.获取原文件名
        String filename = file.getOriginalFilename();

        //4. 新文件名
        String newFileName = System.currentTimeMillis() + filename.substring(filename.lastIndexOf("."));

        //5. 上传文件
        String uploadPath = webappsPath + "upload\\";

        File filePath = new File(uploadPath, newFileName);

        //如果路径不存在就创建目录
        if (!filePath.getParentFile().exists()) {
            filePath.getParentFile().mkdir();
            System.out.println("创建目录" + filePath);
        }
        //图片进行真正的上传了
        file.transferTo(filePath);

        //6. 将文件名和文件路径返回
        HashMap<String, String> map = new HashMap<>();
        map.put("fileName", newFileName);
        map.put("filePath", "http://localhost:8080/upload/" + newFileName);

        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功", map);

        return responseResult;
    }
}
