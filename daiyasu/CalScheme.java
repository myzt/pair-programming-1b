import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class CalScheme{

    public static void main(String[] args){
	int date[];
	System.out.println(args[0]);
	String[] temp = args[0].split("-");
	for(int i=0; i<temp.length; i++){
	    date[i] = Integer.perseInt(temp[i]);
	    System.out.println(temp[i]);
	}
	if(date[0]>1867 && date[0]<1913){
	    System.out.println("明治"+date[0]+"年"+date[1]+"月"+date[2]+"日");
	}
    }

}