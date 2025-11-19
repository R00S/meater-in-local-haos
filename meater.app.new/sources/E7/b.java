package E7;

import C7.e;
import C7.j;
import C7.k;
import C7.l;
import C7.m;
import U7.d;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import com.google.android.material.internal.r;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: BadgeState.java */
/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final a f4029a;

    /* renamed from: b, reason: collision with root package name */
    private final a f4030b;

    /* renamed from: c, reason: collision with root package name */
    final float f4031c;

    /* renamed from: d, reason: collision with root package name */
    final float f4032d;

    /* renamed from: e, reason: collision with root package name */
    final float f4033e;

    /* renamed from: f, reason: collision with root package name */
    final float f4034f;

    /* renamed from: g, reason: collision with root package name */
    final float f4035g;

    /* renamed from: h, reason: collision with root package name */
    final float f4036h;

    /* renamed from: i, reason: collision with root package name */
    final int f4037i;

    /* renamed from: j, reason: collision with root package name */
    final int f4038j;

    /* renamed from: k, reason: collision with root package name */
    int f4039k;

    b(Context context, int i10, int i11, int i12, a aVar) throws XmlPullParserException, Resources.NotFoundException, IOException {
        a aVar2 = new a();
        this.f4030b = aVar2;
        aVar = aVar == null ? new a() : aVar;
        if (i10 != 0) {
            aVar.f4040B = i10;
        }
        TypedArray typedArrayA = a(context, aVar.f4040B, i11, i12);
        Resources resources = context.getResources();
        this.f4031c = typedArrayA.getDimensionPixelSize(m.f2690K, -1);
        this.f4037i = context.getResources().getDimensionPixelSize(e.f2377Y);
        this.f4038j = context.getResources().getDimensionPixelSize(e.f2380a0);
        this.f4032d = typedArrayA.getDimensionPixelSize(m.f2790U, -1);
        int i13 = m.f2770S;
        int i14 = e.f2421v;
        this.f4033e = typedArrayA.getDimension(i13, resources.getDimension(i14));
        int i15 = m.f2820X;
        int i16 = e.f2423w;
        this.f4035g = typedArrayA.getDimension(i15, resources.getDimension(i16));
        this.f4034f = typedArrayA.getDimension(m.f2680J, resources.getDimension(i14));
        this.f4036h = typedArrayA.getDimension(m.f2780T, resources.getDimension(i16));
        boolean z10 = true;
        this.f4039k = typedArrayA.getInt(m.f2895e0, 1);
        aVar2.f4048J = aVar.f4048J == -2 ? 255 : aVar.f4048J;
        if (aVar.f4050L != -2) {
            aVar2.f4050L = aVar.f4050L;
        } else {
            int i17 = m.f2884d0;
            if (typedArrayA.hasValue(i17)) {
                aVar2.f4050L = typedArrayA.getInt(i17, 0);
            } else {
                aVar2.f4050L = -1;
            }
        }
        if (aVar.f4049K != null) {
            aVar2.f4049K = aVar.f4049K;
        } else {
            int i18 = m.f2720N;
            if (typedArrayA.hasValue(i18)) {
                aVar2.f4049K = typedArrayA.getString(i18);
            }
        }
        aVar2.f4054P = aVar.f4054P;
        aVar2.f4055Q = aVar.f4055Q == null ? context.getString(k.f2541j) : aVar.f4055Q;
        aVar2.f4056R = aVar.f4056R == 0 ? j.f2529a : aVar.f4056R;
        aVar2.f4057S = aVar.f4057S == 0 ? k.f2546o : aVar.f4057S;
        if (aVar.f4059U != null && !aVar.f4059U.booleanValue()) {
            z10 = false;
        }
        aVar2.f4059U = Boolean.valueOf(z10);
        aVar2.f4051M = aVar.f4051M == -2 ? typedArrayA.getInt(m.f2862b0, -2) : aVar.f4051M;
        aVar2.f4052N = aVar.f4052N == -2 ? typedArrayA.getInt(m.f2873c0, -2) : aVar.f4052N;
        aVar2.f4044F = Integer.valueOf(aVar.f4044F == null ? typedArrayA.getResourceId(m.f2700L, l.f2565b) : aVar.f4044F.intValue());
        aVar2.f4045G = Integer.valueOf(aVar.f4045G == null ? typedArrayA.getResourceId(m.f2710M, 0) : aVar.f4045G.intValue());
        aVar2.f4046H = Integer.valueOf(aVar.f4046H == null ? typedArrayA.getResourceId(m.f2800V, l.f2565b) : aVar.f4046H.intValue());
        aVar2.f4047I = Integer.valueOf(aVar.f4047I == null ? typedArrayA.getResourceId(m.f2810W, 0) : aVar.f4047I.intValue());
        aVar2.f4041C = Integer.valueOf(aVar.f4041C == null ? H(context, typedArrayA, m.f2660H) : aVar.f4041C.intValue());
        aVar2.f4043E = Integer.valueOf(aVar.f4043E == null ? typedArrayA.getResourceId(m.f2730O, l.f2568e) : aVar.f4043E.intValue());
        if (aVar.f4042D != null) {
            aVar2.f4042D = aVar.f4042D;
        } else {
            int i19 = m.f2740P;
            if (typedArrayA.hasValue(i19)) {
                aVar2.f4042D = Integer.valueOf(H(context, typedArrayA, i19));
            } else {
                aVar2.f4042D = Integer.valueOf(new d(context, aVar2.f4043E.intValue()).i().getDefaultColor());
            }
        }
        aVar2.f4058T = Integer.valueOf(aVar.f4058T == null ? typedArrayA.getInt(m.f2670I, 8388661) : aVar.f4058T.intValue());
        aVar2.f4060V = Integer.valueOf(aVar.f4060V == null ? typedArrayA.getDimensionPixelSize(m.f2760R, resources.getDimensionPixelSize(e.f2378Z)) : aVar.f4060V.intValue());
        aVar2.f4061W = Integer.valueOf(aVar.f4061W == null ? typedArrayA.getDimensionPixelSize(m.f2750Q, resources.getDimensionPixelSize(e.f2425x)) : aVar.f4061W.intValue());
        aVar2.f4062X = Integer.valueOf(aVar.f4062X == null ? typedArrayA.getDimensionPixelOffset(m.f2830Y, 0) : aVar.f4062X.intValue());
        aVar2.f4063Y = Integer.valueOf(aVar.f4063Y == null ? typedArrayA.getDimensionPixelOffset(m.f2906f0, 0) : aVar.f4063Y.intValue());
        aVar2.f4064Z = Integer.valueOf(aVar.f4064Z == null ? typedArrayA.getDimensionPixelOffset(m.f2840Z, aVar2.f4062X.intValue()) : aVar.f4064Z.intValue());
        aVar2.f4065a0 = Integer.valueOf(aVar.f4065a0 == null ? typedArrayA.getDimensionPixelOffset(m.f2917g0, aVar2.f4063Y.intValue()) : aVar.f4065a0.intValue());
        aVar2.f4068d0 = Integer.valueOf(aVar.f4068d0 == null ? typedArrayA.getDimensionPixelOffset(m.f2851a0, 0) : aVar.f4068d0.intValue());
        aVar2.f4066b0 = Integer.valueOf(aVar.f4066b0 == null ? 0 : aVar.f4066b0.intValue());
        aVar2.f4067c0 = Integer.valueOf(aVar.f4067c0 == null ? 0 : aVar.f4067c0.intValue());
        aVar2.f4069e0 = Boolean.valueOf(aVar.f4069e0 == null ? typedArrayA.getBoolean(m.f2650G, false) : aVar.f4069e0.booleanValue());
        typedArrayA.recycle();
        if (aVar.f4053O == null) {
            aVar2.f4053O = Locale.getDefault(Locale.Category.FORMAT);
        } else {
            aVar2.f4053O = aVar.f4053O;
        }
        this.f4029a = aVar;
    }

    private static int H(Context context, TypedArray typedArray, int i10) {
        return U7.c.a(context, typedArray, i10).getDefaultColor();
    }

    private TypedArray a(Context context, int i10, int i11, int i12) throws XmlPullParserException, Resources.NotFoundException, IOException {
        AttributeSet attributeSet;
        int styleAttribute;
        if (i10 != 0) {
            AttributeSet attributeSetI = com.google.android.material.drawable.d.i(context, i10, "badge");
            styleAttribute = attributeSetI.getStyleAttribute();
            attributeSet = attributeSetI;
        } else {
            attributeSet = null;
            styleAttribute = 0;
        }
        return r.i(context, attributeSet, m.f2640F, i11, styleAttribute == 0 ? i12 : styleAttribute, new int[0]);
    }

    int A() {
        return this.f4030b.f4043E.intValue();
    }

    int B() {
        return this.f4030b.f4065a0.intValue();
    }

    int C() {
        return this.f4030b.f4063Y.intValue();
    }

    boolean D() {
        return this.f4030b.f4050L != -1;
    }

    boolean E() {
        return this.f4030b.f4049K != null;
    }

    boolean F() {
        return this.f4030b.f4069e0.booleanValue();
    }

    boolean G() {
        return this.f4030b.f4059U.booleanValue();
    }

    void I(int i10) {
        this.f4029a.f4048J = i10;
        this.f4030b.f4048J = i10;
    }

    void J(int i10) {
        this.f4029a.f4050L = i10;
        this.f4030b.f4050L = i10;
    }

    int b() {
        return this.f4030b.f4066b0.intValue();
    }

    int c() {
        return this.f4030b.f4067c0.intValue();
    }

    int d() {
        return this.f4030b.f4048J;
    }

    int e() {
        return this.f4030b.f4041C.intValue();
    }

    int f() {
        return this.f4030b.f4058T.intValue();
    }

    int g() {
        return this.f4030b.f4060V.intValue();
    }

    int h() {
        return this.f4030b.f4045G.intValue();
    }

    int i() {
        return this.f4030b.f4044F.intValue();
    }

    int j() {
        return this.f4030b.f4042D.intValue();
    }

    int k() {
        return this.f4030b.f4061W.intValue();
    }

    int l() {
        return this.f4030b.f4047I.intValue();
    }

    int m() {
        return this.f4030b.f4046H.intValue();
    }

    int n() {
        return this.f4030b.f4057S;
    }

    CharSequence o() {
        return this.f4030b.f4054P;
    }

    CharSequence p() {
        return this.f4030b.f4055Q;
    }

    int q() {
        return this.f4030b.f4056R;
    }

    int r() {
        return this.f4030b.f4064Z.intValue();
    }

    int s() {
        return this.f4030b.f4062X.intValue();
    }

    int t() {
        return this.f4030b.f4068d0.intValue();
    }

    int u() {
        return this.f4030b.f4051M;
    }

    int v() {
        return this.f4030b.f4052N;
    }

    int w() {
        return this.f4030b.f4050L;
    }

    Locale x() {
        return this.f4030b.f4053O;
    }

    a y() {
        return this.f4029a;
    }

    String z() {
        return this.f4030b.f4049K;
    }

    /* compiled from: BadgeState.java */
    public static final class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0073a();

        /* renamed from: B, reason: collision with root package name */
        private int f4040B;

        /* renamed from: C, reason: collision with root package name */
        private Integer f4041C;

        /* renamed from: D, reason: collision with root package name */
        private Integer f4042D;

        /* renamed from: E, reason: collision with root package name */
        private Integer f4043E;

        /* renamed from: F, reason: collision with root package name */
        private Integer f4044F;

        /* renamed from: G, reason: collision with root package name */
        private Integer f4045G;

        /* renamed from: H, reason: collision with root package name */
        private Integer f4046H;

        /* renamed from: I, reason: collision with root package name */
        private Integer f4047I;

        /* renamed from: J, reason: collision with root package name */
        private int f4048J;

        /* renamed from: K, reason: collision with root package name */
        private String f4049K;

        /* renamed from: L, reason: collision with root package name */
        private int f4050L;

        /* renamed from: M, reason: collision with root package name */
        private int f4051M;

        /* renamed from: N, reason: collision with root package name */
        private int f4052N;

        /* renamed from: O, reason: collision with root package name */
        private Locale f4053O;

        /* renamed from: P, reason: collision with root package name */
        private CharSequence f4054P;

        /* renamed from: Q, reason: collision with root package name */
        private CharSequence f4055Q;

        /* renamed from: R, reason: collision with root package name */
        private int f4056R;

        /* renamed from: S, reason: collision with root package name */
        private int f4057S;

        /* renamed from: T, reason: collision with root package name */
        private Integer f4058T;

        /* renamed from: U, reason: collision with root package name */
        private Boolean f4059U;

        /* renamed from: V, reason: collision with root package name */
        private Integer f4060V;

        /* renamed from: W, reason: collision with root package name */
        private Integer f4061W;

        /* renamed from: X, reason: collision with root package name */
        private Integer f4062X;

        /* renamed from: Y, reason: collision with root package name */
        private Integer f4063Y;

        /* renamed from: Z, reason: collision with root package name */
        private Integer f4064Z;

        /* renamed from: a0, reason: collision with root package name */
        private Integer f4065a0;

        /* renamed from: b0, reason: collision with root package name */
        private Integer f4066b0;

        /* renamed from: c0, reason: collision with root package name */
        private Integer f4067c0;

        /* renamed from: d0, reason: collision with root package name */
        private Integer f4068d0;

        /* renamed from: e0, reason: collision with root package name */
        private Boolean f4069e0;

        /* compiled from: BadgeState.java */
        /* renamed from: E7.b$a$a, reason: collision with other inner class name */
        class C0073a implements Parcelable.Creator<a> {
            C0073a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public a createFromParcel(Parcel parcel) {
                return new a(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public a[] newArray(int i10) {
                return new a[i10];
            }
        }

        public a() {
            this.f4048J = 255;
            this.f4050L = -2;
            this.f4051M = -2;
            this.f4052N = -2;
            this.f4059U = Boolean.TRUE;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            parcel.writeInt(this.f4040B);
            parcel.writeSerializable(this.f4041C);
            parcel.writeSerializable(this.f4042D);
            parcel.writeSerializable(this.f4043E);
            parcel.writeSerializable(this.f4044F);
            parcel.writeSerializable(this.f4045G);
            parcel.writeSerializable(this.f4046H);
            parcel.writeSerializable(this.f4047I);
            parcel.writeInt(this.f4048J);
            parcel.writeString(this.f4049K);
            parcel.writeInt(this.f4050L);
            parcel.writeInt(this.f4051M);
            parcel.writeInt(this.f4052N);
            CharSequence charSequence = this.f4054P;
            parcel.writeString(charSequence != null ? charSequence.toString() : null);
            CharSequence charSequence2 = this.f4055Q;
            parcel.writeString(charSequence2 != null ? charSequence2.toString() : null);
            parcel.writeInt(this.f4056R);
            parcel.writeSerializable(this.f4058T);
            parcel.writeSerializable(this.f4060V);
            parcel.writeSerializable(this.f4061W);
            parcel.writeSerializable(this.f4062X);
            parcel.writeSerializable(this.f4063Y);
            parcel.writeSerializable(this.f4064Z);
            parcel.writeSerializable(this.f4065a0);
            parcel.writeSerializable(this.f4068d0);
            parcel.writeSerializable(this.f4066b0);
            parcel.writeSerializable(this.f4067c0);
            parcel.writeSerializable(this.f4059U);
            parcel.writeSerializable(this.f4053O);
            parcel.writeSerializable(this.f4069e0);
        }

        a(Parcel parcel) {
            this.f4048J = 255;
            this.f4050L = -2;
            this.f4051M = -2;
            this.f4052N = -2;
            this.f4059U = Boolean.TRUE;
            this.f4040B = parcel.readInt();
            this.f4041C = (Integer) parcel.readSerializable();
            this.f4042D = (Integer) parcel.readSerializable();
            this.f4043E = (Integer) parcel.readSerializable();
            this.f4044F = (Integer) parcel.readSerializable();
            this.f4045G = (Integer) parcel.readSerializable();
            this.f4046H = (Integer) parcel.readSerializable();
            this.f4047I = (Integer) parcel.readSerializable();
            this.f4048J = parcel.readInt();
            this.f4049K = parcel.readString();
            this.f4050L = parcel.readInt();
            this.f4051M = parcel.readInt();
            this.f4052N = parcel.readInt();
            this.f4054P = parcel.readString();
            this.f4055Q = parcel.readString();
            this.f4056R = parcel.readInt();
            this.f4058T = (Integer) parcel.readSerializable();
            this.f4060V = (Integer) parcel.readSerializable();
            this.f4061W = (Integer) parcel.readSerializable();
            this.f4062X = (Integer) parcel.readSerializable();
            this.f4063Y = (Integer) parcel.readSerializable();
            this.f4064Z = (Integer) parcel.readSerializable();
            this.f4065a0 = (Integer) parcel.readSerializable();
            this.f4068d0 = (Integer) parcel.readSerializable();
            this.f4066b0 = (Integer) parcel.readSerializable();
            this.f4067c0 = (Integer) parcel.readSerializable();
            this.f4059U = (Boolean) parcel.readSerializable();
            this.f4053O = (Locale) parcel.readSerializable();
            this.f4069e0 = (Boolean) parcel.readSerializable();
        }
    }
}
