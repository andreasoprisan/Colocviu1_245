package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class Colocviu1_245SecondaryActivity extends AppCompatActivity {
    int n = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


            Intent intentFromParent = getIntent();
            final Bundle data = intentFromParent.getExtras();
            final String dataToBeAdded = data.get("toBeAdded").toString();

            String[] output = dataToBeAdded.split("/+");
            for (int i = 0; i < output.length; i++){
                n += Integer.parseInt(output[i]);
            }

            Intent intentToParent = new Intent();
            intentToParent.putExtra("computedValue", n);
            setResult(RESULT_OK, intentToParent);
            finish();
        }
}

