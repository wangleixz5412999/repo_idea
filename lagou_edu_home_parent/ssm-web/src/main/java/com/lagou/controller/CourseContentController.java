package com.lagou.controller;

import com.lagou.domain.CourseSection;
import com.lagou.domain.ResponseResult;
import com.lagou.service.CourseContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author:wanglei
 * @create:2022-04-25-07:56
 * @Description:
 */
@RestController
@RequestMapping("/courseContent")
public class CourseContentController {

    @Autowired
    private CourseContentService courseContentService;
    /*
    查询课程的章节信息和课时信息
     */
    @RequestMapping("/findSectionAndLesson")
    public ResponseResult findSectionAndLessonByCourseId(@RequestParam int courseId){
        List<CourseSection> sectionAndLessonByCourseId = courseContentService.findSectionAndLessonByCourseId(courseId);
        ResponseResult responseResult = new ResponseResult(true, 200, "响应成功", sectionAndLessonByCourseId);
        return responseResult;
    }
}
