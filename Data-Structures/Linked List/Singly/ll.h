#ifndef xx
#define xx

using namespace std;

struct student {
	int rollno;
	struct student *next;
};

class link{
	private:
		struct student *head;
	public:
		link();
		bool insertAtBeg(int );
		bool insertAtEnd(int );
		bool insertAtPos(int ,int );
		void display();
		bool deleteAtBeg();
		bool deleteAtEnd();
		bool deleteAtPos(int );
};

#endif
