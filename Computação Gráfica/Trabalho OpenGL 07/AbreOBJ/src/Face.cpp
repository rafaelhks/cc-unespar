#include "Face.h"

Face::Face(){
    this->nVertex = 0;
}

Face::~Face(){}

void Face::Add(Vertex3D* v){
    this->vertices.push_back(v);
    this->nVertex++;
}

void Face::RemoveAt(int pos){
    this->vertices.erase(this->vertices.begin()+pos);
}

void Face::clearAll(){
    this->vertices.clear();
}

int Face::total(){
    return this->vertices.size();
}

Vertex3D* Face::get(int pos){
    return this->vertices.at(pos);
}
