package x2;

import X1.y;
import m8.AbstractC4009y;
import m8.j0;

/* compiled from: ListChunk.java */
/* loaded from: classes.dex */
final class f implements InterfaceC5052a {

    /* renamed from: a, reason: collision with root package name */
    public final AbstractC4009y<InterfaceC5052a> f52593a;

    /* renamed from: b, reason: collision with root package name */
    private final int f52594b;

    private f(int i10, AbstractC4009y<InterfaceC5052a> abstractC4009y) {
        this.f52594b = i10;
        this.f52593a = abstractC4009y;
    }

    private static InterfaceC5052a b(int i10, int i11, y yVar) {
        switch (i10) {
            case 1718776947:
                return g.e(i11, yVar);
            case 1751742049:
                return c.c(yVar);
            case 1752331379:
                return d.d(yVar);
            case 1852994675:
                return h.b(yVar);
            default:
                return null;
        }
    }

    public static f d(int i10, y yVar) {
        AbstractC4009y.a aVar = new AbstractC4009y.a();
        int iG = yVar.g();
        int iC = -2;
        while (yVar.a() > 8) {
            int iU = yVar.u();
            int iF = yVar.f() + yVar.u();
            yVar.V(iF);
            InterfaceC5052a interfaceC5052aD = iU == 1414744396 ? d(yVar.u(), yVar) : b(iU, iC, yVar);
            if (interfaceC5052aD != null) {
                if (interfaceC5052aD.a() == 1752331379) {
                    iC = ((d) interfaceC5052aD).c();
                }
                aVar.a(interfaceC5052aD);
            }
            yVar.W(iF);
            yVar.V(iG);
        }
        return new f(i10, aVar.k());
    }

    @Override // x2.InterfaceC5052a
    public int a() {
        return this.f52594b;
    }

    public <T extends InterfaceC5052a> T c(Class<T> cls) {
        j0<InterfaceC5052a> it = this.f52593a.iterator();
        while (it.hasNext()) {
            T t10 = (T) it.next();
            if (t10.getClass() == cls) {
                return t10;
            }
        }
        return null;
    }
}
