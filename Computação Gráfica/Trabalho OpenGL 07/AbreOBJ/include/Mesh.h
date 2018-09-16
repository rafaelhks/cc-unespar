#define MESH_H
#include <vector>
#include "Face.h"
using namespace std;

class Mesh
{
    public:
        Mesh();
        virtual ~Mesh();
        void Scale(char op);
        void Rotate(char eixo, char op);
        void Centro();
        void addFace(Face* face);
        Face* getFace(int pos);
        void setFaces(vector<Face*> faces);
        int faceTotal();

    private:
        int nVertices;
        int nFaces;
        Vertex3D* centro;
        vector<Face*> faces;
};

