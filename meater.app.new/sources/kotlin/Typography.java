package kotlin;

import H0.TextStyle;
import U0.w;
import kotlin.AbstractC1341l;
import kotlin.FontWeight;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001d\b\u0007\u0018\u00002\u00020\u0001Bq\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\u0006\u0010\r\u001a\u00020\u0002\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\u0006\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0011B\u0095\u0001\b\u0016\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\u0002\u0012\b\b\u0002\u0010\n\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0002\u0012\b\b\u0002\u0010\f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b#\u0010 \u001a\u0004\b$\u0010\"R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b&\u0010\"R\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b'\u0010 \u001a\u0004\b(\u0010\"R\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b)\u0010 \u001a\u0004\b*\u0010\"R\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010 \u001a\u0004\b,\u0010\"R\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b-\u0010 \u001a\u0004\b.\u0010\"R\u0017\u0010\n\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010 \u001a\u0004\b0\u0010\"R\u0017\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b1\u0010 \u001a\u0004\b2\u0010\"R\u0017\u0010\f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b3\u0010 \u001a\u0004\b\u001f\u0010\"R\u0017\u0010\r\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b4\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b5\u0010 \u001a\u0004\b6\u0010\"R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b7\u0010 \u001a\u0004\b8\u0010\"¨\u00069"}, d2 = {"LI/m0;", "", "LH0/J;", "h1", "h2", "h3", "h4", "h5", "h6", "subtitle1", "subtitle2", "body1", "body2", "button", "caption", "overline", "<init>", "(LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;)V", "LL0/l;", "defaultFontFamily", "(LL0/l;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;LH0/J;)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LH0/J;", "getH1", "()LH0/J;", "b", "getH2", "c", "getH3", "d", "getH4", "e", "getH5", "f", "getH6", "g", "getSubtitle1", "h", "getSubtitle2", "i", "getBody1", "j", "k", "l", "getCaption", "m", "getOverline", "material_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I.m0, reason: from toString */
/* loaded from: classes.dex */
public final class Typography {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h1;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h2;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h3;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h4;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h5;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle h6;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle1;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle subtitle2;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body1;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle body2;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle button;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle caption;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle overline;

    public Typography(TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this.h1 = textStyle;
        this.h2 = textStyle2;
        this.h3 = textStyle3;
        this.h4 = textStyle4;
        this.h5 = textStyle5;
        this.h6 = textStyle6;
        this.subtitle1 = textStyle7;
        this.subtitle2 = textStyle8;
        this.body1 = textStyle9;
        this.body2 = textStyle10;
        this.button = textStyle11;
        this.caption = textStyle12;
        this.overline = textStyle13;
    }

    /* renamed from: a, reason: from getter */
    public final TextStyle getBody2() {
        return this.body2;
    }

