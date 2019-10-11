// Compare Version Numbers
// Leetcode Problem 165
// https://leetcode.com/problems/compare-version-numbers/

class Solution{
    public static int compareVersion(String version1, String version2){
        int[] v1 = versionToIntArray(version1);
        int[] v2 = versionToIntArray(version2);
        int i = 0;
        while(i < v1.length && i < v2.length)
            if(v1[i]>v2[i]) return 1;
            else if(v2[i]>v1[i]) return -1;
            else i++;
        while(i < v1.length) if(v1[i++] > 0) return 1;
        while(i < v2.length) if(v2[i++] > 0) return -1;
        return 0;
    }

    public static int[] versionToIntArray(String version){
        String[] numbers = version.split("\\.");
        int[] out = new int[numbers.length];
        for(int i = 0; i < out.length; i++)
            out[i] = Integer.parseInt(numbers[i]);
        return out;
    }
}
