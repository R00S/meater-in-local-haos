package androidx.compose.foundation.text.modifiers;

import A0.V;
import G.k;
import H0.TextStyle;
import R0.q;
import i0.InterfaceC3608w0;
import kotlin.AbstractC1341l;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextStringSimpleElement.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001BS\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\r\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u001a\u0010\u001c\u001a\u00020\u000b2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010'R\u0014\u0010\u000f\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010'R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006."}, d2 = {"Landroidx/compose/foundation/text/modifiers/TextStringSimpleElement;", "LA0/V;", "LG/k;", "", "text", "LH0/J;", "style", "LL0/l$b;", "fontFamilyResolver", "LR0/q;", "overflow", "", "softWrap", "", "maxLines", "minLines", "Li0/w0;", "color", "<init>", "(Ljava/lang/String;LH0/J;LL0/l$b;IZIILi0/w0;Lkotlin/jvm/internal/k;)V", "p", "()LG/k;", "node", "Loa/F;", "s", "(LG/k;)V", "", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "b", "Ljava/lang/String;", "c", "LH0/J;", "d", "LL0/l$b;", "e", "I", "f", "Z", "g", "h", "i", "Li0/w0;", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class TextStringSimpleElement extends V<k> {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final int overflow;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final boolean softWrap;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final int maxLines;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final int minLines;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3608w0 color;

    public /* synthetic */ TextStringSimpleElement(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC3608w0 interfaceC3608w0, C3854k c3854k) {
        this(str, textStyle, bVar, i10, z10, i11, i12, interfaceC3608w0);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextStringSimpleElement)) {
            return false;
        }
        TextStringSimpleElement textStringSimpleElement = (TextStringSimpleElement) other;
        return C3862t.b(this.color, textStringSimpleElement.color) && C3862t.b(this.text, textStringSimpleElement.text) && C3862t.b(this.style, textStringSimpleElement.style) && C3862t.b(this.fontFamilyResolver, textStringSimpleElement.fontFamilyResolver) && q.e(this.overflow, textStringSimpleElement.overflow) && this.softWrap == textStringSimpleElement.softWrap && this.maxLines == textStringSimpleElement.maxLines && this.minLines == textStringSimpleElement.minLines;
    }

    public int hashCode() {
        int iHashCode = ((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + q.f(this.overflow)) * 31) + Boolean.hashCode(this.softWrap)) * 31) + this.maxLines) * 31) + this.minLines) * 31;
        InterfaceC3608w0 interfaceC3608w0 = this.color;
        return iHashCode + (interfaceC3608w0 != null ? interfaceC3608w0.hashCode() : 0);
    }

    @Override // A0.V
    /* renamed from: p, reason: merged with bridge method [inline-methods] */
    public k m() {
        return new k(this.text, this.style, this.fontFamilyResolver, this.overflow, this.softWrap, this.maxLines, this.minLines, this.color, null);
    }

    @Override // A0.V
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void n(k node) {
        node.r2(node.w2(this.color, this.style), node.y2(this.text), node.x2(this.style, this.minLines, this.maxLines, this.softWrap, this.fontFamilyResolver, this.overflow));
    }

    private TextStringSimpleElement(String str, TextStyle textStyle, AbstractC1341l.b bVar, int i10, boolean z10, int i11, int i12, InterfaceC3608w0 interfaceC3608w0) {
        this.text = str;
        this.style = textStyle;
        this.fontFamilyResolver = bVar;
        this.overflow = i10;
        this.softWrap = z10;
        this.maxLines = i11;
        this.minLines = i12;
        this.color = interfaceC3608w0;
    }
}
