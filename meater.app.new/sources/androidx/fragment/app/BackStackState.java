package androidx.fragment.app;

import android.annotation.SuppressLint;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import androidx.fragment.app.AbstractC0485u;
import androidx.lifecycle.AbstractC0511g;
import java.util.ArrayList;

@SuppressLint({"BanParcelableUsage"})
/* loaded from: classes.dex */
final class BackStackState implements Parcelable {
    public static final Parcelable.Creator<BackStackState> CREATOR = new C0427a();

    /* renamed from: f */
    final int[] f3039f;

    /* renamed from: g */
    final ArrayList<String> f3040g;

    /* renamed from: h */
    final int[] f3041h;

    /* renamed from: i */
    final int[] f3042i;

    /* renamed from: j */
    final int f3043j;

    /* renamed from: k */
    final String f3044k;

    /* renamed from: l */
    final int f3045l;

    /* renamed from: m */
    final int f3046m;

    /* renamed from: n */
    final CharSequence f3047n;

    /* renamed from: o */
    final int f3048o;

    /* renamed from: p */
    final CharSequence f3049p;

    /* renamed from: q */
    final ArrayList<String> f3050q;

    /* renamed from: r */
    final ArrayList<String> f3051r;

    /* renamed from: s */
    final boolean f3052s;

    /* renamed from: androidx.fragment.app.BackStackState$a */
    class C0427a implements Parcelable.Creator<BackStackState> {
        C0427a() {
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public BackStackState createFromParcel(Parcel parcel) {
            return new BackStackState(parcel);
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public BackStackState[] newArray(int i2) {
            return new BackStackState[i2];
        }
    }

    public BackStackState(C0462a c0462a) {
        int size = c0462a.f3318c.size();
        this.f3039f = new int[size * 5];
        if (!c0462a.f3324i) {
            throw new IllegalStateException("Not on back stack");
        }
        this.f3040g = new ArrayList<>(size);
        this.f3041h = new int[size];
        this.f3042i = new int[size];
        int i2 = 0;
        int i3 = 0;
        while (i2 < size) {
            AbstractC0485u.a aVar = c0462a.f3318c.get(i2);
            int i4 = i3 + 1;
            this.f3039f[i3] = aVar.f3335a;
            ArrayList<String> arrayList = this.f3040g;
            Fragment fragment = aVar.f3336b;
            arrayList.add(fragment != null ? fragment.mWho : null);
            int[] iArr = this.f3039f;
            int i5 = i4 + 1;
            iArr[i4] = aVar.f3337c;
            int i6 = i5 + 1;
            iArr[i5] = aVar.f3338d;
            int i7 = i6 + 1;
            iArr[i6] = aVar.f3339e;
            iArr[i7] = aVar.f3340f;
            this.f3041h[i2] = aVar.f3341g.ordinal();
            this.f3042i[i2] = aVar.f3342h.ordinal();
            i2++;
            i3 = i7 + 1;
        }
        this.f3043j = c0462a.f3323h;
        this.f3044k = c0462a.f3326k;
        this.f3045l = c0462a.f3184v;
        this.f3046m = c0462a.f3327l;
        this.f3047n = c0462a.f3328m;
        this.f3048o = c0462a.f3329n;
        this.f3049p = c0462a.f3330o;
        this.f3050q = c0462a.f3331p;
        this.f3051r = c0462a.f3332q;
        this.f3052s = c0462a.f3333r;
    }

    /* renamed from: a */
    public C0462a m3377a(FragmentManager fragmentManager) {
        C0462a c0462a = new C0462a(fragmentManager);
        int i2 = 0;
        int i3 = 0;
        while (i2 < this.f3039f.length) {
            AbstractC0485u.a aVar = new AbstractC0485u.a();
            int i4 = i2 + 1;
            aVar.f3335a = this.f3039f[i2];
            if (FragmentManager.m3392H0(2)) {
                Log.v("FragmentManager", "Instantiate " + c0462a + " op #" + i3 + " base fragment #" + this.f3039f[i4]);
            }
            String str = this.f3040g.get(i3);
            if (str != null) {
                aVar.f3336b = fragmentManager.m3483h0(str);
            } else {
                aVar.f3336b = null;
            }
            aVar.f3341g = AbstractC0511g.c.values()[this.f3041h[i3]];
            aVar.f3342h = AbstractC0511g.c.values()[this.f3042i[i3]];
            int[] iArr = this.f3039f;
            int i5 = i4 + 1;
            int i6 = iArr[i4];
            aVar.f3337c = i6;
            int i7 = i5 + 1;
            int i8 = iArr[i5];
            aVar.f3338d = i8;
            int i9 = i7 + 1;
            int i10 = iArr[i7];
            aVar.f3339e = i10;
            int i11 = iArr[i9];
            aVar.f3340f = i11;
            c0462a.f3319d = i6;
            c0462a.f3320e = i8;
            c0462a.f3321f = i10;
            c0462a.f3322g = i11;
            c0462a.m3738f(aVar);
            i3++;
            i2 = i9 + 1;
        }
        c0462a.f3323h = this.f3043j;
        c0462a.f3326k = this.f3044k;
        c0462a.f3184v = this.f3045l;
        c0462a.f3324i = true;
        c0462a.f3327l = this.f3046m;
        c0462a.f3328m = this.f3047n;
        c0462a.f3329n = this.f3048o;
        c0462a.f3330o = this.f3049p;
        c0462a.f3331p = this.f3050q;
        c0462a.f3332q = this.f3051r;
        c0462a.f3333r = this.f3052s;
        c0462a.m3556v(1);
        return c0462a;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i2) {
        parcel.writeIntArray(this.f3039f);
        parcel.writeStringList(this.f3040g);
        parcel.writeIntArray(this.f3041h);
        parcel.writeIntArray(this.f3042i);
        parcel.writeInt(this.f3043j);
        parcel.writeString(this.f3044k);
        parcel.writeInt(this.f3045l);
        parcel.writeInt(this.f3046m);
        TextUtils.writeToParcel(this.f3047n, parcel, 0);
        parcel.writeInt(this.f3048o);
        TextUtils.writeToParcel(this.f3049p, parcel, 0);
        parcel.writeStringList(this.f3050q);
        parcel.writeStringList(this.f3051r);
        parcel.writeInt(this.f3052s ? 1 : 0);
    }

    public BackStackState(Parcel parcel) {
        this.f3039f = parcel.createIntArray();
        this.f3040g = parcel.createStringArrayList();
        this.f3041h = parcel.createIntArray();
        this.f3042i = parcel.createIntArray();
        this.f3043j = parcel.readInt();
        this.f3044k = parcel.readString();
        this.f3045l = parcel.readInt();
        this.f3046m = parcel.readInt();
        this.f3047n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3048o = parcel.readInt();
        this.f3049p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        this.f3050q = parcel.createStringArrayList();
        this.f3051r = parcel.createStringArrayList();
        this.f3052s = parcel.readInt() != 0;
    }
}
