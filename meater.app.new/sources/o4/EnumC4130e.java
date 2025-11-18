package o4;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: Difficulty.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lo4/e;", "", "", "diff", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: o4.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class EnumC4130e {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC4130e f46433D = new EnumC4130e("UNKNOWN", 0, "unknown");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC4130e f46434E = new EnumC4130e("EASY", 1, "easy");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC4130e f46435F = new EnumC4130e("MEDIUM", 2, "medium");

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC4130e f46436G = new EnumC4130e("HARD", 3, "hard");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ EnumC4130e[] f46437H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46438I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String diff;

    /* compiled from: Difficulty.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/e$a;", "", "<init>", "()V", "", "diff", "Lo4/e;", "a", "(Ljava/lang/String;)Lo4/e;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o4.e$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final EnumC4130e a(String diff) {
            C3862t.g(diff, "diff");
            for (EnumC4130e enumC4130e : EnumC4130e.values()) {
                if (C3862t.b(enumC4130e.getDiff(), diff)) {
                    return enumC4130e;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        EnumC4130e[] enumC4130eArrC = c();
        f46437H = enumC4130eArrC;
        f46438I = C4929b.a(enumC4130eArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC4130e(String str, int i10, String str2) {
        this.diff = str2;
    }

    private static final /* synthetic */ EnumC4130e[] c() {
        return new EnumC4130e[]{f46433D, f46434E, f46435F, f46436G};
    }

    public static EnumC4130e valueOf(String str) {
        return (EnumC4130e) Enum.valueOf(EnumC4130e.class, str);
    }

    public static EnumC4130e[] values() {
        return (EnumC4130e[]) f46437H.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getDiff() {
        return this.diff;
    }
}
