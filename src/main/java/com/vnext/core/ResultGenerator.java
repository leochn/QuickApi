package com.vnext.core;

/**
 * 响应结果生成工具
 */
public class ResultGenerator {
	private static final String DEFAULT_SUCCESS_MESSAGE = "SUCCESS";
	private static final String DEFAULT_NOT_FOUND_MESSAGE = "NOT_FOUND";
	private static final String DEFAULT_BAD_REQUEST_MESSAGE = "BAD_REQUEST";

	public static Result genSuccessResult() {
		return new Result().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE);
	}

/*	public static Result genSuccessResult(Object data) {
		return new Result().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE).setData(data);
	}*/
	
	public static Result genSuccessResult(long total,Object data) {
		return new Result().setCode(ResultCode.SUCCESS).setMessage(DEFAULT_SUCCESS_MESSAGE).setTotal(total).setData(data);
	}

	public static Result genFailResult() {
		return new Result().setCode(ResultCode.FAIL).setMessage(DEFAULT_BAD_REQUEST_MESSAGE);
	}
	
	public static Result genFailResult(String message) {
		return new Result().setCode(ResultCode.FAIL).setMessage(message);
	}

	public static Result genNotFoundResult() {
		return new Result().setCode(ResultCode.NOT_FOUND).setMessage(DEFAULT_NOT_FOUND_MESSAGE);
	}
}
