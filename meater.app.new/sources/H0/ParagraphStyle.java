package H0;

import R0.LineHeightStyle;
import R0.TextIndent;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ParagraphStyle.kt */
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u00020\u0001Bi\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0000H\u0007¢\u0006\u0004\b\u0017\u0010\u0018Jr\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012ø\u0001\u0000¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001c\u001a\u00020\u001b2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u001eH\u0016¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010\"\u001a\u00020!H\u0016¢\u0006\u0004\b\"\u0010#R\u001d\u0010\u0003\u001a\u00020\u00028\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b\u0019\u0010$\u001a\u0004\b%\u0010 R\u001d\u0010\u0005\u001a\u00020\u00048\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b&\u0010$\u001a\u0004\b'\u0010 R\u001d\u0010\u0007\u001a\u00020\u00068\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b(\u0010)\u001a\u0004\b*\u0010+R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b*\u00100\u001a\u0004\b1\u00102R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b3\u00105R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b1\u0010$\u001a\u0004\b,\u0010 R\u001d\u0010\u0011\u001a\u00020\u00108\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b%\u0010$\u001a\u0004\b(\u0010 R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b'\u00106\u001a\u0004\b7\u00108\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u00069"}, d2 = {"LH0/u;", "", "LR0/i;", "textAlign", "LR0/k;", "textDirection", "LU0/v;", "lineHeight", "LR0/o;", "textIndent", "LH0/y;", "platformStyle", "LR0/g;", "lineHeightStyle", "LR0/e;", "lineBreak", "LR0/d;", "hyphens", "LR0/p;", "textMotion", "<init>", "(IIJLR0/o;LH0/y;LR0/g;IILR0/p;Lkotlin/jvm/internal/k;)V", "other", "l", "(LH0/u;)LH0/u;", "a", "(IIJLR0/o;LH0/y;LR0/g;IILR0/p;)LH0/u;", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "I", "h", "b", "i", "c", "J", "e", "()J", "d", "LR0/o;", "j", "()LR0/o;", "LH0/y;", "g", "()LH0/y;", "f", "LR0/g;", "()LR0/g;", "LR0/p;", "k", "()LR0/p;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.u, reason: from toString */
/* loaded from: classes.dex */
public final class ParagraphStyle {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textAlign;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final int textDirection;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final long lineHeight;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextIndent textIndent;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final PlatformParagraphStyle platformStyle;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final LineHeightStyle lineHeightStyle;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final int lineBreak;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final int hyphens;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final R0.p textMotion;

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar, C3854k c3854k) {
        this(i10, i11, j10, textIndent, platformParagraphStyle, lineHeightStyle, i12, i13, pVar);
    }

    public final ParagraphStyle a(int textAlign, int textDirection, long lineHeight, TextIndent textIndent, PlatformParagraphStyle platformStyle, LineHeightStyle lineHeightStyle, int lineBreak, int hyphens, R0.p textMotion) {
        return new ParagraphStyle(textAlign, textDirection, lineHeight, textIndent, platformStyle, lineHeightStyle, lineBreak, hyphens, textMotion, null);
    }

    /* renamed from: c, reason: from getter */
    public final int getHyphens() {
        return this.hyphens;
    }

    /* renamed from: d, reason: from getter */
    public final int getLineBreak() {
        return this.lineBreak;
    }

    /* renamed from: e, reason: from getter */
    public final long getLineHeight() {
        return this.lineHeight;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ParagraphStyle)) {
            return false;
        }
        ParagraphStyle paragraphStyle = (ParagraphStyle) other;
        return R0.i.k(this.textAlign, paragraphStyle.textAlign) && R0.k.j(this.textDirection, paragraphStyle.textDirection) && U0.v.e(this.lineHeight, paragraphStyle.lineHeight) && C3862t.b(this.textIndent, paragraphStyle.textIndent) && C3862t.b(this.platformStyle, paragraphStyle.platformStyle) && C3862t.b(this.lineHeightStyle, paragraphStyle.lineHeightStyle) && R0.e.d(this.lineBreak, paragraphStyle.lineBreak) && R0.d.e(this.hyphens, paragraphStyle.hyphens) && C3862t.b(this.textMotion, paragraphStyle.textMotion);
    }

    /* renamed from: f, reason: from getter */
    public final LineHeightStyle getLineHeightStyle() {
        return this.lineHeightStyle;
    }

    /* renamed from: g, reason: from getter */
    public final PlatformParagraphStyle getPlatformStyle() {
        return this.platformStyle;
    }

    /* renamed from: h, reason: from getter */
    public final int getTextAlign() {
        return this.textAlign;
    }

    public int hashCode() {
        int iL = ((((R0.i.l(this.textAlign) * 31) + R0.k.k(this.textDirection)) * 31) + U0.v.i(this.lineHeight)) * 31;
        TextIndent textIndent = this.textIndent;
        int iHashCode = (iL + (textIndent != null ? textIndent.hashCode() : 0)) * 31;
        PlatformParagraphStyle platformParagraphStyle = this.platformStyle;
        int iHashCode2 = (iHashCode + (platformParagraphStyle != null ? platformParagraphStyle.hashCode() : 0)) * 31;
        LineHeightStyle lineHeightStyle = this.lineHeightStyle;
        int iHashCode3 = (((((iHashCode2 + (lineHeightStyle != null ? lineHeightStyle.hashCode() : 0)) * 31) + R0.e.h(this.lineBreak)) * 31) + R0.d.f(this.hyphens)) * 31;
        R0.p pVar = this.textMotion;
        return iHashCode3 + (pVar != null ? pVar.hashCode() : 0);
    }

    /* renamed from: i, reason: from getter */
    public final int getTextDirection() {
        return this.textDirection;
    }

    /* renamed from: j, reason: from getter */
    public final TextIndent getTextIndent() {
        return this.textIndent;
    }

    /* renamed from: k, reason: from getter */
    public final R0.p getTextMotion() {
        return this.textMotion;
    }

    public final ParagraphStyle l(ParagraphStyle other) {
        return other == null ? this : v.a(this, other.textAlign, other.textDirection, other.lineHeight, other.textIndent, other.platformStyle, other.lineHeightStyle, other.lineBreak, other.hyphens, other.textMotion);
    }

    public String toString() {
        return "ParagraphStyle(textAlign=" + ((Object) R0.i.m(this.textAlign)) + ", textDirection=" + ((Object) R0.k.l(this.textDirection)) + ", lineHeight=" + ((Object) U0.v.j(this.lineHeight)) + ", textIndent=" + this.textIndent + ", platformStyle=" + this.platformStyle + ", lineHeightStyle=" + this.lineHeightStyle + ", lineBreak=" + ((Object) R0.e.i(this.lineBreak)) + ", hyphens=" + ((Object) R0.d.g(this.hyphens)) + ", textMotion=" + this.textMotion + ')';
    }

    private ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar) {
        this.textAlign = i10;
        this.textDirection = i11;
        this.lineHeight = j10;
        this.textIndent = textIndent;
        this.platformStyle = platformParagraphStyle;
        this.lineHeightStyle = lineHeightStyle;
        this.lineBreak = i12;
        this.hyphens = i13;
        this.textMotion = pVar;
        if (U0.v.e(j10, U0.v.INSTANCE.a()) || U0.v.h(j10) >= 0.0f) {
            return;
        }
        throw new IllegalStateException(("lineHeight can't be negative (" + U0.v.h(j10) + ')').toString());
    }

    public /* synthetic */ ParagraphStyle(int i10, int i11, long j10, TextIndent textIndent, PlatformParagraphStyle platformParagraphStyle, LineHeightStyle lineHeightStyle, int i12, int i13, R0.p pVar, int i14, C3854k c3854k) {
        this((i14 & 1) != 0 ? R0.i.INSTANCE.g() : i10, (i14 & 2) != 0 ? R0.k.INSTANCE.f() : i11, (i14 & 4) != 0 ? U0.v.INSTANCE.a() : j10, (i14 & 8) != 0 ? null : textIndent, (i14 & 16) != 0 ? null : platformParagraphStyle, (i14 & 32) != 0 ? null : lineHeightStyle, (i14 & 64) != 0 ? R0.e.INSTANCE.b() : i12, (i14 & 128) != 0 ? R0.d.INSTANCE.c() : i13, (i14 & 256) == 0 ? pVar : null, null);
    }
}
