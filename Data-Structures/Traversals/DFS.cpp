/*
 * DFS.cpp
 *
 *  Created on: 20-Apr-2019
 *      Author: kirtish
 */




#include<iostream>
#include<stack>
#include<vector>

std::vector<bool> check;
std::vector<std::vector<int>> graph;


void makeEdge(int x, int y){
    graph[x].push_back(y);
}

void dfs(int v){
	std::stack<int> st;

	st.push(v);
	check[v]=true;

	while(!st.empty()){
		int top= st.top();
		st.pop();
       // check[*i]=true;

		std::cout<<top << " ";

		 for (auto i= graph[top].begin(); i != graph[top].end(); i++){
		            if (!check[*i]) {
		                st.push(*i);
		                check[*i]=true;
		                break;
		            }
		        }
	}

}

int main(){

    int no_edge,no_vert;
    std::cout<<"Enter the number of vertices you want"<<std::endl;
    std::cin>>no_vert;
    std::cout<<"Enter the number of edges you want"<<std::endl;
    std::cin>>no_edge;

    check.assign(no_vert,false);
    graph.assign(no_vert, std::vector<int>());

    int x,y;
    std::cout<<"Now enter edges between vertices"<<std::endl;
    for (int i=0; i<no_edge;i++){
        std::cin>>x>>y;
        makeEdge(x,y);
    }
    /*makeEdge(0,1);
    makeEdge(0,2);
    makeEdge(1,3);
    makeEdge(2,3);
    makeEdge(3,4);*/

    for (int i=0;i<no_edge;i++){
        if (!check[i]){
            dfs(i);
        }
    }


    return 0;
}

