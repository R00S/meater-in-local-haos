package lb;

import java.io.IOException;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.p, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3936p extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: G, reason: collision with root package name */
    private static final C3936p f44842G;

    /* renamed from: H, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3936p> f44843H = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44844C;

    /* renamed from: D, reason: collision with root package name */
    private kotlin.reflect.jvm.internal.impl.protobuf.m f44845D;

    /* renamed from: E, reason: collision with root package name */
    private byte f44846E;

    /* renamed from: F, reason: collision with root package name */
    private int f44847F;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.p$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3936p> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3936p b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3936p(eVar, fVar);
        }
    }

    static {
        C3936p c3936p = new C3936p(true);
        f44842G = c3936p;
        c3936p.y();
    }

    public static b A(C3936p c3936p) {
        return z().o(c3936p);
    }

    public static C3936p v() {
        return f44842G;
    }

    private void y() {
        this.f44845D = kotlin.reflect.jvm.internal.impl.protobuf.l.f44085C;
    }

    public static b z() {
        return b.u();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b g() {
        return z();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public b d() {
        return A(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44846E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f44846E = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44847F;
        if (i10 != -1) {
            return i10;
        }
        int iE = 0;
        for (int i11 = 0; i11 < this.f44845D.size(); i11++) {
            iE += CodedOutputStream.e(this.f44845D.a1(i11));
        }
        int size = iE + x().size() + this.f44844C.size();
        this.f44847F = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3936p> h() {
        return f44843H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        for (int i10 = 0; i10 < this.f44845D.size(); i10++) {
            codedOutputStream.O(1, this.f44845D.a1(i10));
        }
        codedOutputStream.i0(this.f44844C);
    }

    public String w(int i10) {
        return this.f44845D.get(i10);
    }

    public kotlin.reflect.jvm.internal.impl.protobuf.r x() {
        return this.f44845D;
    }

    private C3936p(h.b bVar) {
        super(bVar);
        this.f44846E = (byte) -1;
        this.f44847F = -1;
        this.f44844C = bVar.n();
    }

    private C3936p(boolean z10) {
        this.f44846E = (byte) -1;
        this.f44847F = -1;
        this.f44844C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    private C3936p(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44846E = (byte) -1;
        this.f44847F = -1;
        y();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z10 = false;
        boolean z11 = false;
        while (!z10) {
            try {
                try {
                    try {
                        int iK = eVar.K();
                        if (iK != 0) {
                            if (iK != 10) {
                                if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                }
                            } else {
                                kotlin.reflect.jvm.internal.impl.protobuf.d dVarL = eVar.l();
                                if (!z11) {
                                    this.f44845D = new kotlin.reflect.jvm.internal.impl.protobuf.l();
                                    z11 = true;
                                }
                                this.f44845D.u1(dVarL);
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
                if (z11) {
                    this.f44845D = this.f44845D.m();
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44844C = bVarD.e();
                    throw th2;
                }
                this.f44844C = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f44845D = this.f44845D.m();
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44844C = bVarD.e();
            throw th3;
        }
        this.f44844C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.p$b */
    public static final class b extends h.b<C3936p, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44848C;

        /* renamed from: D, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.m f44849D = kotlin.reflect.jvm.internal.impl.protobuf.l.f44085C;

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44848C & 1) != 1) {
                this.f44849D = new kotlin.reflect.jvm.internal.impl.protobuf.l(this.f44849D);
                this.f44848C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3936p.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.p> r1 = lb.C3936p.f44843H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.p r3 = (lb.C3936p) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.p r4 = (lb.C3936p) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3936p.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.p$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(C3936p c3936p) {
            if (c3936p == C3936p.v()) {
                return this;
            }
            if (!c3936p.f44845D.isEmpty()) {
                if (this.f44849D.isEmpty()) {
                    this.f44849D = c3936p.f44845D;
                    this.f44848C &= -2;
                } else {
                    v();
                    this.f44849D.addAll(c3936p.f44845D);
                }
            }
            p(n().f(c3936p.f44844C));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3936p e() {
            C3936p c3936pS = s();
            if (c3936pS.b()) {
                return c3936pS;
            }
            throw a.AbstractC0582a.l(c3936pS);
        }

        public C3936p s() {
            C3936p c3936p = new C3936p(this);
            if ((this.f44848C & 1) == 1) {
                this.f44849D = this.f44849D.m();
                this.f44848C &= -2;
            }
            c3936p.f44845D = this.f44849D;
            return c3936p;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public b m() {
            return u().o(s());
        }

        private void w() {
        }
    }
}
