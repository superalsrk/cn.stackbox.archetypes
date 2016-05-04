package ${package}.controller;

import ${package}.common.Manifest;
import ${package}.common.ResultModel;
import com.alibaba.fastjson.JSONObject;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CommonController {

    @RequestMapping(value = "/")
    public Object home() {
        return new Manifest();
    }

    /**
     * 测试接口
     * @param params
     * @return
     */
    @RequestMapping(value = "/testauth")
    @PreAuthorize("hasRole('TEST')")
    public ResultModel testAuth(@RequestBody JSONObject params) {
        return ResultModel.SUCCESS(params);
    }

}
