public class App {
    public static void main(String[] args) throws Exception {
        int n = 1234567890;
        long ñ = 1234567890L;

        double nD = 1829.2378689;
        float nF = 1829.2378689F;

        char c = 'a';
        boolean b = true;

        var salary = 1000;
        var name = "John";
        var pension =  salary * 0.03;
        var totalSalary = salary - pension;
        System.out.println(totalSalary);

        var employeeName = "Luis";
        System.out.println("Employee name: " + employeeName + " " + totalSalary);

    }
}
