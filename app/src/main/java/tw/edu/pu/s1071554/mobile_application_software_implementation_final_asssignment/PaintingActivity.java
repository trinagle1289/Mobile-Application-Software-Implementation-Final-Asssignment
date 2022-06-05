package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.Toast;

import java.util.ArrayList;

public class PaintingActivity extends AppCompatActivity {

    // 物件選擇的列舉單
    enum ItemSelect {
        Table,
        Door,
        Wall
    }

    // 背景 UI
    RelativeLayout rlBkg = null;

    // 螢幕寬跟高資料
    int screenWidth, screenHeight;
    View selectedItem = null;

    // 物件陣列
    ArrayList<Item> iList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_painting);

        // 初始化 UI
        rlBkg = findViewById(R.id.painting_bkg);
        // 設定螢幕資料
        setScreenData();
    }


    float x = 0, y = 0;
    float dx = 0, dy = 0;

    @Override
    public boolean onTouchEvent(MotionEvent event) {

        if (event.getAction() == MotionEvent.ACTION_DOWN) {
            x = event.getX();
            y = event.getY();
        }
        if (event.getAction() == MotionEvent.ACTION_MOVE) {
            dx = event.getX() - x;
            dy = event.getY() - y;

            selectedItem.setX(selectedItem.getX() + dx);
            selectedItem.setY(selectedItem.getY() + dy);

            x = event.getX();
            y = event.getY();
        }

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
                genItem(ItemSelect.Door);
                break;
            case R.id.menu_add_table:
                genItem(ItemSelect.Table);
                break;
            case R.id.menu_add_wall:
                genItem(ItemSelect.Wall);
                break;
            case R.id.menu_clear:
                clear();
                break;
            case R.id.menu_save:
                save();
                break;
            default:
                break;
        }

        return super.onOptionsItemSelected(item);
    }

    // 生成物件
    private Item genItem(ItemSelect itemSelect) {
        Item item = null;

        switch (itemSelect) {
            case Table:
                item = new Table(this, screenWidth / 2, screenHeight / 2);
                break;
            case Door:
                item = new Door(this, screenWidth / 2, screenHeight / 2);
                break;
            case Wall:
                item = new Wall(this, screenWidth / 2, screenHeight / 2);
                break;
            default:
                return null;
        }

        iList.add(item);
        rlBkg.addView(item);

        item.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                selectedItem = view;
            }

        });

        return item;
    }

    // 清除所有物件
    private void clear() {
        rlBkg.removeAllViews();
    }

    // 存取檔案
    private void save() {

    }

    // 設定畫面資料
    private void setScreenData() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        screenWidth = displayMetrics.widthPixels;
        screenHeight = displayMetrics.heightPixels;
    }

}

