package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.a;
import kotlin.reflect.jvm.internal.impl.protobuf.g;
import kotlin.reflect.jvm.internal.impl.protobuf.i;
import kotlin.reflect.jvm.internal.impl.protobuf.o;
import kotlin.reflect.jvm.internal.impl.protobuf.w;

/* compiled from: GeneratedMessageLite.java */
/* loaded from: classes3.dex */
public abstract class h extends kotlin.reflect.jvm.internal.impl.protobuf.a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f44056a;

        static {
            int[] iArr = new int[w.c.values().length];
            f44056a = iArr;
            try {
                iArr[w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f44056a[w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class b<MessageType extends h, BuilderType extends b> extends a.AbstractC0582a<BuilderType> {

        /* renamed from: B, reason: collision with root package name */
        private kotlin.reflect.jvm.internal.impl.protobuf.d f44057B = kotlin.reflect.jvm.internal.impl.protobuf.d.f44026B;

        protected b() {
        }

        @Override // 
        public BuilderType m() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        public final kotlin.reflect.jvm.internal.impl.protobuf.d n() {
            return this.f44057B;
        }

        public abstract BuilderType o(MessageType messagetype);

        public final BuilderType p(kotlin.reflect.jvm.internal.impl.protobuf.d dVar) {
            this.f44057B = dVar;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements p {

        /* renamed from: C, reason: collision with root package name */
        private g<e> f44058C = g.g();

        /* renamed from: D, reason: collision with root package name */
        private boolean f44059D;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public g<e> r() {
            this.f44058C.q();
            this.f44059D = false;
            return this.f44058C;
        }

        private void s() {
            if (this.f44059D) {
                return;
            }
            this.f44058C = this.f44058C.clone();
            this.f44059D = true;
        }

        protected final void t(MessageType messagetype) {
            s();
            this.f44058C.r(((d) messagetype).f44060C);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    static final class e implements g.b<e> {

        /* renamed from: B, reason: collision with root package name */
        final i.b<?> f44065B;

        /* renamed from: C, reason: collision with root package name */
        final int f44066C;

        /* renamed from: D, reason: collision with root package name */
        final w.b f44067D;

        /* renamed from: E, reason: collision with root package name */
        final boolean f44068E;

        /* renamed from: F, reason: collision with root package name */
        final boolean f44069F;

        e(i.b<?> bVar, int i10, w.b bVar2, boolean z10, boolean z11) {
            this.f44065B = bVar;
            this.f44066C = i10;
            this.f44067D = bVar2;
            this.f44068E = z10;
            this.f44069F = z11;
        }

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f44066C - eVar.f44066C;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public int e() {
            return this.f44066C;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.b g() {
            return this.f44067D;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public w.c i() {
            return this.f44067D.c();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isPacked() {
            return this.f44069F;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public boolean isRepeated() {
            return this.f44068E;
        }

        public i.b<?> j() {
            return this.f44065B;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.g.b
        public o.a k(o.a aVar, o oVar) {
            return ((b) aVar).o((h) oVar);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    public static class f<ContainingType extends o, Type> {

        /* renamed from: a, reason: collision with root package name */
        final ContainingType f44070a;

        /* renamed from: b, reason: collision with root package name */
        final Type f44071b;

        /* renamed from: c, reason: collision with root package name */
        final o f44072c;

        /* renamed from: d, reason: collision with root package name */
        final e f44073d;

        /* renamed from: e, reason: collision with root package name */
        final Class f44074e;

        /* renamed from: f, reason: collision with root package name */
        final Method f44075f;

        f(ContainingType containingtype, Type type, o oVar, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.g() == w.b.f44148N && oVar == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f44070a = containingtype;
            this.f44071b = type;
            this.f44072c = oVar;
            this.f44073d = eVar;
            this.f44074e = cls;
            if (i.a.class.isAssignableFrom(cls)) {
                this.f44075f = h.l(cls, "valueOf", Integer.TYPE);
            } else {
                this.f44075f = null;
            }
        }

        Object a(Object obj) {
            if (!this.f44073d.isRepeated()) {
                return e(obj);
            }
            if (this.f44073d.i() != w.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(e(it.next()));
            }
            return arrayList;
        }

        public ContainingType b() {
            return this.f44070a;
        }

        public o c() {
            return this.f44072c;
        }

        public int d() {
            return this.f44073d.e();
        }

        Object e(Object obj) {
            return this.f44073d.i() == w.c.ENUM ? h.m(this.f44075f, null, (Integer) obj) : obj;
        }

        Object f(Object obj) {
            return this.f44073d.i() == w.c.ENUM ? Integer.valueOf(((i.a) obj).e()) : obj;
        }
    }

    protected h() {
    }

    static Method l(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e10) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb2 = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb2.append("Generated message class \"");
            sb2.append(name);
            sb2.append("\" missing method \"");
            sb2.append(strValueOf);
            sb2.append("\".");
            throw new RuntimeException(sb2.toString(), e10);
        }
    }

    static Object m(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e10) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e10);
        } catch (InvocationTargetException e11) {
            Throwable cause = e11.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static <ContainingType extends o, Type> f<ContainingType, Type> o(ContainingType containingtype, o oVar, i.b<?> bVar, int i10, w.b bVar2, boolean z10, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), oVar, new e(bVar, i10, bVar2, true, z10), cls);
    }

    public static <ContainingType extends o, Type> f<ContainingType, Type> p(ContainingType containingtype, Type type, o oVar, i.b<?> bVar, int i10, w.b bVar2, Class cls) {
        return new f<>(containingtype, type, oVar, new e(bVar, i10, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static <MessageType extends kotlin.reflect.jvm.internal.impl.protobuf.o> boolean r(kotlin.reflect.jvm.internal.impl.protobuf.g<kotlin.reflect.jvm.internal.impl.protobuf.h.e> r5, MessageType r6, kotlin.reflect.jvm.internal.impl.protobuf.e r7, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream r8, kotlin.reflect.jvm.internal.impl.protobuf.f r9, int r10) throws kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException {
        /*
            Method dump skipped, instructions count: 291
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.reflect.jvm.internal.impl.protobuf.h.r(kotlin.reflect.jvm.internal.impl.protobuf.g, kotlin.reflect.jvm.internal.impl.protobuf.o, kotlin.reflect.jvm.internal.impl.protobuf.e, kotlin.reflect.jvm.internal.impl.protobuf.CodedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f, int):boolean");
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.o
    public q<? extends o> h() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    protected boolean q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) {
        return eVar.P(i10, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    public static abstract class d<MessageType extends d<MessageType>> extends h implements p {

        /* renamed from: C, reason: collision with root package name */
        private final g<e> f44060C;

        /* compiled from: GeneratedMessageLite.java */
        protected class a {

            /* renamed from: a, reason: collision with root package name */
            private final Iterator<Map.Entry<e, Object>> f44061a;

            /* renamed from: b, reason: collision with root package name */
            private Map.Entry<e, Object> f44062b;

            /* renamed from: c, reason: collision with root package name */
            private final boolean f44063c;

            /* synthetic */ a(d dVar, boolean z10, a aVar) {
                this(z10);
            }

            public void a(int i10, CodedOutputStream codedOutputStream) {
                while (true) {
                    Map.Entry<e, Object> entry = this.f44062b;
                    if (entry == null || entry.getKey().e() >= i10) {
                        return;
                    }
                    e key = this.f44062b.getKey();
                    if (this.f44063c && key.i() == w.c.MESSAGE && !key.isRepeated()) {
                        codedOutputStream.f0(key.e(), (o) this.f44062b.getValue());
                    } else {
                        g.z(key, this.f44062b.getValue(), codedOutputStream);
                    }
                    if (this.f44061a.hasNext()) {
                        this.f44062b = this.f44061a.next();
                    } else {
                        this.f44062b = null;
                    }
                }
            }

            private a(boolean z10) {
                Iterator<Map.Entry<e, Object>> itP = d.this.f44060C.p();
                this.f44061a = itP;
                if (itP.hasNext()) {
                    this.f44062b = itP.next();
                }
                this.f44063c = z10;
            }
        }

        protected d() {
            this.f44060C = g.t();
        }

        private void A(f<MessageType, ?> fVar) {
            if (fVar.b() != c()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected void n() {
            this.f44060C.q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.h
        protected boolean q(kotlin.reflect.jvm.internal.impl.protobuf.e eVar, CodedOutputStream codedOutputStream, kotlin.reflect.jvm.internal.impl.protobuf.f fVar, int i10) {
            return h.r(this.f44060C, c(), eVar, codedOutputStream, fVar, i10);
        }

        protected boolean t() {
            return this.f44060C.n();
        }

        protected int u() {
            return this.f44060C.k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> Type v(f<MessageType, Type> fVar) {
            A(fVar);
            Object objH = this.f44060C.h(fVar.f44073d);
            return objH == null ? fVar.f44071b : (Type) fVar.a(objH);
        }

        public final <Type> Type w(f<MessageType, List<Type>> fVar, int i10) {
            A(fVar);
            return (Type) fVar.e(this.f44060C.i(fVar.f44073d, i10));
        }

        public final <Type> int x(f<MessageType, List<Type>> fVar) {
            A(fVar);
            return this.f44060C.j(fVar.f44073d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public final <Type> boolean y(f<MessageType, Type> fVar) {
            A(fVar);
            return this.f44060C.m(fVar.f44073d);
        }

        protected d<MessageType>.a z() {
            return new a(this, false, null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f44060C = cVar.r();
        }
    }

    protected h(b bVar) {
    }

    protected void n() {
    }
}
