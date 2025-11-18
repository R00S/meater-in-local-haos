package M;

import H0.TextStyle;
import R0.LineHeightStyle;
import kotlin.Metadata;

/* compiled from: TypographyTokens.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0001\u0010\u0002\u001a\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00068\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0001\u0010\t¨\u0006\u000b"}, d2 = {"LR0/g;", "a", "LR0/g;", "getDefaultLineHeightStyle", "()LR0/g;", "DefaultLineHeightStyle", "LH0/J;", "b", "LH0/J;", "()LH0/J;", "DefaultTextStyle", "material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f11853a;

    /* renamed from: b, reason: collision with root package name */
    private static final TextStyle f11854b;

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.c.INSTANCE.b(), null);
        f11853a = lineHeightStyle;
        TextStyle textStyleA = TextStyle.INSTANCE.a();
        f11854b = textStyleA.b((15204351 & 1) != 0 ? textStyleA.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (15204351 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (15204351 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleA.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleA.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleA.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (15204351 & 262144) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleA.platformStyle : L.c.a(), (15204351 & 1048576) != 0 ? textStyleA.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (15204351 & 2097152) != 0 ? textStyleA.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleA.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleA.paragraphStyle.getTextMotion() : null);
    }

    public static final TextStyle a() {
        return f11854b;
    }
}
