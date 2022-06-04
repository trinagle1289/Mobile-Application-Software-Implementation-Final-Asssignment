package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class PaintingActivity extends AppCompatActivity {

    RelativeLayout rlBkg = null;

    // 螢幕寬跟高資料
    int screenWidth, screenHeight;

    Bitmap tableBmp; // 抓圖案

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        rlBkg = findViewById(R.id.painting_bkg);

        // 抓畫面資料
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;

        tableBmp = BitmapFactory.decodeResource(getResources(), R.drawable.table);

        Item item = new Item(this, tableBmp, 200, 200);
        rlBkg.addView(item);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        return super.onTouchEvent(event);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_draw, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.menu_add_door:
                break;
            case R.id.menu_add_table:
                break;
            case R.id.menu_add_wall:
                break;
            case R.id.menu_clear:
                break;
            case R.id.menu_save:
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    // 生成物件
    private void generateItem(Item item) {

    }

    // 清除所有物件
    private void clear() {

    }

    // 存取檔案
    private void save() {

    }

}

