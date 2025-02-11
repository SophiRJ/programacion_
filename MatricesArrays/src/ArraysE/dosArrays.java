package ArraysE;

public class dosArrays {
    public static void main(String[] args) {
        int [] array1=new int[10];
        int [] array2=new int[10];
        int[] arrayResultado= new int[array1.length+ array2.length];
        for(int i=0;i<array1.length;i++){
            array1[i]=(int)(Math.random()*20);
        }
        for(int i=0;i<array1.length;i++) {
            System.out.print(array1[i]+" ");
        }
        System.out.println();

        for(int i=0;i<array2.length;i++){
            array2[i]=(int)(Math.random()*20);
        }
        for(int i=0;i<array2.length;i++) {
            System.out.print(array2[i]+" ");
        }
        System.out.println();
        for(int i=0;i<array1.length;i++){
                   arrayResultado[i]=array1[i]+array2[i];
        }
        for(int i=0;i<array1.length;i++) {
            System.out.print(arrayResultado[i]+" ");
        }
    }
}
