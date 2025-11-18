package m9;

import com.google.auto.value.AutoValue;
import m9.C4011a;
import m9.C4013c;

/* compiled from: PersistedInstallationEntry.java */
@AutoValue
/* renamed from: m9.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC4014d {

    /* renamed from: a, reason: collision with root package name */
    public static AbstractC4014d f45421a = a().a();

    /* compiled from: PersistedInstallationEntry.java */
    @AutoValue.Builder
    /* renamed from: m9.d$a */
    public static abstract class a {
        public abstract AbstractC4014d a();

        public abstract a b(String str);

        public abstract a c(long j10);

        public abstract a d(String str);

        public abstract a e(String str);

        public abstract a f(String str);

        public abstract a g(C4013c.a aVar);

        public abstract a h(long j10);
    }

    public static a a() {
        return new C4011a.b().h(0L).g(C4013c.a.ATTEMPT_MIGRATION).c(0L);
    }

    public abstract String b();

    public abstract long c();

    public abstract String d();

    public abstract String e();

    public abstract String f();

    public abstract C4013c.a g();

    public abstract long h();

    public boolean i() {
        return g() == C4013c.a.REGISTER_ERROR;
    }

    public boolean j() {
        return g() == C4013c.a.NOT_GENERATED || g() == C4013c.a.ATTEMPT_MIGRATION;
    }

    public boolean k() {
        return g() == C4013c.a.REGISTERED;
    }

    public boolean l() {
        return g() == C4013c.a.UNREGISTERED;
    }

    public boolean m() {
        return g() == C4013c.a.ATTEMPT_MIGRATION;
    }

    public abstract a n();

    public AbstractC4014d o(String str, long j10, long j11) {
        return n().b(str).c(j10).h(j11).a();
    }

    public AbstractC4014d p() {
        return n().b(null).a();
    }

    public AbstractC4014d q(String str) {
        return n().e(str).g(C4013c.a.REGISTER_ERROR).a();
    }

    public AbstractC4014d r() {
        return n().g(C4013c.a.NOT_GENERATED).a();
    }

    public AbstractC4014d s(String str, String str2, long j10, String str3, long j11) {
        return n().d(str).g(C4013c.a.REGISTERED).b(str3).f(str2).c(j11).h(j10).a();
    }

    public AbstractC4014d t(String str) {
        return n().d(str).g(C4013c.a.UNREGISTERED).a();
    }
}
