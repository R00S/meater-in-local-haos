package J2;

import U1.x;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: ApicFrame.java */
/* loaded from: classes.dex */
public final class a extends i {
    public static final Parcelable.Creator<a> CREATOR = new C0149a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7227C;

    /* renamed from: D, reason: collision with root package name */
    public final String f7228D;

    /* renamed from: E, reason: collision with root package name */
    public final int f7229E;

    /* renamed from: F, reason: collision with root package name */
    public final byte[] f7230F;

    /* compiled from: ApicFrame.java */
    /* renamed from: J2.a$a, reason: collision with other inner class name */
    class C0149a implements Parcelable.Creator<a> {
        C0149a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    public a(String str, String str2, int i10, byte[] bArr) {
        super("APIC");
        this.f7227C = str;
        this.f7228D = str2;
        this.f7229E = i10;
        this.f7230F = bArr;
    }

    @Override // U1.y.b
    public void L0(x.b bVar) {
        bVar.K(this.f7230F, this.f7229E);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f7229E == aVar.f7229E && L.d(this.f7227C, aVar.f7227C) && L.d(this.f7228D, aVar.f7228D) && Arrays.equals(this.f7230F, aVar.f7230F);
    }

    public int hashCode() {
        int i10 = (527 + this.f7229E) * 31;
        String str = this.f7227C;
        int iHashCode = (i10 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f7228D;
        return ((iHashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7230F);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": mimeType=" + this.f7227C + ", description=" + this.f7228D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7227C);
        parcel.writeString(this.f7228D);
        parcel.writeInt(this.f7229E);
        parcel.writeByteArray(this.f7230F);
    }

    a(Parcel parcel) {
        super("APIC");
        this.f7227C = (String) L.i(parcel.readString());
        this.f7228D = parcel.readString();
        this.f7229E = parcel.readInt();
        this.f7230F = (byte[]) L.i(parcel.createByteArray());
    }
}
