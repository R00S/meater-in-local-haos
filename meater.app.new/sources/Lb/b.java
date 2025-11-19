package Lb;

import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: TypeSystemContext.kt */
/* loaded from: classes3.dex */
public final class b {

    /* renamed from: B, reason: collision with root package name */
    public static final b f11304B = new b("FOR_SUBTYPING", 0);

    /* renamed from: C, reason: collision with root package name */
    public static final b f11305C = new b("FOR_INCORPORATION", 1);

    /* renamed from: D, reason: collision with root package name */
    public static final b f11306D = new b("FROM_EXPRESSION", 2);

    /* renamed from: E, reason: collision with root package name */
    private static final /* synthetic */ b[] f11307E;

    /* renamed from: F, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f11308F;

    static {
        b[] bVarArrC = c();
        f11307E = bVarArrC;
        f11308F = C4929b.a(bVarArrC);
    }

    private b(String str, int i10) {
    }

    private static final /* synthetic */ b[] c() {
        return new b[]{f11304B, f11305C, f11306D};
    }

    public static b valueOf(String str) {
        return (b) Enum.valueOf(b.class, str);
    }

    public static b[] values() {
        return (b[]) f11307E.clone();
    }
}
