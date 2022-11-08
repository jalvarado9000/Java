public class Accumulate {

    private double ACCRupee;
    private double ACCPound;
    private double ACCDollar;
    private double ACCEuro;
    private double ACCYen;


    //Setter  for all user money
    public void ACCsetPound(double p){ACCPound += p;}// counter de la cantidad de rupees insertado
    public void ACCsetRupee(double r){ACCRupee += r;}
    public void ACCsetEuro(double e){ACCEuro += e;}
    public void ACCsetYen(double y){ACCYen += y;}
    public void ACCsetDollar(double d){ACCDollar += d;}




    //Getters for all user money
    public double ACCgetDollar(){return ACCDollar;}
    public double ACCgetPound(){return ACCPound;}
    public double ACCgetEuro(){return ACCEuro;}
    public double ACCgetRupee(){return ACCRupee;}
    public double ACCgetYen(){return ACCYen;}





}
