package S3;

/* compiled from: MergePaths.java */
/* loaded from: classes.dex */
public class j implements c {

    /* renamed from: a, reason: collision with root package name */
    private final String f15374a;

    /* renamed from: b, reason: collision with root package name */
    private final a f15375b;

    /* renamed from: c, reason: collision with root package name */
    private final boolean f15376c;

    /* compiled from: MergePaths.java */
    public enum a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        public static a j(int i10) {
            return i10 != 1 ? i10 != 2 ? i10 != 3 ? i10 != 4 ? i10 != 5 ? MERGE : EXCLUDE_INTERSECTIONS : INTERSECT : SUBTRACT : ADD : MERGE;
        }
    }

    public j(String str, a aVar, boolean z10) {
        this.f15374a = str;
        this.f15375b = aVar;
        this.f15376c = z10;
    }

    @Override // S3.c
    public N3.c a(com.airbnb.lottie.n nVar, L3.i iVar, T3.b bVar) {
        if (nVar.z()) {
            return new N3.l(this);
        }
        X3.d.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public a b() {
        return this.f15375b;
    }

    public String c() {
        return this.f15374a;
    }

    public boolean d() {
        return this.f15376c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f15375b + '}';
    }
}
