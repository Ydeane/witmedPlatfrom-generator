package com.yrx.witmedPlatform.pojo.entity;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class Column implements Serializable {
	private static final long serialVersionUID = -3596743480939603411L;
	private String tableSchema;                        // 数据库名
	private String tableName;                          // 表名
	private String columnName;                         // 字段名
	private String dataType;                           // 数据类型
	private String columnComment;                      // 字段注释

	public String getTableSchema() {
		return tableSchema;
	}

	public void setTableSchema(String tableSchema) {
		this.tableSchema = tableSchema;
	}

	public String getTableName() {
		return tableName;
	}

	public void setTableName(String tableName) {
		this.tableName = tableName;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public String getDataType() {
		return dataType;
	}

	public void setDataType(String dataType) {
		this.dataType = dataType;
	}

	public String getColumnComment() {
		return columnComment;
	}

	public void setColumnComment(String columnComment) {
		this.columnComment = columnComment;
	}
}
