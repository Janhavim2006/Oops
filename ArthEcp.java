class ArthEcp{
    public static void main(String[] args){
        int a=10;
        int b=0;
        int c;
        try{
            c=a/b;
            System.out.println(c);
        }
        catch(ArithmeticException e){
            System.out.println("Arithmetic Exception");
        }
        
}
}