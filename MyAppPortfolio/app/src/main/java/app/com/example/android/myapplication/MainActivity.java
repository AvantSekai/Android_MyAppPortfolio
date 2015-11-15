package app.com.example.android.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Launch Application of button pressed (Currently just displays toast on press)
    public void launchApp(View view) {
        // Retrieve view data on current button pressed.
        Button currButton = (Button)view;
        String buttonText = currButton.getText().toString();

        // Create data needed for toast display
        Context context = getApplicationContext();
        CharSequence text = "This button will launch my " + buttonText;
        int duration = Toast.LENGTH_SHORT;

        Toast toast = Toast.makeText(context, text, duration);
        toast.show();

    }
}
