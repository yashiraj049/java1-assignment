//Question 2:-Create 3 sub class of bank SBI,BOI,ICICI all 4 should have method called getDetails which provide there specific
// details like rateofinterest etc,print details of every banks.



public class Second{
    public static void main(String[] args) {
        Bank sbi = new SBI("State Bank of India", 7.5);
        Bank boi = new BOI("Bank of India", 7.2, "Star Loan Scheme");
        Bank icici = new ICICI("ICICI Bank", 7.8, "Instant Credit Card Approval");

        System.out.println("SBI Details:");
        sbi.getDetails();
        System.out.println();

        System.out.println("BOI Details:");
        boi.getDetails();
        System.out.println();

        System.out.println("ICICI Details:");
        icici.getDetails();
    }

}

class Bank {
    private String name;

    public Bank(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void getDetails() {}
}


class SBI extends Bank {
    private double rateOfInterest;

    public SBI(String name, double rateOfInterest) {
        super(name);
        this.rateOfInterest = rateOfInterest;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: " + super.getName());
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
    }
}

class BOI extends Bank {
    private double rateOfInterest;
    private String loanScheme;

    public BOI(String name, double rateOfInterest, String loanScheme) {
        super(name);
        this.rateOfInterest = rateOfInterest;
        this.loanScheme = loanScheme;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: " + super.getName());
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Loan Scheme: " + loanScheme);
    }
}


class ICICI extends Bank {
    private double rateOfInterest;
    private String creditCardOffer;

    public ICICI(String name, double rateOfInterest, String creditCardOffer) {
        super(name);
        this.rateOfInterest = rateOfInterest;
        this.creditCardOffer = creditCardOffer;
    }

    @Override
    public void getDetails() {
        System.out.println("Bank Name: " + super.getName());
        System.out.println("Rate of Interest: " + rateOfInterest + "%");
        System.out.println("Credit Card Offer: " + creditCardOffer);
    }
}



