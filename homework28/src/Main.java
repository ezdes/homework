import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        File file = new File("file.txt");
        writeFile(file);
        sizeCheck(file);
        writeWithoutSpace(file);
    }


    private static void writeFile(File file) {
        FileReader reader = null;
        try {
            reader = new FileReader("src/Main.java");
            Scanner scan = new Scanner(reader);
            FileWriter writer = new FileWriter(file);
            while (scan.hasNextLine()) {
                writer.write(scan.nextLine());
            }

            reader.close();
            writer.close();
        } catch (FileNotFoundException e) {
            System.out.println("Файл недоступен");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static void sizeCheck(File file) {

        try {
            if (file.length() > 100) {
                throw new IllegalStateException(file.length() + "");
            }
        }
        catch (IllegalStateException e) {
            System.out.println("Файл слишком большой, его размер: " + e.getMessage());

        }
    }

    private static void writeWithoutSpace(File file) {
        try {
            FileWriter writer = new FileWriter("fileWithoutSpace.txt");
            FileReader reader = new FileReader(file);
            Scanner scan = new Scanner(reader);

            while (scan.hasNextLine()) {
                writer.write(scan.nextLine().replaceAll("\\s", ""));
            }

            writer.close();
            reader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
