

public class Test
{
    // public static int unique(int arr[])
    // {
    //     HashMap<Integer, Integer> cache = new HashMap<>();
    //     for (int i = 0; i < arr.length; i++) 
    //         cache.put(arr[i], cache.getOrDefault(arr[i], 0)+1);   
    //     int count = 0;
    //     for(Map.Entry<Integer, Integer> entry : cache.entrySet())
    //     {
    //         if(entry.getValue() != 0)
    //         {
    //             arr[count] = entry.getKey();
    //             count++;
    //         }
    //     }
    //     return count;
    // }
    public static int check(int arr[])
    {
        int i = 0,j = 0, count = 1;
        while(j++ < arr.length)
        {
            if(arr[i] < arr[j])
            {
                arr[count] = arr[j];
                count++;
                i = j;
            }
        }
        return count;
    }
    public static void main(String[] args) 
    {
    }
}