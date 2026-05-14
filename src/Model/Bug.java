package Model;

public class Bug {

    private String description;
    private String reporterEmail;
    private int priority;
    private boolean isOpen = true;

    public Bug(String description, String reporterEmail, int priority, boolean isOpen) {
        this.description = description;
        this.reporterEmail = reporterEmail;
        this.priority = priority;
        this.isOpen = isOpen;
    }

    //GETTERS & SETTERS

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        if (description.length()<10) {
            System.out.println("Description is too short");
        }else {
            this.description = description;
        }
    }

    public String getReporterEmail() {
        return reporterEmail;
    }

    public void setReporterEmail(String reporterEmail) {
        if (reporterEmail.contains("@")) {
            this.reporterEmail = reporterEmail;
        } else {
            System.out.println("Email is invalid");
        }

    }

    public void setPriority(int priority) {
        if (priority >=1 && priority <=5) {
            this.priority = priority;
        }else {
            System.out.println("Priority is invalid");
        }
        };


    public boolean isOpen() {
        return isOpen;
    }

    public void setOpen(boolean open) {
        isOpen = open;
    }

    public void showBugInfo(){
        System.out.println("Model.Bug description:"+" "+ description+" email:"+reporterEmail+" priority:"+priority+
                " status:"+isOpen);
    }
    public void showReporterEmail(){
        System.out.println(reporterEmail);
    }
    public int getPriority(){
        return priority;
    }
   public void showStatus(){
        System.out.println(isOpen);
    }

}
