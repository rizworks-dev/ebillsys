package net.newbiz.ebil.billing.test.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Param;

import net.newbiz.ebil.billing.dao.model.TCust;
import net.newbiz.ebil.billing.dao.model.TCustExample;

public class TCustMapperMockBase {

	/** Logger */
	private static org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(TCustMapperMockBase.class);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int countByExample(TCustExample example)
    {
		log.trace("テストクラス実行 - trace");
		log.debug("テストクラス実行 - debug");
		log.info("テストクラス実行 - info");
		log.warn("テストクラス実行 - warn");
		log.error("テストクラス実行 - error");
		
    	return 1;
    };

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int deleteByExample(TCustExample example)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int deleteByPrimaryKey(Integer custCd)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int insert(TCust record)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int insertSelective(TCust record)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public List<TCust> selectByExample(TCustExample example)
    {
		log.trace("テストクラス実行 - trace");
		log.debug("テストクラス実行 - debug");
		log.info("テストクラス実行 - info");
		log.warn("テストクラス実行 - warn");
		log.error("テストクラス実行 - error");
		
    	return new ArrayList();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public TCust selectByPrimaryKey(Integer custCd)
    {
		log.debug("テストクラス実行");
		
    	return new TCust();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int updateByExampleSelective(@Param("record") TCust record, @Param("example") TCustExample example)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int updateByExample(@Param("record") TCust record, @Param("example") TCustExample example)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int updateByPrimaryKeySelective(TCust record)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_cust
     *
     * @mbggenerated
     */
    public int updateByPrimaryKey(TCust record)
    {
		log.debug("テストクラス実行");
		
    	return 1;
    }
}
