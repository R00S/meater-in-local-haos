package com.bumptech.glide.p141p;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.recyclerview.widget.RecyclerView;
import cm.aptoide.p092pt.file.CacheHelper;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.load.C5424g;
import com.bumptech.glide.load.C5425h;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5366b;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.AbstractC5393j;
import com.bumptech.glide.load.p131o.p132c.AbstractC5490k;
import com.bumptech.glide.load.p131o.p132c.C5486g;
import com.bumptech.glide.load.p131o.p132c.C5487h;
import com.bumptech.glide.load.p131o.p132c.C5491l;
import com.bumptech.glide.load.p131o.p132c.C5493n;
import com.bumptech.glide.load.p131o.p132c.C5495p;
import com.bumptech.glide.load.p131o.p136g.C5517c;
import com.bumptech.glide.load.p131o.p136g.C5520f;
import com.bumptech.glide.load.p131o.p136g.C5523i;
import com.bumptech.glide.p141p.AbstractC5558a;
import com.bumptech.glide.p144q.C5585b;
import com.bumptech.glide.p145r.C5588b;
import com.bumptech.glide.p145r.C5596j;
import com.bumptech.glide.p145r.C5597k;
import com.google.android.gms.ads.AdRequest;
import java.util.Map;
import okhttp3.internal.http2.Http2;

/* compiled from: BaseRequestOptions.java */
/* renamed from: com.bumptech.glide.p.a */
/* loaded from: classes.dex */
public abstract class AbstractC5558a<T extends AbstractC5558a<T>> implements Cloneable {

    /* renamed from: A */
    private boolean f13909A;

    /* renamed from: B */
    private boolean f13910B;

    /* renamed from: C */
    private boolean f13911C;

    /* renamed from: E */
    private boolean f13913E;

    /* renamed from: f */
    private int f13914f;

    /* renamed from: j */
    private Drawable f13918j;

    /* renamed from: k */
    private int f13919k;

    /* renamed from: l */
    private Drawable f13920l;

    /* renamed from: m */
    private int f13921m;

    /* renamed from: r */
    private boolean f13926r;

    /* renamed from: t */
    private Drawable f13928t;

    /* renamed from: u */
    private int f13929u;

    /* renamed from: y */
    private boolean f13933y;

    /* renamed from: z */
    private Resources.Theme f13934z;

    /* renamed from: g */
    private float f13915g = 1.0f;

    /* renamed from: h */
    private AbstractC5393j f13916h = AbstractC5393j.f13398e;

    /* renamed from: i */
    private EnumC5353g f13917i = EnumC5353g.NORMAL;

    /* renamed from: n */
    private boolean f13922n = true;

    /* renamed from: o */
    private int f13923o = -1;

    /* renamed from: p */
    private int f13924p = -1;

    /* renamed from: q */
    private InterfaceC5423f f13925q = C5585b.m11013a();

    /* renamed from: s */
    private boolean f13927s = true;

    /* renamed from: v */
    private C5426i f13930v = new C5426i();

    /* renamed from: w */
    private Map<Class<?>, InterfaceC5429l<?>> f13931w = new C5588b();

    /* renamed from: x */
    private Class<?> f13932x = Object.class;

    /* renamed from: D */
    private boolean f13912D = true;

    /* renamed from: K */
    private boolean m10863K(int i2) {
        return m10864L(this.f13914f, i2);
    }

    /* renamed from: L */
    private static boolean m10864L(int i2, int i3) {
        return (i2 & i3) != 0;
    }

    /* renamed from: U */
    private T m10865U(AbstractC5490k abstractC5490k, InterfaceC5429l<Bitmap> interfaceC5429l) {
        return (T) m10866c0(abstractC5490k, interfaceC5429l, false);
    }

    /* renamed from: c0 */
    private T m10866c0(AbstractC5490k abstractC5490k, InterfaceC5429l<Bitmap> interfaceC5429l, boolean z) {
        T t = z ? (T) m10908n0(abstractC5490k, interfaceC5429l) : (T) m10887V(abstractC5490k, interfaceC5429l);
        t.f13912D = true;
        return t;
    }

    /* renamed from: d0 */
    private T m10867d0() {
        return this;
    }

    /* renamed from: f0 */
    private T m10868f0() {
        if (this.f13933y) {
            throw new IllegalStateException("You cannot modify locked T, consider clone()");
        }
        return (T) m10867d0();
    }

