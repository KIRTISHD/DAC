#include<iostream>
#include "ll.h"

using namespace std;

int main(){
	link s1;
	int choice;
	int no,pos;
	int loop=0;
	while (loop==0) {
		cout<<"Choice tak"<<endl;
		cout<<"1. Insert at beginning"<<endl;	
		cout<<"2. Insert at end"<<endl;	
		cout<<"3. Insert at custom pos"<<endl;
		cout<<"4. Delete at beginning"<<endl;	
		cout<<"5. Delete at end"<<endl;	
		cout<<"6. Delete at custom pos"<<endl;
		cout<<"10. Display"<<endl;
		cin>>choice;
		switch(choice) {
			case 1:
				cout<<"Number tak"<<endl;
				cin>>no;
				if(s1.insertAtBeg(no))
				{cout<<"lala"<<endl;}
				break;
			case 2:
				cout<<"Number tak"<<endl;
				cin>>no;
				if(s1.insertAtEnd(no))
				{}
				break;
			case 3:
				cout<<"Number tak"<<endl;
				cin>>no;
				cout<<"Position tak"<<endl;
				cin>>pos;
				if(s1.insertAtPos(no,pos))
				{}
				break;
			case 5:
				if(s1.deleteAtEnd())
				{
					cout<<"lala"<<endl;
				}
				break;
			case 4:
				if(s1.deleteAtBeg())
				{
					cout<<"lala"<<endl;
				}
				break;
			case 6:
				cout<<"Position tak"<<endl;
				cin>>pos;
				if(s1.deleteAtPos(pos))
				{}
				break;
			case 10:
				s1.display();
				break;
			default:	
				loop=1;
		}
	}
	return 0;
}
