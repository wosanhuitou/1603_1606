#pragma once
#include <iostream>
using namespace std;
class Date
{
private:
	int year;
	int month;
	int day;
public:
	Date(int a=1000,int b=1,int c=1);
	~Date(void);
	int isleap();
	int check();
	void setdate();
	void display();
	void calendarprint();
};

