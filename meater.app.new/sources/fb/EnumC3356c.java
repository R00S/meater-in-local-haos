package fb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: JavaTypeFlexibility.kt */
/* renamed from: fb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3356c {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC3356c f41426B = new EnumC3356c("INFLEXIBLE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC3356c f41427C = new EnumC3356c("FLEXIBLE_UPPER_BOUND", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3356c f41428D = new EnumC3356c("FLEXIBLE_LOWER_BOUND", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC3356c[] f41429E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f41430F;

    static {
        EnumC3356c[] enumC3356cArrC = c();
        f41429E = enumC3356cArrC;
        f41430F = C4929b.a(enumC3356cArrC);
    }

    private EnumC3356c(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3356c[] c() {
        return new EnumC3356c[]{f41426B, f41427C, f41428D};
    }

    public static EnumC3356c valueOf(String str) {
        return (EnumC3356c) Enum.valueOf(EnumC3356c.class, str);
    }

    public static EnumC3356c[] values() {
        return (EnumC3356c[]) f41429E.clone();
    }
}
