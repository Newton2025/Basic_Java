public class SumRunner{
    public static void main(String[] args){
        Sum sum = new Sum();
        sum.setA(10);
        sum.setB(20);
        sum.doSum();
        System.out.println("Sum is: " + sum.getSum());
    }
}