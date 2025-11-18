package p241e.p254e.p256b.p271c.p272a0;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import p241e.p254e.p256b.p271c.C8918l;

/* compiled from: ShapeAppearanceModel.java */
/* renamed from: e.e.b.c.a0.k */
/* loaded from: classes2.dex */
public class C8904k {

    /* renamed from: a */
    public static final InterfaceC8896c f33733a = new C8902i(0.5f);

    /* renamed from: b */
    C8897d f33734b;

    /* renamed from: c */
    C8897d f33735c;

    /* renamed from: d */
    C8897d f33736d;

    /* renamed from: e */
    C8897d f33737e;

    /* renamed from: f */
    InterfaceC8896c f33738f;

    /* renamed from: g */
    InterfaceC8896c f33739g;

    /* renamed from: h */
    InterfaceC8896c f33740h;

    /* renamed from: i */
    InterfaceC8896c f33741i;

    /* renamed from: j */
    C8899f f33742j;

    /* renamed from: k */
    C8899f f33743k;

    /* renamed from: l */
    C8899f f33744l;

    /* renamed from: m */
    C8899f f33745m;

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: e.e.b.c.a0.k$c */
    public interface c {
        /* renamed from: a */
        InterfaceC8896c mo28306a(InterfaceC8896c interfaceC8896c);
    }

    /* renamed from: a */
    public static b m28313a() {
        return new b();
    }

    /* renamed from: b */
    public static b m28314b(Context context, int i2, int i3) {
        return m28315c(context, i2, i3, 0);
    }

    /* renamed from: c */
    private static b m28315c(Context context, int i2, int i3, int i4) {
        return m28316d(context, i2, i3, new C8894a(i4));
    }

