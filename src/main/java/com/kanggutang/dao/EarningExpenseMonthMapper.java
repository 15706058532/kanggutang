package com.kanggutang.dao;

import com.kanggutang.model.EarningExpenseMonth;
import com.kanggutang.model.EarningExpenseMonthExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface EarningExpenseMonthMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int countByExample(EarningExpenseMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int deleteByExample(EarningExpenseMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int deleteByPrimaryKey(Integer earningExpenseMonthId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int insert(EarningExpenseMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int insertSelective(EarningExpenseMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    List<EarningExpenseMonth> selectByExample(EarningExpenseMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    EarningExpenseMonth selectByPrimaryKey(Integer earningExpenseMonthId);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int updateByExampleSelective(@Param("record") EarningExpenseMonth record, @Param("example") EarningExpenseMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int updateByExample(@Param("record") EarningExpenseMonth record, @Param("example") EarningExpenseMonthExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int updateByPrimaryKeySelective(EarningExpenseMonth record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table earning_expense_month
     *
     * @mbggenerated
     */
    int updateByPrimaryKey(EarningExpenseMonth record);
}