package L2;

import X1.L;
import X1.y;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: PrivateCommand.java */
/* loaded from: classes.dex */
public final class a extends b {
    public static final Parcelable.Creator<a> CREATOR = new C0178a();

    /* renamed from: B, reason: collision with root package name */
    public final long f9065B;

    /* renamed from: C, reason: collision with root package name */
    public final long f9066C;

    /* renamed from: D, reason: collision with root package name */
    public final byte[] f9067D;

    /* compiled from: PrivateCommand.java */
    /* renamed from: L2.a$a, reason: collision with other inner class name */
    class C0178a implements Parcelable.Creator<a> {
        C0178a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public a createFromParcel(Parcel parcel) {
            return new a(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public a[] newArray(int i10) {
            return new a[i10];
        }
    }

    /* synthetic */ a(Parcel parcel, C0178a c0178a) {
        this(parcel);
    }

    static a a(y yVar, int i10, long j10) {
        long J10 = yVar.J();
        int i11 = i10 - 4;
        byte[] bArr = new byte[i11];
        yVar.l(bArr, 0, i11);
        return new a(J10, bArr, j10);
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 PrivateCommand { ptsAdjustment=" + this.f9065B + ", identifier= " + this.f9066C + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9065B);
        parcel.writeLong(this.f9066C);
        parcel.writeByteArray(this.f9067D);
    }

    private a(long j10, byte[] bArr, long j11) {
        this.f9065B = j11;
        this.f9066C = j10;
        this.f9067D = bArr;
    }

    private a(Parcel parcel) {
        this.f9065B = parcel.readLong();
        this.f9066C = parcel.readLong();
        this.f9067D = (byte[]) L.i(parcel.createByteArray());
    }
}
