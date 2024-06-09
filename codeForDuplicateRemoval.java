import java.util.*; 

class codeForDuplicateRemoval
{
    static int removeDuplicates(int arr[], int n)
    {
        if (n == 0 || n == 1)
            return n;
    
        int j = 0;
    
        for (int i = 0; i < n-1; i++)
            if (arr[i] != arr[i+1])
                arr[j++] = arr[i];
    
        arr[j++] = arr[n-1];
    
        return j;
    }
    
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt(); 
        int[] arr = new int[n];   
        for(int i=0; i<n; i++)  
        {   
               arr[i]=sc.nextInt();  
        } 
        
        n = removeDuplicates(arr, n);
    }
}
