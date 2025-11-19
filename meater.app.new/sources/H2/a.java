package H2;

import U1.x;
import U1.y;
import U1.z;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;

/* compiled from: PictureFrame.java */
/* loaded from: classes.dex */
public final class a implements y.b {
    public static final Parcelable.Creator<a> CREATOR = new C0101a();

    /* renamed from: B, reason: collision with root package name */
    public final int f5483B;

    /* renamed from: C, reason: collision with root package name */
    public final String f5484C;

    /* renamed from: D, reason: collision with root package name */
    public final String f5485D;

    /* renamed from: E, reason: collision with root package name */
    public final int f5486E;

    /* renamed from: F, reason: collision with root package name */
    public final int f5487F;

    /* renamed from: G, reason: collision with root package name */
    public final int f5488G;

    /* renamed from: H, reason: collision with root package name */
    public final int f5489H;

    /* renamed from: I, reason: collision with root package name */
    public final byte[] f5490I;

    /* compiled from: PictureFrame.java */
    /* renamed from: H2.a$a, reason: collision with other inner class name */
    class C0101a implements Parcelable.Creator<a> {
        C0101a() {
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

    public a(int i10, String str, String str2, int i11, int i12, int i13, int i14, byte[] bArr) {
        this.f5483B = i10;
        this.f5484C = str;
        this.f5485D = str2;
        this.f5486E = i11;
        this.f5487F = i12;
        this.f5488G = i13;
        this.f5489H = i14;
        this.f5490I = bArr;
    }

    public static a a(X1.y yVar) {
        int iQ = yVar.q();
        String strT = z.t(yVar.F(yVar.q(), StandardCharsets.US_ASCII));
        String strE = yVar.E(yVar.q());
        int iQ2 = yVar.q();
        int iQ3 = yVar.q();
        int iQ4 = yVar.q();
        int iQ5 = yVar.q();
        int iQ6 = yVar.q();
        byte[] bArr = new byte[iQ6];
        yVar.l(bArr, 0, iQ6);
        return new a(iQ, strT, strE, iQ2, iQ3, iQ4, iQ5, bArr);
    }

    @Override // U1.y.b
    public void L0(x.b bVar) {
        bVar.K(this.f5490I, this.f5483B);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f5483B == aVar.f5483B && this.f5484C.equals(aVar.f5484C) && this.f5485D.equals(aVar.f5485D) && this.f5486E == aVar.f5486E && this.f5487F == aVar.f5487F && this.f5488G == aVar.f5488G && this.f5489H == aVar.f5489H && Arrays.equals(this.f5490I, aVar.f5490I);
    }

    public int hashCode() {
        return ((((((((((((((527 + this.f5483B) * 31) + this.f5484C.hashCode()) * 31) + this.f5485D.hashCode()) * 31) + this.f5486E) * 31) + this.f5487F) * 31) + this.f5488G) * 31) + this.f5489H) * 31) + Arrays.hashCode(this.f5490I);
    }

    public String toString() {
        return "Picture: mimeType=" + this.f5484C + ", description=" + this.f5485D;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f5483B);
        parcel.writeString(this.f5484C);
        parcel.writeString(this.f5485D);
        parcel.writeInt(this.f5486E);
        parcel.writeInt(this.f5487F);
        parcel.writeInt(this.f5488G);
        parcel.writeInt(this.f5489H);
        parcel.writeByteArray(this.f5490I);
    }

    a(Parcel parcel) {
        this.f5483B = parcel.readInt();
        this.f5484C = (String) L.i(parcel.readString());
        this.f5485D = (String) L.i(parcel.readString());
        this.f5486E = parcel.readInt();
        this.f5487F = parcel.readInt();
        this.f5488G = parcel.readInt();
        this.f5489H = parcel.readInt();
        this.f5490I = (byte[]) L.i(parcel.createByteArray());
    }
}
