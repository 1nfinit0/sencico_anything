public class UpdatingVariables {
    public static void main(String[] args) {
        //Asalario
        int salary = 1000;
        //Bono de $200
        salary = salary + 200;
        //Nombre del empleado
        String employeeName = "Juan";
        //Descuento de $50
        salary = salary - 50;
        //2 horas extra por $30 cada una 
        //comida = - $45
        salary = salary + (30 * 2) - 45;
        employeeName = employeeName + " Delgado Valverde";
        employeeName = "José " + employeeName;
        System.out.println("El nombre del empleado es: " + employeeName);

    }
}