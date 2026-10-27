class Solution {
    public int[] recoverOrder(int[] order, int[] friends) {
        int n = friends.length;
        int ans[] = new int[n];
        int c = 0;
        for(int i = 0;i<order.length;i++){
            for(int j = 0;j<n;j++){
                if(order[i] == friends[j]){
                    if(c <n){           
                    ans[c++] = order[i];
                    break;
                    }
                }

            }
            
        }
        return ans;
       
    }
}