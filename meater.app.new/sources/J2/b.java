package J2;

import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;

/* compiled from: BinaryFrame.java */
/* loaded from: classes.dex */
public final class b extends i {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: C, reason: collision with root package name */
    public final byte[] f7231C;

    /* compiled from: BinaryFrame.java */
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

    public b(String str, byte[] bArr) {
        super(str);
        this.f7231C = bArr;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return this.f7255B.equals(bVar.f7255B) && Arrays.equals(this.f7231C, bVar.f7231C);
    }

    public int hashCode() {
        return ((527 + this.f7255B.hashCode()) * 31) + Arrays.hashCode(this.f7231C);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f7255B);
        parcel.writeByteArray(this.f7231C);
    }

    b(Parcel parcel) {
        super((String) L.i(parcel.readString()));
        this.f7231C = (byte[]) L.i(parcel.createByteArray());
    }
}
