package com.google.firebase.installations.p199s;

/* compiled from: SystemClock.java */
/* renamed from: com.google.firebase.installations.s.b */
/* loaded from: classes2.dex */
public class C8404b implements InterfaceC8403a {

    /* renamed from: a */
    private static C8404b f31878a;

    private C8404b() {
    }

    /* renamed from: b */
    public static C8404b m26386b() {
        if (f31878a == null) {
            f31878a = new C8404b();
        }
        return f31878a;
    }

    @Override // com.google.firebase.installations.p199s.InterfaceC8403a
    /* renamed from: a */
    public long mo26385a() {
        return System.currentTimeMillis();
    }
}
