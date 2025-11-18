package Sa;

import Hb.AbstractC1082f0;
import Hb.Q0;
import Hb.U;
import Oa.p;
import Ra.H;
import kotlin.collections.M;
import kotlin.jvm.internal.C3862t;
import oa.C4170o;
import oa.v;
import vb.C4937a;
import vb.C4938b;
import vb.y;

/* compiled from: annotationUtil.kt */
/* loaded from: classes3.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    private static final qb.f f15625a;

    /* renamed from: b, reason: collision with root package name */
    private static final qb.f f15626b;

    /* renamed from: c, reason: collision with root package name */
    private static final qb.f f15627c;

    /* renamed from: d, reason: collision with root package name */
    private static final qb.f f15628d;

    /* renamed from: e, reason: collision with root package name */
    private static final qb.f f15629e;

    static {
        qb.f fVarT = qb.f.t("message");
        C3862t.f(fVarT, "identifier(...)");
        f15625a = fVarT;
        qb.f fVarT2 = qb.f.t("replaceWith");
        C3862t.f(fVarT2, "identifier(...)");
        f15626b = fVarT2;
        qb.f fVarT3 = qb.f.t("level");
        C3862t.f(fVarT3, "identifier(...)");
        f15627c = fVarT3;
        qb.f fVarT4 = qb.f.t("expression");
        C3862t.f(fVarT4, "identifier(...)");
        f15628d = fVarT4;
        qb.f fVarT5 = qb.f.t("imports");
        C3862t.f(fVarT5, "identifier(...)");
        f15629e = fVarT5;
    }

    public static final c b(Oa.j jVar, String message, String replaceWith, String level, boolean z10) {
        C3862t.g(jVar, "<this>");
        C3862t.g(message, "message");
        C3862t.g(replaceWith, "replaceWith");
        C3862t.g(level, "level");
        l lVar = new l(jVar, p.a.f13402B, M.k(v.a(f15628d, new y(replaceWith)), v.a(f15629e, new C4938b(kotlin.collections.r.m(), new f(jVar)))), false, 8, null);
        qb.c cVar = p.a.f13489y;
        C4170o c4170oA = v.a(f15625a, new y(message));
        C4170o c4170oA2 = v.a(f15626b, new C4937a(lVar));
        qb.f fVar = f15627c;
        qb.b bVarC = qb.b.f48178d.c(p.a.f13400A);
        qb.f fVarT = qb.f.t(level);
        C3862t.f(fVarT, "identifier(...)");
        return new l(jVar, cVar, M.k(c4170oA, c4170oA2, v.a(fVar, new vb.k(bVarC, fVarT))), z10);
    }

    public static /* synthetic */ c c(Oa.j jVar, String str, String str2, String str3, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            str2 = "";
        }
        if ((i10 & 4) != 0) {
            str3 = "WARNING";
        }
        if ((i10 & 8) != 0) {
            z10 = false;
        }
        return b(jVar, str, str2, str3, z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U d(Oa.j jVar, H module) {
        C3862t.g(module, "module");
        AbstractC1082f0 abstractC1082f0L = module.q().l(Q0.f5693F, jVar.W());
        C3862t.f(abstractC1082f0L, "getArrayType(...)");
        return abstractC1082f0L;
    }
}
