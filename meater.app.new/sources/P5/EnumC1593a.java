package P5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WindowStateUtils.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\r¨\u0006\u000e"}, d2 = {"LP5/a;", "", "", "value", "<init>", "(Ljava/lang/String;II)V", "B", "I", "getValue", "()I", "C", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1593a {

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC1593a f14014C = new EnumC1593a("SMALL", 0, 0);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC1593a f14015D = new EnumC1593a("NORMAL", 1, 1);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC1593a f14016E = new EnumC1593a("LARGE", 2, 2);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC1593a f14017F = new EnumC1593a("EXTRA_LARGE", 3, 3);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC1593a[] f14018G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f14019H;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int value;

    static {
        EnumC1593a[] enumC1593aArrC = c();
        f14018G = enumC1593aArrC;
        f14019H = C4929b.a(enumC1593aArrC);
    }

    private EnumC1593a(String str, int i10, int i11) {
        this.value = i11;
    }

    private static final /* synthetic */ EnumC1593a[] c() {
        return new EnumC1593a[]{f14014C, f14015D, f14016E, f14017F};
    }

    public static EnumC1593a valueOf(String str) {
        return (EnumC1593a) Enum.valueOf(EnumC1593a.class, str);
    }

    public static EnumC1593a[] values() {
        return (EnumC1593a[]) f14018G.clone();
    }
}
