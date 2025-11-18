package S3;

/* compiled from: Mask.java */
/* loaded from: classes.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    private final a f15365a;

    /* renamed from: b, reason: collision with root package name */
    private final R3.h f15366b;

    /* renamed from: c, reason: collision with root package name */
    private final R3.d f15367c;

    /* renamed from: d, reason: collision with root package name */
    private final boolean f15368d;

    /* compiled from: Mask.java */
    public enum a {
        MASK_MODE_ADD,
        MASK_MODE_SUBTRACT,
        MASK_MODE_INTERSECT,
        MASK_MODE_NONE
    }

    public i(a aVar, R3.h hVar, R3.d dVar, boolean z10) {
        this.f15365a = aVar;
        this.f15366b = hVar;
        this.f15367c = dVar;
        this.f15368d = z10;
    }

    public a a() {
        return this.f15365a;
    }

    public R3.h b() {
        return this.f15366b;
    }

    public R3.d c() {
        return this.f15367c;
    }

    public boolean d() {
        return this.f15368d;
    }
}
