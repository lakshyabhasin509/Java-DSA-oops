import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
class GameOfThrones {
    public static void main(String args[] ) throws Exception {
        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        HashMap<Character,Integer> map=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(map.containsKey(ch)){
                map.put(ch,map.get(ch)+1);
            }else{
                map.put(ch,1);
            }

        }
        int count=0;
        for(int i : map.values()){
            if(i%2!=0)count++;
        }
        if(count>1)
            System.out.println("YES");
        else
            System.out.println("NO");  // Writing output to STDOUT
    }
}
