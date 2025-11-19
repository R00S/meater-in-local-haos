package kb;

import Ha.g;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.C3831l;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import pb.e;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: KotlinClassHeader.kt */
/* renamed from: kb.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3816a {

    /* renamed from: a, reason: collision with root package name */
    private final EnumC0573a f43836a;

    /* renamed from: b, reason: collision with root package name */
    private final e f43837b;

    /* renamed from: c, reason: collision with root package name */
    private final String[] f43838c;

    /* renamed from: d, reason: collision with root package name */
    private final String[] f43839d;

    /* renamed from: e, reason: collision with root package name */
    private final String[] f43840e;

    /* renamed from: f, reason: collision with root package name */
    private final String f43841f;

    /* renamed from: g, reason: collision with root package name */
    private final int f43842g;

    /* renamed from: h, reason: collision with root package name */
    private final String f43843h;

    /* renamed from: i, reason: collision with root package name */
    private final byte[] f43844i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: KotlinClassHeader.kt */
    /* renamed from: kb.a$a, reason: collision with other inner class name */
    public static final class EnumC0573a {

        /* renamed from: C, reason: collision with root package name */
        public static final C0574a f43845C;

        /* renamed from: D, reason: collision with root package name */
        private static final Map<Integer, EnumC0573a> f43846D;

        /* renamed from: E, reason: collision with root package name */
        public static final EnumC0573a f43847E = new EnumC0573a("UNKNOWN", 0, 0);

        /* renamed from: F, reason: collision with root package name */
        public static final EnumC0573a f43848F = new EnumC0573a("CLASS", 1, 1);

        /* renamed from: G, reason: collision with root package name */
        public static final EnumC0573a f43849G = new EnumC0573a("FILE_FACADE", 2, 2);

        /* renamed from: H, reason: collision with root package name */
        public static final EnumC0573a f43850H = new EnumC0573a("SYNTHETIC_CLASS", 3, 3);

        /* renamed from: I, reason: collision with root package name */
        public static final EnumC0573a f43851I = new EnumC0573a("MULTIFILE_CLASS", 4, 4);

        /* renamed from: J, reason: collision with root package name */
        public static final EnumC0573a f43852J = new EnumC0573a("MULTIFILE_CLASS_PART", 5, 5);

        /* renamed from: K, reason: collision with root package name */
        private static final /* synthetic */ EnumC0573a[] f43853K;

        /* renamed from: L, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f43854L;

        /* renamed from: B, reason: collision with root package name */
        private final int f43855B;

        /* compiled from: KotlinClassHeader.kt */
        /* renamed from: kb.a$a$a, reason: collision with other inner class name */
        public static final class C0574a {
            public /* synthetic */ C0574a(C3854k c3854k) {
                this();
            }

            public final EnumC0573a a(int i10) {
                EnumC0573a enumC0573a = (EnumC0573a) EnumC0573a.f43846D.get(Integer.valueOf(i10));
                return enumC0573a == null ? EnumC0573a.f43847E : enumC0573a;
            }

            private C0574a() {
            }
        }

        static {
            EnumC0573a[] enumC0573aArrC = c();
            f43853K = enumC0573aArrC;
            f43854L = C4929b.a(enumC0573aArrC);
            f43845C = new C0574a(null);
            EnumC0573a[] enumC0573aArrValues = values();
            LinkedHashMap linkedHashMap = new LinkedHashMap(g.d(M.d(enumC0573aArrValues.length), 16));
            for (EnumC0573a enumC0573a : enumC0573aArrValues) {
                linkedHashMap.put(Integer.valueOf(enumC0573a.f43855B), enumC0573a);
            }
            f43846D = linkedHashMap;
        }

        private EnumC0573a(String str, int i10, int i11) {
            this.f43855B = i11;
        }

        private static final /* synthetic */ EnumC0573a[] c() {
            return new EnumC0573a[]{f43847E, f43848F, f43849G, f43850H, f43851I, f43852J};
        }

        public static final EnumC0573a n(int i10) {
            return f43845C.a(i10);
        }

        public static EnumC0573a valueOf(String str) {
            return (EnumC0573a) Enum.valueOf(EnumC0573a.class, str);
        }

        public static EnumC0573a[] values() {
            return (EnumC0573a[]) f43853K.clone();
        }
    }

    public C3816a(EnumC0573a kind, e metadataVersion, String[] strArr, String[] strArr2, String[] strArr3, String str, int i10, String str2, byte[] bArr) {
        C3862t.g(kind, "kind");
        C3862t.g(metadataVersion, "metadataVersion");
        this.f43836a = kind;
        this.f43837b = metadataVersion;
        this.f43838c = strArr;
        this.f43839d = strArr2;
        this.f43840e = strArr3;
        this.f43841f = str;
        this.f43842g = i10;
        this.f43843h = str2;
        this.f43844i = bArr;
    }

    private final boolean h(int i10, int i11) {
        return (i10 & i11) != 0;
    }

    public final String[] a() {
        return this.f43838c;
    }

    public final String[] b() {
        return this.f43839d;
    }

    public final EnumC0573a c() {
        return this.f43836a;
    }

    public final e d() {
        return this.f43837b;
    }

    public final String e() {
        String str = this.f43841f;
        if (this.f43836a == EnumC0573a.f43852J) {
            return str;
        }
        return null;
    }

    public final List<String> f() {
        String[] strArr = this.f43838c;
        if (this.f43836a != EnumC0573a.f43851I) {
            strArr = null;
        }
        List<String> listE = strArr != null ? C3831l.e(strArr) : null;
        return listE == null ? r.m() : listE;
    }

    public final String[] g() {
        return this.f43840e;
    }

    public final boolean i() {
        return h(this.f43842g, 2);
    }

    public final boolean j() {
        return h(this.f43842g, 16) && !h(this.f43842g, 32);
    }

    public String toString() {
        return this.f43836a + " version=" + this.f43837b;
    }
}
