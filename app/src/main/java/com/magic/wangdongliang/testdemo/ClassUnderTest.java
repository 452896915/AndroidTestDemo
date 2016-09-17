package com.magic.wangdongliang.testdemo;

import android.content.Context;

/**
 * Created by wangdongliang on 16/9/17.
 */
public class ClassUnderTest {
    private Context context;

    public ClassUnderTest(Context context) {
        this.context = context;
    }

    public String combineString(String str) {
        return context.getString(R.string.hello_word) + " " + str;
    }
}
