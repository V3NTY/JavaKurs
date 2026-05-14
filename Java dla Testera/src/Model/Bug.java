public class Bug {

    String description;
    String reporterEmail;
    int priority;
    boolean isOpen = true;

    Bug(String description, String reporterEmail, int priority, boolean isOpen) {
        this.description = description;
        this.reporterEmail = reporterEmail;
        this.priority = priority;
        this.isOpen = isOpen;
    }

    void showBugInfo(){
        System.out.println("Bug description:"+" "+ description+" email:"+reporterEmail+" priority:"+priority+
                " status:"+isOpen);
    }
    void showReporterEmail(){
        System.out.println(reporterEmail);
    }
    int getPriority(){
        return priority;
    }
    void showStatus(){
        System.out.println(isOpen);
    }

}
