package p024c.p064l.p065b;

import androidx.datastore.preferences.protobuf.AbstractC0423y;
import androidx.datastore.preferences.protobuf.C0384j0;
import androidx.datastore.preferences.protobuf.C0387k0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.InterfaceC0408r0;
import androidx.datastore.preferences.protobuf.InterfaceC0424y0;
import java.io.IOException;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;
import okhttp3.HttpUrl;

/* compiled from: PreferencesProto.java */
/* renamed from: c.l.b.f */
/* loaded from: classes.dex */
public final class C0973f extends AbstractC0423y<C0973f, a> implements InterfaceC0408r0 {
    private static final C0973f DEFAULT_INSTANCE;
    private static volatile InterfaceC0424y0<C0973f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private C0387k0<String, C0975h> preferences_ = C0387k0.m2930f();

    /* compiled from: PreferencesProto.java */
    /* renamed from: c.l.b.f$a */
    public static final class a extends AbstractC0423y.a<C0973f, a> implements InterfaceC0408r0 {
        /* synthetic */ a(C0972e c0972e) {
            this();
        }

        /* renamed from: w */
        public a m6195w(String str, C0975h c0975h) {
            str.getClass();
            c0975h.getClass();
            m3352r();
            ((C0973f) this.f3018g).m6189L().put(str, c0975h);
            return this;
        }

        private a() {
            super(C0973f.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    /* renamed from: c.l.b.f$b */
    private static final class b {

        /* renamed from: a */
        static final C0384j0<String, C0975h> f6471a = C0384j0.m2912d(C0409r1.b.f2886n, HttpUrl.FRAGMENT_ENCODE_SET, C0409r1.b.f2888p, C0975h.m6212S());
    }

    static {
        C0973f c0973f = new C0973f();
        DEFAULT_INSTANCE = c0973f;
        AbstractC0423y.m3334H(C0973f.class, c0973f);
    }

    private C0973f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public Map<String, C0975h> m6189L() {
        return m6190N();
    }

    /* renamed from: N */
    private C0387k0<String, C0975h> m6190N() {
        if (!this.preferences_.m2934k()) {
            this.preferences_ = this.preferences_.m2937n();
        }
        return this.preferences_;
    }

    /* renamed from: O */
    private C0387k0<String, C0975h> m6191O() {
        return this.preferences_;
    }

    /* renamed from: P */
    public static a m6192P() {
        return DEFAULT_INSTANCE.m3343r();
    }

    /* renamed from: Q */
    public static C0973f m6193Q(InputStream inputStream) throws IOException {
        return (C0973f) AbstractC0423y.m3332F(DEFAULT_INSTANCE, inputStream);
    }

    /* renamed from: M */
    public Map<String, C0975h> m6194M() {
        return Collections.unmodifiableMap(m6191O());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0423y
    /* renamed from: u */
    protected final Object mo3346u(AbstractC0423y.f fVar, Object obj, Object obj2) {
        C0972e c0972e = null;
        switch (C0972e.f6470a[fVar.ordinal()]) {
            case 1:
                return new C0973f();
            case 2:
                return new a(c0972e);
            case 3:
                return AbstractC0423y.m3331E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f6471a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0424y0<C0973f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0973f.class) {
                        bVar = PARSER;
                        if (bVar == null) {
                            bVar = new AbstractC0423y.b<>(DEFAULT_INSTANCE);
                            PARSER = bVar;
                        }
                    }
                }
                return bVar;
            case 6:
                return (byte) 1;
            case 7:
                return null;
            default:
                throw new UnsupportedOperationException();
        }
    }
}
