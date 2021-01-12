public class leetcode_91 {
    
    public static int solve(int index, String str, String s)
    {
        if(index == str.length())
        {
            System.out.println(s);
            return 1;
        }

        if(str.charAt(index) == '0')
        {
            return 0;
        }

        int count = 0;
        count += solve(index + 1, str, s + str.charAt(index) + " ");

        if(index < str.length() - 1)
        {
            int num = (str.charAt(index) - '0')*10 + (str.charAt(index + 1) - '0');

            if(num <= 26)
            count += solve(index + 2, str, s + str.substring(index, index + 2) + " ");
        }

        return count;
    }

    public static void main(String[] args)
    {
        String str = "137";

        System.out.println(solve(0, str, ""));
        //System.out.println("India Incredible");
    }
}
