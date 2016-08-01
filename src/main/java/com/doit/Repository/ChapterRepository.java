package com.doit.Repository;

import com.doit.Domain.Chapter;
import com.doit.Domain.Subjects;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by sriya on 25/07/16.
 */
@Repository
public interface ChapterRepository extends JpaRepository<Chapter,Long>{
//    @Query("select c from  Chapter c,Subjects s where s.studentId=?1 ")
//    List<Chapter> findBySubjectId(@Param("subjectId") Long subjectId);
    @Query("select c from Chapter c where  c.chapterId=?1")
    List<Chapter> findByChapterId(@Param("chapterId") Long chapterId);

}
