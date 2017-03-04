package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.Linkman;
import cn.com.noomn.po.LinkmanExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface LinkmanMapper {
    int countByExample(LinkmanExample example);

    int deleteByExample(LinkmanExample example);

    int deleteByPrimaryKey(String linkmanId);

    int insert(Linkman record);

    int insertSelective(Linkman record);

    List<Linkman> selectByExample(LinkmanExample example);

    Linkman selectByPrimaryKey(String linkmanId);

    int updateByExampleSelective(@Param("record") Linkman record, @Param("example") LinkmanExample example);

    int updateByExample(@Param("record") Linkman record, @Param("example") LinkmanExample example);

    int updateByPrimaryKeySelective(Linkman record);

    int updateByPrimaryKey(Linkman record);
}