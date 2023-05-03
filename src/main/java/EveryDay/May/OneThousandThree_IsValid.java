package EveryDay.May;

public class OneThousandThree_IsValid {
    public static void main(String[] args) {

    }
    public boolean isValid(String s) {
//        while (!s.isEmpty()){
//            if(!s.contains("abc")) return false;
//            int index = s.indexOf("abc");
//            s = s.substring(0,index)+s.substring(index+3);
//        }
//        return true;
        StringBuilder stringBuilder = new StringBuilder();
        for(int i = 0;i<s.length();i++){
            stringBuilder.append(s.charAt(i));
            if(stringBuilder.length()>=3&&stringBuilder.substring(stringBuilder.length()-3).equals("abc"))
                stringBuilder.delete(stringBuilder.length()-3,stringBuilder.length());
        }
        return stringBuilder.isEmpty();
    }
}
