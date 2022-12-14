package mall.pojo;

import java.util.Date;

public class OmsOrderOperateHistory {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.operate_man
     *
     * @mbg.generated
     */
    private String operateMan;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.create_time
     *
     * @mbg.generated
     */
    private Date createTime;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.order_status
     *
     * @mbg.generated
     */
    private Integer orderStatus;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_operate_history.note
     *
     * @mbg.generated
     */
    private String note;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated
     */
    public OmsOrderOperateHistory(Long id, Long orderId, String operateMan, Date createTime, Integer orderStatus, String note) {
        this.id = id;
        this.orderId = orderId;
        this.operateMan = operateMan;
        this.createTime = createTime;
        this.orderStatus = orderStatus;
        this.note = note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_operate_history
     *
     * @mbg.generated
     */
    public OmsOrderOperateHistory() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.id
     *
     * @return the value of oms_order_operate_history.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.id
     *
     * @param id the value for oms_order_operate_history.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.order_id
     *
     * @return the value of oms_order_operate_history.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.order_id
     *
     * @param orderId the value for oms_order_operate_history.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.operate_man
     *
     * @return the value of oms_order_operate_history.operate_man
     *
     * @mbg.generated
     */
    public String getOperateMan() {
        return operateMan;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.operate_man
     *
     * @param operateMan the value for oms_order_operate_history.operate_man
     *
     * @mbg.generated
     */
    public void setOperateMan(String operateMan) {
        this.operateMan = operateMan == null ? null : operateMan.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.create_time
     *
     * @return the value of oms_order_operate_history.create_time
     *
     * @mbg.generated
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.create_time
     *
     * @param createTime the value for oms_order_operate_history.create_time
     *
     * @mbg.generated
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.order_status
     *
     * @return the value of oms_order_operate_history.order_status
     *
     * @mbg.generated
     */
    public Integer getOrderStatus() {
        return orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.order_status
     *
     * @param orderStatus the value for oms_order_operate_history.order_status
     *
     * @mbg.generated
     */
    public void setOrderStatus(Integer orderStatus) {
        this.orderStatus = orderStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_operate_history.note
     *
     * @return the value of oms_order_operate_history.note
     *
     * @mbg.generated
     */
    public String getNote() {
        return note;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_operate_history.note
     *
     * @param note the value for oms_order_operate_history.note
     *
     * @mbg.generated
     */
    public void setNote(String note) {
        this.note = note == null ? null : note.trim();
    }
}