package rebue.afc.ro;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import rebue.afc.dic.ChargeResultDic;

/**
 * 充值的返回结果
 */
@ApiModel(value = "充值的结果", description = "充值的返回结果")
@JsonInclude(Include.NON_NULL)
public class ChargeRo {
    @ApiModelProperty(value = "充值返回结果的代码", example = "1", required = true)
    private ChargeResultDic result;

    public ChargeResultDic getResult() {
        return result;
    }

    public void setResult(ChargeResultDic result) {
        this.result = result;
    }

    @Override
    public String toString() {
        return "ChargeRo [result=" + result + "]";
    }

}
