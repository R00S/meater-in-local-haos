package z9;

import B9.l;
import C9.k;
import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;
import java.util.concurrent.TimeUnit;

/* compiled from: PerfSession.java */
/* renamed from: z9.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5219a implements Parcelable {
    public static final Parcelable.Creator<C5219a> CREATOR = new C0791a();

    /* renamed from: B, reason: collision with root package name */
    private final String f53922B;

    /* renamed from: C, reason: collision with root package name */
    private final l f53923C;

    /* renamed from: D, reason: collision with root package name */
    private boolean f53924D;

    /* compiled from: PerfSession.java */
    /* renamed from: z9.a$a, reason: collision with other inner class name */
    class C0791a implements Parcelable.Creator<C5219a> {
        C0791a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C5219a createFromParcel(Parcel parcel) {
            return new C5219a(parcel, (C0791a) null);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C5219a[] newArray(int i10) {
            return new C5219a[i10];
        }
    }

    /* synthetic */ C5219a(Parcel parcel, C0791a c0791a) {
        this(parcel);
    }

    public static k[] b(List<C5219a> list) {
        if (list.isEmpty()) {
            return null;
        }
        k[] kVarArr = new k[list.size()];
        k kVarA = list.get(0).a();
        boolean z10 = false;
        for (int i10 = 1; i10 < list.size(); i10++) {
            k kVarA2 = list.get(i10).a();
            if (z10 || !list.get(i10).g()) {
                kVarArr[i10] = kVarA2;
            } else {
                kVarArr[0] = kVarA2;
                kVarArr[i10] = kVarA;
                z10 = true;
            }
        }
        if (!z10) {
            kVarArr[0] = kVarA;
        }
        return kVarArr;
    }

    public static C5219a c(String str) {
        C5219a c5219a = new C5219a(str.replace("-", ""), new B9.a());
        c5219a.i(j());
        return c5219a;
    }

    public static boolean j() {
        com.google.firebase.perf.config.a aVarG = com.google.firebase.perf.config.a.g();
        return aVarG.K() && Math.random() < aVarG.D();
    }

    public k a() {
        k.c cVarM = k.h0().M(this.f53922B);
        if (this.f53924D) {
            cVarM.L(C9.l.GAUGES_AND_SYSTEM_EVENTS);
        }
        return cVarM.e();
    }

    public l d() {
        return this.f53923C;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean e() {
        return this.f53924D;
    }

    public boolean f() {
        return TimeUnit.MICROSECONDS.toMinutes(this.f53923C.c()) > com.google.firebase.perf.config.a.g().A();
    }

    public boolean g() {
        return this.f53924D;
    }

    public String h() {
        return this.f53922B;
    }

    public void i(boolean z10) {
        this.f53924D = z10;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f53922B);
        parcel.writeByte(this.f53924D ? (byte) 1 : (byte) 0);
        parcel.writeParcelable(this.f53923C, 0);
    }

    public C5219a(String str, B9.a aVar) {
        this.f53924D = false;
        this.f53922B = str;
        this.f53923C = aVar.a();
    }

    private C5219a(Parcel parcel) {
        this.f53924D = false;
        this.f53922B = parcel.readString();
        this.f53924D = parcel.readByte() != 0;
        this.f53923C = (l) parcel.readParcelable(l.class.getClassLoader());
    }
}
