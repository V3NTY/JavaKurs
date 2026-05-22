package Model;

public class Bug implements ConsoleNotification, Comparable<Bug> {
    // POLA
    private String description;
    private int priority;
    private boolean isOpen = true;
    private BugReporter bugReporter;

    // METODY
    public Bug(String description, int priority, boolean isOpen, BugReporter bugReporter) {
        this.bugReporter = bugReporter;
        this.description = description;
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

    public void notifyStatusChange(){
        System.out.println("Status of Bug has been changed");
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
        notifyStatusChange();
    }

    public int getPriority(){
        return priority;
    }
   public void showStatus(){
        System.out.println(isOpen);
    }

   public BugReporter getBugReporter() {
    return bugReporter;
   }

   public void setBugReporter(BugReporter bugReporter) {
    this.bugReporter = bugReporter;
   }

   @Override
   public String toString() {
    return "Bug [description=" + description + ", priority=" + priority + ", isOpen=" + isOpen + ", bugReporter="
            + bugReporter + "]";
   }

   @Override
   public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((description == null) ? 0 : description.hashCode());
    result = prime * result + priority;
    result = prime * result + (isOpen ? 1231 : 1237);
    result = prime * result + ((bugReporter == null) ? 0 : bugReporter.hashCode());
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
    Bug other = (Bug) obj;
    if (description == null) {
        if (other.description != null)
            return false;
    } else if (!description.equals(other.description))
        return false;
    if (priority != other.priority)
        return false;
    if (isOpen != other.isOpen)
        return false;
    if (bugReporter == null) {
        if (other.bugReporter != null)
            return false;
    } else if (!bugReporter.equals(other.bugReporter))
        return false;
    return true;
   }

   @Override
   public int compareTo(Bug item) {
    int compareResult = this.getDescription().compareTo(item.getDescription());
    return compareResult;
    // RETURN 1 -> A WIĘKSZE NIŻ B
    // RETURN 0 -> SAME
    // RETURN -1 -> A MNIEJSZE NIŻ B
   }

   

    

}
