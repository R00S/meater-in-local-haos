package androidx.compose.foundation.text.modifiers;

import A0.AbstractC0834m;
import A0.B;
import A0.E;
import A0.InterfaceC0840t;
import A0.r;
import Ba.l;
import G.g;
import H0.C1060d;
import H0.Placeholder;
import H0.TextLayoutResult;
import H0.TextStyle;
import R0.q;
import androidx.compose.foundation.text.modifiers.b;
import h0.C3478i;
import i0.InterfaceC3608w0;
import java.util.List;
import k0.InterfaceC3783c;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import oa.C4153F;
import y0.H;
import y0.InterfaceC5112q;
import y0.InterfaceC5116v;
import y0.J;
import y0.K;

/* compiled from: SelectableTextAnnotatedStringNode.kt */
@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BÇ\u0001\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0016\b\u0002\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0013\u0012\u0016\b\u0002\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u0016\u0012\u001e\b\u0002\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001e\u0012\u0016\b\u0002\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\"\u0010#J\u0017\u0010&\u001a\u00020\r2\u0006\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b&\u0010'J\u0013\u0010)\u001a\u00020\r*\u00020(H\u0016¢\u0006\u0004\b)\u0010*J&\u00101\u001a\u000200*\u00020+2\u0006\u0010-\u001a\u00020,2\u0006\u0010/\u001a\u00020.H\u0016ø\u0001\u0000¢\u0006\u0004\b1\u00102J#\u00106\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b6\u00107J#\u00109\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b9\u00107J#\u0010:\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00105\u001a\u00020\u0013H\u0016¢\u0006\u0004\b:\u00107J#\u0010;\u001a\u00020\u0013*\u0002032\u0006\u0010-\u001a\u0002042\u0006\u00108\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u00107J¦\u0001\u0010=\u001a\u00020\r2\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u00072\u0014\u0010\u0019\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0018\u00010\u00162\u0006\u0010\u0015\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u000f2\u0014\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\u001c\u0010\u001b\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001c2\b\u0010<\u001a\u0004\u0018\u00010\u001eø\u0001\u0000¢\u0006\u0004\b=\u0010>R\u0018\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b?\u0010@R$\u0010!\u001a\u0010\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010E\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006G"}, d2 = {"Landroidx/compose/foundation/text/modifiers/a;", "LA0/m;", "LA0/B;", "LA0/r;", "LA0/t;", "LH0/d;", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LH0/d$c;", "LH0/w;", "placeholders", "Lh0/i;", "onPlaceholderLayout", "LG/g;", "selectionController", "Li0/w0;", "overrideColor", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LH0/d;LH0/J;LL0/l$b;LBa/l;IZIILjava/util/List;LBa/l;LG/g;Li0/w0;LBa/l;Lkotlin/jvm/internal/k;)V", "Ly0/v;", "coordinates", "F", "(Ly0/v;)V", "Lk0/c;", "d", "(Lk0/c;)V", "Ly0/K;", "Ly0/H;", "measurable", "LU0/b;", "constraints", "Ly0/J;", "b", "(Ly0/K;Ly0/H;J)Ly0/J;", "Ly0/r;", "Ly0/q;", "height", "t", "(Ly0/r;Ly0/q;I)I", "width", "L", "z", "o", "color", "p2", "(LH0/d;LH0/J;Ljava/util/List;IIZLL0/l$b;ILBa/l;LBa/l;LG/g;Li0/w0;)V", "Q", "LG/g;", "R", "LBa/l;", "Landroidx/compose/foundation/text/modifiers/b;", "S", "Landroidx/compose/foundation/text/modifiers/b;", "delegate", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a extends AbstractC0834m implements B, r, InterfaceC0840t {

    /* renamed from: Q, reason: collision with root package name and from kotlin metadata */
    private g selectionController;

    /* renamed from: R, reason: collision with root package name and from kotlin metadata */
    private l<? super b.TextSubstitutionValue, C4153F> onShowTranslation;

    /* renamed from: S, reason: collision with root package name and from kotlin metadata */
    private final b delegate;

    public /* synthetic */ a(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l lVar3, C3854k c3854k) {
        this(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, interfaceC3608w0, lVar3);
    }

    @Override // A0.InterfaceC0840t
    public void F(InterfaceC5116v coordinates) {
        g gVar = this.selectionController;
        if (gVar != null) {
            gVar.g(coordinates);
        }
    }

    @Override // A0.B
    public int L(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.delegate.z2(rVar, interfaceC5112q, i10);
    }

    @Override // A0.B
    public J b(K k10, H h10, long j10) {
        return this.delegate.y2(k10, h10, j10);
    }

    @Override // A0.r
    public void d(InterfaceC3783c interfaceC3783c) {
        this.delegate.r2(interfaceC3783c);
    }

    @Override // A0.B
    public int o(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.delegate.w2(rVar, interfaceC5112q, i10);
    }

    public final void p2(C1060d text, TextStyle style, List<C1060d.Range<Placeholder>> placeholders, int minLines, int maxLines, boolean softWrap, AbstractC1341l.b fontFamilyResolver, int overflow, l<? super TextLayoutResult, C4153F> onTextLayout, l<? super List<C3478i>, C4153F> onPlaceholderLayout, g selectionController, InterfaceC3608w0 color) {
        b bVar = this.delegate;
        bVar.q2(bVar.D2(color, style), this.delegate.F2(text), this.delegate.E2(style, placeholders, minLines, maxLines, softWrap, fontFamilyResolver, overflow), this.delegate.C2(onTextLayout, onPlaceholderLayout, selectionController, this.onShowTranslation));
        this.selectionController = selectionController;
        E.b(this);
    }

    @Override // A0.B
    public int t(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.delegate.A2(rVar, interfaceC5112q, i10);
    }

    @Override // A0.B
    public int z(y0.r rVar, InterfaceC5112q interfaceC5112q, int i10) {
        return this.delegate.x2(rVar, interfaceC5112q, i10);
    }

    public /* synthetic */ a(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l lVar3, int i13, C3854k c3854k) {
        this(c1060d, textStyle, bVar, (i13 & 8) != 0 ? null : lVar, (i13 & 16) != 0 ? q.INSTANCE.a() : i10, (i13 & 32) != 0 ? true : z10, (i13 & 64) != 0 ? Integer.MAX_VALUE : i11, (i13 & 128) != 0 ? 1 : i12, (i13 & 256) != 0 ? null : list, (i13 & 512) != 0 ? null : lVar2, (i13 & 1024) != 0 ? null : gVar, (i13 & 2048) != 0 ? null : interfaceC3608w0, (i13 & 4096) != 0 ? null : lVar3, null);
    }

    private a(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, List<C1060d.Range<Placeholder>> list, l<? super List<C3478i>, C4153F> lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l<? super b.TextSubstitutionValue, C4153F> lVar3) {
        this.selectionController = gVar;
        this.onShowTranslation = lVar3;
        this.delegate = (b) j2(new b(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, this.selectionController, interfaceC3608w0, this.onShowTranslation, null));
        if (this.selectionController == null) {
            throw new IllegalArgumentException("Do not use SelectionCapableStaticTextModifier unless selectionController != null");
        }
    }
}
