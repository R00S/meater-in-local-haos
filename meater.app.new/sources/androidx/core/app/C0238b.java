package androidx.core.app;

import android.app.ActivityOptions;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;

/* compiled from: ActivityOptionsCompat.java */
/* renamed from: androidx.core.app.b */
/* loaded from: classes.dex */
public class C0238b {

    /* compiled from: ActivityOptionsCompat.java */
    /* renamed from: androidx.core.app.b$a */
    private static class a extends C0238b {

        /* renamed from: a */
        private final ActivityOptions f2049a;

        a(ActivityOptions activityOptions) {
            this.f2049a = activityOptions;
        }

        @Override // androidx.core.app.C0238b
        /* renamed from: b */
        public Bundle mo1534b() {
            return this.f2049a.toBundle();
        }
    }

    protected C0238b() {
    }

    /* renamed from: a */
    public static C0238b m1533a(Context context, int i2, int i3) {
        return Build.VERSION.SDK_INT >= 16 ? new a(ActivityOptions.makeCustomAnimation(context, i2, i3)) : new C0238b();
    }

    /* renamed from: b */
    public Bundle mo1534b() {
        return null;
    }
}
