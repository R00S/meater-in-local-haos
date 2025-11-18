package cm.aptoide.p092pt.reactions.util;

import android.content.res.Resources;

/* loaded from: classes.dex */
public class DisplayUtil {
    public static int dpToPx(int i2) {
        return i2 * (Resources.getSystem().getDisplayMetrics().densityDpi / 160);
    }
}
