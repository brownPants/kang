package com.seungwoo.kang.springmall.mapper;

import org.apache.ibatis.annotations.Mapper;

import com.seungwoo.kang.springmall.vo.SampleFile;

@Mapper
public interface SampleFileMapper {

	// insert
	int insertSampleFile(SampleFile sampleFile);
	// delete
	int deleteSampleFile(int sampleNo);
	// select one
	SampleFile selectOneSampleFile(int sampleNo);
	
}
