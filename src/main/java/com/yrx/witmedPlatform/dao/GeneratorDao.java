package com.yrx.witmedPlatform.dao;
import com.mysql.cj.xdevapi.Table;
import com.yrx.witmedPlatform.pojo.entity.Column;
import com.yrx.witmedPlatform.pojo.entity.Table;

import java.sql.Connection;
import java.util.List;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public interface GeneratorDao {
	/**
	 * <b>根据数据库名获得所有的数据表信息</b>
	 * @param connection
	 * @param dbSchema
	 * @return
	 * @throws Exception
	 */
	List<Table> findTableList(Connection connection, String dbSchema) throws Exception;

	/**
	 * <b>根据数据库和表获得该表的所有字段信息</b>
	 * @param dbSchema
	 * @param tableName
	 * @param connection
	 * @return
	 */
	List<Column> findColumnListByTable(String dbSchema, String tableName, Connection connection) throws Exception;
}
