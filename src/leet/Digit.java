package leet;

public class Digit {
	public boolean isNumber(String s) {
        boolean isDecimal=false;
        boolean isSign=false;
        boolean isDigit=false;
        boolean isE=false;
        
        for(char c:s.toCharArray()){
            if(c == '+' || c== '-'){
                if(isSign||isDigit||isE||isDecimal)
                    return false;
                isSign=true;
            }
            else if(c=='.'){
                if(isDecimal || (!isDigit))
                    return false;
                isDecimal=true;
            }else if(c=='e'){
                if(!isDigit)
                    return false;
                isE=true;
            }else if(new String(c+"").matches("[0-9]+")){
                isDigit=true;
            }else{
                return false;
            }
        }
        return true;
    }
}
