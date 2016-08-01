package com.doit.Controller;

import com.doit.Domain.Chapter;
import com.doit.Domain.Subjects;
import com.doit.Repository.ChapterRepository;
import com.doit.Service.TopicsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by sriya on 25/07/16.
 */
@RestController
@RequestMapping("/topics")
public class TopicsController {
    private ChapterRepository chapterRepository;
    private TopicsService topicsService;
    @Autowired
    public TopicsController(ChapterRepository chapterRepository,TopicsService topicsService){
    this.chapterRepository=chapterRepository;
        this.topicsService=topicsService;
    }
//    @RequestMapping(value = "/sub/{subjectId}", method = RequestMethod.GET)
//    public List<Chapter> bySId(@PathVariable(value = "subjectId") Long subjectId){
//        return  topicsService.findBySubjectId(subjectId);
//    }

    /*
    * Getting all the chapter details of a particular subject based on chapterId
    * */
    @RequestMapping(value = "/sub/{chapterId}", method = RequestMethod.GET)
    public List<Chapter> byChId(@PathVariable(value = "chapterId") Long chapterId){
        return topicsService.findByChapterId(chapterId);
    }
}
