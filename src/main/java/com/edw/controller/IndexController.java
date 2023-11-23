package com.edw.controller;

import com.edw.service.ExternalCallService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/**
 * <pre>
 *     com.edw.controller.IndexController
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Nov 2023 17:24
 */
@RestController
public class IndexController {

    private ExternalCallService externalCallService;

    @Autowired
    public IndexController(ExternalCallService externalCallService) {
        this.externalCallService = externalCallService;
    }

    @GetMapping("/")
    public ResponseEntity getIndex() {
        return ResponseEntity
                .ok()
                .body(externalCallService.getExternalContent().getBody());
    }

}
