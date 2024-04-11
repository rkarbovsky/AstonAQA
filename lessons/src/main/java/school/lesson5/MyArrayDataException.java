package school.lesson5;

class MyArrayDataException extends NumberFormatException {
    MyArrayDataException(int row, int col) {
        super(String.format("Неверные данные в %d строке, %d столбца\n", row + 1, col + 1));
    }
}
