package mall.pojo;

import java.math.BigDecimal;

public class OmsOrderItem {
    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.id
     *
     * @mbg.generated
     */
    private Long id;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_id
     *
     * @mbg.generated
     */
    private Long orderId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.order_sn
     *
     * @mbg.generated
     */
    private String orderSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_id
     *
     * @mbg.generated
     */
    private Long productId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_pic
     *
     * @mbg.generated
     */
    private String productPic;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_name
     *
     * @mbg.generated
     */
    private String productName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_brand
     *
     * @mbg.generated
     */
    private String productBrand;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sn
     *
     * @mbg.generated
     */
    private String productSn;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_price
     *
     * @mbg.generated
     */
    private BigDecimal productPrice;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_quantity
     *
     * @mbg.generated
     */
    private Integer productQuantity;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_id
     *
     * @mbg.generated
     */
    private Long productSkuId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_sku_code
     *
     * @mbg.generated
     */
    private String productSkuCode;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_category_id
     *
     * @mbg.generated
     */
    private Long productCategoryId;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_name
     *
     * @mbg.generated
     */
    private String promotionName;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.promotion_amount
     *
     * @mbg.generated
     */
    private BigDecimal promotionAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.coupon_amount
     *
     * @mbg.generated
     */
    private BigDecimal couponAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.integration_amount
     *
     * @mbg.generated
     */
    private BigDecimal integrationAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.real_amount
     *
     * @mbg.generated
     */
    private BigDecimal realAmount;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_integration
     *
     * @mbg.generated
     */
    private Integer giftIntegration;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.gift_growth
     *
     * @mbg.generated
     */
    private Integer giftGrowth;

