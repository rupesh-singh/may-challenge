public class Solution {
    public String removeKdigits(String num, int k) {
        if(k==0)
            return num;
        if(k==num.length())
            return 0+"";
        
        Deque<Character> deque = new LinkedList<Character>();
        char[] c= num.toCharArray();
        
        for(int i = 0;i<c.length;i++){
            
            while(deque.size()!=0 && c[i]<deque.peekLast() && k!=0)
            {
                k--;
                deque.removeLast();
            }
            deque.add(c[i]);
        }
       
        for(int i = 0;i<k;i++)
            if(deque.size()>0)
                deque.removeLast();
        
        StringBuilder output= new StringBuilder();
        for(Character ch: deque){
            output.append(ch);
        }
        
        while(output.length() > 1 && output.charAt(0) == '0'){
            output.deleteCharAt(0);
        }
        
        return output.toString();
    }
    
}class RemoveKthElement {
    
}