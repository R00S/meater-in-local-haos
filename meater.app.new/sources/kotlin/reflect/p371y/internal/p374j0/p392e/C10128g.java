package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10743b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10746e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.g */
/* loaded from: classes3.dex */
public final class C10128g extends AbstractC10749h.d<C10128g> implements InterfaceC10757p {

    /* renamed from: h */
    private static final C10128g f38795h;

    /* renamed from: i */
    public static InterfaceC10758q<C10128g> f38796i = new a();

    /* renamed from: j */
    private final AbstractC10745d f38797j;

    /* renamed from: k */
    private int f38798k;

    /* renamed from: l */
    private int f38799l;

    /* renamed from: m */
    private byte f38800m;

    /* renamed from: n */
    private int f38801n;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.g$a */
    static class a extends AbstractC10743b<C10128g> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10128g mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10128g(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.g$b */
    public static final class b extends AbstractC10749h.c<C10128g, b> implements InterfaceC10757p {

        /* renamed from: i */
        private int f38802i;

        /* renamed from: j */
        private int f38803j;

        private b() {
            m34629A();
        }

        /* renamed from: A */
        private void m34629A() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: w */
        public static b m34631w() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10128g c10128g) {
            if (c10128g == C10128g.m34619D()) {
                return this;
            }
            if (c10128g.m34625G()) {
                m34634D(c10128g.m34624F());
            }
            m38396r(c10128g);
            m38392n(m38391l().m38286f(c10128g.f38797j));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10128g.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.g> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10128g.f38796i     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.g r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10128g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.mo34096m(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.m38252a()     // Catch: java.lang.Throwable -> Lf
                kotlin.f0.y.e.j0.e.g r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10128g) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.mo34096m(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10128g.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.g$b");
        }

        /* renamed from: D */
        public b m34634D(int i2) {
            this.f38802i |= 1;
            this.f38803j = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public C10128g mo34093c() {
            C10128g c10128gM34636u = m34636u();
            if (c10128gM34636u.isInitialized()) {
                return c10128gM34636u;
            }
            throw AbstractC10742a.a.m38257j(c10128gM34636u);
        }

        /* renamed from: u */
        public C10128g m34636u() {
            C10128g c10128g = new C10128g(this);
            int i2 = (this.f38802i & 1) != 1 ? 0 : 1;
            c10128g.f38799l = this.f38803j;
            c10128g.f38798k = i2;
            return c10128g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34631w().mo34096m(m34636u());
        }
    }

    static {
        C10128g c10128g = new C10128g(true);
        f38795h = c10128g;
        c10128g.m34620H();
    }

    /* renamed from: D */
    public static C10128g m34619D() {
        return f38795h;
    }

    /* renamed from: H */
    private void m34620H() {
        this.f38799l = 0;
    }

    /* renamed from: I */
    public static b m34621I() {
        return b.m34631w();
    }

    /* renamed from: J */
    public static b m34622J(C10128g c10128g) {
        return m34621I().mo34096m(c10128g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public C10128g mo34461b() {
        return f38795h;
    }

    /* renamed from: F */
    public int m34624F() {
        return this.f38799l;
    }

    /* renamed from: G */
    public boolean m34625G() {
        return (this.f38798k & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: K, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34621I();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34622J(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38801n;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = ((this.f38798k & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f38799l) : 0) + m38400t() + this.f38797j.size();
        this.f38801n = iM38189o;
        return iM38189o;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10128g> mo34080g() {
        return f38796i;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        AbstractC10749h.d<MessageType>.a aVarM38405y = m38405y();
        if ((this.f38798k & 1) == 1) {
            codedOutputStream.m38217a0(1, this.f38799l);
        }
        aVarM38405y.m38406a(200, codedOutputStream);
        codedOutputStream.m38225i0(this.f38797j);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38800m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        if (m38399s()) {
            this.f38800m = (byte) 1;
            return true;
        }
        this.f38800m = (byte) 0;
        return false;
    }

    private C10128g(AbstractC10749h.c<C10128g, ?> cVar) {
        super(cVar);
        this.f38800m = (byte) -1;
        this.f38801n = -1;
        this.f38797j = cVar.m38391l();
    }

    private C10128g(boolean z) {
        this.f38800m = (byte) -1;
        this.f38801n = -1;
        this.f38797j = AbstractC10745d.f41263f;
    }

    private C10128g(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38800m = (byte) -1;
        this.f38801n = -1;
        m34620H();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    if (iM38320K != 0) {
                        if (iM38320K != 8) {
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                            }
                        } else {
                            this.f38798k |= 1;
                            this.f38799l = c10746e.m38339s();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.m38253i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38797j = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38797j = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38797j = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38797j = bVarM38280w.m38299e();
        mo38389m();
    }
}
