package com.bumptech.glide.load.engine;

import android.os.Build;
import android.util.Log;
import com.bumptech.glide.C5351e;
import com.bumptech.glide.EnumC5353g;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.C5425h;
import com.bumptech.glide.load.C5426i;
import com.bumptech.glide.load.EnumC5365a;
import com.bumptech.glide.load.EnumC5367c;
import com.bumptech.glide.load.InterfaceC5423f;
import com.bumptech.glide.load.InterfaceC5428k;
import com.bumptech.glide.load.InterfaceC5429l;
import com.bumptech.glide.load.engine.C5392i;
import com.bumptech.glide.load.engine.InterfaceC5389f;
import com.bumptech.glide.load.engine.p123a0.InterfaceC5372a;
import com.bumptech.glide.load.p127m.InterfaceC5433d;
import com.bumptech.glide.load.p127m.InterfaceC5434e;
import com.bumptech.glide.load.p131o.p132c.C5491l;
import com.bumptech.glide.p145r.C5592f;
import com.bumptech.glide.p145r.p146l.AbstractC5600c;
import com.bumptech.glide.p145r.p146l.C5598a;
import com.bumptech.glide.p145r.p146l.C5599b;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import okhttp3.HttpUrl;
import p024c.p052i.p059j.InterfaceC0956f;

/* compiled from: DecodeJob.java */
/* renamed from: com.bumptech.glide.load.engine.h */
/* loaded from: classes.dex */
class RunnableC5391h<R> implements InterfaceC5389f.a, Runnable, Comparable<RunnableC5391h<?>>, C5598a.f {

    /* renamed from: A */
    private Object f13336A;

    /* renamed from: B */
    private Thread f13337B;

    /* renamed from: C */
    private InterfaceC5423f f13338C;

    /* renamed from: D */
    private InterfaceC5423f f13339D;

    /* renamed from: E */
    private Object f13340E;

    /* renamed from: F */
    private EnumC5365a f13341F;

    /* renamed from: G */
    private InterfaceC5433d<?> f13342G;

    /* renamed from: H */
    private volatile InterfaceC5389f f13343H;

    /* renamed from: I */
    private volatile boolean f13344I;

    /* renamed from: J */
    private volatile boolean f13345J;

    /* renamed from: i */
    private final e f13349i;

    /* renamed from: j */
    private final InterfaceC0956f<RunnableC5391h<?>> f13350j;

    /* renamed from: m */
    private C5351e f13353m;

    /* renamed from: n */
    private InterfaceC5423f f13354n;

    /* renamed from: o */
    private EnumC5353g f13355o;

    /* renamed from: p */
    private C5397n f13356p;

    /* renamed from: q */
    private int f13357q;

    /* renamed from: r */
    private int f13358r;

    /* renamed from: s */
    private AbstractC5393j f13359s;

    /* renamed from: t */
    private C5426i f13360t;

    /* renamed from: u */
    private b<R> f13361u;

    /* renamed from: v */
    private int f13362v;

    /* renamed from: w */
    private h f13363w;

    /* renamed from: x */
    private g f13364x;

    /* renamed from: y */
    private long f13365y;

    /* renamed from: z */
    private boolean f13366z;

    /* renamed from: f */
    private final C5390g<R> f13346f = new C5390g<>();

    /* renamed from: g */
    private final List<Throwable> f13347g = new ArrayList();

    /* renamed from: h */
    private final AbstractC5600c f13348h = AbstractC5600c.m11078a();

    /* renamed from: k */
    private final d<?> f13351k = new d<>();

    /* renamed from: l */
    private final f f13352l = new f();

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f13367a;

        /* renamed from: b */
        static final /* synthetic */ int[] f13368b;

        /* renamed from: c */
        static final /* synthetic */ int[] f13369c;

