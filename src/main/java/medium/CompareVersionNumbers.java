package medium;

public class CompareVersionNumbers {

    public static void main(String[] args) {
        CompareVersionNumbers compareVersionNumbers = new CompareVersionNumbers();
        System.out.println(compareVersionNumbers.compareVersion("1.01", "1.001"));
        System.out.println(compareVersionNumbers.compareVersion("1.0", "1.0.0"));
        System.out.println(compareVersionNumbers.compareVersion("0.1", "1.1"));
        System.out.println(compareVersionNumbers.compareVersion("1.0.1", "1"));
        System.out.println(compareVersionNumbers.compareVersion("7.5.2.4", "7.5.3"));
    }

    public int compareVersion(String version1, String version2) {
        String[] versionColumns1 = version1.split("\\.");
        String[] versionColumns2 = version2.split("\\.");
        int length = Math.max(versionColumns1.length, versionColumns2.length);
        for (int i = 0; i < length; i++) {
            int num1 = i < versionColumns1.length ? Integer.valueOf(versionColumns1[i]) : 0;
            int num2 = i < versionColumns2.length ? Integer.valueOf(versionColumns2[i]) : 0;
            if (num1 > num2) {
                return 1;
            } else if (num1 < num2) {
                return -1;
            }
        }
        return 0;
    }
}
