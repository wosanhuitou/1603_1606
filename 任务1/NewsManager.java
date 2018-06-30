//信1603 20163637 李洛寒
package test01;
import java.util.Scanner;
public class NewsManager 
{
	Scanner input=new Scanner(System.in);
	int a=1;
	News[] b=new News[10];
	{
		b[0]=new News(1,"ab","cd","li",true);
		for(int i=1;i<10;i++)
			b[i]=new News();
	}
	public void showNews()                             //输出新闻信息
	{
		for(int i=0;i<a;i++)
		{
			System.out.println(b[i].getid()+"\t"+b[i].gettitle()+"\t"+b[i].getcontent()+"\t"+b[i].getauthor()+"\t"+b[i].getis());
		}
		show();
	}
	//添加新闻信息
	public void addNews(String newstitle,String newscontent,String newsauthor,boolean isavailable)
	{
		isavailable=true;
		b[a-1].setid(a);
		b[a-1].settitle(newstitle);
		b[a-1].setcontent(newscontent);
		b[a-1].setauthor(newsauthor);
		b[a-1].setis(isavailable);
		show();
	}
	public void deleteNews(int newsid)           //删除新闻
	{
		a-=1;
		for(int i=newsid-1;i<a;i++)
		{
			b[i]=b[i+1];
			b[i].setid(b[i].getid()-1);
		}
		show();
	}
	public void updateNews(int newsid)              //修改新闻
	{
		boolean str1=false;
		boolean str2=true;
		if(b[newsid-1].getis())
			b[newsid-1].setis(str1);
		else
			b[newsid-1].setis(str2);
		show();
	}
	public void selectNews(int newsid)              //查询以及输出新闻信息
	{
		System.out.println("查询成功!");
		System.out.println("新闻的信息如下:");
		System.out.println("序号\t标题\t内容\t作者\t是否可以发表");
		System.out.println(newsid+"\t"+b[newsid-1].gettitle()+"\t"+b[newsid-1].getcontent()+"\t"+b[newsid-1].getauthor()+"\t"+b[newsid-1].getis());
		show();
	}
	public void show()                                 //主体框架
	{
		System.out.println("1.显示新闻信息");
		System.out.println("2.增加新闻信息");
		System.out.println("3.删除新闻信息");
		System.out.println("4.修改新闻信息");
		System.out.println("5.查询新闻信息");
		System.out.println("0.退出");
		System.out.println("请选择:");
		int c=input.nextInt();
		switch(c)
		{
		case 1:
			showNews();
			break;
		case 2:
			a+=1;
			System.out.print("请输入要添加的新闻的标题:");
			String str1=input.next();
			System.out.print("内容:");
			String str2=input.next();
			System.out.print("作者:");
			String str3=input.next();
			boolean str4 = false;
			addNews(str1,str2,str3,str4);
			break;
		case 3:
			System.out.println("请输入要删除的新闻的编号:");
			int newsid=input.nextInt();
			deleteNews(newsid);
			break;
		case 4:
			System.out.println("请输入要修改的新闻的编号:");
			int m=input.nextInt();
			updateNews(m);
			break;
		case 5:
			System.out.println("请输入要查询的新闻编号:");
			int n=input.nextInt();
			selectNews(n);
			break;
		case 0:
			System.exit(0);
		}
	}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		NewsManager m=new NewsManager();
		System.out.println("*******************************");
		System.out.println("石家庄铁道大学软件工程系新闻管理系统");
		System.out.println("*******************************");
		m.show();
	}

}
