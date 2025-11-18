package com.facebook.p157o0.p158k0;

import android.app.Activity;
import com.facebook.C5641a0;
import com.facebook.internal.C5670c0;
import com.facebook.internal.C5672d0;
import com.facebook.internal.C5696p0;
import com.facebook.internal.C5697q;
import kotlin.jvm.internal.C9801m;

/* compiled from: MetadataIndexer.kt */
/* renamed from: com.facebook.o0.k0.c */
/* loaded from: classes.dex */
public final class C5835c {

    /* renamed from: a */
    public static final C5835c f14978a = new C5835c();

    /* renamed from: b */
    private static final String f14979b = C5835c.class.getCanonicalName();

    /* renamed from: c */
    private static boolean f14980c;

    private C5835c() {
    }

    /* renamed from: a */
    public static final void m12271a() {
        try {
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.k0.a
                @Override // java.lang.Runnable
                public final void run() {
                    C5835c.m12272b();
                }
            });
        } catch (Exception e2) {
            C5696p0 c5696p0 = C5696p0.f14478a;
            C5696p0.m11573i0(f14979b, e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: b */
    public static final void m12272b() {
        C5641a0 c5641a0 = C5641a0.f14199a;
        if (C5697q.f14488a.m11629h(C5641a0.m11284c())) {
            return;
        }
        f14978a.m12275e();
        f14980c = true;
    }

    /* renamed from: d */
    public static final void m12274d(Activity activity) {
        C9801m.m32346f(activity, "activity");
        try {
            if (f14980c && !C5837e.f14982a.m12288c().isEmpty()) {
                ViewTreeObserverOnGlobalFocusChangeListenerC5838f.f14987f.m12302e(activity);
            }
        } catch (Exception unused) {
        }
    }

    /* renamed from: e */
    private final void m12275e() {
        String strM11404h;
        C5672d0 c5672d0 = C5672d0.f14392a;
        C5641a0 c5641a0 = C5641a0.f14199a;
        C5670c0 c5670c0M11428o = C5672d0.m11428o(C5641a0.m11285d(), false);
        if (c5670c0M11428o == null || (strM11404h = c5670c0M11428o.m11404h()) == null) {
            return;
        }
        C5837e.f14982a.m12289d(strM11404h);
    }
}
