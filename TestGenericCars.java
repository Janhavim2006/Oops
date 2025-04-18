public class TestGenericCars {
    public static <Y> void printArr (Y [] pri){
        for (Y x : pri){
            System.out.printf(x + " ");
    }
    System.out.println();
    }
    public static void main(String[] args) {
        String [] arr= {"BMW", "Audi", "Toyota", "Ford"};
        System.out.println("Array of cars: ");
        printArr(arr);
        System.out.println();
    }
}