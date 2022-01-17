package com.yrx.witmedPlatform.util;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * <b></b>
 *
 * @author Ydeane
 * @date 2022-01-12
 * @since
 */
public class ConnectionUtil {
	static {
		try {
			// 根据数据库连接驱动类名，创建连接驱动类对象
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * <b>根据数据库连接信息获得 Connection 对象</b>
	 * @param dbIP
	 * @param dbPort
	 * @param dbSchema
	 * @param dbName
	 * @param dbPassword
	 * @return
	 */
	public static Connection getConnection(String dbIP, String dbPort, String dbSchema,
	                                       String dbName, String dbPassword) throws Exception {
		// 创建 JDBC 连接信息
		String url = "jdbc:mysql://" + dbIP + ":" + dbPort + "/" + dbSchema + "?useUnicode=true&characterEncoding=UTF-8&serverTimezone=Asia/Shanghai&useSSL=false&allowPublicKeyRetrieval=true";
		String username = dbName;
		String password = dbPassword;
		// 创建连接对象
		Connection connection = DriverManager.getConnection(url, username, password);
		return connection;
	}
}
