package com.njxzc.dao;

import com.njxzc.model.Tuitiondetails;
import com.njxzc.model.TuitiondetailsExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TuitiondetailsMapper {
    long countByExample(TuitiondetailsExample example);

    int deleteByExample(TuitiondetailsExample example);

    int deleteByPrimaryKey(Integer tdid);

    int insert(Tuitiondetails record);

    int insertSelective(Tuitiondetails record);

    List<Tuitiondetails> selectByExample(TuitiondetailsExample example);

    Tuitiondetails selectByPrimaryKey(Integer tdid);

    int updateByExampleSelective(@Param("record") Tuitiondetails record, @Param("example") TuitiondetailsExample example);

    int updateByExample(@Param("record") Tuitiondetails record, @Param("example") TuitiondetailsExample example);

    int updateByPrimaryKeySelective(Tuitiondetails record);

    int updateByPrimaryKey(Tuitiondetails record);
}