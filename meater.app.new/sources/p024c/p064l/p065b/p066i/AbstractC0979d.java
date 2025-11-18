package p024c.p064l.p065b.p066i;

import java.util.Map;
import kotlin.collections.C10810q0;
import kotlin.jvm.internal.C9801m;

/* compiled from: Preferences.kt */
/* renamed from: c.l.b.i.d */
/* loaded from: classes.dex */
public abstract class AbstractC0979d {

    /* compiled from: Preferences.kt */
    /* renamed from: c.l.b.i.d$a */
    public static final class a<T> {

        /* renamed from: a */
        private final String f6491a;

        public a(String str) {
            C9801m.m32346f(str, "name");
            this.f6491a = str;
        }

        /* renamed from: a */
        public final String m6251a() {
            return this.f6491a;
        }

        public boolean equals(Object obj) {
            if (obj instanceof a) {
                return C9801m.m32341a(this.f6491a, ((a) obj).f6491a);
            }
            return false;
        }

        public int hashCode() {
            return this.f6491a.hashCode();
        }

        public String toString() {
            return this.f6491a;
        }
    }

    /* compiled from: Preferences.kt */
    /* renamed from: c.l.b.i.d$b */
    public static final class b<T> {

        /* renamed from: a */
        private final a<T> f6492a;

        /* renamed from: b */
        private final T f6493b;

        /* renamed from: a */
        public final a<T> m6252a() {
            return this.f6492a;
        }

        /* renamed from: b */
        public final T m6253b() {
            return this.f6493b;
        }
    }

    /* renamed from: a */
    public abstract Map<a<?>, Object> mo6237a();

    /* renamed from: b */
    public abstract <T> T mo6238b(a<T> aVar);

    /* renamed from: c */
    public final C0976a m6249c() {
        return new C0976a(C10810q0.m38809u(mo6237a()), false);
    }

    /* renamed from: d */
    public final AbstractC0979d m6250d() {
        return new C0976a(C10810q0.m38809u(mo6237a()), true);
    }
}
