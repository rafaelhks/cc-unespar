import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Rafael
 */
public class KMeans {
    
    private final int k; //Num. de centroides
    private final int[] srcImgData;
    private final List<Centroide> centroides;
    
    public KMeans(Image src, int nCentroides){
        this.k = nCentroides;
        this.centroides = new ArrayList();
        this.srcImgData = new int[]{src.height(), src.width(), src.type()};
        initCentroides(src);
    }
    
    public void execute(){
        System.out.print(".");
        int changes = 0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < centroides.get(i).GroupSize(); j++) {
                int menor = menorDist(centroides.get(i).Get(j));
                if(menor != i){
                    centroides.get(menor).Add(centroides.get(i).Get(j));
                    centroides.get(i).Remove(j);
                    changes++;
                }
            }
        }
        
        for (Centroide c: centroides) {
            c.calcMedia();
        }
        if (changes > 0) execute();
    }
    
    private int menorDist(Pixel p){
        int menor = 0;
        for (int i = 1; i < k; i++) {
            if(centroides.get(i).getDistancia(p.getRGB())
                <centroides.get(menor).getDistancia(p.getRGB())){
                menor = i;
            }
        }
        return menor;
    }
    
    public Image getResultImage(){
        Image res = new Image(srcImgData[0], srcImgData[1], srcImgData[2]);
        for(Centroide c: centroides){
            for (int i = 0; i < c.GroupSize(); i++) {
                Pixel p = c.Get(i);
                res.put(p.getH(), p.getW(), c.getRGB());
            }
        }
        return res;
    }
    
    public Image getByGroup(int nk){
        Image ctd = new Image(srcImgData[0], srcImgData[1], srcImgData[2]);
        ctd.FillWhite();
        
        for(Pixel p: centroides.get(nk).Group()){
            ctd.put(p.getH(), p.getW(), centroides.get(nk).getRGB());
        }
        return ctd;
    }
    
    private void initCentroides(Image src){
        Random random = new Random();

        for (int i = 0; i < this.k; i++) {
            double[] RGB = new double[3];
            RGB[0] = random.doubles(0,256).findAny().getAsDouble();
            RGB[1] = random.doubles(0,256).findAny().getAsDouble();
            RGB[2] = random.doubles(0,256).findAny().getAsDouble();
            
            this.centroides.add(new Centroide(RGB));
        }
        
        for (int h = 0; h < src.height(); h++) {
            for (int w = 0; w < src.width(); w++) {
                if(src.get(h, w)!=null){
                    centroides.get(menorDist(src.get(h, w))).Add(src.get(h, w));
                }
            }
        }
        
        for (Centroide c: centroides) {
            c.calcMedia();
        }
    }
}
