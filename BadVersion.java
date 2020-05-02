/* The isBadVersion API is defined in the parent class VersionControl.
      boolean isBadVersion(int version); */

      public class Solution extends VersionControl {
        public int firstBadVersion(int n) {
            
            int first=1,last=n,middle=0;
            boolean out=false;
            
            while(first<=last){
                
                /**
                 * 
                 * Here we have calculated middle element in differet way. 
                 * Reason being is we do in traditional way, sum might get overflow.
                 * And at times, we might get OutOfBondException
                 * 
                 */

                middle = first + ((last - first) / 2); 
                out=isBadVersion(middle);
                
                if(out==false){
                    first=middle+1;
                }
                else if(out==true){
                    if(isBadVersion(middle-1)==false)
                        return middle;
                    else
                        last=middle-1;
                }
            }
            return -1;
        }
    }