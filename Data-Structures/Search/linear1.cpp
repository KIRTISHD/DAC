#include<iostream>
#include<cstdlib>

using namespace std;

int main(){
	int arr[6]={3,2,6,1,9,8};
	int input;
	cout<<"Ha array aahe. aata bagha tumhi"<<endl;
	for (int i=0;i<6;i++){	
		cout<<arr[i]<<"\t";	
	}
	cout<<"\nKai shodhayacha aahe"<<endl;
	cin>>input;
	
	for (int i=0;i<6;i++){
		if (input==arr[i]) {cout<<"Element found at index - "<<i+1<<endl;exit(0);}
	}
	cout<<"Element Not found"<<endl;
}
