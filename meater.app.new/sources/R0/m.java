package R0;

import i0.AbstractC3582j0;
import i0.C3602t0;
import i0.SolidColor;
import i0.a1;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: TextForegroundStyle.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0006\b`\u0018\u0000 \u00142\u00020\u0001:\u0002\u0014\u0015J\u0017\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u001d\u0010\u0006\u001a\u00020\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00000\u0005H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u000b\u001a\u00020\b8&X¦\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8&X¦\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000eR\u0014\u0010\u0013\u001a\u00020\u00108&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012ø\u0001\u0002\u0082\u0002\u0011\n\u0005\b¡\u001e0\u0001\n\u0002\b!\n\u0004\b!0\u0001¨\u0006\u0016À\u0006\u0001"}, d2 = {"LR0/m;", "", "other", "g", "(LR0/m;)LR0/m;", "Lkotlin/Function0;", "f", "(LBa/a;)LR0/m;", "Li0/t0;", "e", "()J", "color", "Li0/j0;", "h", "()Li0/j0;", "brush", "", "d", "()F", "alpha", "a", "b", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public interface m {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = Companion.f14742a;

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004ø\u0001\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\r\u001a\u00020\u00062\b\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u0082\u0002\u0007\n\u0005\b¡\u001e0\u0001¨\u0006\u000f"}, d2 = {"LR0/m$a;", "", "<init>", "()V", "Li0/t0;", "color", "LR0/m;", "b", "(J)LR0/m;", "Li0/j0;", "brush", "", "alpha", "a", "(Li0/j0;F)LR0/m;", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: R0.m$a, reason: from kotlin metadata */
    public static final class Companion {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ Companion f14742a = new Companion();

        private Companion() {
        }

        public final m a(AbstractC3582j0 brush, float alpha) {
            if (brush == null) {
                return b.f14743b;
            }
            if (brush instanceof SolidColor) {
                return b(l.b(((SolidColor) brush).getValue(), alpha));
            }
            if (brush instanceof a1) {
                return new BrushStyle((a1) brush, alpha);
            }
            throw new NoWhenBranchMatchedException();
        }

        public final m b(long color) {
            return color != 16 ? new ColorStyle(color, null) : b.f14743b;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0007\u001a\u00020\u00048VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0014\u0010\u000f\u001a\u00020\f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000e\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\u0010"}, d2 = {"LR0/m$b;", "LR0/m;", "<init>", "()V", "Li0/t0;", "e", "()J", "color", "Li0/j0;", "h", "()Li0/j0;", "brush", "", "d", "()F", "alpha", "ui-text_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b implements m {

        /* renamed from: b, reason: collision with root package name */
        public static final b f14743b = new b();

        private b() {
        }

        @Override // R0.m
        /* renamed from: d */
        public float getAlpha() {
            return Float.NaN;
        }

        @Override // R0.m
        /* renamed from: e */
        public long getValue() {
            return C3602t0.INSTANCE.e();
        }

        @Override // R0.m
        public AbstractC3582j0 h() {
            return null;
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "a", "()Ljava/lang/Float;"}, k = 3, mv = {1, 8, 0})
    static final class c extends AbstractC3864v implements Ba.a<Float> {
        c() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Float invoke() {
            return Float.valueOf(m.this.getAlpha());
        }
    }

    /* compiled from: TextForegroundStyle.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"LR0/m;", "a", "()LR0/m;"}, k = 3, mv = {1, 8, 0})
    static final class d extends AbstractC3864v implements Ba.a<m> {
        d() {
            super(0);
        }

        @Override // Ba.a
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final m invoke() {
            return m.this;
        }
    }

    /* renamed from: d */
    float getAlpha();

    /* renamed from: e */
    long getValue();

    default m f(Ba.a<? extends m> other) {
        return !C3862t.b(this, b.f14743b) ? this : other.invoke();
    }

    default m g(m other) {
        boolean z10 = other instanceof BrushStyle;
        return (z10 && (this instanceof BrushStyle)) ? new BrushStyle(((BrushStyle) other).getValue(), l.c(other.getAlpha(), new c())) : (!z10 || (this instanceof BrushStyle)) ? (z10 || !(this instanceof BrushStyle)) ? other.f(new d()) : this : other;
    }

    AbstractC3582j0 h();
}
