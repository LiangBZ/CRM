package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.TaskMember;
import cn.com.noomn.po.TaskMemberExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TaskMemberMapper {
    int countByExample(TaskMemberExample example);

    int deleteByExample(TaskMemberExample example);

    int deleteByPrimaryKey(String taskMemberId);

    int insert(TaskMember record);

    int insertSelective(TaskMember record);

    List<TaskMember> selectByExample(TaskMemberExample example);

    TaskMember selectByPrimaryKey(String taskMemberId);

    int updateByExampleSelective(@Param("record") TaskMember record, @Param("example") TaskMemberExample example);

    int updateByExample(@Param("record") TaskMember record, @Param("example") TaskMemberExample example);

    int updateByPrimaryKeySelective(TaskMember record);

    int updateByPrimaryKey(TaskMember record);
}