package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* loaded from: classes2.dex */
public final class zzpo implements Parcelable {
    public static final Parcelable.Creator<zzpo> CREATOR = new t20();

    /* renamed from: f */
    private final zza[] f26818f;

    public interface zza extends Parcelable {
    }

    public zzpo(List<? extends zza> list) {
        zza[] zzaVarArr = new zza[list.size()];
        this.f26818f = zzaVarArr;
        list.toArray(zzaVarArr);
    }

    /* renamed from: a */
    public final int m20387a() {
        return this.f26818f.length;
    }

    /* renamed from: b */
    public final zza m20388b(int i2) {
        return this.f26818f[i2];
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzpo.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26818f, ((zzpo) obj).f26818f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f26818f);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeInt(this.f26818f.length);
        for (zza zzaVar : this.f26818f) {
            parcel.writeParcelable(zzaVar, 0);
        }
    }

    zzpo(Parcel parcel) {
        this.f26818f = new zza[parcel.readInt()];
        int i2 = 0;
        while (true) {
            zza[] zzaVarArr = this.f26818f;
            if (i2 >= zzaVarArr.length) {
                return;
            }
            zzaVarArr[i2] = (zza) parcel.readParcelable(zza.class.getClassLoader());
            i2++;
        }
    }
}
