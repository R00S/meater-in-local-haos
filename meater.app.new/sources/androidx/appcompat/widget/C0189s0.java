package androidx.appcompat.widget;

import android.os.Build;
import android.view.View;

/* compiled from: TooltipCompat.java */
/* renamed from: androidx.appcompat.widget.s0 */
/* loaded from: classes.dex */
public class C0189s0 {
    /* renamed from: a */
    public static void m1179a(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            view.setTooltipText(charSequence);
        } else {
            ViewOnLongClickListenerC0191t0.m1185f(view, charSequence);
        }
    }
}
