package cn.com.noomn.dao.mapper;

import cn.com.noomn.po.UserroleAuthority;
import cn.com.noomn.po.UserroleAuthorityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserroleAuthorityMapper {
    int countByExample(UserroleAuthorityExample example);

    int deleteByExample(UserroleAuthorityExample example);

    int deleteByPrimaryKey(String userroleAuthorityId);

    int insert(UserroleAuthority record);

    int insertSelective(UserroleAuthority record);

    List<UserroleAuthority> selectByExample(UserroleAuthorityExample example);

    UserroleAuthority selectByPrimaryKey(String userroleAuthorityId);

    int updateByExampleSelective(@Param("record") UserroleAuthority record, @Param("example") UserroleAuthorityExample example);

    int updateByExample(@Param("record") UserroleAuthority record, @Param("example") UserroleAuthorityExample example);

    int updateByPrimaryKeySelective(UserroleAuthority record);

    int updateByPrimaryKey(UserroleAuthority record);
}