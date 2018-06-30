//信1603 20163637 李洛寒
package test01;
import java.util.Scanner;
public class News 
{
	private int newsid;                                //定义五个私有变量
	private String newstitle;
	private String newscontent;
	private String newsauthor;
	private boolean isavailable;
	News(int id,String title,String content,String author,boolean is)      //赋值
	{
		newsid=id;
		newstitle=title;
		newscontent=content;
		newsauthor=author;	
		isavailable=is;
	}
	News()
	{
		
	}
	Scanner input=new Scanner(System.in);
	public void setid(int id)                           //对每个变量的读取和设置
	{
		newsid=id;
	}
	public int getid()
	{
		return newsid;
	}
	public void settitle(String title)
	{
		newstitle=title;
	}
	public String gettitle()
	{
		return newstitle;
	}
	public void setcontent(String content)
	{
		newscontent=content;
	}
	public String getcontent()
	{
		return newscontent;
	}
	public void setauthor(String author)
	{
		newsauthor=author;
	}
	public String getauthor()
	{
		return newsauthor;
	}
	public void setis(boolean is)
	{
		isavailable=is;
	}
	public boolean getis()
	{
		return isavailable;
	}
}
