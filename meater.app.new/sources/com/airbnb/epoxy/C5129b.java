package com.airbnb.epoxy;

import android.app.Activity;
import android.content.Context;
import android.os.Build;
import android.view.Window;
import androidx.core.view.C0311u;
import kotlin.jvm.internal.C9801m;

/* compiled from: ActivityRecyclerPool.kt */
/* renamed from: com.airbnb.epoxy.b */
/* loaded from: classes.dex */
public final class C5129b {
    /* renamed from: a */
    public static final boolean m9201a(Context context) {
        if (context == null) {
            return true;
        }
        if (!(context instanceof Activity)) {
            return false;
        }
        Activity activity = (Activity) context;
        if (activity.isFinishing()) {
            return true;
        }
        if (Build.VERSION.SDK_INT >= 17) {
            return activity.isDestroyed();
        }
        Window window = activity.getWindow();
        C9801m.m32342b(window, "window");
        return !C0311u.m2101N(window.getDecorView());
    }
}
