package tw.edu.pu.s1071554.mobile_application_software_implementation_final_asssignment;

import android.graphics.Canvas;

abstract public class Item {
    int x, y;

    public abstract void Draw(Canvas canvas);

    public void DrawXY(Canvas canvas, int _x, int _y) {
        x = _x;
        y = _y;
        Draw(canvas);
    }
}
