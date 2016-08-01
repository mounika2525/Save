package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "AUDIO_LISTENED")
public class AudioListened {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "audioid")
    private Long audioId;
    @Column(name = "userid")
    private Long userId;
    @Column(name = "rating")
    private String rating;

    public AudioListened(){}
    public AudioListened(Long userId, String rating) {
        this.userId = userId;
        this.rating = rating;
    }

    public Long getAudioId() {
        return audioId;
    }

    public void setAudioId(Long audioId) {
        this.audioId = audioId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getRating() {
        return rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }
}
