import java.io.IOException;
import java.io.BufferedWriter;
import java.io.FileWriter;

public class run {
    public static void main(String[] args) throws IOException {
        System.out.println("Розыгрыш... Смотрите файл 'results.txt'");
        Toyken toyken = new Toyken();
        toyken.add(new Toy(1, "Конструктор"), 2);
        toyken.add(new Toy(2, "Робот"), 2);
        toyken.add(new Toy(3, "Кукла"), 6);
  
        saveResults(toyken);
    }
  
    public static void saveResults (Toyken toyken) throws IOException{
      BufferedWriter outputWriter = null;
      outputWriter = new BufferedWriter(new FileWriter("results.txt"));
      ItemForToyken result = toyken.get();
      while(result != null){
        outputWriter.write(result.toString());
        outputWriter.newLine();
        result = toyken.get();
      }
      outputWriter.flush();  
      outputWriter.close();  
    }    
}
