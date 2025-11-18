package androidx.core.view;

import android.os.Build;
import android.view.ViewGroup;
import p024c.p052i.C0921c;

/* compiled from: ViewGroupCompat.java */
/* renamed from: androidx.core.view.w */
/* loaded from: classes.dex */
public final class C0313w {
    /* renamed from: a */
    public static boolean m2207a(ViewGroup viewGroup) {
        if (Build.VERSION.SDK_INT >= 21) {
            return viewGroup.isTransitionGroup();
        }
        Boolean bool = (Boolean) viewGroup.getTag(C0921c.f6211O);
        return ((bool == null || !bool.booleanValue()) && viewGroup.getBackground() == null && C0311u.m2094G(viewGroup) == null) ? false : true;
    }
}
