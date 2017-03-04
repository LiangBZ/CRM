package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.FollowUp;
import cn.com.noomn.po.FollowUpExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowUpMapper {
    int countByExample(FollowUpExample example);

    int deleteByExample(FollowUpExample example);

    int deleteByPrimaryKey(String followUpId);

    int insert(FollowUp record);

    int insertSelective(FollowUp record);

    List<FollowUp> selectByExample(FollowUpExample example);

    FollowUp selectByPrimaryKey(String followUpId);

    int updateByExampleSelective(@Param("record") FollowUp record, @Param("example") FollowUpExample example);

    int updateByExample(@Param("record") FollowUp record, @Param("example") FollowUpExample example);

    int updateByPrimaryKeySelective(FollowUp record);

    int updateByPrimaryKey(FollowUp record);
}