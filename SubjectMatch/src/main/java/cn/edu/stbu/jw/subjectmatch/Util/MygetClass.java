package cn.edu.stbu.jw.subjectmatch.Util;

import cn.edu.stbu.jw.subjectmatch.Entity.CompetitionInfo;

public class MygetClass {

    public static  <T> T getClass( Class<T> type ){
        return (T) type;
    }

    public static void main(String[] args) {
        System.out.println(MygetClass.getClass(CompetitionInfo.class));
    }
}
