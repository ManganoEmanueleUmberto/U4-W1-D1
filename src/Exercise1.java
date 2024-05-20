public class Exercise1 {
    public static void main(String[] args) {
       int x= 10;
       int y= 20;
       String word= "Epicode";
       String[] array={"Ciao","sono","array","di","String"};

        System.out.println(moltiplication(x,y));
        System.out.println(concat(word,y));
        String[] arrayReturn=addToArray(array,"un");
        for (int i = 0; i < arrayReturn.length; i++) {
            System.out.println("Elemento numero "+(i+1)+": "+arrayReturn[i]);
        }

    }

    public static int moltiplication(int num1, int num2){
        return num1*num2;
    }
    public static String concat (String word, int num){
        return word+" "+num;
    }
    public static String[] addToArray (String[] array, String word){
        String[] arrayReturn= new String[6];
        arrayReturn[0]= array[0];
        arrayReturn[1]= array[1];
        arrayReturn[2]= word;
        arrayReturn[3]= array[2];
        arrayReturn[4]= array[3];
        arrayReturn[5]= array[4];
        return arrayReturn;
    }
}
