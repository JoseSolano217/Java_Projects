package com.example.deeprecorderrebirth.controller;

import com.example.deeprecorderrebirth.models.services.IEnterpriseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class EnterpriseController {

    @Autowired
    private IEnterpriseService enterpriseService;
}
