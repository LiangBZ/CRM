package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.NotifyEmployee;
import cn.com.noomn.po.NotifyEmployeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotifyEmployeeMapper {
    int countByExample(NotifyEmployeeExample example);

    int deleteByExample(NotifyEmployeeExample example);

    int deleteByPrimaryKey(String notifyEmployeeId);

    int insert(NotifyEmployee record);

    int insertSelective(NotifyEmployee record);

    List<NotifyEmployee> selectByExample(NotifyEmployeeExample example);

    NotifyEmployee selectByPrimaryKey(String notifyEmployeeId);

    int updateByExampleSelective(@Param("record") NotifyEmployee record, @Param("example") NotifyEmployeeExample example);

    int updateByExample(@Param("record") NotifyEmployee record, @Param("example") NotifyEmployeeExample example);

    int updateByPrimaryKeySelective(NotifyEmployee record);

    int updateByPrimaryKey(NotifyEmployee record);
}