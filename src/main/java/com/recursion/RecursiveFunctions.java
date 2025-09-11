package com.recursion;

import java.util.ArrayList;
import java.util.List;

public class RecursiveFunctions {

    // Ejercicio 1
    public static int recursiveIndexOf(List<String> list, String target) {
        return recursiveIndexOfHelper(list, target, 0);
    }

    private static int recursiveIndexOfHelper(List<String> list, String target, int index) {
        if (index >= list.size()) return -1;
        if (list.get(index).equals(target)) return index;
        return recursiveIndexOfHelper(list, target, index + 1);
    }

    // Ejercicio 2
    public static int recursiveIndexOfByIndex(List<String> list, String target, int index) {
        if (index >= list.size()) return -1;
        if (list.get(index).equals(target)) return index;
        return recursiveIndexOfByIndex(list, target, index + 1);
    }

    // Ejercicio 3
    public static int recursiveIndexOfEmpty(List<String> list) {
        return recursiveIndexOfEmptyHelper(list, 0);
    }

    private static int recursiveIndexOfEmptyHelper(List<String> list, int index) {
        if (index >= list.size()) return -1;
        if (list.get(index).equals("")) return index;
        return recursiveIndexOfEmptyHelper(list, index + 1);
    }

    // Ejercicio 4
    public static int recursivePut(String target, List<String> list) {
        return recursivePutHelper(target, list, 0);
    }

    private static int recursivePutHelper(String target, List<String> list, int index) {
        if (index >= list.size()) return -1;
        if (list.get(index).equals("")) {
            list.set(index, target);
            return index;
        }
        return recursivePutHelper(target, list, index + 1);
    }

    // Ejercicio 5
    public static int recursiveRemove(List<String> list, String target) {
        return recursiveRemoveHelper(new ArrayList<>(list), target, 0);
    }

    private static int recursiveRemoveHelper(List<String> list, String target, int count) {
        if (list.isEmpty()) return count;
        if (list.get(0).equals(target)) {
            list.remove(0);
            return recursiveRemoveHelper(list, target, count + 1);
        } else {
            list.remove(0);
            return recursiveRemoveHelper(list, target, count);
        }
    }

    // Ejercicio 6
    public static int recursiveSum(List<Integer> list) {
        return recursiveSumHelper(list, 0);
    }

    private static int recursiveSumHelper(List<Integer> list, int index) {
        if (index >= list.size()) return 0;
        return list.get(index) + recursiveSumHelper(list, index + 1);
    }

    // Ejercicio 7
    public static int recursiveFactorial(int n) {
        if (n <= 1) return 1;
        return n * recursiveFactorial(n - 1);
    }

    // Ejercicio 8
    public static int recursivePow(int base, int exponent) {
        if (exponent == 0) return 1;
        return base * recursivePow(base, exponent - 1);
    }

    // Ejercicio 9
    public static int recursiveFibonacci(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;
        return recursiveFibonacci(n - 1) + recursiveFibonacci(n - 2);
    }

    // Ejercicio 10
    public static boolean recursivePalindrome(String word) {
        if (word.length() <= 1) return true;
        if (word.charAt(0) != word.charAt(word.length() - 1)) return false;
        return recursivePalindrome(word.substring(1, word.length() - 1));
    }
}
