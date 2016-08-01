package com.doit.Domain;

import javax.persistence.*;


@Entity
@Table(name = "AUDIO_RECORDED")
public class AudioRecords {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "audioid")
    private Long audioId;
    @Column(name = "chapterid")
    private  Long chapterId;
    @Column(name = "url")
    private  String url;
    @Column(name = "length")
    private Long length;
    @Column(name = "rating")
    private  String rating;
    @Column(name = "listen_count")
    private  Long listenCount;
    @Column(name = "topicname")
    private String topicName;
    @Column(name = "reference")
    private String reference;

    public AudioRecords(){}
    public AudioRecords(Long audioId, String url, Long chapterId, Long length, String rating, Long listenCount, String topicName, String reference) {
        this.audioId = audioId;
        this.url = url;
        this.chapterId = chapterId;
        this.length = length;
        this.rating = rating;
        this.listenCount = listenCount;
        this.topicName = topicName;
        this.reference = reference;
    }

    public Long getAudioId() {
        return audioId;
    }

    public void setAudioId(Long audioId) {
        this.audioId = audioId;
    }

    public Long getChapterId() {
        return chapterId;
    }

    public void setChapterId(Long chapterId) {
        this.chapterId = chapterId;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Long getLength() {
        return length;
    }

    public void setLength(Long length) {
        this.length = length;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public Long getListenCount() {
        return listenCount;
    }

    public void setListenCount(Long listenCount) {
        this.listenCount = listenCount;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getReference() {
        return reference;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }
}
