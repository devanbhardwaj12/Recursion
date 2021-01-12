class Horse_rooms
{
    public static int solve(int totalq, int totalr, int q, boolean[] vis, String str)
    {
        if(q == totalq)
        {
            System.out.println(str);
            return 1;
        }

        int count = 0;
        for(int i = 0; i < totalr; i++)
        {
            if(!vis[i])
            {
                vis[i] = true;
                count += solve(totalq, totalr, q + 1, vis, str + "Queen " + q + " in " + i + " ");
                vis[i] = false;
            }
            
        }

        return count;
    }
    public static void main(String[] args)
    {
        int rooms = 5;
        int queens = 3;

        boolean[] vis = new boolean[rooms];

        System.out.println(solve(queens, rooms, 0, vis, ""));
    }
}