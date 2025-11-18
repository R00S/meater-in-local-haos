package Oa;

import kotlin.jvm.internal.C3862t;
import qb.b;
import va.C4929b;
import va.InterfaceC4928a;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: UnsignedType.kt */
/* loaded from: classes3.dex */
public final class s {

    /* renamed from: E, reason: collision with root package name */
    public static final s f13502E;

    /* renamed from: F, reason: collision with root package name */
    public static final s f13503F;

    /* renamed from: G, reason: collision with root package name */
    public static final s f13504G;

    /* renamed from: H, reason: collision with root package name */
    public static final s f13505H;

    /* renamed from: I, reason: collision with root package name */
    private static final /* synthetic */ s[] f13506I;

    /* renamed from: J, reason: collision with root package name */
    private static final /* synthetic */ InterfaceC4928a f13507J;

    /* renamed from: B, reason: collision with root package name */
    private final qb.b f13508B;

    /* renamed from: C, reason: collision with root package name */
    private final qb.f f13509C;

    /* renamed from: D, reason: collision with root package name */
    private final qb.b f13510D;

    static {
        b.a aVar = qb.b.f48178d;
        f13502E = new s("UBYTE", 0, b.a.b(aVar, "kotlin/UByte", false, 2, null));
        f13503F = new s("USHORT", 1, b.a.b(aVar, "kotlin/UShort", false, 2, null));
        f13504G = new s("UINT", 2, b.a.b(aVar, "kotlin/UInt", false, 2, null));
        f13505H = new s("ULONG", 3, b.a.b(aVar, "kotlin/ULong", false, 2, null));
        s[] sVarArrC = c();
        f13506I = sVarArrC;
        f13507J = C4929b.a(sVarArrC);
    }

    private s(String str, int i10, qb.b bVar) {
        this.f13508B = bVar;
        qb.f fVarH = bVar.h();
        this.f13509C = fVarH;
        qb.c cVarF = bVar.f();
        qb.f fVarT = qb.f.t(fVarH.j() + "Array");
        C3862t.f(fVarT, "identifier(...)");
        this.f13510D = new qb.b(cVarF, fVarT);
    }

    private static final /* synthetic */ s[] c() {
        return new s[]{f13502E, f13503F, f13504G, f13505H};
    }

    public static s valueOf(String str) {
        return (s) Enum.valueOf(s.class, str);
    }

    public static s[] values() {
        return (s[]) f13506I.clone();
    }

    public final qb.b j() {
        return this.f13510D;
    }

    public final qb.b n() {
        return this.f13508B;
    }

    public final qb.f p() {
        return this.f13509C;
    }
}
