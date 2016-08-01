package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "CLASS")
public class StudentClass{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "classid")
    private Long classId;
    @Column(name = "schoolid")
    private Long  schoolId;
    @Column(name = "classname")
    private String className;

    public StudentClass(){}
    public StudentClass(Long classId, Long schoolId, String className) {
        this.classId = classId;
        this.schoolId = schoolId;
        this.className = className;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }
}







