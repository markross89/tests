package org.example.CodeWars;

public class Diamond {

    public static void main(String[] args) {

        System.out.println(print(5));

    }

    public static String print(int n) {

        StringBuilder sb = new StringBuilder();
        if (n%2==0 || n<=0) {
            return null;
        }
        int half = n / 2 + 1;
        int m = half;
        int h = half;

        for (int i = 0; i < half; i++) {
            sb.append(" ".repeat(Math.max(0, m - 1)));
            sb.append("*".repeat(Math.max(0, h - m + 1)));
            m--;
            h++;

            sb.append("\n");
        }

        int g = n;
        int o = 2;

        for (int i = half; i < n; i++) {
            sb.append(" ".repeat(Math.max(0, o - 1)));
            sb.append("*".repeat(Math.max(0, g - o)));
            g--;
            o++;

            sb.append("\n");
        }
        return sb.toString();
    }
}
