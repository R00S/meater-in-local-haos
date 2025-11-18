package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes2.dex */
final class b30 implements Runnable {

    /* renamed from: f */
    private final /* synthetic */ IOException f18241f;

    /* renamed from: g */
    private final /* synthetic */ x20 f18242g;

    b30(x20 x20Var, IOException iOException) {
        this.f18242g = x20Var;
        this.f18241f = iOException;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f18242g.f20917j.mo17595f(this.f18241f);
    }
}
