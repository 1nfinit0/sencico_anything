public class Doctor {

    //Atributos
    int id;
    String name;
    String speciality;

    Doctor(int id, String name, String speciality ) {
        this.id = id;
        this.name = name;
        this.speciality = speciality;
    }

    //Comportamientos
    public void showName() {
        System.out.println("El doctor " + name+ " es " + speciality);
    }
}
