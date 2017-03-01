package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.SalesStage;
import cn.com.noomn.po.SalesStageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SalesStageMapper {
    int countByExample(SalesStageExample example);

    int deleteByExample(SalesStageExample example);

    int deleteByPrimaryKey(String salesStageId);

    int insert(SalesStage record);

    int insertSelective(SalesStage record);

    List<SalesStage> selectByExample(SalesStageExample example);

    SalesStage selectByPrimaryKey(String salesStageId);

    int updateByExampleSelective(@Param("record") SalesStage record, @Param("example") SalesStageExample example);

    int updateByExample(@Param("record") SalesStage record, @Param("example") SalesStageExample example);

    int updateByPrimaryKeySelective(SalesStage record);

    int updateByPrimaryKey(SalesStage record);
}