package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.Notify;
import cn.com.noomn.po.NotifyExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface NotifyMapper {
    int countByExample(NotifyExample example);

    int deleteByExample(NotifyExample example);

    int deleteByPrimaryKey(String notifyId);

    int insert(Notify record);

    int insertSelective(Notify record);

    List<Notify> selectByExample(NotifyExample example);

    Notify selectByPrimaryKey(String notifyId);

    int updateByExampleSelective(@Param("record") Notify record, @Param("example") NotifyExample example);

    int updateByExample(@Param("record") Notify record, @Param("example") NotifyExample example);

    int updateByPrimaryKeySelective(Notify record);

    int updateByPrimaryKey(Notify record);
}