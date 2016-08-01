package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "CHAPTER")
public class Chapter {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "chapterid")
    private Long chapterId;
    @Column(name = "subjectid")
    private Long subjectId;
    @Column(name = "chaptername")
    private String chapterName;
    @Column(name = "bookid")
    private Long bookId;
    public Chapter(){}

    public Chapter(Long chapterId, Long subjectId, String chapterName, Long bookId) {
        this.chapterId = chapterId;
        this.subjectId = subjectId;
        this.chapterName = chapterName;
        this.bookId = bookId;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getChapterName() {
        return chapterName;
    }

    public void setChapterName(String chapterName) {
        this.chapterName = chapterName;
    }

    public Long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(Long subjectId) {
        this.subjectId = subjectId;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
}
