class NumformatExc {
    public static void main(String[] args) {

       String Str = "Yash";
       
        try {
            int num = Integer.valueOf(Str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println("Number format exception occurred");
        }
    }
}
