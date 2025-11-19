package lb;

import com.apptionlabs.meater_app.data.Temperature;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.d;
import kotlin.reflect.jvm.internal.impl.protobuf.h;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import lb.C3937q;
import lb.C3940t;
import lb.w;

/* compiled from: ProtoBuf.java */
/* renamed from: lb.c, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3923c extends h.d<C3923c> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

    /* renamed from: l0, reason: collision with root package name */
    private static final C3923c f44542l0;

    /* renamed from: m0, reason: collision with root package name */
    public static kotlin.reflect.jvm.internal.impl.protobuf.q<C3923c> f44543m0 = new a();

    /* renamed from: D, reason: collision with root package name */
    private final kotlin.reflect.jvm.internal.impl.protobuf.d f44544D;

    /* renamed from: E, reason: collision with root package name */
    private int f44545E;

    /* renamed from: F, reason: collision with root package name */
    private int f44546F;

    /* renamed from: G, reason: collision with root package name */
    private int f44547G;

    /* renamed from: H, reason: collision with root package name */
    private int f44548H;

    /* renamed from: I, reason: collision with root package name */
    private List<C3939s> f44549I;

    /* renamed from: J, reason: collision with root package name */
    private List<C3937q> f44550J;

    /* renamed from: K, reason: collision with root package name */
    private List<Integer> f44551K;

    /* renamed from: L, reason: collision with root package name */
    private int f44552L;

    /* renamed from: M, reason: collision with root package name */
    private List<Integer> f44553M;

    /* renamed from: N, reason: collision with root package name */
    private int f44554N;

    /* renamed from: O, reason: collision with root package name */
    private List<C3937q> f44555O;

    /* renamed from: P, reason: collision with root package name */
    private List<Integer> f44556P;

    /* renamed from: Q, reason: collision with root package name */
    private int f44557Q;

    /* renamed from: R, reason: collision with root package name */
    private List<C3924d> f44558R;

    /* renamed from: S, reason: collision with root package name */
    private List<C3929i> f44559S;

    /* renamed from: T, reason: collision with root package name */
    private List<C3934n> f44560T;

    /* renamed from: U, reason: collision with root package name */
    private List<C3938r> f44561U;

    /* renamed from: V, reason: collision with root package name */
    private List<C3927g> f44562V;

    /* renamed from: W, reason: collision with root package name */
    private List<Integer> f44563W;

    /* renamed from: X, reason: collision with root package name */
    private int f44564X;

    /* renamed from: Y, reason: collision with root package name */
    private int f44565Y;

    /* renamed from: Z, reason: collision with root package name */
    private C3937q f44566Z;

    /* renamed from: a0, reason: collision with root package name */
    private int f44567a0;

    /* renamed from: b0, reason: collision with root package name */
    private List<Integer> f44568b0;

    /* renamed from: c0, reason: collision with root package name */
    private int f44569c0;

    /* renamed from: d0, reason: collision with root package name */
    private List<C3937q> f44570d0;

    /* renamed from: e0, reason: collision with root package name */
    private List<Integer> f44571e0;

    /* renamed from: f0, reason: collision with root package name */
    private int f44572f0;

    /* renamed from: g0, reason: collision with root package name */
    private C3940t f44573g0;

    /* renamed from: h0, reason: collision with root package name */
    private List<Integer> f44574h0;

    /* renamed from: i0, reason: collision with root package name */
    private w f44575i0;

    /* renamed from: j0, reason: collision with root package name */
    private byte f44576j0;

    /* renamed from: k0, reason: collision with root package name */
    private int f44577k0;

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.c$a */
    static class a extends kotlin.reflect.jvm.internal.impl.protobuf.b<C3923c> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C3923c b(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
            return new C3923c(eVar, fVar);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.c$c, reason: collision with other inner class name */
    public enum EnumC0599c implements i.a {
        CLASS(0, 0),
        INTERFACE(1, 1),
        ENUM_CLASS(2, 2),
        ENUM_ENTRY(3, 3),
        ANNOTATION_CLASS(4, 4),
        OBJECT(5, 5),
        COMPANION_OBJECT(6, 6);


        /* renamed from: J, reason: collision with root package name */
        private static i.b<EnumC0599c> f44610J = new a();

        /* renamed from: B, reason: collision with root package name */
        private final int f44612B;

        /* compiled from: ProtoBuf.java */
        /* renamed from: lb.c$c$a */
        static class a implements i.b<EnumC0599c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.b
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public EnumC0599c a(int i10) {
                return EnumC0599c.c(i10);
            }
        }

        EnumC0599c(int i10, int i11) {
            this.f44612B = i11;
        }

        public static EnumC0599c c(int i10) {
            switch (i10) {
                case 0:
                    return CLASS;
                case 1:
                    return INTERFACE;
                case 2:
                    return ENUM_CLASS;
                case 3:
                    return ENUM_ENTRY;
                case 4:
                    return ANNOTATION_CLASS;
                case 5:
                    return OBJECT;
                case 6:
                    return COMPANION_OBJECT;
                default:
                    return null;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.i.a
        public final int e() {
            return this.f44612B;
        }
    }

    static {
        C3923c c3923c = new C3923c(true);
        f44542l0 = c3923c;
        c3923c.u1();
    }

    public static C3923c A0() {
        return f44542l0;
    }

    private void u1() {
        this.f44546F = 6;
        this.f44547G = 0;
        this.f44548H = 0;
        this.f44549I = Collections.emptyList();
        this.f44550J = Collections.emptyList();
        this.f44551K = Collections.emptyList();
        this.f44553M = Collections.emptyList();
        this.f44555O = Collections.emptyList();
        this.f44556P = Collections.emptyList();
        this.f44558R = Collections.emptyList();
        this.f44559S = Collections.emptyList();
        this.f44560T = Collections.emptyList();
        this.f44561U = Collections.emptyList();
        this.f44562V = Collections.emptyList();
        this.f44563W = Collections.emptyList();
        this.f44565Y = 0;
        this.f44566Z = C3937q.Y();
        this.f44567a0 = 0;
        this.f44568b0 = Collections.emptyList();
        this.f44570d0 = Collections.emptyList();
        this.f44571e0 = Collections.emptyList();
        this.f44573g0 = C3940t.x();
        this.f44574h0 = Collections.emptyList();
        this.f44575i0 = w.v();
    }

    public static b v1() {
        return b.B();
    }

    public static b w1(C3923c c3923c) {
        return v1().o(c3923c);
    }

    public static C3923c y1(InputStream inputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        return f44543m0.a(inputStream, fVar);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    /* renamed from: B0, reason: merged with bridge method [inline-methods] */
    public C3923c c() {
        return f44542l0;
    }

    public C3927g C0(int i10) {
        return this.f44562V.get(i10);
    }

    public int D0() {
        return this.f44562V.size();
    }

    public List<C3927g> E0() {
        return this.f44562V;
    }

    public int F0() {
        return this.f44546F;
    }

    public int G0() {
        return this.f44547G;
    }

    public C3929i H0(int i10) {
        return this.f44559S.get(i10);
    }

    public int I0() {
        return this.f44559S.size();
    }

    public List<C3929i> J0() {
        return this.f44559S;
    }

    public int K0() {
        return this.f44565Y;
    }

    public C3937q L0() {
        return this.f44566Z;
    }

    public int M0() {
        return this.f44567a0;
    }

    public int N0() {
        return this.f44568b0.size();
    }

    public List<Integer> O0() {
        return this.f44568b0;
    }

    public C3937q P0(int i10) {
        return this.f44570d0.get(i10);
    }

    public int Q0() {
        return this.f44570d0.size();
    }

    public int R0() {
        return this.f44571e0.size();
    }

    public List<Integer> S0() {
        return this.f44571e0;
    }

    public List<C3937q> T0() {
        return this.f44570d0;
    }

    public List<Integer> U0() {
        return this.f44553M;
    }

    public C3934n V0(int i10) {
        return this.f44560T.get(i10);
    }

    public int W0() {
        return this.f44560T.size();
    }

    public List<C3934n> X0() {
        return this.f44560T;
    }

    public List<Integer> Y0() {
        return this.f44563W;
    }

    public C3937q Z0(int i10) {
        return this.f44550J.get(i10);
    }

    public int a1() {
        return this.f44550J.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.p
    public final boolean b() {
        byte b10 = this.f44576j0;
        if (b10 == 1) {
            return true;
        }
        if (b10 == 0) {
            return false;
        }
        if (!o1()) {
            this.f44576j0 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < h1(); i10++) {
            if (!g1(i10).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i11 = 0; i11 < a1(); i11++) {
            if (!Z0(i11).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i12 = 0; i12 < x0(); i12++) {
            if (!w0(i12).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i13 = 0; i13 < u0(); i13++) {
            if (!t0(i13).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i14 = 0; i14 < I0(); i14++) {
            if (!H0(i14).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i15 = 0; i15 < W0(); i15++) {
            if (!V0(i15).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i16 = 0; i16 < e1(); i16++) {
            if (!d1(i16).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        for (int i17 = 0; i17 < D0(); i17++) {
            if (!C0(i17).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        if (q1() && !L0().b()) {
            this.f44576j0 = (byte) 0;
            return false;
        }
        for (int i18 = 0; i18 < Q0(); i18++) {
            if (!P0(i18).b()) {
                this.f44576j0 = (byte) 0;
                return false;
            }
        }
        if (s1() && !j1().b()) {
            this.f44576j0 = (byte) 0;
            return false;
        }
        if (t()) {
            this.f44576j0 = (byte) 1;
            return true;
        }
        this.f44576j0 = (byte) 0;
        return false;
    }

    public List<Integer> b1() {
        return this.f44551K;
    }

    public List<C3937q> c1() {
        return this.f44550J;
    }

    public C3938r d1(int i10) {
        return this.f44561U.get(i10);
    }

    public int e1() {
        return this.f44561U.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public int f() {
        int i10 = this.f44577k0;
        if (i10 != -1) {
            return i10;
        }
        int iO = (this.f44545E & 1) == 1 ? CodedOutputStream.o(1, this.f44546F) : 0;
        int iP = 0;
        for (int i11 = 0; i11 < this.f44551K.size(); i11++) {
            iP += CodedOutputStream.p(this.f44551K.get(i11).intValue());
        }
        int iS = iO + iP;
        if (!b1().isEmpty()) {
            iS = iS + 1 + CodedOutputStream.p(iP);
        }
        this.f44552L = iP;
        if ((this.f44545E & 2) == 2) {
            iS += CodedOutputStream.o(3, this.f44547G);
        }
        if ((this.f44545E & 4) == 4) {
            iS += CodedOutputStream.o(4, this.f44548H);
        }
        for (int i12 = 0; i12 < this.f44549I.size(); i12++) {
            iS += CodedOutputStream.s(5, this.f44549I.get(i12));
        }
        for (int i13 = 0; i13 < this.f44550J.size(); i13++) {
            iS += CodedOutputStream.s(6, this.f44550J.get(i13));
        }
        int iP2 = 0;
        for (int i14 = 0; i14 < this.f44553M.size(); i14++) {
            iP2 += CodedOutputStream.p(this.f44553M.get(i14).intValue());
        }
        int iS2 = iS + iP2;
        if (!U0().isEmpty()) {
            iS2 = iS2 + 1 + CodedOutputStream.p(iP2);
        }
        this.f44554N = iP2;
        for (int i15 = 0; i15 < this.f44558R.size(); i15++) {
            iS2 += CodedOutputStream.s(8, this.f44558R.get(i15));
        }
        for (int i16 = 0; i16 < this.f44559S.size(); i16++) {
            iS2 += CodedOutputStream.s(9, this.f44559S.get(i16));
        }
        for (int i17 = 0; i17 < this.f44560T.size(); i17++) {
            iS2 += CodedOutputStream.s(10, this.f44560T.get(i17));
        }
        for (int i18 = 0; i18 < this.f44561U.size(); i18++) {
            iS2 += CodedOutputStream.s(11, this.f44561U.get(i18));
        }
        for (int i19 = 0; i19 < this.f44562V.size(); i19++) {
            iS2 += CodedOutputStream.s(13, this.f44562V.get(i19));
        }
        int iP3 = 0;
        for (int i20 = 0; i20 < this.f44563W.size(); i20++) {
            iP3 += CodedOutputStream.p(this.f44563W.get(i20).intValue());
        }
        int iS3 = iS2 + iP3;
        if (!Y0().isEmpty()) {
            iS3 = iS3 + 2 + CodedOutputStream.p(iP3);
        }
        this.f44564X = iP3;
        if ((this.f44545E & 8) == 8) {
            iS3 += CodedOutputStream.o(17, this.f44565Y);
        }
        if ((this.f44545E & 16) == 16) {
            iS3 += CodedOutputStream.s(18, this.f44566Z);
        }
        if ((this.f44545E & 32) == 32) {
            iS3 += CodedOutputStream.o(19, this.f44567a0);
        }
        for (int i21 = 0; i21 < this.f44555O.size(); i21++) {
            iS3 += CodedOutputStream.s(20, this.f44555O.get(i21));
        }
        int iP4 = 0;
        for (int i22 = 0; i22 < this.f44556P.size(); i22++) {
            iP4 += CodedOutputStream.p(this.f44556P.get(i22).intValue());
        }
        int iP5 = iS3 + iP4;
        if (!y0().isEmpty()) {
            iP5 = iP5 + 2 + CodedOutputStream.p(iP4);
        }
        this.f44557Q = iP4;
        int iP6 = 0;
        for (int i23 = 0; i23 < this.f44568b0.size(); i23++) {
            iP6 += CodedOutputStream.p(this.f44568b0.get(i23).intValue());
        }
        int iS4 = iP5 + iP6;
        if (!O0().isEmpty()) {
            iS4 = iS4 + 2 + CodedOutputStream.p(iP6);
        }
        this.f44569c0 = iP6;
        for (int i24 = 0; i24 < this.f44570d0.size(); i24++) {
            iS4 += CodedOutputStream.s(23, this.f44570d0.get(i24));
        }
        int iP7 = 0;
        for (int i25 = 0; i25 < this.f44571e0.size(); i25++) {
            iP7 += CodedOutputStream.p(this.f44571e0.get(i25).intValue());
        }
        int iS5 = iS4 + iP7;
        if (!S0().isEmpty()) {
            iS5 = iS5 + 2 + CodedOutputStream.p(iP7);
        }
        this.f44572f0 = iP7;
        if ((this.f44545E & 64) == 64) {
            iS5 += CodedOutputStream.s(30, this.f44573g0);
        }
        int iP8 = 0;
        for (int i26 = 0; i26 < this.f44574h0.size(); i26++) {
            iP8 += CodedOutputStream.p(this.f44574h0.get(i26).intValue());
        }
        int size = iS5 + iP8 + (k1().size() * 2);
        if ((this.f44545E & 128) == 128) {
            size += CodedOutputStream.s(32, this.f44575i0);
        }
        int iU = size + u() + this.f44544D.size();
        this.f44577k0 = iU;
        return iU;
    }

    public List<C3938r> f1() {
        return this.f44561U;
    }

    public C3939s g1(int i10) {
        return this.f44549I.get(i10);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.h, kotlin.reflect.jvm.internal.impl.protobuf.o
    public kotlin.reflect.jvm.internal.impl.protobuf.q<C3923c> h() {
        return f44543m0;
    }

    public int h1() {
        return this.f44549I.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public void i(CodedOutputStream codedOutputStream) throws IOException {
        f();
        h.d<MessageType>.a aVarZ = z();
        if ((this.f44545E & 1) == 1) {
            codedOutputStream.a0(1, this.f44546F);
        }
        if (b1().size() > 0) {
            codedOutputStream.o0(18);
            codedOutputStream.o0(this.f44552L);
        }
        for (int i10 = 0; i10 < this.f44551K.size(); i10++) {
            codedOutputStream.b0(this.f44551K.get(i10).intValue());
        }
        if ((this.f44545E & 2) == 2) {
            codedOutputStream.a0(3, this.f44547G);
        }
        if ((this.f44545E & 4) == 4) {
            codedOutputStream.a0(4, this.f44548H);
        }
        for (int i11 = 0; i11 < this.f44549I.size(); i11++) {
            codedOutputStream.d0(5, this.f44549I.get(i11));
        }
        for (int i12 = 0; i12 < this.f44550J.size(); i12++) {
            codedOutputStream.d0(6, this.f44550J.get(i12));
        }
        if (U0().size() > 0) {
            codedOutputStream.o0(58);
            codedOutputStream.o0(this.f44554N);
        }
        for (int i13 = 0; i13 < this.f44553M.size(); i13++) {
            codedOutputStream.b0(this.f44553M.get(i13).intValue());
        }
        for (int i14 = 0; i14 < this.f44558R.size(); i14++) {
            codedOutputStream.d0(8, this.f44558R.get(i14));
        }
        for (int i15 = 0; i15 < this.f44559S.size(); i15++) {
            codedOutputStream.d0(9, this.f44559S.get(i15));
        }
        for (int i16 = 0; i16 < this.f44560T.size(); i16++) {
            codedOutputStream.d0(10, this.f44560T.get(i16));
        }
        for (int i17 = 0; i17 < this.f44561U.size(); i17++) {
            codedOutputStream.d0(11, this.f44561U.get(i17));
        }
        for (int i18 = 0; i18 < this.f44562V.size(); i18++) {
            codedOutputStream.d0(13, this.f44562V.get(i18));
        }
        if (Y0().size() > 0) {
            codedOutputStream.o0(130);
            codedOutputStream.o0(this.f44564X);
        }
        for (int i19 = 0; i19 < this.f44563W.size(); i19++) {
            codedOutputStream.b0(this.f44563W.get(i19).intValue());
        }
        if ((this.f44545E & 8) == 8) {
            codedOutputStream.a0(17, this.f44565Y);
        }
        if ((this.f44545E & 16) == 16) {
            codedOutputStream.d0(18, this.f44566Z);
        }
        if ((this.f44545E & 32) == 32) {
            codedOutputStream.a0(19, this.f44567a0);
        }
        for (int i20 = 0; i20 < this.f44555O.size(); i20++) {
            codedOutputStream.d0(20, this.f44555O.get(i20));
        }
        if (y0().size() > 0) {
            codedOutputStream.o0(170);
            codedOutputStream.o0(this.f44557Q);
        }
        for (int i21 = 0; i21 < this.f44556P.size(); i21++) {
            codedOutputStream.b0(this.f44556P.get(i21).intValue());
        }
        if (O0().size() > 0) {
            codedOutputStream.o0(178);
            codedOutputStream.o0(this.f44569c0);
        }
        for (int i22 = 0; i22 < this.f44568b0.size(); i22++) {
            codedOutputStream.b0(this.f44568b0.get(i22).intValue());
        }
        for (int i23 = 0; i23 < this.f44570d0.size(); i23++) {
            codedOutputStream.d0(23, this.f44570d0.get(i23));
        }
        if (S0().size() > 0) {
            codedOutputStream.o0(194);
            codedOutputStream.o0(this.f44572f0);
        }
        for (int i24 = 0; i24 < this.f44571e0.size(); i24++) {
            codedOutputStream.b0(this.f44571e0.get(i24).intValue());
        }
        if ((this.f44545E & 64) == 64) {
            codedOutputStream.d0(30, this.f44573g0);
        }
        for (int i25 = 0; i25 < this.f44574h0.size(); i25++) {
            codedOutputStream.a0(31, this.f44574h0.get(i25).intValue());
        }
        if ((this.f44545E & 128) == 128) {
            codedOutputStream.d0(32, this.f44575i0);
        }
        aVarZ.a(19000, codedOutputStream);
        codedOutputStream.i0(this.f44544D);
    }

    public List<C3939s> i1() {
        return this.f44549I;
    }

    public C3940t j1() {
        return this.f44573g0;
    }

    public List<Integer> k1() {
        return this.f44574h0;
    }

    public w l1() {
        return this.f44575i0;
    }

    public boolean m1() {
        return (this.f44545E & 4) == 4;
    }

    public boolean n1() {
        return (this.f44545E & 1) == 1;
    }

    public boolean o1() {
        return (this.f44545E & 2) == 2;
    }

    public boolean p1() {
        return (this.f44545E & 8) == 8;
    }

    public boolean q1() {
        return (this.f44545E & 16) == 16;
    }

    public boolean r1() {
        return (this.f44545E & 32) == 32;
    }

    public int s0() {
        return this.f44548H;
    }

    public boolean s1() {
        return (this.f44545E & 64) == 64;
    }

    public C3924d t0(int i10) {
        return this.f44558R.get(i10);
    }

    public boolean t1() {
        return (this.f44545E & 128) == 128;
    }

    public int u0() {
        return this.f44558R.size();
    }

    public List<C3924d> v0() {
        return this.f44558R;
    }

    public C3937q w0(int i10) {
        return this.f44555O.get(i10);
    }

    public int x0() {
        return this.f44555O.size();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: x1, reason: merged with bridge method [inline-methods] */
    public b g() {
        return v1();
    }

    public List<Integer> y0() {
        return this.f44556P;
    }

    public List<C3937q> z0() {
        return this.f44555O;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    /* renamed from: z1, reason: merged with bridge method [inline-methods] */
    public b d() {
        return w1(this);
    }

    private C3923c(h.c<C3923c, ?> cVar) {
        super(cVar);
        this.f44552L = -1;
        this.f44554N = -1;
        this.f44557Q = -1;
        this.f44564X = -1;
        this.f44569c0 = -1;
        this.f44572f0 = -1;
        this.f44576j0 = (byte) -1;
        this.f44577k0 = -1;
        this.f44544D = cVar.n();
    }

    private C3923c(boolean z10) {
        this.f44552L = -1;
        this.f44554N = -1;
        this.f44557Q = -1;
        this.f44564X = -1;
        this.f44569c0 = -1;
        this.f44572f0 = -1;
        this.f44576j0 = (byte) -1;
        this.f44577k0 = -1;
        this.f44544D = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v17 */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Type inference failed for: r8v23 */
    /* JADX WARN: Type inference failed for: r8v25 */
    /* JADX WARN: Type inference failed for: r8v27 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v31 */
    /* JADX WARN: Type inference failed for: r8v33 */
    /* JADX WARN: Type inference failed for: r8v35 */
    /* JADX WARN: Type inference failed for: r8v37 */
    /* JADX WARN: Type inference failed for: r8v39 */
    /* JADX WARN: Type inference failed for: r8v41 */
    /* JADX WARN: Type inference failed for: r8v43 */
    /* JADX WARN: Type inference failed for: r8v45 */
    /* JADX WARN: Type inference failed for: r8v47 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    private C3923c(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, kotlin.reflect.jvm.internal.impl.protobuf.f fVar) {
        boolean z10;
        this.f44552L = -1;
        this.f44554N = -1;
        this.f44557Q = -1;
        this.f44564X = -1;
        this.f44569c0 = -1;
        this.f44572f0 = -1;
        this.f44576j0 = (byte) -1;
        this.f44577k0 = -1;
        u1();
        d.b bVarD = kotlin.reflect.jvm.internal.impl.protobuf.d.D();
        CodedOutputStream codedOutputStreamJ = CodedOutputStream.J(bVarD, 1);
        boolean z11 = false;
        char c10 = 0;
        while (!z11) {
            try {
                try {
                    int iK = eVar.K();
                    switch (iK) {
                        case 0:
                            z10 = true;
                            z11 = true;
                            c10 = c10;
                        case 8:
                            z10 = true;
                            this.f44545E |= 1;
                            this.f44546F = eVar.s();
                            c10 = c10;
                        case 16:
                            int i10 = (c10 == true ? 1 : 0) & 32;
                            char c11 = c10;
                            if (i10 != 32) {
                                this.f44551K = new ArrayList();
                                c11 = (c10 == true ? 1 : 0) | ' ';
                            }
                            this.f44551K.add(Integer.valueOf(eVar.s()));
                            c10 = c11;
                            z10 = true;
                            c10 = c10;
                        case 18:
                            int iJ = eVar.j(eVar.A());
                            int i11 = (c10 == true ? 1 : 0) & 32;
                            char c12 = c10;
                            if (i11 != 32) {
                                c12 = c10;
                                if (eVar.e() > 0) {
                                    this.f44551K = new ArrayList();
                                    c12 = (c10 == true ? 1 : 0) | ' ';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44551K.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ);
                            c10 = c12;
                            z10 = true;
                            c10 = c10;
                        case 24:
                            this.f44545E |= 2;
                            this.f44547G = eVar.s();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 32:
                            this.f44545E |= 4;
                            this.f44548H = eVar.s();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 42:
                            int i12 = (c10 == true ? 1 : 0) & 8;
                            char c13 = c10;
                            if (i12 != 8) {
                                this.f44549I = new ArrayList();
                                c13 = (c10 == true ? 1 : 0) | '\b';
                            }
                            this.f44549I.add(eVar.u(C3939s.f44931P, fVar));
                            c10 = c13;
                            z10 = true;
                            c10 = c10;
                        case 50:
                            int i13 = (c10 == true ? 1 : 0) & 16;
                            char c14 = c10;
                            if (i13 != 16) {
                                this.f44550J = new ArrayList();
                                c14 = (c10 == true ? 1 : 0) | 16;
                            }
                            this.f44550J.add(eVar.u(C3937q.f44851W, fVar));
                            c10 = c14;
                            z10 = true;
                            c10 = c10;
                        case 56:
                            int i14 = (c10 == true ? 1 : 0) & 64;
                            char c15 = c10;
                            if (i14 != 64) {
                                this.f44553M = new ArrayList();
                                c15 = (c10 == true ? 1 : 0) | '@';
                            }
                            this.f44553M.add(Integer.valueOf(eVar.s()));
                            c10 = c15;
                            z10 = true;
                            c10 = c10;
                        case 58:
                            int iJ2 = eVar.j(eVar.A());
                            int i15 = (c10 == true ? 1 : 0) & 64;
                            char c16 = c10;
                            if (i15 != 64) {
                                c16 = c10;
                                if (eVar.e() > 0) {
                                    this.f44553M = new ArrayList();
                                    c16 = (c10 == true ? 1 : 0) | '@';
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44553M.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ2);
                            c10 = c16;
                            z10 = true;
                            c10 = c10;
                        case 66:
                            int i16 = (c10 == true ? 1 : 0) & 512;
                            char c17 = c10;
                            if (i16 != 512) {
                                this.f44558R = new ArrayList();
                                c17 = (c10 == true ? 1 : 0) | 512;
                            }
                            this.f44558R.add(eVar.u(C3924d.f44614L, fVar));
                            c10 = c17;
                            z10 = true;
                            c10 = c10;
                        case 74:
                            int i17 = (c10 == true ? 1 : 0) & 1024;
                            char c18 = c10;
                            if (i17 != 1024) {
                                this.f44559S = new ArrayList();
                                c18 = (c10 == true ? 1 : 0) | 1024;
                            }
                            this.f44559S.add(eVar.u(C3929i.f44698X, fVar));
                            c10 = c18;
                            z10 = true;
                            c10 = c10;
                        case 82:
                            int i18 = (c10 == true ? 1 : 0) & 2048;
                            char c19 = c10;
                            if (i18 != 2048) {
                                this.f44560T = new ArrayList();
                                c19 = (c10 == true ? 1 : 0) | 2048;
                            }
                            this.f44560T.add(eVar.u(C3934n.f44780X, fVar));
                            c10 = c19;
                            z10 = true;
                            c10 = c10;
                        case Temperature.MAX_TEMPERATURE_FOR_ESTIMATE /* 90 */:
                            int i19 = (c10 == true ? 1 : 0) & 4096;
                            char c20 = c10;
                            if (i19 != 4096) {
                                this.f44561U = new ArrayList();
                                c20 = (c10 == true ? 1 : 0) | 4096;
                            }
                            this.f44561U.add(eVar.u(C3938r.f44906R, fVar));
                            c10 = c20;
                            z10 = true;
                            c10 = c10;
                        case 106:
                            int i20 = (c10 == true ? 1 : 0) & 8192;
                            char c21 = c10;
                            if (i20 != 8192) {
                                this.f44562V = new ArrayList();
                                c21 = (c10 == true ? 1 : 0) | 8192;
                            }
                            this.f44562V.add(eVar.u(C3927g.f44662J, fVar));
                            c10 = c21;
                            z10 = true;
                            c10 = c10;
                        case 128:
                            int i21 = (c10 == true ? 1 : 0) & 16384;
                            char c22 = c10;
                            if (i21 != 16384) {
                                this.f44563W = new ArrayList();
                                c22 = (c10 == true ? 1 : 0) | 16384;
                            }
                            this.f44563W.add(Integer.valueOf(eVar.s()));
                            c10 = c22;
                            z10 = true;
                            c10 = c10;
                        case 130:
                            int iJ3 = eVar.j(eVar.A());
                            int i22 = (c10 == true ? 1 : 0) & 16384;
                            char c23 = c10;
                            if (i22 != 16384) {
                                c23 = c10;
                                if (eVar.e() > 0) {
                                    this.f44563W = new ArrayList();
                                    c23 = (c10 == true ? 1 : 0) | 16384;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44563W.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ3);
                            c10 = c23;
                            z10 = true;
                            c10 = c10;
                        case ModuleDescriptor.MODULE_VERSION /* 136 */:
                            this.f44545E |= 8;
                            this.f44565Y = eVar.s();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 146:
                            C3937q.c cVarC0 = (this.f44545E & 16) == 16 ? this.f44566Z.d() : null;
                            C3937q c3937q = (C3937q) eVar.u(C3937q.f44851W, fVar);
                            this.f44566Z = c3937q;
                            if (cVarC0 != null) {
                                cVarC0.o(c3937q);
                                this.f44566Z = cVarC0.w();
                            }
                            this.f44545E |= 16;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 152:
                            this.f44545E |= 32;
                            this.f44567a0 = eVar.s();
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 162:
                            int i23 = (c10 == true ? 1 : 0) & 128;
                            char c24 = c10;
                            if (i23 != 128) {
                                this.f44555O = new ArrayList();
                                c24 = (c10 == true ? 1 : 0) | 128;
                            }
                            this.f44555O.add(eVar.u(C3937q.f44851W, fVar));
                            c10 = c24;
                            z10 = true;
                            c10 = c10;
                        case 168:
                            int i24 = (c10 == true ? 1 : 0) & 256;
                            char c25 = c10;
                            if (i24 != 256) {
                                this.f44556P = new ArrayList();
                                c25 = (c10 == true ? 1 : 0) | 256;
                            }
                            this.f44556P.add(Integer.valueOf(eVar.s()));
                            c10 = c25;
                            z10 = true;
                            c10 = c10;
                        case 170:
                            int iJ4 = eVar.j(eVar.A());
                            int i25 = (c10 == true ? 1 : 0) & 256;
                            char c26 = c10;
                            if (i25 != 256) {
                                c26 = c10;
                                if (eVar.e() > 0) {
                                    this.f44556P = new ArrayList();
                                    c26 = (c10 == true ? 1 : 0) | 256;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44556P.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ4);
                            c10 = c26;
                            z10 = true;
                            c10 = c10;
                        case 176:
                            int i26 = (c10 == true ? 1 : 0) & 262144;
                            char c27 = c10;
                            if (i26 != 262144) {
                                this.f44568b0 = new ArrayList();
                                c27 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f44568b0.add(Integer.valueOf(eVar.s()));
                            c10 = c27;
                            z10 = true;
                            c10 = c10;
                        case 178:
                            int iJ5 = eVar.j(eVar.A());
                            int i27 = (c10 == true ? 1 : 0) & 262144;
                            char c28 = c10;
                            if (i27 != 262144) {
                                c28 = c10;
                                if (eVar.e() > 0) {
                                    this.f44568b0 = new ArrayList();
                                    c28 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44568b0.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ5);
                            c10 = c28;
                            z10 = true;
                            c10 = c10;
                        case 186:
                            int i28 = (c10 == true ? 1 : 0) & 524288;
                            char c29 = c10;
                            if (i28 != 524288) {
                                this.f44570d0 = new ArrayList();
                                c29 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f44570d0.add(eVar.u(C3937q.f44851W, fVar));
                            c10 = c29;
                            z10 = true;
                            c10 = c10;
                        case 192:
                            int i29 = (c10 == true ? 1 : 0) & 1048576;
                            char c30 = c10;
                            if (i29 != 1048576) {
                                this.f44571e0 = new ArrayList();
                                c30 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f44571e0.add(Integer.valueOf(eVar.s()));
                            c10 = c30;
                            z10 = true;
                            c10 = c10;
                        case 194:
                            int iJ6 = eVar.j(eVar.A());
                            int i30 = (c10 == true ? 1 : 0) & 1048576;
                            char c31 = c10;
                            if (i30 != 1048576) {
                                c31 = c10;
                                if (eVar.e() > 0) {
                                    this.f44571e0 = new ArrayList();
                                    c31 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44571e0.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ6);
                            c10 = c31;
                            z10 = true;
                            c10 = c10;
                        case 242:
                            C3940t.b bVarH = (this.f44545E & 64) == 64 ? this.f44573g0.d() : null;
                            C3940t c3940t = (C3940t) eVar.u(C3940t.f44957J, fVar);
                            this.f44573g0 = c3940t;
                            if (bVarH != null) {
                                bVarH.o(c3940t);
                                this.f44573g0 = bVarH.s();
                            }
                            this.f44545E |= 64;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        case 248:
                            int i31 = (c10 == true ? 1 : 0) & 4194304;
                            char c32 = c10;
                            if (i31 != 4194304) {
                                this.f44574h0 = new ArrayList();
                                c32 = (c10 == true ? 1 : 0) | 0;
                            }
                            this.f44574h0.add(Integer.valueOf(eVar.s()));
                            c10 = c32;
                            z10 = true;
                            c10 = c10;
                        case 250:
                            int iJ7 = eVar.j(eVar.A());
                            int i32 = (c10 == true ? 1 : 0) & 4194304;
                            char c33 = c10;
                            if (i32 != 4194304) {
                                c33 = c10;
                                if (eVar.e() > 0) {
                                    this.f44574h0 = new ArrayList();
                                    c33 = (c10 == true ? 1 : 0) | 0;
                                }
                            }
                            while (eVar.e() > 0) {
                                this.f44574h0.add(Integer.valueOf(eVar.s()));
                            }
                            eVar.i(iJ7);
                            c10 = c33;
                            z10 = true;
                            c10 = c10;
                        case 258:
                            w.b bVarC = (this.f44545E & 128) == 128 ? this.f44575i0.d() : null;
                            w wVar = (w) eVar.u(w.f45018H, fVar);
                            this.f44575i0 = wVar;
                            if (bVarC != null) {
                                bVarC.o(wVar);
                                this.f44575i0 = bVarC.s();
                            }
                            this.f44545E |= 128;
                            c10 = c10;
                            z10 = true;
                            c10 = c10;
                        default:
                            c10 = c10;
                            if (!q(eVar, codedOutputStreamJ, fVar, iK)) {
                                z11 = true;
                                c10 = c10;
                            }
                            z10 = true;
                            c10 = c10;
                    }
                } catch (InvalidProtocolBufferException e10) {
                    throw e10.i(this);
                } catch (IOException e11) {
                    throw new InvalidProtocolBufferException(e11.getMessage()).i(this);
                }
            } catch (Throwable th) {
                if (((c10 == true ? 1 : 0) & 32) == 32) {
                    this.f44551K = Collections.unmodifiableList(this.f44551K);
                }
                if (((c10 == true ? 1 : 0) & 8) == 8) {
                    this.f44549I = Collections.unmodifiableList(this.f44549I);
                }
                if (((c10 == true ? 1 : 0) & 16) == 16) {
                    this.f44550J = Collections.unmodifiableList(this.f44550J);
                }
                if (((c10 == true ? 1 : 0) & 64) == 64) {
                    this.f44553M = Collections.unmodifiableList(this.f44553M);
                }
                if (((c10 == true ? 1 : 0) & 512) == 512) {
                    this.f44558R = Collections.unmodifiableList(this.f44558R);
                }
                if (((c10 == true ? 1 : 0) & 1024) == 1024) {
                    this.f44559S = Collections.unmodifiableList(this.f44559S);
                }
                if (((c10 == true ? 1 : 0) & 2048) == 2048) {
                    this.f44560T = Collections.unmodifiableList(this.f44560T);
                }
                if (((c10 == true ? 1 : 0) & 4096) == 4096) {
                    this.f44561U = Collections.unmodifiableList(this.f44561U);
                }
                if (((c10 == true ? 1 : 0) & 8192) == 8192) {
                    this.f44562V = Collections.unmodifiableList(this.f44562V);
                }
                if (((c10 == true ? 1 : 0) & 16384) == 16384) {
                    this.f44563W = Collections.unmodifiableList(this.f44563W);
                }
                if (((c10 == true ? 1 : 0) & 128) == 128) {
                    this.f44555O = Collections.unmodifiableList(this.f44555O);
                }
                if (((c10 == true ? 1 : 0) & 256) == 256) {
                    this.f44556P = Collections.unmodifiableList(this.f44556P);
                }
                if (((c10 == true ? 1 : 0) & 262144) == 262144) {
                    this.f44568b0 = Collections.unmodifiableList(this.f44568b0);
                }
                if (((c10 == true ? 1 : 0) & 524288) == 524288) {
                    this.f44570d0 = Collections.unmodifiableList(this.f44570d0);
                }
                if (((c10 == true ? 1 : 0) & 1048576) == 1048576) {
                    this.f44571e0 = Collections.unmodifiableList(this.f44571e0);
                }
                if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
                    this.f44574h0 = Collections.unmodifiableList(this.f44574h0);
                }
                try {
                    codedOutputStreamJ.I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f44544D = bVarD.e();
                    throw th2;
                }
                this.f44544D = bVarD.e();
                n();
                throw th;
            }
        }
        if (((c10 == true ? 1 : 0) & 32) == 32) {
            this.f44551K = Collections.unmodifiableList(this.f44551K);
        }
        if (((c10 == true ? 1 : 0) & 8) == 8) {
            this.f44549I = Collections.unmodifiableList(this.f44549I);
        }
        if (((c10 == true ? 1 : 0) & 16) == 16) {
            this.f44550J = Collections.unmodifiableList(this.f44550J);
        }
        if (((c10 == true ? 1 : 0) & 64) == 64) {
            this.f44553M = Collections.unmodifiableList(this.f44553M);
        }
        if (((c10 == true ? 1 : 0) & 512) == 512) {
            this.f44558R = Collections.unmodifiableList(this.f44558R);
        }
        if (((c10 == true ? 1 : 0) & 1024) == 1024) {
            this.f44559S = Collections.unmodifiableList(this.f44559S);
        }
        if (((c10 == true ? 1 : 0) & 2048) == 2048) {
            this.f44560T = Collections.unmodifiableList(this.f44560T);
        }
        if (((c10 == true ? 1 : 0) & 4096) == 4096) {
            this.f44561U = Collections.unmodifiableList(this.f44561U);
        }
        if (((c10 == true ? 1 : 0) & 8192) == 8192) {
            this.f44562V = Collections.unmodifiableList(this.f44562V);
        }
        if (((c10 == true ? 1 : 0) & 16384) == 16384) {
            this.f44563W = Collections.unmodifiableList(this.f44563W);
        }
        if (((c10 == true ? 1 : 0) & 128) == 128) {
            this.f44555O = Collections.unmodifiableList(this.f44555O);
        }
        if (((c10 == true ? 1 : 0) & 256) == 256) {
            this.f44556P = Collections.unmodifiableList(this.f44556P);
        }
        if (((c10 == true ? 1 : 0) & 262144) == 262144) {
            this.f44568b0 = Collections.unmodifiableList(this.f44568b0);
        }
        if (((c10 == true ? 1 : 0) & 524288) == 524288) {
            this.f44570d0 = Collections.unmodifiableList(this.f44570d0);
        }
        if (((c10 == true ? 1 : 0) & 1048576) == 1048576) {
            this.f44571e0 = Collections.unmodifiableList(this.f44571e0);
        }
        if (((c10 == true ? 1 : 0) & 4194304) == 4194304) {
            this.f44574h0 = Collections.unmodifiableList(this.f44574h0);
        }
        try {
            codedOutputStreamJ.I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f44544D = bVarD.e();
            throw th3;
        }
        this.f44544D = bVarD.e();
        n();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: lb.c$b */
    public static final class b extends h.c<C3923c, b> implements kotlin.reflect.jvm.internal.impl.protobuf.p {

        /* renamed from: E, reason: collision with root package name */
        private int f44578E;

        /* renamed from: G, reason: collision with root package name */
        private int f44580G;

        /* renamed from: H, reason: collision with root package name */
        private int f44581H;

        /* renamed from: U, reason: collision with root package name */
        private int f44594U;

        /* renamed from: W, reason: collision with root package name */
        private int f44596W;

        /* renamed from: F, reason: collision with root package name */
        private int f44579F = 6;

        /* renamed from: I, reason: collision with root package name */
        private List<C3939s> f44582I = Collections.emptyList();

        /* renamed from: J, reason: collision with root package name */
        private List<C3937q> f44583J = Collections.emptyList();

        /* renamed from: K, reason: collision with root package name */
        private List<Integer> f44584K = Collections.emptyList();

        /* renamed from: L, reason: collision with root package name */
        private List<Integer> f44585L = Collections.emptyList();

        /* renamed from: M, reason: collision with root package name */
        private List<C3937q> f44586M = Collections.emptyList();

        /* renamed from: N, reason: collision with root package name */
        private List<Integer> f44587N = Collections.emptyList();

        /* renamed from: O, reason: collision with root package name */
        private List<C3924d> f44588O = Collections.emptyList();

        /* renamed from: P, reason: collision with root package name */
        private List<C3929i> f44589P = Collections.emptyList();

        /* renamed from: Q, reason: collision with root package name */
        private List<C3934n> f44590Q = Collections.emptyList();

        /* renamed from: R, reason: collision with root package name */
        private List<C3938r> f44591R = Collections.emptyList();

        /* renamed from: S, reason: collision with root package name */
        private List<C3927g> f44592S = Collections.emptyList();

        /* renamed from: T, reason: collision with root package name */
        private List<Integer> f44593T = Collections.emptyList();

        /* renamed from: V, reason: collision with root package name */
        private C3937q f44595V = C3937q.Y();

        /* renamed from: X, reason: collision with root package name */
        private List<Integer> f44597X = Collections.emptyList();

        /* renamed from: Y, reason: collision with root package name */
        private List<C3937q> f44598Y = Collections.emptyList();

        /* renamed from: Z, reason: collision with root package name */
        private List<Integer> f44599Z = Collections.emptyList();

        /* renamed from: a0, reason: collision with root package name */
        private C3940t f44600a0 = C3940t.x();

        /* renamed from: b0, reason: collision with root package name */
        private List<Integer> f44601b0 = Collections.emptyList();

        /* renamed from: c0, reason: collision with root package name */
        private w f44602c0 = w.v();

        private b() {
            T();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static b B() {
            return new b();
        }

        private void C() {
            if ((this.f44578E & 512) != 512) {
                this.f44588O = new ArrayList(this.f44588O);
                this.f44578E |= 512;
            }
        }

        private void D() {
            if ((this.f44578E & 256) != 256) {
                this.f44587N = new ArrayList(this.f44587N);
                this.f44578E |= 256;
            }
        }

        private void E() {
            if ((this.f44578E & 128) != 128) {
                this.f44586M = new ArrayList(this.f44586M);
                this.f44578E |= 128;
            }
        }

        private void F() {
            if ((this.f44578E & 8192) != 8192) {
                this.f44592S = new ArrayList(this.f44592S);
                this.f44578E |= 8192;
            }
        }

        private void G() {
            if ((this.f44578E & 1024) != 1024) {
                this.f44589P = new ArrayList(this.f44589P);
                this.f44578E |= 1024;
            }
        }

        private void H() {
            if ((this.f44578E & 262144) != 262144) {
                this.f44597X = new ArrayList(this.f44597X);
                this.f44578E |= 262144;
            }
        }

        private void I() {
            if ((this.f44578E & 1048576) != 1048576) {
                this.f44599Z = new ArrayList(this.f44599Z);
                this.f44578E |= 1048576;
            }
        }

        private void J() {
            if ((this.f44578E & 524288) != 524288) {
                this.f44598Y = new ArrayList(this.f44598Y);
                this.f44578E |= 524288;
            }
        }

        private void L() {
            if ((this.f44578E & 64) != 64) {
                this.f44585L = new ArrayList(this.f44585L);
                this.f44578E |= 64;
            }
        }

        private void M() {
            if ((this.f44578E & 2048) != 2048) {
                this.f44590Q = new ArrayList(this.f44590Q);
                this.f44578E |= 2048;
            }
        }

        private void N() {
            if ((this.f44578E & 16384) != 16384) {
                this.f44593T = new ArrayList(this.f44593T);
                this.f44578E |= 16384;
            }
        }

        private void O() {
            if ((this.f44578E & 32) != 32) {
                this.f44584K = new ArrayList(this.f44584K);
                this.f44578E |= 32;
            }
        }

        private void P() {
            if ((this.f44578E & 16) != 16) {
                this.f44583J = new ArrayList(this.f44583J);
                this.f44578E |= 16;
            }
        }

        private void Q() {
            if ((this.f44578E & 4096) != 4096) {
                this.f44591R = new ArrayList(this.f44591R);
                this.f44578E |= 4096;
            }
        }

        private void R() {
            if ((this.f44578E & 8) != 8) {
                this.f44582I = new ArrayList(this.f44582I);
                this.f44578E |= 8;
            }
        }

        private void S() {
            if ((this.f44578E & 4194304) != 4194304) {
                this.f44601b0 = new ArrayList(this.f44601b0);
                this.f44578E |= 4194304;
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: A, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        public b m() {
            return B().o(w());
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.a.AbstractC0582a
        /* renamed from: U, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public lb.C3923c.b k(kotlin.reflect.jvm.internal.impl.protobuf.e r3, kotlin.reflect.jvm.internal.impl.protobuf.f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<lb.c> r1 = lb.C3923c.f44543m0     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                lb.c r3 = (lb.C3923c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                lb.c r4 = (lb.C3923c) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: lb.C3923c.b.h0(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):lb.c$b");
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h.b
        /* renamed from: V, reason: merged with bridge method [inline-methods] */
        public b o(C3923c c3923c) {
            if (c3923c == C3923c.A0()) {
                return this;
            }
            if (c3923c.n1()) {
                b0(c3923c.F0());
            }
            if (c3923c.o1()) {
                c0(c3923c.G0());
            }
            if (c3923c.m1()) {
                Z(c3923c.s0());
            }
            if (!c3923c.f44549I.isEmpty()) {
                if (this.f44582I.isEmpty()) {
                    this.f44582I = c3923c.f44549I;
                    this.f44578E &= -9;
                } else {
                    R();
                    this.f44582I.addAll(c3923c.f44549I);
                }
            }
            if (!c3923c.f44550J.isEmpty()) {
                if (this.f44583J.isEmpty()) {
                    this.f44583J = c3923c.f44550J;
                    this.f44578E &= -17;
                } else {
                    P();
                    this.f44583J.addAll(c3923c.f44550J);
                }
            }
            if (!c3923c.f44551K.isEmpty()) {
                if (this.f44584K.isEmpty()) {
                    this.f44584K = c3923c.f44551K;
                    this.f44578E &= -33;
                } else {
                    O();
                    this.f44584K.addAll(c3923c.f44551K);
                }
            }
            if (!c3923c.f44553M.isEmpty()) {
                if (this.f44585L.isEmpty()) {
                    this.f44585L = c3923c.f44553M;
                    this.f44578E &= -65;
                } else {
                    L();
                    this.f44585L.addAll(c3923c.f44553M);
                }
            }
            if (!c3923c.f44555O.isEmpty()) {
                if (this.f44586M.isEmpty()) {
                    this.f44586M = c3923c.f44555O;
                    this.f44578E &= -129;
                } else {
                    E();
                    this.f44586M.addAll(c3923c.f44555O);
                }
            }
            if (!c3923c.f44556P.isEmpty()) {
                if (this.f44587N.isEmpty()) {
                    this.f44587N = c3923c.f44556P;
                    this.f44578E &= -257;
                } else {
                    D();
                    this.f44587N.addAll(c3923c.f44556P);
                }
            }
            if (!c3923c.f44558R.isEmpty()) {
                if (this.f44588O.isEmpty()) {
                    this.f44588O = c3923c.f44558R;
                    this.f44578E &= -513;
                } else {
                    C();
                    this.f44588O.addAll(c3923c.f44558R);
                }
            }
            if (!c3923c.f44559S.isEmpty()) {
                if (this.f44589P.isEmpty()) {
                    this.f44589P = c3923c.f44559S;
                    this.f44578E &= -1025;
                } else {
                    G();
                    this.f44589P.addAll(c3923c.f44559S);
                }
            }
            if (!c3923c.f44560T.isEmpty()) {
                if (this.f44590Q.isEmpty()) {
                    this.f44590Q = c3923c.f44560T;
                    this.f44578E &= -2049;
                } else {
                    M();
                    this.f44590Q.addAll(c3923c.f44560T);
                }
            }
            if (!c3923c.f44561U.isEmpty()) {
                if (this.f44591R.isEmpty()) {
                    this.f44591R = c3923c.f44561U;
                    this.f44578E &= -4097;
                } else {
                    Q();
                    this.f44591R.addAll(c3923c.f44561U);
                }
            }
            if (!c3923c.f44562V.isEmpty()) {
                if (this.f44592S.isEmpty()) {
                    this.f44592S = c3923c.f44562V;
                    this.f44578E &= -8193;
                } else {
                    F();
                    this.f44592S.addAll(c3923c.f44562V);
                }
            }
            if (!c3923c.f44563W.isEmpty()) {
                if (this.f44593T.isEmpty()) {
                    this.f44593T = c3923c.f44563W;
                    this.f44578E &= -16385;
                } else {
                    N();
                    this.f44593T.addAll(c3923c.f44563W);
                }
            }
            if (c3923c.p1()) {
                d0(c3923c.K0());
            }
            if (c3923c.q1()) {
                W(c3923c.L0());
            }
            if (c3923c.r1()) {
                e0(c3923c.M0());
            }
            if (!c3923c.f44568b0.isEmpty()) {
                if (this.f44597X.isEmpty()) {
                    this.f44597X = c3923c.f44568b0;
                    this.f44578E &= -262145;
                } else {
                    H();
                    this.f44597X.addAll(c3923c.f44568b0);
                }
            }
            if (!c3923c.f44570d0.isEmpty()) {
                if (this.f44598Y.isEmpty()) {
                    this.f44598Y = c3923c.f44570d0;
                    this.f44578E &= -524289;
                } else {
                    J();
                    this.f44598Y.addAll(c3923c.f44570d0);
                }
            }
            if (!c3923c.f44571e0.isEmpty()) {
                if (this.f44599Z.isEmpty()) {
                    this.f44599Z = c3923c.f44571e0;
                    this.f44578E &= -1048577;
                } else {
                    I();
                    this.f44599Z.addAll(c3923c.f44571e0);
                }
            }
            if (c3923c.s1()) {
                X(c3923c.j1());
            }
            if (!c3923c.f44574h0.isEmpty()) {
                if (this.f44601b0.isEmpty()) {
                    this.f44601b0 = c3923c.f44574h0;
                    this.f44578E &= -4194305;
                } else {
                    S();
                    this.f44601b0.addAll(c3923c.f44574h0);
                }
            }
            if (c3923c.t1()) {
                Y(c3923c.l1());
            }
            t(c3923c);
            p(n().f(c3923c.f44544D));
            return this;
        }

        public b W(C3937q c3937q) {
            if ((this.f44578E & 65536) != 65536 || this.f44595V == C3937q.Y()) {
                this.f44595V = c3937q;
            } else {
                this.f44595V = C3937q.A0(this.f44595V).o(c3937q).w();
            }
            this.f44578E |= 65536;
            return this;
        }

        public b X(C3940t c3940t) {
            if ((this.f44578E & 2097152) != 2097152 || this.f44600a0 == C3940t.x()) {
                this.f44600a0 = c3940t;
            } else {
                this.f44600a0 = C3940t.F(this.f44600a0).o(c3940t).s();
            }
            this.f44578E |= 2097152;
            return this;
        }

        public b Y(w wVar) {
            if ((this.f44578E & 8388608) != 8388608 || this.f44602c0 == w.v()) {
                this.f44602c0 = wVar;
            } else {
                this.f44602c0 = w.A(this.f44602c0).o(wVar).s();
            }
            this.f44578E |= 8388608;
            return this;
        }

        public b Z(int i10) {
            this.f44578E |= 4;
            this.f44581H = i10;
            return this;
        }

        public b b0(int i10) {
            this.f44578E |= 1;
            this.f44579F = i10;
            return this;
        }

        public b c0(int i10) {
            this.f44578E |= 2;
            this.f44580G = i10;
            return this;
        }

        public b d0(int i10) {
            this.f44578E |= 32768;
            this.f44594U = i10;
            return this;
        }

        public b e0(int i10) {
            this.f44578E |= 131072;
            this.f44596W = i10;
            return this;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.o.a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public C3923c e() {
            C3923c c3923cW = w();
            if (c3923cW.b()) {
                return c3923cW;
            }
            throw a.AbstractC0582a.l(c3923cW);
        }

        public C3923c w() {
            C3923c c3923c = new C3923c(this);
            int i10 = this.f44578E;
            int i11 = (i10 & 1) != 1 ? 0 : 1;
            c3923c.f44546F = this.f44579F;
            if ((i10 & 2) == 2) {
                i11 |= 2;
            }
            c3923c.f44547G = this.f44580G;
            if ((i10 & 4) == 4) {
                i11 |= 4;
            }
            c3923c.f44548H = this.f44581H;
            if ((this.f44578E & 8) == 8) {
                this.f44582I = Collections.unmodifiableList(this.f44582I);
                this.f44578E &= -9;
            }
            c3923c.f44549I = this.f44582I;
            if ((this.f44578E & 16) == 16) {
                this.f44583J = Collections.unmodifiableList(this.f44583J);
                this.f44578E &= -17;
            }
            c3923c.f44550J = this.f44583J;
            if ((this.f44578E & 32) == 32) {
                this.f44584K = Collections.unmodifiableList(this.f44584K);
                this.f44578E &= -33;
            }
            c3923c.f44551K = this.f44584K;
            if ((this.f44578E & 64) == 64) {
                this.f44585L = Collections.unmodifiableList(this.f44585L);
                this.f44578E &= -65;
            }
            c3923c.f44553M = this.f44585L;
            if ((this.f44578E & 128) == 128) {
                this.f44586M = Collections.unmodifiableList(this.f44586M);
                this.f44578E &= -129;
            }
            c3923c.f44555O = this.f44586M;
            if ((this.f44578E & 256) == 256) {
                this.f44587N = Collections.unmodifiableList(this.f44587N);
                this.f44578E &= -257;
            }
            c3923c.f44556P = this.f44587N;
            if ((this.f44578E & 512) == 512) {
                this.f44588O = Collections.unmodifiableList(this.f44588O);
                this.f44578E &= -513;
            }
            c3923c.f44558R = this.f44588O;
            if ((this.f44578E & 1024) == 1024) {
                this.f44589P = Collections.unmodifiableList(this.f44589P);
                this.f44578E &= -1025;
            }
            c3923c.f44559S = this.f44589P;
            if ((this.f44578E & 2048) == 2048) {
                this.f44590Q = Collections.unmodifiableList(this.f44590Q);
                this.f44578E &= -2049;
            }
            c3923c.f44560T = this.f44590Q;
            if ((this.f44578E & 4096) == 4096) {
                this.f44591R = Collections.unmodifiableList(this.f44591R);
                this.f44578E &= -4097;
            }
            c3923c.f44561U = this.f44591R;
            if ((this.f44578E & 8192) == 8192) {
                this.f44592S = Collections.unmodifiableList(this.f44592S);
                this.f44578E &= -8193;
            }
            c3923c.f44562V = this.f44592S;
            if ((this.f44578E & 16384) == 16384) {
                this.f44593T = Collections.unmodifiableList(this.f44593T);
                this.f44578E &= -16385;
            }
            c3923c.f44563W = this.f44593T;
            if ((i10 & 32768) == 32768) {
                i11 |= 8;
            }
            c3923c.f44565Y = this.f44594U;
            if ((i10 & 65536) == 65536) {
                i11 |= 16;
            }
            c3923c.f44566Z = this.f44595V;
            if ((i10 & 131072) == 131072) {
                i11 |= 32;
            }
            c3923c.f44567a0 = this.f44596W;
            if ((this.f44578E & 262144) == 262144) {
                this.f44597X = Collections.unmodifiableList(this.f44597X);
                this.f44578E &= -262145;
            }
            c3923c.f44568b0 = this.f44597X;
            if ((this.f44578E & 524288) == 524288) {
                this.f44598Y = Collections.unmodifiableList(this.f44598Y);
                this.f44578E &= -524289;
            }
            c3923c.f44570d0 = this.f44598Y;
            if ((this.f44578E & 1048576) == 1048576) {
                this.f44599Z = Collections.unmodifiableList(this.f44599Z);
                this.f44578E &= -1048577;
            }
            c3923c.f44571e0 = this.f44599Z;
            if ((i10 & 2097152) == 2097152) {
                i11 |= 64;
            }
            c3923c.f44573g0 = this.f44600a0;
            if ((this.f44578E & 4194304) == 4194304) {
                this.f44601b0 = Collections.unmodifiableList(this.f44601b0);
                this.f44578E &= -4194305;
            }
            c3923c.f44574h0 = this.f44601b0;
            if ((i10 & 8388608) == 8388608) {
                i11 |= 128;
            }
            c3923c.f44575i0 = this.f44602c0;
            c3923c.f44545E = i11;
            return c3923c;
        }

        private void T() {
        }
    }
}
