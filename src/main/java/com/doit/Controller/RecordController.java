package com.doit.Controller;

import com.doit.Domain.AudioRecords;
import com.doit.Domain.Chapter;
import com.doit.Repository.RecordedRepository;
import com.doit.Service.RecordService;
import com.doit.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
@RestController
@RequestMapping("/dashboard")
public class RecordController {
    private RecordedRepository recordedRepository;
    private RecordService recordService;

    @Autowired
    public RecordController(RecordedRepository recordedRepository, RecordService recordService) {
        this.recordedRepository = recordedRepository;
        this.recordService = recordService;
    }

    @RequestMapping(value = "/save", method = RequestMethod.GET)
//    public List<AudioRecords> ByChId(@PathVariable("audioId") Long audioId,@PathVariable("chapterId") Long chapterId,@PathVariable("length") Long length,@PathVariable("listen_Count") Long listen_Count,@PathVariable("rating")
//            String rating,@PathVariable("reference") String reference,@PathVariable("topicName") String topicName,@PathVariable("url") String url)
//    {
//return recordService.saveByChapterId( audioId,  chapterId,  length,  listen_Count,  rating,  reference,  topicName,  url);
//    }




    public List<AudioRecords> byChId(){
        return recordService.saveByChapterId();
    }

}











