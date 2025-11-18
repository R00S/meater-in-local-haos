package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelWriter;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.internal.ads.zzbp;

@SafeParcelable.Class
/* loaded from: classes2.dex */
public final class zzdbd extends AbstractSafeParcelable {
    public static final Parcelable.Creator<zzdbd> CREATOR = new zzdbe();

    /* renamed from: f */
    @SafeParcelable.VersionField
    private final int f25454f;

    /* renamed from: g */
    @SafeParcelable.Field
    private zzbp.zza f25455g = null;

    /* renamed from: h */
    private byte[] f25456h;

    @SafeParcelable.Constructor
    zzdbd(@SafeParcelable.Param(id = 1) int i2, @SafeParcelable.Param(id = 2) byte[] bArr) {
        this.f25454f = i2;
        this.f25456h = bArr;
        m19172z();
    }

    /* renamed from: z */
    private final void m19172z() {
        zzbp.zza zzaVar = this.f25455g;
        if (zzaVar != null || this.f25456h == null) {
            if (zzaVar == null || this.f25456h != null) {
                if (zzaVar != null && this.f25456h != null) {
                    throw new IllegalStateException("Invalid internal representation - full");
                }
                if (zzaVar != null || this.f25456h != null) {
                    throw new IllegalStateException("Impossible");
                }
                throw new IllegalStateException("Invalid internal representation - empty");
            }
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        int iM14466a = SafeParcelWriter.m14466a(parcel);
        SafeParcelWriter.m14477l(parcel, 1, this.f25454f);
        byte[] bArrMo19587g = this.f25456h;
        if (bArrMo19587g == null) {
            bArrMo19587g = this.f25455g.mo19587g();
        }
        SafeParcelWriter.m14471f(parcel, 2, bArrMo19587g, false);
        SafeParcelWriter.m14467b(parcel, iM14466a);
    }

    /* renamed from: y */
    public final zzbp.zza m19173y() {
        if (!(this.f25455g != null)) {
            try {
                this.f25455g = zzbp.zza.m18017m0(this.f25456h, zzdno.m19703e());
                this.f25456h = null;
            } catch (zzdok e2) {
                throw new IllegalStateException(e2);
            }
        }
        m19172z();
        return this.f25455g;
    }
}
