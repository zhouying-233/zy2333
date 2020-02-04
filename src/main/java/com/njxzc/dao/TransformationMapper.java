package com.njxzc.dao;

import com.njxzc.model.Transformation;
import com.njxzc.model.TransformationExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TransformationMapper {
    long countByExample(TransformationExample example);

    int deleteByExample(TransformationExample example);

    int deleteByPrimaryKey(Integer transformid);

    int insert(Transformation record);

    int insertSelective(Transformation record);

    List<Transformation> selectByExample(TransformationExample example);

    Transformation selectByPrimaryKey(Integer transformid);

    int updateByExampleSelective(@Param("record") Transformation record, @Param("example") TransformationExample example);

    int updateByExample(@Param("record") Transformation record, @Param("example") TransformationExample example);

    int updateByPrimaryKeySelective(Transformation record);

    int updateByPrimaryKey(Transformation record);
}