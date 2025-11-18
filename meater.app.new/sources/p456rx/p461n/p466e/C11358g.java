package p456rx.p461n.p466e;

/* compiled from: PlatformDependent.java */
/* renamed from: rx.n.e.g */
/* loaded from: classes3.dex */
public final class C11358g {

    /* renamed from: a */
    private static final int f42882a;

    /* renamed from: b */
    private static final boolean f42883b;

    static {
        int iM40435c = m40435c();
        f42882a = iM40435c;
        f42883b = iM40435c != 0;
    }

    /* renamed from: a */
    public static int m40433a() {
        return f42882a;
    }

    /* renamed from: b */
    public static boolean m40434b() {
        return f42883b;
    }

    /* renamed from: c */
    private static int m40435c() {
        try {
            return ((Integer) Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null)).intValue();
        } catch (Exception unused) {
            return 0;
        }
    }
}
