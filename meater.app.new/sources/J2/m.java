package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: PrivFrame.java */
/* loaded from: classes.dex */
public final class m extends i {
    public static final Parcelable.Creator<m> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final String f7265C;

    /* renamed from: D, reason: collision with root package name */
    public final byte[] f7266D;

    /* compiled from: PrivFrame.java */
    class a implements Parcelable.Creator<m> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public m createFromParcel(Parcel parcel) {
            return new m(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public m[] newArray(int i10) {
            return new m[i10];
        }
    }

    public m(String str, byte[] bArr) {
        super("PRIV");
        this.f7265C = str;
        this.f7266D = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        return L.d(this.f7265C, mVar.f7265C) && Arrays.equals(this.f7266D, mVar.f7266D);
    }

    public int hashCode() {
        String str = this.f7265C;
        return ((527 + (str != null ? str.hashCode() : 0)) * 31) + Arrays.hashCode(this.f7266D);
    }

    @Override // J2.i
    public String toString() {
        return this.f7255B + ": owner=" + this.f7265C;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7265C);
        parcel.writeByteArray(this.f7266D);
    }

    m(Parcel parcel) {
        super("PRIV");
        this.f7265C = (String) L.i(parcel.readString());
        this.f7266D = (byte[]) L.i(parcel.createByteArray());
    }
}
