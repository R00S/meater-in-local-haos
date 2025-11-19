package Hb;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: DisjointKeysUnionTypeSubstitution.kt */
/* loaded from: classes3.dex */
public final class E extends H0 {

    /* renamed from: e, reason: collision with root package name */
    public static final a f5653e = new a(null);

    /* renamed from: c, reason: collision with root package name */
    private final H0 f5654c;

    /* renamed from: d, reason: collision with root package name */
    private final H0 f5655d;

    /* compiled from: DisjointKeysUnionTypeSubstitution.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final H0 a(H0 first, H0 second) {
            C3862t.g(first, "first");
            C3862t.g(second, "second");
            return first.f() ? second : second.f() ? first : new E(first, second, null);
        }

        private a() {
        }
    }

    public /* synthetic */ E(H0 h02, H0 h03, C3854k c3854k) {
        this(h02, h03);
    }

    public static final H0 i(H0 h02, H0 h03) {
        return f5653e.a(h02, h03);
    }

    @Override // Hb.H0
    public boolean a() {
        return this.f5654c.a() || this.f5655d.a();
    }

    @Override // Hb.H0
    public boolean b() {
        return this.f5654c.b() || this.f5655d.b();
    }

    @Override // Hb.H0
    public Sa.h d(Sa.h annotations) {
        C3862t.g(annotations, "annotations");
        return this.f5655d.d(this.f5654c.d(annotations));
    }

    @Override // Hb.H0
    public E0 e(U key) {
        C3862t.g(key, "key");
        E0 e0E = this.f5654c.e(key);
        return e0E == null ? this.f5655d.e(key) : e0E;
    }

    @Override // Hb.H0
    public boolean f() {
        return false;
    }

    @Override // Hb.H0
    public U g(U topLevelType, Q0 position) {
        C3862t.g(topLevelType, "topLevelType");
        C3862t.g(position, "position");
        return this.f5655d.g(this.f5654c.g(topLevelType, position), position);
    }

    private E(H0 h02, H0 h03) {
        this.f5654c = h02;
        this.f5655d = h03;
    }
}
