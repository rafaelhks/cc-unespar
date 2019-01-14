#include "Face.h"

Face::Face(){
    this->nVertex = 0;
}

Face::~Face(){}

void Face::Add(int pos){
    this->vertices.push_back(pos);
    this->nVertex++;
}

void Face::clearAll(){
    this->vertices.clear();
}

int Face::total(){
    return this->vertices.size();
}

int Face::get(int pos){
    return this->vertices.at(pos);
}
