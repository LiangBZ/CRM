package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.CustomState;
import cn.com.noomn.po.CustomStateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomStateMapper {
    int countByExample(CustomStateExample example);

    int deleteByExample(CustomStateExample example);

    int deleteByPrimaryKey(String customStateId);

    int insert(CustomState record);

    int insertSelective(CustomState record);

    List<CustomState> selectByExample(CustomStateExample example);

    CustomState selectByPrimaryKey(String customStateId);

    int updateByExampleSelective(@Param("record") CustomState record, @Param("example") CustomStateExample example);

    int updateByExample(@Param("record") CustomState record, @Param("example") CustomStateExample example);

    int updateByPrimaryKeySelective(CustomState record);

    int updateByPrimaryKey(CustomState record);
}