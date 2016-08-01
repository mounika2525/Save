package com.doit.Service;

import com.doit.Domain.Chapter;
import com.doit.Repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by sriya on 25/07/16.
 */
@Service
public class TopicsServiceImpl implements TopicsService {
    private ChapterRepository chapterRepository;
    @Autowired
    public TopicsServiceImpl(ChapterRepository chapterRepository){
        this.chapterRepository=chapterRepository;
    }

    @Override
    public List<Chapter> findByChapterId(Long chapterId) {
        return chapterRepository.findByChapterId(chapterId);
    }
//    @Override
//    public List<Chapter> findBySubjectId(Long subjectId) {
//        return chapterRepository.findBySubjectId(subjectId);
//    }
}
