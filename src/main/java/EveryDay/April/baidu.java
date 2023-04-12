package EveryDay.April;

import javax.sound.midi.Soundbank;
import java.util.*;

public class baidu {
//    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int n = in.nextInt();
//        int k = in.nextInt();
//        in.nextLine();
//        String s = in.nextLine();
//        String[] strs = s.split(" ");
//        int[] a = new int[n];
//        for(int i = 0;i<n;i++){
//            a[i] = Integer.parseInt(strs[i]);
//        }
//        Arrays.sort(a);
//        double sum = 0,temp = 0;
//        for(int i = 0;i<k-1;i++){
//            sum+=a[i];
//        }
//        for(int i = k-1;i<n;i++){
//            temp+=a[i];
//        }
//        double result = temp/(n-k+1)+sum;
//        System.out.println(result);
//    }

    //    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        int[] a = new int[100000];
//        int n = in.nextInt();
//        a[1] = 1;
//        for(int i = 2;i<100000;i++) a[i] = i+a[i-1];
//        StringBuilder sb = new StringBuilder();
//        int x = 0,y=0,z=0;
//        for(int i = 1;i<100000;i++){
//            if(a[i]==n){
//                for(int j = 0;j<i;j++) sb.append("r");
//                System.out.println(sb.toString());
//                return;
//            }else if(a[i]>n){
//                x = a[i-1];
//                for(int j = 0;j<i-1;j++) sb.append("r");
//                break;
//            }
//        }
//        for(int i = 1;i<100000;i++){
//            if(a[i]==n-x){
//                for(int j = 0;j<i;j++) sb.append("e");
//                System.out.println(sb.toString());
//                return;
//            }else if(a[i]>n-x){
//                y = a[i-1];
//                for(int j = 0;j<i-1;j++) sb.append("e");
//                break;
//            }
//        }
//        for(int i = 1;i<100000;i++){
//            if(a[i]==n-x-y){
//                for(int j = 0;j<i;j++) sb.append("d");
//                System.out.println(sb.toString());
//                return;
//            }else if(a[i]>n-x){
//                z = a[i-1];
//                for(int j = 0;j<i-1;j++) sb.append("d");
//                break;
//            }
//        }
//        for(int i = 0;i<n-x-y-z;i++){
//            switch(i%3){
//                case 0:{sb.append("r");break;}
//                case 1:{sb.append("e");break;}
//                case 2:{sb.append("d");break;}
//            }
//        }
//        System.out.println(sb.toString());
//    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        Map<String, List<String[]>> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String s = in.nextLine();
            int left = s.indexOf('(');
            String before = s.substring(0, left);
            String after = s.substring(left + 1, s.length() - 1);
            String[] strs = before.split(" ");
            String[] strs1 = after.split(",");
            String key = strs[1];
            String[] value = new String[strs1.length];
            for (int j = 0; j < strs1.length; j++) {
                String[] strs2 = strs1[j].split(" ");
                value[j] = strs2[0];
            }
            boolean flag = false;
            if (map.containsKey(key)) {
                for(int k = 0;k<map.get(key).size()&&!flag;k++){
                    for(int m = 0;m<map.get(key).get(k).length&&!flag;m++){
                        if(!map.get(key).get(k)[m].equals(value[m])){
                            List<String[]> list = map.get(key);
                            list.add(value);
                            map.put(key,list);
                            break;
                        }
                        flag = true;
                    }
                }
                System.out.println(flag?"No":"Yes");
            } else {
                System.out.println("Yes");
                List<String[]> list = new ArrayList<>();
                list.add(value);
                map.put(key, list);
            }
        }
    }
}
