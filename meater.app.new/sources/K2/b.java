package K2;

import K2.b;
import U1.y;
import X1.C1804a;
import X1.L;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import l8.C3918k;
import m8.AbstractC3999n;

/* compiled from: SlowMotionData.java */
/* loaded from: classes.dex */
public final class b implements y.b {
    public static final Parcelable.Creator<b> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    public final List<C0169b> f8670B;

    /* compiled from: SlowMotionData.java */
    class a implements Parcelable.Creator<b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public b createFromParcel(Parcel parcel) {
            ArrayList arrayList = new ArrayList();
            parcel.readList(arrayList, C0169b.class.getClassLoader());
            return new b(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b[] newArray(int i10) {
            return new b[i10];
        }
    }

    /* compiled from: SlowMotionData.java */
    /* renamed from: K2.b$b, reason: collision with other inner class name */
    public static final class C0169b implements Parcelable {

        /* renamed from: B, reason: collision with root package name */
        public final long f8672B;

        /* renamed from: C, reason: collision with root package name */
        public final long f8673C;

        /* renamed from: D, reason: collision with root package name */
        public final int f8674D;

        /* renamed from: E, reason: collision with root package name */
        public static final Comparator<C0169b> f8671E = new Comparator() { // from class: K2.c
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return b.C0169b.b((b.C0169b) obj, (b.C0169b) obj2);
            }
        };
        public static final Parcelable.Creator<C0169b> CREATOR = new a();

        /* compiled from: SlowMotionData.java */
        /* renamed from: K2.b$b$a */
        class a implements Parcelable.Creator<C0169b> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public C0169b createFromParcel(Parcel parcel) {
                return new C0169b(parcel.readLong(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public C0169b[] newArray(int i10) {
                return new C0169b[i10];
            }
        }

        public C0169b(long j10, long j11, int i10) {
            C1804a.a(j10 < j11);
            this.f8672B = j10;
            this.f8673C = j11;
            this.f8674D = i10;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ int b(C0169b c0169b, C0169b c0169b2) {
            return AbstractC3999n.j().e(c0169b.f8672B, c0169b2.f8672B).e(c0169b.f8673C, c0169b2.f8673C).d(c0169b.f8674D, c0169b2.f8674D).i();
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || C0169b.class != obj.getClass()) {
                return false;
            }
            C0169b c0169b = (C0169b) obj;
            return this.f8672B == c0169b.f8672B && this.f8673C == c0169b.f8673C && this.f8674D == c0169b.f8674D;
        }

        public int hashCode() {
            return C3918k.b(Long.valueOf(this.f8672B), Long.valueOf(this.f8673C), Integer.valueOf(this.f8674D));
        }

        public String toString() {
            return L.G("Segment: startTimeMs=%d, endTimeMs=%d, speedDivisor=%d", Long.valueOf(this.f8672B), Long.valueOf(this.f8673C), Integer.valueOf(this.f8674D));
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeLong(this.f8672B);
            parcel.writeLong(this.f8673C);
            parcel.writeInt(this.f8674D);
        }
    }

    public b(List<C0169b> list) {
        this.f8670B = list;
        C1804a.a(!a(list));
    }

    private static boolean a(List<C0169b> list) {
        if (list.isEmpty()) {
            return false;
        }
        long j10 = list.get(0).f8673C;
        for (int i10 = 1; i10 < list.size(); i10++) {
            if (list.get(i10).f8672B < j10) {
                return true;
            }
            j10 = list.get(i10).f8673C;
        }
        return false;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        return this.f8670B.equals(((b) obj).f8670B);
    }

    public int hashCode() {
        return this.f8670B.hashCode();
    }

    public String toString() {
        return "SlowMotion: segments=" + this.f8670B;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeList(this.f8670B);
    }
}
