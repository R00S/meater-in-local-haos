package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import io.sentry.C9471i2;
import io.sentry.C9489j1;
import io.sentry.C9506l4;
import io.sentry.C9517n1;
import io.sentry.C9583s0;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9490j2;
import io.sentry.InterfaceC9496k1;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.internal.gestures.C9298j;
import io.sentry.android.core.internal.util.C9310g;
import io.sentry.android.core.internal.util.C9313j;
import io.sentry.android.core.internal.util.C9317n;
import io.sentry.internal.viewhierarchy.InterfaceC9486a;
import io.sentry.protocol.C9542b0;
import io.sentry.protocol.C9544c0;
import io.sentry.protocol.C9565x;
import io.sentry.util.C9642m;
import io.sentry.util.C9646q;
import io.sentry.util.thread.InterfaceC9651b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes2.dex */
public final class ViewHierarchyEventProcessor implements InterfaceC9496k1, InterfaceC9490j2 {

    /* renamed from: f */
    private final SentryAndroidOptions f35852f;

    /* renamed from: g */
    private final C9317n f35853g = new C9317n(C9310g.m30272b(), 2000, 3);

    public ViewHierarchyEventProcessor(SentryAndroidOptions sentryAndroidOptions) {
        this.f35852f = (SentryAndroidOptions) C9646q.m31802c(sentryAndroidOptions, "SentryAndroidOptions is required");
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            mo30003a();
        }
    }

    /* renamed from: f */
    private static void m30142f(View view, C9544c0 c9544c0, List<InterfaceC9486a> list) {
        if (view instanceof ViewGroup) {
            Iterator<InterfaceC9486a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().m30874a(c9544c0, view)) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = viewGroup.getChildAt(i2);
                if (childAt != null) {
                    C9544c0 c9544c0M30146j = m30146j(childAt);
                    arrayList.add(c9544c0M30146j);
                    m30142f(childAt, c9544c0M30146j, list);
                }
            }
            c9544c0.m31256m(arrayList);
        }
    }

    /* renamed from: g */
    static /* synthetic */ void m30143g(AtomicReference atomicReference, View view, List list, CountDownLatch countDownLatch, InterfaceC9670w1 interfaceC9670w1) {
        try {
            atomicReference.set(m30145i(view, list));
            countDownLatch.countDown();
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Failed to process view hierarchy.", th);
        }
    }

    /* renamed from: h */
    public static C9542b0 m30144h(Activity activity, final List<InterfaceC9486a> list, InterfaceC9651b interfaceC9651b, final InterfaceC9670w1 interfaceC9670w1) {
        if (activity == null) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        final View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView == null) {
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
            return null;
        }
        try {
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Failed to process view hierarchy.", th);
        }
        if (interfaceC9651b.mo30277d()) {
            return m30145i(viewPeekDecorView, list);
        }
        final CountDownLatch countDownLatch = new CountDownLatch(1);
        final AtomicReference atomicReference = new AtomicReference(null);
        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.d0
            @Override // java.lang.Runnable
            public final void run() {
                ViewHierarchyEventProcessor.m30143g(atomicReference, viewPeekDecorView, list, countDownLatch, interfaceC9670w1);
            }
        });
        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
            return (C9542b0) atomicReference.get();
        }
        return null;
    }

    /* renamed from: i */
    public static C9542b0 m30145i(View view, List<InterfaceC9486a> list) {
        ArrayList arrayList = new ArrayList(1);
        C9542b0 c9542b0 = new C9542b0("android_view_system", arrayList);
        C9544c0 c9544c0M30146j = m30146j(view);
        arrayList.add(c9544c0M30146j);
        m30142f(view, c9544c0M30146j, list);
        return c9542b0;
    }

    /* renamed from: j */
    private static C9544c0 m30146j(View view) {
        C9544c0 c9544c0 = new C9544c0();
        c9544c0.m31259p(C9313j.m30279a(view));
        try {
            c9544c0.m31258o(C9298j.m30257b(view));
        } catch (Throwable unused) {
        }
        c9544c0.m31263t(Double.valueOf(view.getX()));
        c9544c0.m31264u(Double.valueOf(view.getY()));
        c9544c0.m31262s(Double.valueOf(view.getWidth()));
        c9544c0.m31257n(Double.valueOf(view.getHeight()));
        c9544c0.m31255l(Double.valueOf(view.getAlpha()));
        int visibility = view.getVisibility();
        if (visibility == 0) {
            c9544c0.m31261r("visible");
        } else if (visibility == 4) {
            c9544c0.m31261r("invisible");
        } else if (visibility == 8) {
            c9544c0.m31261r("gone");
        }
        return c9544c0;
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: b */
    public C9506l4 mo30135b(C9506l4 c9506l4, C9517n1 c9517n1) {
        if (!c9506l4.m31008w0()) {
            return c9506l4;
        }
        if (!this.f35852f.isAttachViewHierarchy()) {
            this.f35852f.getLogger().mo30214c(EnumC9587s4.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
            return c9506l4;
        }
        if (C9642m.m31782e(c9517n1)) {
            return c9506l4;
        }
        boolean zM30291a = this.f35853g.m30291a();
        SentryAndroidOptions.InterfaceC9258a beforeViewHierarchyCaptureCallback = this.f35852f.getBeforeViewHierarchyCaptureCallback();
        if (beforeViewHierarchyCaptureCallback != null) {
            if (!beforeViewHierarchyCaptureCallback.m30138a(c9506l4, c9517n1, zM30291a)) {
                return c9506l4;
            }
        } else if (zM30291a) {
            return c9506l4;
        }
        C9542b0 c9542b0M30144h = m30144h(C9348u0.m30427c().m30429b(), this.f35852f.getViewHierarchyExporters(), this.f35852f.getMainThreadChecker(), this.f35852f.getLogger());
        if (c9542b0M30144h != null) {
            c9517n1.m31082m(C9583s0.m31574c(c9542b0M30144h));
        }
        return c9506l4;
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    @Override // io.sentry.InterfaceC9496k1
    /* renamed from: e */
    public /* synthetic */ C9565x mo30136e(C9565x c9565x, C9517n1 c9517n1) {
        return C9489j1.m30876a(this, c9565x, c9517n1);
    }
}
