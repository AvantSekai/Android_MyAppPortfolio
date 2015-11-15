package app.com.example.android.myapplication;

import com.robotium.solo.Solo;
import app.com.example.android.myapplication.MainActivity;
import android.test.ActivityInstrumentationTestCase2;

import java.lang.Exception;
import java.lang.Override;

/**
 * Created by shavant on 11/9/15.
 */
public class MainActivityTest extends ActivityInstrumentationTestCase2<MainActivity> {
    private Solo solo;

    public MainActivityTest() {
        super(MainActivity.class);
    }

    @Override
    public void setUp() throws Exception {
        solo = new Solo(getInstrumentation(), getActivity());
    }

    @Override
    public void tearDown() throws Exception {
        //tearDown() is run after a test case has finished.
        //finishOpenedActivities() will finish all the activities that have been opened during the test execution.
        solo.finishOpenedActivities();
    }

    public void testRun() throws Exception {
        //Unlock the lock screen and test button pushes
        solo.unlockScreen();
        // Spotify button test
        solo.clickOnButton("Spotify Streamer");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my Spotify Streamer"));

        // Scores Button Test
        solo.clickOnButton("Scores App");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my Scores App"));

        // Library Button Test
        solo.clickOnButton("Library App");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my Library App"));

        // Build it Bigger
        solo.clickOnButton("Build it Bigger");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my Build it Bigger"));

        // XYZ Button Test
        solo.clickOnButton("XYZ Reader");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my XYZ Reader"));

        // Capstone Button Test
        solo.clickOnButton("Capstone");
        solo.waitForActivity("MainActivity");
        assertTrue(solo.waitForText("launch my Capstone: My Own App"));

    }
}
