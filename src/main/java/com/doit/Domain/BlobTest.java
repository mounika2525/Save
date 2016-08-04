package com.doit.Domain;

import javax.persistence.*;
import java.sql.Blob;

/**
 * Created by mounika on 03/08/16.
 */
@Entity
@Table(name="BLOBTEST")
public class BlobTest {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="contentid")
    private Long contentID;
    @Column(name="content")
    private Blob Content;



    public BlobTest(Blob content) {
        Content = content;
    }

    public Long getContentID() {
        return contentID;
    }

    public void setContentID(Long contentID) {
        this.contentID = contentID;
    }

    public Blob getContent() {
        return Content;
    }

    public void setContent(Blob content) {
        Content = content;
    }

    @Override
    public String toString() {
        return "BlobTest{" +
                "contentID=" + contentID +
                ", Content=" + Content +
                '}';
    }
}
