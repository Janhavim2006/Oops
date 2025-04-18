class ThrowExc {
    public static void main(String[] args) {
        try {
            throw new ArithmeticException("Throwing an exception");
        } 
        catch (ArithmeticException e) {
            System.out.println("Caught exception");
        }
    }
}
