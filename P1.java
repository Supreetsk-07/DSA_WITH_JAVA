class demo{
    int i, j;
    demo(int r ,int p){
        this.i = p;
        this.j = r;
        System.out.println("a+b: "  +(i+j));

    }

    demo() {
        System.out.println("it is a defoult");
    }
    int k, y;
    void dj(int k, int y){
        this.k= k;
        this.y= y;
      System.out.println(k+y);
    }

    


}

class P1{
    public static void main(String[] args) {
        demo d1 = new demo(1,2);
        d1.dj(8,7);
    }
}