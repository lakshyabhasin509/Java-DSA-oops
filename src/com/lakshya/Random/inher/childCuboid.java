package inher;
public class childCuboid extends superRectangle {
    int height;
    int x=20;
    childCuboid(int l,int b,int h){
    super(l,b);
    height=h;}
    void display(){
        System.out.println(super.x);
        System.err.println(x);
    }

}
