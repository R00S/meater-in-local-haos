package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import java.util.HashSet;

/* loaded from: classes2.dex */
public final class zzcyi implements zzaws, zzbro {

    /* renamed from: f */
    private final HashSet<zzawj> f25327f = new HashSet<>();

    /* renamed from: g */
    private final Context f25328g;

    /* renamed from: h */
    private final zzawu f25329h;

    public zzcyi(Context context, zzawu zzawuVar) {
        this.f25328g = context;
        this.f25329h = zzawuVar;
    }

    @Override // com.google.android.gms.internal.ads.zzaws
    /* renamed from: a */
    public final synchronized void mo17070a(HashSet<zzawj> hashSet) {
        this.f25327f.clear();
        this.f25327f.addAll(hashSet);
    }

    /* renamed from: b */
    public final Bundle m19075b() {
        return this.f25329h.m17073b(this.f25328g, this);
    }

    @Override // com.google.android.gms.internal.ads.zzbro
    public final synchronized void onAdFailedToLoad(int i2) {
        if (i2 != 3) {
            this.f25329h.m17077f(this.f25327f);
        }
    }
}
