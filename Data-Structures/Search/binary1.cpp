#include<iostream>
#include<cstdlib>

#define SIZE 6
using namespace std;

int main(){
	int arr[SIZE]={1,3,5,7,9,11};
	int input,start,mid,end;
	cout<<"Ha array aahe. aata bagha tumhi"<<endl;
	for (int i=0;i<SIZE;i++){	
		cout<<arr[i]<<"\t";	
	}
	cout<<"\nKai shodhayacha aahe"<<endl;
	cin>>input;
	start=0; 
   end=SIZE-1; 
  
	while(start <= end) {
			mid=(start+end)/2;
			   cout<<"inside while";
		if (arr[mid]==input)
		{
		 	cout<<"Element found at index - "<<mid+1<<endl;
			break;
		}
		else if (arr[mid]<input) {
			start=mid+1;
		}
		else{
		end = mid-1; 
		}
	}
}
