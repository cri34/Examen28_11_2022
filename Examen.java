public class Examen {
    public static void main(String[] args) {
        printArray(returnPrimers(1000));
        printArray( returnNumbersPrimers( returnPrimers(1000) ) );
    }
    public static boolean [] returnPrimers (int number){
        boolean [] isPrimer = new boolean[number];
        final int maxLimit= (int) Math.sqrt(number);
        for (int i=1; i < isPrimer.length ; i++){
            isPrimer [i]= true;
        }
        for (int i=2 ; i <= maxLimit; i++ ){
            if (isPrimer[i -1])
               for (int j = 2 ;(i * j) -1 < isPrimer.length; j++){
                 isPrimer[(i * j) -1] = false;

               }
        }
        return isPrimer;
    }
    public static int[] returnNumbersPrimers ( boolean [] primers ){
        int [] numPrimers;
        int counter = 0;
        int iNumPrimer=0;
        for (int i = 1; i < primers.length; i++)
            if (primers[i])
                counter++;

        numPrimers = new int [counter];

        for (int i = 1; i < primers.length;i++)
            if (primers[i])
                numPrimers[iNumPrimer++]= i+1;

        return numPrimers;
    }

    public static void printArray(boolean [] array){
        for (int i = 0; i < array.length;i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }

    public static void printArray(int [] array){
        for (int i = 0; i < array.length;i++){
            System.out.print(" " + array[i]);
        }
        System.out.println();
    }
}


