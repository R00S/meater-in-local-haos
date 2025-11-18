package y0;

import A0.G;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.Z;

/* compiled from: RootMeasurePolicy.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u000b\u001a\u00020\n*\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\t\u001a\u00020\bH\u0016ø\u0001\u0000¢\u0006\u0004\b\u000b\u0010\f\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\r"}, d2 = {"Ly0/d0;", "LA0/G$f;", "<init>", "()V", "Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d0 extends G.f {

    /* renamed from: b, reason: collision with root package name */
    public static final d0 f53020b = new d0();

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f53022B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Z z10) {
            super(1);
            this.f53022B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.p(aVar, this.f53022B, 0, 0, 0.0f, null, 12, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<Z> f53023B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(List<? extends Z> list) {
            super(1);
            this.f53023B = list;
        }

        public final void a(Z.a aVar) {
            List<Z> list = this.f53023B;
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Z.a.p(aVar, list.get(i10), 0, 0, 0.0f, null, 12, null);
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    private d0() {
        super("Undefined intrinsics block and it is required");
    }

    @Override // y0.I
    public J e(K k10, List<? extends H> list, long j10) {
        if (list.isEmpty()) {
            return K.E1(k10, U0.b.n(j10), U0.b.m(j10), null, a.f53021B, 4, null);
        }
        if (list.size() == 1) {
            Z zT = list.get(0).T(j10);
            return K.E1(k10, U0.c.i(j10, zT.getWidth()), U0.c.h(j10, zT.getHeight()), null, new b(zT), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            arrayList.add(list.get(i10).T(j10));
        }
        int size2 = arrayList.size();
        int iMax = 0;
        int iMax2 = 0;
        for (int i11 = 0; i11 < size2; i11++) {
            Z z10 = (Z) arrayList.get(i11);
            iMax = Math.max(z10.getWidth(), iMax);
            iMax2 = Math.max(z10.getHeight(), iMax2);
        }
        return K.E1(k10, U0.c.i(j10, iMax), U0.c.h(j10, iMax2), null, new c(arrayList), 4, null);
    }

    /* compiled from: RootMeasurePolicy.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f53021B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }
}
