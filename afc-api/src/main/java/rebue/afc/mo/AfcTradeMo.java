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
 *   账户交易(账户交易流水)
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table AFC_TRADE
 *
 * @mbg.generated do_not_delete_during_merge 2018-02-25 16:44:16
 */
@ApiModel(value = "AfcTradeMo", description = "账户交易(账户交易流水)")
@JsonInclude(Include.NON_NULL)
public class AfcTradeMo implements Serializable {
    /**
     * Database Column Remarks:
     *   交易ID(等于流水ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易ID(等于流水ID)")
    private Long id;

    /**
     * Database Column Remarks:
     *   账户ID(账户ID也就是用户ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "账户ID(账户ID也就是用户ID)")
    private Long accountId;

    /**
     * Database Column Remarks:
     *   交易类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易类型")
    private Byte tradeType;

    /**
     * Database Column Remarks:
     *   交易金额（收入为正数，支出为负数）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易金额（收入为正数，支出为负数）")
    private BigDecimal tradeAmount;

    /**
     * Database Column Remarks:
     *   交易改变金额1，在支付类型中代表返现金改变了多少
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.CHANGE_AMOUNT1
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易改变金额1，在支付类型中代表返现金改变了多少")
    private BigDecimal changeAmount1;

    /**
     * Database Column Remarks:
     *   交易改变金额2，在支付类型中代表余额改变了多少
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.CHANGE_AMOUNT2
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易改变金额2，在支付类型中代表余额改变了多少")
    private BigDecimal changeAmount2;

    /**
     * Database Column Remarks:
     *   交易标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_TITLE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易标题")
    private String tradeTitle;

    /**
     * Database Column Remarks:
     *   交易详情
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易详情")
    private String tradeDetail;

    /**
     * Database Column Remarks:
     *   交易时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date tradeTime;

    /**
     * Database Column Remarks:
     *   订单ID(业务订单ID)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "订单ID(业务订单ID)")
    private String orderId;

    /**
     * Database Column Remarks:
     *   交易凭证号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.TRADE_VOUCHER_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易凭证号")
    private String tradeVoucherNo;

    /**
     * Database Column Remarks:
     *   操作人ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.OP_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "操作人ID")
    private Long opId;

    /**
     * Database Column Remarks:
     *   MAC地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "MAC地址")
    private String mac;

    /**
     * Database Column Remarks:
     *   IP地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_TRADE.IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "IP地址")
    private String ip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AFC_TRADE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.ID
     *
     * @return the value of AFC_TRADE.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.ID
     *
     * @param id the value for AFC_TRADE.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.ACCOUNT_ID
     *
     * @return the value of AFC_TRADE.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.ACCOUNT_ID
     *
     * @param accountId the value for AFC_TRADE.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_TYPE
     *
     * @return the value of AFC_TRADE.TRADE_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Byte getTradeType() {
        return tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_TYPE
     *
     * @param tradeType the value for AFC_TRADE.TRADE_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeType(Byte tradeType) {
        this.tradeType = tradeType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_AMOUNT
     *
     * @return the value of AFC_TRADE.TRADE_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getTradeAmount() {
        return tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_AMOUNT
     *
     * @param tradeAmount the value for AFC_TRADE.TRADE_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeAmount(BigDecimal tradeAmount) {
        this.tradeAmount = tradeAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.CHANGE_AMOUNT1
     *
     * @return the value of AFC_TRADE.CHANGE_AMOUNT1
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getChangeAmount1() {
        return changeAmount1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.CHANGE_AMOUNT1
     *
     * @param changeAmount1 the value for AFC_TRADE.CHANGE_AMOUNT1
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setChangeAmount1(BigDecimal changeAmount1) {
        this.changeAmount1 = changeAmount1;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.CHANGE_AMOUNT2
     *
     * @return the value of AFC_TRADE.CHANGE_AMOUNT2
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getChangeAmount2() {
        return changeAmount2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.CHANGE_AMOUNT2
     *
     * @param changeAmount2 the value for AFC_TRADE.CHANGE_AMOUNT2
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setChangeAmount2(BigDecimal changeAmount2) {
        this.changeAmount2 = changeAmount2;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_TITLE
     *
     * @return the value of AFC_TRADE.TRADE_TITLE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getTradeTitle() {
        return tradeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_TITLE
     *
     * @param tradeTitle the value for AFC_TRADE.TRADE_TITLE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeTitle(String tradeTitle) {
        this.tradeTitle = tradeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_DETAIL
     *
     * @return the value of AFC_TRADE.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getTradeDetail() {
        return tradeDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_DETAIL
     *
     * @param tradeDetail the value for AFC_TRADE.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeDetail(String tradeDetail) {
        this.tradeDetail = tradeDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_TIME
     *
     * @return the value of AFC_TRADE.TRADE_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Date getTradeTime() {
        return tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_TIME
     *
     * @param tradeTime the value for AFC_TRADE.TRADE_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeTime(Date tradeTime) {
        this.tradeTime = tradeTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.ORDER_ID
     *
     * @return the value of AFC_TRADE.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.ORDER_ID
     *
     * @param orderId the value for AFC_TRADE.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.TRADE_VOUCHER_NO
     *
     * @return the value of AFC_TRADE.TRADE_VOUCHER_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getTradeVoucherNo() {
        return tradeVoucherNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.TRADE_VOUCHER_NO
     *
     * @param tradeVoucherNo the value for AFC_TRADE.TRADE_VOUCHER_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeVoucherNo(String tradeVoucherNo) {
        this.tradeVoucherNo = tradeVoucherNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.OP_ID
     *
     * @return the value of AFC_TRADE.OP_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getOpId() {
        return opId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.OP_ID
     *
     * @param opId the value for AFC_TRADE.OP_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setOpId(Long opId) {
        this.opId = opId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.MAC
     *
     * @return the value of AFC_TRADE.MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getMac() {
        return mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.MAC
     *
     * @param mac the value for AFC_TRADE.MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setMac(String mac) {
        this.mac = mac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_TRADE.IP
     *
     * @return the value of AFC_TRADE.IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getIp() {
        return ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_TRADE.IP
     *
     * @param ip the value for AFC_TRADE.IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_TRADE
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
        sb.append(", tradeType=").append(tradeType);
        sb.append(", tradeAmount=").append(tradeAmount);
        sb.append(", changeAmount1=").append(changeAmount1);
        sb.append(", changeAmount2=").append(changeAmount2);
        sb.append(", tradeTitle=").append(tradeTitle);
        sb.append(", tradeDetail=").append(tradeDetail);
        sb.append(", tradeTime=").append(tradeTime);
        sb.append(", orderId=").append(orderId);
        sb.append(", tradeVoucherNo=").append(tradeVoucherNo);
        sb.append(", opId=").append(opId);
        sb.append(", mac=").append(mac);
        sb.append(", ip=").append(ip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_TRADE
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
        AfcTradeMo other = (AfcTradeMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_TRADE
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