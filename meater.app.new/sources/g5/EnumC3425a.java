package g5;

import java.util.NoSuchElementException;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: MEATERProductSelection.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lg5/a;", "", "", "type", "<init>", "(Ljava/lang/String;II)V", "B", "I", "j", "()I", "C", "a", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: g5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC3425a {

    /* renamed from: C, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE;

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3425a f41889D = new EnumC3425a("ONE_PROBE", 0, 401);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC3425a f41890E = new EnumC3425a("TWO_PROBE", 1, 402);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC3425a f41891F = new EnumC3425a("FOUR_PROBE", 2, 404);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC3425a[] f41892G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f41893H;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int type;

    /* compiled from: MEATERProductSelection.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lg5/a$a;", "", "<init>", "()V", "", "type", "Lg5/a;", "a", "(I)Lg5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: g5.a$a, reason: collision with other inner class name and from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final EnumC3425a a(int type) {
            for (EnumC3425a enumC3425a : EnumC3425a.values()) {
                if (enumC3425a.getType() == type) {
                    return enumC3425a;
                }
            }
            throw new NoSuchElementException("Array contains no element matching the predicate.");
        }

        private Companion() {
        }
    }

    static {
        EnumC3425a[] enumC3425aArrC = c();
        f41892G = enumC3425aArrC;
        f41893H = C4929b.a(enumC3425aArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC3425a(String str, int i10, int i11) {
        this.type = i11;
    }

    private static final /* synthetic */ EnumC3425a[] c() {
        return new EnumC3425a[]{f41889D, f41890E, f41891F};
    }

    public static EnumC3425a valueOf(String str) {
        return (EnumC3425a) Enum.valueOf(EnumC3425a.class, str);
    }

    public static EnumC3425a[] values() {
        return (EnumC3425a[]) f41892G.clone();
    }

    /* renamed from: j, reason: from getter */
    public final int getType() {
        return this.type;
    }
}
