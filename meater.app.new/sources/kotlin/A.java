package kotlin;

import Ba.l;
import Ba.p;
import kotlin.C1503H0;
import kotlin.C1509K0;
import kotlin.C1510L;
import kotlin.C1516O;
import kotlin.C1560o;
import kotlin.C1576w;
import kotlin.InterfaceC1508K;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.X;
import y0.Y;

/* compiled from: LazyLayoutPinnableItem.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a7\u0010\t\u001a\u00020\u00072\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"", "key", "", "index", "LC/B;", "pinnedItemList", "Lkotlin/Function0;", "Loa/F;", "content", "a", "(Ljava/lang/Object;ILC/B;LBa/p;LO/l;I)V", "foundation_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A {

    /* compiled from: LazyLayoutPinnableItem.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LO/L;", "LO/K;", "a", "(LO/L;)LO/K;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements l<C1510L, InterfaceC1508K> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ z f1969B;

        /* compiled from: Effects.kt */
        @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"C/A$a$a", "LO/K;", "Loa/F;", "c", "()V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: C.A$a$a, reason: collision with other inner class name */
        public static final class C0032a implements InterfaceC1508K {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ z f1970a;

            public C0032a(z zVar) {
                this.f1970a = zVar;
            }

            @Override // kotlin.InterfaceC1508K
            public void c() {
                this.f1970a.g();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(z zVar) {
            super(1);
            this.f1969B = zVar;
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final InterfaceC1508K invoke(C1510L c1510l) {
            return new C0032a(this.f1969B);
        }
    }

    /* compiled from: LazyLayoutPinnableItem.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    static final class b extends AbstractC3864v implements p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Object f1971B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ int f1972C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ B f1973D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ p<InterfaceC1554l, Integer, C4153F> f1974E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ int f1975F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(Object obj, int i10, B b10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, int i11) {
            super(2);
            this.f1971B = obj;
            this.f1972C = i10;
            this.f1973D = b10;
            this.f1974E = pVar;
            this.f1975F = i11;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            A.a(this.f1971B, this.f1972C, this.f1973D, this.f1974E, interfaceC1554l, C1509K0.a(this.f1975F | 1));
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    public static final void a(Object obj, int i10, B b10, p<? super InterfaceC1554l, ? super Integer, C4153F> pVar, InterfaceC1554l interfaceC1554l, int i11) {
        int i12;
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-2079116560);
        if ((i11 & 6) == 0) {
            i12 = (interfaceC1554lR.l(obj) ? 4 : 2) | i11;
        } else {
            i12 = i11;
        }
        if ((i11 & 48) == 0) {
            i12 |= interfaceC1554lR.h(i10) ? 32 : 16;
        }
        if ((i11 & 384) == 0) {
            i12 |= interfaceC1554lR.l(b10) ? 256 : 128;
        }
        if ((i11 & 3072) == 0) {
            i12 |= interfaceC1554lR.l(pVar) ? 2048 : 1024;
        }
        if ((i12 & 1171) == 1170 && interfaceC1554lR.u()) {
            interfaceC1554lR.C();
        } else {
            if (C1560o.J()) {
                C1560o.S(-2079116560, i12, -1, "androidx.compose.foundation.lazy.layout.LazyLayoutPinnableItem (LazyLayoutPinnableItem.kt:52)");
            }
            boolean zR = interfaceC1554lR.R(obj) | interfaceC1554lR.R(b10);
            Object objF = interfaceC1554lR.f();
            if (zR || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new z(obj, b10);
                interfaceC1554lR.J(objF);
            }
            z zVar = (z) objF;
            zVar.h(i10);
            zVar.j((X) interfaceC1554lR.o(Y.a()));
            boolean zR2 = interfaceC1554lR.R(zVar);
            Object objF2 = interfaceC1554lR.f();
            if (zR2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                objF2 = new a(zVar);
                interfaceC1554lR.J(objF2);
            }
            C1516O.a(zVar, (l) objF2, interfaceC1554lR, 0);
            C1576w.a(Y.a().d(zVar), pVar, interfaceC1554lR, ((i12 >> 6) & 112) | C1503H0.f12626i);
            if (C1560o.J()) {
                C1560o.R();
            }
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new b(obj, i10, b10, pVar, i11));
        }
    }
}
