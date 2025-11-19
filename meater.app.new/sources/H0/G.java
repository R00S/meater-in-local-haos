package H0;

import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextLinkStyles.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B7\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u001a\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010\u0011\u001a\u0004\b\u0010\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010\u0011\u001a\u0004\b\u0014\u0010\u0013R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0011\u001a\u0004\b\u0015\u0010\u0013¨\u0006\u0016"}, d2 = {"LH0/G;", "", "LH0/C;", "style", "focusedStyle", "hoveredStyle", "pressedStyle", "<init>", "(LH0/C;LH0/C;LH0/C;LH0/C;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LH0/C;", "d", "()LH0/C;", "b", "c", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class G {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle style;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle focusedStyle;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle hoveredStyle;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final SpanStyle pressedStyle;

    public G() {
        this(null, null, null, null, 15, null);
    }

    /* renamed from: a, reason: from getter */
    public final SpanStyle getFocusedStyle() {
        return this.focusedStyle;
    }

    /* renamed from: b, reason: from getter */
    public final SpanStyle getHoveredStyle() {
        return this.hoveredStyle;
    }

    /* renamed from: c, reason: from getter */
    public final SpanStyle getPressedStyle() {
        return this.pressedStyle;
    }

    /* renamed from: d, reason: from getter */
    public final SpanStyle getStyle() {
        return this.style;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (other == null || !(other instanceof G)) {
            return false;
        }
        G g10 = (G) other;
        return C3862t.b(this.style, g10.style) && C3862t.b(this.focusedStyle, g10.focusedStyle) && C3862t.b(this.hoveredStyle, g10.hoveredStyle) && C3862t.b(this.pressedStyle, g10.pressedStyle);
    }

    public int hashCode() {
        SpanStyle c10 = this.style;
        int iHashCode = (c10 != null ? c10.hashCode() : 0) * 31;
        SpanStyle c11 = this.focusedStyle;
        int iHashCode2 = (iHashCode + (c11 != null ? c11.hashCode() : 0)) * 31;
        SpanStyle c12 = this.hoveredStyle;
        int iHashCode3 = (iHashCode2 + (c12 != null ? c12.hashCode() : 0)) * 31;
        SpanStyle c13 = this.pressedStyle;
        return iHashCode3 + (c13 != null ? c13.hashCode() : 0);
    }

    public G(SpanStyle c10, SpanStyle c11, SpanStyle c12, SpanStyle c13) {
        this.style = c10;
        this.focusedStyle = c11;
        this.hoveredStyle = c12;
        this.pressedStyle = c13;
    }

    public /* synthetic */ G(SpanStyle c10, SpanStyle c11, SpanStyle c12, SpanStyle c13, int i10, C3854k c3854k) {
        this((i10 & 1) != 0 ? null : c10, (i10 & 2) != 0 ? null : c11, (i10 & 4) != 0 ? null : c12, (i10 & 8) != 0 ? null : c13);
    }
}
