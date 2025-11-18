package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
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
/* renamed from: kotlin.f0.y.e.j0.e.t */
/* loaded from: classes3.dex */
public final class C10141t extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10141t f39090g;

    /* renamed from: h */
    public static InterfaceC10758q<C10141t> f39091h = new a();

    /* renamed from: i */
    private final AbstractC10745d f39092i;

    /* renamed from: j */
    private int f39093j;

    /* renamed from: k */
    private List<C10138q> f39094k;

    /* renamed from: l */
    private int f39095l;

    /* renamed from: m */
    private byte f39096m;

    /* renamed from: n */
    private int f39097n;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.t$a */
    static class a extends AbstractC10743b<C10141t> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10141t mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10141t(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.t$b */
    public static final class b extends AbstractC10749h.b<C10141t, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f39098g;

        /* renamed from: h */
        private List<C10138q> f39099h = Collections.emptyList();

        /* renamed from: i */
        private int f39100i = -1;

        private b() {
            m35237u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m35235s() {
            return new b();
        }

        /* renamed from: t */
        private void m35236t() {
            if ((this.f39098g & 1) != 1) {
                this.f39099h = new ArrayList(this.f39099h);
                this.f39098g |= 1;
            }
        }

        /* renamed from: u */
        private void m35237u() {
        }

        /* renamed from: A */
        public b m35238A(int i2) {
            this.f39098g |= 2;
            this.f39100i = i2;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10141t mo34093c() {
            C10141t c10141tM35240q = m35240q();
            if (c10141tM35240q.isInitialized()) {
                return c10141tM35240q;
            }
            throw AbstractC10742a.a.m38257j(c10141tM35240q);
        }

        /* renamed from: q */
        public C10141t m35240q() {
            C10141t c10141t = new C10141t(this);
            int i2 = this.f39098g;
            if ((i2 & 1) == 1) {
                this.f39099h = Collections.unmodifiableList(this.f39099h);
                this.f39098g &= -2;
            }
            c10141t.f39094k = this.f39099h;
            int i3 = (i2 & 2) != 2 ? 0 : 1;
            c10141t.f39095l = this.f39100i;
            c10141t.f39093j = i3;
            return c10141t;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35235s().mo34096m(m35240q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10141t c10141t) {
            if (c10141t == C10141t.m35225w()) {
                return this;
            }
            if (!c10141t.f39094k.isEmpty()) {
                if (this.f39099h.isEmpty()) {
                    this.f39099h = c10141t.f39094k;
                    this.f39098g &= -2;
                } else {
                    m35236t();
                    this.f39099h.addAll(c10141t.f39094k);
                }
            }
            if (c10141t.m35227B()) {
                m35238A(c10141t.m35230x());
            }
            m38392n(m38391l().m38286f(c10141t.f39092i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10141t.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.t> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10141t.f39091h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.t r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10141t) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.t r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10141t) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10141t.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.t$b");
        }
    }

    static {
        C10141t c10141t = new C10141t(true);
        f39090g = c10141t;
        c10141t.m35217C();
    }

    /* renamed from: C */
    private void m35217C() {
        this.f39094k = Collections.emptyList();
        this.f39095l = -1;
    }

    /* renamed from: D */
    public static b m35218D() {
        return b.m35235s();
    }

    /* renamed from: E */
    public static b m35219E(C10141t c10141t) {
        return m35218D().mo34096m(c10141t);
    }

    /* renamed from: w */
    public static C10141t m35225w() {
        return f39090g;
    }

    /* renamed from: A */
    public List<C10138q> m35226A() {
        return this.f39094k;
    }

    /* renamed from: B */
    public boolean m35227B() {
        return (this.f39093j & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35218D();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: G, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35219E(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39097n;
        if (i2 != -1) {
            return i2;
        }
        int iM38189o = 0;
        for (int i3 = 0; i3 < this.f39094k.size(); i3++) {
            iM38189o += CodedOutputStream.m38193s(1, this.f39094k.get(i3));
        }
        if ((this.f39093j & 1) == 1) {
            iM38189o += CodedOutputStream.m38189o(2, this.f39095l);
        }
        int size = iM38189o + this.f39092i.size();
        this.f39097n = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10141t> mo34080g() {
        return f39091h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f39094k.size(); i2++) {
            codedOutputStream.m38220d0(1, this.f39094k.get(i2));
        }
        if ((this.f39093j & 1) == 1) {
            codedOutputStream.m38217a0(2, this.f39095l);
        }
        codedOutputStream.m38225i0(this.f39092i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39096m;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m35232z(); i2++) {
            if (!m35231y(i2).isInitialized()) {
                this.f39096m = (byte) 0;
                return false;
            }
        }
        this.f39096m = (byte) 1;
        return true;
    }

    /* renamed from: x */
    public int m35230x() {
        return this.f39095l;
    }

    /* renamed from: y */
    public C10138q m35231y(int i2) {
        return this.f39094k.get(i2);
    }

    /* renamed from: z */
    public int m35232z() {
        return this.f39094k.size();
    }

    private C10141t(AbstractC10749h.b bVar) {
        super(bVar);
        this.f39096m = (byte) -1;
        this.f39097n = -1;
        this.f39092i = bVar.m38391l();
    }

    private C10141t(boolean z) {
        this.f39096m = (byte) -1;
        this.f39097n = -1;
        this.f39092i = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10141t(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f39096m = (byte) -1;
        this.f39097n = -1;
        m35217C();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    if (iM38320K != 0) {
                        if (iM38320K == 10) {
                            if (!(z2 & true)) {
                                this.f39094k = new ArrayList();
                                z2 |= true;
                            }
                            this.f39094k.add(c10746e.m38341u(C10138q.f38985i, c10747f));
                        } else if (iM38320K != 16) {
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                            }
                        } else {
                            this.f39093j |= 1;
                            this.f39095l = c10746e.m38339s();
                        }
                    }
                    z = true;
                } catch (InvalidProtocolBufferException e2) {
                    throw e2.m38253i(this);
                } catch (IOException e3) {
                    throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f39094k = Collections.unmodifiableList(this.f39094k);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39092i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f39092i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f39094k = Collections.unmodifiableList(this.f39094k);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39092i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f39092i = bVarM38280w.m38299e();
        mo38389m();
    }
}
