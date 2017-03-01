package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.FollowUpRecord;
import cn.com.noomn.po.FollowUpRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FollowUpRecordMapper {
    int countByExample(FollowUpRecordExample example);

    int deleteByExample(FollowUpRecordExample example);

    int deleteByPrimaryKey(String followUpRecordId);

    int insert(FollowUpRecord record);

    int insertSelective(FollowUpRecord record);

    List<FollowUpRecord> selectByExample(FollowUpRecordExample example);

    FollowUpRecord selectByPrimaryKey(String followUpRecordId);

    int updateByExampleSelective(@Param("record") FollowUpRecord record, @Param("example") FollowUpRecordExample example);

    int updateByExample(@Param("record") FollowUpRecord record, @Param("example") FollowUpRecordExample example);

    int updateByPrimaryKeySelective(FollowUpRecord record);

    int updateByPrimaryKey(FollowUpRecord record);
}