package kotlin.reflect.p371y.internal.p374j0.p392e.p393a0;

import java.io.IOException;
import java.io.InputStream;
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
import kotlin.reflect.jvm.internal.impl.protobuf.C10764w;
import kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10123b;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10124c;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10125d;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10130i;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10133l;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10135n;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10138q;
import kotlin.reflect.p371y.internal.p374j0.p392e.C10140s;
import okhttp3.HttpUrl;

/* compiled from: JvmProtoBuf.java */
/* renamed from: kotlin.f0.y.e.j0.e.a0.a */
/* loaded from: classes3.dex */
public final class C10112a {

    /* renamed from: a */
    public static final AbstractC10749h.f<C10125d, c> f38491a;

    /* renamed from: b */
    public static final AbstractC10749h.f<C10130i, c> f38492b;

    /* renamed from: c */
    public static final AbstractC10749h.f<C10130i, Integer> f38493c;

    /* renamed from: d */
    public static final AbstractC10749h.f<C10135n, d> f38494d;

    /* renamed from: e */
    public static final AbstractC10749h.f<C10135n, Integer> f38495e;

    /* renamed from: f */
    public static final AbstractC10749h.f<C10138q, List<C10123b>> f38496f;

    /* renamed from: g */
    public static final AbstractC10749h.f<C10138q, Boolean> f38497g;

    /* renamed from: h */
    public static final AbstractC10749h.f<C10140s, List<C10123b>> f38498h;

    /* renamed from: i */
    public static final AbstractC10749h.f<C10124c, Integer> f38499i;

    /* renamed from: j */
    public static final AbstractC10749h.f<C10124c, List<C10135n>> f38500j;

    /* renamed from: k */
    public static final AbstractC10749h.f<C10124c, Integer> f38501k;

    /* renamed from: l */
    public static final AbstractC10749h.f<C10124c, Integer> f38502l;

    /* renamed from: m */
    public static final AbstractC10749h.f<C10133l, Integer> f38503m;

    /* renamed from: n */
    public static final AbstractC10749h.f<C10133l, List<C10135n>> f38504n;

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e */
    public static final class e extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final e f38544g;

        /* renamed from: h */
        public static InterfaceC10758q<e> f38545h = new a();

        /* renamed from: i */
        private final AbstractC10745d f38546i;

        /* renamed from: j */
        private List<c> f38547j;

        /* renamed from: k */
        private List<Integer> f38548k;

        /* renamed from: l */
        private int f38549l;

        /* renamed from: m */
        private byte f38550m;

        /* renamed from: n */
        private int f38551n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$a */
        static class a extends AbstractC10743b<e> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public e mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new e(c10746e, c10747f);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$b */
        public static final class b extends AbstractC10749h.b<e, b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f38552g;

            /* renamed from: h */
            private List<c> f38553h = Collections.emptyList();

            /* renamed from: i */
            private List<Integer> f38554i = Collections.emptyList();

