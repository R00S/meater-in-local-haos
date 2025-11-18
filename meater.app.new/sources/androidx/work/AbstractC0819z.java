package androidx.work;

import android.os.Build;
import androidx.work.impl.p016n.C0775p;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkRequest.java */
/* renamed from: androidx.work.z */
/* loaded from: classes.dex */
public abstract class AbstractC0819z {

    /* renamed from: a */
    private UUID f5003a;

    /* renamed from: b */
    private C0775p f5004b;

    /* renamed from: c */
    private Set<String> f5005c;

    /* compiled from: WorkRequest.java */
    /* renamed from: androidx.work.z$a */
    public static abstract class a<B extends a<?, ?>, W extends AbstractC0819z> {

        /* renamed from: c */
        C0775p f5008c;

        /* renamed from: e */
        Class<? extends ListenableWorker> f5010e;

        /* renamed from: a */
        boolean f5006a = false;

        /* renamed from: d */
        Set<String> f5009d = new HashSet();

        /* renamed from: b */
        UUID f5007b = UUID.randomUUID();

        a(Class<? extends ListenableWorker> cls) {
            this.f5010e = cls;
            this.f5008c = new C0775p(this.f5007b.toString(), cls.getName());
            m5245a(cls.getName());
        }

        /* renamed from: a */
        public final B m5245a(String str) {
            this.f5009d.add(str);
            return (B) mo5231d();
        }

        /* renamed from: b */
        public final W m5246b() {
            W w = (W) mo5230c();
            C0704c c0704c = this.f5008c.f4808l;
            int i2 = Build.VERSION.SDK_INT;
            boolean z = (i2 >= 24 && c0704c.m4803e()) || c0704c.m4804f() || c0704c.m4805g() || (i2 >= 23 && c0704c.m4806h());
            C0775p c0775p = this.f5008c;
            if (c0775p.f4815s) {
                if (z) {
                    throw new IllegalArgumentException("Expedited jobs only support network and storage constraints");
                }
                if (c0775p.f4805i > 0) {
                    throw new IllegalArgumentException("Expedited jobs cannot be delayed");
                }
            }
            this.f5007b = UUID.randomUUID();
            C0775p c0775p2 = new C0775p(this.f5008c);
            this.f5008c = c0775p2;
            c0775p2.f4799c = this.f5007b.toString();
            return w;
        }

        /* renamed from: c */
        abstract W mo5230c();

        /* renamed from: d */
        abstract B mo5231d();

        /* renamed from: e */
        public final B m5247e(C0704c c0704c) {
            this.f5008c.f4808l = c0704c;
            return (B) mo5231d();
        }

        /* renamed from: f */
        public B m5248f(long j2, TimeUnit timeUnit) {
            this.f5008c.f4805i = timeUnit.toMillis(j2);
            if (Long.MAX_VALUE - System.currentTimeMillis() > this.f5008c.f4805i) {
                return (B) mo5231d();
            }
            throw new IllegalArgumentException("The given initial delay is too large and will cause an overflow!");
        }

        /* renamed from: g */
        public final B m5249g(C0706e c0706e) {
            this.f5008c.f4803g = c0706e;
            return (B) mo5231d();
        }
    }

    protected AbstractC0819z(UUID uuid, C0775p c0775p, Set<String> set) {
        this.f5003a = uuid;
        this.f5004b = c0775p;
        this.f5005c = set;
    }

    /* renamed from: a */
    public String m5242a() {
        return this.f5003a.toString();
    }

    /* renamed from: b */
    public Set<String> m5243b() {
        return this.f5005c;
    }

    /* renamed from: c */
    public C0775p m5244c() {
        return this.f5004b;
    }
}
