package inher.testoverride;
class override {
    protected void m1(int a,int b){
        System.out.println("super");
    }
}
class sub extends override {
    public void m1(){
        System.out.println("sub");
    }
}