    /* renamed from: A */
    public final Class<?> m10869A() {
        return this.f13932x;
    }

    /* renamed from: B */
    public final InterfaceC5423f m10870B() {
        return this.f13925q;
    }

    /* renamed from: C */
    public final float m10871C() {
        return this.f13915g;
    }

    /* renamed from: D */
    public final Resources.Theme m10872D() {
        return this.f13934z;
    }

    /* renamed from: E */
    public final Map<Class<?>, InterfaceC5429l<?>> m10873E() {
        return this.f13931w;
    }

    /* renamed from: F */
    public final boolean m10874F() {
        return this.f13913E;
    }

    /* renamed from: G */
    public final boolean m10875G() {
        return this.f13910B;
    }

    /* renamed from: H */
    public final boolean m10876H() {
        return this.f13922n;
    }

    /* renamed from: I */
    public final boolean m10877I() {
        return m10863K(8);
    }

    /* renamed from: J */
    boolean m10878J() {
        return this.f13912D;
    }

    /* renamed from: M */
    public final boolean m10879M() {
        return this.f13927s;
    }

    /* renamed from: N */
    public final boolean m10880N() {
        return this.f13926r;
    }

    /* renamed from: O */
    public final boolean m10881O() {
        return m10863K(RecyclerView.AbstractC0599l.FLAG_MOVED);
    }

    /* renamed from: P */
    public final boolean m10882P() {
        return C5597k.m11063t(this.f13924p, this.f13923o);
    }

    /* renamed from: Q */
    public T m10883Q() {
        this.f13933y = true;
        return (T) m10867d0();
    }

    /* renamed from: R */
    public T m10884R() {
        return (T) m10887V(AbstractC5490k.f13728b, new C5486g());
    }

    /* renamed from: S */
    public T m10885S() {
        return (T) m10865U(AbstractC5490k.f13731e, new C5487h());
    }

    /* renamed from: T */
    public T m10886T() {
        return (T) m10865U(AbstractC5490k.f13727a, new C5495p());
    }

    /* renamed from: V */
    final T m10887V(AbstractC5490k abstractC5490k, InterfaceC5429l<Bitmap> interfaceC5429l) {
        if (this.f13909A) {
            return (T) clone().m10887V(abstractC5490k, interfaceC5429l);
        }
        m10899j(abstractC5490k);
        return (T) m10906m0(interfaceC5429l, false);
    }

    /* renamed from: X */
    public T m10888X(int i2, int i3) {
        if (this.f13909A) {
            return (T) clone().m10888X(i2, i3);
        }
        this.f13924p = i2;
        this.f13923o = i3;
        this.f13914f |= AdRequest.MAX_CONTENT_URL_LENGTH;
        return (T) m10868f0();
    }

    /* renamed from: Z */
    public T m10889Z(int i2) {
        if (this.f13909A) {
            return (T) clone().m10889Z(i2);
        }
        this.f13921m = i2;
        int i3 = this.f13914f | 128;
        this.f13914f = i3;
        this.f13920l = null;
        this.f13914f = i3 & (-65);
        return (T) m10868f0();
    }

    /* renamed from: a0 */
    public T m10890a0(Drawable drawable) {
        if (this.f13909A) {
            return (T) clone().m10890a0(drawable);
        }
        this.f13920l = drawable;
        int i2 = this.f13914f | 64;
        this.f13914f = i2;
        this.f13921m = 0;
        this.f13914f = i2 & (-129);
        return (T) m10868f0();
    }

