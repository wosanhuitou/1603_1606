//��1603 20163637 ���庮
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
	public void showNews()                             //���������Ϣ
	{
		for(int i=0;i<a;i++)
		{
			System.out.println(b[i].getid()+"\t"+b[i].gettitle()+"\t"+b[i].getcontent()+"\t"+b[i].getauthor()+"\t"+b[i].getis());
		}
		show();
	}
	//���������Ϣ
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
	public void deleteNews(int newsid)           //ɾ������
	{
		a-=1;
		for(int i=newsid-1;i<a;i++)
		{
			b[i]=b[i+1];
			b[i].setid(b[i].getid()-1);
		}
		show();
	}
	public void updateNews(int newsid)              //�޸�����
	{
		boolean str1=false;
		boolean str2=true;
		if(b[newsid-1].getis())
			b[newsid-1].setis(str1);
		else
			b[newsid-1].setis(str2);
		show();
	}
	public void selectNews(int newsid)              //��ѯ�Լ����������Ϣ
	{
		System.out.println("��ѯ�ɹ�!");
		System.out.println("���ŵ���Ϣ����:");
		System.out.println("���\t����\t����\t����\t�Ƿ���Է���");
		System.out.println(newsid+"\t"+b[newsid-1].gettitle()+"\t"+b[newsid-1].getcontent()+"\t"+b[newsid-1].getauthor()+"\t"+b[newsid-1].getis());
		show();
	}
	public void show()                                 //������
	{
		System.out.println("1.��ʾ������Ϣ");
		System.out.println("2.����������Ϣ");
		System.out.println("3.ɾ��������Ϣ");
		System.out.println("4.�޸�������Ϣ");
		System.out.println("5.��ѯ������Ϣ");
		System.out.println("0.�˳�");
		System.out.println("��ѡ��:");
		int c=input.nextInt();
		switch(c)
		{
		case 1:
			showNews();
			break;
		case 2:
			a+=1;
			System.out.print("������Ҫ��ӵ����ŵı���:");
			String str1=input.next();
			System.out.print("����:");
			String str2=input.next();
			System.out.print("����:");
			String str3=input.next();
			boolean str4 = false;
			addNews(str1,str2,str3,str4);
			break;
		case 3:
			System.out.println("������Ҫɾ�������ŵı��:");
			int newsid=input.nextInt();
			deleteNews(newsid);
			break;
		case 4:
			System.out.println("������Ҫ�޸ĵ����ŵı��:");
			int m=input.nextInt();
			updateNews(m);
			break;
		case 5:
			System.out.println("������Ҫ��ѯ�����ű��:");
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
		System.out.println("ʯ��ׯ������ѧ�������ϵ���Ź���ϵͳ");
		System.out.println("*******************************");
		m.show();
	}

}