    /* renamed from: d */
    private static b m28316d(Context context, int i2, int i3, InterfaceC8896c interfaceC8896c) throws Resources.NotFoundException {
        if (i3 != 0) {
            ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i2);
            i2 = i3;
            context = contextThemeWrapper;
        }
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(i2, C8918l.f34137T3);
        try {
            int i4 = typedArrayObtainStyledAttributes.getInt(C8918l.f34144U3, 0);
            int i5 = typedArrayObtainStyledAttributes.getInt(C8918l.f34165X3, i4);
            int i6 = typedArrayObtainStyledAttributes.getInt(C8918l.f34172Y3, i4);
            int i7 = typedArrayObtainStyledAttributes.getInt(C8918l.f34158W3, i4);
            int i8 = typedArrayObtainStyledAttributes.getInt(C8918l.f34151V3, i4);
            InterfaceC8896c interfaceC8896cM28320m = m28320m(typedArrayObtainStyledAttributes, C8918l.f34179Z3, interfaceC8896c);
            InterfaceC8896c interfaceC8896cM28320m2 = m28320m(typedArrayObtainStyledAttributes, C8918l.f34203c4, interfaceC8896cM28320m);
            InterfaceC8896c interfaceC8896cM28320m3 = m28320m(typedArrayObtainStyledAttributes, C8918l.f34211d4, interfaceC8896cM28320m);
            InterfaceC8896c interfaceC8896cM28320m4 = m28320m(typedArrayObtainStyledAttributes, C8918l.f34195b4, interfaceC8896cM28320m);
            return new b().m28365x(i5, interfaceC8896cM28320m2).m28351B(i6, interfaceC8896cM28320m3).m28361t(i7, interfaceC8896cM28320m4).m28357p(i8, m28320m(typedArrayObtainStyledAttributes, C8918l.f34187a4, interfaceC8896cM28320m));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    /* renamed from: e */
    public static b m28317e(Context context, AttributeSet attributeSet, int i2, int i3) {
        return m28318f(context, attributeSet, i2, i3, 0);
    }

    /* renamed from: f */
    public static b m28318f(Context context, AttributeSet attributeSet, int i2, int i3, int i4) {
        return m28319g(context, attributeSet, i2, i3, new C8894a(i4));
    }

    /* renamed from: g */
    public static b m28319g(Context context, AttributeSet attributeSet, int i2, int i3, InterfaceC8896c interfaceC8896c) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C8918l.f34346w3, i2, i3);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C8918l.f34353x3, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C8918l.f34360y3, 0);
        typedArrayObtainStyledAttributes.recycle();
        return m28316d(context, resourceId, resourceId2, interfaceC8896c);
    }

    /* renamed from: m */
    private static InterfaceC8896c m28320m(TypedArray typedArray, int i2, InterfaceC8896c interfaceC8896c) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i2);
        if (typedValuePeekValue == null) {
            return interfaceC8896c;
        }
        int i3 = typedValuePeekValue.type;
        return i3 == 5 ? new C8894a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i3 == 6 ? new C8902i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : interfaceC8896c;
    }

    /* renamed from: h */
    public C8899f m28321h() {
        return this.f33744l;
    }

    /* renamed from: i */
    public C8897d m28322i() {
        return this.f33737e;
    }

    /* renamed from: j */
    public InterfaceC8896c m28323j() {
        return this.f33741i;
    }

    /* renamed from: k */
    public C8897d m28324k() {
        return this.f33736d;
    }

    /* renamed from: l */
    public InterfaceC8896c m28325l() {
        return this.f33740h;
    }

    /* renamed from: n */
    public C8899f m28326n() {
        return this.f33745m;
    }

    /* renamed from: o */
    public C8899f m28327o() {
        return this.f33743k;
    }

    /* renamed from: p */
    public C8899f m28328p() {
        return this.f33742j;
    }

    /* renamed from: q */
    public C8897d m28329q() {
        return this.f33734b;
    }

    /* renamed from: r */
    public InterfaceC8896c m28330r() {
        return this.f33738f;
    }

    /* renamed from: s */
    public C8897d m28331s() {
        return this.f33735c;
    }

    /* renamed from: t */
    public InterfaceC8896c m28332t() {
        return this.f33739g;
    }

    /* renamed from: u */
    public boolean m28333u(RectF rectF) {
        boolean z = this.f33745m.getClass().equals(C8899f.class) && this.f33743k.getClass().equals(C8899f.class) && this.f33742j.getClass().equals(C8899f.class) && this.f33744l.getClass().equals(C8899f.class);
        float fMo28238a = this.f33738f.mo28238a(rectF);
        return z && ((this.f33739g.mo28238a(rectF) > fMo28238a ? 1 : (this.f33739g.mo28238a(rectF) == fMo28238a ? 0 : -1)) == 0 && (this.f33741i.mo28238a(rectF) > fMo28238a ? 1 : (this.f33741i.mo28238a(rectF) == fMo28238a ? 0 : -1)) == 0 && (this.f33740h.mo28238a(rectF) > fMo28238a ? 1 : (this.f33740h.mo28238a(rectF) == fMo28238a ? 0 : -1)) == 0) && ((this.f33735c instanceof C8903j) && (this.f33734b instanceof C8903j) && (this.f33736d instanceof C8903j) && (this.f33737e instanceof C8903j));
    }

    /* renamed from: v */
    public b m28334v() {
        return new b(this);
    }

    /* renamed from: w */
    public C8904k m28335w(float f2) {
        return m28334v().m28356o(f2).m28355m();
    }

    /* renamed from: x */
    public C8904k m28336x(c cVar) {
        return m28334v().m28350A(cVar.mo28306a(m28330r())).m28354E(cVar.mo28306a(m28332t())).m28360s(cVar.mo28306a(m28323j())).m28364w(cVar.mo28306a(m28325l())).m28355m();
    }

    private C8904k(b bVar) {
        this.f33734b = bVar.f33746a;
        this.f33735c = bVar.f33747b;
        this.f33736d = bVar.f33748c;
        this.f33737e = bVar.f33749d;
        this.f33738f = bVar.f33750e;
        this.f33739g = bVar.f33751f;
        this.f33740h = bVar.f33752g;
        this.f33741i = bVar.f33753h;
        this.f33742j = bVar.f33754i;
        this.f33743k = bVar.f33755j;
        this.f33744l = bVar.f33756k;
        this.f33745m = bVar.f33757l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    /* renamed from: e.e.b.c.a0.k$b */
    public static final class b {

        /* renamed from: a */
        private C8897d f33746a;

        /* renamed from: b */
        private C8897d f33747b;

        /* renamed from: c */
        private C8897d f33748c;

        /* renamed from: d */
        private C8897d f33749d;

        /* renamed from: e */
        private InterfaceC8896c f33750e;

        /* renamed from: f */
        private InterfaceC8896c f33751f;

        /* renamed from: g */
        private InterfaceC8896c f33752g;

        /* renamed from: h */
        private InterfaceC8896c f33753h;

        /* renamed from: i */
        private C8899f f33754i;

        /* renamed from: j */
        private C8899f f33755j;

        /* renamed from: k */
        private C8899f f33756k;

        /* renamed from: l */
        private C8899f f33757l;

        public b() {
            this.f33746a = C8901h.m28308b();
            this.f33747b = C8901h.m28308b();
            this.f33748c = C8901h.m28308b();
            this.f33749d = C8901h.m28308b();
            this.f33750e = new C8894a(0.0f);
            this.f33751f = new C8894a(0.0f);
            this.f33752g = new C8894a(0.0f);
            this.f33753h = new C8894a(0.0f);
            this.f33754i = C8901h.m28309c();
            this.f33755j = C8901h.m28309c();
            this.f33756k = C8901h.m28309c();
            this.f33757l = C8901h.m28309c();
        }

        /* renamed from: n */
        private static float m28349n(C8897d c8897d) {
            if (c8897d instanceof C8903j) {
                return ((C8903j) c8897d).f33732a;
            }
            if (c8897d instanceof C8898e) {
                return ((C8898e) c8897d).f33681a;
            }
            return -1.0f;
        }

        /* renamed from: A */
        public b m28350A(InterfaceC8896c interfaceC8896c) {
            this.f33750e = interfaceC8896c;
            return this;
        }

        /* renamed from: B */
        public b m28351B(int i2, InterfaceC8896c interfaceC8896c) {
            return m28352C(C8901h.m28307a(i2)).m28354E(interfaceC8896c);
        }

        /* renamed from: C */
        public b m28352C(C8897d c8897d) {
            this.f33747b = c8897d;
            float fM28349n = m28349n(c8897d);
            if (fM28349n != -1.0f) {
                m28353D(fM28349n);
            }
            return this;
        }

        /* renamed from: D */
        public b m28353D(float f2) {
            this.f33751f = new C8894a(f2);
            return this;
        }

        /* renamed from: E */
        public b m28354E(InterfaceC8896c interfaceC8896c) {
            this.f33751f = interfaceC8896c;
            return this;
        }

        /* renamed from: m */
        public C8904k m28355m() {
            return new C8904k(this);
        }

        /* renamed from: o */
        public b m28356o(float f2) {
            return m28367z(f2).m28353D(f2).m28363v(f2).m28359r(f2);
        }

        /* renamed from: p */
        public b m28357p(int i2, InterfaceC8896c interfaceC8896c) {
            return m28358q(C8901h.m28307a(i2)).m28360s(interfaceC8896c);
        }

        /* renamed from: q */
        public b m28358q(C8897d c8897d) {
            this.f33749d = c8897d;
            float fM28349n = m28349n(c8897d);
            if (fM28349n != -1.0f) {
                m28359r(fM28349n);
            }
            return this;
        }

        /* renamed from: r */
        public b m28359r(float f2) {
            this.f33753h = new C8894a(f2);
            return this;
        }

        /* renamed from: s */
        public b m28360s(InterfaceC8896c interfaceC8896c) {
            this.f33753h = interfaceC8896c;
            return this;
        }

        /* renamed from: t */
        public b m28361t(int i2, InterfaceC8896c interfaceC8896c) {
            return m28362u(C8901h.m28307a(i2)).m28364w(interfaceC8896c);
        }

        /* renamed from: u */
        public b m28362u(C8897d c8897d) {
            this.f33748c = c8897d;
            float fM28349n = m28349n(c8897d);
            if (fM28349n != -1.0f) {
                m28363v(fM28349n);
            }
            return this;
        }

        /* renamed from: v */
        public b m28363v(float f2) {
            this.f33752g = new C8894a(f2);
            return this;
        }

        /* renamed from: w */
        public b m28364w(InterfaceC8896c interfaceC8896c) {
            this.f33752g = interfaceC8896c;
            return this;
        }

        /* renamed from: x */
        public b m28365x(int i2, InterfaceC8896c interfaceC8896c) {
            return m28366y(C8901h.m28307a(i2)).m28350A(interfaceC8896c);
        }

        /* renamed from: y */
        public b m28366y(C8897d c8897d) {
            this.f33746a = c8897d;
            float fM28349n = m28349n(c8897d);
            if (fM28349n != -1.0f) {
                m28367z(fM28349n);
            }
            return this;
        }

        /* renamed from: z */
        public b m28367z(float f2) {
            this.f33750e = new C8894a(f2);
            return this;
        }

        public b(C8904k c8904k) {
            this.f33746a = C8901h.m28308b();
            this.f33747b = C8901h.m28308b();
            this.f33748c = C8901h.m28308b();
            this.f33749d = C8901h.m28308b();
            this.f33750e = new C8894a(0.0f);
            this.f33751f = new C8894a(0.0f);
            this.f33752g = new C8894a(0.0f);
            this.f33753h = new C8894a(0.0f);
            this.f33754i = C8901h.m28309c();
            this.f33755j = C8901h.m28309c();
            this.f33756k = C8901h.m28309c();
            this.f33757l = C8901h.m28309c();
            this.f33746a = c8904k.f33734b;
            this.f33747b = c8904k.f33735c;
            this.f33748c = c8904k.f33736d;
            this.f33749d = c8904k.f33737e;
            this.f33750e = c8904k.f33738f;
            this.f33751f = c8904k.f33739g;
            this.f33752g = c8904k.f33740h;
            this.f33753h = c8904k.f33741i;
            this.f33754i = c8904k.f33742j;
            this.f33755j = c8904k.f33743k;
            this.f33756k = c8904k.f33744l;
            this.f33757l = c8904k.f33745m;
        }
    }

    public C8904k() {
        this.f33734b = C8901h.m28308b();
        this.f33735c = C8901h.m28308b();
        this.f33736d = C8901h.m28308b();
        this.f33737e = C8901h.m28308b();
        this.f33738f = new C8894a(0.0f);
        this.f33739g = new C8894a(0.0f);
        this.f33740h = new C8894a(0.0f);
        this.f33741i = new C8894a(0.0f);
        this.f33742j = C8901h.m28309c();
        this.f33743k = C8901h.m28309c();
        this.f33744l = C8901h.m28309c();
        this.f33745m = C8901h.m28309c();
    }
}
