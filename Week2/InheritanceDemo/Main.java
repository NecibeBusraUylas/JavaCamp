package Week2.InheritanceDemo;

public class Main {
    public static void main(String[] args) {
        CreditUI creditUI = new CreditUI();

       creditUI.CalculateCredit(new TeacherCreditManger());
       creditUI.CalculateCredit(new FarmerCreditManager());
    }
}