        static {
            int[] iArr = new int[EnumC5367c.values().length];
            f13369c = iArr;
            try {
                iArr[EnumC5367c.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f13369c[EnumC5367c.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[h.values().length];
            f13368b = iArr2;
            try {
                iArr2[h.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f13368b[h.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f13368b[h.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f13368b[h.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f13368b[h.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[g.values().length];
            f13367a = iArr3;
            try {
                iArr3[g.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f13367a[g.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f13367a[g.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$b */
    interface b<R> {
        /* renamed from: a */
        void mo10281a(GlideException glideException);

        /* renamed from: b */
        void mo10282b(InterfaceC5404u<R> interfaceC5404u, EnumC5365a enumC5365a);

        /* renamed from: c */
        void mo10283c(RunnableC5391h<?> runnableC5391h);
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$c */
    private final class c<Z> implements C5392i.a<Z> {

        /* renamed from: a */
        private final EnumC5365a f13370a;

        c(EnumC5365a enumC5365a) {
            this.f13370a = enumC5365a;
        }

        @Override // com.bumptech.glide.load.engine.C5392i.a
        /* renamed from: a */
        public InterfaceC5404u<Z> mo10284a(InterfaceC5404u<Z> interfaceC5404u) {
            return RunnableC5391h.this.m10276Q(this.f13370a, interfaceC5404u);
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$d */
    private static class d<Z> {

        /* renamed from: a */
        private InterfaceC5423f f13372a;

        /* renamed from: b */
        private InterfaceC5428k<Z> f13373b;

        /* renamed from: c */
        private C5403t<Z> f13374c;

        d() {
        }

        /* renamed from: a */
        void m10285a() {
            this.f13372a = null;
            this.f13373b = null;
            this.f13374c = null;
        }

        /* renamed from: b */
        void m10286b(e eVar, C5426i c5426i) {
            C5599b.m11074a("DecodeJob.encode");
            try {
                eVar.mo10289a().mo10179a(this.f13372a, new C5388e(this.f13373b, this.f13374c, c5426i));
            } finally {
                this.f13374c.m10356g();
                C5599b.m11077d();
            }
        }

        /* renamed from: c */
        boolean m10287c() {
            return this.f13374c != null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: d */
        <X> void m10288d(InterfaceC5423f interfaceC5423f, InterfaceC5428k<X> interfaceC5428k, C5403t<X> c5403t) {
            this.f13372a = interfaceC5423f;
            this.f13373b = interfaceC5428k;
            this.f13374c = c5403t;
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$e */
    interface e {
        /* renamed from: a */
        InterfaceC5372a mo10289a();
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$f */
    private static class f {

        /* renamed from: a */
        private boolean f13375a;

        /* renamed from: b */
        private boolean f13376b;

        /* renamed from: c */
        private boolean f13377c;

        f() {
        }

        /* renamed from: a */
        private boolean m10290a(boolean z) {
            return (this.f13377c || z || this.f13376b) && this.f13375a;
        }

        /* renamed from: b */
        synchronized boolean m10291b() {
            this.f13376b = true;
            return m10290a(false);
        }

        /* renamed from: c */
        synchronized boolean m10292c() {
            this.f13377c = true;
            return m10290a(false);
        }

        /* renamed from: d */
        synchronized boolean m10293d(boolean z) {
            this.f13375a = true;
            return m10290a(z);
        }

        /* renamed from: e */
        synchronized void m10294e() {
            this.f13376b = false;
            this.f13375a = false;
            this.f13377c = false;
        }
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$g */
    private enum g {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* compiled from: DecodeJob.java */
    /* renamed from: com.bumptech.glide.load.engine.h$h */
    private enum h {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    RunnableC5391h(e eVar, InterfaceC0956f<RunnableC5391h<?>> interfaceC0956f) {
        this.f13349i = eVar;
        this.f13350j = interfaceC0956f;
    }

    /* renamed from: A */
    private <Data> InterfaceC5404u<R> m10256A(Data data, EnumC5365a enumC5365a) throws GlideException {
        return m10271U(data, enumC5365a, this.f13346f.m10239h(data.getClass()));
    }

    /* renamed from: D */
    private void m10257D() {
        if (Log.isLoggable("DecodeJob", 2)) {
            m10263K("Retrieved data", this.f13365y, "data: " + this.f13340E + ", cache key: " + this.f13338C + ", fetcher: " + this.f13342G);
        }
        InterfaceC5404u<R> interfaceC5404uM10274y = null;
        try {
            interfaceC5404uM10274y = m10274y(this.f13342G, this.f13340E, this.f13341F);
        } catch (GlideException e2) {
            e2.m10167i(this.f13339D, this.f13341F);
            this.f13347g.add(e2);
        }
        if (interfaceC5404uM10274y != null) {
            m10265M(interfaceC5404uM10274y, this.f13341F);
        } else {
            m10270T();
        }
    }

    /* renamed from: E */
    private InterfaceC5389f m10258E() {
        int i2 = a.f13368b[this.f13363w.ordinal()];
        if (i2 == 1) {
            return new C5405v(this.f13346f, this);
        }
        if (i2 == 2) {
            return new C5385c(this.f13346f, this);
        }
        if (i2 == 3) {
            return new C5408y(this.f13346f, this);
        }
        if (i2 == 4) {
            return null;
        }
        throw new IllegalStateException("Unrecognized stage: " + this.f13363w);
    }

    /* renamed from: F */
    private h m10259F(h hVar) {
        int i2 = a.f13368b[hVar.ordinal()];
        if (i2 == 1) {
            return this.f13359s.mo10298a() ? h.DATA_CACHE : m10259F(h.DATA_CACHE);
        }
        if (i2 == 2) {
            return this.f13366z ? h.FINISHED : h.SOURCE;
        }
        if (i2 == 3 || i2 == 4) {
            return h.FINISHED;
        }
        if (i2 == 5) {
            return this.f13359s.mo10299b() ? h.RESOURCE_CACHE : m10259F(h.RESOURCE_CACHE);
        }
        throw new IllegalArgumentException("Unrecognized stage: " + hVar);
    }

    /* renamed from: G */
    private C5426i m10260G(EnumC5365a enumC5365a) {
        C5426i c5426i = this.f13360t;
        if (Build.VERSION.SDK_INT < 26) {
            return c5426i;
        }
        boolean z = enumC5365a == EnumC5365a.RESOURCE_DISK_CACHE || this.f13346f.m10254w();
        C5425h<Boolean> c5425h = C5491l.f13741d;
        Boolean bool = (Boolean) c5426i.m10449a(c5425h);
        if (bool != null && (!bool.booleanValue() || z)) {
            return c5426i;
        }
        C5426i c5426i2 = new C5426i();
        c5426i2.m10450b(this.f13360t);
        c5426i2.m10451c(c5425h, Boolean.valueOf(z));
        return c5426i2;
    }

    /* renamed from: H */
    private int m10261H() {
        return this.f13355o.ordinal();
    }

    /* renamed from: J */
    private void m10262J(String str, long j2) {
        m10263K(str, j2, null);
    }

    /* renamed from: K */
    private void m10263K(String str, long j2, String str2) {
        String str3;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(C5592f.m11027a(j2));
        sb.append(", load key: ");
        sb.append(this.f13356p);
        if (str2 != null) {
            str3 = ", " + str2;
        } else {
            str3 = HttpUrl.FRAGMENT_ENCODE_SET;
        }
        sb.append(str3);
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
        Log.v("DecodeJob", sb.toString());
    }

    /* renamed from: L */
    private void m10264L(InterfaceC5404u<R> interfaceC5404u, EnumC5365a enumC5365a) {
        m10273W();
        this.f13361u.mo10282b(interfaceC5404u, enumC5365a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: M */
    private void m10265M(InterfaceC5404u<R> interfaceC5404u, EnumC5365a enumC5365a) {
        if (interfaceC5404u instanceof InterfaceC5400q) {
            ((InterfaceC5400q) interfaceC5404u).mo10346a();
        }
        C5403t c5403t = 0;
        if (this.f13351k.m10287c()) {
            interfaceC5404u = C5403t.m10354b(interfaceC5404u);
            c5403t = interfaceC5404u;
        }
        m10264L(interfaceC5404u, enumC5365a);
        this.f13363w = h.ENCODE;
        try {
            if (this.f13351k.m10287c()) {
                this.f13351k.m10286b(this.f13349i, this.f13360t);
            }
            m10267O();
        } finally {
            if (c5403t != 0) {
                c5403t.m10356g();
            }
        }
    }

    /* renamed from: N */
    private void m10266N() {
        m10273W();
        this.f13361u.mo10281a(new GlideException("Failed to load resource", new ArrayList(this.f13347g)));
        m10268P();
    }

    /* renamed from: O */
    private void m10267O() {
        if (this.f13352l.m10291b()) {
            m10269S();
        }
    }

    /* renamed from: P */
    private void m10268P() {
        if (this.f13352l.m10292c()) {
            m10269S();
        }
    }

    /* renamed from: S */
    private void m10269S() {
        this.f13352l.m10294e();
        this.f13351k.m10285a();
        this.f13346f.m10232a();
        this.f13344I = false;
        this.f13353m = null;
        this.f13354n = null;
        this.f13360t = null;
        this.f13355o = null;
        this.f13356p = null;
        this.f13361u = null;
        this.f13363w = null;
        this.f13343H = null;
        this.f13337B = null;
        this.f13338C = null;
        this.f13340E = null;
        this.f13341F = null;
        this.f13342G = null;
        this.f13365y = 0L;
        this.f13345J = false;
        this.f13336A = null;
        this.f13347g.clear();
        this.f13350j.mo6060a(this);
    }

    /* renamed from: T */
    private void m10270T() {
        this.f13337B = Thread.currentThread();
        this.f13365y = C5592f.m11028b();
        boolean zMo10226a = false;
        while (!this.f13345J && this.f13343H != null && !(zMo10226a = this.f13343H.mo10226a())) {
            this.f13363w = m10259F(this.f13363w);
            this.f13343H = m10258E();
            if (this.f13363w == h.SOURCE) {
                mo10230k();
                return;
            }
        }
        if ((this.f13363w == h.FINISHED || this.f13345J) && !zMo10226a) {
            m10266N();
        }
    }

    /* renamed from: U */
    private <Data, ResourceType> InterfaceC5404u<R> m10271U(Data data, EnumC5365a enumC5365a, C5402s<Data, ResourceType, R> c5402s) throws GlideException {
        C5426i c5426iM10260G = m10260G(enumC5365a);
        InterfaceC5434e<Data> interfaceC5434eM9962l = this.f13353m.m10004h().m9962l(data);
        try {
            return c5402s.m10352a(interfaceC5434eM9962l, c5426iM10260G, this.f13357q, this.f13358r, new c(enumC5365a));
        } finally {
            interfaceC5434eM9962l.mo10469b();
        }
    }

    /* renamed from: V */
    private void m10272V() {
        int i2 = a.f13367a[this.f13364x.ordinal()];
        if (i2 == 1) {
            this.f13363w = m10259F(h.INITIALIZE);
            this.f13343H = m10258E();
            m10270T();
        } else if (i2 == 2) {
            m10270T();
        } else {
            if (i2 == 3) {
                m10257D();
                return;
            }
            throw new IllegalStateException("Unrecognized run reason: " + this.f13364x);
        }
    }

    /* renamed from: W */
    private void m10273W() {
        Throwable th;
        this.f13348h.mo11080c();
        if (!this.f13344I) {
            this.f13344I = true;
            return;
        }
        if (this.f13347g.isEmpty()) {
            th = null;
        } else {
            List<Throwable> list = this.f13347g;
            th = list.get(list.size() - 1);
        }
        throw new IllegalStateException("Already notified", th);
    }

    /* renamed from: y */
    private <Data> InterfaceC5404u<R> m10274y(InterfaceC5433d<?> interfaceC5433d, Data data, EnumC5365a enumC5365a) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long jM11028b = C5592f.m11028b();
            InterfaceC5404u<R> interfaceC5404uM10256A = m10256A(data, enumC5365a);
            if (Log.isLoggable("DecodeJob", 2)) {
                m10262J("Decoded result " + interfaceC5404uM10256A, jM11028b);
            }
            return interfaceC5404uM10256A;
        } finally {
            interfaceC5433d.mo10460b();
        }
    }

    /* renamed from: I */
    RunnableC5391h<R> m10275I(C5351e c5351e, Object obj, C5397n c5397n, InterfaceC5423f interfaceC5423f, int i2, int i3, Class<?> cls, Class<R> cls2, EnumC5353g enumC5353g, AbstractC5393j abstractC5393j, Map<Class<?>, InterfaceC5429l<?>> map, boolean z, boolean z2, boolean z3, C5426i c5426i, b<R> bVar, int i4) {
        this.f13346f.m10252u(c5351e, obj, interfaceC5423f, i2, i3, abstractC5393j, cls, cls2, enumC5353g, c5426i, map, z, z2, this.f13349i);
        this.f13353m = c5351e;
        this.f13354n = interfaceC5423f;
        this.f13355o = enumC5353g;
        this.f13356p = c5397n;
        this.f13357q = i2;
        this.f13358r = i3;
        this.f13359s = abstractC5393j;
        this.f13366z = z3;
        this.f13360t = c5426i;
        this.f13361u = bVar;
        this.f13362v = i4;
        this.f13364x = g.INITIALIZE;
        this.f13336A = obj;
        return this;
    }

    /* renamed from: Q */
    <Z> InterfaceC5404u<Z> m10276Q(EnumC5365a enumC5365a, InterfaceC5404u<Z> interfaceC5404u) {
        InterfaceC5404u<Z> interfaceC5404uTransform;
        InterfaceC5429l<Z> interfaceC5429l;
        EnumC5367c enumC5367cMo10454b;
        InterfaceC5423f c5387d;
        Class<?> cls = interfaceC5404u.get().getClass();
        InterfaceC5428k<Z> interfaceC5428kM10245n = null;
        if (enumC5365a != EnumC5365a.RESOURCE_DISK_CACHE) {
            InterfaceC5429l<Z> interfaceC5429lM10249r = this.f13346f.m10249r(cls);
            interfaceC5429l = interfaceC5429lM10249r;
            interfaceC5404uTransform = interfaceC5429lM10249r.transform(this.f13353m, interfaceC5404u, this.f13357q, this.f13358r);
        } else {
            interfaceC5404uTransform = interfaceC5404u;
            interfaceC5429l = null;
        }
        if (!interfaceC5404u.equals(interfaceC5404uTransform)) {
            interfaceC5404u.mo10340c();
        }
        if (this.f13346f.m10253v(interfaceC5404uTransform)) {
            interfaceC5428kM10245n = this.f13346f.m10245n(interfaceC5404uTransform);
            enumC5367cMo10454b = interfaceC5428kM10245n.mo10454b(this.f13360t);
        } else {
            enumC5367cMo10454b = EnumC5367c.NONE;
        }
        InterfaceC5428k interfaceC5428k = interfaceC5428kM10245n;
        if (!this.f13359s.mo10301d(!this.f13346f.m10255x(this.f13338C), enumC5365a, enumC5367cMo10454b)) {
            return interfaceC5404uTransform;
        }
        if (interfaceC5428k == null) {
            throw new Registry.NoResultEncoderAvailableException(interfaceC5404uTransform.get().getClass());
        }
        int i2 = a.f13369c[enumC5367cMo10454b.ordinal()];
        if (i2 == 1) {
            c5387d = new C5387d(this.f13338C, this.f13354n);
        } else {
            if (i2 != 2) {
                throw new IllegalArgumentException("Unknown strategy: " + enumC5367cMo10454b);
            }
            c5387d = new C5406w(this.f13346f.m10233b(), this.f13338C, this.f13354n, this.f13357q, this.f13358r, interfaceC5429l, cls, this.f13360t);
        }
        C5403t c5403tM10354b = C5403t.m10354b(interfaceC5404uTransform);
        this.f13351k.m10288d(c5387d, interfaceC5428k, c5403tM10354b);
        return c5403tM10354b;
    }

    /* renamed from: R */
    void m10277R(boolean z) {
        if (this.f13352l.m10293d(z)) {
            m10269S();
        }
    }

    /* renamed from: X */
    boolean m10278X() {
        h hVarM10259F = m10259F(h.INITIALIZE);
        return hVarM10259F == h.RESOURCE_CACHE || hVarM10259F == h.DATA_CACHE;
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: g */
    public void mo10229g(InterfaceC5423f interfaceC5423f, Exception exc, InterfaceC5433d<?> interfaceC5433d, EnumC5365a enumC5365a) {
        interfaceC5433d.mo10460b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.m10168j(interfaceC5423f, enumC5365a, interfaceC5433d.mo10455a());
        this.f13347g.add(glideException);
        if (Thread.currentThread() == this.f13337B) {
            m10270T();
        } else {
            this.f13364x = g.SWITCH_TO_SOURCE_SERVICE;
            this.f13361u.mo10283c(this);
        }
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: k */
    public void mo10230k() {
        this.f13364x = g.SWITCH_TO_SOURCE_SERVICE;
        this.f13361u.mo10283c(this);
    }

    @Override // com.bumptech.glide.load.engine.InterfaceC5389f.a
    /* renamed from: q */
    public void mo10231q(InterfaceC5423f interfaceC5423f, Object obj, InterfaceC5433d<?> interfaceC5433d, EnumC5365a enumC5365a, InterfaceC5423f interfaceC5423f2) {
        this.f13338C = interfaceC5423f;
        this.f13340E = obj;
        this.f13342G = interfaceC5433d;
        this.f13341F = enumC5365a;
        this.f13339D = interfaceC5423f2;
        if (Thread.currentThread() != this.f13337B) {
            this.f13364x = g.DECODE_DATA;
            this.f13361u.mo10283c(this);
        } else {
            C5599b.m11074a("DecodeJob.decodeFromRetrievedData");
            try {
                m10257D();
            } finally {
                C5599b.m11077d();
            }
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        C5599b.m11075b("DecodeJob#run(model=%s)", this.f13336A);
        InterfaceC5433d<?> interfaceC5433d = this.f13342G;
        try {
            try {
                try {
                    if (this.f13345J) {
                        m10266N();
                        if (interfaceC5433d != null) {
                            interfaceC5433d.mo10460b();
                        }
                        C5599b.m11077d();
                        return;
                    }
                    m10272V();
                    if (interfaceC5433d != null) {
                        interfaceC5433d.mo10460b();
                    }
                    C5599b.m11077d();
                } catch (Throwable th) {
                    if (Log.isLoggable("DecodeJob", 3)) {
                        Log.d("DecodeJob", "DecodeJob threw unexpectedly, isCancelled: " + this.f13345J + ", stage: " + this.f13363w, th);
                    }
                    if (this.f13363w != h.ENCODE) {
                        this.f13347g.add(th);
                        m10266N();
                    }
                    if (!this.f13345J) {
                        throw th;
                    }
                    throw th;
                }
            } catch (C5382b e2) {
                throw e2;
            }
        } catch (Throwable th2) {
            if (interfaceC5433d != null) {
                interfaceC5433d.mo10460b();
            }
            C5599b.m11077d();
            throw th2;
        }
    }

    @Override // com.bumptech.glide.p145r.p146l.C5598a.f
    /* renamed from: u */
    public AbstractC5600c mo10213u() {
        return this.f13348h;
    }

    /* renamed from: v */
    public void m10279v() {
        this.f13345J = true;
        InterfaceC5389f interfaceC5389f = this.f13343H;
        if (interfaceC5389f != null) {
            interfaceC5389f.cancel();
        }
    }

    @Override // java.lang.Comparable
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public int compareTo(RunnableC5391h<?> runnableC5391h) {
        int iM10261H = m10261H() - runnableC5391h.m10261H();
        return iM10261H == 0 ? this.f13362v - runnableC5391h.f13362v : iM10261H;
    }
}
