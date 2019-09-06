package com.mbp.gmall.user.service.impl;

import com.mbp.gmall.user.bean.UmsMember;
import com.mbp.gmall.user.mapper.UmsMemberMapper;
import com.mbp.gmall.user.service.UmsMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UmsMemberServiceImpl implements UmsMemberService {

    @Autowired
    UmsMemberMapper umsMemberMapper;

    @Override
    public List<UmsMember> getAllMember() {

        List<UmsMember> umsMemberList=  umsMemberMapper.selectAll();
        return umsMemberList;
    }
}
