package com.google.firebase.p213w;

import android.os.Build;
import android.os.Trace;

/* compiled from: FirebaseTrace.java */
/* renamed from: com.google.firebase.w.c */
/* loaded from: classes2.dex */
public final class C8561c {
    /* renamed from: a */
    public static void m26908a() {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.endSection();
        }
    }

    /* renamed from: b */
    public static void m26909b(String str) {
        if (Build.VERSION.SDK_INT >= 18) {
            Trace.beginSection(str);
        }
    }
}
