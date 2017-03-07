package csvparser;

import com.opencsv.CSVWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author  Bladimir Baez
 * @version 1.0
 * @since   2017-02-22
 */
public class CleanData {

    private List<String[]> allLines = new ArrayList<>();

    public void separateDependents(String line) throws IOException {

        CSVWriter writer = new CSVWriter(new FileWriter("test.csv"), '\t');

        String[] value = line.split(",");
        String[] dependentItems = value[2].split(" ");

        String[] oneLine;

        for (int i = 0; i < dependentItems.length; i++) {
            String row;

                row = value[0] + "," + value[1] + "," + dependentItems[i] + "," + value[3]
                        + "," + value[4]
                        + "," + value[5] + "," + value[6] + "," + value[7] + "," + value[8] + "," + value[9]
                        + "," + value[10] + "," + value[11] + "," + value[12] + "," + value[13] + "," + value[14]
                        + "," + value[15] + "," + value[16] + "," + value[17] + "," + value[18] + "," + value[19]
                        + "," + value[20] + "," + value[21] + "," + value[22] + "," + value[23] + "," + value[24]
                        + "," + value[25] + "," + value[26] + "," + value[27] + "," + value[28] + "," + value[29]
                        + "," + value[30];
                oneLine = row.split("','");
                allLines.add(oneLine);

            writer.writeAll(allLines);
        }
        writer.close();
    }
}
