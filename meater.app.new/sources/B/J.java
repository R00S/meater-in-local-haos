package B;

import java.util.List;
import java.util.Map;
import kotlin.C1560o;
import kotlin.EnumC5037q;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4170o;
import y0.AbstractC5096a;

/* compiled from: LazyGridState.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a#\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\"\u0014\u0010\t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"", "initialFirstVisibleItemIndex", "initialFirstVisibleItemScrollOffset", "LB/I;", "b", "(IILO/l;II)LB/I;", "LB/u;", "a", "LB/u;", "EmptyLazyGridLayoutInfo", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class J {

    /* renamed from: a, reason: collision with root package name */
    private static final u f1236a;

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00040\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "it", "", "Loa/o;", "LU0/b;", "a", "(I)Ljava/util/List;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Integer, List<? extends C4170o<? extends Integer, ? extends U0.b>>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f1240B = new b();

        b() {
            super(1);
        }

        public final List<C4170o<Integer, U0.b>> a(int i10) {
            return kotlin.collections.r.m();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ List<? extends C4170o<? extends Integer, ? extends U0.b>> invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LB/I;", "a", "()LB/I;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<I> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ int f1241B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1242C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(int i10, int i11) {
            super(0);
            this.f1241B = i10;
            this.f1242C = i11;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final I invoke() {
            return new I(this.f1241B, this.f1242C);
        }
    }

    static {
        a aVar = new a();
        List listM = kotlin.collections.r.m();
        EnumC5037q enumC5037q = EnumC5037q.Vertical;
        f1236a = new u(null, 0, false, 0.0f, aVar, false, Xb.J.a(ta.h.f50000B), U0.f.b(1.0f, 0.0f, 2, null), 0, b.f1240B, listM, 0, 0, 0, false, enumC5037q, 0, 0);
    }

    public static final I b(int i10, int i11, InterfaceC1554l interfaceC1554l, int i12, int i13) {
        if ((i13 & 1) != 0) {
            i10 = 0;
        }
        if ((i13 & 2) != 0) {
            i11 = 0;
        }
        if (C1560o.J()) {
            C1560o.S(29186956, i12, -1, "androidx.compose.foundation.lazy.grid.rememberLazyGridState (LazyGridState.kt:71)");
        }
        Object[] objArr = new Object[0];
        Y.j<I, ?> jVarA = I.INSTANCE.a();
        boolean z10 = ((((i12 & 14) ^ 6) > 4 && interfaceC1554l.h(i10)) || (i12 & 6) == 4) | ((((i12 & 112) ^ 48) > 32 && interfaceC1554l.h(i11)) || (i12 & 48) == 32);
        Object objF = interfaceC1554l.f();
        if (z10 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new c(i10, i11);
            interfaceC1554l.J(objF);
        }
        I i14 = (I) Y.b.c(objArr, jVarA, null, (Ba.a) objF, interfaceC1554l, 0, 4);
        if (C1560o.J()) {
            C1560o.R();
        }
        return i14;
    }

    /* compiled from: LazyGridState.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004R\u001a\u0010\n\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u000b\u001a\u00020\u00058\u0016X\u0096D¢\u0006\f\n\u0004\b\b\u0010\u0007\u001a\u0004\b\u0006\u0010\tR,\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00050\f8\u0016X\u0096\u0004¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u0012\u0004\b\u0012\u0010\u0004\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0014"}, d2 = {"B/J$a", "Ly0/J;", "Loa/F;", "e", "()V", "", "a", "I", "b", "()I", "width", "height", "", "Ly0/a;", "c", "Ljava/util/Map;", "d", "()Ljava/util/Map;", "getAlignmentLines$annotations", "alignmentLines", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements y0.J {

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final int width;

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        private final int height;

        /* renamed from: c, reason: collision with root package name and from kotlin metadata */
        private final Map<AbstractC5096a, Integer> alignmentLines = M.h();

        a() {
        }

        @Override // y0.J
        /* renamed from: a, reason: from getter */
        public int getF52954b() {
            return this.height;
        }

        @Override // y0.J
        /* renamed from: b, reason: from getter */
        public int getF52953a() {
            return this.width;
        }

        @Override // y0.J
        public Map<AbstractC5096a, Integer> d() {
            return this.alignmentLines;
        }

        @Override // y0.J
        public void e() {
        }
    }
}
