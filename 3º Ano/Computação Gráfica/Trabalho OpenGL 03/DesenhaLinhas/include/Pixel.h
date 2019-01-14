#ifndef PIXEL_H
#define PIXEL_H


class Pixel
{
    public:
        Pixel(int x, int y);
        virtual ~Pixel();
        int getX();
        int getY();
        double getEuclideanDist(int x1, int y1);
    private:
        int x, y;
};

#endif // PIXEL_H
