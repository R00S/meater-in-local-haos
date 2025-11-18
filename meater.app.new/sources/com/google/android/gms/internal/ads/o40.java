package com.google.android.gms.internal.ads;

import android.view.View;

/* loaded from: classes2.dex */
final class o40 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ View f20135f;

    /* renamed from: g */
    private final /* synthetic */ zzuu f20136g;

    o40(zzuu zzuuVar, View view) {
        this.f20136g = zzuuVar;
        this.f20135f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f20136g.m20636d(this.f20135f);
    }
}
