class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int [] check = new int[501];//will need to subtract indice-1
        HashMap<Integer, List<Integer>> groups = new HashMap<Integer,List<Integer>>();
        LinkedList<List<Integer>> finalGroups = new LinkedList<List<Integer>>();
        HashSet<Integer> keys = new HashSet<Integer>();
        for(int i=0;i<groupSizes.length;i++){
            if(check[groupSizes[i]]==0){
                if(groups.get(groupSizes[i])!=null){
                    finalGroups.add(groups.get(groupSizes[i]));
                }
                keys.add(groupSizes[i]);
                check[groupSizes[i]]=groupSizes[i]-1;
                groups.put(groupSizes[i],new LinkedList<Integer>());
                groups.get(groupSizes[i]).add(i);
            }
            else{
                check[groupSizes[i]]--;
                groups.get(groupSizes[i]).add(i);
            }
        }
        Iterator<Integer> keysLeft = keys.iterator();
        while(keysLeft.hasNext()){
            finalGroups.add(groups.get(keysLeft.next()));
        }
        return finalGroups;
    }
}