package com.doit.Service;

import com.doit.Domain.Chapter;
import org.springframework.data.repository.query.Param;

import java.util.List;

/**
 * Created by sriya on 25/07/16.
 */
public interface TopicsService {
//    List<Chapter> findBySubjectId(Long subjectId);
    List<Chapter> findByChapterId(Long chapterId);
}
