package U1;

import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: StreamKey.java */
/* loaded from: classes.dex */
public final class E implements Comparable<E>, Parcelable {
    public static final Parcelable.Creator<E> CREATOR = new a();

    /* renamed from: E, reason: collision with root package name */
    private static final String f16801E = X1.L.B0(0);

    /* renamed from: F, reason: collision with root package name */
    private static final String f16802F = X1.L.B0(1);

    /* renamed from: G, reason: collision with root package name */
    private static final String f16803G = X1.L.B0(2);

    /* renamed from: B, reason: collision with root package name */
    public final int f16804B;

    /* renamed from: C, reason: collision with root package name */
    public final int f16805C;

    /* renamed from: D, reason: collision with root package name */
    public final int f16806D;

    /* compiled from: StreamKey.java */
    class a implements Parcelable.Creator<E> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public E createFromParcel(Parcel parcel) {
            return new E(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public E[] newArray(int i10) {
            return new E[i10];
        }
    }

    public E(int i10, int i11, int i12) {
        this.f16804B = i10;
        this.f16805C = i11;
        this.f16806D = i12;
    }

    @Override // java.lang.Comparable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public int compareTo(E e10) {
        int i10 = this.f16804B - e10.f16804B;
        if (i10 != 0) {
            return i10;
        }
        int i11 = this.f16805C - e10.f16805C;
        return i11 == 0 ? this.f16806D - e10.f16806D : i11;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || E.class != obj.getClass()) {
            return false;
        }
        E e10 = (E) obj;
        return this.f16804B == e10.f16804B && this.f16805C == e10.f16805C && this.f16806D == e10.f16806D;
    }

    public int hashCode() {
        return (((this.f16804B * 31) + this.f16805C) * 31) + this.f16806D;
    }

    public String toString() {
        return this.f16804B + "." + this.f16805C + "." + this.f16806D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f16804B);
        parcel.writeInt(this.f16805C);
        parcel.writeInt(this.f16806D);
    }

    E(Parcel parcel) {
        this.f16804B = parcel.readInt();
        this.f16805C = parcel.readInt();
        this.f16806D = parcel.readInt();
    }
}
