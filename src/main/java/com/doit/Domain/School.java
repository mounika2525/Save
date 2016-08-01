package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "SCHOOL")
public class School {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "schoolid")
    private Long schoolId;
    @Column(name = "boardId")
    private Long boardId;
    @Column(name = "groupid")
    private Long groupId;
    @Column(name = "schoolname")
    private String schoolName;
    @Column(name = "address")
    private String address;

    public School(){}
    public School(Long schoolId, Long boardId, Long groupId, String schoolName, String address) {
        this.schoolId = schoolId;
        this.boardId = boardId;
        this.groupId = groupId;
        this.schoolName = schoolName;
        this.address = address;
    }

    public Long getSchoolId() {
        return schoolId;
    }

    public void setSchoolId(Long schoolId) {
        this.schoolId = schoolId;
    }

    public Long getBoardId() {
        return boardId;
    }

    public void setBoardId(Long boardId) {
        this.boardId = boardId;
    }

    public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
