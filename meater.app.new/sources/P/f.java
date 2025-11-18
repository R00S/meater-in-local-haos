package P;

import java.util.List;
import kotlin.AbstractC1564q;
import kotlin.C1507J0;
import kotlin.C1536d;
import kotlin.C1551j0;
import kotlin.C1553k0;
import kotlin.C1560o;
import kotlin.EnumC1525Y;
import kotlin.InterfaceC1496E;
import kotlin.InterfaceC1511L0;
import kotlin.InterfaceC1542f;
import kotlin.Metadata;
import kotlin.SlotWriter;
import kotlin.Z0;
import kotlin.collections.r;
import oa.C4153F;
import oa.v;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a/\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\b\u0010\t\u001a\u0017\u0010\n\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\n\u0010\u000b\u001a/\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\r\u001a\u00020\f2\u000e\u0010\u0004\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0002H\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a/\u0010\u0016\u001a\u00020\u00072\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0001\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"LO/c1;", "slots", "LO/f;", "", "applier", "", "index", "Loa/F;", "f", "(LO/c1;LO/f;I)V", "d", "(LO/c1;)I", "LO/d;", "anchor", "e", "(LO/c1;LO/d;LO/f;)I", "LO/E;", "composition", "LO/q;", "parentContext", "LO/k0;", "reference", "g", "(LO/E;LO/q;LO/k0;LO/c1;)V", "runtime_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class f {
    private static final int d(SlotWriter slotWriter) {
        int currentGroup = slotWriter.getCurrentGroup();
        int parent = slotWriter.getParent();
        while (parent >= 0 && !slotWriter.t0(parent)) {
            parent = slotWriter.H0(parent);
        }
        int iM0 = parent + 1;
        int iF0 = 0;
        while (iM0 < currentGroup) {
            if (slotWriter.o0(currentGroup, iM0)) {
                if (slotWriter.t0(iM0)) {
                    iF0 = 0;
                }
                iM0++;
            } else {
                iF0 += slotWriter.t0(iM0) ? 1 : slotWriter.F0(iM0);
                iM0 += slotWriter.m0(iM0);
            }
        }
        return iF0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int e(SlotWriter slotWriter, C1536d c1536d, InterfaceC1542f<Object> interfaceC1542f) {
        int iF = slotWriter.F(c1536d);
        C1560o.Q(slotWriter.getCurrentGroup() < iF);
        f(slotWriter, interfaceC1542f, iF);
        int iD = d(slotWriter);
        while (slotWriter.getCurrentGroup() < iF) {
            if (slotWriter.n0(iF)) {
                if (slotWriter.s0()) {
                    interfaceC1542f.d(slotWriter.D0(slotWriter.getCurrentGroup()));
                    iD = 0;
                }
                slotWriter.j1();
            } else {
                iD += slotWriter.Y0();
            }
        }
        C1560o.Q(slotWriter.getCurrentGroup() == iF);
        return iD;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void f(SlotWriter slotWriter, InterfaceC1542f<Object> interfaceC1542f, int i10) {
        while (!slotWriter.p0(i10)) {
            slotWriter.Z0();
            if (slotWriter.t0(slotWriter.getParent())) {
                interfaceC1542f.g();
            }
            slotWriter.T();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g(InterfaceC1496E interfaceC1496E, AbstractC1564q abstractC1564q, C1553k0 c1553k0, SlotWriter slotWriter) {
        Z0 z02 = new Z0();
        if (slotWriter.b0()) {
            z02.x();
        }
        if (slotWriter.a0()) {
            z02.w();
        }
        SlotWriter slotWriterL = z02.L();
        try {
            slotWriterL.I();
            slotWriterL.k1(126665345, c1553k0.c());
            SlotWriter.v0(slotWriterL, 0, 1, null);
            slotWriterL.p1(c1553k0.getParameter());
            List<C1536d> listC0 = slotWriter.C0(c1553k0.getAnchor(), 1, slotWriterL);
            slotWriterL.Y0();
            slotWriterL.T();
            slotWriterL.U();
            slotWriterL.L(true);
            C1551j0 c1551j0 = new C1551j0(z02);
            C1507J0.Companion companion = C1507J0.INSTANCE;
            if (companion.b(z02, listC0)) {
                a aVar = new a(interfaceC1496E, c1553k0);
                slotWriterL = z02.L();
                try {
                    companion.a(slotWriterL, listC0, aVar);
                    C4153F c4153f = C4153F.f46609a;
                    slotWriterL.L(true);
                } finally {
                }
            }
            abstractC1564q.m(c1553k0, c1551j0);
        } finally {
        }
    }

    /* compiled from: Operation.kt */
    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\r\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"P/f$a", "LO/L0;", "LO/J0;", "scope", "", "instance", "LO/Y;", "e", "(LO/J0;Ljava/lang/Object;)LO/Y;", "Loa/F;", "d", "(LO/J0;)V", "value", "a", "(Ljava/lang/Object;)V", "runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements InterfaceC1511L0 {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1496E f13689B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C1553k0 f13690C;

        a(InterfaceC1496E interfaceC1496E, C1553k0 c1553k0) {
            this.f13689B = interfaceC1496E;
            this.f13690C = c1553k0;
        }

        @Override // kotlin.InterfaceC1511L0
        public EnumC1525Y e(C1507J0 scope, Object instance) {
            EnumC1525Y enumC1525YE;
            InterfaceC1496E interfaceC1496E = this.f13689B;
            InterfaceC1511L0 interfaceC1511L0 = interfaceC1496E instanceof InterfaceC1511L0 ? (InterfaceC1511L0) interfaceC1496E : null;
            if (interfaceC1511L0 == null || (enumC1525YE = interfaceC1511L0.e(scope, instance)) == null) {
                enumC1525YE = EnumC1525Y.IGNORED;
            }
            if (enumC1525YE != EnumC1525Y.IGNORED) {
                return enumC1525YE;
            }
            C1553k0 c1553k0 = this.f13690C;
            c1553k0.h(r.G0(c1553k0.d(), v.a(scope, instance)));
            return EnumC1525Y.SCHEDULED;
        }

        @Override // kotlin.InterfaceC1511L0
        public void a(Object value) {
        }

        @Override // kotlin.InterfaceC1511L0
        public void d(C1507J0 scope) {
        }
    }
}
