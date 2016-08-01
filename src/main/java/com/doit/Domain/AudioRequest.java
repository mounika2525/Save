package com.doit.Domain;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "AUDIO_REQUEST")
public class AudioRequest {
    @Column(name = "requestedby")
    private Long RequestedBy;
    @Column(name = "requestedto")
    private Long RequestedTo;
    @Id
    @Column(name = "audioid")
    private Long audioId;

    public AudioRequest(){}
    public AudioRequest(Long requestedBy, Long requestedTo, Long audioId) {
        RequestedBy = requestedBy;
        RequestedTo = requestedTo;
        this.audioId = audioId;
    }

    public Long getRequestedBy() {
        return RequestedBy;
    }

    public void setRequestedBy(Long requestedBy) {
        RequestedBy = requestedBy;
    }

    public Long getRequestedTo() {
        return RequestedTo;
    }

    public void setRequestedTo(Long requestedTo) {
        RequestedTo = requestedTo;
    }

    public Long getAudioId() {
        return audioId;
    }

    public void setAudioId(Long audioId) {
        this.audioId = audioId;
    }
}
