package com.njxzc.dao;

import com.njxzc.model.Classhour;
import com.njxzc.model.ClasshourExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ClasshourMapper {
    long countByExample(ClasshourExample example);

    int deleteByExample(ClasshourExample example);

    int deleteByPrimaryKey(Integer classhourid);

    int insert(Classhour record);

    int insertSelective(Classhour record);

    List<Classhour> selectByExample(ClasshourExample example);

    Classhour selectByPrimaryKey(Integer classhourid);

    int updateByExampleSelective(@Param("record") Classhour record, @Param("example") ClasshourExample example);

    int updateByExample(@Param("record") Classhour record, @Param("example") ClasshourExample example);

    int updateByPrimaryKeySelective(Classhour record);

    int updateByPrimaryKey(Classhour record);
}