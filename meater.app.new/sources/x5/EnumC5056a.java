package x5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: BottomSheetType.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0081\u0002\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\fj\u0002\b\rj\u0002\b\u000e¨\u0006\u000f"}, d2 = {"Lx5/a;", "", "", "diff", "<init>", "(Ljava/lang/String;II)V", "B", "I", "getDiff", "()I", "C", "a", "D", "E", "F", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: x5.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC5056a {

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC5056a f52802D = new EnumC5056a("FULL_SCREEN", 0, 100);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC5056a f52803E = new EnumC5056a("FULL_SCREEN_WITH_PADDING_150", 1, 200);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC5056a f52804F = new EnumC5056a("WRAP_CONTENT", 2, 300);

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ EnumC5056a[] f52805G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52806H;

    /* renamed from: B, reason: collision with root package name and from kotlin metadata */
    private final int diff;

    static {
        EnumC5056a[] enumC5056aArrC = c();
        f52805G = enumC5056aArrC;
        f52806H = C4929b.a(enumC5056aArrC);
        INSTANCE = new Companion(null);
    }

    private EnumC5056a(String str, int i10, int i11) {
        this.diff = i11;
    }

    private static final /* synthetic */ EnumC5056a[] c() {
        return new EnumC5056a[]{f52802D, f52803E, f52804F};
    }

    public static EnumC5056a valueOf(String str) {
        return (EnumC5056a) Enum.valueOf(EnumC5056a.class, str);
    }

    public static EnumC5056a[] values() {
        return (EnumC5056a[]) f52805G.clone();
    }
}
