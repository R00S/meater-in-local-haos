package s1;

import android.os.Build;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import java.util.Collections;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: VelocityTrackerCompat.java */
/* loaded from: classes.dex */
public final class U {

    /* renamed from: a, reason: collision with root package name */
    private static Map<VelocityTracker, V> f49075a = Collections.synchronizedMap(new WeakHashMap());

    /* compiled from: VelocityTrackerCompat.java */
    private static class a {
        static float a(VelocityTracker velocityTracker, int i10) {
            return velocityTracker.getAxisVelocity(i10);
        }
    }

    public static void a(VelocityTracker velocityTracker, MotionEvent motionEvent) {
        velocityTracker.addMovement(motionEvent);
        if (Build.VERSION.SDK_INT < 34 && motionEvent.getSource() == 4194304) {
            if (!f49075a.containsKey(velocityTracker)) {
                f49075a.put(velocityTracker, new V());
            }
            f49075a.get(velocityTracker).a(motionEvent);
        }
    }

    public static void b(VelocityTracker velocityTracker, int i10) {
        c(velocityTracker, i10, Float.MAX_VALUE);
    }

    public static void c(VelocityTracker velocityTracker, int i10, float f10) {
        velocityTracker.computeCurrentVelocity(i10, f10);
        V vE = e(velocityTracker);
        if (vE != null) {
            vE.c(i10, f10);
        }
    }

    public static float d(VelocityTracker velocityTracker, int i10) {
        if (Build.VERSION.SDK_INT >= 34) {
            return a.a(velocityTracker, i10);
        }
        if (i10 == 0) {
            return velocityTracker.getXVelocity();
        }
        if (i10 == 1) {
            return velocityTracker.getYVelocity();
        }
        V vE = e(velocityTracker);
        if (vE != null) {
            return vE.d(i10);
        }
        return 0.0f;
    }

    private static V e(VelocityTracker velocityTracker) {
        return f49075a.get(velocityTracker);
    }
}
