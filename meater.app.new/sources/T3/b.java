package T3;

import L3.C1360e;
import O3.a;
import O3.p;
import S3.i;
import S3.o;
import T3.e;
import V3.C1796j;
import X3.j;
import android.graphics.BlurMaskFilter;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.os.Build;
import com.airbnb.lottie.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* compiled from: BaseLayer.java */
/* loaded from: classes.dex */
public abstract class b implements N3.e, a.b, Q3.f {

    /* renamed from: A, reason: collision with root package name */
    private Paint f15872A;

    /* renamed from: B, reason: collision with root package name */
    float f15873B;

    /* renamed from: C, reason: collision with root package name */
    BlurMaskFilter f15874C;

    /* renamed from: a, reason: collision with root package name */
    private final Path f15875a = new Path();

    /* renamed from: b, reason: collision with root package name */
    private final Matrix f15876b = new Matrix();

    /* renamed from: c, reason: collision with root package name */
    private final Matrix f15877c = new Matrix();

    /* renamed from: d, reason: collision with root package name */
    private final Paint f15878d = new M3.a(1);

    /* renamed from: e, reason: collision with root package name */
    private final Paint f15879e;

    /* renamed from: f, reason: collision with root package name */
    private final Paint f15880f;

    /* renamed from: g, reason: collision with root package name */
    private final Paint f15881g;

    /* renamed from: h, reason: collision with root package name */
    private final Paint f15882h;

    /* renamed from: i, reason: collision with root package name */
    private final RectF f15883i;

    /* renamed from: j, reason: collision with root package name */
    private final RectF f15884j;

    /* renamed from: k, reason: collision with root package name */
    private final RectF f15885k;

    /* renamed from: l, reason: collision with root package name */
    private final RectF f15886l;

    /* renamed from: m, reason: collision with root package name */
    private final RectF f15887m;

    /* renamed from: n, reason: collision with root package name */
    private final String f15888n;

    /* renamed from: o, reason: collision with root package name */
    final Matrix f15889o;

    /* renamed from: p, reason: collision with root package name */
    final n f15890p;

    /* renamed from: q, reason: collision with root package name */
    final e f15891q;

    /* renamed from: r, reason: collision with root package name */
    private O3.h f15892r;

    /* renamed from: s, reason: collision with root package name */
    private O3.d f15893s;

    /* renamed from: t, reason: collision with root package name */
    private b f15894t;

    /* renamed from: u, reason: collision with root package name */
    private b f15895u;

    /* renamed from: v, reason: collision with root package name */
    private List<b> f15896v;

    /* renamed from: w, reason: collision with root package name */
    private final List<O3.a<?, ?>> f15897w;

    /* renamed from: x, reason: collision with root package name */
    final p f15898x;

    /* renamed from: y, reason: collision with root package name */
    private boolean f15899y;

    /* renamed from: z, reason: collision with root package name */
    private boolean f15900z;

