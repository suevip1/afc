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
 *   提现信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table AFC_WITHDRAW
 *
 * @mbg.generated do_not_delete_during_merge 2018-02-25 16:44:16
 */
@ApiModel(value = "AfcWithdrawMo", description = "提现信息")
@JsonInclude(Include.NON_NULL)
public class AfcWithdrawMo implements Serializable {
    /**
     * Database Column Remarks:
     *   提现记录
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现记录")
    private Long id;

    /**
     * Database Column Remarks:
     *   申请时记录-账户ID（方便查询）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请时记录-账户ID（方便查询）")
    private Long accountId;

    /**
     * Database Column Remarks:
     *   申请单号（唯一约束，以防重复申请）
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请单号（唯一约束，以防重复申请）")
    private String orderId;

    /**
     * Database Column Remarks:
     *   提现状态(-1-作废；1-申请；2-处理中；3-已提现)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.WITHDRAW_STATE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现状态(-1-作废；1-申请；2-处理中；3-已提现)")
    private Byte withdrawState;

    /**
     * Database Column Remarks:
     *   交易标题
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.TRADE_TITLE
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
     * This field corresponds to the database column AFC_WITHDRAW.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "交易详情")
    private String tradeDetail;

    /**
     * Database Column Remarks:
     *   提现金额(提现金额=实际到账金额+提现服务费)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现金额(提现金额=实际到账金额+提现服务费)")
    private BigDecimal amount;

    /**
     * Database Column Remarks:
     *   实际到账金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.REAL_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "实际到账金额")
    private BigDecimal realAmount;

    /**
     * Database Column Remarks:
     *   提现服务费
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.SEVICE_CHARGE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现服务费")
    private BigDecimal seviceCharge;

    /**
     * Database Column Remarks:
     *   申请时记录-申请人ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.APPLICANT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请时记录-申请人ID")
    private Long applicantId;

    /**
     * Database Column Remarks:
     *   申请时记录-申请时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.APPLY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请时记录-申请时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date applyTime;

    /**
     * Database Column Remarks:
     *   申请时记录-申请人MAC地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.APPLICANT_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请时记录-申请人MAC地址")
    private String applicantMac;

    /**
     * Database Column Remarks:
     *   申请时记录-申请人IP地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.APPLICANT_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "申请时记录-申请人IP地址")
    private String applicantIp;

    /**
     * Database Column Remarks:
     *   受理时记录-受理人ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.RECIEVER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "受理时记录-受理人ID")
    private Long recieverId;

    /**
     * Database Column Remarks:
     *   受理时记录-受理时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.RECIEVER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "受理时记录-受理时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date recieverTime;

    /**
     * Database Column Remarks:
     *   受理时记录-受理人MAC地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.RECIEVER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "受理时记录-受理人MAC地址")
    private String recieverMac;

    /**
     * Database Column Remarks:
     *   受理时记录-受理人IP地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.RECIEVER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "受理时记录-受理人IP地址")
    private String recieverIp;

    /**
     * Database Column Remarks:
     *   提现成功或作废时记录-结束人ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.FINISHER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现成功或作废时记录-结束人ID")
    private Long finisherId;

    /**
     * Database Column Remarks:
     *   提现成功或作废时记录-结束时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.FINISHER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现成功或作废时记录-结束时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date finisherTime;

    /**
     * Database Column Remarks:
     *   提现成功或作废时记录-结束人MAC地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.FINISHER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现成功或作废时记录-结束人MAC地址")
    private String finisherMac;

    /**
     * Database Column Remarks:
     *   提现成功或作废时记录-结束人IP地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.FINISHER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现成功或作废时记录-结束人IP地址")
    private String finisherIp;

    /**
     * Database Column Remarks:
     *   提现类型(1-银行卡,2-支付宝)
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.WITHDRAW_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "提现类型(1-银行卡,2-支付宝)")
    private Byte withdrawType;

    /**
     * Database Column Remarks:
     *   联系电话
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.CONTACT_TEL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "联系电话")
    private String contactTel;

    /**
     * Database Column Remarks:
     *   银行账号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.BANK_ACCOUNT_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "银行账号")
    private String bankAccountNo;

    /**
     * Database Column Remarks:
     *   银行账户名称
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.BANK_ACCOUNT_NAME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "银行账户名称")
    private String bankAccountName;

    /**
     * Database Column Remarks:
     *   开户银行
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.OPEN_ACCOUNT_BANK
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "开户银行")
    private String openAccountBank;

    /**
     * Database Column Remarks:
     *   作废提现时记录-作废原因
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_WITHDRAW.CANCEL_REASON
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    @ApiModelProperty(value = "作废提现时记录-作废原因")
    private String cancelReason;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AFC_WITHDRAW
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.ID
     *
     * @return the value of AFC_WITHDRAW.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.ID
     *
     * @param id the value for AFC_WITHDRAW.ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.ACCOUNT_ID
     *
     * @return the value of AFC_WITHDRAW.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getAccountId() {
        return accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.ACCOUNT_ID
     *
     * @param accountId the value for AFC_WITHDRAW.ACCOUNT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setAccountId(Long accountId) {
        this.accountId = accountId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.ORDER_ID
     *
     * @return the value of AFC_WITHDRAW.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getOrderId() {
        return orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.ORDER_ID
     *
     * @param orderId the value for AFC_WITHDRAW.ORDER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.WITHDRAW_STATE
     *
     * @return the value of AFC_WITHDRAW.WITHDRAW_STATE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Byte getWithdrawState() {
        return withdrawState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.WITHDRAW_STATE
     *
     * @param withdrawState the value for AFC_WITHDRAW.WITHDRAW_STATE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setWithdrawState(Byte withdrawState) {
        this.withdrawState = withdrawState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.TRADE_TITLE
     *
     * @return the value of AFC_WITHDRAW.TRADE_TITLE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getTradeTitle() {
        return tradeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.TRADE_TITLE
     *
     * @param tradeTitle the value for AFC_WITHDRAW.TRADE_TITLE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeTitle(String tradeTitle) {
        this.tradeTitle = tradeTitle;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.TRADE_DETAIL
     *
     * @return the value of AFC_WITHDRAW.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getTradeDetail() {
        return tradeDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.TRADE_DETAIL
     *
     * @param tradeDetail the value for AFC_WITHDRAW.TRADE_DETAIL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setTradeDetail(String tradeDetail) {
        this.tradeDetail = tradeDetail;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.AMOUNT
     *
     * @return the value of AFC_WITHDRAW.AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.AMOUNT
     *
     * @param amount the value for AFC_WITHDRAW.AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.REAL_AMOUNT
     *
     * @return the value of AFC_WITHDRAW.REAL_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getRealAmount() {
        return realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.REAL_AMOUNT
     *
     * @param realAmount the value for AFC_WITHDRAW.REAL_AMOUNT
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setRealAmount(BigDecimal realAmount) {
        this.realAmount = realAmount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.SEVICE_CHARGE
     *
     * @return the value of AFC_WITHDRAW.SEVICE_CHARGE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public BigDecimal getSeviceCharge() {
        return seviceCharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.SEVICE_CHARGE
     *
     * @param seviceCharge the value for AFC_WITHDRAW.SEVICE_CHARGE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setSeviceCharge(BigDecimal seviceCharge) {
        this.seviceCharge = seviceCharge;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.APPLICANT_ID
     *
     * @return the value of AFC_WITHDRAW.APPLICANT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getApplicantId() {
        return applicantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.APPLICANT_ID
     *
     * @param applicantId the value for AFC_WITHDRAW.APPLICANT_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.APPLY_TIME
     *
     * @return the value of AFC_WITHDRAW.APPLY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Date getApplyTime() {
        return applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.APPLY_TIME
     *
     * @param applyTime the value for AFC_WITHDRAW.APPLY_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setApplyTime(Date applyTime) {
        this.applyTime = applyTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.APPLICANT_MAC
     *
     * @return the value of AFC_WITHDRAW.APPLICANT_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getApplicantMac() {
        return applicantMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.APPLICANT_MAC
     *
     * @param applicantMac the value for AFC_WITHDRAW.APPLICANT_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setApplicantMac(String applicantMac) {
        this.applicantMac = applicantMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.APPLICANT_IP
     *
     * @return the value of AFC_WITHDRAW.APPLICANT_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getApplicantIp() {
        return applicantIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.APPLICANT_IP
     *
     * @param applicantIp the value for AFC_WITHDRAW.APPLICANT_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setApplicantIp(String applicantIp) {
        this.applicantIp = applicantIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.RECIEVER_ID
     *
     * @return the value of AFC_WITHDRAW.RECIEVER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getRecieverId() {
        return recieverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.RECIEVER_ID
     *
     * @param recieverId the value for AFC_WITHDRAW.RECIEVER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setRecieverId(Long recieverId) {
        this.recieverId = recieverId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.RECIEVER_TIME
     *
     * @return the value of AFC_WITHDRAW.RECIEVER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Date getRecieverTime() {
        return recieverTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.RECIEVER_TIME
     *
     * @param recieverTime the value for AFC_WITHDRAW.RECIEVER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setRecieverTime(Date recieverTime) {
        this.recieverTime = recieverTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.RECIEVER_MAC
     *
     * @return the value of AFC_WITHDRAW.RECIEVER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getRecieverMac() {
        return recieverMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.RECIEVER_MAC
     *
     * @param recieverMac the value for AFC_WITHDRAW.RECIEVER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setRecieverMac(String recieverMac) {
        this.recieverMac = recieverMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.RECIEVER_IP
     *
     * @return the value of AFC_WITHDRAW.RECIEVER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getRecieverIp() {
        return recieverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.RECIEVER_IP
     *
     * @param recieverIp the value for AFC_WITHDRAW.RECIEVER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setRecieverIp(String recieverIp) {
        this.recieverIp = recieverIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.FINISHER_ID
     *
     * @return the value of AFC_WITHDRAW.FINISHER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Long getFinisherId() {
        return finisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.FINISHER_ID
     *
     * @param finisherId the value for AFC_WITHDRAW.FINISHER_ID
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setFinisherId(Long finisherId) {
        this.finisherId = finisherId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.FINISHER_TIME
     *
     * @return the value of AFC_WITHDRAW.FINISHER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Date getFinisherTime() {
        return finisherTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.FINISHER_TIME
     *
     * @param finisherTime the value for AFC_WITHDRAW.FINISHER_TIME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setFinisherTime(Date finisherTime) {
        this.finisherTime = finisherTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.FINISHER_MAC
     *
     * @return the value of AFC_WITHDRAW.FINISHER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getFinisherMac() {
        return finisherMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.FINISHER_MAC
     *
     * @param finisherMac the value for AFC_WITHDRAW.FINISHER_MAC
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setFinisherMac(String finisherMac) {
        this.finisherMac = finisherMac;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.FINISHER_IP
     *
     * @return the value of AFC_WITHDRAW.FINISHER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getFinisherIp() {
        return finisherIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.FINISHER_IP
     *
     * @param finisherIp the value for AFC_WITHDRAW.FINISHER_IP
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setFinisherIp(String finisherIp) {
        this.finisherIp = finisherIp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.WITHDRAW_TYPE
     *
     * @return the value of AFC_WITHDRAW.WITHDRAW_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public Byte getWithdrawType() {
        return withdrawType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.WITHDRAW_TYPE
     *
     * @param withdrawType the value for AFC_WITHDRAW.WITHDRAW_TYPE
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setWithdrawType(Byte withdrawType) {
        this.withdrawType = withdrawType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.CONTACT_TEL
     *
     * @return the value of AFC_WITHDRAW.CONTACT_TEL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getContactTel() {
        return contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.CONTACT_TEL
     *
     * @param contactTel the value for AFC_WITHDRAW.CONTACT_TEL
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setContactTel(String contactTel) {
        this.contactTel = contactTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.BANK_ACCOUNT_NO
     *
     * @return the value of AFC_WITHDRAW.BANK_ACCOUNT_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getBankAccountNo() {
        return bankAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.BANK_ACCOUNT_NO
     *
     * @param bankAccountNo the value for AFC_WITHDRAW.BANK_ACCOUNT_NO
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setBankAccountNo(String bankAccountNo) {
        this.bankAccountNo = bankAccountNo;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.BANK_ACCOUNT_NAME
     *
     * @return the value of AFC_WITHDRAW.BANK_ACCOUNT_NAME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getBankAccountName() {
        return bankAccountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.BANK_ACCOUNT_NAME
     *
     * @param bankAccountName the value for AFC_WITHDRAW.BANK_ACCOUNT_NAME
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setBankAccountName(String bankAccountName) {
        this.bankAccountName = bankAccountName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.OPEN_ACCOUNT_BANK
     *
     * @return the value of AFC_WITHDRAW.OPEN_ACCOUNT_BANK
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getOpenAccountBank() {
        return openAccountBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.OPEN_ACCOUNT_BANK
     *
     * @param openAccountBank the value for AFC_WITHDRAW.OPEN_ACCOUNT_BANK
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setOpenAccountBank(String openAccountBank) {
        this.openAccountBank = openAccountBank;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_WITHDRAW.CANCEL_REASON
     *
     * @return the value of AFC_WITHDRAW.CANCEL_REASON
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public String getCancelReason() {
        return cancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_WITHDRAW.CANCEL_REASON
     *
     * @param cancelReason the value for AFC_WITHDRAW.CANCEL_REASON
     *
     * @mbg.generated 2018-02-25 16:44:16
     */
    public void setCancelReason(String cancelReason) {
        this.cancelReason = cancelReason;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_WITHDRAW
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
        sb.append(", withdrawState=").append(withdrawState);
        sb.append(", tradeTitle=").append(tradeTitle);
        sb.append(", tradeDetail=").append(tradeDetail);
        sb.append(", amount=").append(amount);
        sb.append(", realAmount=").append(realAmount);
        sb.append(", seviceCharge=").append(seviceCharge);
        sb.append(", applicantId=").append(applicantId);
        sb.append(", applyTime=").append(applyTime);
        sb.append(", applicantMac=").append(applicantMac);
        sb.append(", applicantIp=").append(applicantIp);
        sb.append(", recieverId=").append(recieverId);
        sb.append(", recieverTime=").append(recieverTime);
        sb.append(", recieverMac=").append(recieverMac);
        sb.append(", recieverIp=").append(recieverIp);
        sb.append(", finisherId=").append(finisherId);
        sb.append(", finisherTime=").append(finisherTime);
        sb.append(", finisherMac=").append(finisherMac);
        sb.append(", finisherIp=").append(finisherIp);
        sb.append(", withdrawType=").append(withdrawType);
        sb.append(", contactTel=").append(contactTel);
        sb.append(", bankAccountNo=").append(bankAccountNo);
        sb.append(", bankAccountName=").append(bankAccountName);
        sb.append(", openAccountBank=").append(openAccountBank);
        sb.append(", cancelReason=").append(cancelReason);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_WITHDRAW
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
        AfcWithdrawMo other = (AfcWithdrawMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_WITHDRAW
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