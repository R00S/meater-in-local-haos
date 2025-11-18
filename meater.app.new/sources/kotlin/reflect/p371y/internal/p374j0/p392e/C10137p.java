package kotlin.reflect.p371y.internal.p374j0.p392e;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10743b;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10745d;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h;
import kotlin.reflect.jvm.internal.impl.protobuf.C10746e;
import kotlin.reflect.jvm.internal.impl.protobuf.C10747f;
import kotlin.reflect.jvm.internal.impl.protobuf.C10753l;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10754m;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10759r;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.p */
/* loaded from: classes3.dex */
public final class C10137p extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10137p f38976g;

    /* renamed from: h */
    public static InterfaceC10758q<C10137p> f38977h = new a();

    /* renamed from: i */
    private final AbstractC10745d f38978i;

    /* renamed from: j */
    private InterfaceC10754m f38979j;

    /* renamed from: k */
    private byte f38980k;

    /* renamed from: l */
    private int f38981l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.p$a */
    static class a extends AbstractC10743b<C10137p> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10137p mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10137p(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.p$b */
    public static final class b extends AbstractC10749h.b<C10137p, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f38982g;

        /* renamed from: h */
        private InterfaceC10754m f38983h = C10753l.f41323f;

        private b() {
            m34999u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34997s() {
            return new b();
        }

        /* renamed from: t */
        private void m34998t() {
            if ((this.f38982g & 1) != 1) {
                this.f38983h = new C10753l(this.f38983h);
                this.f38982g |= 1;
            }
        }

        /* renamed from: u */
        private void m34999u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10137p mo34093c() {
            C10137p c10137pM35001q = m35001q();
            if (c10137pM35001q.isInitialized()) {
                return c10137pM35001q;
            }
            throw AbstractC10742a.a.m38257j(c10137pM35001q);
        }

        /* renamed from: q */
        public C10137p m35001q() {
            C10137p c10137p = new C10137p(this);
            if ((this.f38982g & 1) == 1) {
                this.f38983h = this.f38983h.mo38431k();
                this.f38982g &= -2;
            }
            c10137p.f38979j = this.f38983h;
            return c10137p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34997s().mo34096m(m35001q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10137p c10137p) {
            if (c10137p == C10137p.m34987u()) {
                return this;
            }
            if (!c10137p.f38979j.isEmpty()) {
                if (this.f38983h.isEmpty()) {
                    this.f38983h = c10137p.f38979j;
                    this.f38982g &= -2;
                } else {
                    m34998t();
                    this.f38983h.addAll(c10137p.f38979j);
                }
            }
            m38392n(m38391l().m38286f(c10137p.f38978i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10137p.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.p> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10137p.f38977h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.p r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10137p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.p r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10137p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10137p.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.p$b");
        }
    }

    static {
        C10137p c10137p = new C10137p(true);
        f38976g = c10137p;
        c10137p.m34988x();
    }

    /* renamed from: u */
    public static C10137p m34987u() {
        return f38976g;
    }

    /* renamed from: x */
    private void m34988x() {
        this.f38979j = C10753l.f41323f;
    }

    /* renamed from: y */
    public static b m34989y() {
        return b.m34997s();
    }

    /* renamed from: z */
    public static b m34990z(C10137p c10137p) {
        return m34989y().mo34096m(c10137p);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34989y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34990z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38981l;
        if (i2 != -1) {
            return i2;
        }
        int iM38179e = 0;
        for (int i3 = 0; i3 < this.f38979j.size(); i3++) {
            iM38179e += CodedOutputStream.m38179e(this.f38979j.mo38425N0(i3));
        }
        int size = 0 + iM38179e + (m34994w().size() * 1) + this.f38978i.size();
        this.f38981l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10137p> mo34080g() {
        return f38977h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f38979j.size(); i2++) {
            codedOutputStream.m38205O(1, this.f38979j.mo38425N0(i2));
        }
        codedOutputStream.m38225i0(this.f38978i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38980k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        this.f38980k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public String m34993v(int i2) {
        return this.f38979j.get(i2);
    }

    /* renamed from: w */
    public InterfaceC10759r m34994w() {
        return this.f38979j;
    }

    private C10137p(AbstractC10749h.b bVar) {
        super(bVar);
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        this.f38978i = bVar.m38391l();
    }

    private C10137p(boolean z) {
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        this.f38978i = AbstractC10745d.f41263f;
    }

    private C10137p(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38980k = (byte) -1;
        this.f38981l = -1;
        m34988x();
        AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
        CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
        boolean z = false;
        boolean z2 = false;
        while (!z) {
            try {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K != 10) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                AbstractC10745d abstractC10745dM38332l = c10746e.m38332l();
                                if (!(z2 & true)) {
                                    this.f38979j = new C10753l();
                                    z2 |= true;
                                }
                                this.f38979j.mo38428h1(abstractC10745dM38332l);
                            }
                        }
                        z = true;
                    } catch (IOException e2) {
                        throw new InvalidProtocolBufferException(e2.getMessage()).m38253i(this);
                    }
                } catch (InvalidProtocolBufferException e3) {
                    throw e3.m38253i(this);
                }
            } catch (Throwable th) {
                if (z2 & true) {
                    this.f38979j = this.f38979j.mo38431k();
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38978i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38978i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f38979j = this.f38979j.mo38431k();
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38978i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38978i = bVarM38280w.m38299e();
        mo38389m();
    }
}
