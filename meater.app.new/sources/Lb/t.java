package Lb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes3.dex */
public final class t {

    /* renamed from: C, reason: collision with root package name */
    public static final t f11310C = new t("IN", 0, "in");

    /* renamed from: D, reason: collision with root package name */
    public static final t f11311D = new t("OUT", 1, "out");

    /* renamed from: E, reason: collision with root package name */
    public static final t f11312E = new t("INV", 2, "");

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ t[] f11313F;

    /* renamed from: G, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f11314G;

    /* renamed from: B, reason: collision with root package name */
    private final String f11315B;

    static {
        t[] tVarArrC = c();
        f11313F = tVarArrC;
        f11314G = C4929b.a(tVarArrC);
    }

    private t(String str, int i10, String str2) {
        this.f11315B = str2;
    }

    private static final /* synthetic */ t[] c() {
        return new t[]{f11310C, f11311D, f11312E};
    }

    public static t valueOf(String str) {
        return (t) Enum.valueOf(t.class, str);
    }

    public static t[] values() {
        return (t[]) f11313F.clone();
    }

    @Override // java.lang.Enum
    public String toString() {
        return this.f11315B;
    }
}
