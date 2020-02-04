package com.njxzc.dao;

import com.njxzc.model.Homevisit;
import com.njxzc.model.HomevisitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface HomevisitMapper {
    long countByExample(HomevisitExample example);

    int deleteByExample(HomevisitExample example);

    int deleteByPrimaryKey(Integer homevisitid);

    int insert(Homevisit record);

    int insertSelective(Homevisit record);

    List<Homevisit> selectByExample(HomevisitExample example);

    Homevisit selectByPrimaryKey(Integer homevisitid);

    int updateByExampleSelective(@Param("record") Homevisit record, @Param("example") HomevisitExample example);

    int updateByExample(@Param("record") Homevisit record, @Param("example") HomevisitExample example);

    int updateByPrimaryKeySelective(Homevisit record);

    int updateByPrimaryKey(Homevisit record);
}