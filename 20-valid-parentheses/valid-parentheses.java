class Solution {
    public boolean isValid(String s) {
        Stack<Character> str=new Stack<>();
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(c=='('||c=='{'||c=='['){
                str.push(c);
            }else{
                if(str.size()==0){
                    return false;
                }
                if((str.peek()=='(' && c==')')||
                (str.peek()=='{' && c=='}')||
                (str.peek()=='[' && c==']')){
                    str.pop();
                }else{ //no match found 
                    return false;
                }
            }
        }
        return str.size()==0;
    }
}