
// 2. С помощью Java создать файл file.txt, и записать в него слово TEST 100 раз.
// Если уже файл создан, то перезаписываем его.



import java.io.*;
 
public class test {
  
    public static void main(String[] args) {
          
        try(BufferedWriter bw = new BufferedWriter(new FileWriter("file.txt")))
        {
            for (int i = 0; i < 100; i++) {
            String text = "TEST\n";
            bw.write(text);
            }
        }
        catch(IOException ex){
              
            System.out.println(ex.getMessage());
        } 
    } 
}
