class ex8 {
    
    public static int[] histogram(int[] v, int m){
        int[] list = new int[m];
        for(int i = 0; i < m; i++){
            list[i] = numOccurrences(v, i);
        }
        return list;
    }

    public static int numOccurrences(int[] v, int x){
        int counter = 0;
        for(int j = 0; j < v.length; j++)
            if(x == v[j])
                counter++;

        return counter;
    }
}