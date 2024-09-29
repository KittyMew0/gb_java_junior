package geekbrains_course.java_junior.lesson4.seminar4;

import java.beans.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;

import com.sun.jdi.connect.spi.Connection;

//Настройте связь между вашим приложением и базой данных MySQL с использованием Hibernate. 
//Создайте несколько объектов Person и сохраните их в базу данных.

public class Main {

	public static void main(String[] args) {
		try (Connection con = DriverManager.getConnection(url, user, password)) { 
			Statement statement = con.createStatement(); 
			statement.execute("DROP SCHEMA `test` ;"); 
			statement.execute("CREATE SCHEMA `test` ;"); 
			statement.execute("CREATE TABLE `test`.`table` (\n" 
								+ " `id`INTNOTNULL,\n" 
								+ " `firstname`VARCHAR(45)NULL,\n" 
								+ " `lastname`VARCHAR(45)NULL,\n"
								+ " PRIMARYKEY(`id`));"); 
			statement.execute("INSERT INTO (`id`,`firstname`,`lastname`)\n" 
								+ "VALUES(1,'Иванов','Иван');"); 
			statement.execute("INSERT INTO `test`.`table` `test`.`table` (`id`,`firstname`,`lastname`)\n" 
								+ "VALUES(2,'Петров','Пётр');"); 
			
			ResultSet set = statement.executeQuery("SELECT * FROM `test`.`table`;"); 
			while (set.next()){ 
				System.out.println(set.getString(3) 
						+ " " + set.getString(2) 
						+ " " + set.getInt(1)); 
			} 
			
		} 
		
		catch (SQLException e) {
			throw newRuntimeException(e);
		}

	}

}
