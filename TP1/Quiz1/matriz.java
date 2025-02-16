public class matriz {
    public static void main(String[] args) {
        boolean[][] matriz = {{ true , false , true },
                            {false , true , false },
                            {true , false , true }};
        imprimirMatriz(matriz);
    }

    public static void imprimirMatriz(boolean[][] matriz) {
        StringBuilder sb = new StringBuilder();

        for(int i = 0; i < matriz.length; i++){
            if(i > 0)
                sb.append("\n");
            for(int j = 0; j < matriz[i].length; j++){
                sb.append(verBool(matriz[i][j]));
            }
        }
        System.out.println(sb.toString());

    }

    public static String verBool(boolean value){
        String x;
        if(value)
            x = "*";
        else
            x = " ";
        return x;
    }
}
