package com.service.template.controller;

import com.service.controllers.api.SummaryApi;
import com.service.model.rest.RestSummary;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class SummaryController implements SummaryApi {


    @Override
    public ResponseEntity<RestSummary> test() {
        return null;
    }
}
