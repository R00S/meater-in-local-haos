package A0;

import h0.C3476g;
import h0.C3477h;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import y0.AbstractC5096a;
import y0.C5097b;
import y0.C5111p;

/* compiled from: LayoutNodeAlignmentLines.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0018\n\u0002\u0010%\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u00002\u00020\u0001B\u0011\b\u0004\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J'\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\r\u0010\u000f\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0014\u001a\u00020\b*\u00020\n2\u0006\u0010\u0007\u001a\u00020\u0006H$¢\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\f¢\u0006\u0004\b\u0016\u0010\u0010J\u000f\u0010\u0017\u001a\u00020\fH\u0000¢\u0006\u0004\b\u0017\u0010\u0010J\r\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u0018\u0010\u0010J\u001e\u0010\u001b\u001a\u00020\u0019*\u00020\n2\u0006\u0010\u001a\u001a\u00020\u0019H$ø\u0001\u0000¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\"\u0010(\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\"\u0010+\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\r\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R\"\u0010.\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001b\u0010#\u001a\u0004\b,\u0010%\"\u0004\b-\u0010'R\"\u00102\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b/\u0010#\u001a\u0004\b0\u0010%\"\u0004\b1\u0010'R\"\u00105\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b\u001f\u0010#\u001a\u0004\b3\u0010%\"\u0004\b4\u0010'R\"\u00108\u001a\u00020!8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b$\u0010#\u001a\u0004\b6\u0010%\"\u0004\b7\u0010'R\u0018\u00109\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u001eR \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010;R\u0014\u0010>\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b=\u0010%R\u0014\u0010@\u001a\u00020!8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b?\u0010%R$\u0010B\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\b0\u0011*\u00020\n8$X¤\u0004¢\u0006\u0006\u001a\u0004\b/\u0010A\u0082\u0001\u0002CD\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006E"}, d2 = {"LA0/a;", "", "LA0/b;", "alignmentLinesOwner", "<init>", "(LA0/b;)V", "Ly0/a;", "alignmentLine", "", "initialPosition", "LA0/c0;", "initialCoordinator", "Loa/F;", "c", "(Ly0/a;ILA0/c0;)V", "o", "()V", "", "h", "()Ljava/util/Map;", "i", "(LA0/c0;Ly0/a;)I", "n", "p", "m", "Lh0/g;", "position", "d", "(LA0/c0;J)J", "a", "LA0/b;", "f", "()LA0/b;", "", "b", "Z", "g", "()Z", "setDirty$ui_release", "(Z)V", "dirty", "getUsedDuringParentMeasurement$ui_release", "u", "usedDuringParentMeasurement", "l", "t", "usedDuringParentLayout", "e", "getPreviousUsedDuringParentLayout$ui_release", "q", "previousUsedDuringParentLayout", "getUsedByModifierMeasurement$ui_release", "s", "usedByModifierMeasurement", "getUsedByModifierLayout$ui_release", "r", "usedByModifierLayout", "queryOwner", "", "Ljava/util/Map;", "alignmentLineMap", "j", "queried", "k", "required", "(LA0/c0;)Ljava/util/Map;", "alignmentLinesMap", "LA0/H;", "LA0/O;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: A0.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0818a {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC0820b alignmentLinesOwner;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private boolean dirty;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentMeasurement;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private boolean usedDuringParentLayout;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private boolean previousUsedDuringParentLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierMeasurement;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private boolean usedByModifierLayout;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private InterfaceC0820b queryOwner;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final Map<AbstractC5096a, Integer> alignmentLineMap;

    /* compiled from: LayoutNodeAlignmentLines.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LA0/b;", "childOwner", "Loa/F;", "a", "(LA0/b;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: A0.a$a, reason: collision with other inner class name */
    static final class C0009a extends AbstractC3864v implements Ba.l<InterfaceC0820b, C4153F> {
        C0009a() {
            super(1);
        }

        public final void a(InterfaceC0820b interfaceC0820b) {
            if (interfaceC0820b.getIsPlaced()) {
                if (interfaceC0820b.getAlignmentLines().getDirty()) {
                    interfaceC0820b.Y();
                }
                Map map = interfaceC0820b.getAlignmentLines().alignmentLineMap;
                AbstractC0818a abstractC0818a = AbstractC0818a.this;
                for (Map.Entry entry : map.entrySet()) {
                    abstractC0818a.c((AbstractC5096a) entry.getKey(), ((Number) entry.getValue()).intValue(), interfaceC0820b.z());
                }
                AbstractC0823c0 wrappedBy = interfaceC0820b.z().getWrappedBy();
                C3862t.d(wrappedBy);
                while (!C3862t.b(wrappedBy, AbstractC0818a.this.getAlignmentLinesOwner().z())) {
                    Set<AbstractC5096a> setKeySet = AbstractC0818a.this.e(wrappedBy).keySet();
                    AbstractC0818a abstractC0818a2 = AbstractC0818a.this;
                    for (AbstractC5096a abstractC5096a : setKeySet) {
                        abstractC0818a2.c(abstractC5096a, abstractC0818a2.i(wrappedBy, abstractC5096a), wrappedBy);
                    }
                    wrappedBy = wrappedBy.getWrappedBy();
                    C3862t.d(wrappedBy);
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC0820b interfaceC0820b) {
            a(interfaceC0820b);
            return C4153F.f46609a;
        }
    }

    public /* synthetic */ AbstractC0818a(InterfaceC0820b interfaceC0820b, C3854k c3854k) {
        this(interfaceC0820b);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void c(AbstractC5096a alignmentLine, int initialPosition, AbstractC0823c0 initialCoordinator) {
        float f10 = initialPosition;
        long jA = C3477h.a(f10, f10);
        while (true) {
            jA = d(initialCoordinator, jA);
            initialCoordinator = initialCoordinator.getWrappedBy();
            C3862t.d(initialCoordinator);
            if (C3862t.b(initialCoordinator, this.alignmentLinesOwner.z())) {
                break;
            } else if (e(initialCoordinator).containsKey(alignmentLine)) {
                float fI = i(initialCoordinator, alignmentLine);
                jA = C3477h.a(fI, fI);
            }
        }
        int iRound = Math.round(alignmentLine instanceof C5111p ? C3476g.n(jA) : C3476g.m(jA));
        Map<AbstractC5096a, Integer> map = this.alignmentLineMap;
        if (map.containsKey(alignmentLine)) {
            iRound = C5097b.c(alignmentLine, ((Number) kotlin.collections.M.i(this.alignmentLineMap, alignmentLine)).intValue(), iRound);
        }
        map.put(alignmentLine, Integer.valueOf(iRound));
    }

    protected abstract long d(AbstractC0823c0 abstractC0823c0, long j10);

    protected abstract Map<AbstractC5096a, Integer> e(AbstractC0823c0 abstractC0823c0);

    /* renamed from: f, reason: from getter */
    public final InterfaceC0820b getAlignmentLinesOwner() {
        return this.alignmentLinesOwner;
    }

    /* renamed from: g, reason: from getter */
    public final boolean getDirty() {
        return this.dirty;
    }

    public final Map<AbstractC5096a, Integer> h() {
        return this.alignmentLineMap;
    }

    protected abstract int i(AbstractC0823c0 abstractC0823c0, AbstractC5096a abstractC5096a);

    public final boolean j() {
        return this.usedDuringParentMeasurement || this.previousUsedDuringParentLayout || this.usedByModifierMeasurement || this.usedByModifierLayout;
    }

    public final boolean k() {
        o();
        return this.queryOwner != null;
    }

    /* renamed from: l, reason: from getter */
    public final boolean getUsedDuringParentLayout() {
        return this.usedDuringParentLayout;
    }

    public final void m() {
        this.dirty = true;
        InterfaceC0820b interfaceC0820bF = this.alignmentLinesOwner.F();
        if (interfaceC0820bF == null) {
            return;
        }
        if (this.usedDuringParentMeasurement) {
            interfaceC0820bF.d0();
        } else if (this.previousUsedDuringParentLayout || this.usedDuringParentLayout) {
            interfaceC0820bF.requestLayout();
        }
        if (this.usedByModifierMeasurement) {
            this.alignmentLinesOwner.d0();
        }
        if (this.usedByModifierLayout) {
            this.alignmentLinesOwner.requestLayout();
        }
        interfaceC0820bF.getAlignmentLines().m();
    }

    public final void n() {
        this.alignmentLineMap.clear();
        this.alignmentLinesOwner.t(new C0009a());
        this.alignmentLineMap.putAll(e(this.alignmentLinesOwner.z()));
        this.dirty = false;
    }

    public final void o() {
        InterfaceC0820b interfaceC0820b;
        AbstractC0818a abstractC0818aD;
        AbstractC0818a abstractC0818aD2;
        if (j()) {
            interfaceC0820b = this.alignmentLinesOwner;
        } else {
            InterfaceC0820b interfaceC0820bF = this.alignmentLinesOwner.F();
            if (interfaceC0820bF == null) {
                return;
            }
            interfaceC0820b = interfaceC0820bF.getAlignmentLines().queryOwner;
            if (interfaceC0820b == null || !interfaceC0820b.getAlignmentLines().j()) {
                InterfaceC0820b interfaceC0820b2 = this.queryOwner;
                if (interfaceC0820b2 == null || interfaceC0820b2.getAlignmentLines().j()) {
                    return;
                }
                InterfaceC0820b interfaceC0820bF2 = interfaceC0820b2.F();
                if (interfaceC0820bF2 != null && (abstractC0818aD2 = interfaceC0820bF2.getAlignmentLines()) != null) {
                    abstractC0818aD2.o();
                }
                InterfaceC0820b interfaceC0820bF3 = interfaceC0820b2.F();
                interfaceC0820b = (interfaceC0820bF3 == null || (abstractC0818aD = interfaceC0820bF3.getAlignmentLines()) == null) ? null : abstractC0818aD.queryOwner;
            }
        }
        this.queryOwner = interfaceC0820b;
    }

    public final void p() {
        this.dirty = true;
        this.usedDuringParentMeasurement = false;
        this.previousUsedDuringParentLayout = false;
        this.usedDuringParentLayout = false;
        this.usedByModifierMeasurement = false;
        this.usedByModifierLayout = false;
        this.queryOwner = null;
    }

    public final void q(boolean z10) {
        this.previousUsedDuringParentLayout = z10;
    }

    public final void r(boolean z10) {
        this.usedByModifierLayout = z10;
    }

    public final void s(boolean z10) {
        this.usedByModifierMeasurement = z10;
    }

    public final void t(boolean z10) {
        this.usedDuringParentLayout = z10;
    }

    public final void u(boolean z10) {
        this.usedDuringParentMeasurement = z10;
    }

    private AbstractC0818a(InterfaceC0820b interfaceC0820b) {
        this.alignmentLinesOwner = interfaceC0820b;
        this.dirty = true;
        this.alignmentLineMap = new HashMap();
    }
}
