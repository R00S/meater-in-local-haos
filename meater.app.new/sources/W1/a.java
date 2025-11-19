package W1;

import X1.C1804a;
import X1.L;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.TextUtils;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import l8.C3918k;

/* compiled from: Cue.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final CharSequence f18299a;

    /* renamed from: b, reason: collision with root package name */
    public final Layout.Alignment f18300b;

    /* renamed from: c, reason: collision with root package name */
    public final Layout.Alignment f18301c;

    /* renamed from: d, reason: collision with root package name */
    public final Bitmap f18302d;

    /* renamed from: e, reason: collision with root package name */
    public final float f18303e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18304f;

    /* renamed from: g, reason: collision with root package name */
    public final int f18305g;

    /* renamed from: h, reason: collision with root package name */
    public final float f18306h;

    /* renamed from: i, reason: collision with root package name */
    public final int f18307i;

    /* renamed from: j, reason: collision with root package name */
    public final float f18308j;

    /* renamed from: k, reason: collision with root package name */
    public final float f18309k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f18310l;

    /* renamed from: m, reason: collision with root package name */
    public final int f18311m;

    /* renamed from: n, reason: collision with root package name */
    public final int f18312n;

    /* renamed from: o, reason: collision with root package name */
    public final float f18313o;

    /* renamed from: p, reason: collision with root package name */
    public final int f18314p;

    /* renamed from: q, reason: collision with root package name */
    public final float f18315q;

    /* renamed from: r, reason: collision with root package name */
    @Deprecated
    public static final a f18290r = new b().o("").a();

    /* renamed from: s, reason: collision with root package name */
    private static final String f18291s = L.B0(0);

    /* renamed from: t, reason: collision with root package name */
    private static final String f18292t = L.B0(17);

    /* renamed from: u, reason: collision with root package name */
    private static final String f18293u = L.B0(1);

    /* renamed from: v, reason: collision with root package name */
    private static final String f18294v = L.B0(2);

    /* renamed from: w, reason: collision with root package name */
    private static final String f18295w = L.B0(3);

    /* renamed from: x, reason: collision with root package name */
    private static final String f18296x = L.B0(18);

    /* renamed from: y, reason: collision with root package name */
    private static final String f18297y = L.B0(4);

    /* renamed from: z, reason: collision with root package name */
    private static final String f18298z = L.B0(5);

    /* renamed from: A, reason: collision with root package name */
    private static final String f18279A = L.B0(6);

    /* renamed from: B, reason: collision with root package name */
    private static final String f18280B = L.B0(7);

    /* renamed from: C, reason: collision with root package name */
    private static final String f18281C = L.B0(8);

    /* renamed from: D, reason: collision with root package name */
    private static final String f18282D = L.B0(9);

    /* renamed from: E, reason: collision with root package name */
    private static final String f18283E = L.B0(10);

    /* renamed from: F, reason: collision with root package name */
    private static final String f18284F = L.B0(11);

    /* renamed from: G, reason: collision with root package name */
    private static final String f18285G = L.B0(12);

    /* renamed from: H, reason: collision with root package name */
    private static final String f18286H = L.B0(13);

    /* renamed from: I, reason: collision with root package name */
    private static final String f18287I = L.B0(14);

    /* renamed from: J, reason: collision with root package name */
    private static final String f18288J = L.B0(15);

    /* renamed from: K, reason: collision with root package name */
    private static final String f18289K = L.B0(16);

    /* compiled from: Cue.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private CharSequence f18316a;

        /* renamed from: b, reason: collision with root package name */
        private Bitmap f18317b;

        /* renamed from: c, reason: collision with root package name */
        private Layout.Alignment f18318c;

        /* renamed from: d, reason: collision with root package name */
        private Layout.Alignment f18319d;

        /* renamed from: e, reason: collision with root package name */
        private float f18320e;

        /* renamed from: f, reason: collision with root package name */
        private int f18321f;

        /* renamed from: g, reason: collision with root package name */
        private int f18322g;

        /* renamed from: h, reason: collision with root package name */
        private float f18323h;

        /* renamed from: i, reason: collision with root package name */
        private int f18324i;

        /* renamed from: j, reason: collision with root package name */
        private int f18325j;

        /* renamed from: k, reason: collision with root package name */
        private float f18326k;

        /* renamed from: l, reason: collision with root package name */
        private float f18327l;

        /* renamed from: m, reason: collision with root package name */
        private float f18328m;

        /* renamed from: n, reason: collision with root package name */
        private boolean f18329n;

        /* renamed from: o, reason: collision with root package name */
        private int f18330o;

        /* renamed from: p, reason: collision with root package name */
        private int f18331p;

        /* renamed from: q, reason: collision with root package name */
        private float f18332q;

        public a a() {
            return new a(this.f18316a, this.f18318c, this.f18319d, this.f18317b, this.f18320e, this.f18321f, this.f18322g, this.f18323h, this.f18324i, this.f18325j, this.f18326k, this.f18327l, this.f18328m, this.f18329n, this.f18330o, this.f18331p, this.f18332q);
        }

        public b b() {
            this.f18329n = false;
            return this;
        }

        public int c() {
            return this.f18322g;
        }

        public int d() {
            return this.f18324i;
        }

        public CharSequence e() {
            return this.f18316a;
        }

        public b f(Bitmap bitmap) {
            this.f18317b = bitmap;
            return this;
        }

        public b g(float f10) {
            this.f18328m = f10;
            return this;
        }

        public b h(float f10, int i10) {
            this.f18320e = f10;
            this.f18321f = i10;
            return this;
        }

        public b i(int i10) {
            this.f18322g = i10;
            return this;
        }

        public b j(Layout.Alignment alignment) {
            this.f18319d = alignment;
            return this;
        }

        public b k(float f10) {
            this.f18323h = f10;
            return this;
        }

        public b l(int i10) {
            this.f18324i = i10;
            return this;
        }

        public b m(float f10) {
            this.f18332q = f10;
            return this;
        }

        public b n(float f10) {
            this.f18327l = f10;
            return this;
        }

        public b o(CharSequence charSequence) {
            this.f18316a = charSequence;
            return this;
        }

        public b p(Layout.Alignment alignment) {
            this.f18318c = alignment;
            return this;
        }

        public b q(float f10, int i10) {
            this.f18326k = f10;
            this.f18325j = i10;
            return this;
        }

        public b r(int i10) {
            this.f18331p = i10;
            return this;
        }

        public b s(int i10) {
            this.f18330o = i10;
            this.f18329n = true;
            return this;
        }

        public b() {
            this.f18316a = null;
            this.f18317b = null;
            this.f18318c = null;
            this.f18319d = null;
            this.f18320e = -3.4028235E38f;
            this.f18321f = Integer.MIN_VALUE;
            this.f18322g = Integer.MIN_VALUE;
            this.f18323h = -3.4028235E38f;
            this.f18324i = Integer.MIN_VALUE;
            this.f18325j = Integer.MIN_VALUE;
            this.f18326k = -3.4028235E38f;
            this.f18327l = -3.4028235E38f;
            this.f18328m = -3.4028235E38f;
            this.f18329n = false;
            this.f18330o = -16777216;
            this.f18331p = Integer.MIN_VALUE;
        }

        private b(a aVar) {
            this.f18316a = aVar.f18299a;
            this.f18317b = aVar.f18302d;
            this.f18318c = aVar.f18300b;
            this.f18319d = aVar.f18301c;
            this.f18320e = aVar.f18303e;
            this.f18321f = aVar.f18304f;
            this.f18322g = aVar.f18305g;
            this.f18323h = aVar.f18306h;
            this.f18324i = aVar.f18307i;
            this.f18325j = aVar.f18312n;
            this.f18326k = aVar.f18313o;
            this.f18327l = aVar.f18308j;
            this.f18328m = aVar.f18309k;
            this.f18329n = aVar.f18310l;
            this.f18330o = aVar.f18311m;
            this.f18331p = aVar.f18314p;
            this.f18332q = aVar.f18315q;
        }
    }

    public static a b(Bundle bundle) {
        b bVar = new b();
        CharSequence charSequence = bundle.getCharSequence(f18291s);
        if (charSequence != null) {
            bVar.o(charSequence);
            ArrayList parcelableArrayList = bundle.getParcelableArrayList(f18292t);
            if (parcelableArrayList != null) {
                SpannableString spannableStringValueOf = SpannableString.valueOf(charSequence);
                Iterator it = parcelableArrayList.iterator();
                while (it.hasNext()) {
                    c.c((Bundle) it.next(), spannableStringValueOf);
                }
                bVar.o(spannableStringValueOf);
            }
        }
        Layout.Alignment alignment = (Layout.Alignment) bundle.getSerializable(f18293u);
        if (alignment != null) {
            bVar.p(alignment);
        }
        Layout.Alignment alignment2 = (Layout.Alignment) bundle.getSerializable(f18294v);
        if (alignment2 != null) {
            bVar.j(alignment2);
        }
        Bitmap bitmap = (Bitmap) bundle.getParcelable(f18295w);
        if (bitmap != null) {
            bVar.f(bitmap);
        } else {
            byte[] byteArray = bundle.getByteArray(f18296x);
            if (byteArray != null) {
                bVar.f(BitmapFactory.decodeByteArray(byteArray, 0, byteArray.length));
            }
        }
        String str = f18297y;
        if (bundle.containsKey(str)) {
            String str2 = f18298z;
            if (bundle.containsKey(str2)) {
                bVar.h(bundle.getFloat(str), bundle.getInt(str2));
            }
        }
        String str3 = f18279A;
        if (bundle.containsKey(str3)) {
            bVar.i(bundle.getInt(str3));
        }
        String str4 = f18280B;
        if (bundle.containsKey(str4)) {
            bVar.k(bundle.getFloat(str4));
        }
        String str5 = f18281C;
        if (bundle.containsKey(str5)) {
            bVar.l(bundle.getInt(str5));
        }
        String str6 = f18283E;
        if (bundle.containsKey(str6)) {
            String str7 = f18282D;
            if (bundle.containsKey(str7)) {
                bVar.q(bundle.getFloat(str6), bundle.getInt(str7));
            }
        }
        String str8 = f18284F;
        if (bundle.containsKey(str8)) {
            bVar.n(bundle.getFloat(str8));
        }
        String str9 = f18285G;
        if (bundle.containsKey(str9)) {
            bVar.g(bundle.getFloat(str9));
        }
        String str10 = f18286H;
        if (bundle.containsKey(str10)) {
            bVar.s(bundle.getInt(str10));
        }
        if (!bundle.getBoolean(f18287I, false)) {
            bVar.b();
        }
        String str11 = f18288J;
        if (bundle.containsKey(str11)) {
            bVar.r(bundle.getInt(str11));
        }
        String str12 = f18289K;
        if (bundle.containsKey(str12)) {
            bVar.m(bundle.getFloat(str12));
        }
        return bVar.a();
    }

    private Bundle c() {
        Bundle bundle = new Bundle();
        CharSequence charSequence = this.f18299a;
        if (charSequence != null) {
            bundle.putCharSequence(f18291s, charSequence);
            CharSequence charSequence2 = this.f18299a;
            if (charSequence2 instanceof Spanned) {
                ArrayList<Bundle> arrayListA = c.a((Spanned) charSequence2);
                if (!arrayListA.isEmpty()) {
                    bundle.putParcelableArrayList(f18292t, arrayListA);
                }
            }
        }
        bundle.putSerializable(f18293u, this.f18300b);
        bundle.putSerializable(f18294v, this.f18301c);
        bundle.putFloat(f18297y, this.f18303e);
        bundle.putInt(f18298z, this.f18304f);
        bundle.putInt(f18279A, this.f18305g);
        bundle.putFloat(f18280B, this.f18306h);
        bundle.putInt(f18281C, this.f18307i);
        bundle.putInt(f18282D, this.f18312n);
        bundle.putFloat(f18283E, this.f18313o);
        bundle.putFloat(f18284F, this.f18308j);
        bundle.putFloat(f18285G, this.f18309k);
        bundle.putBoolean(f18287I, this.f18310l);
        bundle.putInt(f18286H, this.f18311m);
        bundle.putInt(f18288J, this.f18314p);
        bundle.putFloat(f18289K, this.f18315q);
        return bundle;
    }

    public b a() {
        return new b();
    }

    public Bundle d() {
        Bundle bundleC = c();
        if (this.f18302d != null) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            C1804a.g(this.f18302d.compress(Bitmap.CompressFormat.PNG, 0, byteArrayOutputStream));
            bundleC.putByteArray(f18296x, byteArrayOutputStream.toByteArray());
        }
        return bundleC;
    }

    public boolean equals(Object obj) {
        Bitmap bitmap;
        Bitmap bitmap2;
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        return TextUtils.equals(this.f18299a, aVar.f18299a) && this.f18300b == aVar.f18300b && this.f18301c == aVar.f18301c && ((bitmap = this.f18302d) != null ? !((bitmap2 = aVar.f18302d) == null || !bitmap.sameAs(bitmap2)) : aVar.f18302d == null) && this.f18303e == aVar.f18303e && this.f18304f == aVar.f18304f && this.f18305g == aVar.f18305g && this.f18306h == aVar.f18306h && this.f18307i == aVar.f18307i && this.f18308j == aVar.f18308j && this.f18309k == aVar.f18309k && this.f18310l == aVar.f18310l && this.f18311m == aVar.f18311m && this.f18312n == aVar.f18312n && this.f18313o == aVar.f18313o && this.f18314p == aVar.f18314p && this.f18315q == aVar.f18315q;
    }

    public int hashCode() {
        return C3918k.b(this.f18299a, this.f18300b, this.f18301c, this.f18302d, Float.valueOf(this.f18303e), Integer.valueOf(this.f18304f), Integer.valueOf(this.f18305g), Float.valueOf(this.f18306h), Integer.valueOf(this.f18307i), Float.valueOf(this.f18308j), Float.valueOf(this.f18309k), Boolean.valueOf(this.f18310l), Integer.valueOf(this.f18311m), Integer.valueOf(this.f18312n), Float.valueOf(this.f18313o), Integer.valueOf(this.f18314p), Float.valueOf(this.f18315q));
    }

    private a(CharSequence charSequence, Layout.Alignment alignment, Layout.Alignment alignment2, Bitmap bitmap, float f10, int i10, int i11, float f11, int i12, int i13, float f12, float f13, float f14, boolean z10, int i14, int i15, float f15) {
        if (charSequence == null) {
            C1804a.e(bitmap);
        } else {
            C1804a.a(bitmap == null);
        }
        if (charSequence instanceof Spanned) {
            this.f18299a = SpannedString.valueOf(charSequence);
        } else if (charSequence != null) {
            this.f18299a = charSequence.toString();
        } else {
            this.f18299a = null;
        }
        this.f18300b = alignment;
        this.f18301c = alignment2;
        this.f18302d = bitmap;
        this.f18303e = f10;
        this.f18304f = i10;
        this.f18305g = i11;
        this.f18306h = f11;
        this.f18307i = i12;
        this.f18308j = f13;
        this.f18309k = f14;
        this.f18310l = z10;
        this.f18311m = i14;
        this.f18312n = i13;
        this.f18313o = f12;
        this.f18314p = i15;
        this.f18315q = f15;
    }
}
