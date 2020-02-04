package com.njxzc.dao;

import com.njxzc.model.Lostteacher;
import com.njxzc.model.LostteacherExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LostteacherMapper {
    long countByExample(LostteacherExample example);

    int deleteByExample(LostteacherExample example);

    int deleteByPrimaryKey(Integer lostteacherid);

    int insert(Lostteacher record);

    int insertSelective(Lostteacher record);

    List<Lostteacher> selectByExample(LostteacherExample example);

    Lostteacher selectByPrimaryKey(Integer lostteacherid);

    int updateByExampleSelective(@Param("record") Lostteacher record, @Param("example") LostteacherExample example);

    int updateByExample(@Param("record") Lostteacher record, @Param("example") LostteacherExample example);

    int updateByPrimaryKeySelective(Lostteacher record);

    int updateByPrimaryKey(Lostteacher record);
}