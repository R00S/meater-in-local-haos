package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* loaded from: classes2.dex */
public final class zznx {

    /* renamed from: a */
    public final int f26660a = 1;

    /* renamed from: b */
    public final byte[] f26661b;

    public zznx(int i2, byte[] bArr) {
        this.f26661b = bArr;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && zznx.class == obj.getClass()) {
            zznx zznxVar = (zznx) obj;
            if (this.f26660a == zznxVar.f26660a && Arrays.equals(this.f26661b, zznxVar.f26661b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return (this.f26660a * 31) + Arrays.hashCode(this.f26661b);
    }
}
