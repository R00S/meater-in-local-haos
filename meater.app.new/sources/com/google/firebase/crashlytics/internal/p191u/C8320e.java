package com.google.firebase.crashlytics.internal.p191u;

import java.util.Stack;

/* compiled from: TrimmedThrowableData.java */
/* renamed from: com.google.firebase.crashlytics.h.u.e */
/* loaded from: classes2.dex */
public class C8320e {

    /* renamed from: a */
    public final String f31636a;

    /* renamed from: b */
    public final String f31637b;

    /* renamed from: c */
    public final StackTraceElement[] f31638c;

    /* renamed from: d */
    public final C8320e f31639d;

    private C8320e(String str, String str2, StackTraceElement[] stackTraceElementArr, C8320e c8320e) {
        this.f31636a = str;
        this.f31637b = str2;
        this.f31638c = stackTraceElementArr;
        this.f31639d = c8320e;
    }

    /* renamed from: a */
    public static C8320e m26073a(Throwable th, InterfaceC8319d interfaceC8319d) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        C8320e c8320e = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            c8320e = new C8320e(th2.getLocalizedMessage(), th2.getClass().getName(), interfaceC8319d.mo26070a(th2.getStackTrace()), c8320e);
        }
        return c8320e;
    }
}
