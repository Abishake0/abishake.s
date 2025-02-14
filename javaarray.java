import java.util.*;
class javaarray{
    static void main(String[] args){
        HashMap<String, String> arr=new HashMap();
        arr.put("TN", "Tamilnadu");
        arr.put("KL", "Keralam");
        arr.put("KA", "Karnataka");
        System.out.println(arr.get("TN"));
        System.out.println(arr.get("KL"));
        System.out.println(arr.get("KA"));
    }
}
