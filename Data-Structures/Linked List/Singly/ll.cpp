#include<iostream>
#include "ll.h"

using namespace std;

link::link(){
	head=NULL;
}

void link::display(){
	struct student *t1;
	cout<<"--------------"<<endl;
	if (head==NULL){
		cout<<"Khali hai"<<endl;	
		return;
	}
	else{
		t1=head;
		while(t1!=NULL){
			cout<<t1->rollno<<"\t";
			t1=t1->next;		
		}	
	cout<<"\n--------------"<<endl;
		cout<<endl;
	}
}

bool link::insertAtBeg(int element) {
	struct student *t1; 
    	t1= new student;
	t1->rollno=element;
	t1->next=NULL;
	if (head==NULL){
		head=t1;
	}
	else {
		t1->next=head;
		head=t1;
	}display();
}

bool link::insertAtEnd(int element) {
	struct student *t1,*t2;
	t1 = new student;
	t2 = new student;
	if (head==NULL){
		insertAtBeg(element);
	}
	t1->rollno=element;
	t1->next=NULL;
	
	t2=head;
	while(t2->next != NULL){
		t2=t1->next;
	}
	t2->next=t1;
	display();
}

bool link::insertAtPos(int element,int pos) {
	struct student *t1,*t2;
	t1 = new student;
	t2 = new student;
	t2=head;
	if (head==NULL){
		insertAtBeg(element);
	}
	t1->rollno=element;
	t1->next=NULL;
	int cur_pos=1;
	if (cur_pos == pos) {
		insertAtBeg(element);
	}
	else {
		while(++cur_pos < pos) {
			t2=t2->next;
		}
		t1->next=t2->next;
		t2->next=t1;
	}
	display();
}

bool link::deleteAtEnd() {
	struct student *t1,*t2;
	t1 = new student;
	t2 = new student;
	t1=head;
	while(t1->next->next != NULL) {
		t1=t1->next;
		t2=t1->next;
	}
	t1->next=NULL;
	delete t2;
	display();
	
}

bool link::deleteAtBeg() {
	struct student *t1,*t2;
	t1 = new student;
	t2 = new student;
	t1=head;
	if (head==NULL) {
		cout<<"Empty list hai Yaro"<<endl;	
	}
	t2=head;
	t1=head->next;
	head=t1;
	delete t2;
	display();
}

bool link::deleteAtPos(int pos) {
	struct student *t1,*t2;
	t1 = new student;
	t2 = new student;
	t1=t2=head;
	if (head==NULL){
		cout<<"LIST KHALI HAI"<<endl;;
	}
	int cur_pos=1;
	if (cur_pos == pos) {
		deleteAtBeg();
	}
	else {
		while(++cur_pos <= pos) {
			t1=t2;
			t2=t2->next;
		}
		t1->next=t2->next;
		delete t2;
	}
	display();
}
