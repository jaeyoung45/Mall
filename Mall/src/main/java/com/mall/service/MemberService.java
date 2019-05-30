package com.mall.service;

import com.mall.domain.MemberVO;

public interface MemberService {
	
	// 회원 가입
	public void signup(MemberVO vo) throws Exception;

}
