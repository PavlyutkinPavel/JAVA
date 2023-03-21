import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<String> list = new ArrayList<String>();
        try {
            FileReader fileReader = new FileReader("src/resources/names.txt");
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] substrings = line.split(",");
                for (String substring : substrings) {
                    list.add(substring.trim());
                }
            }
            bufferedReader.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(list);
        */

        // dz task 1
        System.out.println("Enter file path: ");
        Scanner sc = new Scanner(System.in);
        String path = sc.next();
        List<String> document = new ArrayList<>();
        System.out.println("List of correct doc/contract number: ");
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;
            FileWriter fileWriter1 = new FileWriter("src/resources/file_dz_correctDocNum.txt");
            FileWriter fileWriter2 = new FileWriter("src/resources/file_dz_incorrectDocNum.txt");
            // BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            while ((line = bufferedReader.readLine()) != null) {
                String[] substrings = line.split("\n");
                for (String substring : substrings) {
                    if (substring.startsWith("docnum") && substring.substring(6).length() == 15) {
                        try {
                            fileWriter1.write(substring);
                            fileWriter1.write("\n");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        document.add(substring.trim());
                    } else if (substring.startsWith("contract") && substring.substring(8).length() == 15) {
                        try {
                            fileWriter1.write(substring);
                            fileWriter1.write("\n");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        document.add(substring.trim());
                    } else if (!(substring.startsWith("contract") || substring.startsWith("docnum"))) {
                        try {
                            fileWriter2.write(substring);
                            fileWriter2.write("\t no contact/docnum indicator before ur document number\n");
                        } catch (Exception e) {
                             e.printStackTrace();
                        }
                    } else if (substring.substring(8).length() != 15 || substring.substring(6).length() != 15) {
                        try {
                            fileWriter2.write(substring);
                            fileWriter2.write("\t Incorrect length of document number\n");
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
            bufferedReader.close();
            fileReader.close();
            fileWriter1.close();
            fileWriter2.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println(document);

        sc.close();
    }

}