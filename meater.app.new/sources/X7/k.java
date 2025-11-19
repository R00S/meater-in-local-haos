package X7;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.RectF;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;

/* compiled from: ShapeAppearanceModel.java */
/* loaded from: classes2.dex */
public class k {

    /* renamed from: m, reason: collision with root package name */
    public static final X7.c f18826m = new i(0.5f);

    /* renamed from: a, reason: collision with root package name */
    d f18827a;

    /* renamed from: b, reason: collision with root package name */
    d f18828b;

    /* renamed from: c, reason: collision with root package name */
    d f18829c;

    /* renamed from: d, reason: collision with root package name */
    d f18830d;

    /* renamed from: e, reason: collision with root package name */
    X7.c f18831e;

    /* renamed from: f, reason: collision with root package name */
    X7.c f18832f;

    /* renamed from: g, reason: collision with root package name */
    X7.c f18833g;

    /* renamed from: h, reason: collision with root package name */
    X7.c f18834h;

    /* renamed from: i, reason: collision with root package name */
    f f18835i;

    /* renamed from: j, reason: collision with root package name */
    f f18836j;

    /* renamed from: k, reason: collision with root package name */
    f f18837k;

    /* renamed from: l, reason: collision with root package name */
    f f18838l;

    /* compiled from: ShapeAppearanceModel.java */
    public interface c {
        X7.c a(X7.c cVar);
    }

    public static b a() {
        return new b();
    }

    public static b b(Context context, int i10, int i11) {
        return c(context, i10, i11, 0);
    }

    private static b c(Context context, int i10, int i11, int i12) {
        return d(context, i10, i11, new X7.a(i12));
    }

