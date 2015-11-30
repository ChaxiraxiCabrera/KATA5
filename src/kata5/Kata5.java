package kata5;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

public class Kata5 {

    public static void main(String[] args) throws SQLException, ClassNotFoundException, FileNotFoundException, IOException {
        
          String nameFile = "C:\\Users\\Chaxi\\Desktop\\prueba.txt";
          
          ArrayList <String> listMail = MailReaderDB.read(nameFile);
          Histogram <String> histogram = MailHistogramBuilder.build(listMail);
          HistogramDisplay histogramDisplay = new HistogramDisplay(histogram);
          
          histogramDisplay.execute();
         
    }
    
}
