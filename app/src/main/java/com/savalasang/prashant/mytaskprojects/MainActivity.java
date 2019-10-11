package com.savalasang.prashant.mytaskprojects;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.ArrayList;
import java.util.Stack;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public static void main(String[] args) {
        ArrayList<String> result  = new ArrayList<>();
        ArrayList<String> matchs = new ArrayList<>();
        String pal = "sd lkjhgfdcbsbcdfghjkl ds";
        char[] chars = pal.toCharArray();
        for (int i = 0; i <chars.length ; i++) {
            int low = i-1;
            int high = i+1;
            result.add(chars[i]+"");
            while (low>=0&&high<chars.length){
                if(chars[low]==chars[high]) {
                    result.add(0,chars[low]+"");
                    result.add(chars[low]+"");
                    low--;
                    high++;
                    System.out.println(result);
                }else {
                    break;
                }
            }
            result.clear();
        }
    }


}