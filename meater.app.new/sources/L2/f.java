package L2;

import X1.y;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: SpliceScheduleCommand.java */
/* loaded from: classes.dex */
public final class f extends L2.b {
    public static final Parcelable.Creator<f> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final List<c> f9087B;

    /* compiled from: SpliceScheduleCommand.java */
    class a implements Parcelable.Creator<f> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public f createFromParcel(Parcel parcel) {
            return new f(parcel, null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public f[] newArray(int i10) {
            return new f[i10];
        }
    }

    /* compiled from: SpliceScheduleCommand.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final int f9088a;

        /* renamed from: b, reason: collision with root package name */
        public final long f9089b;

        /* synthetic */ b(int i10, long j10, a aVar) {
            this(i10, j10);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b c(Parcel parcel) {
            return new b(parcel.readInt(), parcel.readLong());
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void d(Parcel parcel) {
            parcel.writeInt(this.f9088a);
            parcel.writeLong(this.f9089b);
        }

        private b(int i10, long j10) {
            this.f9088a = i10;
            this.f9089b = j10;
        }
    }

    /* synthetic */ f(Parcel parcel, a aVar) {
        this(parcel);
    }

    static f a(y yVar) {
        int iH = yVar.H();
        ArrayList arrayList = new ArrayList(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            arrayList.add(c.e(yVar));
        }
        return new f(arrayList);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        int size = this.f9087B.size();
        parcel.writeInt(size);
        for (int i11 = 0; i11 < size; i11++) {
            this.f9087B.get(i11).f(parcel);
        }
    }

    private f(List<c> list) {
        this.f9087B = Collections.unmodifiableList(list);
    }

    private f(Parcel parcel) {
        int i10 = parcel.readInt();
        ArrayList arrayList = new ArrayList(i10);
        for (int i11 = 0; i11 < i10; i11++) {
            arrayList.add(c.d(parcel));
        }
        this.f9087B = Collections.unmodifiableList(arrayList);
    }

    /* compiled from: SpliceScheduleCommand.java */
    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final long f9090a;

        /* renamed from: b, reason: collision with root package name */
        public final boolean f9091b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f9092c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f9093d;

        /* renamed from: e, reason: collision with root package name */
        public final long f9094e;

        /* renamed from: f, reason: collision with root package name */
        public final List<b> f9095f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f9096g;

        /* renamed from: h, reason: collision with root package name */
        public final long f9097h;

        /* renamed from: i, reason: collision with root package name */
        public final int f9098i;

        /* renamed from: j, reason: collision with root package name */
        public final int f9099j;

        /* renamed from: k, reason: collision with root package name */
        public final int f9100k;

        private c(long j10, boolean z10, boolean z11, boolean z12, List<b> list, long j11, boolean z13, long j12, int i10, int i11, int i12) {
            this.f9090a = j10;
            this.f9091b = z10;
            this.f9092c = z11;
            this.f9093d = z12;
            this.f9095f = Collections.unmodifiableList(list);
            this.f9094e = j11;
            this.f9096g = z13;
            this.f9097h = j12;
            this.f9098i = i10;
            this.f9099j = i11;
            this.f9100k = i12;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c d(Parcel parcel) {
            return new c(parcel);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static c e(y yVar) {
            ArrayList arrayList;
            boolean z10;
            long j10;
            boolean z11;
            long j11;
            int i10;
            int i11;
            int iH;
            boolean z12;
            boolean z13;
            long J10;
            long J11 = yVar.J();
            boolean z14 = (yVar.H() & 128) != 0;
            ArrayList arrayList2 = new ArrayList();
            if (z14) {
                arrayList = arrayList2;
                z10 = false;
                j10 = -9223372036854775807L;
                z11 = false;
                j11 = -9223372036854775807L;
                i10 = 0;
                i11 = 0;
                iH = 0;
                z12 = false;
            } else {
                int iH2 = yVar.H();
                boolean z15 = (iH2 & 128) != 0;
                boolean z16 = (iH2 & 64) != 0;
                boolean z17 = (iH2 & 32) != 0;
                long J12 = z16 ? yVar.J() : -9223372036854775807L;
                if (!z16) {
                    int iH3 = yVar.H();
                    ArrayList arrayList3 = new ArrayList(iH3);
                    for (int i12 = 0; i12 < iH3; i12++) {
                        arrayList3.add(new b(yVar.H(), yVar.J(), null));
                    }
                    arrayList2 = arrayList3;
                }
                if (z17) {
                    long jH = yVar.H();
                    boolean z18 = (128 & jH) != 0;
                    J10 = ((((jH & 1) << 32) | yVar.J()) * 1000) / 90;
                    z13 = z18;
                } else {
                    z13 = false;
                    J10 = -9223372036854775807L;
                }
                int iP = yVar.P();
                int iH4 = yVar.H();
                z12 = z16;
                iH = yVar.H();
                j11 = J10;
                arrayList = arrayList2;
                long j12 = J12;
                i10 = iP;
                i11 = iH4;
                j10 = j12;
                boolean z19 = z15;
                z11 = z13;
                z10 = z19;
            }
            return new c(J11, z14, z10, z12, arrayList, j10, z11, j11, i10, i11, iH);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public void f(Parcel parcel) {
            parcel.writeLong(this.f9090a);
            parcel.writeByte(this.f9091b ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9092c ? (byte) 1 : (byte) 0);
            parcel.writeByte(this.f9093d ? (byte) 1 : (byte) 0);
            int size = this.f9095f.size();
            parcel.writeInt(size);
            for (int i10 = 0; i10 < size; i10++) {
                this.f9095f.get(i10).d(parcel);
            }
            parcel.writeLong(this.f9094e);
            parcel.writeByte(this.f9096g ? (byte) 1 : (byte) 0);
            parcel.writeLong(this.f9097h);
            parcel.writeInt(this.f9098i);
            parcel.writeInt(this.f9099j);
            parcel.writeInt(this.f9100k);
        }

        private c(Parcel parcel) {
            this.f9090a = parcel.readLong();
            this.f9091b = parcel.readByte() == 1;
            this.f9092c = parcel.readByte() == 1;
            this.f9093d = parcel.readByte() == 1;
            int i10 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                arrayList.add(b.c(parcel));
            }
            this.f9095f = Collections.unmodifiableList(arrayList);
            this.f9094e = parcel.readLong();
            this.f9096g = parcel.readByte() == 1;
            this.f9097h = parcel.readLong();
            this.f9098i = parcel.readInt();
            this.f9099j = parcel.readInt();
            this.f9100k = parcel.readInt();
        }
    }
}
