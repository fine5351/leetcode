package mdeium;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class SimplifyPath {

    public static void main(String[] args) {
        SimplifyPath simplifyPath = new SimplifyPath();
        System.out.println(simplifyPath.simplifyPath("/a/./b//../../c/"));
        System.out.println("---------------------");
        System.out.println(simplifyPath.simplifyPath("/home//foo/"));
        System.out.println("---------------------");
        System.out.println(simplifyPath.simplifyPath("/home/"));
        System.out.println("---------------------");
        System.out.println(simplifyPath.simplifyPath("/a//b////c/d//././/.."));
        System.out.println("---------------------");
        System.out.println(simplifyPath.simplifyPath("/..."));
        System.out.println("---------------------");
    }

    public String simplifyPath(String path) {
        String[] subPaths = path.split("/");
        List<String> pathList = new ArrayList<>();
        for (int i = 0; i < subPaths.length; i++) {
            String subPath = subPaths[i];
            if (subPath.equals("..")) {
                if (pathList.size() > 0) {
                    pathList.remove(pathList.size() - 1);
                }
            } else if (!subPath.isEmpty() && !subPath.equals(".") && !subPath.equals("/")) {
                pathList.add(subPath);
            }
        }
        return "/" + String.join("/", pathList);
    }
}
