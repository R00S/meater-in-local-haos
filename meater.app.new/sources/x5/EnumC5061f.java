package x5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: RecipeLocale.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000e\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lx5/f;", "", "", "diff", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "B", "Ljava/lang/String;", "getDiff", "()Ljava/lang/String;", "C", "a", "D", "E", "F", "G", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x5.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5061f {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC5061f f52856D = new EnumC5061f("System", 0, "System");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC5061f f52857E = new EnumC5061f("en_GB", 1, "en_GB (English)");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC5061f f52858F = new EnumC5061f("en_US", 2, "en_US (English)");

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC5061f f52859G = new EnumC5061f("de_DE", 3, "de_DE (German)");

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ EnumC5061f[] f52860H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52861I;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final String diff;

    static {
        EnumC5061f[] enumC5061fArrC = c();
        f52860H = enumC5061fArrC;
        f52861I = C4929b.a(enumC5061fArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC5061f(String str, int i10, String str2) {
        this.diff = str2;
    }

    private static final /* synthetic */ EnumC5061f[] c() {
        return new EnumC5061f[]{f52856D, f52857E, f52858F, f52859G};
    }

    public static EnumC5061f valueOf(String str) {
        return (EnumC5061f) Enum.valueOf(EnumC5061f.class, str);
    }

    public static EnumC5061f[] values() {
        return (EnumC5061f[]) f52860H.clone();
    }
}
