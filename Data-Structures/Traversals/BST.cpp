/*
 * BFS.cpp
 *
 *  Created on: 20-Apr-2019
 *      Author: kirtish
 */


#include<iostream>
#include<deque>
#include<vector>

std::vector<bool> check;
std::vector<std::vector<int>> graph;

void makeEdge(int x, int y){
    graph[y].push_back(x);
}

void bfs(int v){
    std::deque<int> que;

    que.push_back(v);
    check[v]=true;

    while(!que.empty()){
        int front=que.back();
        que.pop_front();

        std::cout<<v<<" " ; 

        for (auto i= graph[front].begin(); i != graph[front].end(); i++){
            if (!check[*i]) {
                que.push_back(*i);
                check[*i]=true;
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

    for (int i=0;i<no_edge;i++){
        if (!check[i]){
            bfs(i);
        }
    }

    
    return 0;
}
