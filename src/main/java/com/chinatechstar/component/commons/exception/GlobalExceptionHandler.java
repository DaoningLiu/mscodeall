package com.chinatechstar.component.commons.exception;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import com.chinatechstar.component.commons.result.ResultBuilder;

/**
 * 全局异常处理
 * 
 * @版权所有 广东国星科技有限公司 www.mscodecloud.com
 */
@ControllerAdvice
public class GlobalExceptionHandler {

	private static final Logger LOGGER = LoggerFactory.getLogger(ResultBuilder.class);

	/**
	 * 处理所有异常信息
	 * @param e 所有异常对象
	 * @return
	 */
	@ExceptionHandler(Exception.class)
	@ResponseBody
	public Map<String, Object> handleException(Exception e) {
		Map<String, Object> map = new HashMap<>();
		map.put("status", HttpStatus.INTERNAL_SERVER_ERROR.value());
		map.put("data", Collections.emptyMap());
		map.put("message", e.getMessage());
		if (LOGGER.isWarnEnabled()) {
			LOGGER.warn(e.toString());
		}
		return map;
	}

}
