public class Day_4 {
    public static void main(String[] args) {
        
    }
    /* 1.When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars. Return true if the party with the given values is successful, or false otherwise.


cigarParty(30, false) → false
cigarParty(50, false) → true
cigarParty(70, true) → true
*/
public boolean cigarParty(int cigars, boolean isWeekend) {
  if(isWeekend){
    if(cigars>=40){
        return true;
    }else{
        return false;
    }
  }else{
    if(cigars>=40 && cigars<=60){
        return true;
    }else{
        return false;
    }
    }
  }
}
// git init
// git add
// git commit -m "changed made"
// git remote add origin "https://github.com/smiley-hasmi/basicjava_user/tree/main/JAVA_BATCH_6/src"