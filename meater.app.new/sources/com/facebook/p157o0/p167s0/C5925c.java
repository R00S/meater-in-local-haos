package com.facebook.p157o0.p167s0;

import android.content.Context;
import android.content.SharedPreferences;
import com.facebook.C5641a0;
import com.facebook.p157o0.C5941v;
import java.util.Set;
import kotlin.collections.C10815t;
import kotlin.collections.C10822w0;
import kotlin.jvm.internal.C9801m;

/* compiled from: OnDeviceProcessingManager.kt */
/* renamed from: com.facebook.o0.s0.c */
/* loaded from: classes2.dex */
public final class C5925c {

    /* renamed from: a */
    public static final C5925c f15458a = new C5925c();

    /* renamed from: b */
    private static final Set<String> f15459b = C10822w0.m38922i("fb_mobile_purchase", "StartTrial", "Subscribe");

    private C5925c() {
    }

    /* renamed from: a */
    private final boolean m12740a(C5941v c5941v) {
        return (c5941v.m12840h() ^ true) || (c5941v.m12840h() && f15459b.contains(c5941v.m12838f()));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    /* renamed from: b */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean m12741b() {
        /*
            com.facebook.a0 r0 = com.facebook.C5641a0.f14199a
            android.content.Context r0 = com.facebook.C5641a0.m11284c()
            boolean r0 = com.facebook.C5641a0.m11298q(r0)
            r1 = 1
            r2 = 0
            if (r0 != 0) goto L18
            com.facebook.internal.p0 r0 = com.facebook.internal.C5696p0.f14478a
            boolean r0 = com.facebook.internal.C5696p0.m11553X()
            if (r0 != 0) goto L18
            r0 = 1
            goto L19
        L18:
            r0 = 0
        L19:
            if (r0 == 0) goto L24
            com.facebook.o0.s0.e r0 = com.facebook.p157o0.p167s0.C5927e.f15462a
            boolean r0 = com.facebook.p157o0.p167s0.C5927e.m12752b()
            if (r0 == 0) goto L24
            goto L25
        L24:
            r1 = 0
        L25:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.p157o0.p167s0.C5925c.m12741b():boolean");
    }

    /* renamed from: e */
    public static final void m12744e(final String str, final C5941v c5941v) {
        C9801m.m32346f(str, "applicationId");
        C9801m.m32346f(c5941v, "event");
        if (f15458a.m12740a(c5941v)) {
            C5641a0 c5641a0 = C5641a0.f14199a;
            C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.s0.b
                @Override // java.lang.Runnable
                public final void run() {
                    C5925c.m12745f(str, c5941v);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f */
    public static final void m12745f(String str, C5941v c5941v) {
        C9801m.m32346f(str, "$applicationId");
        C9801m.m32346f(c5941v, "$event");
        C5927e c5927e = C5927e.f15462a;
        C5927e.m12753c(str, C10815t.m38883e(c5941v));
    }

    /* renamed from: g */
    public static final void m12746g(final String str, final String str2) {
        C5641a0 c5641a0 = C5641a0.f14199a;
        final Context contextM11284c = C5641a0.m11284c();
        if (contextM11284c == null || str == null || str2 == null) {
            return;
        }
        C5641a0.m11292k().execute(new Runnable() { // from class: com.facebook.o0.s0.a
            @Override // java.lang.Runnable
            public final void run() {
                C5925c.m12747h(contextM11284c, str2, str);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h */
    public static final void m12747h(Context context, String str, String str2) {
        C9801m.m32346f(context, "$context");
        SharedPreferences sharedPreferences = context.getSharedPreferences(str, 0);
        String strM32354n = C9801m.m32354n(str2, "pingForOnDevice");
        if (sharedPreferences.getLong(strM32354n, 0L) == 0) {
            C5927e c5927e = C5927e.f15462a;
            C5927e.m12755e(str2);
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.putLong(strM32354n, System.currentTimeMillis());
            editorEdit.apply();
        }
    }
}
