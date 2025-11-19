package U1;

import U1.x;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.Arrays;
import java.util.List;

/* compiled from: Metadata.java */
/* loaded from: classes.dex */
public final class y implements Parcelable {
    public static final Parcelable.Creator<y> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private final b[] f17471B;

    /* renamed from: C, reason: collision with root package name */
    public final long f17472C;

    /* compiled from: Metadata.java */
    class a implements Parcelable.Creator<y> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public y createFromParcel(Parcel parcel) {
            return new y(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public y[] newArray(int i10) {
            return new y[i10];
        }
    }

    public y(b... bVarArr) {
        this(-9223372036854775807L, bVarArr);
    }

    public y a(b... bVarArr) {
        return bVarArr.length == 0 ? this : new y(this.f17472C, (b[]) X1.L.U0(this.f17471B, bVarArr));
    }

    public y b(y yVar) {
        return yVar == null ? this : a(yVar.f17471B);
    }

    public y c(long j10) {
        return this.f17472C == j10 ? this : new y(j10, this.f17471B);
    }

    public b d(int i10) {
        return this.f17471B[i10];
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public int e() {
        return this.f17471B.length;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || y.class != obj.getClass()) {
            return false;
        }
        y yVar = (y) obj;
        return Arrays.equals(this.f17471B, yVar.f17471B) && this.f17472C == yVar.f17472C;
    }

    public int hashCode() {
        return (Arrays.hashCode(this.f17471B) * 31) + p8.h.c(this.f17472C);
    }

    public String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("entries=");
        sb2.append(Arrays.toString(this.f17471B));
        if (this.f17472C == -9223372036854775807L) {
            str = "";
        } else {
            str = ", presentationTimeUs=" + this.f17472C;
        }
        sb2.append(str);
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeInt(this.f17471B.length);
        for (b bVar : this.f17471B) {
            parcel.writeParcelable(bVar, 0);
        }
        parcel.writeLong(this.f17472C);
    }

    public y(long j10, b... bVarArr) {
        this.f17472C = j10;
        this.f17471B = bVarArr;
    }

    public y(List<? extends b> list) {
        this((b[]) list.toArray(new b[0]));
    }

    public y(long j10, List<? extends b> list) {
        this(j10, (b[]) list.toArray(new b[0]));
    }

    y(Parcel parcel) {
        this.f17471B = new b[parcel.readInt()];
        int i10 = 0;
        while (true) {
            b[] bVarArr = this.f17471B;
            if (i10 < bVarArr.length) {
                bVarArr[i10] = (b) parcel.readParcelable(b.class.getClassLoader());
                i10++;
            } else {
                this.f17472C = parcel.readLong();
                return;
            }
        }
    }

    /* compiled from: Metadata.java */
    public interface b extends Parcelable {
        default s e0() {
            return null;
        }

        default byte[] q1() {
            return null;
        }

        default void L0(x.b bVar) {
        }
    }
}
