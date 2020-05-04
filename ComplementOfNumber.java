class Solution {
    public int findComplement(int num) {
//         String rev="";
//         if(num==0)
//             return 1;
//         while(num>0){
//             int mod=num%2;
//             num=num/2;
//             rev=rev+""+mod;
//         }
        
//         return back2Num(rev);
        
        int numberOfBits = (int)(Math.floor(Math.log(num)/Math.log(2)))+1;
        return ((1<<numberOfBits)-1)^num;
    }
    
    public int back2Num(String rev){
        if(rev.isEmpty())
            return 0;
        // System.out.println(rev);
        int num=0;
        for(int i=0;i<rev.length();i++){
            if(rev.charAt(i)=='0')
                num = num + ((int)Math.pow(2,i));
        }
            
        return num;
    }
}