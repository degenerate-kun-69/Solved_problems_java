public class hashcode_test
{
    public static void main(String[] args)
    {
        String str1= new String();
        String str2= new String();
        str1 ="degen05kun";
        str2 = "degen05kun";
        int n1 = 55;
        int n2 = 55;
        System.out.println(str1.hashCode());
        System.out.println(str2.hashCode());
        // if the value of the string is same, hashcode is also same( hashcode is the memory address where string has been stored.
     /*
        System.out.println(n1.hashCode());
        System.out.println(n2.hashCode());*/
// integer class does not support using hashcode.
    }
}
