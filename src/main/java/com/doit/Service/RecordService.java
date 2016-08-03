package com.doit.Service;

import com.doit.Domain.AudioRecords;
import com.doit.Domain.Chapter;

import java.util.List;


/**
 * Created by mounika on 28/07/16.
 */
public interface RecordService {

      // List<AudioRecords> saveByChapterId(Long audioId, Long chapterId, Long length, Long listen_Count, String rating, String reference, String topicName, String url);

     // List<AudioRecords> saveByChapterId();


     //  List<AudioRecords> saveByChapterId(Long audioId, Long chapterID);





  // void insert( String topicname);




    void insert(Long chapterid, Long length, Long listen_count, String rating, String reference, String topicname, String url);
}






