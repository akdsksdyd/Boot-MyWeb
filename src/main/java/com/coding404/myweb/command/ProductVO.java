package com.coding404.myweb.command;

import java.time.LocalDateTime;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductVO {
	
	 /*
	    * @NotNull - null값만 허용하지 않는다(wrapper의 integet,Long, String 등등)
	    * @NotBlank - null값과 공백을 허용하지 않음(String에만 적용)
	    * @NotEmpty - null값을 허용하지 않음(Array,list 적용)
	    * @Pattern - 정규표현식에 맞는 문자열을 정의할 수 있음.
	    * 
	    * @Email - 이메일형식 검증 (공백은 통과)
	    * @Min - 최소값 검증
	    * @Max - 최대값 검증
	    * 
	    */
	
	private int prod_id;
	private LocalDateTime prod_regdate;

	@NotBlank(message = "공백일 수 없습니다")
	@Pattern(regexp = "[0-9]{4}-[0-9]{2}-[0-9]{2}")
	private String prod_enddate;
	private String prod_category; //카테고리
	private String category_nav; //카테고리 조인된 결과
	
	@NotBlank(message = "공백일 수 없습니다")
	private String prod_writer;
	@NotBlank(message = "공백일 수 없습니다")
	private String prod_name;

	@Min(value = 0, message = "0원 이상이 아닙니다")
	private int prod_price;
	private int prod_count;
	private int prod_discount;
	private String prod_purchase_yn;
	private String prod_content;
	private String prod_comment;

}
