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
 *   平台信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table AFC_PLATFORM
 *
 * @mbg.generated do_not_delete_during_merge 2018-05-04 10:12:37
 */
@ApiModel(value = "AfcPlatformMo", description = "平台信息")
@JsonInclude(Include.NON_NULL)
public class AfcPlatformMo implements Serializable {
    /**
     * Database Column Remarks:
     *   平台信息ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PLATFORM.ID
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    @ApiModelProperty(value = "平台信息ID")
    private Long id;

    /**
     * Database Column Remarks:
     *   余额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PLATFORM.BALANCE
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    @ApiModelProperty(value = "余额")
    private BigDecimal balance;

    /**
     * Database Column Remarks:
     *   修改时间
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column AFC_PLATFORM.MODIFIED_TIME
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    @ApiModelProperty(value = "修改时间")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd HH:mm:ss", timezone = "GMT+8")
    private Date modifiedTime;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PLATFORM.ID
     *
     * @return the value of AFC_PLATFORM.ID
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PLATFORM.ID
     *
     * @param id the value for AFC_PLATFORM.ID
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public void setId(Long id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PLATFORM.BALANCE
     *
     * @return the value of AFC_PLATFORM.BALANCE
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public BigDecimal getBalance() {
        return balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PLATFORM.BALANCE
     *
     * @param balance the value for AFC_PLATFORM.BALANCE
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column AFC_PLATFORM.MODIFIED_TIME
     *
     * @return the value of AFC_PLATFORM.MODIFIED_TIME
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public Date getModifiedTime() {
        return modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column AFC_PLATFORM.MODIFIED_TIME
     *
     * @param modifiedTime the value for AFC_PLATFORM.MODIFIED_TIME
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    public void setModifiedTime(Date modifiedTime) {
        this.modifiedTime = modifiedTime;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", balance=").append(balance);
        sb.append(", modifiedTime=").append(modifiedTime);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-04 10:12:37
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
        AfcPlatformMo other = (AfcPlatformMo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
        ;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table AFC_PLATFORM
     *
     * @mbg.generated 2018-05-04 10:12:37
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        return result;
    }
}