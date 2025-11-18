package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.du */
/* loaded from: classes2.dex */
final class C6612du extends AbstractC6686fu {

    /* renamed from: f */
    private int f18701f = 0;

    /* renamed from: g */
    private final int f18702g;

    /* renamed from: h */
    private final /* synthetic */ zzdmr f18703h;

    C6612du(zzdmr zzdmrVar) {
        this.f18703h = zzdmrVar;
        this.f18702g = zzdmrVar.size();
    }

    @Override // com.google.android.gms.internal.ads.zzdmy
    /* renamed from: f */
    public final byte mo15079f() {
        int i2 = this.f18701f;
        if (i2 >= this.f18702g) {
            throw new NoSuchElementException();
        }
        this.f18701f = i2 + 1;
        return this.f18703h.mo15317w(i2);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f18701f < this.f18702g;
    }
}
