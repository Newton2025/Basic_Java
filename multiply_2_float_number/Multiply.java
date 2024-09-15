public class Multiply {
    private float num1;
    private float num2;
    private float mul;
    public void setA(float num1){
        this.num1=num1;
    }
    public void setB(float num2){
        this.num2=num2;
    }   
    public void doMultiply(){
        mul=num1*num2;
    }       
    public float getMul(){
        return mul;
    }
}
