package io.sentry;

import io.sentry.vendor.gson.stream.EnumC9666b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: JsonObjectDeserializer.java */
@ApiStatus.Internal
/* renamed from: io.sentry.m2 */
/* loaded from: classes2.dex */
public final class C9511m2 {

    /* renamed from: a */
    private final ArrayList<c> f36467a = new ArrayList<>();

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f36468a;

        static {
            int[] iArr = new int[EnumC9666b.values().length];
            f36468a = iArr;
            try {
                iArr[EnumC9666b.BEGIN_ARRAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f36468a[EnumC9666b.END_ARRAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f36468a[EnumC9666b.BEGIN_OBJECT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f36468a[EnumC9666b.END_OBJECT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f36468a[EnumC9666b.NAME.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f36468a[EnumC9666b.STRING.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                f36468a[EnumC9666b.NUMBER.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                f36468a[EnumC9666b.BOOLEAN.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                f36468a[EnumC9666b.NULL.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                f36468a[EnumC9666b.END_DOCUMENT.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$b */
    interface b {
        /* renamed from: a */
        Object mo30875a() throws IOException;
    }

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$c */
    private interface c {
        Object getValue();
    }

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$f */
    private static final class f implements c {

        /* renamed from: a */
        final String f36471a;

        f(String str) {
            this.f36471a = str;
        }

        @Override // io.sentry.C9511m2.c
        public Object getValue() {
            return this.f36471a;
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$g */
    private static final class g implements c {

        /* renamed from: a */
        final Object f36472a;

        g(Object obj) {
            this.f36472a = obj;
        }

        @Override // io.sentry.C9511m2.c
        public Object getValue() {
            return this.f36472a;
        }
    }

    /* renamed from: b */
    private c m31016b() {
        if (this.f36467a.isEmpty()) {
            return null;
        }
        return this.f36467a.get(r0.size() - 1);
    }

    /* renamed from: c */
    private boolean m31017c() {
        if (m31019e()) {
            return true;
        }
        c cVarM31016b = m31016b();
        m31026m();
        if (!(m31016b() instanceof f)) {
            if (!(m31016b() instanceof d)) {
                return false;
            }
            d dVar = (d) m31016b();
            if (cVarM31016b == null || dVar == null) {
                return false;
            }
            dVar.f36469a.add(cVarM31016b.getValue());
            return false;
        }
        f fVar = (f) m31016b();
        m31026m();
        e eVar = (e) m31016b();
        if (fVar == null || cVarM31016b == null || eVar == null) {
            return false;
        }
        eVar.f36470a.put(fVar.f36471a, cVarM31016b.getValue());
        return false;
    }

    /* renamed from: d */
    private boolean m31018d(b bVar) throws IOException {
        Object objMo30875a = bVar.mo30875a();
        if (m31016b() == null && objMo30875a != null) {
            m31027n(new g(objMo30875a));
            return true;
        }
        if (m31016b() instanceof f) {
            f fVar = (f) m31016b();
            m31026m();
            ((e) m31016b()).f36470a.put(fVar.f36471a, objMo30875a);
            return false;
        }
        if (!(m31016b() instanceof d)) {
            return false;
        }
        ((d) m31016b()).f36469a.add(objMo30875a);
        return false;
    }

    /* renamed from: e */
    private boolean m31019e() {
        return this.f36467a.size() == 1;
    }

    /* renamed from: j */
    static /* synthetic */ Object m31023j() throws IOException {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public Object m31029h(C9518n2 c9518n2) throws IOException {
        try {
            try {
                return Integer.valueOf(c9518n2.m31894z());
            } catch (Exception unused) {
                return Long.valueOf(c9518n2.m31878A());
            }
        } catch (Exception unused2) {
            return Double.valueOf(c9518n2.m31893y());
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* renamed from: l */
    private void m31025l(final C9518n2 c9518n2) throws IOException {
        boolean zM31017c;
        a aVar = null;
        switch (a.f36468a[c9518n2.m31882N().ordinal()]) {
            case 1:
                c9518n2.m31883a();
                m31027n(new d(aVar));
                zM31017c = false;
                break;
            case 2:
                c9518n2.m31886f();
                zM31017c = m31017c();
                break;
            case 3:
                c9518n2.m31884b();
                m31027n(new e(aVar));
                zM31017c = false;
                break;
            case 4:
                c9518n2.m31889j();
                zM31017c = m31017c();
                break;
            case 5:
                m31027n(new f(c9518n2.m31879B()));
                zM31017c = false;
                break;
            case 6:
                zM31017c = m31018d(new b() { // from class: io.sentry.k
                    @Override // io.sentry.C9511m2.b
                    /* renamed from: a */
                    public final Object mo30875a() {
                        return c9518n2.m31881J();
                    }
                });
                break;
            case 7:
                zM31017c = m31018d(new b() { // from class: io.sentry.l
                    @Override // io.sentry.C9511m2.b
                    /* renamed from: a */
                    public final Object mo30875a() {
                        return this.f36414a.m31029h(c9518n2);
                    }
                });
                break;
            case 8:
                zM31017c = m31018d(new b() { // from class: io.sentry.m
                    @Override // io.sentry.C9511m2.b
                    /* renamed from: a */
                    public final Object mo30875a() {
                        return Boolean.valueOf(c9518n2.m31892x());
                    }
                });
                break;
            case 9:
                c9518n2.m31880H();
                zM31017c = m31018d(new b() { // from class: io.sentry.j
                    @Override // io.sentry.C9511m2.b
                    /* renamed from: a */
                    public final Object mo30875a() throws IOException {
                        C9511m2.m31023j();
                        return null;
                    }
                });
                break;
            case 10:
                zM31017c = true;
                break;
            default:
                zM31017c = false;
                break;
        }
        if (zM31017c) {
            return;
        }
        m31025l(c9518n2);
    }

    /* renamed from: m */
    private void m31026m() {
        if (this.f36467a.isEmpty()) {
            return;
        }
        this.f36467a.remove(r0.size() - 1);
    }

    /* renamed from: n */
    private void m31027n(c cVar) {
        this.f36467a.add(cVar);
    }

    /* renamed from: a */
    public Object m31028a(C9518n2 c9518n2) throws IOException {
        m31025l(c9518n2);
        c cVarM31016b = m31016b();
        if (cVarM31016b != null) {
            return cVarM31016b.getValue();
        }
        return null;
    }

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$d */
    private static final class d implements c {

        /* renamed from: a */
        final ArrayList<Object> f36469a;

        private d() {
            this.f36469a = new ArrayList<>();
        }

        @Override // io.sentry.C9511m2.c
        public Object getValue() {
            return this.f36469a;
        }

        /* synthetic */ d(a aVar) {
            this();
        }
    }

    /* compiled from: JsonObjectDeserializer.java */
    /* renamed from: io.sentry.m2$e */
    private static final class e implements c {

        /* renamed from: a */
        final HashMap<String, Object> f36470a;

        private e() {
            this.f36470a = new HashMap<>();
        }

        @Override // io.sentry.C9511m2.c
        public Object getValue() {
            return this.f36470a;
        }

        /* synthetic */ e(a aVar) {
            this();
        }
    }
}
