package o4;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecipeAlertType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lo4/p;", "", "", "value", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final p f46487D = new p("UNKNOWN", 0, "");

    /* renamed from: E, reason: collision with root package name */
    public static final p f46488E = new p("TIME_ELAPSED", 1, "time_elapsed");

    /* renamed from: F, reason: collision with root package name */
    public static final p f46489F = new p("INTERNAL_TEMP_RAISES_ABOVE", 2, "internal_temp_rises_above");

    /* renamed from: G, reason: collision with root package name */
    public static final p f46490G = new p("TIME_REPEATING", 3, "time_repeating");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ p[] f46491H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46492I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String value;

    /* compiled from: RecipeAlertType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/p$a;", "", "<init>", "()V", "", "value", "Lo4/p;", "a", "(Ljava/lang/String;)Lo4/p;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o4.p$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final p a(String value) {
            C3862t.g(value, "value");
            for (p pVar : p.values()) {
                if (C3862t.b(pVar.getValue(), value)) {
                    return pVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        p[] pVarArrC = c();
        f46491H = pVarArrC;
        f46492I = C4929b.a(pVarArrC);
        INSTANCE = new Companion(null);
    }

    private p(String str, int i10, String str2) {
        this.value = str2;
    }

    private static final /* synthetic */ p[] c() {
        return new p[]{f46487D, f46488E, f46489F, f46490G};
    }

    public static p valueOf(String str) {
        return (p) Enum.valueOf(p.class, str);
    }

    public static p[] values() {
        return (p[]) f46491H.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getValue() {
        return this.value;
    }
}
