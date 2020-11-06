class Solution {
    public int[] deckRevealedIncreasing(int[] deck) {
        int [] answer = new int[deck.length];
        Arrays.sort(deck);
        int ind =0;
        boolean place = true;
        for(int i=0;ind<answer.length;i++){
            if(answer[i%deck.length]==0){
                if(place){
                    answer[i%deck.length]=deck[ind];
                    ind++;
                }
                place=!place;
            }
        }
        return answer;
    }
}