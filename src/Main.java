//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public enum Member {PEACE, JOY, GRACE}
    public static Member SelectedPerson;
    public static final int PEACE = 1;
    public static final int JOY = 2;
    public static final int GRACE = 3;


    public static void main(String[] args) {
        SelectedPerson = Member.PEACE;
        if(SelectedPerson.equals(Member.PEACE)){
            System.out.println("PEACE");
        }
        if(SelectedPerson.equals(Member.JOY)){
            System.out.println("JOY");
        }
//        int selectedPerson = 2;
//        if(selectedPerson == PEACE){
//            System.out.println("PEACE");
//        }else {
//            System.out.println("JOY");
//        }

    }
}