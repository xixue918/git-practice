// Main.java（修改后）
public class Main {
    public static void greet() {
        System.out.println("Hello, Git!");
    }

    public static void main(String[] args) {
        greet(); // 保留原有的问候功能
        // 新增：调用Utils的add方法计算1+2，并打印结果
        int sum = Utils.add(1, 2);
        System.out.println("1 + 2 = " + sum);
    }
}