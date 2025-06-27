public class Postgraduate extends Student{
    private String supervisor;
    private String thesisTitle;
    private String status;
    
    public Postgraduate(String name, String supervisor, String thesisTitle){
        super(name);
        this.supervisor = supervisor;
        this.thesisTitle = thesisTitle;
        this.status = "Full Time";
        calculateFees();
    }
    
    //mutator
    public void setStatus(String stat){
        this.status = stat;
    }
    
    public void calculateFees(){
        //equalsIgnoreCase - ignores if it is capital or common
        if(this.status.equalsIgnoreCase("Full Time")){
            super.setFees(2650.00);
        }
        if(this.status.equalsIgnoreCase("Part Time")){
            super.setFees(1325.00);
        }
    }
    
    public String toString(){
        String details = super.toString();
        details += "\nSUPERVISOR: " +
        this.supervisor +
        " THESIS TITILE: " + this.thesisTitle;
        return details;
    }
}