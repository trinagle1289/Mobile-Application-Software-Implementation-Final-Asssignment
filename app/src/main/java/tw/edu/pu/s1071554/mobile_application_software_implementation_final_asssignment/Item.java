package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import android.content.Context;
import android.graphics.Bitmap;

abstract public class Item extends androidx.appcompat.widget.AppCompatImageView {

    // 圖片素材
    Bitmap bmp = null;
    float rotation = 0;

    public Item(Context context, float _x, float _y) {
        super(context);

        setImageAsset();
        setImageBitmap(bmp);

        move(_x, _y);
    }

    // 設定圖片素材
    abstract void setImageAsset();

    // 以中心點來移動物件
    public void move(float _x, float _y) {
        setX(_x);
        setY(_y);
    }

    // 向右轉 90 度
    public void rotate90() {
        rotation += 90;
        setRotation(rotation);
    }

}
