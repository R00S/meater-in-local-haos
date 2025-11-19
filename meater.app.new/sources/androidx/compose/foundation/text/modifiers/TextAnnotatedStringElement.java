package androidx.compose.foundation.text.modifiers;

import A0.V;
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
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: TextAnnotatedStringElement.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u001c\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BÇ\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c\u0012\u0016\b\u0002\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010#J\u0017\u0010%\u001a\u00020\u000b2\u0006\u0010$\u001a\u00020\u0002H\u0016¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u000f2\b\u0010(\u001a\u0004\u0018\u00010'H\u0096\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0011H\u0016¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00106R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00106R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00104R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010AR\"\u0010\u001f\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u00104\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextAnnotatedStringElement;", "LA0/V;", "Landroidx/compose/foundation/text/modifiers/b;", "LH0/d;", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LH0/d$c;", "LH0/w;", "placeholders", "Lh0/i;", "onPlaceholderLayout", "LG/g;", "selectionController", "Li0/w0;", "color", "Landroidx/compose/foundation/text/modifiers/b$a;", "onShowTranslation", "<init>", "(LH0/d;LH0/J;LL0/l$b;LBa/l;IZIILjava/util/List;LBa/l;LG/g;Li0/w0;LBa/l;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/text/modifiers/b;", "node", "s", "(Landroidx/compose/foundation/text/modifiers/b;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "LH0/d;", "c", "LH0/J;", "d", "LL0/l$b;", "e", "LBa/l;", "f", "I", "g", "Z", "h", "i", "j", "Ljava/util/List;", "k", "l", "LG/g;", "m", "Li0/w0;", "n", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextAnnotatedStringElement extends V<b> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C1060d text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final l<TextLayoutResult, C4153F> onTextLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final l<List<C3478i>, C4153F> onPlaceholderLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final g selectionController;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3608w0 color;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private final l<b.TextSubstitutionValue, C4153F> onShowTranslation;

    public /* synthetic */ TextAnnotatedStringElement(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l lVar3, C3854k c3854k) {
        this(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, interfaceC3608w0, lVar3);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextAnnotatedStringElement)) {
            return false;
        }
        TextAnnotatedStringElement textAnnotatedStringElement = (TextAnnotatedStringElement) other;
        return C3862t.b(this.color, textAnnotatedStringElement.color) && C3862t.b(this.text, textAnnotatedStringElement.text) && C3862t.b(this.style, textAnnotatedStringElement.style) && C3862t.b(this.placeholders, textAnnotatedStringElement.placeholders) && C3862t.b(this.fontFamilyResolver, textAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == textAnnotatedStringElement.onTextLayout && this.onShowTranslation == textAnnotatedStringElement.onShowTranslation && q.e(this.overflow, textAnnotatedStringElement.overflow) && this.softWrap == textAnnotatedStringElement.softWrap && this.maxLines == textAnnotatedStringElement.maxLines && this.minLines == textAnnotatedStringElement.minLines && this.onPlaceholderLayout == textAnnotatedStringElement.onPlaceholderLayout && C3862t.b(this.selectionController, textAnnotatedStringElement.selectionController);
    }

    public int hashCode() {
        int iHashCode = ((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31;
        l<TextLayoutResult, C4153F> lVar = this.onTextLayout;
        int iHashCode2 = (((((((((iHashCode + (lVar != null ? lVar.hashCode() : 0)) * 31) + q.f(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        List<C1060d.Range<Placeholder>> list = this.placeholders;
        int iHashCode3 = (iHashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        l<List<C3478i>, C4153F> lVar2 = this.onPlaceholderLayout;
        int iHashCode4 = (iHashCode3 + (lVar2 != null ? lVar2.hashCode() : 0)) * 31;
        g gVar = this.selectionController;
        int iHashCode5 = (iHashCode4 + (gVar != null ? gVar.hashCode() : 0)) * 31;
        InterfaceC3608w0 interfaceC3608w0 = this.color;
        int iHashCode6 = (iHashCode5 + (interfaceC3608w0 != null ? interfaceC3608w0.hashCode() : 0)) * 31;
        l<b.TextSubstitutionValue, C4153F> lVar3 = this.onShowTranslation;
        return iHashCode6 + (lVar3 != null ? lVar3.hashCode() : 0);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public b m() {
        return new b(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, this.onShowTranslation, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(b node) {
        node.q2(node.D2(this.color, this.style), node.F2(this.text), node.E2(this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow), node.C2(this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.onShowTranslation));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private TextAnnotatedStringElement(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, List<C1060d.Range<Placeholder>> list, l<? super List<C3478i>, C4153F> lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, l<? super b.TextSubstitutionValue, C4153F> lVar3) {
        this.text = c1060d;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.onTextLayout = lVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.placeholders = list;
        this.onPlaceholderLayout = lVar2;
        this.selectionController = gVar;
        this.color = interfaceC3608w0;
        this.onShowTranslation = lVar3;
    }
}