    /* renamed from: b, reason: from getter */
    public final TextStyle getButton() {
        return this.button;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Typography)) {
            return false;
        }
        Typography typography = (Typography) other;
        return C3862t.b(this.h1, typography.h1) && C3862t.b(this.h2, typography.h2) && C3862t.b(this.h3, typography.h3) && C3862t.b(this.h4, typography.h4) && C3862t.b(this.h5, typography.h5) && C3862t.b(this.h6, typography.h6) && C3862t.b(this.subtitle1, typography.subtitle1) && C3862t.b(this.subtitle2, typography.subtitle2) && C3862t.b(this.body1, typography.body1) && C3862t.b(this.body2, typography.body2) && C3862t.b(this.button, typography.button) && C3862t.b(this.caption, typography.caption) && C3862t.b(this.overline, typography.overline);
    }

    public int hashCode() {
        return (((((((((((((((((((((((this.h1.hashCode() * 31) + this.h2.hashCode()) * 31) + this.h3.hashCode()) * 31) + this.h4.hashCode()) * 31) + this.h5.hashCode()) * 31) + this.h6.hashCode()) * 31) + this.subtitle1.hashCode()) * 31) + this.subtitle2.hashCode()) * 31) + this.body1.hashCode()) * 31) + this.body2.hashCode()) * 31) + this.button.hashCode()) * 31) + this.caption.hashCode()) * 31) + this.overline.hashCode();
    }

    public String toString() {
        return "Typography(h1=" + this.h1 + ", h2=" + this.h2 + ", h3=" + this.h3 + ", h4=" + this.h4 + ", h5=" + this.h5 + ", h6=" + this.h6 + ", subtitle1=" + this.subtitle1 + ", subtitle2=" + this.subtitle2 + ", body1=" + this.body1 + ", body2=" + this.body2 + ", button=" + this.button + ", caption=" + this.caption + ", overline=" + this.overline + ')';
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ Typography(AbstractC1341l abstractC1341l, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13, int i10, C3854k c3854k) {
        TextStyle textStyleB;
        TextStyle textStyleB2;
        TextStyle textStyleB3;
        TextStyle textStyleB4;
        TextStyle textStyleB5;
        TextStyle textStyleB6;
        TextStyle textStyleB7;
        TextStyle textStyleB8;
        TextStyle textStyleB9;
        TextStyle textStyleB10;
        TextStyle textStyleB11;
        TextStyle textStyleB12;
        TextStyle textStyleB13;
        AbstractC1341l abstractC1341lA = (i10 & 1) != 0 ? AbstractC1341l.INSTANCE.a() : abstractC1341l;
        if ((i10 & 2) != 0) {
            TextStyle textStyleB14 = n0.b();
            textStyleB = textStyleB14.b((15204351 & 1) != 0 ? textStyleB14.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB14.spanStyle.getFontSize() : w.e(96), (15204351 & 4) != 0 ? textStyleB14.spanStyle.getFontWeight() : FontWeight.INSTANCE.b(), (15204351 & 8) != 0 ? textStyleB14.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB14.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB14.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB14.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB14.spanStyle.getLetterSpacing() : w.c(-1.5d), (15204351 & 256) != 0 ? textStyleB14.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB14.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB14.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB14.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB14.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB14.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB14.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB14.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB14.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB14.paragraphStyle.getLineHeight() : w.e(112), (15204351 & 262144) != 0 ? textStyleB14.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB14.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB14.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB14.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB14.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB14.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB = textStyle;
        }
        if ((i10 & 4) != 0) {
            TextStyle textStyleB15 = n0.b();
            textStyleB2 = textStyleB15.b((15204351 & 1) != 0 ? textStyleB15.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB15.spanStyle.getFontSize() : w.e(60), (15204351 & 4) != 0 ? textStyleB15.spanStyle.getFontWeight() : FontWeight.INSTANCE.b(), (15204351 & 8) != 0 ? textStyleB15.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB15.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB15.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB15.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB15.spanStyle.getLetterSpacing() : w.c(-0.5d), (15204351 & 256) != 0 ? textStyleB15.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB15.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB15.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB15.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB15.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB15.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB15.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB15.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB15.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB15.paragraphStyle.getLineHeight() : w.e(72), (15204351 & 262144) != 0 ? textStyleB15.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB15.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB15.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB15.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB15.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB15.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB2 = textStyle2;
        }
        if ((i10 & 8) != 0) {
            TextStyle textStyleB16 = n0.b();
            textStyleB3 = textStyleB16.b((15204351 & 1) != 0 ? textStyleB16.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB16.spanStyle.getFontSize() : w.e(48), (15204351 & 4) != 0 ? textStyleB16.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB16.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB16.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB16.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB16.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB16.spanStyle.getLetterSpacing() : w.e(0), (15204351 & 256) != 0 ? textStyleB16.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB16.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB16.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB16.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB16.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB16.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB16.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB16.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB16.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB16.paragraphStyle.getLineHeight() : w.e(56), (15204351 & 262144) != 0 ? textStyleB16.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB16.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB16.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB16.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB16.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB16.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB3 = textStyle3;
        }
        if ((i10 & 16) != 0) {
            TextStyle textStyleB17 = n0.b();
            textStyleB4 = textStyleB17.b((15204351 & 1) != 0 ? textStyleB17.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB17.spanStyle.getFontSize() : w.e(34), (15204351 & 4) != 0 ? textStyleB17.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB17.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB17.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB17.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB17.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB17.spanStyle.getLetterSpacing() : w.c(0.25d), (15204351 & 256) != 0 ? textStyleB17.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB17.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB17.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB17.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB17.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB17.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB17.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB17.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB17.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB17.paragraphStyle.getLineHeight() : w.e(36), (15204351 & 262144) != 0 ? textStyleB17.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB17.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB17.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB17.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB17.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB17.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB4 = textStyle4;
        }
        if ((i10 & 32) != 0) {
            TextStyle textStyleB18 = n0.b();
            textStyleB5 = textStyleB18.b((15204351 & 1) != 0 ? textStyleB18.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB18.spanStyle.getFontSize() : w.e(24), (15204351 & 4) != 0 ? textStyleB18.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB18.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB18.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB18.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB18.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB18.spanStyle.getLetterSpacing() : w.e(0), (15204351 & 256) != 0 ? textStyleB18.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB18.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB18.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB18.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB18.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB18.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB18.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB18.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB18.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB18.paragraphStyle.getLineHeight() : w.e(24), (15204351 & 262144) != 0 ? textStyleB18.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB18.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB18.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB18.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB18.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB18.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB5 = textStyle5;
        }
        if ((i10 & 64) != 0) {
            TextStyle textStyleB19 = n0.b();
            textStyleB6 = textStyleB19.b((15204351 & 1) != 0 ? textStyleB19.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB19.spanStyle.getFontSize() : w.e(20), (15204351 & 4) != 0 ? textStyleB19.spanStyle.getFontWeight() : FontWeight.INSTANCE.c(), (15204351 & 8) != 0 ? textStyleB19.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB19.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB19.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB19.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB19.spanStyle.getLetterSpacing() : w.c(0.15d), (15204351 & 256) != 0 ? textStyleB19.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB19.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB19.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB19.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB19.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB19.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB19.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB19.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB19.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB19.paragraphStyle.getLineHeight() : w.e(24), (15204351 & 262144) != 0 ? textStyleB19.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB19.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB19.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB19.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB19.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB19.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB6 = textStyle6;
        }
        if ((i10 & 128) != 0) {
            TextStyle textStyleB20 = n0.b();
            textStyleB7 = textStyleB20.b((15204351 & 1) != 0 ? textStyleB20.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB20.spanStyle.getFontSize() : w.e(16), (15204351 & 4) != 0 ? textStyleB20.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB20.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB20.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB20.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB20.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB20.spanStyle.getLetterSpacing() : w.c(0.15d), (15204351 & 256) != 0 ? textStyleB20.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB20.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB20.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB20.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB20.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB20.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB20.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB20.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB20.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB20.paragraphStyle.getLineHeight() : w.e(24), (15204351 & 262144) != 0 ? textStyleB20.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB20.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB20.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB20.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB20.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB20.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB7 = textStyle7;
        }
        if ((i10 & 256) != 0) {
            TextStyle textStyleB21 = n0.b();
            textStyleB8 = textStyleB21.b((15204351 & 1) != 0 ? textStyleB21.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB21.spanStyle.getFontSize() : w.e(14), (15204351 & 4) != 0 ? textStyleB21.spanStyle.getFontWeight() : FontWeight.INSTANCE.c(), (15204351 & 8) != 0 ? textStyleB21.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB21.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB21.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB21.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB21.spanStyle.getLetterSpacing() : w.c(0.1d), (15204351 & 256) != 0 ? textStyleB21.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB21.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB21.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB21.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB21.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB21.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB21.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB21.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB21.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB21.paragraphStyle.getLineHeight() : w.e(24), (15204351 & 262144) != 0 ? textStyleB21.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB21.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB21.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB21.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB21.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB21.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB8 = textStyle8;
        }
        if ((i10 & 512) != 0) {
            TextStyle textStyleB22 = n0.b();
            textStyleB9 = textStyleB22.b((15204351 & 1) != 0 ? textStyleB22.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB22.spanStyle.getFontSize() : w.e(16), (15204351 & 4) != 0 ? textStyleB22.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB22.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB22.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB22.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB22.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB22.spanStyle.getLetterSpacing() : w.c(0.5d), (15204351 & 256) != 0 ? textStyleB22.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB22.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB22.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB22.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB22.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB22.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB22.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB22.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB22.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB22.paragraphStyle.getLineHeight() : w.e(24), (15204351 & 262144) != 0 ? textStyleB22.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB22.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB22.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB22.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB22.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB22.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB9 = textStyle9;
        }
        if ((i10 & 1024) != 0) {
            TextStyle textStyleB23 = n0.b();
            textStyleB10 = textStyleB23.b((15204351 & 1) != 0 ? textStyleB23.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB23.spanStyle.getFontSize() : w.e(14), (15204351 & 4) != 0 ? textStyleB23.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB23.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB23.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB23.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB23.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB23.spanStyle.getLetterSpacing() : w.c(0.25d), (15204351 & 256) != 0 ? textStyleB23.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB23.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB23.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB23.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB23.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB23.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB23.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB23.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB23.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB23.paragraphStyle.getLineHeight() : w.e(20), (15204351 & 262144) != 0 ? textStyleB23.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB23.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB23.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB23.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB23.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB23.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB10 = textStyle10;
        }
        if ((i10 & 2048) != 0) {
            TextStyle textStyleB24 = n0.b();
            textStyleB11 = textStyleB24.b((15204351 & 1) != 0 ? textStyleB24.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB24.spanStyle.getFontSize() : w.e(14), (15204351 & 4) != 0 ? textStyleB24.spanStyle.getFontWeight() : FontWeight.INSTANCE.c(), (15204351 & 8) != 0 ? textStyleB24.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB24.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB24.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB24.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB24.spanStyle.getLetterSpacing() : w.c(1.25d), (15204351 & 256) != 0 ? textStyleB24.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB24.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB24.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB24.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB24.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB24.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB24.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB24.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB24.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB24.paragraphStyle.getLineHeight() : w.e(16), (15204351 & 262144) != 0 ? textStyleB24.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB24.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB24.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB24.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB24.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB24.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB11 = textStyle11;
        }
        if ((i10 & 4096) != 0) {
            TextStyle textStyleB25 = n0.b();
            textStyleB12 = textStyleB25.b((15204351 & 1) != 0 ? textStyleB25.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB25.spanStyle.getFontSize() : w.e(12), (15204351 & 4) != 0 ? textStyleB25.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB25.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB25.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB25.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB25.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB25.spanStyle.getLetterSpacing() : w.c(0.4d), (15204351 & 256) != 0 ? textStyleB25.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB25.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB25.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB25.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB25.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB25.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB25.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB25.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB25.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB25.paragraphStyle.getLineHeight() : w.e(16), (15204351 & 262144) != 0 ? textStyleB25.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB25.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB25.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB25.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB25.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB25.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB12 = textStyle12;
        }
        if ((i10 & 8192) != 0) {
            TextStyle textStyleB26 = n0.b();
            textStyleB13 = textStyleB26.b((15204351 & 1) != 0 ? textStyleB26.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleB26.spanStyle.getFontSize() : w.e(10), (15204351 & 4) != 0 ? textStyleB26.spanStyle.getFontWeight() : FontWeight.INSTANCE.d(), (15204351 & 8) != 0 ? textStyleB26.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleB26.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleB26.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleB26.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleB26.spanStyle.getLetterSpacing() : w.c(1.5d), (15204351 & 256) != 0 ? textStyleB26.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleB26.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleB26.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleB26.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleB26.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleB26.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleB26.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleB26.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleB26.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleB26.paragraphStyle.getLineHeight() : w.e(16), (15204351 & 262144) != 0 ? textStyleB26.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleB26.platformStyle : null, (15204351 & 1048576) != 0 ? textStyleB26.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyleB26.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleB26.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleB26.paragraphStyle.getTextMotion() : null);
        } else {
            textStyleB13 = textStyle13;
        }
        this(abstractC1341lA, textStyleB, textStyleB2, textStyleB3, textStyleB4, textStyleB5, textStyleB6, textStyleB7, textStyleB8, textStyleB9, textStyleB10, textStyleB11, textStyleB12, textStyleB13);
    }

    public Typography(AbstractC1341l abstractC1341l, TextStyle textStyle, TextStyle textStyle2, TextStyle textStyle3, TextStyle textStyle4, TextStyle textStyle5, TextStyle textStyle6, TextStyle textStyle7, TextStyle textStyle8, TextStyle textStyle9, TextStyle textStyle10, TextStyle textStyle11, TextStyle textStyle12, TextStyle textStyle13) {
        this(n0.d(textStyle, abstractC1341l), n0.d(textStyle2, abstractC1341l), n0.d(textStyle3, abstractC1341l), n0.d(textStyle4, abstractC1341l), n0.d(textStyle5, abstractC1341l), n0.d(textStyle6, abstractC1341l), n0.d(textStyle7, abstractC1341l), n0.d(textStyle8, abstractC1341l), n0.d(textStyle9, abstractC1341l), n0.d(textStyle10, abstractC1341l), n0.d(textStyle11, abstractC1341l), n0.d(textStyle12, abstractC1341l), n0.d(textStyle13, abstractC1341l));
    }
}
