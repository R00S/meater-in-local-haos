package D;

import A0.C0832k;
import A0.InterfaceC0831j;
import U0.s;
import h0.C3478i;
import h0.C3483n;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import ta.InterfaceC4588d;
import ua.C4696b;
import y0.InterfaceC5116v;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: ScrollIntoViewRequester.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a \u0010\u0004\u001a\u00020\u0003*\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\u0080@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"LA0/j;", "Lh0/i;", "rect", "Loa/F;", "a", "(LA0/j;Lh0/i;Lta/d;)Ljava/lang/Object;", "foundation_release"}, k = 5, mv = {1, 8, 0}, xi = 48, xs = "androidx/compose/foundation/relocation/ScrollIntoView")
/* loaded from: classes.dex */
public final /* synthetic */ class h {

    /* compiled from: ScrollIntoViewRequester.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lh0/i;", "a", "()Lh0/i;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<C3478i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C3478i f3315B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ InterfaceC5116v f3316C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C3478i c3478i, InterfaceC5116v interfaceC5116v) {
            super(0);
            this.f3315B = c3478i;
            this.f3316C = interfaceC5116v;
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final C3478i invoke() {
            C3478i c3478i = this.f3315B;
            if (c3478i != null) {
                return c3478i;
            }
            InterfaceC5116v interfaceC5116v = this.f3316C;
            if (!interfaceC5116v.L()) {
                interfaceC5116v = null;
            }
            if (interfaceC5116v != null) {
                return C3483n.c(s.d(interfaceC5116v.a()));
            }
            return null;
        }
    }

    public static final Object a(InterfaceC0831j interfaceC0831j, C3478i c3478i, InterfaceC4588d<? super C4153F> interfaceC4588d) {
        if (!interfaceC0831j.getNode().getIsAttached()) {
            return C4153F.f46609a;
        }
        InterfaceC5116v interfaceC5116vJ = C0832k.j(interfaceC0831j);
        D.a aVarA = b.a(interfaceC0831j);
        if (aVarA == null) {
            return C4153F.f46609a;
        }
        Object objD0 = aVarA.D0(interfaceC5116vJ, new a(c3478i, interfaceC5116vJ), interfaceC4588d);
        return objD0 == C4696b.e() ? objD0 : C4153F.f46609a;
    }

    public static /* synthetic */ Object b(InterfaceC0831j interfaceC0831j, C3478i c3478i, InterfaceC4588d interfaceC4588d, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            c3478i = null;
        }
        return g.a(interfaceC0831j, c3478i, interfaceC4588d);
    }
}
