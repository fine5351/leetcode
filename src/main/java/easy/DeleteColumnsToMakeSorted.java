package easy;

public class DeleteColumnsToMakeSorted {

    public static void main(String[] args) {
        DeleteColumnsToMakeSorted deleteColumnsToMakeSorted = new DeleteColumnsToMakeSorted();
        System.out.println(deleteColumnsToMakeSorted.minDeletionSize(new String[]{"cba", "daf", "ghi"}));
        System.out.println(deleteColumnsToMakeSorted.minDeletionSize(new String[]{"a", "b"}));
    }

    public int minDeletionSize(String[] A) {
        int count = 0;
        for (int i = 0; i < A[0].length(); i++) {
            for (int j = 0; j < A.length - 1; j++) {
                if (A[j].charAt(i) - A[j + 1].charAt(i) > 0) {
                    count++;
                    break;
                }
            }
        }
        return count;
    }
}
