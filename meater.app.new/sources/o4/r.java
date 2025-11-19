package o4;

import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecipeAppliance.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014¨\u0006\u0015"}, d2 = {"Lo4/r;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "n", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "H", "I", "J", "K", "L", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class r {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final r f46513D = new r("NONE", 0, "none");

    /* renamed from: E, reason: collision with root package name */
    public static final r f46514E = new r("OVEN", 1, "oven");

    /* renamed from: F, reason: collision with root package name */
    public static final r f46515F = new r("CHARCOAL_GRILL", 2, "charcoal_grill");

    /* renamed from: G, reason: collision with root package name */
    public static final r f46516G = new r("GAS_GRILL", 3, "gas_grill");

    /* renamed from: H, reason: collision with root package name */
    public static final r f46517H = new r("SMOKER", 4, "smoker");

    /* renamed from: I, reason: collision with root package name */
    public static final r f46518I = new r("AIR_FRYER", 5, "air_fryer");

    /* renamed from: J, reason: collision with root package name */
    public static final r f46519J = new r("DEEP_FRYER", 6, "deep_fryer");

    /* renamed from: K, reason: collision with root package name */
    public static final r f46520K = new r("HOB", 7, "hob");

    /* renamed from: L, reason: collision with root package name */
    public static final r f46521L = new r("OTHER", 8, "other");

    /* renamed from: M, reason: collision with root package name */
    private static final /* synthetic */ r[] f46522M;

    /* renamed from: N, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46523N;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* compiled from: RecipeAppliance.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/r$a;", "", "<init>", "()V", "", "value", "Lo4/r;", "a", "(Ljava/lang/String;)Lo4/r;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o4.r$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final r a(String value) {
            C3862t.g(value, "value");
            InterfaceC4928a<r> interfaceC4928aJ = r.j();
            int i10 = 0;
            if (interfaceC4928aJ == null || !interfaceC4928aJ.isEmpty()) {
                Iterator<r> it = interfaceC4928aJ.iterator();
                while (it.hasNext()) {
                    if (C3862t.b(it.next().getValue(), value) && (i10 = i10 + 1) < 0) {
                        kotlin.collections.r.v();
                    }
                }
            }
            if (i10 <= 0) {
                return r.f46513D;
            }
            for (r rVar : r.j()) {
                if (C3862t.b(rVar.getValue(), value)) {
                    return rVar;
                }
            }
            throw new NoSuchElementException("Collection contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        r[] rVarArrC = c();
        f46522M = rVarArrC;
        f46523N = C4929b.a(rVarArrC);
        INSTANCE = new Companion(null);
    }

    private r(String str, int i10, String str2) {
        this.value = str2;
    }

    private static final /* synthetic */ r[] c() {
        return new r[]{f46513D, f46514E, f46515F, f46516G, f46517H, f46518I, f46519J, f46520K, f46521L};
    }

    public static InterfaceC4928a<r> j() {
        return f46523N;
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f46522M.clone();
    }

    /* renamed from: n, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
