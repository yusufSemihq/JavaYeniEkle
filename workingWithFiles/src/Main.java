import java.io.*;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        createFile();
        getFile();
        readFile();
        writeFile();

    }

    private static void writeFile() {

    }

    private static void readFile() {
    }

    public static void  createFile(){
        File file = new File("C:\\Users\\Windows 10\\Desktop\\JAVA\\files\\stdudents.txt");

        try {
            if (file.createNewFile()) {
                System.out.println("Dosya Oluşturuldu");
            }
            else {
                System.out.println("Dosya Zaten Mevcut.");
            }
        } catch (IOException e) {
            e.printStackTrace() ;
        }
    }

    public static void  getFile(){
        File file = new File("C:\\Users\\Windows 10\\Desktop\\JAVA\\files\\stdudents.txt");
        if (file.exists()){
            System.out.println("Dosya Adı :" + file.getName());
            System.out.println("Dosya Yolu :" + file.getAbsoluteFile());
            System.out.println("Dosya Yazılabilir mi :" + file.canWrite());
            System.out.println("Dosya Okunabilir mi :" + file.canRead());
            System.out.println("Dosya Boyutu (bytr) :" + file.length());



        }

        public static void readFile() {
            File file = new File("C:\\Users\\Windows 10\\Desktop\\JAVA\\files\\stdudents.txt");

            try {
                Scanner reader = new Scanner(file);
                while (reader.hasNextLine()) {
                    String line = reader.nextLine();
                    System.out.println(line);
                }
                reader.close();
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
        }

        public static void writeFile(){
         File   file = new File("C:\\Users\\Windows 10\\Desktop\\JAVA\\files\\stdudents.txt");
        try{
            BufferedReader writer = new BufferedReader("C:\\Users\\Windows 10\\Desktop\\JAVA\\files\\stdudents.txt")
            writer.writer("Ahmet");
            System.out.println("Dosya Yazıldı");
            writer.close();
        }catch (IOException e){
            e.printStackTrace();
        }


        }

    }
}