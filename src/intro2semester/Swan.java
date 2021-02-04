package intro2semester;

public class Swan extends Chair implements Turnable{
    private String material;

    public Swan(int nrOfLegs){
        super(nrOfLegs);
    }

    @Override
    public String turnTheChair(){
        return "I am now turning the chair";
    }
}
