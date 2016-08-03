package com.doit.Controller;

import com.doit.Domain.AudioRecords;
import com.doit.Domain.Chapter;
import com.doit.Repository.RecordedRepository;
import com.doit.Service.RecordService;
import com.doit.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

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

    @RequestMapping(value = "/save", method = RequestMethod.POST)
      //    public List<AudioRecords> ByChId(@PathVariable("audioId") Long audioId,@PathVariable("chapterId") Long chapterId,@PathVariable("length") Long length,@PathVariable("listen_Count") Long listen_Count,@PathVariable("rating")
      //            String rating,@PathVariable("reference") String reference,@PathVariable("topicName") String topicName,@PathVariable("url") String url)
      //    {
      //return recordService.saveByChapterId( audioId,  chapterId,  length,  listen_Count,  rating,  reference,  topicName,  url);
      //    }




      // public List<AudioRecords> ByChId(){
      //     return recordService.saveByChapterId();
      // }




       //   public List<AudioRecords> ByChId(@PathVariable("audioId") Long audioId,@PathVariable("chapterId") Long chapterId)
       //    {
       //       return recordService.saveByChapterId(audioId,chapterId);
       //    }





//    public void saveAudios(@RequestParam("topicname") String topicname){
//        recordService.insert(topicname);
//}




public void saveAudios(@RequestParam("chapterid") Long chapterid,@RequestParam("length") Long length,@RequestParam("listen_count") Long listen_count,@RequestParam("rating") String rating,
                       @RequestParam("reference") String reference,@RequestParam("topicname") String topicname,@RequestParam("url") String url)
    {
        recordService.insert(chapterid,  length,  listen_count,  rating,  reference,  topicname,  url);
    }

}











