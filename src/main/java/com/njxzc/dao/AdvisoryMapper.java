package com.njxzc.dao;

import com.njxzc.model.Advisory;
import com.njxzc.model.AdvisoryExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AdvisoryMapper {
    long countByExample(AdvisoryExample example);

    int deleteByExample(AdvisoryExample example);

    int deleteByPrimaryKey(Integer aid);

    int insert(Advisory record);

    int insertSelective(Advisory record);

    List<Advisory> selectByExample(AdvisoryExample example);

    Advisory selectByPrimaryKey(Integer aid);

    int updateByExampleSelective(@Param("record") Advisory record, @Param("example") AdvisoryExample example);

    int updateByExample(@Param("record") Advisory record, @Param("example") AdvisoryExample example);

    int updateByPrimaryKeySelective(Advisory record);

    int updateByPrimaryKey(Advisory record);
}