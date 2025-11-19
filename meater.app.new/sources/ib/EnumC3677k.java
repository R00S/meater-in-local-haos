package ib;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: typeQualifiers.kt */
/* renamed from: ib.k, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC3677k {

    /* renamed from: B, reason: collision with root package name */
    public static final EnumC3677k f43277B = new EnumC3677k("FORCE_FLEXIBILITY", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC3677k f43278C = new EnumC3677k("NULLABLE", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC3677k f43279D = new EnumC3677k("NOT_NULL", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ EnumC3677k[] f43280E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f43281F;

    static {
        EnumC3677k[] enumC3677kArrC = c();
        f43280E = enumC3677kArrC;
        f43281F = C4929b.a(enumC3677kArrC);
    }

    private EnumC3677k(String str, int i10) {
    }

    private static final /* synthetic */ EnumC3677k[] c() {
        return new EnumC3677k[]{f43277B, f43278C, f43279D};
    }

    public static EnumC3677k valueOf(String str) {
        return (EnumC3677k) Enum.valueOf(EnumC3677k.class, str);
    }

    public static EnumC3677k[] values() {
        return (EnumC3677k[]) f43280E.clone();
    }
}
