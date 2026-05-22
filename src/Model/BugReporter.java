package Model;

public class BugReporter {

    private String firstName;
    private String lastName;
    private String reporterEmail;
    
    public BugReporter(String firstName, String lastName, String reporterEmail) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.reporterEmail = reporterEmail;
    }

    // GETTERS & SETTERS


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
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

    // OVERRIDES

    @Override
    public String toString() {
        return "BugReporter [firstName=" + firstName + ", lastName=" + lastName + ", reporterEmail=" + reporterEmail
                + "]";
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((firstName == null) ? 0 : firstName.hashCode());
        result = prime * result + ((lastName == null) ? 0 : lastName.hashCode());
        result = prime * result + ((reporterEmail == null) ? 0 : reporterEmail.hashCode());
        return result;
    }


    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        BugReporter other = (BugReporter) obj;
        if (firstName == null) {
            if (other.firstName != null)
                return false;
        } else if (!firstName.equals(other.firstName))
            return false;
        if (lastName == null) {
            if (other.lastName != null)
                return false;
        } else if (!lastName.equals(other.lastName))
            return false;
        if (reporterEmail == null) {
            if (other.reporterEmail != null)
                return false;
        } else if (!reporterEmail.equals(other.reporterEmail))
            return false;
        return true;
    }

   
    }


    




