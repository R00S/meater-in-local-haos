package I2;

import U1.x;
import U1.y;
import X1.C1804a;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: IcyHeaders.java */
/* loaded from: classes.dex */
public final class b implements y.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final int f6658B;

    /* renamed from: C, reason: collision with root package name */
    public final String f6659C;

    /* renamed from: D, reason: collision with root package name */
    public final String f6660D;

    /* renamed from: E, reason: collision with root package name */
    public final String f6661E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f6662F;

    /* renamed from: G, reason: collision with root package name */
    public final int f6663G;

    /* compiled from: IcyHeaders.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            return new b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    public b(int i10, String str, String str2, String str3, boolean z10, int i11) {
        C1804a.a(i11 == -1 || i11 > 0);
        this.f6658B = i10;
        this.f6659C = str;
        this.f6660D = str2;
        this.f6661E = str3;
        this.f6662F = z10;
        this.f6663G = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0085  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a8  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00eb  */
    /* JADX WARN: Removed duplicated region for block: B:55:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static I2.b a(java.util.Map<java.lang.String, java.util.List<java.lang.String>> r13) throws java.lang.NumberFormatException {
        /*
            Method dump skipped, instructions count: 248
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: I2.b.a(java.util.Map):I2.b");
    }

    @Override // U1.y.b
    public void L0(x.b bVar) {
        String str = this.f6660D;
        if (str != null) {
            bVar.m0(str);
        }
        String str2 = this.f6659C;
        if (str2 != null) {
            bVar.c0(str2);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f6658B == bVar.f6658B && L.d(this.f6659C, bVar.f6659C) && L.d(this.f6660D, bVar.f6660D) && L.d(this.f6661E, bVar.f6661E) && this.f6662F == bVar.f6662F && this.f6663G == bVar.f6663G;
    }

    public int hashCode() {
        int i10 = (527 + this.f6658B) * 31;
        String str = this.f6659C;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f6660D;
        int iHashCode2 = (iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f6661E;
        return ((((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.f6662F ? 1 : 0)) * 31) + this.f6663G;
    }

    public String toString() {
        return "IcyHeaders: name=\"" + this.f6660D + "\", genre=\"" + this.f6659C + "\", bitrate=" + this.f6658B + ", metadataInterval=" + this.f6663G;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f6658B);
        parcel.writeString(this.f6659C);
        parcel.writeString(this.f6660D);
        parcel.writeString(this.f6661E);
        L.v1(parcel, this.f6662F);
        parcel.writeInt(this.f6663G);
    }

    b(Parcel parcel) {
        this.f6658B = parcel.readInt();
        this.f6659C = parcel.readString();
        this.f6660D = parcel.readString();
        this.f6661E = parcel.readString();
        this.f6662F = L.a1(parcel);
        this.f6663G = parcel.readInt();
    }
}
