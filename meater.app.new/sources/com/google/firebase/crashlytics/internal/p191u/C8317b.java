package com.google.firebase.crashlytics.internal.p191u;

/* compiled from: MiddleOutStrategy.java */
/* renamed from: com.google.firebase.crashlytics.h.u.b */
/* loaded from: classes2.dex */
public class C8317b implements InterfaceC8319d {

    /* renamed from: a */
    private final int f31634a;

    public C8317b(int i2) {
        this.f31634a = i2;
    }

    @Override // com.google.firebase.crashlytics.internal.p191u.InterfaceC8319d
    /* renamed from: a */
    public StackTraceElement[] mo26070a(StackTraceElement[] stackTraceElementArr) {
        int length = stackTraceElementArr.length;
        int i2 = this.f31634a;
        if (length <= i2) {
            return stackTraceElementArr;
        }
        int i3 = i2 / 2;
        int i4 = i2 - i3;
        StackTraceElement[] stackTraceElementArr2 = new StackTraceElement[i2];
        System.arraycopy(stackTraceElementArr, 0, stackTraceElementArr2, 0, i4);
        System.arraycopy(stackTraceElementArr, stackTraceElementArr.length - i3, stackTraceElementArr2, i4, i3);
        return stackTraceElementArr2;
    }
}
