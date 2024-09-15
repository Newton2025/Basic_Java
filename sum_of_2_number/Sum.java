public class Sum {
    private int a;
    private int b;
    private int sum;

    public void setA(int a){
        this.a = a;
    }

    public void setB(int b){
        this.b = b;
    }

    public void doSum(){
        sum = a + b;
    }

    public int getSum(){
        return sum;
    }
}
