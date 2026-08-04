import java.io.*;
import java.util.ArrayList;
public class RW1 {
    public static void main(String[] args) {
        String filepath1 = "src\\name.txt";
        String filepath2 = "src\\output.txt";
        ArrayList<String> address = new ArrayList<>();

        try (FileReader reader = new FileReader(filepath1);
             BufferedReader br = new BufferedReader(reader);
        FileWriter writer = new FileWriter(filepath2)) {
            String word;
            while ((word = br.readLine())!=null){
                address.add(word);
            }
            for (String s:address){
                if (s!=null){
                    writer.write(s.toUpperCase());
                    writer.write("\n");
                }
            }
        }catch (NullPointerException e){
            System.out.println("Null exception");
        }
        catch (FileNotFoundException e){
            System.out.println("File not found");
        }catch (IOException e){
            System.out.println("Something went wrong");
        }
    }
}
