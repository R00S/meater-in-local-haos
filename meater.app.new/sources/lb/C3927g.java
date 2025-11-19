package lb;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3927g extends h.d<C3927g> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: I, reason: collision with root package name */
    private static final C3927g f44661I;

    /* renamed from: J, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3927g> f44662J = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44663D;

    /* renamed from: E, reason: collision with root package name */
    private int f44664E;

    /* renamed from: F, reason: collision with root package name */
    private int f44665F;

    /* renamed from: G, reason: collision with root package name */
    private byte f44666G;

    /* renamed from: H, reason: collision with root package name */
    private int f44667H;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.g$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3927g> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3927g b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3927g(eVar, fVar);
        }
    }

    static {
        C3927g c3927g = new C3927g(true);
        f44661I = c3927g;
        c3927g.I();
    }

    public static C3927g E() {
        return f44661I;
    }

    private void I() {
        this.f44665F = 0;
    }

    public static b J() {
        return b.B();
    }

    public static b K(C3927g c3927g) {
        return J().o(c3927g);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public C3927g c() {
        return f44661I;
    }

    public int G() {
        return this.f44665F;
    }

    public boolean H() {
        return (this.f44664E & 1) == 1;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public b g() {
        return J();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: M, reason: merged with bridge method [inline-methods] */
    public b d() {
        return K(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44666G;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (t()) {
            this.f44666G = (byte) 1;
            return true;
        }
        this.f44666G = (byte) 0;
        return false;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44667H;
        if (i10 != -1) {
            return i10;
        }
        int iO = ((this.f44664E & 1) == 1 ? CodedOutputStream.o(1, this.f44665F) : 0) + u() + this.f44663D.size();
        this.f44667H = iO;
        return iO;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3927g> h() {
        return f44662J;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44664E & 1) == 1) {
            codedOutputStream.a0(1, this.f44665F);
        }
        aVarZ.a(200, codedOutputStream);
        codedOutputStream.i0(this.f44663D);
    }

    private C3927g(h.c<C3927g, ?> cVar) {
        super(cVar);
        this.f44666G = (byte) -1;
        this.f44667H = -1;
        this.f44663D = cVar.n();
    }

    private C3927g(boolean z10) {
        this.f44666G = (byte) -1;
        this.f44667H = -1;
        this.f44663D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    private C3927g(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44666G = (byte) -1;
        this.f44667H = -1;
        I();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK != 8) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                this.f44664E |= 1;
                                this.f44665F = eVar.s();
                            }
                        }
                        z10 = true;
                    } catch (IOException e10) {
                        throw new InvalidProtocolBufferException(e10.getMessage()).i(this);
                    }
                } catch (InvalidProtocolBufferException e11) {
                    throw e11.i(this);
                }
            } catch (Throwable th) {
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44663D = bVarD.e();
                    throw th2;
                }
                this.f44663D = bVarD.e();
                n();
                throw th;
            }
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44663D = bVarD.e();
            throw th3;
        }
        this.f44663D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.g$b */
    public static final class b extends h.c<C3927g, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44668E;

        /* renamed from: F, reason: collision with root package name */
        private int f44669F;

        private b() {
            C();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3927g.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.g> r1 = lb.C3927g.f44662J     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.g r3 = (lb.C3927g) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                if (r3 == 0) goto Le
                r2.o(r3)
            Le:
                return r2
            Lf:
                r3 = move-exception
                goto L1b
            L11:
                r3 = move-exception
                kotlin.reflect.jvm.internal.impl.protobuf.o r4 = r3.a()     // Catch: java.lang.Throwable -> Lf
                lb.g r4 = (lb.C3927g) r4     // Catch: java.lang.Throwable -> Lf
                throw r3     // Catch: java.lang.Throwable -> L19
            L19:
                r3 = move-exception
                r0 = r4
            L1b:
                if (r0 == 0) goto L20
                r2.o(r0)
            L20:
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: lb.C3927g.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.g$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b o(C3927g c3927g) {
            if (c3927g == C3927g.E()) {
                return this;
            }
            if (c3927g.H()) {
                F(c3927g.G());
            }
            t(c3927g);
            p(n().f(c3927g.f44663D));
            return this;
        }

        public b F(int i10) {
            this.f44668E |= 1;
            this.f44669F = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3927g e() {
            C3927g c3927gW = w();
            if (c3927gW.b()) {
                return c3927gW;
            }
            throw a.AbstractC0582a.l(c3927gW);
        }

        public C3927g w() {
            C3927g c3927g = new C3927g(this);
            int i10 = (this.f44668E & 1) != 1 ? 0 : 1;
            c3927g.f44665F = this.f44669F;
            c3927g.f44664E = i10;
            return c3927g;
        }

        private void C() {
        }
    }
}