            private b() {
                m34184v();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static b m34181s() {
                return new b();
            }

            /* renamed from: t */
            private void m34182t() {
                if ((this.f38552g & 2) != 2) {
                    this.f38554i = new ArrayList(this.f38554i);
                    this.f38552g |= 2;
                }
            }

            /* renamed from: u */
            private void m34183u() {
                if ((this.f38552g & 1) != 1) {
                    this.f38553h = new ArrayList(this.f38553h);
                    this.f38552g |= 1;
                }
            }

            /* renamed from: v */
            private void m34184v() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.a0.a$e> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.f38545h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.a0.a$e r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.a0.a$e r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.a0.a$e$b");
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public e mo34093c() {
                e eVarM34187q = m34187q();
                if (eVarM34187q.isInitialized()) {
                    return eVarM34187q;
                }
                throw AbstractC10742a.a.m38257j(eVarM34187q);
            }

            /* renamed from: q */
            public e m34187q() {
                e eVar = new e(this);
                if ((this.f38552g & 1) == 1) {
                    this.f38553h = Collections.unmodifiableList(this.f38553h);
                    this.f38552g &= -2;
                }
                eVar.f38547j = this.f38553h;
                if ((this.f38552g & 2) == 2) {
                    this.f38554i = Collections.unmodifiableList(this.f38554i);
                    this.f38552g &= -3;
                }
                eVar.f38548k = this.f38554i;
                return eVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo34095k() {
                return m34181s().mo34096m(m34187q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public b mo34096m(e eVar) {
                if (eVar == e.m34173w()) {
                    return this;
                }
                if (!eVar.f38547j.isEmpty()) {
                    if (this.f38553h.isEmpty()) {
                        this.f38553h = eVar.f38547j;
                        this.f38552g &= -2;
                    } else {
                        m34183u();
                        this.f38553h.addAll(eVar.f38547j);
                    }
                }
                if (!eVar.f38548k.isEmpty()) {
                    if (this.f38554i.isEmpty()) {
                        this.f38554i = eVar.f38548k;
                        this.f38552g &= -3;
                    } else {
                        m34182t();
                        this.f38554i.addAll(eVar.f38548k);
                    }
                }
                m38392n(m38391l().m38286f(eVar.f38546i));
                return this;
            }
        }

        static {
            e eVar = new e(true);
            f38544g = eVar;
            eVar.m34174z();
        }

        /* renamed from: A */
        public static b m34165A() {
            return b.m34181s();
        }

        /* renamed from: B */
        public static b m34166B(e eVar) {
            return m34165A().mo34096m(eVar);
        }

        /* renamed from: D */
        public static e m34167D(InputStream inputStream, C10747f c10747f) throws IOException {
            return f38545h.mo38261c(inputStream, c10747f);
        }

        /* renamed from: w */
        public static e m34173w() {
            return f38544g;
        }

        /* renamed from: z */
        private void m34174z() {
            this.f38547j = Collections.emptyList();
            this.f38548k = Collections.emptyList();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public b mo34079f() {
            return m34165A();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b mo34077d() {
            return m34166B(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38551n;
            if (i2 != -1) {
                return i2;
            }
            int iM38193s = 0;
            for (int i3 = 0; i3 < this.f38547j.size(); i3++) {
                iM38193s += CodedOutputStream.m38193s(1, this.f38547j.get(i3));
            }
            int iM38190p = 0;
            for (int i4 = 0; i4 < this.f38548k.size(); i4++) {
                iM38190p += CodedOutputStream.m38190p(this.f38548k.get(i4).intValue());
            }
            int iM38190p2 = iM38193s + iM38190p;
            if (!m34177x().isEmpty()) {
                iM38190p2 = iM38190p2 + 1 + CodedOutputStream.m38190p(iM38190p);
            }
            this.f38549l = iM38190p;
            int size = iM38190p2 + this.f38546i.size();
            this.f38551n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<e> mo34080g() {
            return f38545h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            for (int i2 = 0; i2 < this.f38547j.size(); i2++) {
                codedOutputStream.m38220d0(1, this.f38547j.get(i2));
            }
            if (m34177x().size() > 0) {
                codedOutputStream.m38231o0(42);
                codedOutputStream.m38231o0(this.f38549l);
            }
            for (int i3 = 0; i3 < this.f38548k.size(); i3++) {
                codedOutputStream.m38218b0(this.f38548k.get(i3).intValue());
            }
            codedOutputStream.m38225i0(this.f38546i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f38550m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f38550m = (byte) 1;
            return true;
        }

        /* renamed from: x */
        public List<Integer> m34177x() {
            return this.f38548k;
        }

        /* renamed from: y */
        public List<c> m34178y() {
            return this.f38547j;
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$c */
        public static final class c extends AbstractC10749h implements InterfaceC10757p {

            /* renamed from: g */
            private static final c f38555g;

            /* renamed from: h */
            public static InterfaceC10758q<c> f38556h = new a();

            /* renamed from: i */
            private final AbstractC10745d f38557i;

            /* renamed from: j */
            private int f38558j;

            /* renamed from: k */
            private int f38559k;

            /* renamed from: l */
            private int f38560l;

            /* renamed from: m */
            private Object f38561m;

            /* renamed from: n */
            private EnumC11553c f38562n;

            /* renamed from: o */
            private List<Integer> f38563o;

            /* renamed from: p */
            private int f38564p;

            /* renamed from: q */
            private List<Integer> f38565q;

            /* renamed from: r */
            private int f38566r;

            /* renamed from: s */
            private byte f38567s;

            /* renamed from: t */
            private int f38568t;

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$c$a */
            static class a extends AbstractC10743b<c> {
                a() {
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
                /* renamed from: m, reason: merged with bridge method [inline-methods] */
                public c mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                    return new c(c10746e, c10747f);
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$c$b */
            public static final class b extends AbstractC10749h.b<c, b> implements InterfaceC10757p {

                /* renamed from: g */
                private int f38569g;

                /* renamed from: i */
                private int f38571i;

                /* renamed from: h */
                private int f38570h = 1;

                /* renamed from: j */
                private Object f38572j = HttpUrl.FRAGMENT_ENCODE_SET;

                /* renamed from: k */
                private EnumC11553c f38573k = EnumC11553c.NONE;

                /* renamed from: l */
                private List<Integer> f38574l = Collections.emptyList();

                /* renamed from: m */
                private List<Integer> f38575m = Collections.emptyList();

                private b() {
                    m34225v();
                }

                /* JADX INFO: Access modifiers changed from: private */
                /* renamed from: s */
                public static b m34222s() {
                    return new b();
                }

                /* renamed from: t */
                private void m34223t() {
                    if ((this.f38569g & 32) != 32) {
                        this.f38575m = new ArrayList(this.f38575m);
                        this.f38569g |= 32;
                    }
                }

                /* renamed from: u */
                private void m34224u() {
                    if ((this.f38569g & 16) != 16) {
                        this.f38574l = new ArrayList(this.f38574l);
                        this.f38569g |= 16;
                    }
                }

                /* renamed from: v */
                private void m34225v() {
                }

                /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
                /* renamed from: A, reason: merged with bridge method [inline-methods] */
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct code enable 'Show inconsistent code' option in preferences
                */
                public kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.c.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                    /*
                        r2 = this;
                        r0 = 0
                        kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.a0.a$e$c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.c.f38556h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                        kotlin.f0.y.e.j0.e.a0.a$e$c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                        kotlin.f0.y.e.j0.e.a0.a$e$c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.c) r4     // Catch: java.lang.Throwable -> Lf
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
                    throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.e.c.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.a0.a$e$c$b");
                }

                /* renamed from: B */
                public b m34227B(EnumC11553c enumC11553c) {
                    enumC11553c.getClass();
                    this.f38569g |= 8;
                    this.f38573k = enumC11553c;
                    return this;
                }

                /* renamed from: C */
                public b m34228C(int i2) {
                    this.f38569g |= 2;
                    this.f38571i = i2;
                    return this;
                }

                /* renamed from: D */
                public b m34229D(int i2) {
                    this.f38569g |= 1;
                    this.f38570h = i2;
                    return this;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
                /* renamed from: p, reason: merged with bridge method [inline-methods] */
                public c mo34093c() {
                    c cVarM34231q = m34231q();
                    if (cVarM34231q.isInitialized()) {
                        return cVarM34231q;
                    }
                    throw AbstractC10742a.a.m38257j(cVarM34231q);
                }

                /* renamed from: q */
                public c m34231q() {
                    c cVar = new c(this);
                    int i2 = this.f38569g;
                    int i3 = (i2 & 1) != 1 ? 0 : 1;
                    cVar.f38559k = this.f38570h;
                    if ((i2 & 2) == 2) {
                        i3 |= 2;
                    }
                    cVar.f38560l = this.f38571i;
                    if ((i2 & 4) == 4) {
                        i3 |= 4;
                    }
                    cVar.f38561m = this.f38572j;
                    if ((i2 & 8) == 8) {
                        i3 |= 8;
                    }
                    cVar.f38562n = this.f38573k;
                    if ((this.f38569g & 16) == 16) {
                        this.f38574l = Collections.unmodifiableList(this.f38574l);
                        this.f38569g &= -17;
                    }
                    cVar.f38563o = this.f38574l;
                    if ((this.f38569g & 32) == 32) {
                        this.f38575m = Collections.unmodifiableList(this.f38575m);
                        this.f38569g &= -33;
                    }
                    cVar.f38565q = this.f38575m;
                    cVar.f38558j = i3;
                    return cVar;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
                /* renamed from: r, reason: merged with bridge method [inline-methods] */
                public b mo34095k() {
                    return m34222s().mo34096m(m34231q());
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
                /* renamed from: w, reason: merged with bridge method [inline-methods] */
                public b mo34096m(c cVar) {
                    if (cVar == c.m34192C()) {
                        return this;
                    }
                    if (cVar.m34216O()) {
                        m34229D(cVar.m34207F());
                    }
                    if (cVar.m34215N()) {
                        m34228C(cVar.m34206E());
                    }
                    if (cVar.m34217P()) {
                        this.f38569g |= 4;
                        this.f38572j = cVar.f38561m;
                    }
                    if (cVar.m34214M()) {
                        m34227B(cVar.m34205D());
                    }
                    if (!cVar.f38563o.isEmpty()) {
                        if (this.f38574l.isEmpty()) {
                            this.f38574l = cVar.f38563o;
                            this.f38569g &= -17;
                        } else {
                            m34224u();
                            this.f38574l.addAll(cVar.f38563o);
                        }
                    }
                    if (!cVar.f38565q.isEmpty()) {
                        if (this.f38575m.isEmpty()) {
                            this.f38575m = cVar.f38565q;
                            this.f38569g &= -33;
                        } else {
                            m34223t();
                            this.f38575m.addAll(cVar.f38565q);
                        }
                    }
                    m38392n(m38391l().m38286f(cVar.f38557i));
                    return this;
                }
            }

            /* compiled from: JvmProtoBuf.java */
            /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$c$c, reason: collision with other inner class name */
            public enum EnumC11553c implements C10750i.a {
                NONE(0, 0),
                INTERNAL_TO_CLASS_ID(1, 1),
                DESC_TO_CLASS_ID(2, 2);


                /* renamed from: i */
                private static C10750i.b<EnumC11553c> f38579i = new a();

                /* renamed from: k */
                private final int f38581k;

                /* compiled from: JvmProtoBuf.java */
                /* renamed from: kotlin.f0.y.e.j0.e.a0.a$e$c$c$a */
                static class a implements C10750i.b<EnumC11553c> {
                    a() {
                    }

                    @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.b
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public EnumC11553c mo34236a(int i2) {
                        return EnumC11553c.m34234g(i2);
                    }
                }

                EnumC11553c(int i2, int i3) {
                    this.f38581k = i3;
                }

                /* renamed from: g */
                public static EnumC11553c m34234g(int i2) {
                    if (i2 == 0) {
                        return NONE;
                    }
                    if (i2 == 1) {
                        return INTERNAL_TO_CLASS_ID;
                    }
                    if (i2 != 2) {
                        return null;
                    }
                    return DESC_TO_CLASS_ID;
                }

                @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10750i.a
                /* renamed from: f */
                public final int mo34235f() {
                    return this.f38581k;
                }
            }

            static {
                c cVar = new c(true);
                f38555g = cVar;
                cVar.m34193Q();
            }

            /* renamed from: C */
            public static c m34192C() {
                return f38555g;
            }

            /* renamed from: Q */
            private void m34193Q() {
                this.f38559k = 1;
                this.f38560l = 0;
                this.f38561m = HttpUrl.FRAGMENT_ENCODE_SET;
                this.f38562n = EnumC11553c.NONE;
                this.f38563o = Collections.emptyList();
                this.f38565q = Collections.emptyList();
            }

            /* renamed from: R */
            public static b m34194R() {
                return b.m34222s();
            }

            /* renamed from: S */
            public static b m34195S(c cVar) {
                return m34194R().mo34096m(cVar);
            }

            /* renamed from: D */
            public EnumC11553c m34205D() {
                return this.f38562n;
            }

            /* renamed from: E */
            public int m34206E() {
                return this.f38560l;
            }

            /* renamed from: F */
            public int m34207F() {
                return this.f38559k;
            }

            /* renamed from: G */
            public int m34208G() {
                return this.f38565q.size();
            }

            /* renamed from: H */
            public List<Integer> m34209H() {
                return this.f38565q;
            }

            /* renamed from: I */
            public String m34210I() {
                Object obj = this.f38561m;
                if (obj instanceof String) {
                    return (String) obj;
                }
                AbstractC10745d abstractC10745d = (AbstractC10745d) obj;
                String strM38283D = abstractC10745d.m38283D();
                if (abstractC10745d.mo38290t()) {
                    this.f38561m = strM38283D;
                }
                return strM38283D;
            }

            /* renamed from: J */
            public AbstractC10745d m34211J() {
                Object obj = this.f38561m;
                if (!(obj instanceof String)) {
                    return (AbstractC10745d) obj;
                }
                AbstractC10745d abstractC10745dM38279n = AbstractC10745d.m38279n((String) obj);
                this.f38561m = abstractC10745dM38279n;
                return abstractC10745dM38279n;
            }

            /* renamed from: K */
            public int m34212K() {
                return this.f38563o.size();
            }

            /* renamed from: L */
            public List<Integer> m34213L() {
                return this.f38563o;
            }

            /* renamed from: M */
            public boolean m34214M() {
                return (this.f38558j & 8) == 8;
            }

            /* renamed from: N */
            public boolean m34215N() {
                return (this.f38558j & 2) == 2;
            }

            /* renamed from: O */
            public boolean m34216O() {
                return (this.f38558j & 1) == 1;
            }

            /* renamed from: P */
            public boolean m34217P() {
                return (this.f38558j & 4) == 4;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            /* renamed from: T, reason: merged with bridge method [inline-methods] */
            public b mo34079f() {
                return m34194R();
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            /* renamed from: U, reason: merged with bridge method [inline-methods] */
            public b mo34077d() {
                return m34195S(this);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            /* renamed from: e */
            public int mo34078e() {
                int i2 = this.f38568t;
                if (i2 != -1) {
                    return i2;
                }
                int iM38189o = (this.f38558j & 1) == 1 ? CodedOutputStream.m38189o(1, this.f38559k) + 0 : 0;
                if ((this.f38558j & 2) == 2) {
                    iM38189o += CodedOutputStream.m38189o(2, this.f38560l);
                }
                if ((this.f38558j & 8) == 8) {
                    iM38189o += CodedOutputStream.m38182h(3, this.f38562n.mo34235f());
                }
                int iM38190p = 0;
                for (int i3 = 0; i3 < this.f38563o.size(); i3++) {
                    iM38190p += CodedOutputStream.m38190p(this.f38563o.get(i3).intValue());
                }
                int iM38190p2 = iM38189o + iM38190p;
                if (!m34213L().isEmpty()) {
                    iM38190p2 = iM38190p2 + 1 + CodedOutputStream.m38190p(iM38190p);
                }
                this.f38564p = iM38190p;
                int iM38190p3 = 0;
                for (int i4 = 0; i4 < this.f38565q.size(); i4++) {
                    iM38190p3 += CodedOutputStream.m38190p(this.f38565q.get(i4).intValue());
                }
                int iM38178d = iM38190p2 + iM38190p3;
                if (!m34209H().isEmpty()) {
                    iM38178d = iM38178d + 1 + CodedOutputStream.m38190p(iM38190p3);
                }
                this.f38566r = iM38190p3;
                if ((this.f38558j & 4) == 4) {
                    iM38178d += CodedOutputStream.m38178d(6, m34211J());
                }
                int size = iM38178d + this.f38557i.size();
                this.f38568t = size;
                return size;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            /* renamed from: g */
            public InterfaceC10758q<c> mo34080g() {
                return f38556h;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
            /* renamed from: h */
            public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
                mo34078e();
                if ((this.f38558j & 1) == 1) {
                    codedOutputStream.m38217a0(1, this.f38559k);
                }
                if ((this.f38558j & 2) == 2) {
                    codedOutputStream.m38217a0(2, this.f38560l);
                }
                if ((this.f38558j & 8) == 8) {
                    codedOutputStream.m38209S(3, this.f38562n.mo34235f());
                }
                if (m34213L().size() > 0) {
                    codedOutputStream.m38231o0(34);
                    codedOutputStream.m38231o0(this.f38564p);
                }
                for (int i2 = 0; i2 < this.f38563o.size(); i2++) {
                    codedOutputStream.m38218b0(this.f38563o.get(i2).intValue());
                }
                if (m34209H().size() > 0) {
                    codedOutputStream.m38231o0(42);
                    codedOutputStream.m38231o0(this.f38566r);
                }
                for (int i3 = 0; i3 < this.f38565q.size(); i3++) {
                    codedOutputStream.m38218b0(this.f38565q.get(i3).intValue());
                }
                if ((this.f38558j & 4) == 4) {
                    codedOutputStream.m38205O(6, m34211J());
                }
                codedOutputStream.m38225i0(this.f38557i);
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
            public final boolean isInitialized() {
                byte b2 = this.f38567s;
                if (b2 == 1) {
                    return true;
                }
                if (b2 == 0) {
                    return false;
                }
                this.f38567s = (byte) 1;
                return true;
            }

            private c(AbstractC10749h.b bVar) {
                super(bVar);
                this.f38564p = -1;
                this.f38566r = -1;
                this.f38567s = (byte) -1;
                this.f38568t = -1;
                this.f38557i = bVar.m38391l();
            }

            private c(boolean z) {
                this.f38564p = -1;
                this.f38566r = -1;
                this.f38567s = (byte) -1;
                this.f38568t = -1;
                this.f38557i = AbstractC10745d.f41263f;
            }

            private c(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                this.f38564p = -1;
                this.f38566r = -1;
                this.f38567s = (byte) -1;
                this.f38568t = -1;
                m34193Q();
                AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
                CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
                boolean z = false;
                int i2 = 0;
                while (!z) {
                    try {
                        try {
                            int iM38320K = c10746e.m38320K();
                            if (iM38320K != 0) {
                                if (iM38320K == 8) {
                                    this.f38558j |= 1;
                                    this.f38559k = c10746e.m38339s();
                                } else if (iM38320K == 16) {
                                    this.f38558j |= 2;
                                    this.f38560l = c10746e.m38339s();
                                } else if (iM38320K == 24) {
                                    int iM38334n = c10746e.m38334n();
                                    EnumC11553c enumC11553cM34234g = EnumC11553c.m34234g(iM38334n);
                                    if (enumC11553cM34234g == null) {
                                        codedOutputStreamM38173J.m38231o0(iM38320K);
                                        codedOutputStreamM38173J.m38231o0(iM38334n);
                                    } else {
                                        this.f38558j |= 8;
                                        this.f38562n = enumC11553cM34234g;
                                    }
                                } else if (iM38320K == 32) {
                                    if ((i2 & 16) != 16) {
                                        this.f38563o = new ArrayList();
                                        i2 |= 16;
                                    }
                                    this.f38563o.add(Integer.valueOf(c10746e.m38339s()));
                                } else if (iM38320K == 34) {
                                    int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & 16) != 16 && c10746e.m38327e() > 0) {
                                        this.f38563o = new ArrayList();
                                        i2 |= 16;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38563o.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j);
                                } else if (iM38320K == 40) {
                                    if ((i2 & 32) != 32) {
                                        this.f38565q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    this.f38565q.add(Integer.valueOf(c10746e.m38339s()));
                                } else if (iM38320K == 42) {
                                    int iM38330j2 = c10746e.m38330j(c10746e.m38311A());
                                    if ((i2 & 32) != 32 && c10746e.m38327e() > 0) {
                                        this.f38565q = new ArrayList();
                                        i2 |= 32;
                                    }
                                    while (c10746e.m38327e() > 0) {
                                        this.f38565q.add(Integer.valueOf(c10746e.m38339s()));
                                    }
                                    c10746e.m38329i(iM38330j2);
                                } else if (iM38320K != 50) {
                                    if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                    }
                                } else {
                                    AbstractC10745d abstractC10745dM38332l = c10746e.m38332l();
                                    this.f38558j |= 4;
                                    this.f38561m = abstractC10745dM38332l;
                                }
                            }
                            z = true;
                        } catch (InvalidProtocolBufferException e2) {
                            throw e2.m38253i(this);
                        } catch (IOException e3) {
                            throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                        }
                    } catch (Throwable th) {
                        if ((i2 & 16) == 16) {
                            this.f38563o = Collections.unmodifiableList(this.f38563o);
                        }
                        if ((i2 & 32) == 32) {
                            this.f38565q = Collections.unmodifiableList(this.f38565q);
                        }
                        try {
                            codedOutputStreamM38173J.m38201I();
                        } catch (IOException unused) {
                        } catch (Throwable th2) {
                            this.f38557i = bVarM38280w.m38299e();
                            throw th2;
                        }
                        this.f38557i = bVarM38280w.m38299e();
                        mo38389m();
                        throw th;
                    }
                }
                if ((i2 & 16) == 16) {
                    this.f38563o = Collections.unmodifiableList(this.f38563o);
                }
                if ((i2 & 32) == 32) {
                    this.f38565q = Collections.unmodifiableList(this.f38565q);
                }
                try {
                    codedOutputStreamM38173J.m38201I();
                } catch (IOException unused2) {
                } catch (Throwable th3) {
                    this.f38557i = bVarM38280w.m38299e();
                    throw th3;
                }
                this.f38557i = bVarM38280w.m38299e();
                mo38389m();
            }
        }

        private e(AbstractC10749h.b bVar) {
            super(bVar);
            this.f38549l = -1;
            this.f38550m = (byte) -1;
            this.f38551n = -1;
            this.f38546i = bVar.m38391l();
        }

        private e(boolean z) {
            this.f38549l = -1;
            this.f38550m = (byte) -1;
            this.f38551n = -1;
            this.f38546i = AbstractC10745d.f41263f;
        }

        /* JADX WARN: Multi-variable type inference failed */
        private e(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f38549l = -1;
            this.f38550m = (byte) -1;
            this.f38551n = -1;
            m34174z();
            AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
            CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
            boolean z = false;
            int i2 = 0;
            while (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 10) {
                                if ((i2 & 1) != 1) {
                                    this.f38547j = new ArrayList();
                                    i2 |= 1;
                                }
                                this.f38547j.add(c10746e.m38341u(c.f38556h, c10747f));
                            } else if (iM38320K == 40) {
                                if ((i2 & 2) != 2) {
                                    this.f38548k = new ArrayList();
                                    i2 |= 2;
                                }
                                this.f38548k.add(Integer.valueOf(c10746e.m38339s()));
                            } else if (iM38320K != 42) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                int iM38330j = c10746e.m38330j(c10746e.m38311A());
                                if ((i2 & 2) != 2 && c10746e.m38327e() > 0) {
                                    this.f38548k = new ArrayList();
                                    i2 |= 2;
                                }
                                while (c10746e.m38327e() > 0) {
                                    this.f38548k.add(Integer.valueOf(c10746e.m38339s()));
                                }
                                c10746e.m38329i(iM38330j);
                            }
                        }
                        z = true;
                    } catch (InvalidProtocolBufferException e2) {
                        throw e2.m38253i(this);
                    } catch (IOException e3) {
                        throw new InvalidProtocolBufferException(e3.getMessage()).m38253i(this);
                    }
                } catch (Throwable th) {
                    if ((i2 & 1) == 1) {
                        this.f38547j = Collections.unmodifiableList(this.f38547j);
                    }
                    if ((i2 & 2) == 2) {
                        this.f38548k = Collections.unmodifiableList(this.f38548k);
                    }
                    try {
                        codedOutputStreamM38173J.m38201I();
                    } catch (IOException unused) {
                    } catch (Throwable th2) {
                        this.f38546i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38546i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            if ((i2 & 1) == 1) {
                this.f38547j = Collections.unmodifiableList(this.f38547j);
            }
            if ((i2 & 2) == 2) {
                this.f38548k = Collections.unmodifiableList(this.f38548k);
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38546i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f38546i = bVarM38280w.m38299e();
            mo38389m();
        }
    }

    static {
        C10125d c10125dM34532H = C10125d.m34532H();
        c cVarM34110v = c.m34110v();
        c cVarM34110v2 = c.m34110v();
        C10764w.b bVar = C10764w.b.f41386p;
        f38491a = AbstractC10749h.m38387o(c10125dM34532H, cVarM34110v, cVarM34110v2, null, 100, bVar, c.class);
        f38492b = AbstractC10749h.m38387o(C10130i.m34712b0(), c.m34110v(), c.m34110v(), null, 100, bVar, c.class);
        C10130i c10130iM34712b0 = C10130i.m34712b0();
        C10764w.b bVar2 = C10764w.b.f41380j;
        f38493c = AbstractC10749h.m38387o(c10130iM34712b0, 0, null, null, 101, bVar2, Integer.class);
        f38494d = AbstractC10749h.m38387o(C10135n.m34876Z(), d.m34138y(), d.m34138y(), null, 100, bVar, d.class);
        f38495e = AbstractC10749h.m38387o(C10135n.m34876Z(), 0, null, null, 101, bVar2, Integer.class);
        f38496f = AbstractC10749h.m38386n(C10138q.m35022Y(), C10123b.m34278z(), null, 100, bVar, false, C10123b.class);
        f38497g = AbstractC10749h.m38387o(C10138q.m35022Y(), Boolean.FALSE, null, null, 101, C10764w.b.f41383m, Boolean.class);
        f38498h = AbstractC10749h.m38386n(C10140s.m35181K(), C10123b.m34278z(), null, 100, bVar, false, C10123b.class);
        f38499i = AbstractC10749h.m38387o(C10124c.m34433z0(), 0, null, null, 101, bVar2, Integer.class);
        f38500j = AbstractC10749h.m38386n(C10124c.m34433z0(), C10135n.m34876Z(), null, 102, bVar, false, C10135n.class);
        f38501k = AbstractC10749h.m38387o(C10124c.m34433z0(), 0, null, null, 103, bVar2, Integer.class);
        f38502l = AbstractC10749h.m38387o(C10124c.m34433z0(), 0, null, null, 104, bVar2, Integer.class);
        f38503m = AbstractC10749h.m38387o(C10133l.m34782K(), 0, null, null, 101, bVar2, Integer.class);
        f38504n = AbstractC10749h.m38386n(C10133l.m34782K(), C10135n.m34876Z(), null, 102, bVar, false, C10135n.class);
    }

    /* renamed from: a */
    public static void m34066a(C10747f c10747f) {
        c10747f.m38349a(f38491a);
        c10747f.m38349a(f38492b);
        c10747f.m38349a(f38493c);
        c10747f.m38349a(f38494d);
        c10747f.m38349a(f38495e);
        c10747f.m38349a(f38496f);
        c10747f.m38349a(f38497g);
        c10747f.m38349a(f38498h);
        c10747f.m38349a(f38499i);
        c10747f.m38349a(f38500j);
        c10747f.m38349a(f38501k);
        c10747f.m38349a(f38502l);
        c10747f.m38349a(f38503m);
        c10747f.m38349a(f38504n);
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.a$b */
    public static final class b extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final b f38505g;

        /* renamed from: h */
        public static InterfaceC10758q<b> f38506h = new a();

        /* renamed from: i */
        private final AbstractC10745d f38507i;

        /* renamed from: j */
        private int f38508j;

        /* renamed from: k */
        private int f38509k;

        /* renamed from: l */
        private int f38510l;

        /* renamed from: m */
        private byte f38511m;

        /* renamed from: n */
        private int f38512n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$b$a */
        static class a extends AbstractC10743b<b> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public b mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new b(c10746e, c10747f);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$b$b, reason: collision with other inner class name */
        public static final class C11552b extends AbstractC10749h.b<b, C11552b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f38513g;

            /* renamed from: h */
            private int f38514h;

            /* renamed from: i */
            private int f38515i;

            private C11552b() {
                m34090t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static C11552b m34089s() {
                return new C11552b();
            }

            /* renamed from: t */
            private void m34090t() {
            }

            /* renamed from: A */
            public C11552b m34091A(int i2) {
                this.f38513g |= 1;
                this.f38514h = i2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public b mo34093c() {
                b bVarM34098q = m34098q();
                if (bVarM34098q.isInitialized()) {
                    return bVarM34098q;
                }
                throw AbstractC10742a.a.m38257j(bVarM34098q);
            }

            /* renamed from: q */
            public b m34098q() {
                b bVar = new b(this);
                int i2 = this.f38513g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                bVar.f38509k = this.f38514h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                bVar.f38510l = this.f38515i;
                bVar.f38508j = i3;
                return bVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public C11552b mo34095k() {
                return m34089s().mo34096m(m34098q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public C11552b mo34096m(b bVar) {
                if (bVar == b.m34074v()) {
                    return this;
                }
                if (bVar.m34085z()) {
                    m34091A(bVar.m34083x());
                }
                if (bVar.m34084y()) {
                    m34102w(bVar.m34082w());
                }
                m38392n(m38391l().m38286f(bVar.f38507i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.b.C11552b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.a0.a$b> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.b.f38506h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.a0.a$b r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.b) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.a0.a$b r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.b) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.b.C11552b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.a0.a$b$b");
            }

            /* renamed from: w */
            public C11552b m34102w(int i2) {
                this.f38513g |= 2;
                this.f38515i = i2;
                return this;
            }
        }

        static {
            b bVar = new b(true);
            f38505g = bVar;
            bVar.m34067A();
        }

        /* renamed from: A */
        private void m34067A() {
            this.f38509k = 0;
            this.f38510l = 0;
        }

        /* renamed from: B */
        public static C11552b m34068B() {
            return C11552b.m34089s();
        }

        /* renamed from: C */
        public static C11552b m34069C(b bVar) {
            return m34068B().mo34096m(bVar);
        }

        /* renamed from: v */
        public static b m34074v() {
            return f38505g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public C11552b mo34079f() {
            return m34068B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public C11552b mo34077d() {
            return m34069C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38512n;
            if (i2 != -1) {
                return i2;
            }
            int iM38189o = (this.f38508j & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f38509k) : 0;
            if ((this.f38508j & 2) == 2) {
                iM38189o += CodedOutputStream.m38189o(2, this.f38510l);
            }
            int size = iM38189o + this.f38507i.size();
            this.f38512n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<b> mo34080g() {
            return f38506h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f38508j & 1) == 1) {
                codedOutputStream.m38217a0(1, this.f38509k);
            }
            if ((this.f38508j & 2) == 2) {
                codedOutputStream.m38217a0(2, this.f38510l);
            }
            codedOutputStream.m38225i0(this.f38507i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f38511m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f38511m = (byte) 1;
            return true;
        }

        /* renamed from: w */
        public int m34082w() {
            return this.f38510l;
        }

        /* renamed from: x */
        public int m34083x() {
            return this.f38509k;
        }

        /* renamed from: y */
        public boolean m34084y() {
            return (this.f38508j & 2) == 2;
        }

        /* renamed from: z */
        public boolean m34085z() {
            return (this.f38508j & 1) == 1;
        }

        private b(AbstractC10749h.b bVar) {
            super(bVar);
            this.f38511m = (byte) -1;
            this.f38512n = -1;
            this.f38507i = bVar.m38391l();
        }

        private b(boolean z) {
            this.f38511m = (byte) -1;
            this.f38512n = -1;
            this.f38507i = AbstractC10745d.f41263f;
        }

        private b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f38511m = (byte) -1;
            this.f38512n = -1;
            m34067A();
            AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
            CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 8) {
                                this.f38508j |= 1;
                                this.f38509k = c10746e.m38339s();
                            } else if (iM38320K != 16) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                this.f38508j |= 2;
                                this.f38510l = c10746e.m38339s();
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
                        this.f38507i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38507i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38507i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f38507i = bVarM38280w.m38299e();
            mo38389m();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.a$c */
    public static final class c extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final c f38516g;

        /* renamed from: h */
        public static InterfaceC10758q<c> f38517h = new a();

        /* renamed from: i */
        private final AbstractC10745d f38518i;

        /* renamed from: j */
        private int f38519j;

        /* renamed from: k */
        private int f38520k;

        /* renamed from: l */
        private int f38521l;

        /* renamed from: m */
        private byte f38522m;

        /* renamed from: n */
        private int f38523n;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$c$a */
        static class a extends AbstractC10743b<c> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public c mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new c(c10746e, c10747f);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$c$b */
        public static final class b extends AbstractC10749h.b<c, b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f38524g;

            /* renamed from: h */
            private int f38525h;

            /* renamed from: i */
            private int f38526i;

            private b() {
                m34120t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static b m34119s() {
                return new b();
            }

            /* renamed from: t */
            private void m34120t() {
            }

            /* renamed from: A */
            public b m34121A(int i2) {
                this.f38524g |= 1;
                this.f38525h = i2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public c mo34093c() {
                c cVarM34123q = m34123q();
                if (cVarM34123q.isInitialized()) {
                    return cVarM34123q;
                }
                throw AbstractC10742a.a.m38257j(cVarM34123q);
            }

            /* renamed from: q */
            public c m34123q() {
                c cVar = new c(this);
                int i2 = this.f38524g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                cVar.f38520k = this.f38525h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                cVar.f38521l = this.f38526i;
                cVar.f38519j = i3;
                return cVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo34095k() {
                return m34119s().mo34096m(m34123q());
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: u, reason: merged with bridge method [inline-methods] */
            public b mo34096m(c cVar) {
                if (cVar == c.m34110v()) {
                    return this;
                }
                if (cVar.m34116z()) {
                    m34121A(cVar.m34114x());
                }
                if (cVar.m34115y()) {
                    m34127w(cVar.m34113w());
                }
                m38392n(m38391l().m38286f(cVar.f38518i));
                return this;
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: v, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.c.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.a0.a$c> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.c.f38517h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.a0.a$c r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.c) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.a0.a$c r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.c) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.c.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.a0.a$c$b");
            }

            /* renamed from: w */
            public b m34127w(int i2) {
                this.f38524g |= 2;
                this.f38526i = i2;
                return this;
            }
        }

        static {
            c cVar = new c(true);
            f38516g = cVar;
            cVar.m34103A();
        }

        /* renamed from: A */
        private void m34103A() {
            this.f38520k = 0;
            this.f38521l = 0;
        }

        /* renamed from: B */
        public static b m34104B() {
            return b.m34119s();
        }

        /* renamed from: C */
        public static b m34105C(c cVar) {
            return m34104B().mo34096m(cVar);
        }

        /* renamed from: v */
        public static c m34110v() {
            return f38516g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public b mo34079f() {
            return m34104B();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public b mo34077d() {
            return m34105C(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38523n;
            if (i2 != -1) {
                return i2;
            }
            int iM38189o = (this.f38519j & 1) == 1 ? 0 + CodedOutputStream.m38189o(1, this.f38520k) : 0;
            if ((this.f38519j & 2) == 2) {
                iM38189o += CodedOutputStream.m38189o(2, this.f38521l);
            }
            int size = iM38189o + this.f38518i.size();
            this.f38523n = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<c> mo34080g() {
            return f38517h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f38519j & 1) == 1) {
                codedOutputStream.m38217a0(1, this.f38520k);
            }
            if ((this.f38519j & 2) == 2) {
                codedOutputStream.m38217a0(2, this.f38521l);
            }
            codedOutputStream.m38225i0(this.f38518i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f38522m;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f38522m = (byte) 1;
            return true;
        }

        /* renamed from: w */
        public int m34113w() {
            return this.f38521l;
        }

        /* renamed from: x */
        public int m34114x() {
            return this.f38520k;
        }

        /* renamed from: y */
        public boolean m34115y() {
            return (this.f38519j & 2) == 2;
        }

        /* renamed from: z */
        public boolean m34116z() {
            return (this.f38519j & 1) == 1;
        }

        private c(AbstractC10749h.b bVar) {
            super(bVar);
            this.f38522m = (byte) -1;
            this.f38523n = -1;
            this.f38518i = bVar.m38391l();
        }

        private c(boolean z) {
            this.f38522m = (byte) -1;
            this.f38523n = -1;
            this.f38518i = AbstractC10745d.f41263f;
        }

        private c(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f38522m = (byte) -1;
            this.f38523n = -1;
            m34103A();
            AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
            CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 8) {
                                this.f38519j |= 1;
                                this.f38520k = c10746e.m38339s();
                            } else if (iM38320K != 16) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                this.f38519j |= 2;
                                this.f38521l = c10746e.m38339s();
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
                        this.f38518i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38518i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38518i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f38518i = bVarM38280w.m38299e();
            mo38389m();
        }
    }

    /* compiled from: JvmProtoBuf.java */
    /* renamed from: kotlin.f0.y.e.j0.e.a0.a$d */
    public static final class d extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private static final d f38527g;

        /* renamed from: h */
        public static InterfaceC10758q<d> f38528h = new a();

        /* renamed from: i */
        private final AbstractC10745d f38529i;

        /* renamed from: j */
        private int f38530j;

        /* renamed from: k */
        private b f38531k;

        /* renamed from: l */
        private c f38532l;

        /* renamed from: m */
        private c f38533m;

        /* renamed from: n */
        private c f38534n;

        /* renamed from: o */
        private c f38535o;

        /* renamed from: p */
        private byte f38536p;

        /* renamed from: q */
        private int f38537q;

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$d$a */
        static class a extends AbstractC10743b<d> {
            a() {
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10758q
            /* renamed from: m, reason: merged with bridge method [inline-methods] */
            public d mo34086b(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
                return new d(c10746e, c10747f);
            }
        }

        /* compiled from: JvmProtoBuf.java */
        /* renamed from: kotlin.f0.y.e.j0.e.a0.a$d$b */
        public static final class b extends AbstractC10749h.b<d, b> implements InterfaceC10757p {

            /* renamed from: g */
            private int f38538g;

            /* renamed from: h */
            private b f38539h = b.m34074v();

            /* renamed from: i */
            private c f38540i = c.m34110v();

            /* renamed from: j */
            private c f38541j = c.m34110v();

            /* renamed from: k */
            private c f38542k = c.m34110v();

            /* renamed from: l */
            private c f38543l = c.m34110v();

            private b() {
                m34154t();
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* renamed from: s */
            public static b m34153s() {
                return new b();
            }

            /* renamed from: t */
            private void m34154t() {
            }

            /* JADX WARN: Removed duplicated region for block: B:15:0x001d  */
            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a.a
            /* renamed from: A, reason: merged with bridge method [inline-methods] */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.d.b mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.C10746e r3, kotlin.reflect.jvm.internal.impl.protobuf.C10747f r4) throws java.lang.Throwable {
                /*
                    r2 = this;
                    r0 = 0
                    kotlin.reflect.jvm.internal.impl.protobuf.q<kotlin.f0.y.e.j0.e.a0.a$d> r1 = kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.d.f38528h     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    java.lang.Object r3 = r1.mo34086b(r3, r4)     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
                    kotlin.f0.y.e.j0.e.a0.a$d r3 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.d) r3     // Catch: java.lang.Throwable -> Lf kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException -> L11
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
                    kotlin.f0.y.e.j0.e.a0.a$d r4 = (kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.d) r4     // Catch: java.lang.Throwable -> Lf
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
                throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.p371y.internal.p374j0.p392e.p393a0.C10112a.d.b.mo34094i(kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.f):kotlin.f0.y.e.j0.e.a0.a$d$b");
            }

            /* renamed from: B */
            public b m34156B(c cVar) {
                if ((this.f38538g & 4) != 4 || this.f38541j == c.m34110v()) {
                    this.f38541j = cVar;
                } else {
                    this.f38541j = c.m34105C(this.f38541j).mo34096m(cVar).m34123q();
                }
                this.f38538g |= 4;
                return this;
            }

            /* renamed from: C */
            public b m34157C(c cVar) {
                if ((this.f38538g & 8) != 8 || this.f38542k == c.m34110v()) {
                    this.f38542k = cVar;
                } else {
                    this.f38542k = c.m34105C(this.f38542k).mo34096m(cVar).m34123q();
                }
                this.f38538g |= 8;
                return this;
            }

            /* renamed from: D */
            public b m34158D(c cVar) {
                if ((this.f38538g & 2) != 2 || this.f38540i == c.m34110v()) {
                    this.f38540i = cVar;
                } else {
                    this.f38540i = c.m34105C(this.f38540i).mo34096m(cVar).m34123q();
                }
                this.f38538g |= 2;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o.a
            /* renamed from: p, reason: merged with bridge method [inline-methods] */
            public d mo34093c() {
                d dVarM34160q = m34160q();
                if (dVarM34160q.isInitialized()) {
                    return dVarM34160q;
                }
                throw AbstractC10742a.a.m38257j(dVarM34160q);
            }

            /* renamed from: q */
            public d m34160q() {
                d dVar = new d(this);
                int i2 = this.f38538g;
                int i3 = (i2 & 1) != 1 ? 0 : 1;
                dVar.f38531k = this.f38539h;
                if ((i2 & 2) == 2) {
                    i3 |= 2;
                }
                dVar.f38532l = this.f38540i;
                if ((i2 & 4) == 4) {
                    i3 |= 4;
                }
                dVar.f38533m = this.f38541j;
                if ((i2 & 8) == 8) {
                    i3 |= 8;
                }
                dVar.f38534n = this.f38542k;
                if ((i2 & 16) == 16) {
                    i3 |= 16;
                }
                dVar.f38535o = this.f38543l;
                dVar.f38530j = i3;
                return dVar;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: r, reason: merged with bridge method [inline-methods] */
            public b mo34095k() {
                return m34153s().mo34096m(m34160q());
            }

            /* renamed from: u */
            public b m34162u(c cVar) {
                if ((this.f38538g & 16) != 16 || this.f38543l == c.m34110v()) {
                    this.f38543l = cVar;
                } else {
                    this.f38543l = c.m34105C(this.f38543l).mo34096m(cVar).m34123q();
                }
                this.f38538g |= 16;
                return this;
            }

            /* renamed from: v */
            public b m34163v(b bVar) {
                if ((this.f38538g & 1) != 1 || this.f38539h == b.m34074v()) {
                    this.f38539h = bVar;
                } else {
                    this.f38539h = b.m34069C(this.f38539h).mo34096m(bVar).m34098q();
                }
                this.f38538g |= 1;
                return this;
            }

            @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h.b
            /* renamed from: w, reason: merged with bridge method [inline-methods] */
            public b mo34096m(d dVar) {
                if (dVar == d.m34138y()) {
                    return this;
                }
                if (dVar.m34144F()) {
                    m34163v(dVar.m34139A());
                }
                if (dVar.m34147I()) {
                    m34158D(dVar.m34142D());
                }
                if (dVar.m34145G()) {
                    m34156B(dVar.m34140B());
                }
                if (dVar.m34146H()) {
                    m34157C(dVar.m34141C());
                }
                if (dVar.m34143E()) {
                    m34162u(dVar.m34150z());
                }
                m38392n(m38391l().m38286f(dVar.f38529i));
                return this;
            }
        }

        static {
            d dVar = new d(true);
            f38527g = dVar;
            dVar.m34128J();
        }

        /* renamed from: J */
        private void m34128J() {
            this.f38531k = b.m34074v();
            this.f38532l = c.m34110v();
            this.f38533m = c.m34110v();
            this.f38534n = c.m34110v();
            this.f38535o = c.m34110v();
        }

        /* renamed from: K */
        public static b m34129K() {
            return b.m34153s();
        }

        /* renamed from: L */
        public static b m34130L(d dVar) {
            return m34129K().mo34096m(dVar);
        }

        /* renamed from: y */
        public static d m34138y() {
            return f38527g;
        }

        /* renamed from: A */
        public b m34139A() {
            return this.f38531k;
        }

        /* renamed from: B */
        public c m34140B() {
            return this.f38533m;
        }

        /* renamed from: C */
        public c m34141C() {
            return this.f38534n;
        }

        /* renamed from: D */
        public c m34142D() {
            return this.f38532l;
        }

        /* renamed from: E */
        public boolean m34143E() {
            return (this.f38530j & 16) == 16;
        }

        /* renamed from: F */
        public boolean m34144F() {
            return (this.f38530j & 1) == 1;
        }

        /* renamed from: G */
        public boolean m34145G() {
            return (this.f38530j & 4) == 4;
        }

        /* renamed from: H */
        public boolean m34146H() {
            return (this.f38530j & 8) == 8;
        }

        /* renamed from: I */
        public boolean m34147I() {
            return (this.f38530j & 2) == 2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public b mo34079f() {
            return m34129K();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public b mo34077d() {
            return m34130L(this);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: e */
        public int mo34078e() {
            int i2 = this.f38537q;
            if (i2 != -1) {
                return i2;
            }
            int iM38193s = (this.f38530j & 1) == 1 ? 0 + CodedOutputStream.m38193s(1, this.f38531k) : 0;
            if ((this.f38530j & 2) == 2) {
                iM38193s += CodedOutputStream.m38193s(2, this.f38532l);
            }
            if ((this.f38530j & 4) == 4) {
                iM38193s += CodedOutputStream.m38193s(3, this.f38533m);
            }
            if ((this.f38530j & 8) == 8) {
                iM38193s += CodedOutputStream.m38193s(4, this.f38534n);
            }
            if ((this.f38530j & 16) == 16) {
                iM38193s += CodedOutputStream.m38193s(5, this.f38535o);
            }
            int size = iM38193s + this.f38529i.size();
            this.f38537q = size;
            return size;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h, kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: g */
        public InterfaceC10758q<d> mo34080g() {
            return f38528h;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
        /* renamed from: h */
        public void mo34081h(CodedOutputStream codedOutputStream) throws IOException {
            mo34078e();
            if ((this.f38530j & 1) == 1) {
                codedOutputStream.m38220d0(1, this.f38531k);
            }
            if ((this.f38530j & 2) == 2) {
                codedOutputStream.m38220d0(2, this.f38532l);
            }
            if ((this.f38530j & 4) == 4) {
                codedOutputStream.m38220d0(3, this.f38533m);
            }
            if ((this.f38530j & 8) == 8) {
                codedOutputStream.m38220d0(4, this.f38534n);
            }
            if ((this.f38530j & 16) == 16) {
                codedOutputStream.m38220d0(5, this.f38535o);
            }
            codedOutputStream.m38225i0(this.f38529i);
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10757p
        public final boolean isInitialized() {
            byte b2 = this.f38536p;
            if (b2 == 1) {
                return true;
            }
            if (b2 == 0) {
                return false;
            }
            this.f38536p = (byte) 1;
            return true;
        }

        /* renamed from: z */
        public c m34150z() {
            return this.f38535o;
        }

        private d(AbstractC10749h.b bVar) {
            super(bVar);
            this.f38536p = (byte) -1;
            this.f38537q = -1;
            this.f38529i = bVar.m38391l();
        }

        private d(boolean z) {
            this.f38536p = (byte) -1;
            this.f38537q = -1;
            this.f38529i = AbstractC10745d.f41263f;
        }

        private d(C10746e c10746e, C10747f c10747f) throws InvalidProtocolBufferException {
            this.f38536p = (byte) -1;
            this.f38537q = -1;
            m34128J();
            AbstractC10745d.b bVarM38280w = AbstractC10745d.m38280w();
            CodedOutputStream codedOutputStreamM38173J = CodedOutputStream.m38173J(bVarM38280w, 1);
            boolean z = false;
            while (!z) {
                try {
                    try {
                        int iM38320K = c10746e.m38320K();
                        if (iM38320K != 0) {
                            if (iM38320K == 10) {
                                b.C11552b c11552bMo34077d = (this.f38530j & 1) == 1 ? this.f38531k.mo34077d() : null;
                                b bVar = (b) c10746e.m38341u(b.f38506h, c10747f);
                                this.f38531k = bVar;
                                if (c11552bMo34077d != null) {
                                    c11552bMo34077d.mo34096m(bVar);
                                    this.f38531k = c11552bMo34077d.m34098q();
                                }
                                this.f38530j |= 1;
                            } else if (iM38320K == 18) {
                                c.b bVarMo34077d = (this.f38530j & 2) == 2 ? this.f38532l.mo34077d() : null;
                                c cVar = (c) c10746e.m38341u(c.f38517h, c10747f);
                                this.f38532l = cVar;
                                if (bVarMo34077d != null) {
                                    bVarMo34077d.mo34096m(cVar);
                                    this.f38532l = bVarMo34077d.m34123q();
                                }
                                this.f38530j |= 2;
                            } else if (iM38320K == 26) {
                                c.b bVarMo34077d2 = (this.f38530j & 4) == 4 ? this.f38533m.mo34077d() : null;
                                c cVar2 = (c) c10746e.m38341u(c.f38517h, c10747f);
                                this.f38533m = cVar2;
                                if (bVarMo34077d2 != null) {
                                    bVarMo34077d2.mo34096m(cVar2);
                                    this.f38533m = bVarMo34077d2.m34123q();
                                }
                                this.f38530j |= 4;
                            } else if (iM38320K == 34) {
                                c.b bVarMo34077d3 = (this.f38530j & 8) == 8 ? this.f38534n.mo34077d() : null;
                                c cVar3 = (c) c10746e.m38341u(c.f38517h, c10747f);
                                this.f38534n = cVar3;
                                if (bVarMo34077d3 != null) {
                                    bVarMo34077d3.mo34096m(cVar3);
                                    this.f38534n = bVarMo34077d3.m34123q();
                                }
                                this.f38530j |= 8;
                            } else if (iM38320K != 42) {
                                if (!mo38390p(c10746e, codedOutputStreamM38173J, c10747f, iM38320K)) {
                                }
                            } else {
                                c.b bVarMo34077d4 = (this.f38530j & 16) == 16 ? this.f38535o.mo34077d() : null;
                                c cVar4 = (c) c10746e.m38341u(c.f38517h, c10747f);
                                this.f38535o = cVar4;
                                if (bVarMo34077d4 != null) {
                                    bVarMo34077d4.mo34096m(cVar4);
                                    this.f38535o = bVarMo34077d4.m34123q();
                                }
                                this.f38530j |= 16;
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
                        this.f38529i = bVarM38280w.m38299e();
                        throw th2;
                    }
                    this.f38529i = bVarM38280w.m38299e();
                    mo38389m();
                    throw th;
                }
            }
            try {
                codedOutputStreamM38173J.m38201I();
            } catch (IOException unused2) {
            } catch (Throwable th3) {
                this.f38529i = bVarM38280w.m38299e();
                throw th3;
            }
            this.f38529i = bVarM38280w.m38299e();
            mo38389m();
        }
    }
}
