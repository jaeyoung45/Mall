package com.mall.persistence;

import com.mall.domain.MemberVO;

public interface MemberDAO {
	
	//회원 가입
	public void signup(MemberVO vo) throws Exception;

}
