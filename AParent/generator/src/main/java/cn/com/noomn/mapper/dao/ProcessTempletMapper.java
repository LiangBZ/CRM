package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.ProcessTemplet;
import cn.com.noomn.po.ProcessTempletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ProcessTempletMapper {
    int countByExample(ProcessTempletExample example);

    int deleteByExample(ProcessTempletExample example);

    int deleteByPrimaryKey(String processTempletId);

    int insert(ProcessTemplet record);

    int insertSelective(ProcessTemplet record);

    List<ProcessTemplet> selectByExample(ProcessTempletExample example);

    ProcessTemplet selectByPrimaryKey(String processTempletId);

    int updateByExampleSelective(@Param("record") ProcessTemplet record, @Param("example") ProcessTempletExample example);

    int updateByExample(@Param("record") ProcessTemplet record, @Param("example") ProcessTempletExample example);

    int updateByPrimaryKeySelective(ProcessTemplet record);

    int updateByPrimaryKey(ProcessTemplet record);
}