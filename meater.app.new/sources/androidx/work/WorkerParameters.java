package androidx.work;

import android.net.Network;
import android.net.Uri;
import androidx.work.impl.utils.p018p.InterfaceC0799a;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.Executor;

/* loaded from: classes.dex */
public final class WorkerParameters {

    /* renamed from: a */
    private UUID f4448a;

    /* renamed from: b */
    private C0706e f4449b;

    /* renamed from: c */
    private Set<String> f4450c;

    /* renamed from: d */
    private C0700a f4451d;

    /* renamed from: e */
    private int f4452e;

    /* renamed from: f */
    private Executor f4453f;

    /* renamed from: g */
    private InterfaceC0799a f4454g;

    /* renamed from: h */
    private AbstractC0702a0 f4455h;

    /* renamed from: i */
    private InterfaceC0813t f4456i;

    /* renamed from: j */
    private InterfaceC0710i f4457j;

    /* renamed from: androidx.work.WorkerParameters$a */
    public static class C0700a {

        /* renamed from: a */
        public List<String> f4458a = Collections.emptyList();

        /* renamed from: b */
        public List<Uri> f4459b = Collections.emptyList();

        /* renamed from: c */
        public Network f4460c;
    }

    public WorkerParameters(UUID uuid, C0706e c0706e, Collection<String> collection, C0700a c0700a, int i2, Executor executor, InterfaceC0799a interfaceC0799a, AbstractC0702a0 abstractC0702a0, InterfaceC0813t interfaceC0813t, InterfaceC0710i interfaceC0710i) {
        this.f4448a = uuid;
        this.f4449b = c0706e;
        this.f4450c = new HashSet(collection);
        this.f4451d = c0700a;
        this.f4452e = i2;
        this.f4453f = executor;
        this.f4454g = interfaceC0799a;
        this.f4455h = abstractC0702a0;
        this.f4456i = interfaceC0813t;
        this.f4457j = interfaceC0710i;
    }

    /* renamed from: a */
    public Executor m4770a() {
        return this.f4453f;
    }

    /* renamed from: b */
    public InterfaceC0710i m4771b() {
        return this.f4457j;
    }

    /* renamed from: c */
    public UUID m4772c() {
        return this.f4448a;
    }

    /* renamed from: d */
    public C0706e m4773d() {
        return this.f4449b;
    }

    /* renamed from: e */
    public Network m4774e() {
        return this.f4451d.f4460c;
    }

    /* renamed from: f */
    public InterfaceC0813t m4775f() {
        return this.f4456i;
    }

    /* renamed from: g */
    public int m4776g() {
        return this.f4452e;
    }

    /* renamed from: h */
    public Set<String> m4777h() {
        return this.f4450c;
    }

    /* renamed from: i */
    public InterfaceC0799a m4778i() {
        return this.f4454g;
    }

    /* renamed from: j */
    public List<String> m4779j() {
        return this.f4451d.f4458a;
    }

    /* renamed from: k */
    public List<Uri> m4780k() {
        return this.f4451d.f4459b;
    }

    /* renamed from: l */
    public AbstractC0702a0 m4781l() {
        return this.f4455h;
    }
}
