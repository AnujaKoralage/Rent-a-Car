package com.rac.config.consumer.configconsumer.controller;

import com.rac.config.consumer.configconsumer.modal.MemberProfileConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    MemberProfileConfiguration memberProfileConfiguration;

    @RequestMapping("/profile")
    public MemberProfileConfiguration getMemberProfileConfiguration() {
        return memberProfileConfiguration;
    }

}
