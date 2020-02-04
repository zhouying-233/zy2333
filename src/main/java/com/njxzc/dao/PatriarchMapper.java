package com.njxzc.dao;

import com.njxzc.model.Patriarch;
import com.njxzc.model.PatriarchExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PatriarchMapper {
    long countByExample(PatriarchExample example);

    int deleteByExample(PatriarchExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(Patriarch record);

    int insertSelective(Patriarch record);

    List<Patriarch> selectByExample(PatriarchExample example);

    Patriarch selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") Patriarch record, @Param("example") PatriarchExample example);

    int updateByExample(@Param("record") Patriarch record, @Param("example") PatriarchExample example);

    int updateByPrimaryKeySelective(Patriarch record);

    int updateByPrimaryKey(Patriarch record);
}