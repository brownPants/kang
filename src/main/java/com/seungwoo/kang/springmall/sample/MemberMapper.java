package com.seungwoo.kang.springmall.sample;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {
	int selectCountMember();
}
