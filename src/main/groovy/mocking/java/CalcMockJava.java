package mocking.java;

public class CalcMockJava {
    private AdderJava adder;
    private DividerJava divider;

    public CalcMockJava(AdderJava adder, DividerJava divider){
        this.adder=adder;
        this.divider=divider;
    }

    public int add(int first, int second){
        return adder.add(first,second);
    }

    public int divide(int first,int second){
        return divider.divide(first, second);
    }
}
