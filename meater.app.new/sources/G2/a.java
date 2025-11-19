package G2;

import U1.s;
import U1.y;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: EventMessage.java */
/* loaded from: classes.dex */
public final class a implements y.b {

    /* renamed from: B, reason: collision with root package name */
    public final String f4859B;

    /* renamed from: C, reason: collision with root package name */
    public final String f4860C;

    /* renamed from: D, reason: collision with root package name */
    public final long f4861D;

    /* renamed from: E, reason: collision with root package name */
    public final long f4862E;

    /* renamed from: F, reason: collision with root package name */
    public final byte[] f4863F;

    /* renamed from: G, reason: collision with root package name */
    private int f4864G;

    /* renamed from: H, reason: collision with root package name */
    private static final s f4857H = new s.b().s0("application/id3").M();

    /* renamed from: I, reason: collision with root package name */
    private static final s f4858I = new s.b().s0("application/x-scte35").M();
    public static final Parcelable.Creator<a> CREATOR = new C0092a();

    /* compiled from: EventMessage.java */
    /* renamed from: G2.a$a, reason: collision with other inner class name */
    class C0092a implements Parcelable.Creator<a> {
        C0092a() {
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

    public a(String str, String str2, long j10, long j11, byte[] bArr) {
        this.f4859B = str;
        this.f4860C = str2;
        this.f4861D = j10;
        this.f4862E = j11;
        this.f4863F = bArr;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // U1.y.b
    public s e0() {
        String str = this.f4859B;
        str.hashCode();
        switch (str) {
            case "urn:scte:scte35:2014:bin":
                return f4858I;
            case "https://aomedia.org/emsg/ID3":
            case "https://developer.apple.com/streaming/emsg-id3":
                return f4857H;
            default:
                return null;
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return this.f4861D == aVar.f4861D && this.f4862E == aVar.f4862E && L.d(this.f4859B, aVar.f4859B) && L.d(this.f4860C, aVar.f4860C) && Arrays.equals(this.f4863F, aVar.f4863F);
    }

    public int hashCode() {
        if (this.f4864G == 0) {
            String str = this.f4859B;
            int iHashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.f4860C;
            int iHashCode2 = str2 != null ? str2.hashCode() : 0;
            long j10 = this.f4861D;
            int i10 = (((iHashCode + iHashCode2) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31;
            long j11 = this.f4862E;
            this.f4864G = ((i10 + ((int) (j11 ^ (j11 >>> 32)))) * 31) + Arrays.hashCode(this.f4863F);
        }
        return this.f4864G;
    }

    @Override // U1.y.b
    public byte[] q1() {
        if (e0() != null) {
            return this.f4863F;
        }
        return null;
    }

    public String toString() {
        return "EMSG: scheme=" + this.f4859B + ", id=" + this.f4862E + ", durationMs=" + this.f4861D + ", value=" + this.f4860C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f4859B);
        parcel.writeString(this.f4860C);
        parcel.writeLong(this.f4861D);
        parcel.writeLong(this.f4862E);
        parcel.writeByteArray(this.f4863F);
    }

    a(Parcel parcel) {
        this.f4859B = (String) L.i(parcel.readString());
        this.f4860C = (String) L.i(parcel.readString());
        this.f4861D = parcel.readLong();
        this.f4862E = parcel.readLong();
        this.f4863F = (byte[]) L.i(parcel.createByteArray());
    }
}
