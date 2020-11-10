package com.atguigu.springcloud.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.alibaba.fastjson.TypeReference;
import com.atguigu.springcloud.entities.EntryObj;
import com.atguigu.springcloud.entities.NParamAppSaveVO;
import com.atguigu.springcloud.entities.ParamTelnetVO;
import com.atguigu.springcloud.entities.coreVo.PlyApplicantVO;
import com.atguigu.springcloud.entities.coreVo.PlyBaseVO;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author rpq
 * @version 1.0
 * @date 2020/10/11 16:20
 */
@RestController
public class PaymentController {
    @Value("${server.port}")
    private String serverPort;

    @GetMapping(value = "/payment/nacos/{id}")
    public String getPatment(@PathVariable("id") String id){
        return "nacos registry, serverPort: "+ serverPort+"\t id"+id;

    }

    @PostMapping(value = "/test")
    public String test(@RequestBody ParamTelnetVO paramTelnetVO){
        List<NParamAppSaveVO> nParamAppSaveVOList=null;
        for (EntryObj entryObj : paramTelnetVO.getEntryObjList()) {
            if (entryObj.getKey().equals("nParamAppSaveVOList")){
               nParamAppSaveVOList = (List) entryObj.getValue();
            }
        }
        NParamAppSaveVO nParamAppSaveVO = JSONObject.parseObject(JSON.toJSONString(nParamAppSaveVOList.get(0)), new TypeReference<NParamAppSaveVO>(){});
        System.out.println("hello,springcloud");
        return "success";
    }
}
