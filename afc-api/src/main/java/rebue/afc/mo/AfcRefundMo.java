package rebue.afc.mo;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

/**
 * 退款日志
 *
 * 数据库表: AFC_REFUND
 *
 * @mbg.generated 自动生成的注释，如需修改本注释，请删除本行
 */
@JsonInclude(Include.NON_NULL)
public class AfcRefundMo implements Serializable {

    /**
     *    退款ID
     *
     *    数据库字段: AFC_REFUND.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long id;

    /**
     *    账户ID
     *
     *    数据库字段: AFC_REFUND.ACCOUNT_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long accountId;

    /**
     *    订单ID(支付订单ID)
     *
     *    数据库字段: AFC_REFUND.ORDER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String orderId;

    /**
     *    退款时间
     *
     *    数据库字段: AFC_REFUND.REFUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date refundTime;

    /**
     *    退款金额总额
     *
     *    数据库字段: AFC_REFUND.REFUND_TOTAL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private BigDecimal refundTotal;

    /**
     *    退款金额1，在退款去向类型是V支付时代表退了多少返现金
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT1
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private BigDecimal refundAmount1;

    /**
     *    退款金额2，在退款去向类型是V支付时代表退了多少余额
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT2
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private BigDecimal refundAmount2;

    /**
     *    退款标题
     *
     *    数据库字段: AFC_REFUND.REFUND_TITLE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String refundTitle;

    /**
     *    退款详情
     *
     *    数据库字段: AFC_REFUND.REFUND_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String refundDetail;

    /**
     *    操作人ID
     *
     *    数据库字段: AFC_REFUND.OP_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private Long opId;

    /**
     *    IP地址
     *
     *    数据库字段: AFC_REFUND.IP
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private String ip;

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    private static final long serialVersionUID = 1L;

    /**
     *    退款ID
     *
     *    数据库字段: AFC_REFUND.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getId() {
        return id;
    }

    /**
     *    退款ID
     *
     *    数据库字段: AFC_REFUND.ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     *    账户ID
     *
     *    数据库字段: AFC_REFUND.ACCOUNT_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     *    账户ID
     *
     *    数据库字段: AFC_REFUND.ACCOUNT_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     *    订单ID(支付订单ID)
     *
     *    数据库字段: AFC_REFUND.ORDER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     *    订单ID(支付订单ID)
     *
     *    数据库字段: AFC_REFUND.ORDER_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     *    退款时间
     *
     *    数据库字段: AFC_REFUND.REFUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Date getRefundTime() {
        return refundTime;
    }

    /**
     *    退款时间
     *
     *    数据库字段: AFC_REFUND.REFUND_TIME
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundTime(Date refundTime) {
        this.refundTime = refundTime;
    }

    /**
     *    退款金额总额
     *
     *    数据库字段: AFC_REFUND.REFUND_TOTAL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public BigDecimal getRefundTotal() {
        return refundTotal;
    }

    /**
     *    退款金额总额
     *
     *    数据库字段: AFC_REFUND.REFUND_TOTAL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundTotal(BigDecimal refundTotal) {
        this.refundTotal = refundTotal;
    }

    /**
     *    退款金额1，在退款去向类型是V支付时代表退了多少返现金
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT1
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public BigDecimal getRefundAmount1() {
        return refundAmount1;
    }

    /**
     *    退款金额1，在退款去向类型是V支付时代表退了多少返现金
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT1
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundAmount1(BigDecimal refundAmount1) {
        this.refundAmount1 = refundAmount1;
    }

    /**
     *    退款金额2，在退款去向类型是V支付时代表退了多少余额
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT2
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public BigDecimal getRefundAmount2() {
        return refundAmount2;
    }

    /**
     *    退款金额2，在退款去向类型是V支付时代表退了多少余额
     *
     *    数据库字段: AFC_REFUND.REFUND_AMOUNT2
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundAmount2(BigDecimal refundAmount2) {
        this.refundAmount2 = refundAmount2;
    }

    /**
     *    退款标题
     *
     *    数据库字段: AFC_REFUND.REFUND_TITLE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRefundTitle() {
        return refundTitle;
    }

    /**
     *    退款标题
     *
     *    数据库字段: AFC_REFUND.REFUND_TITLE
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundTitle(String refundTitle) {
        this.refundTitle = refundTitle;
    }

    /**
     *    退款详情
     *
     *    数据库字段: AFC_REFUND.REFUND_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getRefundDetail() {
        return refundDetail;
    }

    /**
     *    退款详情
     *
     *    数据库字段: AFC_REFUND.REFUND_DETAIL
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setRefundDetail(String refundDetail) {
        this.refundDetail = refundDetail;
    }

    /**
     *    操作人ID
     *
     *    数据库字段: AFC_REFUND.OP_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public Long getOpId() {
        return opId;
    }

    /**
     *    操作人ID
     *
     *    数据库字段: AFC_REFUND.OP_ID
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setOpId(Long opId) {
        this.opId = opId;
    }

    /**
     *    IP地址
     *
     *    数据库字段: AFC_REFUND.IP
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public String getIp() {
        return ip;
    }

    /**
     *    IP地址
     *
     *    数据库字段: AFC_REFUND.IP
     *
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    public void setIp(String ip) {
        this.ip = ip;
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
        sb.append(", refundTime=").append(refundTime);
        sb.append(", refundTotal=").append(refundTotal);
        sb.append(", refundAmount1=").append(refundAmount1);
        sb.append(", refundAmount2=").append(refundAmount2);
        sb.append(", refundTitle=").append(refundTitle);
        sb.append(", refundDetail=").append(refundDetail);
        sb.append(", opId=").append(opId);
        sb.append(", ip=").append(ip);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
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
        AfcRefundMo other = (AfcRefundMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
    }

    /**
     *    @mbg.generated 自动生成，如需修改，请删除本行
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}