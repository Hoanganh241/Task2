package task6;

public class codeLeanE  extends codeLeanB{
    public static void main (String[] args) {
        new codeLeanB().methodPublic();
        new codeLeanB().methodProtected();//compile time error

        //works, accessing super class protected method using subclass
        new codeLeanE().methodProtected();
    }
}
