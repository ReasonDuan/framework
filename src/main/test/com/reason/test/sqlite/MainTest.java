package com.reason.test.sqlite;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * 
 * @author Reason
 *
 */
public class MainTest {

	public static void main(String[] args) {
		// 连接SQLite的JDBC

		try {
			Class.forName("org.sqlite.JDBC");
			// 建立一个数据库名zieckey.db的连接，如果不存在就在当前目录下创建之
			Connection conn = DriverManager.getConnection("jdbc:sqlite:reason.db");
			Statement stat = conn.createStatement();

			stat.executeUpdate("create table r_tb_test(name varchar(20), salary int);");// 创建一个表，两列

			stat.executeUpdate("insert into r_tb_test values('ZhangSan',8000);"); // 插入数据
			stat.executeUpdate("insert into r_tb_test values('LiSi',7800);");
			stat.executeUpdate("insert into r_tb_test values('WangWu',5800);");
			stat.executeUpdate("insert into r_tb_test values('ZhaoLiu',9100);");

			ResultSet rs = stat.executeQuery("select * from r_tb_test;"); // 查询数据

			while (rs.next()) { // 将查询到的数据打印出来
				System.out.print("name = " + rs.getString("name") + " "); // 列属性一
				System.out.println("salary = " + rs.getString("salary")); // 列属性二
			}

			rs.close();
			conn.close(); // 结束数据库的连接
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
