package com.njxzc.dao;

import com.njxzc.model.Loststudent;
import com.njxzc.model.LoststudentExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LoststudentMapper {
    long countByExample(LoststudentExample example);

    int deleteByExample(LoststudentExample example);

    int deleteByPrimaryKey(Integer loststudentid);

    int insert(Loststudent record);

    int insertSelective(Loststudent record);

    List<Loststudent> selectByExample(LoststudentExample example);

    Loststudent selectByPrimaryKey(Integer loststudentid);

    int updateByExampleSelective(@Param("record") Loststudent record, @Param("example") LoststudentExample example);

    int updateByExample(@Param("record") Loststudent record, @Param("example") LoststudentExample example);

    int updateByPrimaryKeySelective(Loststudent record);

    int updateByPrimaryKey(Loststudent record);
}