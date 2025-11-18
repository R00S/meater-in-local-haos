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
/* renamed from: kotlin.f0.y.e.j0.e.w */
/* loaded from: classes3.dex */
public final class C10144w extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10144w f39151g;

    /* renamed from: h */
    public static InterfaceC10758q<C10144w> f39152h = new a();

    /* renamed from: i */
    private final AbstractC10745d f39153i;

    /* renamed from: j */
    private List<C10143v> f39154j;

    /* renamed from: k */
    private byte f39155k;

    /* renamed from: l */
    private int f39156l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.w$a */
    static class a extends AbstractC10743b<C10144w> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10144w mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10144w(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.w$b */
    public static final class b extends AbstractC10749h.b<C10144w, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f39157g;

        /* renamed from: h */
        private List<C10143v> f39158h = Collections.emptyList();

        private b() {
            m35346u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m35344s() {
            return new b();
        }

        /* renamed from: t */
        private void m35345t() {
            if ((this.f39157g & 1) != 1) {
                this.f39158h = new ArrayList(this.f39158h);
                this.f39157g |= 1;
            }
        }

        /* renamed from: u */
        private void m35346u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10144w mo34093c() {
            C10144w c10144wM35348q = m35348q();
            if (c10144wM35348q.isInitialized()) {
                return c10144wM35348q;
            }
            throw AbstractC10742a.a.m38257j(c10144wM35348q);
        }

        /* renamed from: q */
        public C10144w m35348q() {
            C10144w c10144w = new C10144w(this);
            if ((this.f39157g & 1) == 1) {
                this.f39158h = Collections.unmodifiableList(this.f39158h);
                this.f39157g &= -2;
            }
            c10144w.f39154j = this.f39158h;
            return c10144w;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m35344s().mo34096m(m35348q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10144w c10144w) {
            if (c10144w == C10144w.m35334u()) {
                return this;
            }
            if (!c10144w.f39154j.isEmpty()) {
                if (this.f39158h.isEmpty()) {
                    this.f39158h = c10144w.f39154j;
                    this.f39157g &= -2;
                } else {
                    m35345t();
                    this.f39158h.addAll(c10144w.f39154j);
                }
            }
            m38392n(m38391l().m38286f(c10144w.f39153i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10144w.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.w> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10144w.f39152h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.w r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10144w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.w r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10144w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10144w.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.w$b");
        }
    }

    static {
        C10144w c10144w = new C10144w(true);
        f39151g = c10144w;
        c10144w.m35335x();
    }

    /* renamed from: u */
    public static C10144w m35334u() {
        return f39151g;
    }

    /* renamed from: x */
    private void m35335x() {
        this.f39154j = Collections.emptyList();
    }

    /* renamed from: y */
    public static b m35336y() {
        return b.m35344s();
    }

    /* renamed from: z */
    public static b m35337z(C10144w c10144w) {
        return m35336y().mo34096m(c10144w);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m35336y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m35337z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f39156l;
        if (i2 != -1) {
            return i2;
        }
        int iM38193s = 0;
        for (int i3 = 0; i3 < this.f39154j.size(); i3++) {
            iM38193s += CodedOutputStream.m38193s(1, this.f39154j.get(i3));
        }
        int size = iM38193s + this.f39153i.size();
        this.f39156l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10144w> mo34080g() {
        return f39152h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f39154j.size(); i2++) {
            codedOutputStream.m38220d0(1, this.f39154j.get(i2));
        }
        codedOutputStream.m38225i0(this.f39153i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f39155k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f39155k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public int m35340v() {
        return this.f39154j.size();
    }

    /* renamed from: w */
    public List<C10143v> m35341w() {
        return this.f39154j;
    }

    private C10144w(AbstractC10749h.b bVar) {
        super(bVar);
        this.f39155k = (byte) -1;
        this.f39156l = -1;
        this.f39153i = bVar.m38391l();
    }

    private C10144w(boolean z) {
        this.f39155k = (byte) -1;
        this.f39156l = -1;
        this.f39153i = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10144w(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f39155k = (byte) -1;
        this.f39156l = -1;
        m35335x();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    int iM38320K = c10746e.m38320K();
                    if (iM38320K != 0) {
                        if (iM38320K != 10) {
                            if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                            }
                        } else {
                            if (!(z2 & true)) {
                                this.f39154j = new ArrayList();
                                z2 |= true;
                            }
                            this.f39154j.add(c10746e.m38341u(C10143v.f39121h, c10747f));
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
                    this.f39154j = Collections.unmodifiableList(this.f39154j);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f39153i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f39153i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f39154j = Collections.unmodifiableList(this.f39154j);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f39153i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f39153i = bVarM38280w.m38299e();
        mo38389m();
    }
}
