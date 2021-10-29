package service;


import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import domains.Table;
import lombok.SneakyThrows;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ReadCSV {
    @SneakyThrows
    public List<Table> getTable()throws IOException {

        Reader reader = Files.newBufferedReader(Paths.get("/home/me/Documents/Covid-19/src/main/java/repository/owid-covid-data.csv"));
          CsvToBean<Table> list = new CsvToBeanBuilder<Table>(reader)
                .withType(Table.class)
                  .withIgnoreLeadingWhiteSpace(true)
                    .build();

        return new ArrayList<Table>(list.parse());

//         try (Writer writer = Files.newBufferedWriter(Paths.get("/home/me/Documents/Covid-19/src/main/java/repository/test.csv"));) {
//            StatefulBeanToCsv<Table> beanToCsv = new StatefulBeanToCsvBuilder<Table>(writer)
//                    .withQuotechar(CSVWriter.NO_QUOTE_CHARACTER)
//                    .build();
//
//            beanToCsv.write(myTable);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

    }
}
