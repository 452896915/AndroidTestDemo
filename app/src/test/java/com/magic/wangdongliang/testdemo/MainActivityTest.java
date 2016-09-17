package com.magic.wangdongliang.testdemo;

import android.content.Context;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.junit.Assert.*;
import static org.mockito.Mockito.when;

/**
 * Created by wangdongliang on 16/9/17.
 */
@RunWith(MockitoJUnitRunner.class)
public class MainActivityTest {
    private static final String FAKE_STRING = "Hello world!";

    @Mock
    Context mMockContext;

    @Test
    public void testAdd_Without_Mock() throws Exception {
        assertEquals(MainActivity.add(1, 3), 4);
    }

    @Test
    public void testCombineString_With_Mock() {
        when(mMockContext.getString(R.string.hello_word))
                .thenReturn(FAKE_STRING);

        ClassUnderTest classUnderTest = new ClassUnderTest(mMockContext);

        String result = classUnderTest.combineString("Jack!");

        assertEquals(result, "Hello world! Jack!");
    }
}