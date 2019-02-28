package com.mask.product.VO;

import java.io.Serializable;

import lombok.Data;

/**
 * HTTP请求返回的最外层对象
 * @author Mask
 *
 */
@Data
public class ResultVO<T> {	
	/**
	 * 错误码
	 */
	private Integer code;
	
	/**
	 * 提示信息
	 */
	private String msg;
	
	/**
	 * 具体内容
	 */
	private T data;
}
