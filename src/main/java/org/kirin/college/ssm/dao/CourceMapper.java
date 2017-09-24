package org.kirin.college.ssm.dao;

import org.kirin.college.ssm.dao.Cource;

public interface CourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cource record);

    int insertSelective(Cource record);

    Cource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cource record);

    int updateByPrimaryKey(Cource record);
}