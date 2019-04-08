package ua.lviv.iot.managers;

import ua.lviv.iot.models.Good;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class GoodWriter {
    static void WriteToFile(List<Good> goodList) throws IOException {

        try(FileOutputStream catalogFos = new FileOutputStream(
                "catalog.csv",
                true);

        PrintWriter catalogWriter = new PrintWriter(catalogFos);) {

            catalogWriter.println(goodList.get(0).getHeaders());

            for (Good goodItem : goodList) {
                catalogWriter.println(goodItem.toCSV());
            }
        }
    }

}
