package lab3part3;

public class CardLock {
    SmartCard lastSmartCard;
    Boolean studentAccess = false;


    public void swipeCard (SmartCard card){
        this.lastSmartCard = card;
    }

    public SmartCard getLastCardSeen(){
        return this.lastSmartCard;
    }

    Boolean isUnlocked(){
        if(lastSmartCard.isStaff()){
            return true;
        }
        else if(studentAccess)
        {
            return true;
        }
        else
        {
            return false;
        }
    }

    void toggleStudentAccess(){
        this.studentAccess = ! studentAccess;
    }
}
