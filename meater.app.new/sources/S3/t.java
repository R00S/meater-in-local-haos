package S3;

import N3.u;

/* compiled from: ShapeTrimPath.java */
/* loaded from: classes.dex */
public class t implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15446a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15447b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.b f15448c;

    /* renamed from: d, reason: collision with root package name */
    private final R3.b f15449d;

    /* renamed from: e, reason: collision with root package name */
    private final R3.b f15450e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15451f;

    /* compiled from: ShapeTrimPath.java */
    public enum a {
        SIMULTANEOUSLY,
        INDIVIDUALLY;

        public static a j(int i10) {
            if (i10 == 1) {
                return SIMULTANEOUSLY;
            }
            if (i10 == 2) {
                return INDIVIDUALLY;
            }
            throw new IllegalArgumentException("Unknown trim path type " + i10);
        }
    }

    public t(String str, a aVar, R3.b bVar, R3.b bVar2, R3.b bVar3, boolean z10) {
        this.f15446a = str;
        this.f15447b = aVar;
        this.f15448c = bVar;
        this.f15449d = bVar2;
        this.f15450e = bVar3;
        this.f15451f = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        return new u(bVar, this);
    }

    public R3.b b() {
        return this.f15449d;
    }

    public String c() {
        return this.f15446a;
    }

    public R3.b d() {
        return this.f15450e;
    }

    public R3.b e() {
        return this.f15448c;
    }

    public a f() {
        return this.f15447b;
    }

    public boolean g() {
        return this.f15451f;
    }

    public String toString() {
        return "Trim Path: {start: " + this.f15448c + ", end: " + this.f15449d + ", offset: " + this.f15450e + "}";
    }
}
