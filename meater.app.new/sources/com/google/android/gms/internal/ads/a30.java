package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class a30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ d30 f18076f;

    /* renamed from: g */
    private final /* synthetic */ x20 f18077g;

    a30(x20 x20Var, d30 d30Var) {
        this.f18077g = x20Var;
        this.f18076f = d30Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18076f.m15025a();
        int size = this.f18077g.f20928u.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((zzqt) this.f18077g.f20928u.valueAt(i2)).m20402e();
        }
    }
}
