package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.CustomRank;
import cn.com.noomn.po.CustomRankExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomRankMapper {
    int countByExample(CustomRankExample example);

    int deleteByExample(CustomRankExample example);

    int deleteByPrimaryKey(String customRankId);

    int insert(CustomRank record);

    int insertSelective(CustomRank record);

    List<CustomRank> selectByExample(CustomRankExample example);

    CustomRank selectByPrimaryKey(String customRankId);

    int updateByExampleSelective(@Param("record") CustomRank record, @Param("example") CustomRankExample example);

    int updateByExample(@Param("record") CustomRank record, @Param("example") CustomRankExample example);

    int updateByPrimaryKeySelective(CustomRank record);

    int updateByPrimaryKey(CustomRank record);
}