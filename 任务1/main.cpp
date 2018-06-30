#include"Date.h"
int main()
{
	int year,month,day;
	cin>>year>>month>>day;
	Date date1;
	date1.display();
	cout<<endl;
	Date date2(year);
	date2.display();
	cout<<endl;
	Date date3(year,month);
	date3.display();
	cout<<endl;
	Date date4(year,month,day);
	date4.display();
	cout<<endl;
	date1.setdate();
	date1.display();
	cout<<endl;
	Date date5(year,month);
	date5.calendarprint();
	return 0;
}