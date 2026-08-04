class Solution {
    public int romanToInt(String s) {
        int ans=0;
        for(int i=0;i<s.length()-1;i++){
            int curr=helper(s.charAt(i));
            int next=helper(s.charAt(i+1));
            if(curr<next){
                ans-=curr;
            }else{
                ans+=curr;
            }
        }
        ans+=helper(s.charAt(s.length()-1));
        return ans;
    }
    private int helper(char ch){
        switch(ch){
                case 'I':
                    return 1;
                case 'V':
                    return 5;
                case 'X':
                    return 10;  
                case 'L':
                    return 50;  
                case 'C':
                    return 100;
                case 'D':
                    return 500;
                case 'M':
                    return 1000;   
                default: 
                    return 0;                
        }
    }
}