package hb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: javaElements.kt */
/* renamed from: hb.D, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3507D {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC3507D f42371B = new EnumC3507D("SOURCE", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC3507D f42372C = new EnumC3507D("BINARY", 1);

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ EnumC3507D[] f42373D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f42374E;

    static {
        EnumC3507D[] enumC3507DArrC = c();
        f42373D = enumC3507DArrC;
        f42374E = C4929b.a(enumC3507DArrC);
    }

    private EnumC3507D(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3507D[] c() {
        return new EnumC3507D[]{f42371B, f42372C};
    }

    public static EnumC3507D valueOf(String str) {
        return (EnumC3507D) Enum.valueOf(EnumC3507D.class, str);
    }

    public static EnumC3507D[] values() {
        return (EnumC3507D[]) f42373D.clone();
    }
}
