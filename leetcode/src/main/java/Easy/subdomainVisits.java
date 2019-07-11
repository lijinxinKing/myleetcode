package Easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class subdomainVisits {
    public static List<String> subdomainVisits(String[] cpdomains) {
        if(cpdomains == null || cpdomains.length == 0){
            return null;
        }
        Map<String,Integer> cpdomainMap = new HashMap<>();
        List<String> result = new ArrayList<>();

        for (int i = 0;i < cpdomains.length;i ++){
            String temp = cpdomains[i];
            int times = Integer.parseInt(temp.split(" ")[0]);
            String key = temp.split(" ")[1];
            if (cpdomainMap.containsKey(key)){
                int value =  cpdomainMap.get(key);
                cpdomainMap.replace(key,value + times);
            }else{
                cpdomainMap.put(key, times);
            }
            System.out.println(key+","+times);
            AddKeyValue(key,cpdomainMap,times);

        }
        System.out.println(cpdomainMap);
        return null;
    }
    public static  void AddKeyValue(String key,Map<String,Integer> cpdomainMap,int times){

        for (String keyVal:key.split("\\.")){
            if (cpdomainMap.containsKey(keyVal)){
                int value =  cpdomainMap.get(keyVal);
                cpdomainMap.replace(keyVal,value + times);
                System.out.println(keyVal +"," + times);
            }else{
                cpdomainMap.put(keyVal, times);
                System.out.println(keyVal +"," + times);
            }
        }

    }

    public static void main(String[] args) {
        subdomainVisits(new String[]{"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"});
    }
}
