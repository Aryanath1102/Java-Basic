public class Pass_by_value_non_primitive_java_object
{
    public static void main(String[]args)
    {
        Integer[] a =new Integer[2] ;
        a[0]=2;
        a[1]=3;
        add(a);
        System.out.println("Result from main: "+(a[0]+a[1]));

    }
    private static void add(Integer[] a)
    {
        a=new Integer[2];
        a[0]=10;
        a[1]=3;
        System.out.println("Result from Method: "+(a[0]+a[1]));
    }
}

