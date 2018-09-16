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
        void Add(Vertex3D* vertex);
        void RemoveAt(int pos);
        void clearAll();
        Vertex3D* get(int pos);
        int total();

    private:
        vector<Vertex3D*> vertices;
        int nVertex;
};

#endif // FACE_H
