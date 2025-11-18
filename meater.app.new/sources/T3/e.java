package T3;

import R3.j;
import R3.k;
import R3.l;
import V3.C1796j;
import java.util.List;
import java.util.Locale;

/* compiled from: Layer.java */
/* loaded from: classes.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    private final List<S3.c> f15917a;

    /* renamed from: b, reason: collision with root package name */
    private final L3.i f15918b;

    /* renamed from: c, reason: collision with root package name */
    private final String f15919c;

    /* renamed from: d, reason: collision with root package name */
    private final long f15920d;

    /* renamed from: e, reason: collision with root package name */
    private final a f15921e;

    /* renamed from: f, reason: collision with root package name */
    private final long f15922f;

    /* renamed from: g, reason: collision with root package name */
    private final String f15923g;

    /* renamed from: h, reason: collision with root package name */
    private final List<S3.i> f15924h;

    /* renamed from: i, reason: collision with root package name */
    private final l f15925i;

    /* renamed from: j, reason: collision with root package name */
    private final int f15926j;

    /* renamed from: k, reason: collision with root package name */
    private final int f15927k;

    /* renamed from: l, reason: collision with root package name */
    private final int f15928l;

    /* renamed from: m, reason: collision with root package name */
    private final float f15929m;

    /* renamed from: n, reason: collision with root package name */
    private final float f15930n;

    /* renamed from: o, reason: collision with root package name */
    private final float f15931o;

    /* renamed from: p, reason: collision with root package name */
    private final float f15932p;

    /* renamed from: q, reason: collision with root package name */
    private final j f15933q;

    /* renamed from: r, reason: collision with root package name */
    private final k f15934r;

    /* renamed from: s, reason: collision with root package name */
    private final R3.b f15935s;

    /* renamed from: t, reason: collision with root package name */
    private final List<Y3.a<Float>> f15936t;

    /* renamed from: u, reason: collision with root package name */
    private final b f15937u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f15938v;

    /* renamed from: w, reason: collision with root package name */
    private final S3.a f15939w;

    /* renamed from: x, reason: collision with root package name */
    private final C1796j f15940x;

    /* renamed from: y, reason: collision with root package name */
    private final S3.h f15941y;

    /* compiled from: Layer.java */
    public enum a {
        PRE_COMP,
        SOLID,
        IMAGE,
        NULL,
        SHAPE,
        TEXT,
        UNKNOWN
    }

    /* compiled from: Layer.java */
    public enum b {
        NONE,
        ADD,
        INVERT,
        LUMA,
        LUMA_INVERTED,
        UNKNOWN
    }

    public e(List<S3.c> list, L3.i iVar, String str, long j10, a aVar, long j11, String str2, List<S3.i> list2, l lVar, int i10, int i11, int i12, float f10, float f11, float f12, float f13, j jVar, k kVar, List<Y3.a<Float>> list3, b bVar, R3.b bVar2, boolean z10, S3.a aVar2, C1796j c1796j, S3.h hVar) {
        this.f15917a = list;
        this.f15918b = iVar;
        this.f15919c = str;
        this.f15920d = j10;
        this.f15921e = aVar;
        this.f15922f = j11;
        this.f15923g = str2;
        this.f15924h = list2;
        this.f15925i = lVar;
        this.f15926j = i10;
        this.f15927k = i11;
        this.f15928l = i12;
        this.f15929m = f10;
        this.f15930n = f11;
        this.f15931o = f12;
        this.f15932p = f13;
        this.f15933q = jVar;
        this.f15934r = kVar;
        this.f15936t = list3;
        this.f15937u = bVar;
        this.f15935s = bVar2;
        this.f15938v = z10;
        this.f15939w = aVar2;
        this.f15940x = c1796j;
        this.f15941y = hVar;
    }

    public S3.h a() {
        return this.f15941y;
    }

    public S3.a b() {
        return this.f15939w;
    }

    L3.i c() {
        return this.f15918b;
    }

    public C1796j d() {
        return this.f15940x;
    }

    public long e() {
        return this.f15920d;
    }

    List<Y3.a<Float>> f() {
        return this.f15936t;
    }

    public a g() {
        return this.f15921e;
    }

    List<S3.i> h() {
        return this.f15924h;
    }

    b i() {
        return this.f15937u;
    }

    public String j() {
        return this.f15919c;
    }

    long k() {
        return this.f15922f;
    }

    float l() {
        return this.f15932p;
    }

    float m() {
        return this.f15931o;
    }

    public String n() {
        return this.f15923g;
    }

    List<S3.c> o() {
        return this.f15917a;
    }

    int p() {
        return this.f15928l;
    }

    int q() {
        return this.f15927k;
    }

    int r() {
        return this.f15926j;
    }

    float s() {
        return this.f15930n / this.f15918b.e();
    }

    j t() {
        return this.f15933q;
    }

    public String toString() {
        return z("");
    }

    k u() {
        return this.f15934r;
    }

    R3.b v() {
        return this.f15935s;
    }

    float w() {
        return this.f15929m;
    }

    l x() {
        return this.f15925i;
    }

    public boolean y() {
        return this.f15938v;
    }

    public String z(String str) {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(str);
        sb2.append(j());
        sb2.append("\n");
        e eVarT = this.f15918b.t(k());
        if (eVarT != null) {
            sb2.append("\t\tParents: ");
            sb2.append(eVarT.j());
            e eVarT2 = this.f15918b.t(eVarT.k());
            while (eVarT2 != null) {
                sb2.append("->");
                sb2.append(eVarT2.j());
                eVarT2 = this.f15918b.t(eVarT2.k());
            }
            sb2.append(str);
            sb2.append("\n");
        }
        if (!h().isEmpty()) {
            sb2.append(str);
            sb2.append("\tMasks: ");
            sb2.append(h().size());
            sb2.append("\n");
        }
        if (r() != 0 && q() != 0) {
            sb2.append(str);
            sb2.append("\tBackground: ");
            sb2.append(String.format(Locale.US, "%dx%d %X\n", Integer.valueOf(r()), Integer.valueOf(q()), Integer.valueOf(p())));
        }
        if (!this.f15917a.isEmpty()) {
            sb2.append(str);
            sb2.append("\tShapes:\n");
            for (S3.c cVar : this.f15917a) {
                sb2.append(str);
                sb2.append("\t\t");
                sb2.append(cVar);
                sb2.append("\n");
            }
        }
        return sb2.toString();
    }
}