    /**
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column oms_order_item.product_attr
     *
     * @mbg.generated
     */
    private String productAttr;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated
     */
    public OmsOrderItem(Long id, Long orderId, String orderSn, Long productId, String productPic, String productName, String productBrand, String productSn, BigDecimal productPrice, Integer productQuantity, Long productSkuId, String productSkuCode, Long productCategoryId, String promotionName, BigDecimal promotionAmount, BigDecimal couponAmount, BigDecimal integrationAmount, BigDecimal realAmount, Integer giftIntegration, Integer giftGrowth, String productAttr) {
        this.id = id;
        this.orderId = orderId;
        this.orderSn = orderSn;
        this.productId = productId;
        this.productPic = productPic;
        this.productName = productName;
        this.productBrand = productBrand;
        this.productSn = productSn;
        this.productPrice = productPrice;
        this.productQuantity = productQuantity;
        this.productSkuId = productSkuId;
        this.productSkuCode = productSkuCode;
        this.productCategoryId = productCategoryId;
        this.promotionName = promotionName;
        this.promotionAmount = promotionAmount;
        this.couponAmount = couponAmount;
        this.integrationAmount = integrationAmount;
        this.realAmount = realAmount;
        this.giftIntegration = giftIntegration;
        this.giftGrowth = giftGrowth;
        this.productAttr = productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table oms_order_item
     *
     * @mbg.generated
     */
    public OmsOrderItem() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.id
     *
     * @return the value of oms_order_item.id
     *
     * @mbg.generated
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.id
     *
     * @param id the value for oms_order_item.id
     *
     * @mbg.generated
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_id
     *
     * @return the value of oms_order_item.order_id
     *
     * @mbg.generated
     */
    public Long getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_id
     *
     * @param orderId the value for oms_order_item.order_id
     *
     * @mbg.generated
     */
    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.order_sn
     *
     * @return the value of oms_order_item.order_sn
     *
     * @mbg.generated
     */
    public String getOrderSn() {
        return orderSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.order_sn
     *
     * @param orderSn the value for oms_order_item.order_sn
     *
     * @mbg.generated
     */
    public void setOrderSn(String orderSn) {
        this.orderSn = orderSn == null ? null : orderSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_id
     *
     * @return the value of oms_order_item.product_id
     *
     * @mbg.generated
     */
    public Long getProductId() {
        return productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_id
     *
     * @param productId the value for oms_order_item.product_id
     *
     * @mbg.generated
     */
    public void setProductId(Long productId) {
        this.productId = productId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_pic
     *
     * @return the value of oms_order_item.product_pic
     *
     * @mbg.generated
     */
    public String getProductPic() {
        return productPic;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_pic
     *
     * @param productPic the value for oms_order_item.product_pic
     *
     * @mbg.generated
     */
    public void setProductPic(String productPic) {
        this.productPic = productPic == null ? null : productPic.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_name
     *
     * @return the value of oms_order_item.product_name
     *
     * @mbg.generated
     */
    public String getProductName() {
        return productName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_name
     *
     * @param productName the value for oms_order_item.product_name
     *
     * @mbg.generated
     */
    public void setProductName(String productName) {
        this.productName = productName == null ? null : productName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_brand
     *
     * @return the value of oms_order_item.product_brand
     *
     * @mbg.generated
     */
    public String getProductBrand() {
        return productBrand;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_brand
     *
     * @param productBrand the value for oms_order_item.product_brand
     *
     * @mbg.generated
     */
    public void setProductBrand(String productBrand) {
        this.productBrand = productBrand == null ? null : productBrand.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sn
     *
     * @return the value of oms_order_item.product_sn
     *
     * @mbg.generated
     */
    public String getProductSn() {
        return productSn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sn
     *
     * @param productSn the value for oms_order_item.product_sn
     *
     * @mbg.generated
     */
    public void setProductSn(String productSn) {
        this.productSn = productSn == null ? null : productSn.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_price
     *
     * @return the value of oms_order_item.product_price
     *
     * @mbg.generated
     */
    public BigDecimal getProductPrice() {
        return productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_price
     *
     * @param productPrice the value for oms_order_item.product_price
     *
     * @mbg.generated
     */
    public void setProductPrice(BigDecimal productPrice) {
        this.productPrice = productPrice;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_quantity
     *
     * @return the value of oms_order_item.product_quantity
     *
     * @mbg.generated
     */
    public Integer getProductQuantity() {
        return productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_quantity
     *
     * @param productQuantity the value for oms_order_item.product_quantity
     *
     * @mbg.generated
     */
    public void setProductQuantity(Integer productQuantity) {
        this.productQuantity = productQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_id
     *
     * @return the value of oms_order_item.product_sku_id
     *
     * @mbg.generated
     */
    public Long getProductSkuId() {
        return productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_id
     *
     * @param productSkuId the value for oms_order_item.product_sku_id
     *
     * @mbg.generated
     */
    public void setProductSkuId(Long productSkuId) {
        this.productSkuId = productSkuId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_sku_code
     *
     * @return the value of oms_order_item.product_sku_code
     *
     * @mbg.generated
     */
    public String getProductSkuCode() {
        return productSkuCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_sku_code
     *
     * @param productSkuCode the value for oms_order_item.product_sku_code
     *
     * @mbg.generated
     */
    public void setProductSkuCode(String productSkuCode) {
        this.productSkuCode = productSkuCode == null ? null : productSkuCode.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_category_id
     *
     * @return the value of oms_order_item.product_category_id
     *
     * @mbg.generated
     */
    public Long getProductCategoryId() {
        return productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_category_id
     *
     * @param productCategoryId the value for oms_order_item.product_category_id
     *
     * @mbg.generated
     */
    public void setProductCategoryId(Long productCategoryId) {
        this.productCategoryId = productCategoryId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_name
     *
     * @return the value of oms_order_item.promotion_name
     *
     * @mbg.generated
     */
    public String getPromotionName() {
        return promotionName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_name
     *
     * @param promotionName the value for oms_order_item.promotion_name
     *
     * @mbg.generated
     */
    public void setPromotionName(String promotionName) {
        this.promotionName = promotionName == null ? null : promotionName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.promotion_amount
     *
     * @return the value of oms_order_item.promotion_amount
     *
     * @mbg.generated
     */
    public BigDecimal getPromotionAmount() {
        return promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.promotion_amount
     *
     * @param promotionAmount the value for oms_order_item.promotion_amount
     *
     * @mbg.generated
     */
    public void setPromotionAmount(BigDecimal promotionAmount) {
        this.promotionAmount = promotionAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.coupon_amount
     *
     * @return the value of oms_order_item.coupon_amount
     *
     * @mbg.generated
     */
    public BigDecimal getCouponAmount() {
        return couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.coupon_amount
     *
     * @param couponAmount the value for oms_order_item.coupon_amount
     *
     * @mbg.generated
     */
    public void setCouponAmount(BigDecimal couponAmount) {
        this.couponAmount = couponAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.integration_amount
     *
     * @return the value of oms_order_item.integration_amount
     *
     * @mbg.generated
     */
    public BigDecimal getIntegrationAmount() {
        return integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.integration_amount
     *
     * @param integrationAmount the value for oms_order_item.integration_amount
     *
     * @mbg.generated
     */
    public void setIntegrationAmount(BigDecimal integrationAmount) {
        this.integrationAmount = integrationAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.real_amount
     *
     * @return the value of oms_order_item.real_amount
     *
     * @mbg.generated
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.real_amount
     *
     * @param realAmount the value for oms_order_item.real_amount
     *
     * @mbg.generated
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_integration
     *
     * @return the value of oms_order_item.gift_integration
     *
     * @mbg.generated
     */
    public Integer getGiftIntegration() {
        return giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_integration
     *
     * @param giftIntegration the value for oms_order_item.gift_integration
     *
     * @mbg.generated
     */
    public void setGiftIntegration(Integer giftIntegration) {
        this.giftIntegration = giftIntegration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.gift_growth
     *
     * @return the value of oms_order_item.gift_growth
     *
     * @mbg.generated
     */
    public Integer getGiftGrowth() {
        return giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.gift_growth
     *
     * @param giftGrowth the value for oms_order_item.gift_growth
     *
     * @mbg.generated
     */
    public void setGiftGrowth(Integer giftGrowth) {
        this.giftGrowth = giftGrowth;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column oms_order_item.product_attr
     *
     * @return the value of oms_order_item.product_attr
     *
     * @mbg.generated
     */
    public String getProductAttr() {
        return productAttr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column oms_order_item.product_attr
     *
     * @param productAttr the value for oms_order_item.product_attr
     *
     * @mbg.generated
     */
    public void setProductAttr(String productAttr) {
        this.productAttr = productAttr == null ? null : productAttr.trim();
    }
}