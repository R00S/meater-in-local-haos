package p024c.p064l.p065b;

import androidx.datastore.preferences.protobuf.AbstractC0356a;
import androidx.datastore.preferences.protobuf.AbstractC0423y;
import androidx.datastore.preferences.protobuf.C0357a0;
import androidx.datastore.preferences.protobuf.InterfaceC0408r0;
import androidx.datastore.preferences.protobuf.InterfaceC0424y0;
import java.util.List;

/* compiled from: PreferencesProto.java */
/* renamed from: c.l.b.g */
/* loaded from: classes.dex */
public final class C0974g extends AbstractC0423y<C0974g, a> implements InterfaceC0408r0 {
    private static final C0974g DEFAULT_INSTANCE;
    private static volatile InterfaceC0424y0<C0974g> PARSER = null;
    public static final int STRINGS_FIELD_NUMBER = 1;
    private C0357a0.i<String> strings_ = AbstractC0423y.m3336v();

    /* compiled from: PreferencesProto.java */
    /* renamed from: c.l.b.g$a */
    public static final class a extends AbstractC0423y.a<C0974g, a> implements InterfaceC0408r0 {
        /* synthetic */ a(C0972e c0972e) {
            this();
        }

        /* renamed from: w */
        public a m6203w(Iterable<String> iterable) {
            m3352r();
            ((C0974g) this.f3018g).m6198L(iterable);
            return this;
        }

        private a() {
            super(C0974g.DEFAULT_INSTANCE);
        }
    }

    static {
        C0974g c0974g = new C0974g();
        DEFAULT_INSTANCE = c0974g;
        AbstractC0423y.m3334H(C0974g.class, c0974g);
    }

    private C0974g() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: L */
    public void m6198L(Iterable<String> iterable) {
        m6199M();
        AbstractC0356a.m2542a(iterable, this.strings_);
    }

    /* renamed from: M */
    private void m6199M() {
        if (this.strings_.mo2571l1()) {
            return;
        }
        this.strings_ = AbstractC0423y.m3330C(this.strings_);
    }

    /* renamed from: N */
    public static C0974g m6200N() {
        return DEFAULT_INSTANCE;
    }

    /* renamed from: P */
    public static a m6201P() {
        return DEFAULT_INSTANCE.m3343r();
    }

    /* renamed from: O */
    public List<String> m6202O() {
        return this.strings_;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0423y
    /* renamed from: u */
    protected final Object mo3346u(AbstractC0423y.f fVar, Object obj, Object obj2) {
        C0972e c0972e = null;
        switch (C0972e.f6470a[fVar.ordinal()]) {
            case 1:
                return new C0974g();
            case 2:
                return new a(c0972e);
            case 3:
                return AbstractC0423y.m3331E(DEFAULT_INSTANCE, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001a", new Object[]{"strings_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                InterfaceC0424y0<C0974g> bVar = PARSER;
                if (bVar == null) {
                    synchronized (C0974g.class) {
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
