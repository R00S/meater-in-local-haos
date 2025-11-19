package ib;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* renamed from: ib.i, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3675i {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC3675i f43271B = new EnumC3675i("READ_ONLY", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC3675i f43272C = new EnumC3675i("MUTABLE", 1);

    /* renamed from: D, reason: collision with root package name */
    private static final /* synthetic */ EnumC3675i[] f43273D;

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f43274E;

    static {
        EnumC3675i[] enumC3675iArrC = c();
        f43273D = enumC3675iArrC;
        f43274E = C4929b.a(enumC3675iArrC);
    }

    private EnumC3675i(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3675i[] c() {
        return new EnumC3675i[]{f43271B, f43272C};
    }

    public static EnumC3675i valueOf(String str) {
        return (EnumC3675i) Enum.valueOf(EnumC3675i.class, str);
    }

    public static EnumC3675i[] values() {
        return (EnumC3675i[]) f43273D.clone();
    }
}
