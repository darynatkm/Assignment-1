package assignment14;

import java.util.*;
/** * represents basic Color class example */
public class Color {
    //rgb array with 3 ints is used to hold r,g,b values
private int[] rgb = new int[3];
/**     * Available colors - ready with rgb code     */
public final static int[] WHITE     = new int[]{255, 255, 255};
public final static int[] LIGHT_GREY = new int[]{192, 192, 192};
public final static int[] GREY      = new int[]{128, 128, 128};
public final static int[] DARK_GREY  = new int[]{64, 64, 64};
public final static int[] BLACK     = new int[]{0, 0, 0};
public final static int[] RED       = new int[]{255, 0, 0};
public final static int[] PINK      = new int[]{255, 175, 175};
public final static int[] ORANGE    = new int[]{255, 200, 0};
public final static int[] YELLOW    = new int[]{255, 255, 0};
public final static int[] GREEN     = new int[]{0, 255, 0};
public final static int[] MAGENTA   = new int[]{255, 0, 255};
public final static int[] CYAN      = new int[]{0, 255, 255};
public final static int[] BLUE      = new int[]{0, 0, 255};

    public Color(int r, int g, int b) {
        rgb[0]=r;
        rgb[1]=g;
        rgb[2]=b;
    }

    public Color(){
        this(255,255,255);
    }

    public String toString(){
if(Arrays.equals(rgb,WHITE))
    return "white";
else if(Arrays.equals(rgb,LIGHT_GREY))
            return "light grey";
else if(Arrays.equals(rgb,GREY))
    return "grey";
else if(Arrays.equals(rgb,DARK_GREY))
    return "dark grey";
else if(Arrays.equals(rgb,BLACK))
    return "black";
else if(Arrays.equals(rgb,RED))
    return "red";
else if(Arrays.equals(rgb,PINK))
    return "pink";
else if(Arrays.equals(rgb,ORANGE))
    return "orange";
else if(Arrays.equals(rgb,YELLOW))
    return "yellow";
else if(Arrays.equals(rgb,GREEN))
    return "green";
else if(Arrays.equals(rgb,MAGENTA))
    return "magenta";
else if(Arrays.equals(rgb,CYAN))
    return "blue";
else if(Arrays.equals(rgb,BLUE))
    return "blue";
else return "n/a";

    }

    // TODO    }    /**     * Override toString(from Object class).
    //  * Provides string description of the color like "red" ,"blue" based on
    //  * rgb value.     * Compare value of rgb array with static color code arrays
    //  * and find out what color it is. Arrays.equals(arr1,arr2) is easiest way
    //  * to compare 2 int arrays     * @returns a String color name like
    //  * "white" or "blue"
    //  * If rgb values does not match any available combinations, return "n/a"
    //  *     * Ex:* Color color = new Color();
    //  * System.out.println(color.toString() ) ;
    // prints "white"     *
    // * Color color = new Color(255, 0, 0);
    // * System.out.println(color.toString() ) ;
    // prints "red"     *
    // * Color color4 = new Color(192, 192, 192);
    // System.out.println(color4 ) ; // prints "light gray"
    // */    public String toString() {
    // TODO
    //  return null; /
    //  /change this to return colors
    }


