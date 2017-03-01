package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.Step;
import cn.com.noomn.po.StepExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StepMapper {
    int countByExample(StepExample example);

    int deleteByExample(StepExample example);

    int deleteByPrimaryKey(String stepId);

    int insert(Step record);

    int insertSelective(Step record);

    List<Step> selectByExample(StepExample example);

    Step selectByPrimaryKey(String stepId);

    int updateByExampleSelective(@Param("record") Step record, @Param("example") StepExample example);

    int updateByExample(@Param("record") Step record, @Param("example") StepExample example);

    int updateByPrimaryKeySelective(Step record);

    int updateByPrimaryKey(Step record);
}