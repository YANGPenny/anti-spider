package cn.yy.b2c.gciantispider.service;

import java.util.List;

import cn.yy.b2c.gciantispider.model.NhModelmonitorAccuracy;

public interface INhModelmonitorAccuracyService {
    
    public List<NhModelmonitorAccuracy> getNhModelmonitorAccuracyByType(String timeType, String flowType);
}
