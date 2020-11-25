class Solution {
    public int hIndex(int[] citations) {
        Arrays.sort(citations);
        if(citations.length==0||citations[citations.length-1]==0){
            return 0;
        }
        int remaining=citations.length;
        for(int i = citations.length-1;i>0;i--){
            remaining=citations.length-i;
            if(citations[i]>=remaining&&citations[i-1]<=remaining){
                return remaining;
            }
        }
        return citations.length;
    }
}