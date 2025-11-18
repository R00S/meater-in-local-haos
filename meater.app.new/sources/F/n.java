package F;

import h0.C3478i;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4170o;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: BasicText.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0002\u0018\u00002\u00020\u0001B-\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0016\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u0002¢\u0006\u0004\b\b\u0010\tJ,\u0010\u0010\u001a\u00020\u000f*\u00020\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00052\u0006\u0010\u000e\u001a\u00020\rH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R$\u0010\u0007\u001a\u0012\u0012\u000e\u0012\f\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0018\u00010\u00050\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0013\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0015"}, d2 = {"LF/n;", "Ly0/I;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "", "Lh0/i;", "placements", "<init>", "(LBa/a;LBa/a;)V", "Ly0/K;", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "a", "LBa/a;", "b", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class n implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Boolean> shouldMeasureLinks;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<List<C3478i>> placements;

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<C4170o<Z, U0.n>> f4269B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<C4170o<Z, Ba.a<U0.n>>> f4270C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends C4170o<? extends Z, U0.n>> list, List<? extends C4170o<? extends Z, ? extends Ba.a<U0.n>>> list2) {
            super(1);
            this.f4269B = list;
            this.f4270C = list2;
        }

        public final void a(Z.a aVar) {
            List<C4170o<Z, U0.n>> list = this.f4269B;
            if (list != null) {
                int size = list.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C4170o<Z, U0.n> c4170o = list.get(i10);
                    Z.a.j(aVar, c4170o.a(), c4170o.b().getPackedValue(), 0.0f, 2, null);
                }
            }
            List<C4170o<Z, Ba.a<U0.n>>> list2 = this.f4270C;
            if (list2 != null) {
                int size2 = list2.size();
                for (int i11 = 0; i11 < size2; i11++) {
                    C4170o<Z, Ba.a<U0.n>> c4170o2 = list2.get(i11);
                    Z zA = c4170o2.a();
                    Ba.a<U0.n> aVarB = c4170o2.b();
                    Z.a.j(aVar, zA, aVarB != null ? aVarB.invoke().getPackedValue() : U0.n.INSTANCE.a(), 0.0f, 2, null);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public n(Ba.a<Boolean> aVar, Ba.a<? extends List<C3478i>> aVar2) {
        this.shouldMeasureLinks = aVar;
        this.placements = aVar2;
    }

    @Override // y0.I
    public J e(K k10, List<? extends H> list, long j10) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            H h10 = list.get(i10);
            if (!(h10.getParentData() instanceof r)) {
                arrayList.add(h10);
            }
        }
        List<C3478i> listInvoke = this.placements.invoke();
        ArrayList arrayList2 = null;
        if (listInvoke != null) {
            ArrayList arrayList3 = new ArrayList(listInvoke.size());
            int size2 = listInvoke.size();
            for (int i11 = 0; i11 < size2; i11++) {
                C3478i c3478i = listInvoke.get(i11);
                C4170o c4170o = c3478i != null ? new C4170o(((H) arrayList.get(i11)).T(U0.c.b(0, (int) Math.floor(c3478i.k()), 0, (int) Math.floor(c3478i.e()), 5, null)), U0.n.b(U0.o.a(Math.round(c3478i.getLeft()), Math.round(c3478i.getTop())))) : null;
                if (c4170o != null) {
                    arrayList3.add(c4170o);
                }
            }
            arrayList2 = arrayList3;
        }
        ArrayList arrayList4 = new ArrayList(list.size());
        int size3 = list.size();
        for (int i12 = 0; i12 < size3; i12++) {
            H h11 = list.get(i12);
            if (h11.getParentData() instanceof r) {
                arrayList4.add(h11);
            }
        }
        return K.E1(k10, U0.b.l(j10), U0.b.k(j10), null, new a(arrayList2, b.i(arrayList4, this.shouldMeasureLinks)), 4, null);
    }
}
