package B9;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import java.util.concurrent.TimeUnit;

/* compiled from: Timer.java */
/* loaded from: classes2.dex */
public class l implements Parcelable {
    public static final Parcelable.Creator<l> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    private long f1949B;

    /* renamed from: C, reason: collision with root package name */
    private long f1950C;

    /* compiled from: Timer.java */
    class a implements Parcelable.Creator<l> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public l createFromParcel(Parcel parcel) {
            return new l(parcel, (a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public l[] newArray(int i10) {
            return new l[i10];
        }
    }

    /* synthetic */ l(Parcel parcel, a aVar) {
        this(parcel);
    }

    private static long a() {
        return TimeUnit.NANOSECONDS.toMicros(SystemClock.elapsedRealtimeNanos());
    }

    public static l f(long j10) {
        long micros = TimeUnit.MILLISECONDS.toMicros(j10);
        return new l(h() + (micros - a()), micros);
    }

    private static long h() {
        return TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis());
    }

    public long b() {
        return this.f1949B + c();
    }

    public long c() {
        return d(new l());
    }

    public long d(l lVar) {
        return lVar.f1950C - this.f1950C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public long e() {
        return this.f1949B;
    }

    public void g() {
        this.f1949B = h();
        this.f1950C = a();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeLong(this.f1949B);
        parcel.writeLong(this.f1950C);
    }

    public l() {
        this(h(), a());
    }

    l(long j10, long j11) {
        this.f1949B = j10;
        this.f1950C = j11;
    }

    private l(Parcel parcel) {
        this(parcel.readLong(), parcel.readLong());
    }
}
