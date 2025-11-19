package kotlin;

import H0.TextStyle;
import R0.LineHeightStyle;
import kotlin.AbstractC1341l;
import kotlin.AbstractC1501G0;
import kotlin.C1576w;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;

/* compiled from: Typography.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a\u001b\u0010\u0003\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0003\u0010\u0004\"\u001a\u0010\n\u001a\u00020\u00058\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t\"\u001a\u0010\u000e\u001a\u00020\u00008\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\u000b\u0010\r\" \u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u0011\u0010\u0013¨\u0006\u0015"}, d2 = {"LH0/J;", "LL0/l;", "default", "d", "(LH0/J;LL0/l;)LH0/J;", "LR0/g;", "a", "LR0/g;", "getDefaultLineHeightStyle", "()LR0/g;", "DefaultLineHeightStyle", "b", "LH0/J;", "()LH0/J;", "DefaultTextStyle", "LO/G0;", "LI/m0;", "c", "LO/G0;", "()LO/G0;", "LocalTypography", "material_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    private static final LineHeightStyle f6423a;

    /* renamed from: b, reason: collision with root package name */
    private static final TextStyle f6424b;

    /* renamed from: c, reason: collision with root package name */
    private static final AbstractC1501G0<Typography> f6425c;

    /* compiled from: Typography.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LI/m0;", "a", "()LI/m0;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.a<Typography> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f6426B = new a();

        a() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Typography invoke() {
            return new Typography(null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16383, null);
        }
    }

    static {
        LineHeightStyle lineHeightStyle = new LineHeightStyle(LineHeightStyle.a.INSTANCE.a(), LineHeightStyle.c.INSTANCE.b(), null);
        f6423a = lineHeightStyle;
        TextStyle textStyleA = TextStyle.INSTANCE.a();
        f6424b = textStyleA.b((15204351 & 1) != 0 ? textStyleA.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyleA.spanStyle.getFontSize() : 0L, (15204351 & 4) != 0 ? textStyleA.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyleA.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyleA.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyleA.spanStyle.getFontFamily() : null, (15204351 & 64) != 0 ? textStyleA.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyleA.spanStyle.getLetterSpacing() : 0L, (15204351 & 256) != 0 ? textStyleA.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyleA.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyleA.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyleA.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyleA.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyleA.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyleA.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyleA.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyleA.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyleA.paragraphStyle.getLineHeight() : 0L, (15204351 & 262144) != 0 ? textStyleA.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyleA.platformStyle : C1156s.a(), (15204351 & 1048576) != 0 ? textStyleA.paragraphStyle.getLineHeightStyle() : lineHeightStyle, (15204351 & 2097152) != 0 ? textStyleA.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyleA.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyleA.paragraphStyle.getTextMotion() : null);
        f6425c = C1576w.f(a.f6426B);
    }

    public static final TextStyle b() {
        return f6424b;
    }

    public static final AbstractC1501G0<Typography> c() {
        return f6425c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final TextStyle d(TextStyle textStyle, AbstractC1341l abstractC1341l) {
        return textStyle.j() != null ? textStyle : textStyle.b((15204351 & 1) != 0 ? textStyle.spanStyle.g() : 0L, (15204351 & 2) != 0 ? textStyle.spanStyle.getFontSize() : 0L, (15204351 & 4) != 0 ? textStyle.spanStyle.getFontWeight() : null, (15204351 & 8) != 0 ? textStyle.spanStyle.getFontStyle() : null, (15204351 & 16) != 0 ? textStyle.spanStyle.getFontSynthesis() : null, (15204351 & 32) != 0 ? textStyle.spanStyle.getFontFamily() : abstractC1341l, (15204351 & 64) != 0 ? textStyle.spanStyle.getFontFeatureSettings() : null, (15204351 & 128) != 0 ? textStyle.spanStyle.getLetterSpacing() : 0L, (15204351 & 256) != 0 ? textStyle.spanStyle.getBaselineShift() : null, (15204351 & 512) != 0 ? textStyle.spanStyle.getTextGeometricTransform() : null, (15204351 & 1024) != 0 ? textStyle.spanStyle.getLocaleList() : null, (15204351 & 2048) != 0 ? textStyle.spanStyle.getBackground() : 0L, (15204351 & 4096) != 0 ? textStyle.spanStyle.getTextDecoration() : null, (15204351 & 8192) != 0 ? textStyle.spanStyle.getShadow() : null, (15204351 & 16384) != 0 ? textStyle.spanStyle.getDrawStyle() : null, (15204351 & 32768) != 0 ? textStyle.paragraphStyle.getTextAlign() : 0, (15204351 & 65536) != 0 ? textStyle.paragraphStyle.getTextDirection() : 0, (15204351 & 131072) != 0 ? textStyle.paragraphStyle.getLineHeight() : 0L, (15204351 & 262144) != 0 ? textStyle.paragraphStyle.getTextIndent() : null, (15204351 & 524288) != 0 ? textStyle.platformStyle : null, (15204351 & 1048576) != 0 ? textStyle.paragraphStyle.getLineHeightStyle() : null, (15204351 & 2097152) != 0 ? textStyle.paragraphStyle.getLineBreak() : 0, (15204351 & 4194304) != 0 ? textStyle.paragraphStyle.getHyphens() : 0, (15204351 & 8388608) != 0 ? textStyle.paragraphStyle.getTextMotion() : null);
    }
}
