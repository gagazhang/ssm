package org.kirin.college.ssm.dao;

public interface CourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(Cource record);

    int insertSelective(Cource record);

    Cource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(Cource record);

    int updateByPrimaryKey(Cource record);
}