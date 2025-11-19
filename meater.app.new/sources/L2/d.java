package L2;

import X1.E;
import X1.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceInsertCommand.java */
/* loaded from: classes.dex */
public final class d extends L2.b {
    public static final Parcelable.Creator<d> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final long f9071B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f9072C;

    /* renamed from: D, reason: collision with root package name */
    public final boolean f9073D;

    /* renamed from: E, reason: collision with root package name */
    public final boolean f9074E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f9075F;

    /* renamed from: G, reason: collision with root package name */
    public final long f9076G;

    /* renamed from: H, reason: collision with root package name */
    public final long f9077H;

    /* renamed from: I, reason: collision with root package name */
    public final List<b> f9078I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f9079J;

    /* renamed from: K, reason: collision with root package name */
    public final long f9080K;

    /* renamed from: L, reason: collision with root package name */
    public final int f9081L;

    /* renamed from: M, reason: collision with root package name */
    public final int f9082M;

    /* renamed from: N, reason: collision with root package name */
    public final int f9083N;

    /* compiled from: SpliceInsertCommand.java */
    class a implements Parcelable.Creator<d> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public d createFromParcel(Parcel parcel) {
            return new d(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public d[] newArray(int i10) {
            return new d[i10];
        }
    }

    /* compiled from: SpliceInsertCommand.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9084a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9085b;

        /* renamed from: c, reason: collision with root package name */
        public final long f9086c;

        /* synthetic */ b(int i10, long j10, long j11, a aVar) {
            this(i10, j10, j11);
        }

        public static b a(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong(), parcel.readLong());
        }

        public void b(Parcel parcel) {
            parcel.writeInt(this.f9084a);
            parcel.writeLong(this.f9085b);
            parcel.writeLong(this.f9086c);
        }

        private b(int i10, long j10, long j11) {
            this.f9084a = i10;
            this.f9085b = j10;
            this.f9086c = j11;
        }
    }

    /* synthetic */ d(Parcel parcel, a aVar) {
        this(parcel);
    }

    static d a(y yVar, long j10, E e10) {
        List list;
        boolean z10;
        boolean z11;
        long j11;
        boolean z12;
        long j12;
        int iP;
        int iH;
        int iH2;
        boolean z13;
        boolean z14;
        long J10;
        long J11 = yVar.J();
        boolean z15 = (yVar.H() & 128) != 0;
        List listEmptyList = Collections.emptyList();
        if (z15) {
            list = listEmptyList;
            z10 = false;
            z11 = false;
            j11 = -9223372036854775807L;
            z12 = false;
            j12 = -9223372036854775807L;
            iP = 0;
            iH = 0;
            iH2 = 0;
            z13 = false;
        } else {
            int iH3 = yVar.H();
            boolean z16 = (iH3 & 128) != 0;
            boolean z17 = (iH3 & 64) != 0;
            boolean z18 = (iH3 & 32) != 0;
            boolean z19 = (iH3 & 16) != 0;
            long jB = (!z17 || z19) ? -9223372036854775807L : g.b(yVar, j10);
            if (!z17) {
                int iH4 = yVar.H();
                ArrayList arrayList = new ArrayList(iH4);
                for (int i10 = 0; i10 < iH4; i10++) {
                    int iH5 = yVar.H();
                    long jB2 = !z19 ? g.b(yVar, j10) : -9223372036854775807L;
                    arrayList.add(new b(iH5, jB2, e10.b(jB2), null));
                }
                listEmptyList = arrayList;
            }
            if (z18) {
                long jH = yVar.H();
                boolean z20 = (128 & jH) != 0;
                J10 = ((((jH & 1) << 32) | yVar.J()) * 1000) / 90;
                z14 = z20;
            } else {
                z14 = false;
                J10 = -9223372036854775807L;
            }
            iP = yVar.P();
            z13 = z17;
            iH = yVar.H();
            iH2 = yVar.H();
            list = listEmptyList;
            long j13 = jB;
            z12 = z14;
            j12 = J10;
            z11 = z19;
            z10 = z16;
            j11 = j13;
        }
        return new d(J11, z15, z10, z13, z11, j11, e10.b(j11), list, z12, j12, iP, iH, iH2);
    }

    @Override // L2.b
    public String toString() {
        return "SCTE-35 SpliceInsertCommand { programSplicePts=" + this.f9076G + ", programSplicePlaybackPositionUs= " + this.f9077H + " }";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f9071B);
        parcel.writeByte(this.f9072C ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9073D ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9074E ? (byte) 1 : (byte) 0);
        parcel.writeByte(this.f9075F ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9076G);
        parcel.writeLong(this.f9077H);
        int size = this.f9078I.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f9078I.get(i11).b(parcel);
        }
        parcel.writeByte(this.f9079J ? (byte) 1 : (byte) 0);
        parcel.writeLong(this.f9080K);
        parcel.writeInt(this.f9081L);
        parcel.writeInt(this.f9082M);
        parcel.writeInt(this.f9083N);
    }

    private d(long j10, boolean z10, boolean z11, boolean z12, boolean z13, long j11, long j12, List<b> list, boolean z14, long j13, int i10, int i11, int i12) {
        this.f9071B = j10;
        this.f9072C = z10;
        this.f9073D = z11;
        this.f9074E = z12;
        this.f9075F = z13;
        this.f9076G = j11;
        this.f9077H = j12;
        this.f9078I = Collections.unmodifiableList(list);
        this.f9079J = z14;
        this.f9080K = j13;
        this.f9081L = i10;
        this.f9082M = i11;
        this.f9083N = i12;
    }

    private d(Parcel parcel) {
        this.f9071B = parcel.readLong();
        this.f9072C = parcel.readByte() == 1;
        this.f9073D = parcel.readByte() == 1;
        this.f9074E = parcel.readByte() == 1;
        this.f9075F = parcel.readByte() == 1;
        this.f9076G = parcel.readLong();
        this.f9077H = parcel.readLong();
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(b.a(parcel));
        }
        this.f9078I = Collections.unmodifiableList(arrayList);
        this.f9079J = parcel.readByte() == 1;
        this.f9080K = parcel.readLong();
        this.f9081L = parcel.readInt();
        this.f9082M = parcel.readInt();
        this.f9083N = parcel.readInt();
    }
}
