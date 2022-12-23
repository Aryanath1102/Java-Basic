public class Pass_By_Value_Non_Primitive {
    public static void main(String[]args)
    {
        int [] a=new int[2];
        a[0]=2;
        a[1]=3;
        add(a);
        System.out.println("Result from main: " + (a[0]+a[1]));
    }
    static void add(int [] a)
    {

        a[0]=10;
        System.out.println("Result from main: "+(a[0]+a[1]));
    }
}
