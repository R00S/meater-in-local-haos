package y0;

import b0.i;
import kotlin.Metadata;

/* compiled from: LayoutModifier.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B'\u0012\u001e\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0003¢\u0006\u0004\b\t\u0010\nJ&\u0010\r\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\u0006H\u0016ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R:\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00038\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\n\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u0017"}, d2 = {"Ly0/C;", "LA0/B;", "Lb0/i$c;", "Lkotlin/Function3;", "Ly0/K;", "Ly0/H;", "LU0/b;", "Ly0/J;", "measureBlock", "<init>", "(LBa/q;)V", "measurable", "constraints", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "", "toString", "()Ljava/lang/String;", "O", "LBa/q;", "getMeasureBlock", "()LBa/q;", "j2", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: y0.C, reason: case insensitive filesystem and from toString */
/* loaded from: classes.dex */
public final class LayoutModifierImpl extends i.c implements A0.B {

    /* renamed from: O, reason: collision with root package name and from kotlin metadata and from toString */
    private Ba.q<? super K, ? super H, ? super U0.b, ? extends J> measureBlock;

    public LayoutModifierImpl(Ba.q<? super K, ? super H, ? super U0.b, ? extends J> qVar) {
        this.measureBlock = qVar;
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        return this.measureBlock.g(k10, h10, U0.b.a(j10));
    }

    public final void j2(Ba.q<? super K, ? super H, ? super U0.b, ? extends J> qVar) {
        this.measureBlock = qVar;
    }

    public String toString() {
        return "LayoutModifierImpl(measureBlock=" + this.measureBlock + ')';
    }
}
