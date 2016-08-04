package com.doit.Repository;

import com.doit.Domain.AudioRecords;
import com.doit.Domain.Chapter;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by mounika on 28/07/16.
 */
@Repository
public interface RecordedRepository extends JpaRepository<AudioRecords,Long> {
    // @Query(value = "insert into AUDIO_RECORDED (audioId, chapterId, length, listen_Count, rating, reference, topicName, url)  VALUES(?1, ?2, ?3, ?4, ?5, ?6, ?7, ?8)", nativeQuery = true)
    // List<AudioRecords> saveByChapterId(@Param("audioId") Long audioId,@Param("chapterId") Long chapterId,@Param("length") Long length,@Param("listen_Count") Long isten_Count,@Param("rating") String rating,@Param("reference") String reference,@Param("topicName") String topicName,@Param("url") String url);


    // @Query(value = "insert into AUDIO_RECORDED(audioId,chapterId,length,listen_Count,rating,reference,topicName,url) VALUES(40,1,4,2,'Cool','GK','Friends with alice','hushlittlebaby.mp3')",nativeQuery = true)
    //  List<AudioRecords> saveByChapterId();



    //  @Query(value="insert into AUDIO_RECORDED(audioId,chapterId) VALUES(?1,?2)",nativeQuery = true)
    //  List<AudioRecords>saveByChapterId(@Param("audioId") Long audioId,@Param("chapterId") Long chapterID);



//    @Transactional
//    @Modifying
//    @Query(value = "insert into AUDIO_RECORDED(topicname) values(?1)", nativeQuery = true)
//    void insert(@Param("topicname") String topicname);




//    void insertUsr(Long audioid, String topicname);


@Transactional
@Modifying
    @Query(value = "insert into AUDIO_RECORDED(chapterid,length,listen_count,rating,reference,topicname,url) VALUES(?1,?2, ?3, ?4, ?5, ?6, ?7)",nativeQuery = true)
    void insert(@Param("chapterid") Long chapterid,@Param("length") Long length,@Param("listen_count") Long listen_count,@Param("rating") String rating,@Param("reference") String reference,@Param("topicname") String topicname,@Param("url") String url);
}