    /* renamed from: b */
    public T mo10026b(AbstractC5558a<?> abstractC5558a) {
        if (this.f13909A) {
            return (T) clone().mo10026b(abstractC5558a);
        }
        if (m10864L(abstractC5558a.f13914f, 2)) {
            this.f13915g = abstractC5558a.f13915g;
        }
        if (m10864L(abstractC5558a.f13914f, 262144)) {
            this.f13910B = abstractC5558a.f13910B;
        }
        if (m10864L(abstractC5558a.f13914f, CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES)) {
            this.f13913E = abstractC5558a.f13913E;
        }
        if (m10864L(abstractC5558a.f13914f, 4)) {
            this.f13916h = abstractC5558a.f13916h;
        }
        if (m10864L(abstractC5558a.f13914f, 8)) {
            this.f13917i = abstractC5558a.f13917i;
        }
        if (m10864L(abstractC5558a.f13914f, 16)) {
            this.f13918j = abstractC5558a.f13918j;
            this.f13919k = 0;
            this.f13914f &= -33;
        }
        if (m10864L(abstractC5558a.f13914f, 32)) {
            this.f13919k = abstractC5558a.f13919k;
            this.f13918j = null;
            this.f13914f &= -17;
        }
        if (m10864L(abstractC5558a.f13914f, 64)) {
            this.f13920l = abstractC5558a.f13920l;
            this.f13921m = 0;
            this.f13914f &= -129;
        }
        if (m10864L(abstractC5558a.f13914f, 128)) {
            this.f13921m = abstractC5558a.f13921m;
            this.f13920l = null;
            this.f13914f &= -65;
        }
        if (m10864L(abstractC5558a.f13914f, 256)) {
            this.f13922n = abstractC5558a.f13922n;
        }
        if (m10864L(abstractC5558a.f13914f, AdRequest.MAX_CONTENT_URL_LENGTH)) {
            this.f13924p = abstractC5558a.f13924p;
            this.f13923o = abstractC5558a.f13923o;
        }
        if (m10864L(abstractC5558a.f13914f, 1024)) {
            this.f13925q = abstractC5558a.f13925q;
        }
        if (m10864L(abstractC5558a.f13914f, RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT)) {
            this.f13932x = abstractC5558a.f13932x;
        }
        if (m10864L(abstractC5558a.f13914f, 8192)) {
            this.f13928t = abstractC5558a.f13928t;
            this.f13929u = 0;
            this.f13914f &= -16385;
        }
        if (m10864L(abstractC5558a.f13914f, Http2.INITIAL_MAX_FRAME_SIZE)) {
            this.f13929u = abstractC5558a.f13929u;
            this.f13928t = null;
            this.f13914f &= -8193;
        }
        if (m10864L(abstractC5558a.f13914f, 32768)) {
            this.f13934z = abstractC5558a.f13934z;
        }
        if (m10864L(abstractC5558a.f13914f, 65536)) {
            this.f13927s = abstractC5558a.f13927s;
        }
        if (m10864L(abstractC5558a.f13914f, 131072)) {
            this.f13926r = abstractC5558a.f13926r;
        }
        if (m10864L(abstractC5558a.f13914f, RecyclerView.AbstractC0599l.FLAG_MOVED)) {
            this.f13931w.putAll(abstractC5558a.f13931w);
            this.f13912D = abstractC5558a.f13912D;
        }
        if (m10864L(abstractC5558a.f13914f, 524288)) {
            this.f13911C = abstractC5558a.f13911C;
        }
        if (!this.f13927s) {
            this.f13931w.clear();
            int i2 = this.f13914f & (-2049);
            this.f13914f = i2;
            this.f13926r = false;
            this.f13914f = i2 & (-131073);
            this.f13912D = true;
        }
        this.f13914f |= abstractC5558a.f13914f;
        this.f13930v.m10450b(abstractC5558a.f13930v);
        return (T) m10868f0();
    }

    /* renamed from: b0 */
    public T m10891b0(EnumC5353g enumC5353g) {
        if (this.f13909A) {
            return (T) clone().m10891b0(enumC5353g);
        }
        this.f13917i = (EnumC5353g) C5596j.m11042d(enumC5353g);
        this.f13914f |= 8;
        return (T) m10868f0();
    }

    /* renamed from: d */
    public T m10892d() {
        if (this.f13933y && !this.f13909A) {
            throw new IllegalStateException("You cannot auto lock an already locked options object, try clone() first");
        }
        this.f13909A = true;
        return (T) m10883Q();
    }

