package w8;

import java.util.concurrent.atomic.AtomicBoolean;
import java.util.logging.Logger;

/* compiled from: TinkFipsUtil.java */
/* renamed from: w8.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5009b {

    /* renamed from: a, reason: collision with root package name */
    private static final Logger f51983a = Logger.getLogger(C5009b.class.getName());

    /* renamed from: b, reason: collision with root package name */
    private static final AtomicBoolean f51984b = new AtomicBoolean(false);

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: TinkFipsUtil.java */
    /* renamed from: w8.b$b, reason: collision with other inner class name */
    public static abstract class EnumC0751b {

        /* renamed from: B, reason: collision with root package name */
        public static final EnumC0751b f51985B;

        /* renamed from: C, reason: collision with root package name */
        public static final EnumC0751b f51986C;

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ EnumC0751b[] f51987D;

        /* compiled from: TinkFipsUtil.java */
        /* renamed from: w8.b$b$a */
        enum a extends EnumC0751b {
            a(String str, int i10) {
                super(str, i10);
            }

            @Override // w8.C5009b.EnumC0751b
            public boolean c() {
                return !C5009b.c();
            }
        }

        /* compiled from: TinkFipsUtil.java */
        /* renamed from: w8.b$b$b, reason: collision with other inner class name */
        enum C0752b extends EnumC0751b {
            C0752b(String str, int i10) {
                super(str, i10);
            }

            @Override // w8.C5009b.EnumC0751b
            public boolean c() {
                return !C5009b.c() || C5009b.b();
            }
        }

        static {
            a aVar = new a("ALGORITHM_NOT_FIPS", 0);
            f51985B = aVar;
            C0752b c0752b = new C0752b("ALGORITHM_REQUIRES_BORINGCRYPTO", 1);
            f51986C = c0752b;
            f51987D = new EnumC0751b[]{aVar, c0752b};
        }

        private EnumC0751b(String str, int i10) {
        }

        public static EnumC0751b valueOf(String str) {
            return (EnumC0751b) Enum.valueOf(EnumC0751b.class, str);
        }

        public static EnumC0751b[] values() {
            return (EnumC0751b[]) f51987D.clone();
        }

        public abstract boolean c();
    }

    private C5009b() {
    }

    static Boolean a() {
        try {
            return (Boolean) Class.forName("org.conscrypt.Conscrypt").getMethod("isBoringSslFIPSBuild", null).invoke(null, null);
        } catch (Exception unused) {
            f51983a.info("Conscrypt is not available or does not support checking for FIPS build.");
            return Boolean.FALSE;
        }
    }

    public static boolean b() {
        return a().booleanValue();
    }

    public static boolean c() {
        return C5008a.a() || f51984b.get();
    }
}
