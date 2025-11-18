package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.Objects;

@zzard
/* loaded from: classes2.dex */
public final class zzasp extends zzass {

    /* renamed from: f */
    private final String f22499f;

    /* renamed from: g */
    private final int f22500g;

    public zzasp(String str, int i2) {
        this.f22499f = str;
        this.f22500g = i2;
    }

    public final boolean equals(Object obj) {
        if (obj != null && (obj instanceof zzasp)) {
            zzasp zzaspVar = (zzasp) obj;
            if (Objects.m14355a(this.f22499f, zzaspVar.f22499f) && Objects.m14355a(Integer.valueOf(this.f22500g), Integer.valueOf(zzaspVar.f22500g))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final int getAmount() {
        return this.f22500g;
    }

    @Override // com.google.android.gms.internal.ads.zzasr
    public final String getType() {
        return this.f22499f;
    }
}
