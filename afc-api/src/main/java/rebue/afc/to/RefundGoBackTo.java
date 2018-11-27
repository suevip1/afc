package rebue.afc.to;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import lombok.Data;

/**
 * 错误支付，直接退款原路返回的传输对象（参数）
 */
@JsonInclude(Include.NON_NULL)
@Data
public class RefundGoBackTo {
    /**
     * 订单ID (实际是payOrderId)
     */
    private String orderId;
    /**
     * 退款的标题
     */
    private String tradeTitle;
    /**
     * 退款的详情
     */
    private String tradeDetail;
    /**
     * 操作人的IP地址
     */
    private String ip;
}
