package mall.pojo;

import java.util.Date;

public class CmsMemberReport {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_type
     *
     * @mbg.generated
     */
    private Integer reportType;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_member_name
     *
     * @mbg.generated
     */
    private String reportMemberName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_object
     *
     * @mbg.generated
     */
    private String reportObject;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.report_status
     *
     * @mbg.generated
     */
    private Integer reportStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.handle_status
     *
     * @mbg.generated
     */
    private Integer handleStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column cms_member_report.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated
     */
    public CmsMemberReport(Long id, Integer reportType, String reportMemberName, Date createTime, String reportObject, Integer reportStatus, Integer handleStatus, String note) {
        this.id = id;
        this.reportType = reportType;
        this.reportMemberName = reportMemberName;
        this.createTime = createTime;
        this.reportObject = reportObject;
        this.reportStatus = reportStatus;
        this.handleStatus = handleStatus;
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table cms_member_report
     *
     * @mbg.generated
     */
    public CmsMemberReport() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.id
     *
     * @return the value of cms_member_report.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.id
     *
     * @param id the value for cms_member_report.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_type
     *
     * @return the value of cms_member_report.report_type
     *
     * @mbg.generated
     */
    public Integer getReportType() {
        return reportType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_type
     *
     * @param reportType the value for cms_member_report.report_type
     *
     * @mbg.generated
     */
    public void setReportType(Integer reportType) {
        this.reportType = reportType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_member_name
     *
     * @return the value of cms_member_report.report_member_name
     *
     * @mbg.generated
     */
    public String getReportMemberName() {
        return reportMemberName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_member_name
     *
     * @param reportMemberName the value for cms_member_report.report_member_name
     *
     * @mbg.generated
     */
    public void setReportMemberName(String reportMemberName) {
        this.reportMemberName = reportMemberName == null ? null : reportMemberName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.create_time
     *
     * @return the value of cms_member_report.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.create_time
     *
     * @param createTime the value for cms_member_report.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_object
     *
     * @return the value of cms_member_report.report_object
     *
     * @mbg.generated
     */
    public String getReportObject() {
        return reportObject;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_object
     *
     * @param reportObject the value for cms_member_report.report_object
     *
     * @mbg.generated
     */
    public void setReportObject(String reportObject) {
        this.reportObject = reportObject == null ? null : reportObject.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.report_status
     *
     * @return the value of cms_member_report.report_status
     *
     * @mbg.generated
     */
    public Integer getReportStatus() {
        return reportStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.report_status
     *
     * @param reportStatus the value for cms_member_report.report_status
     *
     * @mbg.generated
     */
    public void setReportStatus(Integer reportStatus) {
        this.reportStatus = reportStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.handle_status
     *
     * @return the value of cms_member_report.handle_status
     *
     * @mbg.generated
     */
    public Integer getHandleStatus() {
        return handleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.handle_status
     *
     * @param handleStatus the value for cms_member_report.handle_status
     *
     * @mbg.generated
     */
    public void setHandleStatus(Integer handleStatus) {
        this.handleStatus = handleStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column cms_member_report.note
     *
     * @return the value of cms_member_report.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column cms_member_report.note
     *
     * @param note the value for cms_member_report.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}