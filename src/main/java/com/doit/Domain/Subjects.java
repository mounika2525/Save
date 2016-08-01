package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "SUBJECTS")
public class Subjects {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subjectid")
    private Long subjectId;
    @Column(name = "classid")
    private Long classId;
    @Column(name = "subjectname")
    private String subjectName;
    @Column(name = "imgurl")
    private String imgUrl;

    public Subjects(){}
    public Subjects(String subjectName){
        this.subjectName=subjectName;
    }
    public Subjects(String subjectName, Long subjectId, Long classId, String imgUrl) {
        this.subjectName = subjectName;
        this.subjectId = subjectId;
        this.classId = classId;
        this.imgUrl=imgUrl;
    }

    public String getSubjectName() {
        return subjectName;
    }

    public void setSubjectName(String subjectName) {
        this.subjectName = subjectName;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getClassId() {
        return classId;
    }

    public void setClassId(Long classId) {
        this.classId = classId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}
