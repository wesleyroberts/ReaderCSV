package domains;

import lombok.Getter;
import lombok.Setter;
import com.opencsv.bean.CsvBindByName;

import java.math.BigInteger;

@Getter
@Setter
public class Table {
    @CsvBindByName
    private String continent;
    @CsvBindByName
    private String location;
    @CsvBindByName
    private String date;
    @CsvBindByName
    private BigInteger total_cases;
    @CsvBindByName
    private BigInteger new_cases;
    @CsvBindByName
    private BigInteger total_deaths;
    @CsvBindByName
    private BigInteger new_deaths;
    @CsvBindByName
    private BigInteger population;

    public Table(){ }

    @Override
    public String toString() {
        return "Table{" +
                "continent='" + continent + '\'' +
                ", location='" + location + '\'' +
                ", date='" + date + '\'' +
                ", total_cases=" + total_cases +
                ", new_cases=" + new_cases +
                ", total_deaths=" + total_deaths +
                ", new_deaths=" + new_deaths +
                ", population=" + population +
                '}';
    }
}
