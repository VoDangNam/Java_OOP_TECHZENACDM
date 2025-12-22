package lession03_ke_thua.excercises.Bai03;

import java.time.LocalDate;

public class LocalDateUtilManager {
    public static void main(String[] args) {
        LocalDate d1 = LocalDateUtil.parseFromDDMMYYYY("22/12/2025");
        LocalDate d2 = LocalDateUtil.parseFromYYYYMMDD("2025/12/22");

        System.out.println(d1);
        System.out.println(d2);

        System.out.println(LocalDateUtil.formatToDDMMYYYY(d1));
        System.out.println(LocalDateUtil.formatToYYYYMMDD(d2));
    }
}
