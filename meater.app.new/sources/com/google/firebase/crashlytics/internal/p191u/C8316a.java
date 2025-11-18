package com.google.firebase.crashlytics.internal.p191u;

/* compiled from: MiddleOutFallbackStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.u.a */
/* loaded from: classes2.dex */
public class C8316a implements InterfaceC8319d {

    /* renamed from: a */
    private final int f31631a;

    /* renamed from: b */
    private final InterfaceC8319d[] f31632b;

    /* renamed from: c */
    private final C8317b f31633c;

    public C8316a(int i2, InterfaceC8319d... interfaceC8319dArr) {
        this.f31631a = i2;
        this.f31632b = interfaceC8319dArr;
        this.f31633c = new C8317b(i2);
    }

    @Override // com.google.firebase.crashlytics.internal.p191u.InterfaceC8319d
    /* renamed from: a */
    public StackTraceElement[] mo26070a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f31631a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrMo26070a = stackTraceElementArr;
        for (InterfaceC8319d interfaceC8319d : this.f31632b) {
            if (stackTraceElementArrMo26070a.length <= this.f31631a) {
                break;
            }
            stackTraceElementArrMo26070a = interfaceC8319d.mo26070a(stackTraceElementArr);
        }
        return stackTraceElementArrMo26070a.length > this.f31631a ? this.f31633c.mo26070a(stackTraceElementArrMo26070a) : stackTraceElementArrMo26070a;
    }
}
