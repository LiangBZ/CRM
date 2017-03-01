package cn.com.noomn.mapper.dao;

import cn.com.noomn.po.BusinessOpportunity;
import cn.com.noomn.po.BusinessOpportunityExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface BusinessOpportunityMapper {
    int countByExample(BusinessOpportunityExample example);

    int deleteByExample(BusinessOpportunityExample example);

    int deleteByPrimaryKey(String businessOpportunityId);

    int insert(BusinessOpportunity record);

    int insertSelective(BusinessOpportunity record);

    List<BusinessOpportunity> selectByExample(BusinessOpportunityExample example);

    BusinessOpportunity selectByPrimaryKey(String businessOpportunityId);

    int updateByExampleSelective(@Param("record") BusinessOpportunity record, @Param("example") BusinessOpportunityExample example);

    int updateByExample(@Param("record") BusinessOpportunity record, @Param("example") BusinessOpportunityExample example);

    int updateByPrimaryKeySelective(BusinessOpportunity record);

    int updateByPrimaryKey(BusinessOpportunity record);
}