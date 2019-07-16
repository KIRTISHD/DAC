#include<iostream>

using namespace std;

int arr7[6]={3,2,6,1,9,8};	

void heapify(int arr[], int size) {
	
}

void mergeArray(int arr[], int size){

}

void printArray(int arr[], int size){
	cout<<endl;
	for (int i=0;i<size;i++){	
		cout<<arr[i]<<"\t";	
	}
	cout<<endl;
}

void selectionsort(int arr[], int size){
	cout<<"\nSELECTION SORT IS"<<endl;
	int least,pos,temp;
	for (int i=0;i<size;i++){
		least=arr[i];
		pos=i;
		for (int j=i;j<size;j++){
			if (least>arr[j]){
				pos=j;		
			}
		}
		temp=arr[pos];
		arr[pos]=arr[i];
		arr[i]=temp;
	}
}

void bubblesort(int arr[], int size){
	cout<<"\nBUBBLE SORT IS"<<endl;
	int least,pos,temp;
	for (int i=0;i<size;i++){
		for (int j=0;j<size-i-1;j++){
			if (arr[j+1]<arr[j]) {
				temp=arr[j+1];
				arr[j+1]=arr[j];
				arr[j]=temp;
			}
			
		}
	}
}

void insertionsort(int arr[], int size){
	cout<<"\nINSERTION SORT IS"<<endl;
	int least,pos,temp,j;
	for (int i=1;i<size;i++){
		least=arr[i];
		j=i-1;
		while (j>=0 && arr[j]>least) {
			arr[j+1]=arr[j]; 
			j--;
		}
		arr[j+1]=least;
	}
}

void quicksort(int l, int r, int c){
}

int main(){

	int arr[6]={3,2,6,1,9,8};	
	int arr1[6];
	int arr2[6];
	int arr3[6];
	int arr4[6];
	int size=6;
	for (int i=0;i<size;i++) {
		arr4[i]=arr1[i]=arr2[i]=arr3[i]=arr[i];	
	}	
	cout<<"START"<<endl;
	printArray(arr,size);

	selectionsort(arr,size);
	printArray(arr,size);
	bubblesort(arr1,size);
	printArray(arr1,size);
	insertionsort(arr2,size);
	printArray(arr2,size);

	cout<<"select pivot"<<endl;
	int x; cout<<x;
	quicksort(arr7[x-1],arr7[x+1]);
	printArray(arr7,size);

	//heapsort(arr3,size);
	//printArray(arr3,size);
	cout<<endl;
	return 0;

}
