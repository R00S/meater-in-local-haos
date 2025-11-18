package androidx.core.widget;

import android.os.Build;
import android.widget.EdgeEffect;

/* compiled from: EdgeEffectCompat.java */
/* renamed from: androidx.core.widget.f */
/* loaded from: classes.dex */
public final class C0325f {
    /* renamed from: a */
    public static void m2310a(EdgeEffect edgeEffect, float f2, float f3) {
        if (Build.VERSION.SDK_INT >= 21) {
            edgeEffect.onPull(f2, f3);
        } else {
            edgeEffect.onPull(f2);
        }
    }
}
