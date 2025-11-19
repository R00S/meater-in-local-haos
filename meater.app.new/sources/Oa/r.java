package Oa;

import qb.b;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes3.dex */
public final class r {

    /* renamed from: D, reason: collision with root package name */
    public static final r f13494D;

    /* renamed from: E, reason: collision with root package name */
    public static final r f13495E;

    /* renamed from: F, reason: collision with root package name */
    public static final r f13496F;

    /* renamed from: G, reason: collision with root package name */
    public static final r f13497G;

    /* renamed from: H, reason: collision with root package name */
    private static final /* synthetic */ r[] f13498H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f13499I;

    /* renamed from: B, reason: collision with root package name */
    private final qb.b f13500B;

    /* renamed from: C, reason: collision with root package name */
    private final qb.f f13501C;

    static {
        b.a aVar = qb.b.f48178d;
        f13494D = new r("UBYTEARRAY", 0, b.a.b(aVar, "kotlin/UByteArray", false, 2, null));
        f13495E = new r("USHORTARRAY", 1, b.a.b(aVar, "kotlin/UShortArray", false, 2, null));
        f13496F = new r("UINTARRAY", 2, b.a.b(aVar, "kotlin/UIntArray", false, 2, null));
        f13497G = new r("ULONGARRAY", 3, b.a.b(aVar, "kotlin/ULongArray", false, 2, null));
        r[] rVarArrC = c();
        f13498H = rVarArrC;
        f13499I = C4929b.a(rVarArrC);
    }

    private r(String str, int i10, qb.b bVar) {
        this.f13500B = bVar;
        this.f13501C = bVar.h();
    }

    private static final /* synthetic */ r[] c() {
        return new r[]{f13494D, f13495E, f13496F, f13497G};
    }

    public static r valueOf(String str) {
        return (r) Enum.valueOf(r.class, str);
    }

    public static r[] values() {
        return (r[]) f13498H.clone();
    }

    public final qb.f j() {
        return this.f13501C;
    }
}
