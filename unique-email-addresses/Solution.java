// Unique Email Addresses
// Leetcode problem 929
// https://leetcode.com/problems/unique-email-addresses/

class Solution {
    // Implementation that prioritizes low memory usage over
    // low running time.
    public int numUniqueEmails(String[] emails) {
        String[] processedEmails = new String[emails.length];
        Map<String, Integer> map = new HashMap<>();
        
        for(int i = 0; i < emails.length; i++){
            String[] temp = emails[i].split("@");
            String local = temp[0];
            String domain = temp[1];

            if(local.indexOf('+') >= 0)
                local = local.substring(0, local.indexOf('+'));
            
            local = local.replaceAll("\\.", "");
            processedEmails[i] = local + '@' + domain;
            System.out.println(processedEmails[i]);
        }
        
        for(String x: processedEmails)
            map.put(x, map.getOrDefault(x, 0)+1);
        return map.size();
        
    }
}