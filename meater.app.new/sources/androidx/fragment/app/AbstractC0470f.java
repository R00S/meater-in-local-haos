package androidx.fragment.app;

import android.content.Context;
import android.os.Bundle;
import android.view.View;

/* compiled from: FragmentContainer.java */
/* renamed from: androidx.fragment.app.f */
/* loaded from: classes.dex */
public abstract class AbstractC0470f {
    @Deprecated
    /* renamed from: b */
    public Fragment m3624b(Context context, String str, Bundle bundle) {
        return Fragment.instantiate(context, str, bundle);
    }

    /* renamed from: c */
    public abstract View mo3383c(int i2);

    /* renamed from: d */
    public abstract boolean mo3384d();
}
