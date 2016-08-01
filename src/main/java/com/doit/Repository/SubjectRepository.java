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
public interface SubjectRepository extends JpaRepository<Subjects,Long>{
    @Query("select s from Subjects s where s.subjectId=?1")
    List<Subjects> findBySubjectId(@Param("subjectid") Long subjectId);
    @Query("select s from Subjects s,StudentClass c where c.classId=?1 ")
    List<Subjects> findByClassId(@Param("classId")  Long classId);


}
