package b0;

import Ba.p;
import Ba.q;
import androidx.compose.ui.platform.C2037q0;
import androidx.compose.ui.platform.C2040s0;
import b0.i;
import kotlin.InterfaceC1554l;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;
import oa.C4153F;

/* compiled from: ComposedModifier.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0000*\u00020\u00002\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001b\u0010\n\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0007¢\u0006\u0004\b\n\u0010\u000b\u001a\u001b\u0010\f\u001a\u00020\u0000*\u00020\b2\u0006\u0010\t\u001a\u00020\u0000H\u0002¢\u0006\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lb0/i;", "Lkotlin/Function1;", "Landroidx/compose/ui/platform/s0;", "Loa/F;", "inspectorInfo", "factory", "b", "(Lb0/i;LBa/l;LBa/q;)Lb0/i;", "LO/l;", "modifier", "e", "(LO/l;Lb0/i;)Lb0/i;", "d", "ui_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class h {

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb0/i$b;", "it", "", "a", "(Lb0/i$b;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.l<i.b, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f29915B = new a();

        a() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(i.b bVar) {
            return Boolean.valueOf(!(bVar instanceof g));
        }
    }

    /* compiled from: ComposedModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lb0/i;", "acc", "Lb0/i$b;", "element", "a", "(Lb0/i;Lb0/i$b;)Lb0/i;"}, k = 3, mv = {1, 8, 0})
    static final class b extends AbstractC3864v implements p<i, i.b, i> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1554l f29916B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(InterfaceC1554l interfaceC1554l) {
            super(2);
            this.f29916B = interfaceC1554l;
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final i invoke(i iVar, i.b bVar) {
            boolean z10 = bVar instanceof g;
            i iVarD = bVar;
            if (z10) {
                q<i, InterfaceC1554l, Integer, i> qVarM = ((g) bVar).m();
                C3862t.e(qVarM, "null cannot be cast to non-null type @[ExtensionFunctionType] kotlin.Function3<androidx.compose.ui.Modifier, androidx.compose.runtime.Composer, kotlin.Int, androidx.compose.ui.Modifier>");
                iVarD = h.d(this.f29916B, (i) ((q) W.f(qVarM, 3)).g(i.INSTANCE, this.f29916B, 0));
            }
            return iVar.e(iVarD);
        }
    }

    public static final i b(i iVar, Ba.l<? super C2040s0, C4153F> lVar, q<? super i, ? super InterfaceC1554l, ? super Integer, ? extends i> qVar) {
        return iVar.e(new g(lVar, qVar));
    }

    public static /* synthetic */ i c(i iVar, Ba.l lVar, q qVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            lVar = C2037q0.a();
        }
        return b(iVar, lVar, qVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final i d(InterfaceC1554l interfaceC1554l, i iVar) {
        if (iVar.a(a.f29915B)) {
            return iVar;
        }
        interfaceC1554l.e(1219399079);
        i iVar2 = (i) iVar.c(i.INSTANCE, new b(interfaceC1554l));
        interfaceC1554l.O();
        return iVar2;
    }

    public static final i e(InterfaceC1554l interfaceC1554l, i iVar) {
        interfaceC1554l.S(439770924);
        i iVarD = d(interfaceC1554l, iVar);
        interfaceC1554l.I();
        return iVarD;
    }
}
