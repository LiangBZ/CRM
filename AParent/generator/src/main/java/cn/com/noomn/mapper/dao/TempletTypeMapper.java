package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.TempletType;
import cn.com.noomn.po.TempletTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TempletTypeMapper {
    int countByExample(TempletTypeExample example);

    int deleteByExample(TempletTypeExample example);

    int deleteByPrimaryKey(String templetTypeId);

    int insert(TempletType record);

    int insertSelective(TempletType record);

    List<TempletType> selectByExample(TempletTypeExample example);

    TempletType selectByPrimaryKey(String templetTypeId);

    int updateByExampleSelective(@Param("record") TempletType record, @Param("example") TempletTypeExample example);

    int updateByExample(@Param("record") TempletType record, @Param("example") TempletTypeExample example);

    int updateByPrimaryKeySelective(TempletType record);

    int updateByPrimaryKey(TempletType record);
}