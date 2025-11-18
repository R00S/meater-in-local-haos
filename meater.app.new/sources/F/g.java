package F;

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
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J,\u0010\u000e\u001a\u00020\r*\u00020\u00072\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\f\u001a\u00020\u000bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0012"}, d2 = {"LF/g;", "Ly0/I;", "Lkotlin/Function0;", "", "shouldMeasureLinks", "<init>", "(LBa/a;)V", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "a", "LBa/a;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class g implements I {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Ba.a<Boolean> shouldMeasureLinks;

    /* compiled from: BasicText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<H> f4231B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ g f4232C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(List<? extends H> list, g gVar) {
            super(1);
            this.f4231B = list;
            this.f4232C = gVar;
        }

        public final void a(Z.a aVar) {
            List listI = b.i(this.f4231B, this.f4232C.shouldMeasureLinks);
            if (listI != null) {
                int size = listI.size();
                for (int i10 = 0; i10 < size; i10++) {
                    C4170o c4170o = (C4170o) listI.get(i10);
                    Z z10 = (Z) c4170o.a();
                    Ba.a aVar2 = (Ba.a) c4170o.b();
                    Z.a.j(aVar, z10, aVar2 != null ? ((U0.n) aVar2.invoke()).getPackedValue() : U0.n.INSTANCE.a(), 0.0f, 2, null);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public g(Ba.a<Boolean> aVar) {
        this.shouldMeasureLinks = aVar;
    }

    @Override // y0.I
    public J e(K k10, List<? extends H> list, long j10) {
        return K.E1(k10, U0.b.l(j10), U0.b.k(j10), null, new a(list, this), 4, null);
    }
}
