package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.zzdrr;
import java.io.IOException;

/* loaded from: classes2.dex */
public class zzdrr<M extends zzdrr<M>> extends zzdrw {

    /* renamed from: b */
    protected zzdrt f25844b;

    @Override // com.google.android.gms.internal.ads.zzdrw
    /* renamed from: a */
    public void mo19818a(zzdrp zzdrpVar) throws IOException {
        if (this.f25844b == null) {
            return;
        }
        for (int i2 = 0; i2 < this.f25844b.m19821b(); i2++) {
            this.f25844b.m19822d(i2).m15970d(zzdrpVar);
        }
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    public /* synthetic */ Object clone() throws CloneNotSupportedException {
        zzdrr zzdrrVar = (zzdrr) super.clone();
        zzdrv.m19823a(this, zzdrrVar);
        return zzdrrVar;
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    /* renamed from: d */
    public final /* synthetic */ zzdrw clone() throws CloneNotSupportedException {
        return (zzdrr) clone();
    }

    @Override // com.google.android.gms.internal.ads.zzdrw
    /* renamed from: e */
    protected int mo19820e() {
        if (this.f25844b != null) {
            for (int i2 = 0; i2 < this.f25844b.m19821b(); i2++) {
                this.f25844b.m19822d(i2).m15971f();
            }
        }
        return 0;
    }
}
