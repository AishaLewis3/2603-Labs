public class Undergraduate extends Student{
    private String minor;
    private String major;
    private int credits;
    
    //no args constructor
    public Undergraduate(){
        
    }
    
    //Accessors
    public String getMinor(){
        return this.minor;
    }
    
    public String getMajor(){
        return this.major;
    }
    
    public int getCredits(){
        return this.credits;
    }
    
    //Mutator
    public void setMinor(String minor){
        this.minor = minor;
    }
    
    public void setMajor(String major){
        this.major = major;
    }
    
    public void setCredits(int credits){
        this.credits = credits;
    }
    
    public void calculateFees(){
        double newFees = this.credits * 200.0;
        super.setFees(newFees);
    }
    
    public String toString(){
        String details = super.toString(); //called the parent class(suoer) toString
        details += "\n Undergraduate " + //Appending:
        "MAJOR: " + getMajor() +
        " MINOR: " + getMinor() +
        " CREDITS: " + getCredits();
        return details;
    }
}