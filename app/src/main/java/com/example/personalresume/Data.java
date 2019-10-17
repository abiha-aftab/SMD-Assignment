package com.example.personalresume;

import com.example.personalresume.model.Education;
import java.util.ArrayList;

public class Data {
    public static ArrayList<Education> getData(){
        ArrayList<Education> data= new ArrayList<>();

        String [] s= {"National University of Computer and Emerging Sciences (FAST-NU)","Bachelors of Computer Science","2016-Present","CGPA:3.42"};
        String [] s1= {"Lahore College for Women University (LCWU)","FSc. Pre-Engineering","2014-2016","86.4%"};

        Education e= new Education();
        for(int j=0; j<4; j++){
            e.edu[j]=s[j];
        }
        Education e1= new Education();
        for(int j=0; j<4; j++){
            e1.edu[j]=s1[j];
        }
        e.imageId=R.drawable.fastlogo;
        data.add(e);
        e1.imageId=R.drawable.lcwulogo;
        data.add(e1);
        return data;
    }
}
