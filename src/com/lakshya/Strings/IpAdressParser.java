package com.lakshya.Strings;

public class IpAdressParser {
    public static void main(String[] args) {
        IpAdressParser ob=new IpAdressParser();
        String ab=ob.defangIPaddr("11.11.1.2.12");
        System.out.println(ab);
    }
    public String defangIPaddr(String address) {
        StringBuilder s=new StringBuilder();
        for(int i=0;i<address.length();i++)
        {
            if(address.charAt(i)=='.'){
                s.append('[');
                s.append(address.charAt(i));
                s.append(']');


            }else
            s.append(address.charAt(i));
        }
        return s.toString();
    }
}
