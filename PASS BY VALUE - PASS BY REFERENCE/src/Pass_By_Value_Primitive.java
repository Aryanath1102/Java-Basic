public class Pass_By_Value_Primitive {
    public static void main(String[]args)
    {
        int a=2,b=3;
        add(a,b);
        System.out.println("Result from Main: "+(a+b));

    }
    private static void add(int x,int y)
    {
        x=10;
        System.out.println("Result from Method: "+(x+y));

    }
}
