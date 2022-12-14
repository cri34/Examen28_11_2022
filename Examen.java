public class Examen {
    public static void main(String[] args) {
        printArray(returnPrimers(1000));
        printArray( returnNumbersPrimers( returnPrimers(1000) ) );
        System.out.println(descompFactorial(60));
        System.out.println(isWord("pare ´´' pare a de ; de hasta çpaco  + manipular","pare",47));
        System.out.print(returnStringWithoutSubString("pare ´´' pare a de ; de hasta çpaco  + manipular","paco"));
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

    //2 descomposicion factorial

    public static String descompFactorial(int num){
        int div = num;
        int divident = 2;
        String descompos="";

        while(div!=1) {
            if (div % divident == 0) {
                descompos += " " + divident;
                div = div / divident;
                continue;
            }
            divident++;
        }
        return descompos;
    }

    //3 eliminar aparicions de substring en text;
    //pare
    //pare ´´' pare a de ; de hasta çpaco  + manipular
    public static boolean isWord (String text, String subtext ,int index){
        int iSt = 0;
        if (subtext.length() -1 + index > text.length() || index < 0)
            return false;
        for (int i = index; i < index + subtext.length(); i++){
            if (text.charAt(i) != subtext.charAt(iSt)){
                return false;
            }
            iSt++;
        }
        return true;
    }
    //pare ´´' pare a de ; de hasta çpaco  + manipular
    public static String returnStringWithoutSubString(String text,String subtext){
        String tWithoutString="";

        for (int i = 0; i < text.length();i++){
            if (isWord(text,subtext,i)){
                i= i+subtext.length()-1;
                continue;
            }
            tWithoutString+=""+ text.charAt(i);

        }

        return tWithoutString;
    }
}


