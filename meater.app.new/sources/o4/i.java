package o4;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: OnCompleteActionType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"Lo4/i;", "", "", "diff", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "j", "()Ljava/lang/String;", "C", "a", "D", "E", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final i f46446D = new i("UNKNOWN", 0, "");

    /* renamed from: E, reason: collision with root package name */
    public static final i f46447E = new i("SEND_MESSAGE", 1, "send_message");

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ i[] f46448F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f46449G;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String diff;

    /* compiled from: OnCompleteActionType.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lo4/i$a;", "", "<init>", "()V", "", "diff", "Lo4/i;", "a", "(Ljava/lang/String;)Lo4/i;", "domain_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: o4.i$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final i a(String diff) {
            C3862t.g(diff, "diff");
            for (i iVar : i.values()) {
                if (C3862t.b(iVar.getDiff(), diff)) {
                    return iVar;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        i[] iVarArrC = c();
        f46448F = iVarArrC;
        f46449G = C4929b.a(iVarArrC);
        INSTANCE = new Companion(null);
    }

    private i(String str, int i10, String str2) {
        this.diff = str2;
    }

    private static final /* synthetic */ i[] c() {
        return new i[]{f46446D, f46447E};
    }

    public static i valueOf(String str) {
        return (i) Enum.valueOf(i.class, str);
    }

    public static i[] values() {
        return (i[]) f46448F.clone();
    }

    /* renamed from: j, reason: from getter */
    public final String getDiff() {
        return this.diff;
    }
}
