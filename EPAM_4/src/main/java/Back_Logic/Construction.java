package Back_Logic;

public class Construction {
    private int standard;
    public void setStandard(int choice){
        switch (choice){
            case(1): standard = 1200;
                break;
            case(2): standard = 1500;
                break;
            case(3): standard = 1800;
                break;
            case(4): standard = 2500;
                break;
            default:
                standard = 0;
        }
    }

    public float compute(int totalArea,int standard){
        float cost = 0;
        setStandard(standard);
        System.out.println("Standard is " + this.standard);
        cost = totalArea * this.standard;
        return cost;
    }

}
