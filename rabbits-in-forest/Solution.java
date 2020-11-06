class Solution {
    public int numRabbits(int[] answers) {
        if(answers==null){
            return 0;
        }
        else{
            int rabbits=0;
            int [] seen = new int [1000];
            for(int i=0;i<answers.length;i++){
                    if(seen[answers[i]]==0){
                        seen[answers[i]]+=answers[i];
                        rabbits+=(answers[i]+1);
                    }
                    else{
                        seen[answers[i]]--;
                    }
                }
            return rabbits;
        }
    }
}