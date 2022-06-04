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

    enum ItemSelect {
        Table,
        Door,
        Wall
    }

    RelativeLayout rlBkg = null;

    // 螢幕寬跟高資料
    int screenWidth, screenHeight;

    Bitmap tableBmp; // 抓圖案

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        rlBkg = findViewById(R.id.painting_bkg);

        genItem(ItemSelect.Table);

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
    private Item genItem(ItemSelect itemSelect) {
        Bitmap bmp;


        switch (itemSelect) {
            case Table:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.table);
                break;
            case Door:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.table);
                break;
            case Wall:
                bmp = BitmapFactory.decodeResource(getResources(), R.drawable.table);
                break;
            default:
                return null;
        }

        // 抓畫面資料
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;

        Item item = new Item(this, bmp, screenWidth / 2, screenHeight / 2);

        rlBkg.addView(item);

        return item;
    }

    // 清除所有物件
    private void clear() {

    }

    // 存取檔案
    private void save() {

    }

}

