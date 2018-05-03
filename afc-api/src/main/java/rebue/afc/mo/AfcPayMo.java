package rebue.afc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * Database Table Remarks:
 *   支付信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table AFC_PAY
 *
 * @mbg.generated do_not_delete_during_merge 2018-02-25 16:44:16
 */
@ApiModel(value = "AfcPayMo", description = "支付信息")
@JsonInclude(Include.NON_NULL)
public class AfcPayMo implements Serializable {
    /**
     * Database Column Remarks:
     *   支付ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   账户ID(账户ID也就是用户ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "账户ID(账户ID也就是用户ID)")
    private Long accountId;

    /**
     * Database Column Remarks:
     *   订单ID(业务订单ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "订单ID(业务订单ID)")
    private String orderId;

    /**
     * Database Column Remarks:
     *   支付类型ID(1.V支付;2.微信支付;3.支付宝;4.银联)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.PAY_TYPE_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付类型ID(1.V支付;2.微信支付;3.支付宝;4.银联)")
    private Byte payTypeId;

    /**
     * Database Column Remarks:
     *   支付账户ID(例如微信ID，支付宝ID，V支付的账户ID也就是本系统的用户ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.PAY_ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付账户ID(例如微信ID，支付宝ID，V支付的账户ID也就是本系统的用户ID)")
    private String payAccountId;

    /**
     * Database Column Remarks:
     *   支付订单ID(V支付订单ID就是交易ID或流水ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.PAY_ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付订单ID(V支付订单ID就是交易ID或流水ID)")
    private String payOrderId;

    /**
     * Database Column Remarks:
     *   支付金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.PAY_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付金额")
    private BigDecimal payAmount;

    /**
     * Database Column Remarks:
     *   支付时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PAY.PAY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "支付时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date payTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AFC_PAY
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.ID
     *
     * @return the value of AFC_PAY.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.ID
     *
     * @param id the value for AFC_PAY.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.ACCOUNT_ID
     *
     * @return the value of AFC_PAY.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.ACCOUNT_ID
     *
     * @param accountId the value for AFC_PAY.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.ORDER_ID
     *
     * @return the value of AFC_PAY.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.ORDER_ID
     *
     * @param orderId the value for AFC_PAY.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.PAY_TYPE_ID
     *
     * @return the value of AFC_PAY.PAY_TYPE_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Byte getPayTypeId() {
        return payTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.PAY_TYPE_ID
     *
     * @param payTypeId the value for AFC_PAY.PAY_TYPE_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setPayTypeId(Byte payTypeId) {
        this.payTypeId = payTypeId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.PAY_ACCOUNT_ID
     *
     * @return the value of AFC_PAY.PAY_ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getPayAccountId() {
        return payAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.PAY_ACCOUNT_ID
     *
     * @param payAccountId the value for AFC_PAY.PAY_ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setPayAccountId(String payAccountId) {
        this.payAccountId = payAccountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.PAY_ORDER_ID
     *
     * @return the value of AFC_PAY.PAY_ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getPayOrderId() {
        return payOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.PAY_ORDER_ID
     *
     * @param payOrderId the value for AFC_PAY.PAY_ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setPayOrderId(String payOrderId) {
        this.payOrderId = payOrderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.PAY_AMOUNT
     *
     * @return the value of AFC_PAY.PAY_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getPayAmount() {
        return payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.PAY_AMOUNT
     *
     * @param payAmount the value for AFC_PAY.PAY_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setPayAmount(BigDecimal payAmount) {
        this.payAmount = payAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PAY.PAY_TIME
     *
     * @return the value of AFC_PAY.PAY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Date getPayTime() {
        return payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PAY.PAY_TIME
     *
     * @param payTime the value for AFC_PAY.PAY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PAY
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", accountId=").append(accountId);
        sb.append(", orderId=").append(orderId);
        sb.append(", payTypeId=").append(payTypeId);
        sb.append(", payAccountId=").append(payAccountId);
        sb.append(", payOrderId=").append(payOrderId);
        sb.append(", payAmount=").append(payAmount);
        sb.append(", payTime=").append(payTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PAY
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        AfcPayMo other = (AfcPayMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PAY
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}