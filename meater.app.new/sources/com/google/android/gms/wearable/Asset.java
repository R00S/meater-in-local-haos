package com.google.android.gms.wearable;

import android.net.Uri;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import g7.C3443n;
import g7.C3445p;
import h7.AbstractC3492a;
import h7.C3493b;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-wearable@@19.0.0 */
/* loaded from: classes2.dex */
public class Asset extends AbstractC3492a implements ReflectedParcelable {
    public static final Parcelable.Creator<Asset> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final byte[] f35793B;

    /* renamed from: C, reason: collision with root package name */
    private final String f35794C;

    /* renamed from: D, reason: collision with root package name */
    public final ParcelFileDescriptor f35795D;

    /* renamed from: E, reason: collision with root package name */
    public final Uri f35796E;

    Asset(byte[] bArr, String str, ParcelFileDescriptor parcelFileDescriptor, Uri uri) {
        this.f35793B = bArr;
        this.f35794C = str;
        this.f35795D = parcelFileDescriptor;
        this.f35796E = uri;
    }

    public static Asset f0(ParcelFileDescriptor parcelFileDescriptor) {
        C3445p.k(parcelFileDescriptor);
        return new Asset(null, null, parcelFileDescriptor, null);
    }

    public final byte[] G0() {
        return this.f35793B;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Asset)) {
            return false;
        }
        Asset asset = (Asset) obj;
        return Arrays.equals(this.f35793B, asset.f35793B) && C3443n.a(this.f35794C, asset.f35794C) && C3443n.a(this.f35795D, asset.f35795D) && C3443n.a(this.f35796E, asset.f35796E);
    }

    public String h0() {
        return this.f35794C;
    }

    public int hashCode() {
        return Arrays.deepHashCode(new Object[]{this.f35793B, this.f35794C, this.f35795D, this.f35796E});
    }

    public ParcelFileDescriptor r0() {
        return this.f35795D;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("Asset[@");
        sb2.append(Integer.toHexString(hashCode()));
        if (this.f35794C == null) {
            sb2.append(", nodigest");
        } else {
            sb2.append(", ");
            sb2.append(this.f35794C);
        }
        if (this.f35793B != null) {
            sb2.append(", size=");
            sb2.append(((byte[]) C3445p.k(this.f35793B)).length);
        }
        if (this.f35795D != null) {
            sb2.append(", fd=");
            sb2.append(this.f35795D);
        }
        if (this.f35796E != null) {
            sb2.append(", uri=");
            sb2.append(this.f35796E);
        }
        sb2.append("]");
        return sb2.toString();
    }

    public Uri v0() {
        return this.f35796E;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        C3445p.k(parcel);
        byte[] bArr = this.f35793B;
        int iA = C3493b.a(parcel);
        C3493b.g(parcel, 2, bArr, false);
        C3493b.q(parcel, 3, h0(), false);
        int i11 = i10 | 1;
        C3493b.p(parcel, 4, this.f35795D, i11, false);
        C3493b.p(parcel, 5, this.f35796E, i11, false);
        C3493b.b(parcel, iA);
    }
}
