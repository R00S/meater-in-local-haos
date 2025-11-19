package Hb;

import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: TypeSubstitution.kt */
/* loaded from: classes3.dex */
public abstract class H0 {

    /* renamed from: a, reason: collision with root package name */
    public static final b f5659a = new b(null);

    /* renamed from: b, reason: collision with root package name */
    public static final H0 f5660b = new a();

    /* compiled from: TypeSubstitution.kt */
    public static final class a extends H0 {
        a() {
        }

        @Override // Hb.H0
        public /* bridge */ /* synthetic */ E0 e(U u10) {
            return (E0) i(u10);
        }

        @Override // Hb.H0
        public boolean f() {
            return true;
        }

        public Void i(U key) {
            C3862t.g(key, "key");
            return null;
        }

        public String toString() {
            return "Empty TypeSubstitution";
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class b {
        public /* synthetic */ b(C3854k c3854k) {
            this();
        }

        private b() {
        }
    }

    /* compiled from: TypeSubstitution.kt */
    public static final class c extends H0 {
        c() {
        }

        @Override // Hb.H0
        public boolean a() {
            return false;
        }

        @Override // Hb.H0
        public boolean b() {
            return false;
        }

        @Override // Hb.H0
        public Sa.h d(Sa.h annotations) {
            C3862t.g(annotations, "annotations");
            return H0.this.d(annotations);
        }

        @Override // Hb.H0
        public E0 e(U key) {
            C3862t.g(key, "key");
            return H0.this.e(key);
        }

        @Override // Hb.H0
        public boolean f() {
            return H0.this.f();
        }

        @Override // Hb.H0
        public U g(U topLevelType, Q0 position) {
            C3862t.g(topLevelType, "topLevelType");
            C3862t.g(position, "position");
            return H0.this.g(topLevelType, position);
        }
    }

    public boolean a() {
        return false;
    }

    public boolean b() {
        return false;
    }

    public final J0 c() {
        J0 j0G = J0.g(this);
        C3862t.f(j0G, "create(...)");
        return j0G;
    }

    public Sa.h d(Sa.h annotations) {
        C3862t.g(annotations, "annotations");
        return annotations;
    }

    public abstract E0 e(U u10);

    public boolean f() {
        return false;
    }

    public U g(U topLevelType, Q0 position) {
        C3862t.g(topLevelType, "topLevelType");
        C3862t.g(position, "position");
        return topLevelType;
    }

    public final H0 h() {
        return new c();
    }
}
