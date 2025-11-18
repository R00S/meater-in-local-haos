package J4;

import android.content.res.Resources;
import kotlin.Metadata;

/* compiled from: Utils.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0006\u001a\u0011\u0010\u0001\u001a\u00020\u0000*\u00020\u0000¢\u0006\u0004\b\u0001\u0010\u0002\"\u0011\u0010\u0005\u001a\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"", "a", "(F)F", "b", "()F", "density", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class U0 {
    public static final float a(float f10) {
        return (f10 * b()) + 0.5f;
    }

    public static final float b() {
        return Resources.getSystem().getDisplayMetrics().density;
    }
}
