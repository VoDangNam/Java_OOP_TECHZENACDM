package lession10_Exception.pracrice;

import java.lang.Exception;

public class Under18YearsOldException extends Exception {
    public Under18YearsOldException(String message) {
        super(message);
    }
}
