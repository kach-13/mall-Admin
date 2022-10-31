package mall.pojo;

public class CmsPrefrenceArea {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.name
     *
     * @mbg.generated
     */
    private String name;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.sub_title
     *
     * @mbg.generated
     */
    private String subTitle;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.sort
     *
     * @mbg.generated
     */
    private Integer sort;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.show_status
     *
     * @mbg.generated
     */
    private Integer showStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_prefrence_area.pic
     *
     * @mbg.generated
     */
    private byte[] pic;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbg.generated
     */
    public CmsPrefrenceArea(Long id, String name, String subTitle, Integer sort, Integer showStatus, byte[] pic) {
        this.id = id;
        this.name = name;
        this.subTitle = subTitle;
        this.sort = sort;
        this.showStatus = showStatus;
        this.pic = pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_prefrence_area
     *
     * @mbg.generated
     */
    public CmsPrefrenceArea() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.id
     *
     * @return the value of cms_prefrence_area.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.id
     *
     * @param id the value for cms_prefrence_area.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.name
     *
     * @return the value of cms_prefrence_area.name
     *
     * @mbg.generated
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.name
     *
     * @param name the value for cms_prefrence_area.name
     *
     * @mbg.generated
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.sub_title
     *
     * @return the value of cms_prefrence_area.sub_title
     *
     * @mbg.generated
     */
    public String getSubTitle() {
        return subTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.sub_title
     *
     * @param subTitle the value for cms_prefrence_area.sub_title
     *
     * @mbg.generated
     */
    public void setSubTitle(String subTitle) {
        this.subTitle = subTitle == null ? null : subTitle.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.sort
     *
     * @return the value of cms_prefrence_area.sort
     *
     * @mbg.generated
     */
    public Integer getSort() {
        return sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.sort
     *
     * @param sort the value for cms_prefrence_area.sort
     *
     * @mbg.generated
     */
    public void setSort(Integer sort) {
        this.sort = sort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.show_status
     *
     * @return the value of cms_prefrence_area.show_status
     *
     * @mbg.generated
     */
    public Integer getShowStatus() {
        return showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.show_status
     *
     * @param showStatus the value for cms_prefrence_area.show_status
     *
     * @mbg.generated
     */
    public void setShowStatus(Integer showStatus) {
        this.showStatus = showStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_prefrence_area.pic
     *
     * @return the value of cms_prefrence_area.pic
     *
     * @mbg.generated
     */
    public byte[] getPic() {
        return pic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_prefrence_area.pic
     *
     * @param pic the value for cms_prefrence_area.pic
     *
     * @mbg.generated
     */
    public void setPic(byte[] pic) {
        this.pic = pic;
    }
}