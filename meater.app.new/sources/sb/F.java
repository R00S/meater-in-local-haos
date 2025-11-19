package sb;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes3.dex */
public abstract class F {

    /* renamed from: B, reason: collision with root package name */
    public static final F f49564B = new F("PLAIN", 0) { // from class: sb.F.b
        {
            C3854k c3854k = null;
        }

        @Override // sb.F
        public String j(String string) {
            C3862t.g(string, "string");
            return string;
        }
    };

    /* renamed from: C, reason: collision with root package name */
    public static final F f49565C = new F("HTML", 1) { // from class: sb.F.a
        {
            C3854k c3854k = null;
        }

        @Override // sb.F
        public String j(String string) {
            C3862t.g(string, "string");
            return Ub.n.C(Ub.n.C(string, "<", "&lt;", false, 4, null), ">", "&gt;", false, 4, null);
        }
    };

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ F[] f49566D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f49567E;

    static {
        F[] fArrC = c();
        f49566D = fArrC;
        f49567E = C4929b.a(fArrC);
    }

    public /* synthetic */ F(String str, int i10, C3854k c3854k) {
        this(str, i10);
    }

    private static final /* synthetic */ F[] c() {
        return new F[]{f49564B, f49565C};
    }

    public static F valueOf(String str) {
        return (F) Enum.valueOf(F.class, str);
    }

    public static F[] values() {
        return (F[]) f49566D.clone();
    }

    public abstract String j(String str);

    private F(String str, int i10) {
    }
}
