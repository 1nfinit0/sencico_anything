public class NamingJava {
    public static void main(String[] args) {
        
        //Variables únicas pero parecidas
        int cellphone = 1978238; //mínuscula
        int cellPhone = 19782381; //mayúscula
        System.out.println(cellphone);
        System.out.println(cellPhone);

        String $countryName = "Lima";
        String _countryName = "Piura";
        System.out.println($countryName);
        System.out.println(_countryName);

        int POSITION = 1;
        int MAX_WIDTH = 99999;
        int MIN_WIDTH = 0;
    }
}
