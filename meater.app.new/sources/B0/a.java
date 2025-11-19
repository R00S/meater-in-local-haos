package B0;

import F0.c;
import F0.l;
import F0.m;
import F0.p;
import F0.s;
import h0.C3476g;
import h0.C3477h;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.AbstractC3864v;
import t1.t;

/* compiled from: CollectionInfo.android.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u001f\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001a\u0013\u0010\t\u001a\u00020\b*\u00020\u0000H\u0000¢\u0006\u0004\b\t\u0010\n\u001a\u001d\u0010\r\u001a\u00020\b2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00000\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000e\u001a\u001b\u0010\u0012\u001a\n \u0011*\u0004\u0018\u00010\u00100\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0013\u001a#\u0010\u0017\u001a\n \u0011*\u0004\u0018\u00010\u00160\u0016*\u00020\u00142\u0006\u0010\u0015\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0017\u0010\u0018\"\u0018\u0010\u001b\u001a\u00020\b*\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"LF0/p;", "node", "Lt1/t;", "info", "Loa/F;", "d", "(LF0/p;Lt1/t;)V", "e", "", "b", "(LF0/p;)Z", "", "items", "a", "(Ljava/util/List;)Z", "LF0/b;", "Lt1/t$e;", "kotlin.jvm.PlatformType", "f", "(LF0/b;)Lt1/t$e;", "LF0/c;", "itemNode", "Lt1/t$f;", "g", "(LF0/c;LF0/p;)Lt1/t$f;", "c", "(LF0/b;)Z", "isLazyCollection", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* compiled from: CollectionInfo.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: B0.a$a, reason: collision with other inner class name */
    static final class C0022a extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final C0022a f1397B = new C0022a();

        C0022a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    /* compiled from: CollectionInfo.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.a<Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f1398B = new b();

        b() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            return Boolean.FALSE;
        }
    }

    private static final boolean a(List<p> list) {
        List listM;
        long packedValue;
        if (list.size() < 2) {
            return true;
        }
        if (list.size() == 0 || list.size() == 1) {
            listM = r.m();
        } else {
            listM = new ArrayList();
            p pVar = list.get(0);
            int iO = r.o(list);
            int i10 = 0;
            while (i10 < iO) {
                i10++;
                p pVar2 = list.get(i10);
                p pVar3 = pVar2;
                p pVar4 = pVar;
                listM.add(C3476g.d(C3477h.a(Math.abs(C3476g.m(pVar4.i().d()) - C3476g.m(pVar3.i().d())), Math.abs(C3476g.n(pVar4.i().d()) - C3476g.n(pVar3.i().d())))));
                pVar = pVar2;
            }
        }
        if (listM.size() == 1) {
            packedValue = ((C3476g) r.j0(listM)).getPackedValue();
        } else {
            if (listM.isEmpty()) {
                throw new UnsupportedOperationException("Empty collection can't be reduced.");
            }
            Object objJ0 = r.j0(listM);
            int iO2 = r.o(listM);
            if (1 <= iO2) {
                int i11 = 1;
                while (true) {
                    objJ0 = C3476g.d(C3476g.r(((C3476g) objJ0).getPackedValue(), ((C3476g) listM.get(i11)).getPackedValue()));
                    if (i11 == iO2) {
                        break;
                    }
                    i11++;
                }
            }
            packedValue = ((C3476g) objJ0).getPackedValue();
        }
        return C3476g.n(packedValue) < C3476g.m(packedValue);
    }

    public static final boolean b(p pVar) {
        l lVarN = pVar.n();
        s sVar = s.f4372a;
        return (m.a(lVarN, sVar.a()) == null && m.a(pVar.n(), sVar.z()) == null) ? false : true;
    }

    private static final boolean c(F0.b bVar) {
        return bVar.getRowCount() < 0 || bVar.getColumnCount() < 0;
    }

    public static final void d(p pVar, t tVar) {
        l lVarN = pVar.n();
        s sVar = s.f4372a;
        F0.b bVar = (F0.b) m.a(lVarN, sVar.a());
        if (bVar != null) {
            tVar.j0(f(bVar));
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (m.a(pVar.n(), sVar.z()) != null) {
            List<p> listT = pVar.t();
            int size = listT.size();
            for (int i10 = 0; i10 < size; i10++) {
                p pVar2 = listT.get(i10);
                if (pVar2.n().i(s.f4372a.A())) {
                    arrayList.add(pVar2);
                }
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        boolean zA = a(arrayList);
        tVar.j0(t.e.a(zA ? 1 : arrayList.size(), zA ? arrayList.size() : 1, false, 0));
    }

    public static final void e(p pVar, t tVar) {
        l lVarN = pVar.n();
        s sVar = s.f4372a;
        c cVar = (c) m.a(lVarN, sVar.b());
        if (cVar != null) {
            tVar.k0(g(cVar, pVar));
        }
        p pVarR = pVar.r();
        if (pVarR == null || m.a(pVarR.n(), sVar.z()) == null) {
            return;
        }
        F0.b bVar = (F0.b) m.a(pVarR.n(), sVar.a());
        if ((bVar == null || !c(bVar)) && pVar.n().i(sVar.A())) {
            ArrayList arrayList = new ArrayList();
            List<p> listT = pVarR.t();
            int size = listT.size();
            int i10 = 0;
            for (int i11 = 0; i11 < size; i11++) {
                p pVar2 = listT.get(i11);
                if (pVar2.n().i(s.f4372a.A())) {
                    arrayList.add(pVar2);
                    if (pVar2.getLayoutNode().p0() < pVar.getLayoutNode().p0()) {
                        i10++;
                    }
                }
            }
            if (arrayList.isEmpty()) {
                return;
            }
            boolean zA = a(arrayList);
            t.f fVarA = t.f.a(zA ? 0 : i10, 1, zA ? i10 : 0, 1, false, ((Boolean) pVar.n().y(s.f4372a.A(), C0022a.f1397B)).booleanValue());
            if (fVarA != null) {
                tVar.k0(fVarA);
            }
        }
    }

    private static final t.e f(F0.b bVar) {
        return t.e.a(bVar.getRowCount(), bVar.getColumnCount(), false, 0);
    }

    private static final t.f g(c cVar, p pVar) {
        return t.f.a(cVar.getRowIndex(), cVar.getRowSpan(), cVar.getColumnIndex(), cVar.getColumnSpan(), false, ((Boolean) pVar.n().y(s.f4372a.A(), b.f1398B)).booleanValue());
    }
}
