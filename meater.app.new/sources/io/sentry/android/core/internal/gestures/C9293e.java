package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.android.core.internal.util.C9313j;
import io.sentry.internal.gestures.C9479b;
import io.sentry.internal.gestures.InterfaceC9478a;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: AndroidViewGestureTargetLocator.java */
@ApiStatus.Internal
/* renamed from: io.sentry.android.core.internal.gestures.e */
/* loaded from: classes2.dex */
public final class C9293e implements InterfaceC9478a {

    /* renamed from: a */
    private final boolean f35939a;

    /* renamed from: b */
    private final int[] f35940b = new int[2];

    public C9293e(boolean z) {
        this.f35939a = z;
    }

    /* renamed from: b */
    private C9479b m30218b(View view) {
        try {
            return new C9479b(view, C9313j.m30279a(view), C9298j.m30257b(view), null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m30219c(View view, boolean z) {
        if (z) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m30220d(View view, boolean z) {
        return (m30219c(view, z) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0;
    }

    /* renamed from: e */
    private static boolean m30221e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    /* renamed from: f */
    private boolean m30222f(View view, float f2, float f3) {
        view.getLocationOnScreen(this.f35940b);
        int[] iArr = this.f35940b;
        int i2 = iArr[0];
        int i3 = iArr[1];
        return f2 >= ((float) i2) && f2 <= ((float) (i2 + view.getWidth())) && f3 >= ((float) i3) && f3 <= ((float) (i3 + view.getHeight()));
    }

    @Override // io.sentry.internal.gestures.InterfaceC9478a
    /* renamed from: a */
    public C9479b mo30223a(Object obj, float f2, float f3, C9479b.a aVar) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (m30222f(view, f2, f3)) {
            if (aVar == C9479b.a.CLICKABLE && m30221e(view)) {
                return m30218b(view);
            }
            if (aVar == C9479b.a.SCROLLABLE && m30220d(view, this.f35939a)) {
                return m30218b(view);
            }
        }
        return null;
    }
}
