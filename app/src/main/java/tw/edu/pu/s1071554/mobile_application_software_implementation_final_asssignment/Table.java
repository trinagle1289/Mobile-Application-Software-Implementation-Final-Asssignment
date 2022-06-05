package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;

public class Table extends Item {

    public Table(Context context, float _x, float _y) {
        super(context, _x, _y);
    }

    @Override
    void setImageAsset() {
        bmp = BitmapFactory.decodeResource(getResources(), R.drawable.table);
        setScaleX(0.5f);
        setScaleY(0.5f);
    }

}
