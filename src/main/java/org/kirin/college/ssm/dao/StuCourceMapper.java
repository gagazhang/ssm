package org.kirin.college.ssm.dao;

public interface StuCourceMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(StuCource record);

    int insertSelective(StuCource record);

    StuCource selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(StuCource record);

    int updateByPrimaryKey(StuCource record);
}