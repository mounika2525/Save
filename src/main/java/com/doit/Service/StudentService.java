package com.doit.Service;

import com.doit.Domain.Chapter;
import com.doit.Domain.Subjects;
import com.doit.Domain.UserStudent;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
public interface StudentService {
    List<UserStudent> findByStudentId(Long studentId);
    List<Subjects> findBySubjectId(Long subjectId);
    List<Subjects> findByClassId(Long classId);


}
