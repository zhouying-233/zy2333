package com.njxzc.dao;

import com.njxzc.model.Result;
import com.njxzc.model.ResultExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ResultMapper {
    long countByExample(ResultExample example);

    int deleteByExample(ResultExample example);

    int deleteByPrimaryKey(Integer resultid);

    int insert(Result record);

    int insertSelective(Result record);

    List<Result> selectByExample(ResultExample example);

    Result selectByPrimaryKey(Integer resultid);

    int updateByExampleSelective(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByExample(@Param("record") Result record, @Param("example") ResultExample example);

    int updateByPrimaryKeySelective(Result record);

    int updateByPrimaryKey(Result record);
}