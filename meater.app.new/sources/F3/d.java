package F3;

import F3.c;
import android.graphics.Rect;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: HardwareFoldingFeature.kt */
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 (2\u00020\u0001:\u0002\u0015\u0017B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0005\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u0007\u001a\u00020\u00068\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0014\u0010\"\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b \u0010!R\u0014\u0010$\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010#R\u0014\u0010'\u001a\u00020%8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010&¨\u0006)"}, d2 = {"LF3/d;", "LF3/c;", "LE3/b;", "featureBounds", "LF3/d$b;", "type", "LF3/c$b;", "state", "<init>", "(LE3/b;LF3/d$b;LF3/c$b;)V", "", "toString", "()Ljava/lang/String;", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "a", "LE3/b;", "b", "LF3/d$b;", "getType$window_release", "()LF3/d$b;", "c", "LF3/c$b;", "getState", "()LF3/c$b;", "Landroid/graphics/Rect;", "getBounds", "()Landroid/graphics/Rect;", "bounds", "()Z", "isSeparating", "LF3/c$a;", "()LF3/c$a;", "orientation", "d", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class d implements c {

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final E3.b featureBounds;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata and from toString */
    private final b type;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final c.b state;

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0000¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LF3/d$a;", "", "<init>", "()V", "LE3/b;", "bounds", "Loa/F;", "a", "(LE3/b;)V", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: F3.d$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        public final void a(E3.b bounds) {
            C3862t.g(bounds, "bounds");
            if (bounds.d() == 0 && bounds.a() == 0) {
                throw new IllegalArgumentException("Bounds must be non zero");
            }
            if (bounds.getLeft() != 0 && bounds.getTop() != 0) {
                throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features");
            }
        }

        private Companion() {
        }
    }

    /* compiled from: HardwareFoldingFeature.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \n2\u00020\u0001:\u0001\bB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0006\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"LF3/d$b;", "", "", "description", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "a", "Ljava/lang/String;", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class b {

        /* renamed from: b, reason: collision with root package name and from kotlin metadata */
        public static final Companion INSTANCE = new Companion(null);

        /* renamed from: c, reason: collision with root package name */
        private static final b f4493c = new b("FOLD");

        /* renamed from: d, reason: collision with root package name */
        private static final b f4494d = new b("HINGE");

        /* renamed from: a, reason: collision with root package name and from kotlin metadata */
        private final String description;

        /* compiled from: HardwareFoldingFeature.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010\u0006\u001a\u0004\b\n\u0010\b¨\u0006\u000b"}, d2 = {"LF3/d$b$a;", "", "<init>", "()V", "LF3/d$b;", "FOLD", "LF3/d$b;", "a", "()LF3/d$b;", "HINGE", "b", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        /* renamed from: F3.d$b$a, reason: from kotlin metadata */
        public static final class Companion {
            public /* synthetic */ Companion(C3854k c3854k) {
                this();
            }

            public final b a() {
                return b.f4493c;
            }

            public final b b() {
                return b.f4494d;
            }

            private Companion() {
            }
        }

        private b(String str) {
            this.description = str;
        }

        /* renamed from: toString, reason: from getter */
        public String getDescription() {
            return this.description;
        }
    }

    public d(E3.b featureBounds, b type, c.b state) {
        C3862t.g(featureBounds, "featureBounds");
        C3862t.g(type, "type");
        C3862t.g(state, "state");
        this.featureBounds = featureBounds;
        this.type = type;
        this.state = state;
        INSTANCE.a(featureBounds);
    }

    @Override // F3.c
    public boolean a() {
        b bVar = this.type;
        b.Companion companion = b.INSTANCE;
        if (C3862t.b(bVar, companion.b())) {
            return true;
        }
        return C3862t.b(this.type, companion.a()) && C3862t.b(getState(), c.b.f4486d);
    }

    @Override // F3.c
    public c.a c() {
        return this.featureBounds.d() > this.featureBounds.a() ? c.a.f4482d : c.a.f4481c;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!C3862t.b(d.class, other != null ? other.getClass() : null)) {
            return false;
        }
        C3862t.e(other, "null cannot be cast to non-null type androidx.window.layout.HardwareFoldingFeature");
        d dVar = (d) other;
        return C3862t.b(this.featureBounds, dVar.featureBounds) && C3862t.b(this.type, dVar.type) && C3862t.b(getState(), dVar.getState());
    }

    @Override // F3.a
    public Rect getBounds() {
        return this.featureBounds.f();
    }

    @Override // F3.c
    public c.b getState() {
        return this.state;
    }

    public int hashCode() {
        return (((this.featureBounds.hashCode() * 31) + this.type.hashCode()) * 31) + getState().hashCode();
    }

    public String toString() {
        return d.class.getSimpleName() + " { " + this.featureBounds + ", type=" + this.type + ", state=" + getState() + " }";
    }
}
