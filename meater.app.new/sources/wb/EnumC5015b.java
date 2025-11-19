package wb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: DeprecationInfo.kt */
/* renamed from: wb.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC5015b {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC5015b f52010B = new EnumC5015b("WARNING", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC5015b f52011C = new EnumC5015b("ERROR", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC5015b f52012D = new EnumC5015b("HIDDEN", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC5015b[] f52013E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f52014F;

    static {
        EnumC5015b[] enumC5015bArrC = c();
        f52013E = enumC5015bArrC;
        f52014F = C4929b.a(enumC5015bArrC);
    }

    private EnumC5015b(String str, int i10) {
    }

    private static final /* synthetic */ EnumC5015b[] c() {
        return new EnumC5015b[]{f52010B, f52011C, f52012D};
    }

    public static EnumC5015b valueOf(String str) {
        return (EnumC5015b) Enum.valueOf(EnumC5015b.class, str);
    }

    public static EnumC5015b[] values() {
        return (EnumC5015b[]) f52013E.clone();
    }
}
