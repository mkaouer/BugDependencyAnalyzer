package csvparser;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * @author  Bladimir Baez
 * @version 1.0
 * @since   2017-02-22
 */
public class CSVParser {

    public static void main(String[] args) throws IOException {
        final String FILE_NAME = "BugsIDFormCrawler2_V2.csv";
        ArrayList<String> rowContent = new ArrayList<>();

        CSVReader reader = new CSVReader(new FileReader(FILE_NAME) , '\t', '\'', 1);
        String[] line;

        while ((line = reader.readNext()) != null) {
            for (String element : line) {
                rowContent.add(element);
            }
        }

        CleanData cln = new CleanData();
        for (int i = 0; i < rowContent.size(); i++) {
            cln.separateDependents(rowContent.get(i));
        }
    }
}