package L2;

import X1.E;
import X1.y;
import android.os.Parcel;
import android.os.Parcelable;

/* compiled from: TimeSignalCommand.java */
/* loaded from: classes.dex */
public final class g extends b {
    public static final Parcelable.Creator<g> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final long f9101B;

    /* renamed from: C, reason: collision with root package name */
    public final long f9102C;

    /* compiled from: TimeSignalCommand.java */
    class a implements Parcelable.Creator<g> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public g createFromParcel(Parcel parcel) {
            return new g(parcel.readLong(), parcel.readLong(), null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public g[] newArray(int i10) {
            return new g[i10];
        }
    }

    /* synthetic */ g(long j10, long j11, a aVar) {
        this(j10, j11);
    }

    static g a(y yVar, long j10, E e10) {
        long jB = b(yVar, j10);
        return new g(jB, e10.b(jB));
    }

    static long b(y yVar, long j10) {
        long jH = yVar.H();
        if ((128 & jH) != 0) {
            return 8589934591L & ((((jH & 1) << 32) | yVar.J()) + j10);
        }
        return -9223372036854775807L;
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 TimeSignalCommand { ptsTime=" + this.f9101B + ", playbackPositionUs= " + this.f9102C + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9101B);
        parcel.writeLong(this.f9102C);
    }

    private g(long j10, long j11) {
        this.f9101B = j10;
        this.f9102C = j11;
    }
}