    private static b d(Context context, int i10, int i11, X7.c cVar) {
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(context, i10);
        if (i11 != 0) {
            contextThemeWrapper = new ContextThemeWrapper(contextThemeWrapper, i11);
        }
        TypedArray typedArrayObtainStyledAttributes = contextThemeWrapper.obtainStyledAttributes(C7.m.f2912f6);
        try {
            int i12 = typedArrayObtainStyledAttributes.getInt(C7.m.f2923g6, 0);
            int i13 = typedArrayObtainStyledAttributes.getInt(C7.m.f2956j6, i12);
            int i14 = typedArrayObtainStyledAttributes.getInt(C7.m.f2967k6, i12);
            int i15 = typedArrayObtainStyledAttributes.getInt(C7.m.f2945i6, i12);
            int i16 = typedArrayObtainStyledAttributes.getInt(C7.m.f2934h6, i12);
            X7.c cVarM = m(typedArrayObtainStyledAttributes, C7.m.f2978l6, cVar);
            X7.c cVarM2 = m(typedArrayObtainStyledAttributes, C7.m.f3011o6, cVarM);
            X7.c cVarM3 = m(typedArrayObtainStyledAttributes, C7.m.f3022p6, cVarM);
            X7.c cVarM4 = m(typedArrayObtainStyledAttributes, C7.m.f3000n6, cVarM);
            return new b().y(i13, cVarM2).C(i14, cVarM3).u(i15, cVarM4).q(i16, m(typedArrayObtainStyledAttributes, C7.m.f2989m6, cVarM));
        } finally {
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public static b e(Context context, AttributeSet attributeSet, int i10, int i11) {
        return f(context, attributeSet, i10, i11, 0);
    }

    public static b f(Context context, AttributeSet attributeSet, int i10, int i11, int i12) {
        return g(context, attributeSet, i10, i11, new X7.a(i12));
    }

    public static b g(Context context, AttributeSet attributeSet, int i10, int i11, X7.c cVar) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C7.m.f2735O4, i10, i11);
        int resourceId = typedArrayObtainStyledAttributes.getResourceId(C7.m.f2745P4, 0);
        int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C7.m.f2755Q4, 0);
        typedArrayObtainStyledAttributes.recycle();
        return d(context, resourceId, resourceId2, cVar);
    }

    private static X7.c m(TypedArray typedArray, int i10, X7.c cVar) {
        TypedValue typedValuePeekValue = typedArray.peekValue(i10);
        if (typedValuePeekValue == null) {
            return cVar;
        }
        int i11 = typedValuePeekValue.type;
        return i11 == 5 ? new X7.a(TypedValue.complexToDimensionPixelSize(typedValuePeekValue.data, typedArray.getResources().getDisplayMetrics())) : i11 == 6 ? new i(typedValuePeekValue.getFraction(1.0f, 1.0f)) : cVar;
    }

    public f h() {
        return this.f18837k;
    }

    public d i() {
        return this.f18830d;
    }

    public X7.c j() {
        return this.f18834h;
    }

    public d k() {
        return this.f18829c;
    }

    public X7.c l() {
        return this.f18833g;
    }

    public f n() {
        return this.f18838l;
    }

    public f o() {
        return this.f18836j;
    }

    public f p() {
        return this.f18835i;
    }

    public d q() {
        return this.f18827a;
    }

    public X7.c r() {
        return this.f18831e;
    }

    public d s() {
        return this.f18828b;
    }

    public X7.c t() {
        return this.f18832f;
    }

    public boolean u(RectF rectF) {
        boolean z10 = this.f18838l.getClass().equals(f.class) && this.f18836j.getClass().equals(f.class) && this.f18835i.getClass().equals(f.class) && this.f18837k.getClass().equals(f.class);
        float fA = this.f18831e.a(rectF);
        return z10 && ((this.f18832f.a(rectF) > fA ? 1 : (this.f18832f.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18834h.a(rectF) > fA ? 1 : (this.f18834h.a(rectF) == fA ? 0 : -1)) == 0 && (this.f18833g.a(rectF) > fA ? 1 : (this.f18833g.a(rectF) == fA ? 0 : -1)) == 0) && ((this.f18828b instanceof j) && (this.f18827a instanceof j) && (this.f18829c instanceof j) && (this.f18830d instanceof j));
    }

    public b v() {
        return new b(this);
    }

    public k w(float f10) {
        return v().o(f10).m();
    }

    public k x(X7.c cVar) {
        return v().p(cVar).m();
    }

    public k y(c cVar) {
        return v().B(cVar.a(r())).F(cVar.a(t())).t(cVar.a(j())).x(cVar.a(l())).m();
    }

    private k(b bVar) {
        this.f18827a = bVar.f18839a;
        this.f18828b = bVar.f18840b;
        this.f18829c = bVar.f18841c;
        this.f18830d = bVar.f18842d;
        this.f18831e = bVar.f18843e;
        this.f18832f = bVar.f18844f;
        this.f18833g = bVar.f18845g;
        this.f18834h = bVar.f18846h;
        this.f18835i = bVar.f18847i;
        this.f18836j = bVar.f18848j;
        this.f18837k = bVar.f18849k;
        this.f18838l = bVar.f18850l;
    }

    /* compiled from: ShapeAppearanceModel.java */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        private d f18839a;

        /* renamed from: b, reason: collision with root package name */
        private d f18840b;

        /* renamed from: c, reason: collision with root package name */
        private d f18841c;

        /* renamed from: d, reason: collision with root package name */
        private d f18842d;

        /* renamed from: e, reason: collision with root package name */
        private X7.c f18843e;

        /* renamed from: f, reason: collision with root package name */
        private X7.c f18844f;

        /* renamed from: g, reason: collision with root package name */
        private X7.c f18845g;

        /* renamed from: h, reason: collision with root package name */
        private X7.c f18846h;

        /* renamed from: i, reason: collision with root package name */
        private f f18847i;

        /* renamed from: j, reason: collision with root package name */
        private f f18848j;

        /* renamed from: k, reason: collision with root package name */
        private f f18849k;

        /* renamed from: l, reason: collision with root package name */
        private f f18850l;

        public b() {
            this.f18839a = h.b();
            this.f18840b = h.b();
            this.f18841c = h.b();
            this.f18842d = h.b();
            this.f18843e = new X7.a(0.0f);
            this.f18844f = new X7.a(0.0f);
            this.f18845g = new X7.a(0.0f);
            this.f18846h = new X7.a(0.0f);
            this.f18847i = h.c();
            this.f18848j = h.c();
            this.f18849k = h.c();
            this.f18850l = h.c();
        }

        private static float n(d dVar) {
            if (dVar instanceof j) {
                return ((j) dVar).f18825a;
            }
            if (dVar instanceof e) {
                return ((e) dVar).f18773a;
            }
            return -1.0f;
        }

        public b A(float f10) {
            this.f18843e = new X7.a(f10);
            return this;
        }

        public b B(X7.c cVar) {
            this.f18843e = cVar;
            return this;
        }

        public b C(int i10, X7.c cVar) {
            return D(h.a(i10)).F(cVar);
        }

        public b D(d dVar) {
            this.f18840b = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                E(fN);
            }
            return this;
        }

        public b E(float f10) {
            this.f18844f = new X7.a(f10);
            return this;
        }

        public b F(X7.c cVar) {
            this.f18844f = cVar;
            return this;
        }

        public k m() {
            return new k(this);
        }

        public b o(float f10) {
            return A(f10).E(f10).w(f10).s(f10);
        }

        public b p(X7.c cVar) {
            return B(cVar).F(cVar).x(cVar).t(cVar);
        }

        public b q(int i10, X7.c cVar) {
            return r(h.a(i10)).t(cVar);
        }

        public b r(d dVar) {
            this.f18842d = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                s(fN);
            }
            return this;
        }

        public b s(float f10) {
            this.f18846h = new X7.a(f10);
            return this;
        }

        public b t(X7.c cVar) {
            this.f18846h = cVar;
            return this;
        }

        public b u(int i10, X7.c cVar) {
            return v(h.a(i10)).x(cVar);
        }

        public b v(d dVar) {
            this.f18841c = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                w(fN);
            }
            return this;
        }

        public b w(float f10) {
            this.f18845g = new X7.a(f10);
            return this;
        }

        public b x(X7.c cVar) {
            this.f18845g = cVar;
            return this;
        }

        public b y(int i10, X7.c cVar) {
            return z(h.a(i10)).B(cVar);
        }

        public b z(d dVar) {
            this.f18839a = dVar;
            float fN = n(dVar);
            if (fN != -1.0f) {
                A(fN);
            }
            return this;
        }

        public b(k kVar) {
            this.f18839a = h.b();
            this.f18840b = h.b();
            this.f18841c = h.b();
            this.f18842d = h.b();
            this.f18843e = new X7.a(0.0f);
            this.f18844f = new X7.a(0.0f);
            this.f18845g = new X7.a(0.0f);
            this.f18846h = new X7.a(0.0f);
            this.f18847i = h.c();
            this.f18848j = h.c();
            this.f18849k = h.c();
            this.f18850l = h.c();
            this.f18839a = kVar.f18827a;
            this.f18840b = kVar.f18828b;
            this.f18841c = kVar.f18829c;
            this.f18842d = kVar.f18830d;
            this.f18843e = kVar.f18831e;
            this.f18844f = kVar.f18832f;
            this.f18845g = kVar.f18833g;
            this.f18846h = kVar.f18834h;
            this.f18847i = kVar.f18835i;
            this.f18848j = kVar.f18836j;
            this.f18849k = kVar.f18837k;
            this.f18850l = kVar.f18838l;
        }
    }

    public k() {
        this.f18827a = h.b();
        this.f18828b = h.b();
        this.f18829c = h.b();
        this.f18830d = h.b();
        this.f18831e = new X7.a(0.0f);
        this.f18832f = new X7.a(0.0f);
        this.f18833g = new X7.a(0.0f);
        this.f18834h = new X7.a(0.0f);
        this.f18835i = h.c();
        this.f18836j = h.c();
        this.f18837k = h.c();
        this.f18838l = h.c();
    }
}
