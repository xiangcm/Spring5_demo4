package com.xiangcm.spring5.collectiontype;

/**
 * @ClassName: Course
 * @Description: 课程类
 * @Author: DELL
 * @Date: 2021/1/16 16:26
 **/
public class Course {
    private String couresName;

    public void setCouresName(String couresName) {
        this.couresName = couresName;
    }

    @Override
    public String toString() {
        return "Course{" +
                "couresName='" + couresName + '\'' +
                '}';
    }
}
