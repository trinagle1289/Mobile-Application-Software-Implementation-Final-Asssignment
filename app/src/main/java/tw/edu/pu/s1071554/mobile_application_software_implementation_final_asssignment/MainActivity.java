package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btStart = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btStart = findViewById(R.id.main_btStart);
        setButton();
    }

    private void setButton() {

        btStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent it = new Intent(MainActivity.this, PaintingActivity.class);
                startActivity(it);
            }
        });

    }

}