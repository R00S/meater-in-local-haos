package lb;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3925e extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: G, reason: collision with root package name */
    private static final C3925e f44626G;

    /* renamed from: H, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3925e> f44627H = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44628C;

    /* renamed from: D, reason: collision with root package name */
    private List<C3926f> f44629D;

    /* renamed from: E, reason: collision with root package name */
    private byte f44630E;

    /* renamed from: F, reason: collision with root package name */
    private int f44631F;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.e$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3925e> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3925e b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3925e(eVar, fVar);
        }
    }

    static {
        C3925e c3925e = new C3925e(true);
        f44626G = c3925e;
        c3925e.y();
    }

    public static b A(C3925e c3925e) {
        return z().o(c3925e);
    }

    public static C3925e v() {
        return f44626G;
    }

    private void y() {
        this.f44629D = Collections.emptyList();
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
        byte b10 = this.f44630E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        for (int i10 = 0; i10 < x(); i10++) {
            if (!w(i10).b()) {
                this.f44630E = (byte) 0;
                return false;
            }
        }
        this.f44630E = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44631F;
        if (i10 != -1) {
            return i10;
        }
        int iS = 0;
        for (int i11 = 0; i11 < this.f44629D.size(); i11++) {
            iS += CodedOutputStream.s(1, this.f44629D.get(i11));
        }
        int size = iS + this.f44628C.size();
        this.f44631F = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3925e> h() {
        return f44627H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        for (int i10 = 0; i10 < this.f44629D.size(); i10++) {
            codedOutputStream.d0(1, this.f44629D.get(i10));
        }
        codedOutputStream.i0(this.f44628C);
    }

    public C3926f w(int i10) {
        return this.f44629D.get(i10);
    }

    public int x() {
        return this.f44629D.size();
    }

    private C3925e(h.b bVar) {
        super(bVar);
        this.f44630E = (byte) -1;
        this.f44631F = -1;
        this.f44628C = bVar.n();
    }

    private C3925e(boolean z10) {
        this.f44630E = (byte) -1;
        this.f44631F = -1;
        this.f44628C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C3925e(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f44630E = (byte) -1;
        this.f44631F = -1;
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
                                if (!z11) {
                                    this.f44629D = new ArrayList();
                                    z11 = true;
                                }
                                this.f44629D.add(eVar.u(C3926f.f44635L, fVar));
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
                    this.f44629D = Collections.unmodifiableList(this.f44629D);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44628C = bVarD.e();
                    throw th2;
                }
                this.f44628C = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f44629D = Collections.unmodifiableList(this.f44629D);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44628C = bVarD.e();
            throw th3;
        }
        this.f44628C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.e$b */
    public static final class b extends h.b<C3925e, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f44632C;

        /* renamed from: D, reason: collision with root package name */
        private List<C3926f> f44633D = Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f44632C & 1) != 1) {
                this.f44633D = new ArrayList(this.f44633D);
                this.f44632C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3925e.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.e> r1 = lb.C3925e.f44627H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.e r3 = (lb.C3925e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.e r4 = (lb.C3925e) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3925e.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.e$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(C3925e c3925e) {
            if (c3925e == C3925e.v()) {
                return this;
            }
            if (!c3925e.f44629D.isEmpty()) {
                if (this.f44633D.isEmpty()) {
                    this.f44633D = c3925e.f44629D;
                    this.f44632C &= -2;
                } else {
                    v();
                    this.f44633D.addAll(c3925e.f44629D);
                }
            }
            p(n().f(c3925e.f44628C));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public C3925e e() {
            C3925e c3925eS = s();
            if (c3925eS.b()) {
                return c3925eS;
            }
            throw a.AbstractC0582a.l(c3925eS);
        }

        public C3925e s() {
            C3925e c3925e = new C3925e(this);
            if ((this.f44632C & 1) == 1) {
                this.f44633D = Collections.unmodifiableList(this.f44633D);
                this.f44632C &= -2;
            }
            c3925e.f44629D = this.f44633D;
            return c3925e;
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
