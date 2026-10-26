class Solution {
    public int maxFreqSum(String s) {
        String s1 ="";
        String s2 ="";
        char ch =' ';
        for(int i = 0;i <s.length();i++){
            ch = s.charAt(i);
            if(ch =='a' || ch =='e' || ch =='i' || ch =='o' || ch =='u'){
                s1 +=s.charAt(i);
            }
            else{
                s2+=s.charAt(i);
            }
        }
        HashMap<Character,Integer> map1 = new HashMap<>();
        HashMap<Character,Integer> map2 = new HashMap<>();
        for(int i = 0;i <s1.length();i++){
            map1.put(s1.charAt(i),map1.getOrDefault(s1.charAt(i),0) +1);
        }
        for(int i = 0;i <s2.length();i++){
            map2.put(s2.charAt(i),map2.getOrDefault(s2.charAt(i),0) +1);
        }
        int max1 = 0;
        int max2 = 0;
        for(Character ch1:map1.keySet()){
            if(map1.get(ch1) > max1){
                max1 = map1.get(ch1);
            }
        }
        for(Character ch2:map2.keySet()){
            if(map2.get(ch2) > max2){
                max2 = map2.get(ch2);
            }
        }
        return max1 + max2;
        
    }
}