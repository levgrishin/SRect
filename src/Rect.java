public class Rect {
    private int s; int w, h;
    Rect(int w, int h){
        this.w = w;
        this.h = h;
        s = w * h;
    }
    int getS(){
        return s;
    }
    int getW(){
        return w;
    }
    int getH(){
        return h;
    }

    public void setW(int w) {
        this.w = w;
    }

    public void setH(int h) {
        this.h = h;
    }
}
