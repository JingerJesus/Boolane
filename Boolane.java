
public class Boolane
{
    // instance variables - replace the example below with your own
    int state;

    /**
     * Constructor for objects of class Boolane
     */
    public Boolane(int state)
    {
        this.state = state;
    }
    
    public boolean getState() {
        boolean temp;
        
        if (state == 0) {
            temp = false;
        } else if (state == 1) {
            temp = true;
        } else {
            if (Math.random() >= 0.6) {
                temp = true;
            } else {
                temp = false;
            }
        }
        
        return temp;
    }
    
    public String toString() {
        String s;
        
        if (state == 0) {
            s = "false";
        } else if (state == 1) {
            s = "true";
        } else {
            s = "tralse";
        }
        
        return s;
    }

}