package rebue.afc.svr.feign;

import java.util.List;
import java.util.Map;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import rebue.afc.mo.AfcSettleTaskMo;
import rebue.afc.ro.AddSettleTasksRo;
import rebue.afc.to.AddSettleTasksTo;
import rebue.afc.to.GetCashBackTaskTo;
import rebue.sbs.feign.FeignConfig;

@FeignClient(name = "afc-svr", configuration = FeignConfig.class)
public interface AfcSettleTaskSvc {
    /**
     * 添加结算任务
     * 任务调度器会定时检查当前要执行的任务
     */
    @PostMapping("/settle/tasks")
    AddSettleTasksRo addSettleTasks(@RequestBody AddSettleTasksTo to);

    /**
     * 获取将要执行的结算任务列表
     */
    @GetMapping("/settle/task/shouldexecute")
    List<Long> getTaskIdsThatShouldExecute();

    /**
     * 执行结算任务
     * 
     * @param taskMo
     *            要执行的任务
     */
    @PostMapping("/settle/task/execute")
    void executeTask(@RequestParam("id") Long id);
    
    /**
     * 获取用户的待返现任务
     */
    @GetMapping("/settle/task/cashbacktask")
    List<AfcSettleTaskMo> getCashBackTask(@RequestParam("accountId") long accountId, @RequestParam("executestate") byte executestate,
    		 @RequestParam("tradtype") byte tradtype,@RequestParam("start") byte start,@RequestParam("limit") byte limit);
    
    
}