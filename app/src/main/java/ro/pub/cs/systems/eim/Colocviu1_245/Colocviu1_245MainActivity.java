package ro.pub.cs.systems.eim.Colocviu1_245;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class Colocviu1_245MainActivity extends AppCompatActivity {


    int firstTime = 1;
    String concatenated;
    String newEntry;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_practical_test01_245_main);
        int ANOTHER_ACTIVITY_REQUEST_CODE = 1;


        final EditText input = findViewById(R.id.NextTerm);
        final TextView result = findViewById(R.id.AllTerms);
        final Button button = findViewById(R.id.Add);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                newEntry = input.getText().toString();


                if (newEntry.isEmpty()) {
                    result.setText(concatenated);
                } else {
                    if (firstTime == 1) {
                        firstTime = 0;
                        result.append(newEntry);
                    } else {
                        result.append("+" + newEntry);

                    }

                }
            }
        });

        String toBeParsed = result.getText().toString();
        Intent intent = new Intent("ro.pub.cs.systems.eim.Colocviu1_245.Colocviu1_245SecondaryActivity");
        intent.putExtra("toBeAdded", toBeParsed);
        startActivityForResult(intent, ANOTHER_ACTIVITY_REQUEST_CODE);
    }

}
