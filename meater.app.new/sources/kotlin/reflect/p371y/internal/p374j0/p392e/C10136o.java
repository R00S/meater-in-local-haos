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
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* compiled from: ProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.o */
/* loaded from: classes3.dex */
public final class C10136o extends AbstractC10749h implements InterfaceC10757p {

    /* renamed from: g */
    private static final C10136o f38949g;

    /* renamed from: h */
    public static InterfaceC10758q<C10136o> f38950h = new a();

    /* renamed from: i */
    private final AbstractC10745d f38951i;

    /* renamed from: j */
    private List<c> f38952j;

    /* renamed from: k */
    private byte f38953k;

    /* renamed from: l */
    private int f38954l;

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.o$a */
    static class a extends AbstractC10743b<C10136o> {
        a() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public C10136o mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            return new C10136o(c10746e, c10747f);
        }
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.o$b */
    public static final class b extends AbstractC10749h.b<C10136o, b> implements InterfaceC10757p {

        /* renamed from: g */
        private int f38955g;

        /* renamed from: h */
        private List<c> f38956h = Collections.emptyList();

        private b() {
            m34947u();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: s */
        public static b m34945s() {
            return new b();
        }

        /* renamed from: t */
        private void m34946t() {
            if ((this.f38955g & 1) != 1) {
                this.f38956h = new ArrayList(this.f38956h);
                this.f38955g |= 1;
            }
        }

        /* renamed from: u */
        private void m34947u() {
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public C10136o mo34093c() {
            C10136o c10136oM34949q = m34949q();
            if (c10136oM34949q.isInitialized()) {
                return c10136oM34949q;
            }
            throw AbstractC10742a.a.m38257j(c10136oM34949q);
        }

        /* renamed from: q */
        public C10136o m34949q() {
            C10136o c10136o = new C10136o(this);
            if ((this.f38955g & 1) == 1) {
                this.f38956h = Collections.unmodifiableList(this.f38956h);
                this.f38955g &= -2;
            }
            c10136o.f38952j = this.f38956h;
            return c10136o;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public b mo34095k() {
            return m34945s().mo34096m(m34949q());
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public b mo34096m(C10136o c10136o) {
            if (c10136o == C10136o.m34935u()) {
                return this;
            }
            if (!c10136o.f38952j.isEmpty()) {
                if (this.f38956h.isEmpty()) {
                    this.f38956h = c10136o.f38952j;
                    this.f38955g &= -2;
                } else {
                    m34946t();
                    this.f38956h.addAll(c10136o.f38952j);
                }
            }
            m38392n(m38391l().m38286f(c10136o.f38951i));
            return this;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
            /*
                r2 = this;
                r0 = 0
                kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.o> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.f38950h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                kotlin.f0.y.e.j0.e.o r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10136o) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                kotlin.f0.y.e.j0.e.o r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10136o) r4     // Catch: java.lang.Throwable -> Lf
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
            throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.o$b");
        }
    }

    static {
        C10136o c10136o = new C10136o(true);
        f38949g = c10136o;
        c10136o.m34936x();
    }

    /* renamed from: u */
    public static C10136o m34935u() {
        return f38949g;
    }

    /* renamed from: x */
    private void m34936x() {
        this.f38952j = Collections.emptyList();
    }

    /* renamed from: y */
    public static b m34937y() {
        return b.m34945s();
    }

    /* renamed from: z */
    public static b m34938z(C10136o c10136o) {
        return m34937y().mo34096m(c10136o);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public b mo34079f() {
        return m34937y();
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: B, reason: merged with bridge method [inline-methods] */
    public b mo34077d() {
        return m34938z(this);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: e */
    public int mo34078e() {
        int i2 = this.f38954l;
        if (i2 != -1) {
            return i2;
        }
        int iM38193s = 0;
        for (int i3 = 0; i3 < this.f38952j.size(); i3++) {
            iM38193s += CodedOutputStream.m38193s(1, this.f38952j.get(i3));
        }
        int size = iM38193s + this.f38951i.size();
        this.f38954l = size;
        return size;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<C10136o> mo34080g() {
        return f38950h;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: h */
    public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
        mo34078e();
        for (int i2 = 0; i2 < this.f38952j.size(); i2++) {
            codedOutputStream.m38220d0(1, this.f38952j.get(i2));
        }
        codedOutputStream.m38225i0(this.f38951i);
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
    public final boolean isInitialized() {
        byte b2 = this.f38953k;
        if (b2 == 1) {
            return true;
        }
        if (b2 == 0) {
            return false;
        }
        for (int i2 = 0; i2 < m34942w(); i2++) {
            if (!m34941v(i2).isInitialized()) {
                this.f38953k = (byte) 0;
                return false;
            }
        }
        this.f38953k = (byte) 1;
        return true;
    }

    /* renamed from: v */
    public c m34941v(int i2) {
        return this.f38952j.get(i2);
    }

    /* renamed from: w */
    public int m34942w() {
        return this.f38952j.size();
    }

    /* compiled from: ProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.o$c */
    public static final class c extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final c f38957g;

        /* renamed from: h */
        public static InterfaceC10758q<c> f38958h = new a();

        /* renamed from: i */
        private final AbstractC10745d f38959i;

        /* renamed from: j */
        private int f38960j;

        /* renamed from: k */
        private int f38961k;

        /* renamed from: l */
        private int f38962l;

        /* renamed from: m */
        private EnumC11557c f38963m;

        /* renamed from: n */
        private byte f38964n;

        /* renamed from: o */
        private int f38965o;

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.o$c$a */
        static class a extends AbstractC10743b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new c(c10746e, c10747f);
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.o$c$b */
        public static final class b extends AbstractC10749h.b<c, b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f38966g;

            /* renamed from: i */
            private int f38968i;

            /* renamed from: h */
            private int f38967h = -1;

            /* renamed from: j */
            private EnumC11557c f38969j = EnumC11557c.PACKAGE;

            private b() {
                m34973t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static b m34972s() {
                return new b();
            }

            /* renamed from: t */
            private void m34973t() {
            }

            /* renamed from: A */
            public b m34974A(int i2) {
                this.f38966g |= 1;
                this.f38967h = i2;
                return this;
            }

            /* renamed from: B */
            public b m34975B(int i2) {
                this.f38966g |= 2;
                this.f38968i = i2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public c mo34093c() {
                c cVarM34977q = m34977q();
                if (cVarM34977q.isInitialized()) {
                    return cVarM34977q;
                }
                throw AbstractC10742a.a.m38257j(cVarM34977q);
            }

            /* renamed from: q */
            public c m34977q() {
                c cVar = new c(this);
                int i2 = this.f38966g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                cVar.f38961k = this.f38967h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                cVar.f38962l = this.f38968i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                cVar.f38963m = this.f38969j;
                cVar.f38960j = i3;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo34095k() {
                return m34972s().mo34096m(m34977q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo34096m(c cVar) {
                if (cVar == c.m34961w()) {
                    return this;
                }
                if (cVar.m34963B()) {
                    m34974A(cVar.m34968y());
                }
                if (cVar.m34964C()) {
                    m34975B(cVar.m34969z());
                }
                if (cVar.m34962A()) {
                    m34981w(cVar.m34967x());
                }
                m38392n(m38391l().m38286f(cVar.f38959i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.c.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.o$c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.c.f38958h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.o$c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.o$c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.C10136o.c.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.o$c$b");
            }

            /* renamed from: w */
            public b m34981w(EnumC11557c enumC11557c) {
                enumC11557c.getClass();
                this.f38966g |= 4;
                this.f38969j = enumC11557c;
                return this;
            }
        }

        /* compiled from: ProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.o$c$c, reason: collision with other inner class name */
        public enum EnumC11557c implements C10750i.a {
            CLASS(0, 0),
            PACKAGE(1, 1),
            LOCAL(2, 2);


            /* renamed from: i */
            private static C10750i.b<EnumC11557c> f38973i = new a();

            /* renamed from: k */
            private final int f38975k;

            /* compiled from: ProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.o$c$c$a */
            static class a implements C10750i.b<EnumC11557c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public EnumC11557c mo34236a(int i2) {
                    return EnumC11557c.m34982g(i2);
                }
            }

            EnumC11557c(int i2, int i3) {
                this.f38975k = i3;
            }

            /* renamed from: g */
            public static EnumC11557c m34982g(int i2) {
                if (i2 == 0) {
                    return CLASS;
                }
                if (i2 == 1) {
                    return PACKAGE;
                }
                if (i2 != 2) {
                    return null;
                }
                return LOCAL;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
            /* renamed from: f */
            public final int mo34235f() {
                return this.f38975k;
            }
        }

        static {
            c cVar = new c(true);
            f38957g = cVar;
            cVar.m34953D();
        }

        /* renamed from: D */
        private void m34953D() {
            this.f38961k = -1;
            this.f38962l = 0;
            this.f38963m = EnumC11557c.PACKAGE;
        }

        /* renamed from: E */
        public static b m34954E() {
            return b.m34972s();
        }

        /* renamed from: F */
        public static b m34955F(c cVar) {
            return m34954E().mo34096m(cVar);
        }

        /* renamed from: w */
        public static c m34961w() {
            return f38957g;
        }

        /* renamed from: A */
        public boolean m34962A() {
            return (this.f38960j & 4) == 4;
        }

        /* renamed from: B */
        public boolean m34963B() {
            return (this.f38960j & 1) == 1;
        }

        /* renamed from: C */
        public boolean m34964C() {
            return (this.f38960j & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public b mo34079f() {
            return m34954E();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: H, reason: merged with bridge method [inline-methods] */
        public b mo34077d() {
            return m34955F(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38965o;
            if (i2 != -1) {
                return i2;
            }
            int iM38189o = (this.f38960j & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f38961k) : 0;
            if ((this.f38960j & 2) == 2) {
                iM38189o += CodedOutputStream.m38189o(2, this.f38962l);
            }
            if ((this.f38960j & 4) == 4) {
                iM38189o += CodedOutputStream.m38182h(3, this.f38963m.mo34235f());
            }
            int size = iM38189o + this.f38959i.size();
            this.f38965o = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<c> mo34080g() {
            return f38958h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f38960j & 1) == 1) {
                codedOutputStream.m38217a0(1, this.f38961k);
            }
            if ((this.f38960j & 2) == 2) {
                codedOutputStream.m38217a0(2, this.f38962l);
            }
            if ((this.f38960j & 4) == 4) {
                codedOutputStream.m38209S(3, this.f38963m.mo34235f());
            }
            codedOutputStream.m38225i0(this.f38959i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f38964n;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            if (m34964C()) {
                this.f38964n = (byte) 1;
                return true;
            }
            this.f38964n = (byte) 0;
            return false;
        }

        /* renamed from: x */
        public EnumC11557c m34967x() {
            return this.f38963m;
        }

        /* renamed from: y */
        public int m34968y() {
            return this.f38961k;
        }

        /* renamed from: z */
        public int m34969z() {
            return this.f38962l;
        }

        private c(AbstractC10749h.b bVar) {
            super(bVar);
            this.f38964n = (byte) -1;
            this.f38965o = -1;
            this.f38959i = bVar.m38391l();
        }

        private c(boolean z) {
            this.f38964n = (byte) -1;
            this.f38965o = -1;
            this.f38959i = AbstractC10745d.f41263f;
        }

        private c(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f38964n = (byte) -1;
            this.f38965o = -1;
            m34953D();
            AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
            CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 8) {
                                this.f38960j |= 1;
                                this.f38961k = c10746e.m38339s();
                            } else if (iM38320K == 16) {
                                this.f38960j |= 2;
                                this.f38962l = c10746e.m38339s();
                            } else if (iM38320K != 24) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                int iM38334n = c10746e.m38334n();
                                EnumC11557c enumC11557cM34982g = EnumC11557c.m34982g(iM38334n);
                                if (enumC11557cM34982g == null) {
                                    codedOutputStreamM38173J.m38231o0(iM38320K);
                                    codedOutputStreamM38173J.m38231o0(iM38334n);
                                } else {
                                    this.f38960j |= 4;
                                    this.f38963m = enumC11557cM34982g;
                                }
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
                        this.f38959i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38959i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38959i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f38959i = bVarM38280w.m38299e();
            mo38389m();
        }
    }

    private C10136o(AbstractC10749h.b bVar) {
        super(bVar);
        this.f38953k = (byte) -1;
        this.f38954l = -1;
        this.f38951i = bVar.m38391l();
    }

    private C10136o(boolean z) {
        this.f38953k = (byte) -1;
        this.f38954l = -1;
        this.f38951i = AbstractC10745d.f41263f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private C10136o(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
        this.f38953k = (byte) -1;
        this.f38954l = -1;
        m34936x();
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
                                this.f38952j = new ArrayList();
                                z2 |= true;
                            }
                            this.f38952j.add(c10746e.m38341u(c.f38958h, c10747f));
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
                    this.f38952j = Collections.unmodifiableList(this.f38952j);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused) {
                } catch (Throwable th2) {
                    this.f38951i = bVarM38280w.m38299e();
                    throw th2;
                }
                this.f38951i = bVarM38280w.m38299e();
                mo38389m();
                throw th;
            }
        }
        if (z2 & true) {
            this.f38952j = Collections.unmodifiableList(this.f38952j);
        }
        try {
            codedOutputStreamM38173J.m38201I();
        } catch (IOException unused2) {
        } catch (Throwable th3) {
            this.f38951i = bVarM38280w.m38299e();
            throw th3;
        }
        this.f38951i = bVarM38280w.m38299e();
        mo38389m();
    }
}
