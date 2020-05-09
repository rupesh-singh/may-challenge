class Solution {
    public boolean isPerfectSquare(int num) {
        if(num==0)
            return false;
        
        int count=0;
        while(num%2==0){
            
            num=num>>1;
            count++;
        }
        
        if(count>0 && count%2!=0)
            return false;
        
        for(int i =3;i<=Math.sqrt(num);i=i+2){
            count=0;
            while(num%i==0){
                num=num/i;
                count++;
            }
            if(count>0 && count%2!=0)
                return false;
        }
        
        if(num>2)
            return false;
        
        return true;
        
        
        
    }
}