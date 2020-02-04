package com.njxzc.dao;

import com.njxzc.model.Opinion;
import com.njxzc.model.OpinionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OpinionMapper {
    long countByExample(OpinionExample example);

    int deleteByExample(OpinionExample example);

    int deleteByPrimaryKey(Integer opinionid);

    int insert(Opinion record);

    int insertSelective(Opinion record);

    List<Opinion> selectByExample(OpinionExample example);

    Opinion selectByPrimaryKey(Integer opinionid);

    int updateByExampleSelective(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByExample(@Param("record") Opinion record, @Param("example") OpinionExample example);

    int updateByPrimaryKeySelective(Opinion record);

    int updateByPrimaryKey(Opinion record);
}