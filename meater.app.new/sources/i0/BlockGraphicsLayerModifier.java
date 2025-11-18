package i0;

import A0.AbstractC0823c0;
import A0.C0832k;
import b0.i;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.Z;

/* compiled from: GraphicsLayerModifier.kt */
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u001b\u0012\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u0003¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\t\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ&\u0010\u0011\u001a\u00020\u0010*\u00020\u000b2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016ø\u0001\u0000¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R.\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019\"\u0004\b\u001a\u0010\bR\u0014\u0010\u001e\u001a\u00020\u001b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u001d\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u001f"}, d2 = {"Li0/i0;", "LA0/B;", "Lb0/i$c;", "Lkotlin/Function1;", "Landroidx/compose/ui/graphics/c;", "Loa/F;", "layerBlock", "<init>", "(LBa/l;)V", "k2", "()V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "", "toString", "()Ljava/lang/String;", "O", "LBa/l;", "j2", "()LBa/l;", "l2", "", "O1", "()Z", "shouldAutoInvalidate", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: i0.i0, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class BlockGraphicsLayerModifier extends i.c implements A0.B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private Ba.l<? super androidx.compose.ui.graphics.c, C4153F> block;

    /* compiled from: GraphicsLayerModifier.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: i0.i0$a */
    static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ y0.Z f42948B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ BlockGraphicsLayerModifier f42949C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(y0.Z z10, BlockGraphicsLayerModifier blockGraphicsLayerModifier) {
            super(1);
            this.f42948B = z10;
            this.f42949C = blockGraphicsLayerModifier;
        }

        public final void a(Z.a aVar) {
            Z.a.v(aVar, this.f42948B, 0, 0, 0.0f, this.f42949C.j2(), 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    public BlockGraphicsLayerModifier(Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
        this.block = lVar;
    }

    @Override // b0.i.c
    /* renamed from: O1 */
    public boolean getShouldAutoInvalidate() {
        return false;
    }

    @Override // A0.B
    public y0.J b(y0.K k10, y0.H h10, long j10) {
        y0.Z zT = h10.T(j10);
        return y0.K.E1(k10, zT.getWidth(), zT.getHeight(), null, new a(zT, this), 4, null);
    }

    public final Ba.l<androidx.compose.ui.graphics.c, C4153F> j2() {
        return this.block;
    }

    public final void k2() {
        AbstractC0823c0 wrapped = C0832k.h(this, A0.e0.a(2)).getWrapped();
        if (wrapped != null) {
            wrapped.f3(this.block, true);
        }
    }

    public final void l2(Ba.l<? super androidx.compose.ui.graphics.c, C4153F> lVar) {
        this.block = lVar;
    }

    public String toString() {
        return "BlockGraphicsLayerModifier(block=" + this.block + ')';
    }
}
