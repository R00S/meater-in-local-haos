package androidx.core.view;

import android.view.MotionEvent;

/* compiled from: MotionEventCompat.java */
/* renamed from: androidx.core.view.i */
/* loaded from: classes.dex */
public final class C0299i {
    /* renamed from: a */
    public static boolean m2055a(MotionEvent motionEvent, int i2) {
        return (motionEvent.getSource() & i2) == i2;
    }
}
