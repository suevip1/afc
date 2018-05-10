package rebue.afc.svr.feign;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import rebue.afc.mo.VpayTradeTaskMo;
import rebue.sbs.feign.FeignConfig;

@FeignClient(name = "afc-svr", configuration = FeignConfig.class)
public interface VpayTradeTaskSvc {
    /**
     * 获取将要执行的任务列表
     */
    @GetMapping("/task/shouldexecute")
    List<VpayTradeTaskMo> getTasksThatShouldExecute();

    /**
     * 执行任务
     * 
     * @param taskMo
     *            要执行的任务
     */
    @PostMapping("/task/execute")
    void executeTask(@RequestBody VpayTradeTaskMo taskMo);

}