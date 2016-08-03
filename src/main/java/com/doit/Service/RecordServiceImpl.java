package com.doit.Service;

import com.doit.Domain.AudioRecords;
import com.doit.Domain.Chapter;
import com.doit.Repository.RecordedRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by mounika on 30/07/16.
 */
@Service
public class RecordServiceImpl implements RecordService
{
    private RecordedRepository recordedRepository;
    @Autowired
    public RecordServiceImpl(RecordedRepository recordedRepository)
    {
        this.recordedRepository=recordedRepository;
    }



    //    @Override
    //    public List<AudioRecords> saveByChapterId(Long audioId, Long chapterId, Long length, Long listen_Count, Long rating, Long reference, Long topicName, Long url) {
    //
    //        return recordedRepository.saveByChapterId(audioId,  chapterId,  length,  listen_Count,  rating,  reference,  topicName,  url);
    //    }
    //
    //    @Override
    //    public List<AudioRecords> saveByChapterId(Long chapterId) {
    //        return null;
    //    }




    //   @Override
    //    public List<AudioRecords> saveByChapterId() {
    //        return recordedRepository.saveByChapterId();
    //    }




     // @Override
     // public List<AudioRecords> saveByChapterId(Long audioId, Long chapterID) {
     //     return recordedRepository.saveByChapterId(audioId,chapterID);
     //  }




//    @Override
//    public void insert( String topicname) {
//        recordedRepository.insert(topicname);
//    }




    public void insert(Long chapterid, Long length, Long listen_count, String rating, String reference, String topicname, String url)
    {
        recordedRepository.insert(chapterid,length,listen_count,rating,reference,topicname,url);
    }

}
























