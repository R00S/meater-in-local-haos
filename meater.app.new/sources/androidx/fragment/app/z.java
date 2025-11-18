package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.AbstractC2106m;

/* compiled from: FragmentState.java */
@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class z implements Parcelable {
    public static final Parcelable.Creator<z> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    final String f25827B;

    /* renamed from: C, reason: collision with root package name */
    final String f25828C;

    /* renamed from: D, reason: collision with root package name */
    final boolean f25829D;

    /* renamed from: E, reason: collision with root package name */
    final boolean f25830E;

    /* renamed from: F, reason: collision with root package name */
    final int f25831F;

    /* renamed from: G, reason: collision with root package name */
    final int f25832G;

    /* renamed from: H, reason: collision with root package name */
    final String f25833H;

    /* renamed from: I, reason: collision with root package name */
    final boolean f25834I;

    /* renamed from: J, reason: collision with root package name */
    final boolean f25835J;

    /* renamed from: K, reason: collision with root package name */
    final boolean f25836K;

    /* renamed from: L, reason: collision with root package name */
    final boolean f25837L;

    /* renamed from: M, reason: collision with root package name */
    final int f25838M;

    /* renamed from: N, reason: collision with root package name */
    final String f25839N;

    /* renamed from: O, reason: collision with root package name */
    final int f25840O;

    /* renamed from: P, reason: collision with root package name */
    final boolean f25841P;

    /* compiled from: FragmentState.java */
    class a implements Parcelable.Creator<z> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public z createFromParcel(Parcel parcel) {
            return new z(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public z[] newArray(int i10) {
            return new z[i10];
        }
    }

    z(Fragment fragment) {
        this.f25827B = fragment.getClass().getName();
        this.f25828C = fragment.f25458G;
        this.f25829D = fragment.f25468Q;
        this.f25830E = fragment.f25470S;
        this.f25831F = fragment.f25478a0;
        this.f25832G = fragment.f25479b0;
        this.f25833H = fragment.f25480c0;
        this.f25834I = fragment.f25483f0;
        this.f25835J = fragment.f25465N;
        this.f25836K = fragment.f25482e0;
        this.f25837L = fragment.f25481d0;
        this.f25838M = fragment.f25499v0.ordinal();
        this.f25839N = fragment.f25461J;
        this.f25840O = fragment.f25462K;
        this.f25841P = fragment.f25491n0;
    }

    Fragment a(r rVar, ClassLoader classLoader) {
        Fragment fragmentC = rVar.c(classLoader, this.f25827B);
        fragmentC.f25458G = this.f25828C;
        fragmentC.f25468Q = this.f25829D;
        fragmentC.f25470S = this.f25830E;
        fragmentC.f25471T = true;
        fragmentC.f25478a0 = this.f25831F;
        fragmentC.f25479b0 = this.f25832G;
        fragmentC.f25480c0 = this.f25833H;
        fragmentC.f25483f0 = this.f25834I;
        fragmentC.f25465N = this.f25835J;
        fragmentC.f25482e0 = this.f25836K;
        fragmentC.f25481d0 = this.f25837L;
        fragmentC.f25499v0 = AbstractC2106m.b.values()[this.f25838M];
        fragmentC.f25461J = this.f25839N;
        fragmentC.f25462K = this.f25840O;
        fragmentC.f25491n0 = this.f25841P;
        return fragmentC;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder(128);
        sb2.append("FragmentState{");
        sb2.append(this.f25827B);
        sb2.append(" (");
        sb2.append(this.f25828C);
        sb2.append(")}:");
        if (this.f25829D) {
            sb2.append(" fromLayout");
        }
        if (this.f25830E) {
            sb2.append(" dynamicContainer");
        }
        if (this.f25832G != 0) {
            sb2.append(" id=0x");
            sb2.append(Integer.toHexString(this.f25832G));
        }
        String str = this.f25833H;
        if (str != null && !str.isEmpty()) {
            sb2.append(" tag=");
            sb2.append(this.f25833H);
        }
        if (this.f25834I) {
            sb2.append(" retainInstance");
        }
        if (this.f25835J) {
            sb2.append(" removing");
        }
        if (this.f25836K) {
            sb2.append(" detached");
        }
        if (this.f25837L) {
            sb2.append(" hidden");
        }
        if (this.f25839N != null) {
            sb2.append(" targetWho=");
            sb2.append(this.f25839N);
            sb2.append(" targetRequestCode=");
            sb2.append(this.f25840O);
        }
        if (this.f25841P) {
            sb2.append(" userVisibleHint");
        }
        return sb2.toString();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeString(this.f25827B);
        parcel.writeString(this.f25828C);
        parcel.writeInt(this.f25829D ? 1 : 0);
        parcel.writeInt(this.f25830E ? 1 : 0);
        parcel.writeInt(this.f25831F);
        parcel.writeInt(this.f25832G);
        parcel.writeString(this.f25833H);
        parcel.writeInt(this.f25834I ? 1 : 0);
        parcel.writeInt(this.f25835J ? 1 : 0);
        parcel.writeInt(this.f25836K ? 1 : 0);
        parcel.writeInt(this.f25837L ? 1 : 0);
        parcel.writeInt(this.f25838M);
        parcel.writeString(this.f25839N);
        parcel.writeInt(this.f25840O);
        parcel.writeInt(this.f25841P ? 1 : 0);
    }

    z(Parcel parcel) {
        this.f25827B = parcel.readString();
        this.f25828C = parcel.readString();
        this.f25829D = parcel.readInt() != 0;
        this.f25830E = parcel.readInt() != 0;
        this.f25831F = parcel.readInt();
        this.f25832G = parcel.readInt();
        this.f25833H = parcel.readString();
        this.f25834I = parcel.readInt() != 0;
        this.f25835J = parcel.readInt() != 0;
        this.f25836K = parcel.readInt() != 0;
        this.f25837L = parcel.readInt() != 0;
        this.f25838M = parcel.readInt();
        this.f25839N = parcel.readString();
        this.f25840O = parcel.readInt();
        this.f25841P = parcel.readInt() != 0;
    }
}
