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
		// ����SQLite��JDBC

		try {
			Class.forName("org.sqlite.JDBC");
			// ����һ�����ݿ���zieckey.db�����ӣ���������ھ��ڵ�ǰĿ¼�´���֮
			Connection conn = DriverManager.getConnection("jdbc:sqlite:reason.db");
			Statement stat = conn.createStatement();

			stat.executeUpdate("create table r_tb_test(name varchar(20), salary int);");// ����һ��������

			stat.executeUpdate("insert into r_tb_test values('ZhangSan',8000);"); // ��������
			stat.executeUpdate("insert into r_tb_test values('LiSi',7800);");
			stat.executeUpdate("insert into r_tb_test values('WangWu',5800);");
			stat.executeUpdate("insert into r_tb_test values('ZhaoLiu',9100);");

			ResultSet rs = stat.executeQuery("select * from r_tb_test;"); // ��ѯ����

			while (rs.next()) { // ����ѯ�������ݴ�ӡ����
				System.out.print("name = " + rs.getString("name") + " "); // ������һ
				System.out.println("salary = " + rs.getString("salary")); // �����Զ�
			}

			rs.close();
			conn.close(); // �������ݿ������
			
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
