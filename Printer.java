package JavaPractice;
import java.io.*;
public interface Printer {
    //to send the text to printer
    void printit(String text);
    //to disconnect from printer
    void disconnect(); 
}
//implemeting Printer interface for IBM printer
class IBMPrinter implements Printer{

    @Override
    public void printit(String text) {
        System.out.println(text);
        
    }

    @Override
    public void disconnect() {
        System.out.println("Printing Completed");
        System.out.println("Disconnect from IBM Printer..");
    }
}
class EpsonPrinter implements Printer{

    @Override
    public void printit(String text) {
        System.out.println(text);
        
    }

    @Override
    public void disconnect() {
        System.out.println("Printing Completed");
        System.out.println("Disconnect from Epson Printer.....");
        
    }
    
}
class UsePrinter{
    public static void main(String[] args) {
        //attach FileReader to config.text file to read data from it
        try{
            FileReader fr = new FileReader("config.txt");
            LineNumberReader lnr = new LineNumberReader(fr);
            String printername = lnr.readLine();
            System.out.println("Loading the driver for : " + printername);
            Class c = Class.forName(printername);
            Printer ref = (Printer)c.newInstance();
            ref.printit("Hello, This is printed on the printer ");
            ref.disconnect();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
