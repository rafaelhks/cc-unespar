#define MESH_H
#include <vector>
using namespace std;

struct vertice{
    double x, y, z;
};
struct face{
    vector<int> vertices;
};

class Mesh
{
    public:
        Mesh();
        virtual ~Mesh();
        vertice centro;
        int nVertices;
        vector<vertice> vertices;
        vector<face> faces;
        void Scale(char op);
        void Rotate(char eixo, char op);
        void Centro();
};

