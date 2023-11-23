package com.edw.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * <pre>
 *     com.edw.service.ExternalCallService
 * </pre>
 *
 * @author Muhammad Edwin < edwin at redhat dot com >
 * 23 Nov 2023 17:28
 */
@Service
public class ExternalCallService {

    private RestTemplate restTemplate;

    @Value("${endpoint}")
    private String endpoint;

    @Autowired
    public ExternalCallService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public ResponseEntity getExternalContent() {
        return restTemplate.getForEntity(endpoint, String.class);
    }
}
