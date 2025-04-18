class NullpExc {
    public static void main (String[] args) {
        String abc =null;
        try {
            System.out.println(abc.length());
        }
        catch (NullPointerException e) {
            System.out.println("Null Pointer Exception");
        }
    }
}