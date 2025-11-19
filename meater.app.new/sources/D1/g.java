package D1;

import androidx.datastore.preferences.protobuf.AbstractC2055a;
import androidx.datastore.preferences.protobuf.AbstractC2077x;
import androidx.datastore.preferences.protobuf.C2079z;
import androidx.datastore.preferences.protobuf.Q;
import androidx.datastore.preferences.protobuf.Y;
import java.util.List;

/* compiled from: PreferencesProto.java */
/* loaded from: classes.dex */
public final class g extends AbstractC2077x<g, a> implements Q {
    private static final g DEFAULT_INSTANCE;
    private static volatile Y<g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C2079z.i<String> strings_ = AbstractC2077x.x();

    /* compiled from: PreferencesProto.java */
    public static final class a extends AbstractC2077x.a<g, a> implements Q {
        /* synthetic */ a(e eVar) {
            this();
        }

        public a B(Iterable<String> iterable) {
            t();
            ((g) this.f25164C).N(iterable);
            return this;
        }

        private a() {
            super(g.DEFAULT_INSTANCE);
        }
    }

    static {
        g gVar = new g();
        DEFAULT_INSTANCE = gVar;
        AbstractC2077x.I(g.class, gVar);
    }

    private g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void N(Iterable<String> iterable) {
        O();
        AbstractC2055a.a(iterable, this.strings_);
    }

    private void O() {
        if (this.strings_.q()) {
            return;
        }
        this.strings_ = AbstractC2077x.D(this.strings_);
    }

    public static g P() {
        return DEFAULT_INSTANCE;
    }

    public static a R() {
        return DEFAULT_INSTANCE.t();
    }

    public List<String> Q() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2077x
    protected final Object w(AbstractC2077x.f fVar, Object obj, Object obj2) {
        e eVar = null;
        switch (e.f3334a[fVar.ordinal()]) {
            case 1:
                return new g();
            case 2:
                return new a(eVar);
            case 3:
                return AbstractC2077x.F(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Y<g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (g.class) {
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
