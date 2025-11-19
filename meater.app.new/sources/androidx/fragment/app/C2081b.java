package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import android.view.AbstractC2106m;
import androidx.fragment.app.C;
import java.util.ArrayList;
import java.util.Map;

/* compiled from: BackStackRecordState.java */
@SuppressLint({"BanParcelableUsage"})
/* renamed from: androidx.fragment.app.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2081b implements Parcelable {
    public static final Parcelable.Creator<C2081b> CREATOR = new a();

    /* renamed from: B, reason: collision with root package name */
    final int[] f25599B;

    /* renamed from: C, reason: collision with root package name */
    final ArrayList<String> f25600C;

    /* renamed from: D, reason: collision with root package name */
    final int[] f25601D;

    /* renamed from: E, reason: collision with root package name */
    final int[] f25602E;

    /* renamed from: F, reason: collision with root package name */
    final int f25603F;

    /* renamed from: G, reason: collision with root package name */
    final String f25604G;

    /* renamed from: H, reason: collision with root package name */
    final int f25605H;

    /* renamed from: I, reason: collision with root package name */
    final int f25606I;

    /* renamed from: J, reason: collision with root package name */
    final CharSequence f25607J;

    /* renamed from: K, reason: collision with root package name */
    final int f25608K;

    /* renamed from: L, reason: collision with root package name */
    final CharSequence f25609L;

    /* renamed from: M, reason: collision with root package name */
    final ArrayList<String> f25610M;

    /* renamed from: N, reason: collision with root package name */
    final ArrayList<String> f25611N;

    /* renamed from: O, reason: collision with root package name */
    final boolean f25612O;

    /* compiled from: BackStackRecordState.java */
    /* renamed from: androidx.fragment.app.b$a */
    class a implements Parcelable.Creator<C2081b> {
        a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public C2081b createFromParcel(Parcel parcel) {
            return new C2081b(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public C2081b[] newArray(int i10) {
            return new C2081b[i10];
        }
    }

    C2081b(C2080a c2080a) {
        int size = c2080a.f25396c.size();
        this.f25599B = new int[size * 6];
        if (!c2080a.f25402i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f25600C = new ArrayList<>(size);
        this.f25601D = new int[size];
        this.f25602E = new int[size];
        int i10 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C.a aVar = c2080a.f25396c.get(i11);
            int i12 = i10 + 1;
            this.f25599B[i10] = aVar.f25413a;
            ArrayList<String> arrayList = this.f25600C;
            Fragment fragment = aVar.f25414b;
            arrayList.add(fragment != null ? fragment.f25458G : null);
            int[] iArr = this.f25599B;
            iArr[i12] = aVar.f25415c ? 1 : 0;
            iArr[i10 + 2] = aVar.f25416d;
            iArr[i10 + 3] = aVar.f25417e;
            int i13 = i10 + 5;
            iArr[i10 + 4] = aVar.f25418f;
            i10 += 6;
            iArr[i13] = aVar.f25419g;
            this.f25601D[i11] = aVar.f25420h.ordinal();
            this.f25602E[i11] = aVar.f25421i.ordinal();
        }
        this.f25603F = c2080a.f25401h;
        this.f25604G = c2080a.f25404k;
        this.f25605H = c2080a.f25597v;
        this.f25606I = c2080a.f25405l;
        this.f25607J = c2080a.f25406m;
        this.f25608K = c2080a.f25407n;
        this.f25609L = c2080a.f25408o;
        this.f25610M = c2080a.f25409p;
        this.f25611N = c2080a.f25410q;
        this.f25612O = c2080a.f25411r;
    }

    private void a(C2080a c2080a) {
        int i10 = 0;
        int i11 = 0;
        while (true) {
            boolean z10 = true;
            if (i10 >= this.f25599B.length) {
                c2080a.f25401h = this.f25603F;
                c2080a.f25404k = this.f25604G;
                c2080a.f25402i = true;
                c2080a.f25405l = this.f25606I;
                c2080a.f25406m = this.f25607J;
                c2080a.f25407n = this.f25608K;
                c2080a.f25408o = this.f25609L;
                c2080a.f25409p = this.f25610M;
                c2080a.f25410q = this.f25611N;
                c2080a.f25411r = this.f25612O;
                return;
            }
            C.a aVar = new C.a();
            int i12 = i10 + 1;
            aVar.f25413a = this.f25599B[i10];
            if (v.Q0(2)) {
                Log.v("FragmentManager", "Instantiate " + c2080a + " op #" + i11 + " base fragment #" + this.f25599B[i12]);
            }
            aVar.f25420h = AbstractC2106m.b.values()[this.f25601D[i11]];
            aVar.f25421i = AbstractC2106m.b.values()[this.f25602E[i11]];
            int[] iArr = this.f25599B;
            int i13 = i10 + 2;
            if (iArr[i12] == 0) {
                z10 = false;
            }
            aVar.f25415c = z10;
            int i14 = iArr[i13];
            aVar.f25416d = i14;
            int i15 = iArr[i10 + 3];
            aVar.f25417e = i15;
            int i16 = i10 + 5;
            int i17 = iArr[i10 + 4];
            aVar.f25418f = i17;
            i10 += 6;
            int i18 = iArr[i16];
            aVar.f25419g = i18;
            c2080a.f25397d = i14;
            c2080a.f25398e = i15;
            c2080a.f25399f = i17;
            c2080a.f25400g = i18;
            c2080a.f(aVar);
            i11++;
        }
    }

    public C2080a b(v vVar) {
        C2080a c2080a = new C2080a(vVar);
        a(c2080a);
        c2080a.f25597v = this.f25605H;
        for (int i10 = 0; i10 < this.f25600C.size(); i10++) {
            String str = this.f25600C.get(i10);
            if (str != null) {
                c2080a.f25396c.get(i10).f25414b = vVar.k0(str);
            }
        }
        c2080a.D(1);
        return c2080a;
    }

    public C2080a c(v vVar, Map<String, Fragment> map) {
        C2080a c2080a = new C2080a(vVar);
        a(c2080a);
        for (int i10 = 0; i10 < this.f25600C.size(); i10++) {
            String str = this.f25600C.get(i10);
            if (str != null) {
                Fragment fragment = map.get(str);
                if (fragment == null) {
                    throw new IllegalStateException("Restoring FragmentTransaction " + this.f25604G + " failed due to missing saved state for Fragment (" + str + ")");
                }
                c2080a.f25396c.get(i10).f25414b = fragment;
            }
        }
        return c2080a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i10) {
        parcel.writeIntArray(this.f25599B);
        parcel.writeStringList(this.f25600C);
        parcel.writeIntArray(this.f25601D);
        parcel.writeIntArray(this.f25602E);
        parcel.writeInt(this.f25603F);
        parcel.writeString(this.f25604G);
        parcel.writeInt(this.f25605H);
        parcel.writeInt(this.f25606I);
        TextUtils.writeToParcel(this.f25607J, parcel, 0);
        parcel.writeInt(this.f25608K);
        TextUtils.writeToParcel(this.f25609L, parcel, 0);
        parcel.writeStringList(this.f25610M);
        parcel.writeStringList(this.f25611N);
        parcel.writeInt(this.f25612O ? 1 : 0);
    }

    C2081b(Parcel parcel) {
        this.f25599B = parcel.createIntArray();
        this.f25600C = parcel.createStringArrayList();
        this.f25601D = parcel.createIntArray();
        this.f25602E = parcel.createIntArray();
        this.f25603F = parcel.readInt();
        this.f25604G = parcel.readString();
        this.f25605H = parcel.readInt();
        this.f25606I = parcel.readInt();
        Parcelable.Creator creator = TextUtils.CHAR_SEQUENCE_CREATOR;
        this.f25607J = (CharSequence) creator.createFromParcel(parcel);
        this.f25608K = parcel.readInt();
        this.f25609L = (CharSequence) creator.createFromParcel(parcel);
        this.f25610M = parcel.createStringArrayList();
        this.f25611N = parcel.createStringArrayList();
        this.f25612O = parcel.readInt() != 0;
    }
}
