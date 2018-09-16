#ifndef POINT3_H
#define POINT3_H


class Point3
{
    public:
        Point3();
        virtual ~Point3();
        void Set(Point3 aux);
        void Set(double X, double Y, double Z);
        double x,y,z;
};

#endif // POINT3_H
