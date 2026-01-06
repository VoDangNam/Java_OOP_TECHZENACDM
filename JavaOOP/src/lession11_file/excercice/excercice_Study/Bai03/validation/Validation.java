package lession11_file.excercice.excercice_Study.Bai03.validation;

import lession11_file.excercice.excercice_Study.Bai03.exception.ValidationException;

public class Validation {
    public static void notEmpty(String value, String messenge) throws ValidationException {
        if (value == null || value.trim().isEmpty()) {
            throw new ValidationException(messenge);
        }
    }

    public static double validationDouble(String value, String messenge) throws ValidationException {
        try {
            double d = Double.parseDouble(value);

            if (d <= 0) {
                throw new ValidationException(messenge + " khong duoc am");

            }
            return d;
        } catch (NumberFormatException e) {
            throw new ValidationException(messenge + " phai la so thuc");
        }
    }

    public static int validationInt(String value, String messenge) throws ValidationException {
        try {
            int d = Integer.parseInt(value);

            if (d <= 0) {
                throw new ValidationException(messenge + " khong duoc am");

            }
            return d;
        } catch (NumberFormatException e) {
            throw new ValidationException(messenge + " phai la so thuc");
        }
    }

    public static void validateId(String id) throws ValidationException {
        if (!id.matches("(DTC|DTM)\\d{3}")) {
            throw new ValidationException("Mã điện thoại không đúng định dạng");
        }
    }

    public static void validateDescription(String desc)
            throws ValidationException {
        if (desc == null || desc.length() < 10) {
            throw new ValidationException("Mô tả thêm phải từ 10 ký tự trở lên");
        }
    }
}
