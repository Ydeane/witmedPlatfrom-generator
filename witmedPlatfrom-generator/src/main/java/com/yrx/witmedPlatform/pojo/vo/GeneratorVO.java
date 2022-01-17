package com.yrx.witmedPlatform.pojo.vo;

import java.io.Serializable;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class GeneratorVO implements Serializable {
	private static final long serialVersionUID = -7570257351495836619L;
	private String dbIP;                        // 数据库连接 IP 地址
	private String dbPort;                      // 数据库连接端口号
	private String dbSchema;                    // 数据库名
	private String dbName;                      // 数据库连接用户名
	private String dbPassword;                  // 数据库连接密码

	public String getDbIP() {
		return dbIP;
	}

	public void setDbIP(String dbIP) {
		this.dbIP = dbIP;
	}

	public String getDbPort() {
		return dbPort;
	}

	public void setDbPort(String dbPort) {
		this.dbPort = dbPort;
	}

	public String getDbSchema() {
		return dbSchema;
	}

	public void setDbSchema(String dbSchema) {
		this.dbSchema = dbSchema;
	}

	public String getDbName() {
		return dbName;
	}

	public void setDbName(String dbName) {
		this.dbName = dbName;
	}

	public String getDbPassword() {
		return dbPassword;
	}

	public void setDbPassword(String dbPassword) {
		this.dbPassword = dbPassword;
	}
}
