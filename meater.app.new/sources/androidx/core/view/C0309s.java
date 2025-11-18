package androidx.core.view;

import android.content.Context;
import android.os.Build;
import android.view.PointerIcon;

/* compiled from: PointerIconCompat.java */
/* renamed from: androidx.core.view.s */
/* loaded from: classes.dex */
public final class C0309s {

    /* renamed from: a */
    private Object f2402a;

    private C0309s(Object obj) {
        this.f2402a = obj;
    }

    /* renamed from: b */
    public static C0309s m2082b(Context context, int i2) {
        return Build.VERSION.SDK_INT >= 24 ? new C0309s(PointerIcon.getSystemIcon(context, i2)) : new C0309s(null);
    }

    /* renamed from: a */
    public Object m2083a() {
        return this.f2402a;
    }
}
