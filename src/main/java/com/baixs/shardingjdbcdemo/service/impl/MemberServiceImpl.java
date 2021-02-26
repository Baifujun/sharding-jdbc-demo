package com.baixs.shardingjdbcdemo.service.impl;

import com.baixs.shardingjdbcdemo.entity.Member;
import com.baixs.shardingjdbcdemo.mapper.MemberMapper;
import com.baixs.shardingjdbcdemo.service.IMemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberServiceImpl implements IMemberService {

    @Autowired private MemberMapper memberMapper;

    @Override
    public int insert(Member record) {
        return memberMapper.insertSelective(record);
    }

    @Override
    public Member selectByPrimaryKey(Long memberId) {
        return memberMapper.selectByPrimaryKey(memberId);
    }

    @Override
    public int deleteByPrimaryKey(Long memberId) {
        return memberMapper.deleteByPrimaryKey(memberId);
    }
}
