package testapp.v20.co.jp.testapplication

import android.support.test.runner.AndroidJUnit4
import android.support.test.rule.ActivityTestRule
import android.widget.TextView
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

/**
 * Instrumented test, which will execute on an Android device.
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
@RunWith(AndroidJUnit4::class)
class MainInstrumentedTest {

    private lateinit var message: TextView

    @Rule
    @JvmField
    var mActivityTestRule = ActivityTestRule(MainActivity::class.java)

    @Test
    fun _初期表示_MainActivity() {
        // Context of the app under test.
        message = mActivityTestRule.activity.findViewById(R.id.hello_world)
        Assert.assertEquals("Hello World!", message.text)
    }
    
}
