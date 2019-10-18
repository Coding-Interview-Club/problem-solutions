// Repeated DNA Sequences
// Leetcode Problem 187
// https://leetcode.com/problems/repeated-dna-sequences/

class Solution{
    public List<String> findRepeatedDnaSequences(String s){
        int n = 10; // Size of substrings
        List<String> out = new ArrayList<String>();
        Set<String> seen = new HashSet<String>();
        
        String currentSequence = "";
        for(int i = 0; i < s.length()-n+1; i++){
            currentSequence = s.substring(i, i + n);
            if(seen.contains(currentSequence) && !out.contains(currentSequence))
                out.add(currentSequence);
            else
                seen.add(currentSequence);
        }
        
        return out;
    }
}
