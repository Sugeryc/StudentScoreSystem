package com.fc.service.impl;

import com.fc.dao.TScoreMapper;
import com.fc.entity.ResultObject;
import com.fc.entity.TScore;
import com.fc.entity.TStudent;
import com.fc.service.TScoreService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TScoreServiceImpl implements TScoreService {
    @Autowired(required = false)
    private TScoreMapper scoreMapper;
    @Override
    public ResultObject<Object> insertScore(TScore score) {
        return null;
    }

    @Override
    public PageInfo<TScore> getAllScore(TScore score, int limit, int page) {
        return null;
    }

    @Override
    public Integer updateScore(TScore score) {
        return null;
    }

    @Override
    public Integer deleteScore(Integer scoreId) {
        return null;
    }

    @Override
    public PageInfo<TStudent> getAllFinalScore(TStudent student, int limit, int page) {
        return null;
    }
}
