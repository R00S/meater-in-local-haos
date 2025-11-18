package w;

import android.content.Context;
import android.widget.EdgeEffect;
import kotlin.Metadata;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0015\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0018\b\u0002\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\rJ\r\u0010\u000f\u001a\u00020\u000b¢\u0006\u0004\b\u000f\u0010\rJ\r\u0010\u0010\u001a\u00020\u000b¢\u0006\u0004\b\u0010\u0010\rJ\r\u0010\u0011\u001a\u00020\u000b¢\u0006\u0004\b\u0011\u0010\rJ\r\u0010\u0012\u001a\u00020\u000b¢\u0006\u0004\b\u0012\u0010\rJ\r\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0013\u0010\rJ\r\u0010\u0014\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\rJ\r\u0010\u0015\u001a\u00020\u000b¢\u0006\u0004\b\u0015\u0010\rJ\r\u0010\u0016\u001a\u00020\u000b¢\u0006\u0004\b\u0016\u0010\rJ\r\u0010\u0017\u001a\u00020\u000b¢\u0006\u0004\b\u0017\u0010\rJ\r\u0010\u0018\u001a\u00020\u000b¢\u0006\u0004\b\u0018\u0010\rJ\r\u0010\u0019\u001a\u00020\b¢\u0006\u0004\b\u0019\u0010\nJ\r\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001a\u0010\nJ\r\u0010\u001b\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\nJ\r\u0010\u001c\u001a\u00020\b¢\u0006\u0004\b\u001c\u0010\nJ\r\u0010\u001d\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\nJ\r\u0010\u001e\u001a\u00020\b¢\u0006\u0004\b\u001e\u0010\nJ\r\u0010\u001f\u001a\u00020\b¢\u0006\u0004\b\u001f\u0010\nJ\r\u0010 \u001a\u00020\b¢\u0006\u0004\b \u0010\nJ\u0018\u0010$\u001a\u00020#2\u0006\u0010\"\u001a\u00020!ø\u0001\u0000¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001c\u0010\"\u001a\u00020!8\u0002@\u0002X\u0082\u000eø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b*\u0010+R\u0018\u0010.\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b,\u0010-R\u0018\u0010/\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010-R\u0018\u00100\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010-R\u0018\u00101\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010-R\u0018\u00102\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001b\u0010-R\u0018\u00103\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010-R\u0018\u00104\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0018\u00105\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010-R\u001a\u00108\u001a\u00020\u000b*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b6\u00107R\u001a\u0010:\u001a\u00020\u000b*\u0004\u0018\u00010\b8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b9\u00107\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006;"}, d2 = {"Lw/q;", "", "Landroid/content/Context;", "context", "", "glowColor", "<init>", "(Landroid/content/Context;I)V", "Landroid/widget/EdgeEffect;", "e", "()Landroid/widget/EdgeEffect;", "", "A", "()Z", "q", "t", "w", "z", "p", "s", "v", "y", "o", "r", "u", "l", "f", "h", "j", "m", "g", "i", "k", "LU0/r;", "size", "Loa/F;", "B", "(J)V", "a", "Landroid/content/Context;", "b", "I", "c", "J", "d", "Landroid/widget/EdgeEffect;", "topEffect", "bottomEffect", "leftEffect", "rightEffect", "topEffectNegation", "bottomEffectNegation", "leftEffectNegation", "rightEffectNegation", "x", "(Landroid/widget/EdgeEffect;)Z", "isStretched", "n", "isAnimating", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class q {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Context context;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final int glowColor;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private long size = U0.r.INSTANCE.a();

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffect;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffect;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffect;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffect;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect topEffectNegation;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect bottomEffectNegation;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect leftEffectNegation;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private EdgeEffect rightEffectNegation;

    public q(Context context, int i10) {
        this.context = context;
        this.glowColor = i10;
    }

    private final EdgeEffect e() {
        EdgeEffect edgeEffectA = p.f51723a.a(this.context);
        edgeEffectA.setColor(this.glowColor);
        if (!U0.r.e(this.size, U0.r.INSTANCE.a())) {
            edgeEffectA.setSize(U0.r.g(this.size), U0.r.f(this.size));
        }
        return edgeEffectA;
    }

    private final boolean n(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !edgeEffect.isFinished();
    }

    private final boolean x(EdgeEffect edgeEffect) {
        if (edgeEffect == null) {
            return false;
        }
        return !(p.f51723a.b(edgeEffect) == 0.0f);
    }

    public final boolean A() {
        return x(this.topEffect);
    }

    public final void B(long size) {
        this.size = size;
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            edgeEffect.setSize(U0.r.g(size), U0.r.f(size));
        }
        EdgeEffect edgeEffect2 = this.bottomEffect;
        if (edgeEffect2 != null) {
            edgeEffect2.setSize(U0.r.g(size), U0.r.f(size));
        }
        EdgeEffect edgeEffect3 = this.leftEffect;
        if (edgeEffect3 != null) {
            edgeEffect3.setSize(U0.r.f(size), U0.r.g(size));
        }
        EdgeEffect edgeEffect4 = this.rightEffect;
        if (edgeEffect4 != null) {
            edgeEffect4.setSize(U0.r.f(size), U0.r.g(size));
        }
        EdgeEffect edgeEffect5 = this.topEffectNegation;
        if (edgeEffect5 != null) {
            edgeEffect5.setSize(U0.r.g(size), U0.r.f(size));
        }
        EdgeEffect edgeEffect6 = this.bottomEffectNegation;
        if (edgeEffect6 != null) {
            edgeEffect6.setSize(U0.r.g(size), U0.r.f(size));
        }
        EdgeEffect edgeEffect7 = this.leftEffectNegation;
        if (edgeEffect7 != null) {
            edgeEffect7.setSize(U0.r.f(size), U0.r.g(size));
        }
        EdgeEffect edgeEffect8 = this.rightEffectNegation;
        if (edgeEffect8 != null) {
            edgeEffect8.setSize(U0.r.f(size), U0.r.g(size));
        }
    }

    public final EdgeEffect f() {
        EdgeEffect edgeEffect = this.bottomEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.bottomEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect g() {
        EdgeEffect edgeEffect = this.bottomEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.bottomEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect h() {
        EdgeEffect edgeEffect = this.leftEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.leftEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect i() {
        EdgeEffect edgeEffect = this.leftEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.leftEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect j() {
        EdgeEffect edgeEffect = this.rightEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.rightEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect k() {
        EdgeEffect edgeEffect = this.rightEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.rightEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect l() {
        EdgeEffect edgeEffect = this.topEffect;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.topEffect = edgeEffectE;
        return edgeEffectE;
    }

    public final EdgeEffect m() {
        EdgeEffect edgeEffect = this.topEffectNegation;
        if (edgeEffect != null) {
            return edgeEffect;
        }
        EdgeEffect edgeEffectE = e();
        this.topEffectNegation = edgeEffectE;
        return edgeEffectE;
    }

    public final boolean o() {
        return n(this.bottomEffect);
    }

    public final boolean p() {
        return x(this.bottomEffectNegation);
    }

    public final boolean q() {
        return x(this.bottomEffect);
    }

    public final boolean r() {
        return n(this.leftEffect);
    }

    public final boolean s() {
        return x(this.leftEffectNegation);
    }

    public final boolean t() {
        return x(this.leftEffect);
    }

    public final boolean u() {
        return n(this.rightEffect);
    }

    public final boolean v() {
        return x(this.rightEffectNegation);
    }

    public final boolean w() {
        return x(this.rightEffect);
    }

    public final boolean y() {
        return n(this.topEffect);
    }

    public final boolean z() {
        return x(this.topEffectNegation);
    }
}
