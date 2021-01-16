package com.xiangcm.spring5.collectiontype;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @ClassName: Stu
 * @Description: TODO
 * @Author: DELL
 * @Date: 2021/1/16 14:59
 **/
public class Stu {
    // 1 数组类型属性
    private String[] arrays;
    // 2 list集合属性
    private List<String> lists;
    // 3 map集合属性
    private Map<String,String> maps;
    // 4 set集合属性
    private Set<String> sets;
    // 5 list集合属性，值为Course
    private List<Course> courses;

    public void setCourses(List<Course> courses) {
        this.courses = courses;
    }

    public void setArrays(String[] arrays) {
        this.arrays = arrays;
    }

    public void setLists(List<String> lists) {
        this.lists = lists;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public void setSets(Set<String> sets) {
        this.sets = sets;
    }

    @Override
    public String toString() {
        return "Stu{" +
                "arrays=" + Arrays.toString(arrays) +
                ", lists=" + lists +
                ", maps=" + maps +
                ", sets=" + sets +
                '}';
    }

    public void test(){
        System.out.println(toString());
        System.out.println(courses);
    }
}
