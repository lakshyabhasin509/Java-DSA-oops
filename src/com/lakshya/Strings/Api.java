package com.lakshya.Strings;

import java.util.*;


public class Api {
    static class Pair{
        String password;
        boolean logedin;

        Pair(String p,boolean l){
            password=p;
            logedin=l;
        }
    }

    static Map<String ,Pair> map=new HashMap<>();
    static List<String> implementAPI(List<String> logs){
        int n=Integer.parseInt(logs.get(0));
        List<String> response=new ArrayList<>();
        for(int i=1;i<=n;i++){
            String req=logs.get(i);
            String[] param=req.split(" ");
            if(param[0].toLowerCase().equals("register")){
                response.add(registerReq(param[1],param[2]));
            }
            if(param[0].toLowerCase().equals("login")){
                response.add(loginReq(param[1],param[2]));
            }
            if(param[0].toLowerCase().equals("logout")){
                response.add(logoutReq(param[1]));
            }
        }
        return response;
    }

static String registerReq(String username, String password){
    if(map.containsKey(username)){
        // if username exists in map
      return new String("register unsuccessful");
    }
    else{
        map.put(username,new Pair(password,false));
        return new String("register successful") ;
    }
}
    static String loginReq(String username, String password){
        if(map.containsKey(username)){
            // if username exists in map
            if(map.get(username).logedin){
                return new String("login unsuccessful") ;
            }
            else if(map.get(username).password.equals(password)){
                map.put(username,new Pair(password,true));
                return new String("login successful") ;
            }
            else {
               return new String("login unsuccessful") ;
            }
        }
        else{
            return new String("login unsuccessful") ;
        }
    }

    static String logoutReq(String username){
        if(map.get(username).logedin){
            String password=map.get(username).password;
            map.put(username,new Pair(password,false));
            return new String("logout successful");
        }
        else return new String("logout unsuccessful");
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        List<String> list=new ArrayList<>();
        String s="";
        while(!s.equals("stop")){
            s=sc.nextLine();
            list.add(s);
        }

        list=implementAPI(list);
    for (int i = 0; i < list.size(); i++) {

        System.out.println(list.get(i));
    }
    }
}
