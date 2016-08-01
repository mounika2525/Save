package com.doit.Domain;

import javax.persistence.*;

/**
 * Created by sriya on 25/07/16.
 */
@Entity
@Table(name = "FAVORITES")
public class Favorite {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "favid")
    private Long favId;
    @Column(name = "userid")
    private Long userId;
    @Column(name = "topicid")
    private Long topicId;

    public Favorite(){}
    public Favorite(Long userId, Long topicId) {
        this.userId = userId;
        this.topicId = topicId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Long getTopicId() {
        return topicId;
    }

    public void setTopicId(Long topicId) {
        this.topicId = topicId;
    }
}
