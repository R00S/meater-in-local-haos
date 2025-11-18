package H0;

import H0.C1060d;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.InterfaceC1340k;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextLayoutResult.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000e\n\u0002\b!\b\u0007\u0018\u00002\u00020\u0001Bo\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bBe\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0012\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\nH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010#\u001a\u00020\"H\u0016¢\u0006\u0004\b#\u0010$R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,R#\u0010\t\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u00068\u0006¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b1\u00102\u001a\u0004\b3\u0010!R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R\u001d\u0010\u000f\u001a\u00020\u000e8\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b7\u00102\u001a\u0004\b7\u0010!R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b/\u00108\u001a\u0004\b)\u00109R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b5\u0010:\u001a\u0004\b1\u0010;R\u0017\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\f\n\u0004\b+\u0010<\u001a\u0004\b-\u0010=R\u001d\u0010\u0019\u001a\u00020\u00188\u0006ø\u0001\u0000ø\u0001\u0001¢\u0006\f\n\u0004\b'\u0010>\u001a\u0004\b%\u0010?R\u0018\u0010B\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b@\u0010A\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006C"}, d2 = {"LH0/E;", "", "LH0/d;", "text", "LH0/J;", "style", "", "LH0/d$c;", "LH0/w;", "placeholders", "", "maxLines", "", "softWrap", "LR0/q;", "overflow", "LU0/d;", "density", "LU0/t;", "layoutDirection", "LL0/k$b;", "resourceLoader", "LL0/l$b;", "fontFamilyResolver", "LU0/b;", "constraints", "<init>", "(LH0/d;LH0/J;Ljava/util/List;IZILU0/d;LU0/t;LL0/k$b;LL0/l$b;J)V", "(LH0/d;LH0/J;Ljava/util/List;IZILU0/d;LU0/t;LL0/l$b;JLkotlin/jvm/internal/k;)V", "other", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "a", "LH0/d;", "j", "()LH0/d;", "b", "LH0/J;", "i", "()LH0/J;", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "d", "I", "e", "Z", "h", "()Z", "f", "LU0/d;", "()LU0/d;", "LU0/t;", "()LU0/t;", "LL0/l$b;", "()LL0/l$b;", "J", "()J", "k", "LL0/k$b;", "_developerSuppliedResourceLoader", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: H0.E, reason: from toString */
/* loaded from: classes.dex */
public final class TextLayoutInput {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata and from toString */
    private final C1060d text;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final TextStyle style;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata and from toString */
    private final List<C1060d.Range<Placeholder>> placeholders;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata and from toString */
    private final int maxLines;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata and from toString */
    private final boolean softWrap;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata and from toString */
    private final int overflow;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.d density;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata and from toString */
    private final U0.t layoutDirection;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata and from toString */
    private final AbstractC1341l.b fontFamilyResolver;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata and from toString */
    private final long constraints;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1340k.b _developerSuppliedResourceLoader;

    public /* synthetic */ TextLayoutInput(C1060d c1060d, TextStyle j10, List list, int i10, boolean z10, int i11, U0.d dVar, U0.t tVar, AbstractC1341l.b bVar, long j11, C3854k c3854k) {
        this(c1060d, j10, list, i10, z10, i11, dVar, tVar, bVar, j11);
    }

    /* renamed from: a, reason: from getter */
    public final long getConstraints() {
        return this.constraints;
    }

    /* renamed from: b, reason: from getter */
    public final U0.d getDensity() {
        return this.density;
    }

    /* renamed from: c, reason: from getter */
    public final AbstractC1341l.b getFontFamilyResolver() {
        return this.fontFamilyResolver;
    }

    /* renamed from: d, reason: from getter */
    public final U0.t getLayoutDirection() {
        return this.layoutDirection;
    }

    /* renamed from: e, reason: from getter */
    public final int getMaxLines() {
        return this.maxLines;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TextLayoutInput)) {
            return false;
        }
        TextLayoutInput textLayoutInput = (TextLayoutInput) other;
        return C3862t.b(this.text, textLayoutInput.text) && C3862t.b(this.style, textLayoutInput.style) && C3862t.b(this.placeholders, textLayoutInput.placeholders) && this.maxLines == textLayoutInput.maxLines && this.softWrap == textLayoutInput.softWrap && R0.q.e(this.overflow, textLayoutInput.overflow) && C3862t.b(this.density, textLayoutInput.density) && this.layoutDirection == textLayoutInput.layoutDirection && C3862t.b(this.fontFamilyResolver, textLayoutInput.fontFamilyResolver) && U0.b.f(this.constraints, textLayoutInput.constraints);
    }

    /* renamed from: f, reason: from getter */
    public final int getOverflow() {
        return this.overflow;
    }

    public final List<C1060d.Range<Placeholder>> g() {
        return this.placeholders;
    }

    /* renamed from: h, reason: from getter */
    public final boolean getSoftWrap() {
        return this.softWrap;
    }

    public int hashCode() {
        return (((((((((((((((((this.text.hashCode() * 31) + this.style.hashCode()) * 31) + this.placeholders.hashCode()) * 31) + this.maxLines) * 31) + Boolean.hashCode(this.softWrap)) * 31) + R0.q.f(this.overflow)) * 31) + this.density.hashCode()) * 31) + this.layoutDirection.hashCode()) * 31) + this.fontFamilyResolver.hashCode()) * 31) + U0.b.o(this.constraints);
    }

    /* renamed from: i, reason: from getter */
    public final TextStyle getStyle() {
        return this.style;
    }

    /* renamed from: j, reason: from getter */
    public final C1060d getText() {
        return this.text;
    }

    public String toString() {
        return "TextLayoutInput(text=" + ((Object) this.text) + ", style=" + this.style + ", placeholders=" + this.placeholders + ", maxLines=" + this.maxLines + ", softWrap=" + this.softWrap + ", overflow=" + ((Object) R0.q.g(this.overflow)) + ", density=" + this.density + ", layoutDirection=" + this.layoutDirection + ", fontFamilyResolver=" + this.fontFamilyResolver + ", constraints=" + ((Object) U0.b.q(this.constraints)) + ')';
    }

    private TextLayoutInput(C1060d c1060d, TextStyle j10, List<C1060d.Range<Placeholder>> list, int i10, boolean z10, int i11, U0.d dVar, U0.t tVar, InterfaceC1340k.b bVar, AbstractC1341l.b bVar2, long j11) {
        this.text = c1060d;
        this.style = j10;
        this.placeholders = list;
        this.maxLines = i10;
        this.softWrap = z10;
        this.overflow = i11;
        this.density = dVar;
        this.layoutDirection = tVar;
        this.fontFamilyResolver = bVar2;
        this.constraints = j11;
        this._developerSuppliedResourceLoader = bVar;
    }

    private TextLayoutInput(C1060d c1060d, TextStyle j10, List<C1060d.Range<Placeholder>> list, int i10, boolean z10, int i11, U0.d dVar, U0.t tVar, AbstractC1341l.b bVar, long j11) {
        this(c1060d, j10, list, i10, z10, i11, dVar, tVar, (InterfaceC1340k.b) null, bVar, j11);
    }
}
