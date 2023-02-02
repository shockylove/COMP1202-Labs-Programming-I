package lab3part3;

public class SmartCard {
    private String owner;
    private Boolean isStaff = false;

    public SmartCard(String owner) {
        this.owner = owner;
    }

    public String getOwner() {
        return this.owner;
    }

    public void setStaff(Boolean isStaff) {
        this.isStaff = isStaff;
    }

    public Boolean isStaff() {
        return this.isStaff;
    }


}
