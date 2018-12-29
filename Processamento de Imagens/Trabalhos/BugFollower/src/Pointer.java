/**
 *
 * @author Rafael
 */
public class Pointer {
    
    private int dir, H, W;
    
    public Pointer(int initDir, int initH, int initW){
        this.dir = initDir;
        this.H = initH;
        this.W = initW;
    }
    
    public int getDir(){
        return this.dir;
    }
    
    public void rotateClockwise(){
        this.dir++;
        if(this.dir>3) this.dir=0;
    }
    
    public Pixel next(Image src){
        if(this.dir==0) return src.get(H, W+1);
        if(this.dir==1) return src.get(H+1, W);
        if(this.dir==2) return src.get(H, W-1);
        if(this.dir==3) return src.get(H-1, W);
        return null;
    }
    
    public Pixel atual(Image src){
        return src.get(H, W);
    }
    
    private void go(){
        if(this.dir==0) W++;
        if(this.dir==1) H++;
        if(this.dir==2) W--;
        if(this.dir==3) H--;
    }
    
    public void goRight(){
        //Senão
        this.dir++;
        if(this.dir>3) this.dir=0;
        this.go();
    }
    
    public void goLeft(){
        //Se regiao
        this.dir--;
        if(this.dir<0) this.dir=3;
        this.go();
    }
    
    public boolean decide(Image src, int H, int W){
        
        return false;
    }
}
