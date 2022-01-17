package com.yrx.witmedPlatform.service;


import com.yrx.witmedPlatform.pojo.vo.GeneratorVO;

import java.sql.Connection;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public interface GeneratorService {
	/**
	 * <b>根据连接对象生成代码</b>
	 * @param generatorVO
	 * @param connection
	 * @return
	 * @throws Exception
	 */
	boolean generateCode(GeneratorVO generatorVO, Connection connection) throws Exception;
}
