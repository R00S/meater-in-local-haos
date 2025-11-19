package T3;

import L3.C1360e;
import L3.y;
import O3.q;
import T3.e;
import X3.j;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import com.airbnb.lottie.n;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import s.C4411v;

/* compiled from: CompositionLayer.java */
/* loaded from: classes.dex */
public class c extends b {

    /* renamed from: D, reason: collision with root package name */
    private O3.a<Float, Float> f15903D;

    /* renamed from: E, reason: collision with root package name */
    private final List<b> f15904E;

    /* renamed from: F, reason: collision with root package name */
    private final RectF f15905F;

    /* renamed from: G, reason: collision with root package name */
    private final RectF f15906G;

    /* renamed from: H, reason: collision with root package name */
    private final Paint f15907H;

    /* renamed from: I, reason: collision with root package name */
    private float f15908I;

    /* renamed from: J, reason: collision with root package name */
    private boolean f15909J;

    /* compiled from: CompositionLayer.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15910a;

        static {
            int[] iArr = new int[e.b.values().length];
            f15910a = iArr;
            try {
                iArr[e.b.ADD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15910a[e.b.INVERT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public c(n nVar, e eVar, List<e> list, L3.i iVar) {
        int i10;
        b bVar;
        super(nVar, eVar);
        this.f15904E = new ArrayList();
        this.f15905F = new RectF();
        this.f15906G = new RectF();
        this.f15907H = new Paint();
        this.f15909J = true;
        R3.b bVarV = eVar.v();
        if (bVarV != null) {
            O3.a<Float, Float> aVarH = bVarV.h();
            this.f15903D = aVarH;
            j(aVarH);
            this.f15903D.a(this);
        } else {
            this.f15903D = null;
        }
        C4411v c4411v = new C4411v(iVar.k().size());
        int size = list.size() - 1;
        b bVar2 = null;
        while (true) {
            if (size < 0) {
                break;
            }
            e eVar2 = list.get(size);
            b bVarV2 = b.v(this, eVar2, nVar, iVar);
            if (bVarV2 != null) {
                c4411v.k(bVarV2.A().e(), bVarV2);
                if (bVar2 != null) {
                    bVar2.K(bVarV2);
                    bVar2 = null;
                } else {
                    this.f15904E.add(0, bVarV2);
                    int i11 = a.f15910a[eVar2.i().ordinal()];
                    if (i11 == 1 || i11 == 2) {
                        bVar2 = bVarV2;
                    }
                }
            }
            size--;
        }
        for (i10 = 0; i10 < c4411v.n(); i10++) {
            b bVar3 = (b) c4411v.f(c4411v.i(i10));
            if (bVar3 != null && (bVar = (b) c4411v.f(bVar3.A().k())) != null) {
                bVar3.M(bVar);
            }
        }
    }

    @Override // T3.b
    protected void J(Q3.e eVar, int i10, List<Q3.e> list, Q3.e eVar2) {
        for (int i11 = 0; i11 < this.f15904E.size(); i11++) {
            this.f15904E.get(i11).d(eVar, i10, list, eVar2);
        }
    }

    @Override // T3.b
    public void L(boolean z10) {
        super.L(z10);
        Iterator<b> it = this.f15904E.iterator();
        while (it.hasNext()) {
            it.next().L(z10);
        }
    }

    @Override // T3.b
    public void N(float f10) {
        if (C1360e.g()) {
            C1360e.b("CompositionLayer#setProgress");
        }
        this.f15908I = f10;
        super.N(f10);
        if (this.f15903D != null) {
            f10 = ((this.f15903D.h().floatValue() * this.f15891q.c().i()) - this.f15891q.c().p()) / (this.f15890p.I().e() + 0.01f);
        }
        if (this.f15903D == null) {
            f10 -= this.f15891q.s();
        }
        if (this.f15891q.w() != 0.0f && !"__container".equals(this.f15891q.j())) {
            f10 /= this.f15891q.w();
        }
        for (int size = this.f15904E.size() - 1; size >= 0; size--) {
            this.f15904E.get(size).N(f10);
        }
        if (C1360e.g()) {
            C1360e.c("CompositionLayer#setProgress");
        }
    }

    public float Q() {
        return this.f15908I;
    }

    public void R(boolean z10) {
        this.f15909J = z10;
    }

    @Override // T3.b, Q3.f
    public <T> void c(T t10, Y3.c<T> cVar) {
        super.c(t10, cVar);
        if (t10 == y.f9210E) {
            if (cVar == null) {
                O3.a<Float, Float> aVar = this.f15903D;
                if (aVar != null) {
                    aVar.o(null);
                    return;
                }
                return;
            }
            q qVar = new q(cVar);
            this.f15903D = qVar;
            qVar.a(this);
            j(this.f15903D);
        }
    }

    @Override // T3.b, N3.e
    public void e(RectF rectF, Matrix matrix, boolean z10) {
        super.e(rectF, matrix, z10);
        for (int size = this.f15904E.size() - 1; size >= 0; size--) {
            this.f15905F.set(0.0f, 0.0f, 0.0f, 0.0f);
            this.f15904E.get(size).e(this.f15905F, this.f15889o, true);
            rectF.union(this.f15905F);
        }
    }

    @Override // T3.b
    void u(Canvas canvas, Matrix matrix, int i10) {
        if (C1360e.g()) {
            C1360e.b("CompositionLayer#draw");
        }
        this.f15906G.set(0.0f, 0.0f, this.f15891q.m(), this.f15891q.l());
        matrix.mapRect(this.f15906G);
        boolean z10 = this.f15890p.e0() && this.f15904E.size() > 1 && i10 != 255;
        if (z10) {
            this.f15907H.setAlpha(i10);
            j.m(canvas, this.f15906G, this.f15907H);
        } else {
            canvas.save();
        }
        if (z10) {
            i10 = 255;
        }
        for (int size = this.f15904E.size() - 1; size >= 0; size--) {
            if (((this.f15909J || !"__container".equals(this.f15891q.j())) && !this.f15906G.isEmpty()) ? canvas.clipRect(this.f15906G) : true) {
                this.f15904E.get(size).g(canvas, matrix, i10);
            }
        }
        canvas.restore();
        if (C1360e.g()) {
            C1360e.c("CompositionLayer#draw");
        }
    }
}
