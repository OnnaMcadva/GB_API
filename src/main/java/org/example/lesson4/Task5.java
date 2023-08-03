package org.example.lesson4;

import java.util.Stack;

public class Task5 {
    public static void main(String[] args) {
        System.out.println("simplifyPath(\"/home/\") = " + simplifyPath("/home/"));
        System.out.println("simplifyPath(\"/../\") = " + simplifyPath("/../"));
        System.out.println("simplifyPath(\"/home//foo/\") = " + simplifyPath("/home//foo/"));
        System.out.println("simplifyPath(\"/c//d/f/../i/k\") = " + simplifyPath("/c//dev/file/../image/kube"));

    }

    public static String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        StringBuilder ans = new StringBuilder();
        String[] tokens = path.split("/");
        for (String token : tokens) {
            if (token.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!token.isBlank() && !token.equals(".")) {
                stack.push(token);
            }
        }
        if (stack.isEmpty()) {
            return "/";
        }

        while (!stack.isEmpty()){
            ans.insert(0,stack.pop()).insert(0,"/");
        }
        return ans.toString();
    }
    }


// 71. Simplify Path
// Given a string path, which is an absolute path
// (starting with a slash '/') to a file or directory in a Unix-style file system,
// convert it to the simplified canonical path.
// https://leetcode.com/problems/simplify-path/
/*

 */