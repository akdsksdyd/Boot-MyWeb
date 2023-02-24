package com.coding404.myweb.product.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.multipart.MultipartFile;

import com.coding404.myweb.command.CategoryVO;
import com.coding404.myweb.command.ProductUploadVO;
import com.coding404.myweb.command.ProductVO;
import com.coding404.myweb.util.Criteria;

public interface ProductService {

	public int regist(ProductVO vo, List<MultipartFile> list);
	
	public ArrayList<ProductVO> getList(String user_id, Criteria cri); //특정 회원만 조회
	
	public ProductVO getDetail(int prod_id);
	
	public int getTotal(String user_id, Criteria cri);
	
	//카테고리 대분류
	public List<CategoryVO> getCategory();
	
	//중분류 소분류 카테고리 요청
	public List<CategoryVO> getCategoryChild(CategoryVO vo);
	
	//이미지데이터 조회
	public List<ProductUploadVO> getProductImg(ProductVO vo);
	
}
