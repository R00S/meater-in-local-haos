package O3;

import O3.a;
import V3.C1796j;
import android.graphics.Color;
import android.graphics.Paint;

/* compiled from: DropShadowKeyframeAnimation.java */
/* loaded from: classes.dex */
public class c implements a.b {

    /* renamed from: a, reason: collision with root package name */
    private final a.b f13179a;

    /* renamed from: b, reason: collision with root package name */
    private final O3.a<Integer, Integer> f13180b;

    /* renamed from: c, reason: collision with root package name */
    private final O3.a<Float, Float> f13181c;

    /* renamed from: d, reason: collision with root package name */
    private final O3.a<Float, Float> f13182d;

    /* renamed from: e, reason: collision with root package name */
    private final O3.a<Float, Float> f13183e;

    /* renamed from: f, reason: collision with root package name */
    private final O3.a<Float, Float> f13184f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f13185g = true;

    /* compiled from: DropShadowKeyframeAnimation.java */
    class a extends Y3.c<Float> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ Y3.c f13186d;

        a(Y3.c cVar) {
            this.f13186d = cVar;
        }

        @Override // Y3.c
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Float a(Y3.b<Float> bVar) {
            Float f10 = (Float) this.f13186d.a(bVar);
            if (f10 == null) {
                return null;
            }
            return Float.valueOf(f10.floatValue() * 2.55f);
        }
    }

    public c(a.b bVar, T3.b bVar2, C1796j c1796j) {
        this.f13179a = bVar;
        O3.a<Integer, Integer> aVarH = c1796j.a().h();
        this.f13180b = aVarH;
        aVarH.a(this);
        bVar2.j(aVarH);
        O3.a<Float, Float> aVarH2 = c1796j.d().h();
        this.f13181c = aVarH2;
        aVarH2.a(this);
        bVar2.j(aVarH2);
        O3.a<Float, Float> aVarH3 = c1796j.b().h();
        this.f13182d = aVarH3;
        aVarH3.a(this);
        bVar2.j(aVarH3);
        O3.a<Float, Float> aVarH4 = c1796j.c().h();
        this.f13183e = aVarH4;
        aVarH4.a(this);
        bVar2.j(aVarH4);
        O3.a<Float, Float> aVarH5 = c1796j.e().h();
        this.f13184f = aVarH5;
        aVarH5.a(this);
        bVar2.j(aVarH5);
    }

    @Override // O3.a.b
    public void a() {
        this.f13185g = true;
        this.f13179a.a();
    }

    public void b(Paint paint) {
        if (this.f13185g) {
            this.f13185g = false;
            double dFloatValue = this.f13182d.h().floatValue() * 0.017453292519943295d;
            float fFloatValue = this.f13183e.h().floatValue();
            float fSin = ((float) Math.sin(dFloatValue)) * fFloatValue;
            float fCos = ((float) Math.cos(dFloatValue + 3.141592653589793d)) * fFloatValue;
            int iIntValue = this.f13180b.h().intValue();
            paint.setShadowLayer(this.f13184f.h().floatValue(), fSin, fCos, Color.argb(Math.round(this.f13181c.h().floatValue()), Color.red(iIntValue), Color.green(iIntValue), Color.blue(iIntValue)));
        }
    }

    public void c(Y3.c<Integer> cVar) {
        this.f13180b.o(cVar);
    }

    public void d(Y3.c<Float> cVar) {
        this.f13182d.o(cVar);
    }

    public void e(Y3.c<Float> cVar) {
        this.f13183e.o(cVar);
    }

    public void f(Y3.c<Float> cVar) {
        if (cVar == null) {
            this.f13181c.o(null);
        } else {
            this.f13181c.o(new a(cVar));
        }
    }

    public void g(Y3.c<Float> cVar) {
        this.f13184f.o(cVar);
    }
}
