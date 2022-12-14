package mall.mapper;

import java.util.List;
import mall.pojo.CmsHelpCategory;
import mall.pojo.CmsHelpCategoryExample;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface CmsHelpCategoryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    long countByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int deleteByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int insert(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int insertSelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    List<CmsHelpCategory> selectByExampleWithRowbounds(CmsHelpCategoryExample example, RowBounds rowBounds);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    List<CmsHelpCategory> selectByExample(CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    CmsHelpCategory selectByPrimaryKey(Long id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") CmsHelpCategory record, @Param("example") CmsHelpCategoryExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(CmsHelpCategory record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_help_category
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(CmsHelpCategory record);
}