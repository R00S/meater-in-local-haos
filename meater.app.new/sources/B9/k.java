package B9;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: StorageUnit.java */
/* loaded from: classes2.dex */
public abstract class k {

    /* renamed from: C, reason: collision with root package name */
    public static final k f1942C = new a("TERABYTES", 0, 1099511627776L);

    /* renamed from: D, reason: collision with root package name */
    public static final k f1943D = new k("GIGABYTES", 1, 1073741824) { // from class: B9.k.b
        {
            a aVar = null;
        }
    };

    /* renamed from: E, reason: collision with root package name */
    public static final k f1944E = new k("MEGABYTES", 2, 1048576) { // from class: B9.k.c
        {
            a aVar = null;
        }
    };

    /* renamed from: F, reason: collision with root package name */
    public static final k f1945F = new k("KILOBYTES", 3, 1024) { // from class: B9.k.d
        {
            a aVar = null;
        }
    };

    /* renamed from: G, reason: collision with root package name */
    public static final k f1946G = new k("BYTES", 4, 1) { // from class: B9.k.e
        {
            a aVar = null;
        }
    };

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ k[] f1947H = c();

    /* renamed from: B, reason: collision with root package name */
    long f1948B;

    /* compiled from: StorageUnit.java */
    enum a extends k {
        a(String str, int i10, long j10) {
            super(str, i10, j10, null);
        }
    }

    /* synthetic */ k(String str, int i10, long j10, a aVar) {
        this(str, i10, j10);
    }

    private static /* synthetic */ k[] c() {
        return new k[]{f1942C, f1943D, f1944E, f1945F, f1946G};
    }

    public static k valueOf(String str) {
        return (k) Enum.valueOf(k.class, str);
    }

    public static k[] values() {
        return (k[]) f1947H.clone();
    }

    public long j(long j10) {
        return (j10 * this.f1948B) / f1945F.f1948B;
    }

    private k(String str, int i10, long j10) {
        this.f1948B = j10;
    }
}
