package com.sakura.mybatisgenerator.mapper.auto;

import com.sakura.mybatisgenerator.model.auto.Coffee;
import com.sakura.mybatisgenerator.model.auto.CoffeeExample;
import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.ResultMap;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectKey;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.session.RowBounds;

public interface CoffeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    long countByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    int deleteByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    @Delete({
        "delete from T_COFFEE",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    @Insert({
        "insert into T_COFFEE (NAME, PRICE, ",
        "CREATE_TIME, UPDATE_TIME)",
        "values (#{name,jdbcType=VARCHAR}, #{price,jdbcType=BIGINT,typeHandler=com.sakura.mybatisgenerator.handler.MoneyTypeHandler}, ",
        "#{createTime,jdbcType=TIMESTAMP}, #{updateTime,jdbcType=TIMESTAMP})"
    })
    @SelectKey(statement="CALL IDENTITY()", keyProperty="id", before=false, resultType=Long.class)
    int insert(Coffee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    int insertSelective(Coffee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    List<Coffee> selectByExampleWithRowbounds(CoffeeExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    List<Coffee> selectByExample(CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    @Select({
        "select",
        "ID, NAME, PRICE, CREATE_TIME, UPDATE_TIME",
        "from T_COFFEE",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @ResultMap("com.sakura.mybatisgenerator.mapper.auto.CoffeeMapper.BaseResultMap")
    Coffee selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    int updateByExampleSelective(@Param("row") Coffee row, @Param("example") CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    int updateByExample(@Param("row") Coffee row, @Param("example") CoffeeExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    int updateByPrimaryKeySelective(Coffee row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table T_COFFEE
     *
     * @mbg.generated Sat Jun 25 21:46:44 CST 2022
     */
    @Update({
        "update T_COFFEE",
        "set NAME = #{name,jdbcType=VARCHAR},",
          "PRICE = #{price,jdbcType=BIGINT,typeHandler=com.sakura.mybatisgenerator.handler.MoneyTypeHandler},",
          "CREATE_TIME = #{createTime,jdbcType=TIMESTAMP},",
          "UPDATE_TIME = #{updateTime,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(Coffee row);
}