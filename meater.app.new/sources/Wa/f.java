package Wa;

import Ub.n;
import Xa.C1822f;
import jb.x;
import kb.C3816a;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;

/* compiled from: ReflectKotlinClass.kt */
/* loaded from: classes3.dex */
public final class f implements x {

    /* renamed from: c, reason: collision with root package name */
    public static final a f18482c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final Class<?> f18483a;

    /* renamed from: b, reason: collision with root package name */
    private final C3816a f18484b;

    /* compiled from: ReflectKotlinClass.kt */
    public static final class a {
        public /* synthetic */ a(C3854k c3854k) {
            this();
        }

        public final f a(Class<?> klass) {
            C3862t.g(klass, "klass");
            kb.b bVar = new kb.b();
            c.f18480a.b(klass, bVar);
            C3816a c3816aN = bVar.n();
            C3854k c3854k = null;
            if (c3816aN == null) {
                return null;
            }
            return new f(klass, c3816aN, c3854k);
        }

        private a() {
        }
    }

    public /* synthetic */ f(Class cls, C3816a c3816a, C3854k c3854k) {
        this(cls, c3816a);
    }

    @Override // jb.x
    public C3816a a() {
        return this.f18484b;
    }

    @Override // jb.x
    public void b(x.d visitor, byte[] bArr) {
        C3862t.g(visitor, "visitor");
        c.f18480a.i(this.f18483a, visitor);
    }

    @Override // jb.x
    public qb.b c() {
        return C1822f.e(this.f18483a);
    }

    @Override // jb.x
    public void d(x.c visitor, byte[] bArr) {
        C3862t.g(visitor, "visitor");
        c.f18480a.b(this.f18483a, visitor);
    }

    public final Class<?> e() {
        return this.f18483a;
    }

    public boolean equals(Object obj) {
        return (obj instanceof f) && C3862t.b(this.f18483a, ((f) obj).f18483a);
    }

    public int hashCode() {
        return this.f18483a.hashCode();
    }

    @Override // jb.x
    public String j() {
        StringBuilder sb2 = new StringBuilder();
        String name = this.f18483a.getName();
        C3862t.f(name, "getName(...)");
        sb2.append(n.B(name, '.', '/', false, 4, null));
        sb2.append(".class");
        return sb2.toString();
    }

    public String toString() {
        return f.class.getName() + ": " + this.f18483a;
    }

    private f(Class<?> cls, C3816a c3816a) {
        this.f18483a = cls;
        this.f18484b = c3816a;
    }
}
