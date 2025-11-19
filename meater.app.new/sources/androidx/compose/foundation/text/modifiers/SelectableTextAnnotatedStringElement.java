package androidx.compose.foundation.text.modifiers;

import A0.V;
import Ba.l;
import G.g;
import H0.C1060d;
import H0.Placeholder;
import H0.TextLayoutResult;
import H0.TextStyle;
import R0.q;
import h0.C3478i;
import i0.InterfaceC3608w0;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;

/* compiled from: SelectableTextAnnotatedStringElement.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0080\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B¯\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0011\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u0014\u0012\u001e\b\u0002\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0002H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010#\u001a\u00020\u000b2\u0006\u0010\"\u001a\u00020\u0002H\u0016¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0096\u0002¢\u0006\u0004\b'\u0010(J\u000f\u0010)\u001a\u00020\u0011H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\"\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010\u0013\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\"\u0010\u0017\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u0015\u0018\u00010\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R*\u0010\u0019\u001a\u0018\u0012\f\u0012\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u0014\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u00105R\u0016\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0016\u0010\u001d\u001a\u0004\u0018\u00010\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010B\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"Landroidx/compose/foundation/text/modifiers/SelectableTextAnnotatedStringElement;", "LA0/V;", "Landroidx/compose/foundation/text/modifiers/a;", "LH0/d;", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "Lkotlin/Function1;", "LH0/F;", "Loa/F;", "onTextLayout", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "", "LH0/d$c;", "LH0/w;", "placeholders", "Lh0/i;", "onPlaceholderLayout", "LG/g;", "selectionController", "Li0/w0;", "color", "<init>", "(LH0/d;LH0/J;LL0/l$b;LBa/l;IZIILjava/util/List;LBa/l;LG/g;Li0/w0;Lkotlin/jvm/internal/k;)V", "p", "()Landroidx/compose/foundation/text/modifiers/a;", "node", "s", "(Landroidx/compose/foundation/text/modifiers/a;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "b", "LH0/d;", "c", "LH0/J;", "d", "LL0/l$b;", "e", "LBa/l;", "f", "I", "g", "Z", "h", "i", "j", "Ljava/util/List;", "k", "l", "LG/g;", "m", "Li0/w0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class SelectableTextAnnotatedStringElement extends V<a> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1060d text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<TextLayoutResult, C4153F> onTextLayout;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final int minLines;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final l<List<C3478i>, C4153F> onPlaceholderLayout;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final g selectionController;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final InterfaceC3608w0 color;

    public /* synthetic */ SelectableTextAnnotatedStringElement(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l lVar, int i10, boolean z10, int i11, int i12, List list, l lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0, C3854k c3854k) {
        this(c1060d, textStyle, bVar, lVar, i10, z10, i11, i12, list, lVar2, gVar, interfaceC3608w0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SelectableTextAnnotatedStringElement)) {
            return false;
        }
        SelectableTextAnnotatedStringElement selectableTextAnnotatedStringElement = (SelectableTextAnnotatedStringElement) other;
        return C3862t.b(this.color, selectableTextAnnotatedStringElement.color) && C3862t.b(this.text, selectableTextAnnotatedStringElement.text) && C3862t.b(this.style, selectableTextAnnotatedStringElement.style) && C3862t.b(this.placeholders, selectableTextAnnotatedStringElement.placeholders) && C3862t.b(this.fontFamilyResolver, selectableTextAnnotatedStringElement.fontFamilyResolver) && this.onTextLayout == selectableTextAnnotatedStringElement.onTextLayout && q.e(this.overflow, selectableTextAnnotatedStringElement.overflow) && this.softWrap == selectableTextAnnotatedStringElement.softWrap && this.maxLines == selectableTextAnnotatedStringElement.maxLines && this.minLines == selectableTextAnnotatedStringElement.minLines && this.onPlaceholderLayout == selectableTextAnnotatedStringElement.onPlaceholderLayout && C3862t.b(this.selectionController, selectableTextAnnotatedStringElement.selectionController);
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
        return iHashCode5 + (interfaceC3608w0 != null ? interfaceC3608w0.hashCode() : 0);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public a m() {
        return new a(this.text, this.style, this.fontFamilyResolver, this.onTextLayout, this.overflow, this.softWrap, this.maxLines, this.minLines, this.placeholders, this.onPlaceholderLayout, this.selectionController, this.color, null, 4096, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(a node) {
        node.p2(this.text, this.style, this.placeholders, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow, this.onTextLayout, this.onPlaceholderLayout, this.selectionController, this.color);
    }

    public String toString() {
        return "SelectableTextAnnotatedStringElement(text=" + ((Object) this.text) + ", style=" + this.style + ", fontFamilyResolver=" + this.fontFamilyResolver + ", onTextLayout=" + this.onTextLayout + ", overflow=" + ((Object) q.g(this.overflow)) + ", softWrap=" + this.softWrap + ", maxLines=" + this.maxLines + ", minLines=" + this.minLines + ", placeholders=" + this.placeholders + ", onPlaceholderLayout=" + this.onPlaceholderLayout + ", selectionController=" + this.selectionController + ", color=" + this.color + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    private SelectableTextAnnotatedStringElement(C1060d c1060d, TextStyle textStyle, AbstractC1341l.b bVar, l<? super TextLayoutResult, C4153F> lVar, int i10, boolean z10, int i11, int i12, List<C1060d.Range<Placeholder>> list, l<? super List<C3478i>, C4153F> lVar2, g gVar, InterfaceC3608w0 interfaceC3608w0) {
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
    }
}
