package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PaintingActivity extends AppCompatActivity {

    Button btWall = null;
    Button btDoor = null;
    Button btTable = null;
    Button btBack = null;
    Button btErase = null;
    Button btSave = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        btWall = findViewById(R.id.painting_btWall);
        btDoor = findViewById(R.id.painting_btDoor);
        btTable = findViewById(R.id.painting_btTable);
        btBack = findViewById(R.id.painting_btBack);
        btErase = findViewById(R.id.painting_btErase);
        btSave = findViewById(R.id.painting_btSave);

        setButton();

    }

    private void setButton() {
        btWall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btDoor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        btErase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        btSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


}