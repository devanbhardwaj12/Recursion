class arrangements
{
    public static int solve(String str, int index, String s)
    {
        if(index == str.length())
        {
            System.out.println(s);
            return 1;
        }

        int count = 0;

        char c = str.charAt(index);
        count += solve(str, index + 1, s + c);
        count += solve(str, index + 1, s);

        return count;
    }

    public static void main(String[] args)
    {
        String str = "123";

        System.out.println(solve(str, 0, ""));
    }
    
}