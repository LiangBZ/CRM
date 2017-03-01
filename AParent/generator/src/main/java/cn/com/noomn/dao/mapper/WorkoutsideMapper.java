package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.Workoutside;
import cn.com.noomn.po.WorkoutsideExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkoutsideMapper {
    int countByExample(WorkoutsideExample example);

    int deleteByExample(WorkoutsideExample example);

    int deleteByPrimaryKey(String workoutsideId);

    int insert(Workoutside record);

    int insertSelective(Workoutside record);

    List<Workoutside> selectByExample(WorkoutsideExample example);

    Workoutside selectByPrimaryKey(String workoutsideId);

    int updateByExampleSelective(@Param("record") Workoutside record, @Param("example") WorkoutsideExample example);

    int updateByExample(@Param("record") Workoutside record, @Param("example") WorkoutsideExample example);

    int updateByPrimaryKeySelective(Workoutside record);

    int updateByPrimaryKey(Workoutside record);
}