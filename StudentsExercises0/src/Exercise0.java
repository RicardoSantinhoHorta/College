package src;
import java.util.Scanner;
import java.io.PrintWriter;
import java.io.File;
import java.io.FileNotFoundException;

public class Exercise0 {
    


    //Cria uma cópia de um ficheiro
    public static void copyText (String fileIn, String fileOut) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(fileIn));
        PrintWriter writer = new PrintWriter(fileOut);

        while (reader.hasNextLine()){          
            String line = reader.nextLine();
            writer.println(line);
        }
        reader.close();
        writer.close();
    }

    //Cria um ficheiro com quadrado de todos os inteiros contidos no ficheiro de input
    public static void writeSquares (String fileIn, String fileOut) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(fileIn));
        PrintWriter writer = new PrintWriter(fileOut);

        while (reader.hasNextInt()){   
            int number = reader.nextInt();
            writer.println(number * number);
        }
        reader.close();
        writer.close();
    }
    //Retorna um ficheiro com todos os números que sejam múltiplos de n
    public static void writeMultiples (String fileIn, String fileOut, int n) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(fileIn));
        PrintWriter writer = new PrintWriter(fileOut);

        while (reader.hasNextInt()){   
            int number = reader.nextInt();
            if(number % n == 0){
                writer.println(number);
            }
        }
        reader.close();
        writer.close();
    }


    public static void lowerUpper (String fileIn, String fileOut) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(fileIn));
        PrintWriter writer = new PrintWriter(fileOut);
        int counter = 1;

        while (reader.hasNextLine()){ 
            String line = reader.nextLine(); 
            if(counter % 2 == 0){
                writer.println(line.toUpperCase());
            }
            else{
                writer.println(line.toLowerCase());
            }
            counter++;
        }
        reader.close();
        writer.close();
    }


    public static void commonElements (String fileIn, String fileOut, int[] values) throws FileNotFoundException{
        Scanner reader = new Scanner(new File(fileIn));
        PrintWriter writer = new PrintWriter(fileOut);

        while (reader.hasNextInt()){ 
            int number = reader.nextInt(); 
            for(int i = 0; i < values.length; i++){
                if(number == values[i]){
                    writer.println(number);
                }
            }
        }
        reader.close();
        writer.close();
    }
}