    /* renamed from: e */
    public T m10893e() {
        return (T) m10908n0(AbstractC5490k.f13728b, new C5486g());
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof AbstractC5558a)) {
            return false;
        }
        AbstractC5558a abstractC5558a = (AbstractC5558a) obj;
        return Float.compare(abstractC5558a.f13915g, this.f13915g) == 0 && this.f13919k == abstractC5558a.f13919k && C5597k.m11047d(this.f13918j, abstractC5558a.f13918j) && this.f13921m == abstractC5558a.f13921m && C5597k.m11047d(this.f13920l, abstractC5558a.f13920l) && this.f13929u == abstractC5558a.f13929u && C5597k.m11047d(this.f13928t, abstractC5558a.f13928t) && this.f13922n == abstractC5558a.f13922n && this.f13923o == abstractC5558a.f13923o && this.f13924p == abstractC5558a.f13924p && this.f13926r == abstractC5558a.f13926r && this.f13927s == abstractC5558a.f13927s && this.f13910B == abstractC5558a.f13910B && this.f13911C == abstractC5558a.f13911C && this.f13916h.equals(abstractC5558a.f13916h) && this.f13917i == abstractC5558a.f13917i && this.f13930v.equals(abstractC5558a.f13930v) && this.f13931w.equals(abstractC5558a.f13931w) && this.f13932x.equals(abstractC5558a.f13932x) && C5597k.m11047d(this.f13925q, abstractC5558a.f13925q) && C5597k.m11047d(this.f13934z, abstractC5558a.f13934z);
    }

    @Override // 
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public T clone() {
        try {
            T t = (T) super.clone();
            C5426i c5426i = new C5426i();
            t.f13930v = c5426i;
            c5426i.m10450b(this.f13930v);
            C5588b c5588b = new C5588b();
            t.f13931w = c5588b;
            c5588b.putAll(this.f13931w);
            t.f13933y = false;
            t.f13909A = false;
            return t;
        } catch (CloneNotSupportedException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: g */
    public T m10894g(Class<?> cls) {
        if (this.f13909A) {
            return (T) clone().m10894g(cls);
        }
        this.f13932x = (Class) C5596j.m11042d(cls);
        this.f13914f |= RecyclerView.AbstractC0599l.FLAG_APPEARED_IN_PRE_LAYOUT;
        return (T) m10868f0();
    }

    /* renamed from: g0 */
    public <Y> T m10895g0(C5425h<Y> c5425h, Y y) {
        if (this.f13909A) {
            return (T) clone().m10895g0(c5425h, y);
        }
        C5596j.m11042d(c5425h);
        C5596j.m11042d(y);
        this.f13930v.m10451c(c5425h, y);
        return (T) m10868f0();
    }

    /* renamed from: h */
    public T m10896h() {
        return (T) m10895g0(C5491l.f13741d, Boolean.FALSE);
    }

    /* renamed from: h0 */
    public T m10897h0(InterfaceC5423f interfaceC5423f) {
        if (this.f13909A) {
            return (T) clone().m10897h0(interfaceC5423f);
        }
        this.f13925q = (InterfaceC5423f) C5596j.m11042d(interfaceC5423f);
        this.f13914f |= 1024;
        return (T) m10868f0();
    }

    public int hashCode() {
        return C5597k.m11058o(this.f13934z, C5597k.m11058o(this.f13925q, C5597k.m11058o(this.f13932x, C5597k.m11058o(this.f13931w, C5597k.m11058o(this.f13930v, C5597k.m11058o(this.f13917i, C5597k.m11058o(this.f13916h, C5597k.m11059p(this.f13911C, C5597k.m11059p(this.f13910B, C5597k.m11059p(this.f13927s, C5597k.m11059p(this.f13926r, C5597k.m11057n(this.f13924p, C5597k.m11057n(this.f13923o, C5597k.m11059p(this.f13922n, C5597k.m11058o(this.f13928t, C5597k.m11057n(this.f13929u, C5597k.m11058o(this.f13920l, C5597k.m11057n(this.f13921m, C5597k.m11058o(this.f13918j, C5597k.m11057n(this.f13919k, C5597k.m11054k(this.f13915g)))))))))))))))))))));
    }

    /* renamed from: i */
    public T m10898i(AbstractC5393j abstractC5393j) {
        if (this.f13909A) {
            return (T) clone().m10898i(abstractC5393j);
        }
        this.f13916h = (AbstractC5393j) C5596j.m11042d(abstractC5393j);
        this.f13914f |= 4;
        return (T) m10868f0();
    }

    /* renamed from: j */
    public T m10899j(AbstractC5490k abstractC5490k) {
        return (T) m10895g0(AbstractC5490k.f13734h, C5596j.m11042d(abstractC5490k));
    }

    /* renamed from: j0 */
    public T m10900j0(float f2) {
        if (this.f13909A) {
            return (T) clone().m10900j0(f2);
        }
        if (f2 < 0.0f || f2 > 1.0f) {
            throw new IllegalArgumentException("sizeMultiplier must be between 0 and 1");
        }
        this.f13915g = f2;
        this.f13914f |= 2;
        return (T) m10868f0();
    }

    /* renamed from: k */
    public T m10901k(EnumC5366b enumC5366b) {
        C5596j.m11042d(enumC5366b);
        return (T) m10895g0(C5491l.f13738a, enumC5366b).m10895g0(C5523i.f13839a, enumC5366b);
    }

    /* renamed from: k0 */
    public T m10902k0(boolean z) {
        if (this.f13909A) {
            return (T) clone().m10902k0(true);
        }
        this.f13922n = !z;
        this.f13914f |= 256;
        return (T) m10868f0();
    }

    /* renamed from: l */
    public final AbstractC5393j m10903l() {
        return this.f13916h;
    }

    /* renamed from: l0 */
    public T m10904l0(InterfaceC5429l<Bitmap> interfaceC5429l) {
        return (T) m10906m0(interfaceC5429l, true);
    }

    /* renamed from: m */
    public final int m10905m() {
        return this.f13919k;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: m0 */
    T m10906m0(InterfaceC5429l<Bitmap> interfaceC5429l, boolean z) {
        if (this.f13909A) {
            return (T) clone().m10906m0(interfaceC5429l, z);
        }
        C5493n c5493n = new C5493n(interfaceC5429l, z);
        m10910o0(Bitmap.class, interfaceC5429l, z);
        m10910o0(Drawable.class, c5493n, z);
        m10910o0(BitmapDrawable.class, c5493n.m10657a(), z);
        m10910o0(C5517c.class, new C5520f(interfaceC5429l), z);
        return (T) m10868f0();
    }

    /* renamed from: n */
    public final Drawable m10907n() {
        return this.f13918j;
    }

    /* renamed from: n0 */
    final T m10908n0(AbstractC5490k abstractC5490k, InterfaceC5429l<Bitmap> interfaceC5429l) {
        if (this.f13909A) {
            return (T) clone().m10908n0(abstractC5490k, interfaceC5429l);
        }
        m10899j(abstractC5490k);
        return (T) m10904l0(interfaceC5429l);
    }

    /* renamed from: o */
    public final Drawable m10909o() {
        return this.f13928t;
    }

    /* renamed from: o0 */
    <Y> T m10910o0(Class<Y> cls, InterfaceC5429l<Y> interfaceC5429l, boolean z) {
        if (this.f13909A) {
            return (T) clone().m10910o0(cls, interfaceC5429l, z);
        }
        C5596j.m11042d(cls);
        C5596j.m11042d(interfaceC5429l);
        this.f13931w.put(cls, interfaceC5429l);
        int i2 = this.f13914f | RecyclerView.AbstractC0599l.FLAG_MOVED;
        this.f13914f = i2;
        this.f13927s = true;
        int i3 = i2 | 65536;
        this.f13914f = i3;
        this.f13912D = false;
        if (z) {
            this.f13914f = i3 | 131072;
            this.f13926r = true;
        }
        return (T) m10868f0();
    }

    /* renamed from: p */
    public final int m10911p() {
        return this.f13929u;
    }

    /* renamed from: q */
    public final boolean m10912q() {
        return this.f13911C;
    }

    @Deprecated
    /* renamed from: q0 */
    public T m10913q0(InterfaceC5429l<Bitmap>... interfaceC5429lArr) {
        return (T) m10906m0(new C5424g(interfaceC5429lArr), true);
    }

    /* renamed from: r */
    public final C5426i m10914r() {
        return this.f13930v;
    }

    /* renamed from: r0 */
    public T m10915r0(boolean z) {
        if (this.f13909A) {
            return (T) clone().m10915r0(z);
        }
        this.f13913E = z;
        this.f13914f |= CacheHelper.VALUE_TO_CONVERT_MB_TO_BYTES;
        return (T) m10868f0();
    }

    /* renamed from: s */
    public final int m10916s() {
        return this.f13923o;
    }

    /* renamed from: t */
    public final int m10917t() {
        return this.f13924p;
    }

    /* renamed from: u */
    public final Drawable m10918u() {
        return this.f13920l;
    }

    /* renamed from: v */
    public final int m10919v() {
        return this.f13921m;
    }

    /* renamed from: w */
    public final EnumC5353g m10920w() {
        return this.f13917i;
    }
}
