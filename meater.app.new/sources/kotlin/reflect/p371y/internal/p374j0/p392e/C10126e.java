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
/* renamed from: kotlin.f0.y.e.j0.e.e */
/* loaded from: classes3.dex */
public final class C10126e extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10126e f38760g;

    /* renamed from: h */
    public static InterfaceC10758q<C10126e> f38761h = new a();

    /* renamed from: i */
    private final AbstractC10745d f38762i;

    /* renamed from: j */
    private List<C10127f> f38763j;

    /* renamed from: k */
    private byte f38764k;

    /* renamed from: l */
    private int f38765l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.e$a */
    static class a extends AbstractC10743b<C10126e> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10126e mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10126e(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.e$b */
    public static final class b extends AbstractC10749h.b<C10126e, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f38766g;

        /* renamed from: h */
        private List<C10127f> f38767h = Collections.emptyList();

        private b() {
            m34572u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34570s() {
            return new b();
        }

        /* renamed from: t */
        private void m34571t() {
            if ((this.f38766g & 1) != 1) {
                this.f38767h = new ArrayList(this.f38767h);
                this.f38766g |= 1;
            }
        }

        /* renamed from: u */
        private void m34572u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10126e mo34093c() {
            C10126e c10126eM34574q = m34574q();
            if (c10126eM34574q.isInitialized()) {
                return c10126eM34574q;
            }
            throw AbstractC10742a.a.m38257j(c10126eM34574q);
        }

        /* renamed from: q */
        public C10126e m34574q() {
            C10126e c10126e = new C10126e(this);
            if ((this.f38766g & 1) == 1) {
                this.f38767h = Collections.unmodifiableList(this.f38767h);
                this.f38766g &= -2;
            }
            c10126e.f38763j = this.f38767h;
            return c10126e;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34570s().mo34096m(m34574q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10126e c10126e) {
            if (c10126e == C10126e.m34560u()) {
                return this;
            }
            if (!c10126e.f38763j.isEmpty()) {
                if (this.f38767h.isEmpty()) {
                    this.f38767h = c10126e.f38763j;
                    this.f38766g &= -2;
                } else {
                    m34571t();
                    this.f38767h.addAll(c10126e.f38763j);
                }
            }
            m38392n(m38391l().m38286f(c10126e.f38762i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10126e.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.e> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10126e.f38761h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.e r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10126e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.e r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10126e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10126e.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.e$b");
        }
    }

    static {
        C10126e c10126e = new C10126e(true);
        f38760g = c10126e;
        c10126e.m34561x();
    }

    /* renamed from: u */
    public static C10126e m34560u() {
        return f38760g;
    }

    /* renamed from: x */
    private void m34561x() {
        this.f38763j = Collections.emptyList();
    }

    /* renamed from: y */
    public static b m34562y() {
        return b.m34570s();
    }

    /* renamed from: z */
    public static b m34563z(C10126e c10126e) {
        return m34562y().mo34096m(c10126e);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34562y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34563z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38765l;
        if (i2 != -1) {
            return i2;
        }
        int iM38193s = 0;
        for (int i3 = 0; i3 < this.f38763j.size(); i3++) {
            iM38193s += CodedOutputStream.m38193s(1, this.f38763j.get(i3));
        }
        int size = iM38193s + this.f38762i.size();
        this.f38765l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10126e> mo34080g() {
        return f38761h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f38763j.size(); i2++) {
            codedOutputStream.m38220d0(1, this.f38763j.get(i2));
        }
        codedOutputStream.m38225i0(this.f38762i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38764k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34567w(); i2++) {
            if (!m34566v(i2).isInitialized()) {
                this.f38764k = (byte) 0;
                return false;
            }
        }
        this.f38764k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public C10127f m34566v(int i2) {
        return this.f38763j.get(i2);
    }

    /* renamed from: w */
    public int m34567w() {
        return this.f38763j.size();
    }

    private C10126e(AbstractC10749h.b bVar) {
        super(bVar);
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        this.f38762i = bVar.m38391l();
    }

    private C10126e(boolean z) {
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        this.f38762i = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10126e(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38764k = (byte) -1;
        this.f38765l = -1;
        m34561x();
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
                                this.f38763j = new ArrayList();
                                z2 |= true;
                            }
                            this.f38763j.add(c10746e.m38341u(C10127f.f38769h, c10747f));
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
                    this.f38763j = Collections.unmodifiableList(this.f38763j);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38762i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38762i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f38763j = Collections.unmodifiableList(this.f38763j);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38762i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38762i = bVarM38280w.m38299e();
        mo38389m();
    }
}
