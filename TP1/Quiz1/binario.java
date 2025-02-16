public class binario {
    public static void main(String[] args) {
        System.out.println(paraBinario(1)); //1
        System.out.println(paraBinario(5)); //101
        System.out.println(paraBinario(15)); //1111
    }
    
    public static String paraBinario(int n) {
        StringBuilder sb = new StringBuilder();
        if(n == 0) 
            return "0";
        
        while(n > 0){
            sb.append(n % 2);
            n /= 2;
        }
        return sb.reverse().toString();

    }
}
