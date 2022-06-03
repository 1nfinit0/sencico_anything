public class NamingJava {
    public static void main(String[] args) {
        
        //Variables únicas pero parecidas
        int cellphone = 1978238; //mínuscula
        int cellPhone = 19782381; //mayúscula
        System.out.println(cellphone);
        System.out.println(cellPhone);

        //También puede empezar con _ $
        String $countryName = "Lima";
        String _countryName = "Piura";
        System.out.println($countryName);
        System.out.println(_countryName);

        //Constantes todas en mayúsuclas
        final int POSITION = 1;
        final int MAX_WIDTH = 99999;
        final int MIN_WIDTH = 0;
        System.out.println(POSITION+MAX_WIDTH+MIN_WIDTH);
    }
}
