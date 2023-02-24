package com.coding404.myweb.product.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.web.multipart.MultipartFile;

import com.coding404.myweb.command.CategoryVO;
import com.coding404.myweb.command.ProductUploadVO;
import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.util.Criteria;

@Mapper
public interface ProductMapper {
	
	public int regist(ProductVO vo);
	public int registFile(ProductUploadVO vo);
	
	//조회 : 특정 회원정보만 조회
	//매개변수로 전달되는 데이터가 2개 이상이라면 이름붙이기
	public ArrayList<ProductVO> getList(@Param("user_id") String user_id,
										@Param("cri") Criteria cri);
	
	public ProductVO getDetail(int prod_id);
	
	public int getTotal(@Param("user_id") String user_id, 
						@Param("cri") Criteria cri); //전체게시글 수
	
	//카테고리 대분류
	public List<CategoryVO> getCategory();
		
	//중분류 소분류 카테고리 요청
	public List<CategoryVO> getCategoryChild(CategoryVO vo);
	
	//이미지데이터 조회
	public List<ProductUploadVO> getProductImg(ProductVO vo);

}
