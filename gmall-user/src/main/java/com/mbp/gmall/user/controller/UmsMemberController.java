package com.mbp.gmall.user.controller;

import com.mbp.gmall.user.bean.UmsMember;
import com.mbp.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.xml.ws.RequestWrapper;
import java.util.List;

@Controller
public class UmsMemberController {


    @Autowired
    UmsMemberService umsMemberService;

    @RequestMapping("index")
    @ResponseBody
    public String index(){
        return "hello gmall";
    }

    @RequestMapping("getAllMember")
    @ResponseBody
    public List<UmsMember> getAllMember(){
        List<UmsMember> umsMember = umsMemberService.getAllMember();
        return umsMember;
    }



}
