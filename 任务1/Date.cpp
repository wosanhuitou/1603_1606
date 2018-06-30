#include "Date.h"


Date::Date(int a,int b,int c)
{
	year=a;
	month=b;
	day=c;
}
Date::~Date(void)
{
}
int Date::isleap()
{
	
	if((year%4==0)&&(year%100!=0))
		return 1;
	else if(year%400==0)
			return 1;
	     else  return 0;
	return 0;
}
int Date::check()
{
	if(Date::isleap()==1)
	{
		if((month>=1)&&(month<=12))
		{	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				if((day>=1)&&(day<=31))
					return 1;
				else return 0;
			};
			if(month==2)
			{	if((day>=1)&&(day<=29))
					return 1;
				else return 0;
			};
			if(month==4||month==6||month==9||month==11)
			{
				if((day>=1)&&(day<=30))
					return 1;
				else return 0;
			}
		}
		else return 0;
	}
	else 
		{if((month>=1)&&(month<=12))
		{	if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			{
				if((day>=1)&&(day<=31))
					return 1;
				else return 0;
			};
			if(month==2)
			{	if((day>=1)&&(day<=28))
					return 1;
				else return 0;
			};
			if(month==4||month==6||month==9||month==11)
			{
				if((day>=1)&&(day<=30))
					return 1;
				else return 0;
			}
		}
		else return 0;}
	
}
void Date::setdate()
{
	cin>>year>>month>>day;
}
void Date::display()
{
	if(Date::check()==1)
	{
		cout<<year<<"-"<<month<<"-"<<day<<",";
		if(Date::isleap()==1)
			cout<<"Leap year";
		else cout<<"Common year";
	}
	else cout<<year<<"-"<<month<<"-"<<day<<","<<"Error Date";
	

}
void Date::calendarprint()
{
	int a,i,days;                         //days自公元到本年的天数
	if(Date::isleap()==1)
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			a=31;
		else if(month==2)
				a=29;
			else a=30;
	}
	else 
	{
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
			a=31;
		else if(month==2)
				a=28;
			else a=30;
	}
	for(i=1;i<=33;i++)
	{
		cout<<"*";
	}
	cout<<endl;
	cout<<"Sun"<<"  "<<"Mon"<<"  "<<"Tue"<<"  "<<"Wed"<<"  "<<"Thu"<<"  "<<"Fri"<<"  "<<"Sta"<<endl;
	if(Date::isleap()==1)
	{
		int ndays=0;    //当年到当月的天数
		for(i=1;i<month;i++)
		{
			if(i==1||i==3||i==5||i==7||i==8||i==10||i==12)
				i=31;
			else if(i==2)
					i=29;
				else i=30;
			ndays=ndays+i;
		}
		ndays=ndays+1;
		days=(year-1)*365+(year-1)/4-(year-1)/100+(year-1)/400+ndays;
	}
	int b,c=1;                //b表示当月一号为星期几
	b=days%7;
	if(b=0)
	{
		cout<<c;
	}
	else 
	{	for(i=0;i<b;i++)
			{
				cout<<" "<<" "<<" "<<" "<<" ";
			}
		cout<<c;
	}
	for(i=b;i<6;i++)
	{
		cout<<"    "<<++c ;
	}
	cout<<endl;

	for(;;)
	{	for(i=0;i<=6;i++)
		{
			c=c+1;
			if(c>9)
			{
				cout<<c<<"   ";

			}
			else cout<<c<<"    ";
			if(c==a)
				break;
		}
		cout<<endl;
		if(c==a)
		{	break;
		}
	}
	for(i=0;i<33;i++)
	{
		cout<<"*";
	}
}