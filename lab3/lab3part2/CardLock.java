package lab3part2;



public class CardLock {
    SmartCard lastSmartCard;
    Boolean studentAccess = false;

    void swipeCard(SmartCard card){
        this.lastSmartCard = card;
    }

    public SmartCard getLastCardSeen() {
        return lastSmartCard;
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
