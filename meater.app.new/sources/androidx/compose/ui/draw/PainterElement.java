package androidx.compose.ui.draw;

import A0.C0839s;
import A0.E;
import A0.V;
import h0.C3482m;
import i0.C3604u0;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import n0.AbstractC4051b;
import y0.InterfaceC5106k;

/* compiled from: PainterModifier.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u00052\b\u0010\u001e\u001a\u0004\u0018\u00010\u001dHÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0017\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u00104R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u00108¨\u00069"}, d2 = {"Landroidx/compose/ui/draw/PainterElement;", "LA0/V;", "Landroidx/compose/ui/draw/c;", "Ln0/b;", "painter", "", "sizeToIntrinsics", "Lb0/c;", "alignment", "Ly0/k;", "contentScale", "", "alpha", "Li0/u0;", "colorFilter", "<init>", "(Ln0/b;ZLb0/c;Ly0/k;FLi0/u0;)V", "p", "()Landroidx/compose/ui/draw/c;", "node", "Loa/F;", "s", "(Landroidx/compose/ui/draw/c;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "b", "Ln0/b;", "getPainter", "()Ln0/b;", "c", "Z", "getSizeToIntrinsics", "()Z", "d", "Lb0/c;", "getAlignment", "()Lb0/c;", "e", "Ly0/k;", "getContentScale", "()Ly0/k;", "f", "F", "getAlpha", "()F", "g", "Li0/u0;", "getColorFilter", "()Li0/u0;", "ui_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class PainterElement extends V<PainterModifier> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC4051b painter;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean sizeToIntrinsics;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final b0.c alignment;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC5106k contentScale;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final float alpha;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final C3604u0 colorFilter;

    public PainterElement(AbstractC4051b abstractC4051b, boolean z10, b0.c cVar, InterfaceC5106k interfaceC5106k, float f10, C3604u0 c3604u0) {
        this.painter = abstractC4051b;
        this.sizeToIntrinsics = z10;
        this.alignment = cVar;
        this.contentScale = interfaceC5106k;
        this.alpha = f10;
        this.colorFilter = c3604u0;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PainterElement)) {
            return false;
        }
        PainterElement painterElement = (PainterElement) other;
        return C3862t.b(this.painter, painterElement.painter) && this.sizeToIntrinsics == painterElement.sizeToIntrinsics && C3862t.b(this.alignment, painterElement.alignment) && C3862t.b(this.contentScale, painterElement.contentScale) && Float.compare(this.alpha, painterElement.alpha) == 0 && C3862t.b(this.colorFilter, painterElement.colorFilter);
    }

    public int hashCode() {
        int iHashCode = ((((((((this.painter.hashCode() * 31) + Boolean.hashCode(this.sizeToIntrinsics)) * 31) + this.alignment.hashCode()) * 31) + this.contentScale.hashCode()) * 31) + Float.hashCode(this.alpha)) * 31;
        C3604u0 c3604u0 = this.colorFilter;
        return iHashCode + (c3604u0 == null ? 0 : c3604u0.hashCode());
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public PainterModifier m() {
        return new PainterModifier(this.painter, this.sizeToIntrinsics, this.alignment, this.contentScale, this.alpha, this.colorFilter);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(PainterModifier node) {
        boolean sizeToIntrinsics = node.getSizeToIntrinsics();
        boolean z10 = this.sizeToIntrinsics;
        boolean z11 = sizeToIntrinsics != z10 || (z10 && !C3482m.f(node.getPainter().h(), this.painter.h()));
        node.t2(this.painter);
        node.u2(this.sizeToIntrinsics);
        node.q2(this.alignment);
        node.s2(this.contentScale);
        node.c(this.alpha);
        node.r2(this.colorFilter);
        if (z11) {
            E.b(node);
        }
        C0839s.a(node);
    }

    public String toString() {
        return "PainterElement(painter=" + this.painter + ", sizeToIntrinsics=" + this.sizeToIntrinsics + ", alignment=" + this.alignment + ", contentScale=" + this.contentScale + ", alpha=" + this.alpha + ", colorFilter=" + this.colorFilter + ')';
    }
}
