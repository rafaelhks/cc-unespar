#ifndef FACE_H
#define FACE_H
#include "Vertex3D.h"
#include<vector>

using namespace std;

class Face
{
    public:
        Face();
        virtual ~Face();
        void Add(int pos);
        void clearAll();
        int total();
        int get(int pos);

    private:
        vector<int> vertices;
        int nVertex;
};

#endif // FACE_H
