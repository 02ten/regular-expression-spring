package com.ten.expression.controller;

import com.ten.expression.service.RegularService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor
@RestController
public class ExpressionController {

    private final RegularService regularService;

    @GetMapping("expression")
    public ResponseEntity<String> useRegularService(){
        var status = regularService.useService();
        return ResponseEntity.ok(status);
    }
}
