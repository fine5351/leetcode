package mdeium;

import java.util.ArrayList;
import java.util.List;

public class GrayCode {

    public static void main(String[] args) {
        GrayCode grayCode = new GrayCode();
        System.out.println(grayCode.grayCode(16).toString());
    }

    public List<Integer> grayCode(int n) {
        int finalSize = 1 << n;
        List<Integer> result = new ArrayList<>(finalSize);
        result.add(0);
        for (int i = 1; i < finalSize; i++) {
            result.add(getGrayCode(i));
        }
        return result;
    }

    private Integer getGrayCode(int previous) {
        return (previous >> 1) ^ previous;
    }

}
