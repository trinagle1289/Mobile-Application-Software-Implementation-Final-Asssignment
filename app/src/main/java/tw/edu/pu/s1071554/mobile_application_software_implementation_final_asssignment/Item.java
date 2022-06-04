package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import android.content.Context;
import android.graphics.Bitmap;

public class Item extends androidx.appcompat.widget.AppCompatImageView {

    float centerX = 0, centerY = 0;

    float x = centerX, y = centerY;

    public Item(Context context, Bitmap _bmp, float _x, float _y) {
        super(context);

        x = _x;
        y = _y;

        setImageBitmap(_bmp);
        setX(x);
        setY(y);
    }


}
