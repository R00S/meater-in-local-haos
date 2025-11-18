package cm.aptoide.p092pt.orientation;

import android.app.Activity;
import android.view.WindowManager;

/* loaded from: classes.dex */
public class ScreenOrientationManager {
    private final Activity activity;
    private final WindowManager windowManager;

    public ScreenOrientationManager(Activity activity, WindowManager windowManager) {
        this.activity = activity;
        this.windowManager = windowManager;
    }

    public void lock() {
        int rotation = this.windowManager.getDefaultDisplay().getRotation();
        int i2 = 1;
        if (rotation == 1) {
            i2 = 0;
        } else if (rotation == 2) {
            i2 = 9;
        } else if (rotation == 3) {
            i2 = 8;
        }
        this.activity.setRequestedOrientation(i2);
    }

    public void unlock() {
        this.activity.setRequestedOrientation(-1);
    }
}
