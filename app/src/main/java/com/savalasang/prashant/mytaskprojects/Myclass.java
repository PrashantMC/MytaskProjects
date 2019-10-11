package com.savalasang.prashant.mytaskprojects;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public  class Myclass {

    public static void main(String[] args) {
        Perm perm = new Perm();
        int values[] = {1,2,3};
        perm.findPerm(values,0);
        perm.printData();

    }
}
class Perm{
    ArrayList<String> data = new ArrayList<>();
    void findPerm(int temp[],int begin){
        for (int i = begin; i <temp.length ; i++) {
            int local = temp[i];
            temp[i] = temp[begin];
            temp[begin] = local;
            print(temp);
            findPerm(temp,begin+1);
        }


    }
    private void print(int values[]){
        StringBuffer buffer = new StringBuffer();

        for (int val:values) {
            buffer.append(val);
        }
        data.add(buffer.toString());
    }
     void printData(){
        for (String key:data) {
            System.out.println(key);
        }
    }
}

