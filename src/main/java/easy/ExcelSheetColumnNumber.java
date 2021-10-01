package easy;

public class ExcelSheetColumnNumber {

    public static void main(String[] args) {
        ExcelSheetColumnNumber excelSheetColumnNumber = new ExcelSheetColumnNumber();
        System.out.println(excelSheetColumnNumber.titleToNumber("AA"));
        System.out.println(excelSheetColumnNumber.titleToNumber("AB"));
        System.out.println(excelSheetColumnNumber.titleToNumber("ZY"));
        System.out.println(excelSheetColumnNumber.titleToNumber("FXSHRXW"));
    }

    public int titleToNumber(String columnTitle) {
        int sum = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            sum = sum * 26;
            if(columnTitle.charAt(i) != 'Z'){
                sum += (columnTitle.charAt(i) - 'A' + 1);
            }else {
                sum += 26;
            }
        }
        return sum;
    }
}
