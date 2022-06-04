package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import androidx.annotation.NonNull;

public class Game_bk extends SurfaceView {


    // 圖片素材
    Bitmap tableBmap = BitmapFactory.decodeResource(getResources(), R.drawable.table);
//    Bitmap wallBmap;
//    Bitmap doorBmap;

    public Game_bk(Context context) {
        super(context);
    }



}
