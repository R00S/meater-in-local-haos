package P5;

import kotlin.Metadata;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: WindowStateUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\n¨\u0006\u000b"}, d2 = {"LP5/h;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "D", "E", "F", "G", "H", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: P5.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class EnumC1600h {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC1600h f14039B = new EnumC1600h("PHONE_VIEW", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC1600h f14040C = new EnumC1600h("TABLET_LARGE_PORTRAIT", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC1600h f14041D = new EnumC1600h("TABLET_SMALL_PORTRAIT", 2);

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC1600h f14042E = new EnumC1600h("TABLET_LARGE_LANDSCAPE", 3);

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC1600h f14043F = new EnumC1600h("TABLET_SMALL_LANDSCAPE", 4);

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC1600h f14044G = new EnumC1600h("FOLDABLE_UNFOLD", 5);

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC1600h f14045H = new EnumC1600h("FOLDABLE_FOLD", 6);

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ EnumC1600h[] f14046I;

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f14047J;

    static {
        EnumC1600h[] enumC1600hArrC = c();
        f14046I = enumC1600hArrC;
        f14047J = C4929b.a(enumC1600hArrC);
    }

    private EnumC1600h(String str, int i10) {
    }

    private static final /* synthetic */ EnumC1600h[] c() {
        return new EnumC1600h[]{f14039B, f14040C, f14041D, f14042E, f14043F, f14044G, f14045H};
    }

    public static EnumC1600h valueOf(String str) {
        return (EnumC1600h) Enum.valueOf(EnumC1600h.class, str);
    }

    public static EnumC1600h[] values() {
        return (EnumC1600h[]) f14046I.clone();
    }
}
