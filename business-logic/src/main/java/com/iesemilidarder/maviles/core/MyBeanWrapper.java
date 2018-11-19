package com.iesemilidarder.maviles.core;

import com.iesemilidarder.maviles.core.data.MyBean;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyBeanWrapper {


    // Lista

    public static List<MyBean> items = new ArrayList<MyBean>(Arrays.asList(

            new MyBean("Name1", "Description1", "Date1", 7.50),
            new MyBean("Name2", "Description2", "Date2", 8.50),
            new MyBean("Name3", "Description3", "Date3", 9.50),
            new MyBean("Name4", "Description4", "Date4", 10.50)));

    // Método para mostrar todos los elementos

    public static List<MyBean> getItems(){

        return items ;
    }

    // Método para filtrar por Nombre

    public static MyBean getName(String name){

        for (MyBean it : items) {

            if ( it.getName().equals(name)){

                return it;
            }
        }
        return null;
    }

    public static void addItem(MyBean it) {

        return;
    }



}