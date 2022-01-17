package com.yrx.witmedPlatform.dao.impl;


import com.mysql.cj.xdevapi.Table;
import com.yrx.witmedPlatform.dao.GeneratorDao;
import com.yrx.witmedPlatform.pojo.entity.Column;
import com.yrx.witmedPlatform.pojo.entity.Table;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
@Repository("generatorDao")
public class GeneratorDaoImpl implements GeneratorDao {
	/**
	 * <b>根据数据库名获得所有的数据表信息</b>
	 * @param connection
	 * @param dbSchema
	 * @return
	 * @throws Exception
	 */
	@Override
	public List<Table> findTableList(Connection connection, String dbSchema) throws Exception {
		// 设置需要执行的 SQL
		String sql = "select table_schema, table_name, table_comment from information_schema.tables where table_schema=?";
		// 创建 PreparedStatement 对象
		PreparedStatement statement = connection.prepareStatement(sql);
		// 向占位符传值
		statement.setString(1, dbSchema);
		// 进行执行，获得 ResultSet 对象
		ResultSet resultset = statement.executeQuery();
		List<Table> tableList = new ArrayList<Table>();
		// 解析结果集，获得数据
		while (resultset.next()) {
			Table table = new Table();
			table.setTableSchema(resultset.getString("table_schema"));
			table.setTableName(resultset.getString("table_name"));
			table.setTableComment(resultset.getString("table_comment"));
			tableList.add(table);
		}
		return tableList;
	}

	/**
	 * <b>根据数据库和表获得该表的所有字段信息</b>
	 * @param dbSchema
	 * @param tableName
	 * @param connection
	 * @return
	 */
	@Override
	public List<Column> findColumnListByTable(String dbSchema, String tableName, Connection connection) throws Exception {
		String sql = "select table_schema, table_name, column_name, data_type, column_comment from information_schema.columns where table_schema=? and table_name=? order by ordinal_position asc";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, dbSchema);
		statement.setString(2, tableName);
		ResultSet resultSet = statement.executeQuery();
		List<Column> columnList = new ArrayList<Column>();
		while (resultSet.next()) {
			Column column = new Column();
			column.setTableSchema(resultSet.getString("table_schema"));
			column.setTableName(resultSet.getString("table_name"));
			column.setColumnName(resultSet.getString("column_name"));
			column.setDataType(resultSet.getString("data_type"));
			column.setColumnComment(resultSet.getString("column_comment"));
			columnList.add(column);
		}
		return columnList;
	}
}
