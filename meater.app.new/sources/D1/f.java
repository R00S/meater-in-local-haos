package D1;

import androidx.datastore.preferences.protobuf.AbstractC2077x;
import androidx.datastore.preferences.protobuf.I;
import androidx.datastore.preferences.protobuf.J;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import androidx.datastore.preferences.protobuf.r0;
import java.io.InputStream;
import java.util.Collections;
import java.util.Map;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class f extends AbstractC2077x<f, a> implements Q {
    private static final f DEFAULT_INSTANCE;
    private static volatile Y<f> PARSER = null;
    public static final int PREFERENCES_FIELD_NUMBER = 1;
    private J<String, h> preferences_ = J.g();

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC2077x.a<f, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a B(String str, h hVar) {
            str.getClass();
            hVar.getClass();
            t();
            ((f) this.f25164C).N().put(str, hVar);
            return this;
        }

        private a() {
            super(f.DEFAULT_INSTANCE);
        }
    }

    /* compiled from: PreferencesProto.java */
    private static final class b {

        /* renamed from: a, reason: collision with root package name */
        static final I<String, h> f3335a = I.d(r0.b.f25059L, "", r0.b.f25061N, h.U());
    }

    static {
        f fVar = new f();
        DEFAULT_INSTANCE = fVar;
        AbstractC2077x.I(f.class, fVar);
    }

    private f() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public Map<String, h> N() {
        return P();
    }

    private J<String, h> P() {
        if (!this.preferences_.l()) {
            this.preferences_ = this.preferences_.o();
        }
        return this.preferences_;
    }

    private J<String, h> Q() {
        return this.preferences_;
    }

    public static a R() {
        return DEFAULT_INSTANCE.t();
    }

    public static f S(InputStream inputStream) {
        return (f) AbstractC2077x.G(DEFAULT_INSTANCE, inputStream);
    }

    public Map<String, h> O() {
        return Collections.unmodifiableMap(Q());
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2077x
    protected final Object w(AbstractC2077x.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3334a[fVar.ordinal()]) {
            case 1:
                return new f();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2077x.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u00012", new Object[]{"preferences_", b.f3335a});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<f> bVar = PARSER;
                if (bVar == null) {
                    synchronized (f.class) {
                        try {
                            bVar = PARSER;
                            if (bVar == null) {
                                bVar = new AbstractC2077x.b<>(DEFAULT_INSTANCE);
                                PARSER = bVar;
                            }
                        } finally {
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
