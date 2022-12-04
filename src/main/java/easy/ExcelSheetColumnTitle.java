package easy;

public class ExcelSheetColumnTitle {

    public static void main(String[] args) {
        ExcelSheetColumnTitle excelSheetColumnTitle = new ExcelSheetColumnTitle();
        System.out.println(excelSheetColumnTitle.convertToTitle(701));
        System.out.println(excelSheetColumnTitle.convertToTitle(26));
        System.out.println(excelSheetColumnTitle.convertToTitle(23));
        System.out.println(excelSheetColumnTitle.convertToTitle(52));
    }

    public String convertToTitle(int columnNumber) {
        StringBuilder resultBuilder = new StringBuilder();
        while (columnNumber > 0) {
            if (columnNumber % 26 == 0) {
                resultBuilder.insert(0, "Z");
                columnNumber = columnNumber - 26;
            } else {
                resultBuilder.insert(0, (char) (columnNumber % 26 - 1 + 'A'));
                columnNumber = columnNumber - columnNumber % 26;
            }
            columnNumber = columnNumber / 26;
        }
        return resultBuilder.toString();
    }


}
