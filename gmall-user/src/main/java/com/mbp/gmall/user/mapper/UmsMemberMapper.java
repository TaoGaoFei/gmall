package com.mbp.gmall.user.mapper;

import com.mbp.gmall.user.bean.UmsMember;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;
/*继承通用Mapper*/
public interface UmsMemberMapper extends Mapper<UmsMember> {

    List<UmsMember> selectAllMember();

}
