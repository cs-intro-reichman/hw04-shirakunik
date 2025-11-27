public class Primes {
    public static void main(String[] args) {

    final int N = Integer.parseInt(args[0]);

    
    Boolean [] arr = new Boolean [N+1];
    for (int i =0; i<arr.length; i++) {
        if (i<=1) {
            arr [i] = false; 
        }
        else {
            arr [i] = true;
        }
    }

    int p = 2; 
    while  (p <= Math.sqrt(N)) {

        if (arr[p] == false){
            p++;
            continue;
        }

        int i=p+p;
        while (i<arr.length){
        arr [i] = false; 
        i=i +p;
        }
      p++;
    }
    
    int count =0;

    System.out.println("Prime numbers up to " + N + ":");
    
    for (int j = 2; j<arr.length; j++){
        if (arr[j] == true) {
            System.out.println(j);
            count++;
        }
        }

        double percent = 100.0 * count / N;
        System.out.println ( "There are " + count + " primes between 2 and " + N + " (" + (int) percent + "% are primes)");
    }
}
    

