package com.employee.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.NativeWebRequest;
import java.util.Optional;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-12-13T15:49:26.825671600+02:00[Africa/Cairo]")
@Controller
@RequestMapping("${openapi.employeeCenterService.base-path:}")
public class V1alphaApiController implements V1alphaApi {

    private final NativeWebRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public V1alphaApiController(NativeWebRequest request) {
        this.request = request;
    }

    @Override
    public Optional<NativeWebRequest> getRequest() {
        return Optional.ofNullable(request);
    }

}
