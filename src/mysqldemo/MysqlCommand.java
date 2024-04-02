package mysqldemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MysqlCommand 
{
	public static void main(String[] args) throws SQLException
	{
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Employeeportal","root","root");
		Statement s=con.createStatement();
		ResultSet rs=s.executeQuery("select * from credentials where scenario ='rewardscard'");
		
		while(rs.next()){
			
			System.setProperty("webdriver.chrome.driver","C://chromed//chromedriver.exe");
			WebDriver driver=new ChromeDriver();
			driver.get("https://login.salesforce.com/?locale=in");
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys(rs.getString("username"));
		
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(rs.getString("password"));
		driver.findElement(By.xpath("//input[@id='Login']")).click();
	
		
	}
	}
}
