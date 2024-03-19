import java.util.*;
public class temp
{
    public static void main(String[] args)
    {
        HashMap<String,Integer> table = new HashMap<String,Integer>();

        table.put("test", 123);
        int ans = table.get("test");
        table.remove("test");
        table.clear();
        table.size();
        for (String s : table.keySet()) {
            
        }
        System.out.println();
    }
}