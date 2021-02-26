package com.baixs.shardingjdbcdemo.service;


import com.baixs.shardingjdbcdemo.entity.Member;

public interface IMemberService {

    int insert(Member record);

    Member selectByPrimaryKey(Long memberId);

    int deleteByPrimaryKey(Long memberId);
}
