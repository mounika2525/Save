package com.doit.Controller;

import com.doit.Domain.Subjects;
import com.doit.Domain.User;
import com.doit.Repository.SubjectRepository;
import com.doit.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by sriya on 25/07/16.
 */
@RestController
@RequestMapping("/dash")
public class SubjectController {

    private SubjectRepository subjectRepository;
    private StudentService studentService;

    @Autowired
    public SubjectController(SubjectRepository subjectRepository, StudentService studentService){
        this.subjectRepository=subjectRepository;
        this.studentService=studentService;
    }

    /*
    * Getting all the subjects for the dashboard page based on subjectId
    * */
    @RequestMapping(value = "/sub/{subjectId}", method = RequestMethod.GET)
    public  List<Subjects> byId(@PathVariable(value = "subjectId") Long subjectId){
        return  studentService.findBySubjectId(subjectId);
    }
    /*
    * Getting all the class details
    * */
    @RequestMapping(value = "/subs/{classId}", method = RequestMethod.GET)
    public  List<Subjects> byCId(@PathVariable(value = "classId") Long classId){
        return  studentService.findByClassId(classId);
    }



}
