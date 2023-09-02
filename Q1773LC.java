import java.util.ArrayList;
import java.util.List;

public class Q1773LC {
    public static int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int check=0;
        int countMatch=0;
        if ((ruleKey.equals("type"))) {
            check=0;
        }
        if ((ruleKey.equals("color"))) {
            check=1;
        }
        if ((ruleKey.equals("name"))) {
            check=2;
        }
        for (int i = 0; i < items.size(); i++) {
            if ((items.get(i)).get(check).equals(ruleValue)) {
                countMatch+=1;
            }
        }
        return countMatch;
    }
    public static void main(String[] args) {
        List<List<String>> item = new ArrayList<>();
        
        List<String> temp = new ArrayList<>();
        temp.add("phone");
        temp.add("blue");
        temp.add("pixel");
        item.add(temp);

        temp.clear();
        temp.add("computer");
        temp.add("silver");
        temp.add("lenovo");
        item.add(temp);

        temp.clear();
        temp.add("phone");
        temp.add("gold");
        temp.add("yellow");
        item.add(temp);
         
        int ans = countMatches(item, "type", "phone");
        System.out.println(ans);


    }
}
