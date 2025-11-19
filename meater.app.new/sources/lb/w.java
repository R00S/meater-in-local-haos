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
/* loaded from: classes3.dex */
public final class w extends kotlin.reflect.jvm.internal.impl.protobuf.h implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: G, reason: collision with root package name */
    private static final w f45017G;

    /* renamed from: H, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<w> f45018H = new a();

    /* renamed from: C, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f45019C;

    /* renamed from: D, reason: collision with root package name */
    private List<v> f45020D;

    /* renamed from: E, reason: collision with root package name */
    private byte f45021E;

    /* renamed from: F, reason: collision with root package name */
    private int f45022F;

    /* compiled from: ProtoBuf.java */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<w> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public w b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new w(eVar, fVar);
        }
    }

    static {
        w wVar = new w(true);
        f45017G = wVar;
        wVar.y();
    }

    public static b A(w wVar) {
        return z().o(wVar);
    }

    public static w v() {
        return f45017G;
    }

    private void y() {
        this.f45020D = Collections.emptyList();
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
        byte b10 = this.f45021E;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        this.f45021E = (byte) 1;
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f45022F;
        if (i10 != -1) {
            return i10;
        }
        int iS = 0;
        for (int i11 = 0; i11 < this.f45020D.size(); i11++) {
            iS += CodedOutputStream.s(1, this.f45020D.get(i11));
        }
        int size = iS + this.f45019C.size();
        this.f45022F = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<w> h() {
        return f45018H;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        for (int i10 = 0; i10 < this.f45020D.size(); i10++) {
            codedOutputStream.d0(1, this.f45020D.get(i10));
        }
        codedOutputStream.i0(this.f45019C);
    }

    public int w() {
        return this.f45020D.size();
    }

    public List<v> x() {
        return this.f45020D;
    }

    private w(h.b bVar) {
        super(bVar);
        this.f45021E = (byte) -1;
        this.f45022F = -1;
        this.f45019C = bVar.n();
    }

    private w(boolean z10) {
        this.f45021E = (byte) -1;
        this.f45022F = -1;
        this.f45019C = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private w(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        this.f45021E = (byte) -1;
        this.f45022F = -1;
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
                                    this.f45020D = new ArrayList();
                                    z11 = true;
                                }
                                this.f45020D.add(eVar.u(v.f44987N, fVar));
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
                    this.f45020D = Collections.unmodifiableList(this.f45020D);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f45019C = bVarD.e();
                    throw th2;
                }
                this.f45019C = bVarD.e();
                n();
                throw th;
            }
        }
        if (z11) {
            this.f45020D = Collections.unmodifiableList(this.f45020D);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f45019C = bVarD.e();
            throw th3;
        }
        this.f45019C = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    public static final class b extends h.b<w, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: C, reason: collision with root package name */
        private int f45023C;

        /* renamed from: D, reason: collision with root package name */
        private List<v> f45024D = Collections.emptyList();

        private b() {
            w();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b u() {
            return new b();
        }

        private void v() {
            if ((this.f45023C & 1) != 1) {
                this.f45024D = new ArrayList(this.f45024D);
                this.f45023C |= 1;
            }
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.w.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.w> r1 = lb.w.f45018H     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.w r3 = (lb.w) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.w r4 = (lb.w) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.w.b.k(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.w$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public b o(w wVar) {
            if (wVar == w.v()) {
                return this;
            }
            if (!wVar.f45020D.isEmpty()) {
                if (this.f45024D.isEmpty()) {
                    this.f45024D = wVar.f45020D;
                    this.f45023C &= -2;
                } else {
                    v();
                    this.f45024D.addAll(wVar.f45020D);
                }
            }
            p(n().f(wVar.f45019C));
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public w e() {
            w wVarS = s();
            if (wVarS.b()) {
                return wVarS;
            }
            throw a.AbstractC0582a.l(wVarS);
        }

        public w s() {
            w wVar = new w(this);
            if ((this.f45023C & 1) == 1) {
                this.f45024D = Collections.unmodifiableList(this.f45024D);
                this.f45023C &= -2;
            }
            wVar.f45020D = this.f45024D;
            return wVar;
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
