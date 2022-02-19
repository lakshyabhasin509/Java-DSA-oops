package inher;
public class superRectangle {
    int length;
    int breadth;
    int x=10;
    superRectangle(int length,int breadth)
    {
        this.length=length;
        this.breadth=breadth;

    }
    public static void main(String[] args) {
        childCuboid ob=new childCuboid(10,15,20);
        ob.display();
    }
}
