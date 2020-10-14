import java.util.*;

public class Pratice
{
    public static void main(String[] args)
    {
        List <Integer> obj = new ArrayList<>();
        
        int mergeMin = 0;
        int mergeMax = 0;
        List <Integer> result = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enetr how many non-overlapping Intervals you want to enter : ");
        int n = sc.nextInt();
        n = n*2;
        System.out.println("Enter Sets  value : ");
       while(n!=0)
        {
            int k = sc.nextInt();
            obj.add(k);
            n--;
        }
        System.out.println("Eneter Merging set :  ");
        mergeMin = sc.nextInt();
        mergeMax  = sc.nextInt();
        
        int MIN = mergeMin,MAX =mergeMax;
        int m,k;
       int size = obj.size();
       
      for(int i =0;i<size;i++)
      {
          if(i%2 == 0)
          {
                 k = obj.get(i);
                if(k<mergeMin || k>mergeMax)
                {
                    i++;
                     m = obj.get(i);
                    if(m>mergeMax||m<mergeMin)
                    {
                        System.out.println("["+k+","+m+"]");
                    }
                    else{
                        if(MIN>k)
                        {
                            MIN= k;
                        }    
                    }
                    
                }else{
                    
                       
                        i++;
                         m = obj.get(i);
                        if(MAX<m)
                        {
                            MAX = m;
                        }    
                        
                    }
                }
          }
        
      
      System.out.println("["+MIN+","+MAX+"]");
        
    }
}