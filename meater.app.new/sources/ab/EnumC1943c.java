package ab;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: AnnotationQualifierApplicabilityType.kt */
/* renamed from: ab.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class EnumC1943c {

    /* renamed from: C, reason: collision with root package name */
    public static final EnumC1943c f20242C = new EnumC1943c("METHOD_RETURN_TYPE", 0, "METHOD");

    /* renamed from: D, reason: collision with root package name */
    public static final EnumC1943c f20243D = new EnumC1943c("VALUE_PARAMETER", 1, "PARAMETER");

    /* renamed from: E, reason: collision with root package name */
    public static final EnumC1943c f20244E = new EnumC1943c("FIELD", 2, "FIELD");

    /* renamed from: F, reason: collision with root package name */
    public static final EnumC1943c f20245F = new EnumC1943c("TYPE_USE", 3, "TYPE_USE");

    /* renamed from: G, reason: collision with root package name */
    public static final EnumC1943c f20246G = new EnumC1943c("TYPE_PARAMETER_BOUNDS", 4, "TYPE_USE");

    /* renamed from: H, reason: collision with root package name */
    public static final EnumC1943c f20247H = new EnumC1943c("TYPE_PARAMETER", 5, "TYPE_PARAMETER");

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ EnumC1943c[] f20248I;

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f20249J;

    /* renamed from: B, reason: collision with root package name */
    private final String f20250B;

    static {
        EnumC1943c[] enumC1943cArrC = c();
        f20248I = enumC1943cArrC;
        f20249J = C4929b.a(enumC1943cArrC);
    }

    private EnumC1943c(String str, int i10, String str2) {
        this.f20250B = str2;
    }

    private static final /* synthetic */ EnumC1943c[] c() {
        return new EnumC1943c[]{f20242C, f20243D, f20244E, f20245F, f20246G, f20247H};
    }

    public static EnumC1943c valueOf(String str) {
        return (EnumC1943c) Enum.valueOf(EnumC1943c.class, str);
    }

    public static EnumC1943c[] values() {
        return (EnumC1943c[]) f20248I.clone();
    }

    public final String j() {
        return this.f20250B;
    }
}
