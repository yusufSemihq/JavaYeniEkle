//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {


        AccountManager manager = new AccountManager();
        System.out.println("Hesap = " + manager.getBalance());
        manager.deposit(100);
        System.out.println("Hesap = " + manager.getBalance());

        try{
            manager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println("Hesap = " + exception.getMessage());
        }
        System.out.println("Hesap = " + manager.getBalance());
        try {
            manager.withdraw(90);
        }catch (BalanceInsufficentException exception){
            System.out.println("Hesap = " + exception.getMessage());
        }


        manager.withdraw(20);
        System.out.println("Hesap = " + manager.getBalance());

    }
}