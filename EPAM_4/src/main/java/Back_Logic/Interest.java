package Back_Logic;

public class Interest {
    private double interest = 0.0;
    public float calculateSimpleInterest(double principal,double rate,double time){
        interest = ( principal * rate * time ) / 100;
        return  (float)interest;
    }
    public float calculateCompoundInterest(double principal,double rate,double time){
        interest = principal *( Math.pow((1 + rate/100),time) - 1);
        return (float) interest;
    }

}
