package com.sunny.mywords;

import android.content.Context;
import android.support.test.InstrumentationRegistry;
import android.support.test.runner.AndroidJUnit4;
import android.util.Log;

import com.sunny.mywords.entity.YDWord;
import com.sunny.mywords.network.HtmlWordGetter;

import org.junit.Test;
import org.junit.runner.RunWith;

import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class MyWordsTest {
    private static final String TAG = "TEST";

    @Test
    public void useAppContext() throws Exception {
        // Context of the app under test.
        Context appContext = InstrumentationRegistry.getTargetContext();

        assertEquals("com.sunny.mywords", appContext.getPackageName());
    }
    @Test
    public void testQueryWord() throws Exception{
        HtmlWordGetter htmlWordGetter=new HtmlWordGetter();
        YDWord hello = htmlWordGetter.queryWord("hello");
        Log.i(TAG, "testQueryWord: "+hello);

    }
}
