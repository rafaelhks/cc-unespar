#ifndef PIXEL_H
#define PIXEL_H


class Pixel
{
    public:
        Pixel();
        Pixel(double x, double y);
        virtual ~Pixel();
        double getX();
        double getY();
        void setX(double x);
        void setY(double y);
        double getEuclideanDist(double x1, double y1);
    private:
        double x, y;
};

#endif // PIXEL_H