    /* compiled from: BaseLayer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15901a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f15902b;

        static {
            int[] iArr = new int[i.a.values().length];
            f15902b = iArr;
            try {
                iArr[i.a.MASK_MODE_NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15902b[i.a.MASK_MODE_SUBTRACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15902b[i.a.MASK_MODE_INTERSECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f15902b[i.a.MASK_MODE_ADD.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            int[] iArr2 = new int[e.a.values().length];
            f15901a = iArr2;
            try {
                iArr2[e.a.SHAPE.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15901a[e.a.PRE_COMP.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f15901a[e.a.SOLID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f15901a[e.a.IMAGE.ordinal()] = 4;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f15901a[e.a.NULL.ordinal()] = 5;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f15901a[e.a.TEXT.ordinal()] = 6;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                f15901a[e.a.UNKNOWN.ordinal()] = 7;
            } catch (NoSuchFieldError unused11) {
            }
        }
    }

    b(n nVar, e eVar) {
        PorterDuff.Mode mode = PorterDuff.Mode.DST_IN;
        this.f15879e = new M3.a(1, mode);
        PorterDuff.Mode mode2 = PorterDuff.Mode.DST_OUT;
        this.f15880f = new M3.a(1, mode2);
        M3.a aVar = new M3.a(1);
        this.f15881g = aVar;
        this.f15882h = new M3.a(PorterDuff.Mode.CLEAR);
        this.f15883i = new RectF();
        this.f15884j = new RectF();
        this.f15885k = new RectF();
        this.f15886l = new RectF();
        this.f15887m = new RectF();
        this.f15889o = new Matrix();
        this.f15897w = new ArrayList();
        this.f15899y = true;
        this.f15873B = 0.0f;
        this.f15890p = nVar;
        this.f15891q = eVar;
        this.f15888n = eVar.j() + "#draw";
        if (eVar.i() == e.b.INVERT) {
            aVar.setXfermode(new PorterDuffXfermode(mode2));
        } else {
            aVar.setXfermode(new PorterDuffXfermode(mode));
        }
        p pVarB = eVar.x().b();
        this.f15898x = pVarB;
        pVarB.b(this);
        if (eVar.h() != null && !eVar.h().isEmpty()) {
            O3.h hVar = new O3.h(eVar.h());
            this.f15892r = hVar;
            Iterator<O3.a<o, Path>> it = hVar.a().iterator();
            while (it.hasNext()) {
                it.next().a(this);
            }
            for (O3.a<Integer, Integer> aVar2 : this.f15892r.c()) {
                j(aVar2);
                aVar2.a(this);
            }
        }
        P();
    }

    private void D(RectF rectF, Matrix matrix) {
        this.f15885k.set(0.0f, 0.0f, 0.0f, 0.0f);
        if (B()) {
            int size = this.f15892r.b().size();
            for (int i10 = 0; i10 < size; i10++) {
                S3.i iVar = this.f15892r.b().get(i10);
                Path pathH = this.f15892r.a().get(i10).h();
                if (pathH != null) {
                    this.f15875a.set(pathH);
                    this.f15875a.transform(matrix);
                    int i11 = a.f15902b[iVar.a().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        return;
                    }
                    if ((i11 == 3 || i11 == 4) && iVar.d()) {
                        return;
                    }
                    this.f15875a.computeBounds(this.f15887m, false);
                    if (i10 == 0) {
                        this.f15885k.set(this.f15887m);
                    } else {
                        RectF rectF2 = this.f15885k;
                        rectF2.set(Math.min(rectF2.left, this.f15887m.left), Math.min(this.f15885k.top, this.f15887m.top), Math.max(this.f15885k.right, this.f15887m.right), Math.max(this.f15885k.bottom, this.f15887m.bottom));
                    }
                }
            }
            if (rectF.intersect(this.f15885k)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void E(RectF rectF, Matrix matrix) {
        if (C() && this.f15891q.i() != e.b.INVERT) {
            this.f15886l.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f15894t.e(this.f15886l, matrix, true);
            if (rectF.intersect(this.f15886l)) {
                return;
            }
            rectF.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
    }

    private void F() {
        this.f15890p.invalidateSelf();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G() {
        O(this.f15893s.q() == 1.0f);
    }

    private void H(float f10) {
        this.f15890p.I().n().a(this.f15891q.j(), f10);
    }

    private void O(boolean z10) {
        if (z10 != this.f15899y) {
            this.f15899y = z10;
            F();
        }
    }

    private void P() {
        if (this.f15891q.f().isEmpty()) {
            O(true);
            return;
        }
        O3.d dVar = new O3.d(this.f15891q.f());
        this.f15893s = dVar;
        dVar.m();
        this.f15893s.a(new a.b() { // from class: T3.a
            @Override // O3.a.b
            public final void a() {
                this.f15871a.G();
            }
        });
        O(this.f15893s.h().floatValue() == 1.0f);
        j(this.f15893s);
    }

    private void k(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar, O3.a<Integer, Integer> aVar2) {
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        this.f15878d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f15875a, this.f15878d);
    }

    private void l(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar, O3.a<Integer, Integer> aVar2) {
        j.m(canvas, this.f15883i, this.f15879e);
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        this.f15878d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f15875a, this.f15878d);
        canvas.restore();
    }

    private void m(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar, O3.a<Integer, Integer> aVar2) {
        j.m(canvas, this.f15883i, this.f15878d);
        canvas.drawRect(this.f15883i, this.f15878d);
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        this.f15878d.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        canvas.drawPath(this.f15875a, this.f15880f);
        canvas.restore();
    }

    private void n(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar, O3.a<Integer, Integer> aVar2) {
        j.m(canvas, this.f15883i, this.f15879e);
        canvas.drawRect(this.f15883i, this.f15878d);
        this.f15880f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        canvas.drawPath(this.f15875a, this.f15880f);
        canvas.restore();
    }

    private void o(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar, O3.a<Integer, Integer> aVar2) {
        j.m(canvas, this.f15883i, this.f15880f);
        canvas.drawRect(this.f15883i, this.f15878d);
        this.f15880f.setAlpha((int) (aVar2.h().intValue() * 2.55f));
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        canvas.drawPath(this.f15875a, this.f15880f);
        canvas.restore();
    }

    private void p(Canvas canvas, Matrix matrix) {
        if (C1360e.g()) {
            C1360e.b("Layer#saveLayer");
        }
        j.n(canvas, this.f15883i, this.f15879e, 19);
        if (Build.VERSION.SDK_INT < 28) {
            t(canvas);
        }
        if (C1360e.g()) {
            C1360e.c("Layer#saveLayer");
        }
        for (int i10 = 0; i10 < this.f15892r.b().size(); i10++) {
            S3.i iVar = this.f15892r.b().get(i10);
            O3.a<o, Path> aVar = this.f15892r.a().get(i10);
            O3.a<Integer, Integer> aVar2 = this.f15892r.c().get(i10);
            int i11 = a.f15902b[iVar.a().ordinal()];
            if (i11 != 1) {
                if (i11 == 2) {
                    if (i10 == 0) {
                        this.f15878d.setColor(-16777216);
                        this.f15878d.setAlpha(255);
                        canvas.drawRect(this.f15883i, this.f15878d);
                    }
                    if (iVar.d()) {
                        o(canvas, matrix, aVar, aVar2);
                    } else {
                        q(canvas, matrix, aVar);
                    }
                } else if (i11 != 3) {
                    if (i11 == 4) {
                        if (iVar.d()) {
                            m(canvas, matrix, aVar, aVar2);
                        } else {
                            k(canvas, matrix, aVar, aVar2);
                        }
                    }
                } else if (iVar.d()) {
                    n(canvas, matrix, aVar, aVar2);
                } else {
                    l(canvas, matrix, aVar, aVar2);
                }
            } else if (r()) {
                this.f15878d.setAlpha(255);
                canvas.drawRect(this.f15883i, this.f15878d);
            }
        }
        if (C1360e.g()) {
            C1360e.b("Layer#restoreLayer");
        }
        canvas.restore();
        if (C1360e.g()) {
            C1360e.c("Layer#restoreLayer");
        }
    }

    private void q(Canvas canvas, Matrix matrix, O3.a<o, Path> aVar) {
        this.f15875a.set(aVar.h());
        this.f15875a.transform(matrix);
        canvas.drawPath(this.f15875a, this.f15880f);
    }

    private boolean r() {
        if (this.f15892r.a().isEmpty()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f15892r.b().size(); i10++) {
            if (this.f15892r.b().get(i10).a() != i.a.MASK_MODE_NONE) {
                return false;
            }
        }
        return true;
    }

    private void s() {
        if (this.f15896v != null) {
            return;
        }
        if (this.f15895u == null) {
            this.f15896v = Collections.emptyList();
            return;
        }
        this.f15896v = new ArrayList();
        for (b bVar = this.f15895u; bVar != null; bVar = bVar.f15895u) {
            this.f15896v.add(bVar);
        }
    }

    private void t(Canvas canvas) {
        if (C1360e.g()) {
            C1360e.b("Layer#clearLayer");
        }
        RectF rectF = this.f15883i;
        canvas.drawRect(rectF.left - 1.0f, rectF.top - 1.0f, rectF.right + 1.0f, rectF.bottom + 1.0f, this.f15882h);
        if (C1360e.g()) {
            C1360e.c("Layer#clearLayer");
        }
    }

    static b v(c cVar, e eVar, n nVar, L3.i iVar) {
        switch (a.f15901a[eVar.g().ordinal()]) {
            case 1:
                return new g(nVar, eVar, cVar, iVar);
            case 2:
                return new c(nVar, eVar, iVar.o(eVar.n()), iVar);
            case 3:
                return new h(nVar, eVar);
            case 4:
                return new d(nVar, eVar);
            case 5:
                return new f(nVar, eVar);
            case 6:
                return new i(nVar, eVar);
            default:
                X3.d.c("Unknown layer type " + eVar.g());
                return null;
        }
    }

    e A() {
        return this.f15891q;
    }

    boolean B() {
        O3.h hVar = this.f15892r;
        return (hVar == null || hVar.a().isEmpty()) ? false : true;
    }

    boolean C() {
        return this.f15894t != null;
    }

    public void I(O3.a<?, ?> aVar) {
        this.f15897w.remove(aVar);
    }

    void K(b bVar) {
        this.f15894t = bVar;
    }

    void L(boolean z10) {
        if (z10 && this.f15872A == null) {
            this.f15872A = new M3.a();
        }
        this.f15900z = z10;
    }

    void M(b bVar) {
        this.f15895u = bVar;
    }

    void N(float f10) {
        if (C1360e.g()) {
            C1360e.b("BaseLayer#setProgress");
            C1360e.b("BaseLayer#setProgress.transform");
        }
        this.f15898x.j(f10);
        if (C1360e.g()) {
            C1360e.c("BaseLayer#setProgress.transform");
        }
        if (this.f15892r != null) {
            if (C1360e.g()) {
                C1360e.b("BaseLayer#setProgress.mask");
            }
            for (int i10 = 0; i10 < this.f15892r.a().size(); i10++) {
                this.f15892r.a().get(i10).n(f10);
            }
            if (C1360e.g()) {
                C1360e.c("BaseLayer#setProgress.mask");
            }
        }
        if (this.f15893s != null) {
            if (C1360e.g()) {
                C1360e.b("BaseLayer#setProgress.inout");
            }
            this.f15893s.n(f10);
            if (C1360e.g()) {
                C1360e.c("BaseLayer#setProgress.inout");
            }
        }
        if (this.f15894t != null) {
            if (C1360e.g()) {
                C1360e.b("BaseLayer#setProgress.matte");
            }
            this.f15894t.N(f10);
            if (C1360e.g()) {
                C1360e.c("BaseLayer#setProgress.matte");
            }
        }
        if (C1360e.g()) {
            C1360e.b("BaseLayer#setProgress.animations." + this.f15897w.size());
        }
        for (int i11 = 0; i11 < this.f15897w.size(); i11++) {
            this.f15897w.get(i11).n(f10);
        }
        if (C1360e.g()) {
            C1360e.c("BaseLayer#setProgress.animations." + this.f15897w.size());
            C1360e.c("BaseLayer#setProgress");
        }
    }

    @Override // O3.a.b
    public void a() {
        F();
    }

    @Override // Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        this.f15898x.c(t10, cVar);
    }

    @Override // Q3.f
    public void d(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        b bVar = this.f15894t;
        if (bVar != null) {
            Q3.e eVarA = eVar2.a(bVar.getName());
            if (eVar.c(this.f15894t.getName(), i10)) {
                list.add(eVarA.i(this.f15894t));
            }
            if (eVar.h(getName(), i10)) {
                this.f15894t.J(eVar, eVar.e(this.f15894t.getName(), i10) + i10, list, eVarA);
            }
        }
        if (eVar.g(getName(), i10)) {
            if (!"__container".equals(getName())) {
                eVar2 = eVar2.a(getName());
                if (eVar.c(getName(), i10)) {
                    list.add(eVar2.i(this));
                }
            }
            if (eVar.h(getName(), i10)) {
                J(eVar, i10 + eVar.e(getName(), i10), list, eVar2);
            }
        }
    }

    @Override // N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        this.f15883i.set(0.0f, 0.0f, 0.0f, 0.0f);
        s();
        this.f15889o.set(matrix);
        if (z10) {
            List<b> list = this.f15896v;
            if (list != null) {
                for (int size = list.size() - 1; size >= 0; size--) {
                    this.f15889o.preConcat(this.f15896v.get(size).f15898x.f());
                }
            } else {
                b bVar = this.f15895u;
                if (bVar != null) {
                    this.f15889o.preConcat(bVar.f15898x.f());
                }
            }
        }
        this.f15889o.preConcat(this.f15898x.f());
    }

    @Override // N3.e
    public void g(Canvas canvas, Matrix matrix, int i10) {
        Paint paint;
        Integer numH;
        C1360e.b(this.f15888n);
        if (!this.f15899y || this.f15891q.y()) {
            C1360e.c(this.f15888n);
            return;
        }
        s();
        if (C1360e.g()) {
            C1360e.b("Layer#parentMatrix");
        }
        this.f15876b.reset();
        this.f15876b.set(matrix);
        for (int size = this.f15896v.size() - 1; size >= 0; size--) {
            this.f15876b.preConcat(this.f15896v.get(size).f15898x.f());
        }
        if (C1360e.g()) {
            C1360e.c("Layer#parentMatrix");
        }
        O3.a<?, Integer> aVarH = this.f15898x.h();
        int iIntValue = (int) ((((i10 / 255.0f) * ((aVarH == null || (numH = aVarH.h()) == null) ? 100 : numH.intValue())) / 100.0f) * 255.0f);
        if (!C() && !B()) {
            this.f15876b.preConcat(this.f15898x.f());
            if (C1360e.g()) {
                C1360e.b("Layer#drawLayer");
            }
            u(canvas, this.f15876b, iIntValue);
            if (C1360e.g()) {
                C1360e.c("Layer#drawLayer");
            }
            H(C1360e.c(this.f15888n));
            return;
        }
        if (C1360e.g()) {
            C1360e.b("Layer#computeBounds");
        }
        e(this.f15883i, this.f15876b, false);
        E(this.f15883i, matrix);
        this.f15876b.preConcat(this.f15898x.f());
        D(this.f15883i, this.f15876b);
        this.f15884j.set(0.0f, 0.0f, canvas.getWidth(), canvas.getHeight());
        canvas.getMatrix(this.f15877c);
        if (!this.f15877c.isIdentity()) {
            Matrix matrix2 = this.f15877c;
            matrix2.invert(matrix2);
            this.f15877c.mapRect(this.f15884j);
        }
        if (!this.f15883i.intersect(this.f15884j)) {
            this.f15883i.set(0.0f, 0.0f, 0.0f, 0.0f);
        }
        if (C1360e.g()) {
            C1360e.c("Layer#computeBounds");
        }
        if (this.f15883i.width() >= 1.0f && this.f15883i.height() >= 1.0f) {
            if (C1360e.g()) {
                C1360e.b("Layer#saveLayer");
            }
            this.f15878d.setAlpha(255);
            j.m(canvas, this.f15883i, this.f15878d);
            if (C1360e.g()) {
                C1360e.c("Layer#saveLayer");
            }
            t(canvas);
            if (C1360e.g()) {
                C1360e.b("Layer#drawLayer");
            }
            u(canvas, this.f15876b, iIntValue);
            if (C1360e.g()) {
                C1360e.c("Layer#drawLayer");
            }
            if (B()) {
                p(canvas, this.f15876b);
            }
            if (C()) {
                if (C1360e.g()) {
                    C1360e.b("Layer#drawMatte");
                    C1360e.b("Layer#saveLayer");
                }
                j.n(canvas, this.f15883i, this.f15881g, 19);
                if (C1360e.g()) {
                    C1360e.c("Layer#saveLayer");
                }
                t(canvas);
                this.f15894t.g(canvas, matrix, iIntValue);
                if (C1360e.g()) {
                    C1360e.b("Layer#restoreLayer");
                }
                canvas.restore();
                if (C1360e.g()) {
                    C1360e.c("Layer#restoreLayer");
                    C1360e.c("Layer#drawMatte");
                }
            }
            if (C1360e.g()) {
                C1360e.b("Layer#restoreLayer");
            }
            canvas.restore();
            if (C1360e.g()) {
                C1360e.c("Layer#restoreLayer");
            }
        }
        if (this.f15900z && (paint = this.f15872A) != null) {
            paint.setStyle(Paint.Style.STROKE);
            this.f15872A.setColor(-251901);
            this.f15872A.setStrokeWidth(4.0f);
            canvas.drawRect(this.f15883i, this.f15872A);
            this.f15872A.setStyle(Paint.Style.FILL);
            this.f15872A.setColor(1357638635);
            canvas.drawRect(this.f15883i, this.f15872A);
        }
        H(C1360e.c(this.f15888n));
    }

    @Override // N3.c
    public String getName() {
        return this.f15891q.j();
    }

    public void j(O3.a<?, ?> aVar) {
        if (aVar == null) {
            return;
        }
        this.f15897w.add(aVar);
    }

    abstract void u(Canvas canvas, Matrix matrix, int i10);

    public S3.h w() {
        return this.f15891q.a();
    }

    public S3.a x() {
        return this.f15891q.b();
    }

    public BlurMaskFilter y(float f10) {
        if (this.f15873B == f10) {
            return this.f15874C;
        }
        BlurMaskFilter blurMaskFilter = new BlurMaskFilter(f10 / 2.0f, BlurMaskFilter.Blur.NORMAL);
        this.f15874C = blurMaskFilter;
        this.f15873B = f10;
        return blurMaskFilter;
    }

    public C1796j z() {
        return this.f15891q.d();
    }

    @Override // N3.c
    public void b(List<N3.c> list, List<N3.c> list2) {
    }

    void J(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
    }
}
