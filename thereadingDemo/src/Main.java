//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        KronometreThread thread1 = new KronometreThread("tread1");

        KronometreThread thread2 = new KronometreThread("tread2");

        KronometreThread thread3 = new KronometreThread("tread3");

        thread1.start();
        thread2.start();
        thread3.start(); 

    }
}