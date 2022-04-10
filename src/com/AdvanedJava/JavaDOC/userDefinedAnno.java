package com.AdvanedJava.JavaDOC;
@interface myAnno{
    String name();
    String project();
    String date();
    String version();
}
@myAnno(name="lakshya",project = "demo",date="10th april 2022",version ="java 17")
public class userDefinedAnno {
//    i can use annotation over here as well
    int data;
//annotation can be used in methods as well


}
