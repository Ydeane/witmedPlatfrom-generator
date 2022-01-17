package com.yrx.witmedPlatform.pojo.entity;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class Table implements Serializable {
	private static final long serialVersionUID = 7232951108758027875L;
	private String tableSchema;                        // 数据库名
	private String tableName;                          // 表名
	private String tableComment;                       // 表注释

	public Table() {}

	public Table(String tableSchema, String tableName, String tableComment) {
		this.tableSchema = tableSchema;
		this.tableName = tableName;
		this.tableComment = tableComment;
	}

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

	public String getTableComment() {
		return tableComment;
	}

	public void setTableComment(String tableComment) {
		this.tableComment = tableComment;
	}
}
