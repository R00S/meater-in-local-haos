package V3;

import W3.c;

/* compiled from: DropShadowEffectParser.java */
/* renamed from: V3.k, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1797k {

    /* renamed from: f, reason: collision with root package name */
    private static final c.a f18046f = c.a.a("ef");

    /* renamed from: g, reason: collision with root package name */
    private static final c.a f18047g = c.a.a("nm", "v");

    /* renamed from: a, reason: collision with root package name */
    private R3.a f18048a;

    /* renamed from: b, reason: collision with root package name */
    private R3.b f18049b;

    /* renamed from: c, reason: collision with root package name */
    private R3.b f18050c;

    /* renamed from: d, reason: collision with root package name */
    private R3.b f18051d;

    /* renamed from: e, reason: collision with root package name */
    private R3.b f18052e;

    private void a(W3.c cVar, L3.i iVar) {
        cVar.c();
        String strM = "";
        while (cVar.f()) {
            int iQ = cVar.q(f18047g);
            if (iQ == 0) {
                strM = cVar.m();
            } else if (iQ == 1) {
                strM.hashCode();
                switch (strM) {
                    case "Distance":
                        this.f18051d = C1790d.e(cVar, iVar);
                        break;
                    case "Opacity":
                        this.f18049b = C1790d.f(cVar, iVar, false);
                        break;
                    case "Direction":
                        this.f18050c = C1790d.f(cVar, iVar, false);
                        break;
                    case "Shadow Color":
                        this.f18048a = C1790d.c(cVar, iVar);
                        break;
                    case "Softness":
                        this.f18052e = C1790d.e(cVar, iVar);
                        break;
                    default:
                        cVar.t();
                        break;
                }
            } else {
                cVar.s();
                cVar.t();
            }
        }
        cVar.e();
    }

    C1796j b(W3.c cVar, L3.i iVar) {
        R3.b bVar;
        R3.b bVar2;
        R3.b bVar3;
        R3.b bVar4;
        while (cVar.f()) {
            if (cVar.q(f18046f) != 0) {
                cVar.s();
                cVar.t();
            } else {
                cVar.b();
                while (cVar.f()) {
                    a(cVar, iVar);
                }
                cVar.d();
            }
        }
        R3.a aVar = this.f18048a;
        if (aVar == null || (bVar = this.f18049b) == null || (bVar2 = this.f18050c) == null || (bVar3 = this.f18051d) == null || (bVar4 = this.f18052e) == null) {
            return null;
        }
        return new C1796j(aVar, bVar, bVar2, bVar3, bVar4);
    }
}
