package com.fc.service;

import com.fc.entity.ResultObject;
import com.fc.entity.TScore;
import com.fc.entity.TStudent;
import com.github.pagehelper.PageInfo;

public interface TScoreService {
    ResultObject<Object> insertScore(TScore score);

    PageInfo<TScore> getAllScore(TScore score, int limit, int page);

    Integer updateScore(TScore score);

    Integer deleteScore(Integer scoreId);

    PageInfo<TStudent> getAllFinalScore(TStudent student, int limit, int page);

}
