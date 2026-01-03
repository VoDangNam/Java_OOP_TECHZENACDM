package lession10_Exception.excercice.validation;

import lession10_Exception.excercice.exception.EmptyFieldException;
import lession10_Exception.excercice.exception.NegativeNumberException;

public class CommonValidation {
    public static void checkEPT(String value, String fileName) throws EmptyFieldException {
        if (value == null || value.trim().isEmpty()) {
            throw new EmptyFieldException(fileName + "Khong duoc de trong!!");
        }
    }

    public static void checkNegative(double value, String fileName) throws NegativeNumberException {
        if (value < 0) {
            throw new NegativeNumberException(fileName + " khong the la so am!!!");
        }
    }
}
