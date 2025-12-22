package lession03_ke_thua.excercises.Bai03;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class LocalDateUtil {

    public static final DateTimeFormatter FORMAT_DD_MM_YYYY = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static final DateTimeFormatter FORMAT_YYYY_MM_DD = DateTimeFormatter.ofPattern("yyyy/MM/dd");

    public static LocalDate parseFromDDMMYYYY(String dateStr) {
        return LocalDate.parse(dateStr, FORMAT_DD_MM_YYYY);
    }

    public static LocalDate parseFromYYYYMMDD(String dateStr) {
        return LocalDate.parse(dateStr, FORMAT_YYYY_MM_DD);
    }

    public static String formatToDDMMYYYY(LocalDate date) {
        return date.format(FORMAT_DD_MM_YYYY);
    }

    public static String formatToYYYYMMDD(LocalDate date) {
        return date.format(FORMAT_YYYY_MM_DD);
    }

    private LocalDateUtil() {

    }
}
