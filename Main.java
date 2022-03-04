class Main {
  public static void main(String[] args) {
    int count = 0;
    int i=0;
    do{

      if(prime(Math.pow(2,i)-1)){
        count++;
        System.out.println((Math.pow(2,i)-1) + ", " + Math.pow(2,i-1)*(Math.pow(2,i)-1));

      }
      i++;
    } while(count < 7);
    
  }

    public static boolean perfect(int n){
        return addArray(divisors(n)) == n;
    }
   
    public static boolean prime(double n){
        return divisors(n).length == 1;       
    }
    
    public static int[] divisors(double n){
        int c = 0;
        for(int i = 1; i < n; i++) 
        if(n%i == 0) c++;
        int[] div = new int[c];
        int ac = 0;
        for(int i = 1; i < n; i++) 
        if(n%i == 0){
            div[ac] = i;
            ac++;
        }
        return div;
    }
    
    public static int addArray(int[] ex){
        int an = 0;
        for(int i = 0; i < ex.length; i++) an += ex[i];
        return an;
    }

}
