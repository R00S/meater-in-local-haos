package S3;

import android.graphics.Paint;
import java.util.List;

/* compiled from: ShapeStroke.java */
/* loaded from: classes.dex */
public class s implements S3.c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15426a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.b f15427b;

    /* renamed from: c, reason: collision with root package name */
    private final List<R3.b> f15428c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.a f15429d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.d f15430e;

    /* renamed from: f, reason: collision with root package name */
    private final R3.b f15431f;

    /* renamed from: g, reason: collision with root package name */
    private final b f15432g;

    /* renamed from: h, reason: collision with root package name */
    private final c f15433h;

    /* renamed from: i, reason: collision with root package name */
    private final float f15434i;

    /* renamed from: j, reason: collision with root package name */
    private final boolean f15435j;

    /* compiled from: ShapeStroke.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f15436a;

        /* renamed from: b, reason: collision with root package name */
        static final /* synthetic */ int[] f15437b;

        static {
            int[] iArr = new int[c.values().length];
            f15437b = iArr;
            try {
                iArr[c.BEVEL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f15437b[c.MITER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f15437b[c.ROUND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            int[] iArr2 = new int[b.values().length];
            f15436a = iArr2;
            try {
                iArr2[b.BUTT.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f15436a[b.ROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f15436a[b.UNKNOWN.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum b {
        BUTT,
        ROUND,
        UNKNOWN;

        public Paint.Cap j() {
            int i10 = a.f15436a[ordinal()];
            return i10 != 1 ? i10 != 2 ? Paint.Cap.SQUARE : Paint.Cap.ROUND : Paint.Cap.BUTT;
        }
    }

    /* compiled from: ShapeStroke.java */
    public enum c {
        MITER,
        ROUND,
        BEVEL;

        public Paint.Join j() {
            int i10 = a.f15437b[ordinal()];
            if (i10 == 1) {
                return Paint.Join.BEVEL;
            }
            if (i10 == 2) {
                return Paint.Join.MITER;
            }
            if (i10 != 3) {
                return null;
            }
            return Paint.Join.ROUND;
        }
    }

    public s(String str, R3.b bVar, List<R3.b> list, R3.a aVar, R3.d dVar, R3.b bVar2, b bVar3, c cVar, float f10, boolean z10) {
        this.f15426a = str;
        this.f15427b = bVar;
        this.f15428c = list;
        this.f15429d = aVar;
        this.f15430e = dVar;
        this.f15431f = bVar2;
        this.f15432g = bVar3;
        this.f15433h = cVar;
        this.f15434i = f10;
        this.f15435j = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new N3.t(nVar, bVar, this);
    }

    public b b() {
        return this.f15432g;
    }

    public R3.a c() {
        return this.f15429d;
    }

    public R3.b d() {
        return this.f15427b;
    }

    public c e() {
        return this.f15433h;
    }

    public List<R3.b> f() {
        return this.f15428c;
    }

    public float g() {
        return this.f15434i;
    }

    public String h() {
        return this.f15426a;
    }

    public R3.d i() {
        return this.f15430e;
    }

    public R3.b j() {
        return this.f15431f;
    }

    public boolean k() {
        return this.f15435j;
    }
}
