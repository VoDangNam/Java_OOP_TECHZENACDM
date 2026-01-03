package lession10_Exception.excercice.validation;

import lession10_Exception.excercice.exception.MinLengthException;
import lession10_Exception.excercice.exception.NumberOutOfRangeException;

public class PhoneValidation {
    public static void checkBattery(int pin) throws NumberOutOfRangeException{
        if(pin<0 || pin>100){
            throw new NumberOutOfRangeException("Pin phai nam trong pham vi 0 - 100%");
        }
    }

    public static void  checkDescription(String moTa) throws MinLengthException {
        if (moTa == null || moTa.trim().length()<10){
            throw new MinLengthException("Mo ta qua ngan!!!!");
        }
    }

}
