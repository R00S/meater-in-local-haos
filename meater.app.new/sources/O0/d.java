package O0;

import H0.C1060d;
import H0.Placeholder;
import H0.SpanStyle;
import H0.TextStyle;
import I0.B;
import android.graphics.Typeface;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.C1352w;
import kotlin.C1353x;
import kotlin.FontWeight;
import kotlin.InterfaceC1329W;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.x1;

/* compiled from: AndroidParagraphIntrinsics.android.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0019\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u0006\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\n0\u00070\u00068\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001b\u001a\u0004\b\u001f\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'R\u001a\u0010,\u001a\u00020(8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\"\u0010)\u001a\u0004\b*\u0010+R\u001a\u00101\u001a\u00020-8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b$\u00100R\u001a\u00105\u001a\u0002028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0018\u00103\u001a\u0004\b.\u00104R\u0018\u00109\u001a\u0004\u0018\u0001068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010<\u001a\u00020:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010;R\u001a\u0010A\u001a\u00020=8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b7\u0010@R\u0014\u0010D\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010CR\u0014\u0010E\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0016\u0010CR\u0014\u0010G\u001a\u00020:8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0012\u0010F¨\u0006H"}, d2 = {"LO0/d;", "LH0/r;", "", "text", "LH0/J;", "style", "", "LH0/d$c;", "LH0/C;", "spanStyles", "LH0/w;", "placeholders", "LL0/l$b;", "fontFamilyResolver", "LU0/d;", "density", "<init>", "(Ljava/lang/String;LH0/J;Ljava/util/List;Ljava/util/List;LL0/l$b;LU0/d;)V", "a", "Ljava/lang/String;", "getText", "()Ljava/lang/String;", "b", "LH0/J;", "i", "()LH0/J;", "c", "Ljava/util/List;", "getSpanStyles", "()Ljava/util/List;", "d", "getPlaceholders", "e", "LL0/l$b;", "g", "()LL0/l$b;", "f", "LU0/d;", "getDensity", "()LU0/d;", "LO0/g;", "LO0/g;", "k", "()LO0/g;", "textPaint", "", "h", "Ljava/lang/CharSequence;", "()Ljava/lang/CharSequence;", "charSequence", "LI0/B;", "LI0/B;", "()LI0/B;", "layoutIntrinsics", "LO0/t;", "j", "LO0/t;", "resolvedTypefaces", "", "Z", "emojiCompatProcessed", "", "l", "I", "()I", "textDirectionHeuristic", "", "()F", "maxIntrinsicWidth", "minIntrinsicWidth", "()Z", "hasStaleResolvedFonts", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements H0.r {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final String text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final List<C1060d.Range<SpanStyle>> spanStyles;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final U0.d density;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final g textPaint;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final CharSequence charSequence;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private final B layoutIntrinsics;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private t resolvedTypefaces;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final boolean emojiCompatProcessed;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final int textDirectionHeuristic;

    /* compiled from: AndroidParagraphIntrinsics.android.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, d2 = {"LL0/l;", "fontFamily", "LL0/B;", "fontWeight", "LL0/w;", "fontStyle", "LL0/x;", "fontSynthesis", "Landroid/graphics/Typeface;", "a", "(LL0/l;LL0/B;II)Landroid/graphics/Typeface;"}, k = 3, mv = {1, 8, 0})
    static final class a extends AbstractC3864v implements Ba.r<AbstractC1341l, FontWeight, C1352w, C1353x, Typeface> {
        a() {
            super(4);
        }

        public final Typeface a(AbstractC1341l abstractC1341l, FontWeight fontWeight, int i10, int i11) {
            x1<Object> x1VarB = d.this.getFontFamilyResolver().b(abstractC1341l, fontWeight, i10, i11);
            if (x1VarB instanceof InterfaceC1329W.b) {
                Object value = x1VarB.getValue();
                C3862t.e(value, "null cannot be cast to non-null type android.graphics.Typeface");
                return (Typeface) value;
            }
            t tVar = new t(x1VarB, d.this.resolvedTypefaces);
            d.this.resolvedTypefaces = tVar;
            return tVar.a();
        }

        @Override // Ba.r
        public /* bridge */ /* synthetic */ Typeface k(AbstractC1341l abstractC1341l, FontWeight fontWeight, C1352w c1352w, C1353x c1353x) {
            return a(abstractC1341l, fontWeight, c1352w.getValue(), c1353x.getValue());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.util.List, java.util.List<H0.d$c<H0.C>>] */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v3, types: [java.util.ArrayList] */
    public d(String str, TextStyle textStyle, List<C1060d.Range<SpanStyle>> list, List<C1060d.Range<Placeholder>> list2, AbstractC1341l.b bVar, U0.d dVar) {
        this.text = str;
        this.style = textStyle;
        this.spanStyles = list;
        this.placeholders = list2;
        this.fontFamilyResolver = bVar;
        this.density = dVar;
        g gVar = new g(1, dVar.getDensity());
        this.textPaint = gVar;
        this.emojiCompatProcessed = !e.c(textStyle) ? false : n.f13100a.a().getValue().booleanValue();
        this.textDirectionHeuristic = e.d(textStyle.B(), textStyle.u());
        a aVar = new a();
        P0.d.e(gVar, textStyle.E());
        SpanStyle spanStyleA = P0.d.a(gVar, textStyle.getSpanStyle(), aVar, dVar, !((Collection) list).isEmpty());
        if (spanStyleA != null) {
            int size = list.size() + 1;
            list = new ArrayList<>(size);
            int i10 = 0;
            while (i10 < size) {
                list.add(i10 == 0 ? new C1060d.Range<>(spanStyleA, 0, this.text.length()) : this.spanStyles.get(i10 - 1));
                i10++;
            }
        }
        CharSequence charSequenceA = c.a(this.text, this.textPaint.getTextSize(), this.style, list, this.placeholders, this.density, aVar, this.emojiCompatProcessed);
        this.charSequence = charSequenceA;
        this.layoutIntrinsics = new B(charSequenceA, this.textPaint, this.textDirectionHeuristic);
    }

    @Override // H0.r
    public boolean a() {
        t tVar = this.resolvedTypefaces;
        return (tVar != null ? tVar.b() : false) || (!this.emojiCompatProcessed && e.c(this.style) && n.f13100a.a().getValue().booleanValue());
    }

    @Override // H0.r
    public float b() {
        return this.layoutIntrinsics.c();
    }

    @Override // H0.r
    public float c() {
        return this.layoutIntrinsics.b();
    }

    /* renamed from: f, reason: from getter */
    public final CharSequence getCharSequence() {
        return this.charSequence;
    }

    /* renamed from: g, reason: from getter */
    public final AbstractC1341l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: h, reason: from getter */
    public final B getLayoutIntrinsics() {
        return this.layoutIntrinsics;
    }

    /* renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: j, reason: from getter */
    public final int getTextDirectionHeuristic() {
        return this.textDirectionHeuristic;
    }

    /* renamed from: k, reason: from getter */
    public final g getTextPaint() {
        return this.textPaint;
    }
}
