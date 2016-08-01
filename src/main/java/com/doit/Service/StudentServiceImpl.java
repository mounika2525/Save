package com.doit.Service;

import com.doit.Domain.Role;
import com.doit.Domain.Subjects;
import com.doit.Domain.UserStudent;
import com.doit.Repository.RoleRepository;
import com.doit.Repository.SubjectRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sampa on 24-07-2016.
 */
@Service
public class StudentServiceImpl implements  StudentService {
    private SubjectRepository subjectRepository;
    private RoleRepository roleRepository;
    @Autowired
    public StudentServiceImpl(RoleRepository roleRepository, SubjectRepository subjectRepository){
        this.roleRepository=roleRepository;
        this.subjectRepository=subjectRepository;
    }
    @Override
    public List<UserStudent> findByStudentId(Long studentId) {
        return roleRepository.findByStudentId(studentId);
    }

    @Override
    public List<Subjects> findBySubjectId(Long subjectId) {
        return subjectRepository.findBySubjectId(subjectId);
    }

    @Override
    public List<Subjects> findByClassId(Long classId) {
        return subjectRepository.findByClassId(classId);
    }

}
