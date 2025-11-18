package com.google.android.gms.internal.ads;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.Comparator;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class zzne implements Parcelable, Comparator<zza> {
    public static final Parcelable.Creator<zzne> CREATOR = new l10();

    /* renamed from: f */
    private final zza[] f26633f;

    /* renamed from: g */
    private int f26634g;

    /* renamed from: h */
    public final int f26635h;

    public static final class zza implements Parcelable {
        public static final Parcelable.Creator<zza> CREATOR = new m10();

        /* renamed from: f */
        private int f26636f;

        /* renamed from: g */
        private final UUID f26637g;

        /* renamed from: h */
        private final String f26638h;

        /* renamed from: i */
        private final byte[] f26639i;

        /* renamed from: j */
        public final boolean f26640j;

        public zza(UUID uuid, String str, byte[] bArr) {
            this(uuid, str, bArr, false);
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof zza)) {
                return false;
            }
            if (obj == this) {
                return true;
            }
            zza zzaVar = (zza) obj;
            return this.f26638h.equals(zzaVar.f26638h) && zzsy.m20543g(this.f26637g, zzaVar.f26637g) && Arrays.equals(this.f26639i, zzaVar.f26639i);
        }

        public final int hashCode() {
            if (this.f26636f == 0) {
                this.f26636f = (((this.f26637g.hashCode() * 31) + this.f26638h.hashCode()) * 31) + Arrays.hashCode(this.f26639i);
            }
            return this.f26636f;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i2) {
            parcel.writeLong(this.f26637g.getMostSignificantBits());
            parcel.writeLong(this.f26637g.getLeastSignificantBits());
            parcel.writeString(this.f26638h);
            parcel.writeByteArray(this.f26639i);
            parcel.writeByte(this.f26640j ? (byte) 1 : (byte) 0);
        }

        private zza(UUID uuid, String str, byte[] bArr, boolean z) {
            this.f26637g = (UUID) zzsk.m20480d(uuid);
            this.f26638h = (String) zzsk.m20480d(str);
            this.f26639i = (byte[]) zzsk.m20480d(bArr);
            this.f26640j = false;
        }

        zza(Parcel parcel) {
            this.f26637g = new UUID(parcel.readLong(), parcel.readLong());
            this.f26638h = parcel.readString();
            this.f26639i = parcel.createByteArray();
            this.f26640j = parcel.readByte() != 0;
        }
    }

    public zzne(zza... zzaVarArr) {
        this(true, zzaVarArr);
    }

    /* renamed from: a */
    public final zza m20307a(int i2) {
        return this.f26633f[i2];
    }

    @Override // java.util.Comparator
    public final /* synthetic */ int compare(zza zzaVar, zza zzaVar2) {
        zza zzaVar3 = zzaVar;
        zza zzaVar4 = zzaVar2;
        UUID uuid = zzkt.f26440b;
        return uuid.equals(zzaVar3.f26637g) ? uuid.equals(zzaVar4.f26637g) ? 0 : 1 : zzaVar3.f26637g.compareTo(zzaVar4.f26637g);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // java.util.Comparator
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zzne.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f26633f, ((zzne) obj).f26633f);
    }

    public final int hashCode() {
        if (this.f26634g == 0) {
            this.f26634g = Arrays.hashCode(this.f26633f);
        }
        return this.f26634g;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i2) {
        parcel.writeTypedArray(this.f26633f, 0);
    }

    private zzne(boolean z, zza... zzaVarArr) {
        zza[] zzaVarArr2 = (zza[]) zzaVarArr.clone();
        Arrays.sort(zzaVarArr2, this);
        for (int i2 = 1; i2 < zzaVarArr2.length; i2++) {
            if (zzaVarArr2[i2 - 1].f26637g.equals(zzaVarArr2[i2].f26637g)) {
                String strValueOf = String.valueOf(zzaVarArr2[i2].f26637g);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 25);
                sb.append("Duplicate data for uuid: ");
                sb.append(strValueOf);
                throw new IllegalArgumentException(sb.toString());
            }
        }
        this.f26633f = zzaVarArr2;
        this.f26635h = zzaVarArr2.length;
    }

    zzne(Parcel parcel) {
        zza[] zzaVarArr = (zza[]) parcel.createTypedArray(zza.CREATOR);
        this.f26633f = zzaVarArr;
        this.f26635h = zzaVarArr.length;
    }
}
