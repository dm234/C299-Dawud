public class App {
    public static void main(String[] args) throws Exception {

    int Array1[] = { 1, 90, -33, -55, 67, -16, 28, -55, 15 };
    int Array2[] = { 999, -60, -77, 14, 160, 301 };
    int Array3[] = { 10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,140, 150, 160, 170, 180, 190, 200, -99 } ;
        

    System.out.println("#1 Array Sum: " + sumIntArray(Array1));
    System.out.println("#2 Array Sum: " + sumIntArray(Array2));
    System.out.println("#3 Array Sum: " + sumIntArray(Array3));
    }

    public static int sumIntArray (int[] intArray){
        
        int sum = 0;
        for (int i=0; i< intArray.length; i++){
            sum += intArray[i];
        }
        
        return sum;
    }
}
