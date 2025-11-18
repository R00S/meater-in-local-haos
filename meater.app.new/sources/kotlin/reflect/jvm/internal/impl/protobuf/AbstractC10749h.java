package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10742a;
import kotlin.reflect.jvm.internal.impl.protobuf.C10748g;
import kotlin.reflect.jvm.internal.impl.protobuf.C10750i;
import kotlin.reflect.jvm.internal.impl.protobuf.C10764w;
import kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h */
/* loaded from: classes3.dex */
public abstract class AbstractC10749h extends AbstractC10742a implements Serializable {

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f41294a;

        static {
            int[] iArr = new int[C10764w.c.values().length];
            f41294a = iArr;
            try {
                iArr[C10764w.c.MESSAGE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f41294a[C10764w.c.ENUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$b */
    public static abstract class b<MessageType extends AbstractC10749h, BuilderType extends b> extends AbstractC10742a.a<BuilderType> {

        /* renamed from: f */
        private AbstractC10745d f41295f = AbstractC10745d.f41263f;

        protected b() {
        }

        @Override // 
        /* renamed from: k */
        public BuilderType mo34095k() {
            throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
        }

        /* renamed from: l */
        public final AbstractC10745d m38391l() {
            return this.f41295f;
        }

        /* renamed from: m */
        public abstract BuilderType mo34096m(MessageType messagetype);

        /* renamed from: n */
        public final BuilderType m38392n(AbstractC10745d abstractC10745d) {
            this.f41295f = abstractC10745d;
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$c */
    public static abstract class c<MessageType extends d<MessageType>, BuilderType extends c<MessageType, BuilderType>> extends b<MessageType, BuilderType> implements InterfaceC10757p {

        /* renamed from: g */
        private C10748g<e> f41296g = C10748g.m38355g();

        /* renamed from: h */
        private boolean f41297h;

        protected c() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: p */
        public C10748g<e> m38394p() {
            this.f41296g.m38374q();
            this.f41297h = false;
            return this.f41296g;
        }

        /* renamed from: q */
        private void m38395q() {
            if (this.f41297h) {
                return;
            }
            this.f41296g = this.f41296g.clone();
            this.f41297h = true;
        }

        /* renamed from: r */
        protected final void m38396r(MessageType messagetype) {
            m38395q();
            this.f41296g.m38375r(((d) messagetype).f41298g);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$e */
    static final class e implements C10748g.b<e> {

        /* renamed from: f */
        final C10750i.b<?> f41303f;

        /* renamed from: g */
        final int f41304g;

        /* renamed from: h */
        final C10764w.b f41305h;

        /* renamed from: i */
        final boolean f41306i;

        /* renamed from: j */
        final boolean f41307j;

        e(C10750i.b<?> bVar, int i2, C10764w.b bVar2, boolean z, boolean z2) {
            this.f41303f = bVar;
            this.f41304g = i2;
            this.f41305h = bVar2;
            this.f41306i = z;
            this.f41307j = z2;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: f */
        public int mo38377f() {
            return this.f41304g;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(e eVar) {
            return this.f41304g - eVar.f41304g;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: h */
        public boolean mo38378h() {
            return this.f41306i;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: j */
        public C10764w.b mo38379j() {
            return this.f41305h;
        }

        /* renamed from: k */
        public C10750i.b<?> m38408k() {
            return this.f41303f;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: l */
        public C10764w.c mo38380l() {
            return this.f41305h.m38497g();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: m */
        public boolean mo38381m() {
            return this.f41307j;
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.C10748g.b
        /* renamed from: n */
        public InterfaceC10756o.a mo38382n(InterfaceC10756o.a aVar, InterfaceC10756o interfaceC10756o) {
            return ((b) aVar).mo34096m((AbstractC10749h) interfaceC10756o);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$f */
    public static class f<ContainingType extends InterfaceC10756o, Type> {

        /* renamed from: a */
        final ContainingType f41308a;

        /* renamed from: b */
        final Type f41309b;

        /* renamed from: c */
        final InterfaceC10756o f41310c;

        /* renamed from: d */
        final e f41311d;

        /* renamed from: e */
        final Class f41312e;

        /* renamed from: f */
        final Method f41313f;

        f(ContainingType containingtype, Type type, InterfaceC10756o interfaceC10756o, e eVar, Class cls) {
            if (containingtype == null) {
                throw new IllegalArgumentException("Null containingTypeDefaultInstance");
            }
            if (eVar.mo38379j() == C10764w.b.f41386p && interfaceC10756o == null) {
                throw new IllegalArgumentException("Null messageDefaultInstance");
            }
            this.f41308a = containingtype;
            this.f41309b = type;
            this.f41310c = interfaceC10756o;
            this.f41311d = eVar;
            this.f41312e = cls;
            if (C10750i.a.class.isAssignableFrom(cls)) {
                this.f41313f = AbstractC10749h.m38384k(cls, "valueOf", Integer.TYPE);
            } else {
                this.f41313f = null;
            }
        }

        /* renamed from: a */
        Object m38409a(Object obj) {
            if (!this.f41311d.mo38378h()) {
                return m38413e(obj);
            }
            if (this.f41311d.mo38380l() != C10764w.c.ENUM) {
                return obj;
            }
            ArrayList arrayList = new ArrayList();
            Iterator it = ((List) obj).iterator();
            while (it.hasNext()) {
                arrayList.add(m38413e(it.next()));
            }
            return arrayList;
        }

        /* renamed from: b */
        public ContainingType m38410b() {
            return this.f41308a;
        }

        /* renamed from: c */
        public InterfaceC10756o m38411c() {
            return this.f41310c;
        }

        /* renamed from: d */
        public int m38412d() {
            return this.f41311d.mo38377f();
        }

        /* renamed from: e */
        Object m38413e(Object obj) {
            return this.f41311d.mo38380l() == C10764w.c.ENUM ? AbstractC10749h.m38385l(this.f41313f, null, (Integer) obj) : obj;
        }

        /* renamed from: f */
        Object m38414f(Object obj) {
            return this.f41311d.mo38380l() == C10764w.c.ENUM ? Integer.valueOf(((C10750i.a) obj).mo34235f()) : obj;
        }
    }

    protected AbstractC10749h() {
    }

    /* renamed from: k */
    static Method m38384k(Class cls, String str, Class... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException e2) {
            String name = cls.getName();
            String strValueOf = String.valueOf(str);
            StringBuilder sb = new StringBuilder(name.length() + 45 + strValueOf.length());
            sb.append("Generated message class \"");
            sb.append(name);
            sb.append("\" missing method \"");
            sb.append(strValueOf);
            sb.append("\".");
            throw new RuntimeException(sb.toString(), e2);
        }
    }

    /* renamed from: l */
    static Object m38385l(Method method, Object obj, Object... objArr) {
        try {
            return method.invoke(obj, objArr);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e2);
        } catch (InvocationTargetException e3) {
            Throwable cause = e3.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    /* renamed from: n */
    public static <ContainingType extends InterfaceC10756o, Type> f<ContainingType, Type> m38386n(ContainingType containingtype, InterfaceC10756o interfaceC10756o, C10750i.b<?> bVar, int i2, C10764w.b bVar2, boolean z, Class cls) {
        return new f<>(containingtype, Collections.emptyList(), interfaceC10756o, new e(bVar, i2, bVar2, true, z), cls);
    }

    /* renamed from: o */
    public static <ContainingType extends InterfaceC10756o, Type> f<ContainingType, Type> m38387o(ContainingType containingtype, Type type, InterfaceC10756o interfaceC10756o, C10750i.b<?> bVar, int i2, C10764w.b bVar2, Class cls) {
        return new f<>(containingtype, type, interfaceC10756o, new e(bVar, i2, bVar2, false, false), cls);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: q */
    public static <MessageType extends InterfaceC10756o> boolean m38388q(C10748g<e> c10748g, MessageType messagetype, C10746e c10746e, CodedOutputStream codedOutputStream, C10747f c10747f, int i2) throws IOException {
        boolean z;
        boolean z2;
        Object objMo34093c;
        InterfaceC10756o interfaceC10756o;
        int iM38495b = C10764w.m38495b(i2);
        f fVarM38350b = c10747f.m38350b(messagetype, C10764w.m38494a(i2));
        if (fVarM38350b == null) {
            z = true;
            z2 = false;
        } else if (iM38495b == C10748g.m38356l(fVarM38350b.f41311d.mo38379j(), false)) {
            z = false;
            z2 = false;
        } else {
            e eVar = fVarM38350b.f41311d;
            if (eVar.f41306i && eVar.f41305h.mo38499q() && iM38495b == C10748g.m38356l(fVarM38350b.f41311d.mo38379j(), true)) {
                z = false;
                z2 = true;
            }
            z = true;
            z2 = false;
        }
        if (z) {
            return c10746e.m38323P(i2, codedOutputStream);
        }
        if (z2) {
            int iM38330j = c10746e.m38330j(c10746e.m38311A());
            if (fVarM38350b.f41311d.mo38379j() == C10764w.b.f41389s) {
                while (c10746e.m38327e() > 0) {
                    C10750i.a aVarMo34236a = fVarM38350b.f41311d.m38408k().mo34236a(c10746e.m38334n());
                    if (aVarMo34236a == null) {
                        return true;
                    }
                    c10748g.m38365a(fVarM38350b.f41311d, fVarM38350b.m38414f(aVarMo34236a));
                }
            } else {
                while (c10746e.m38327e() > 0) {
                    c10748g.m38365a(fVarM38350b.f41311d, C10748g.m38360u(c10746e, fVarM38350b.f41311d.mo38379j(), false));
                }
            }
            c10746e.m38329i(iM38330j);
        } else {
            int i3 = a.f41294a[fVarM38350b.f41311d.mo38380l().ordinal()];
            if (i3 == 1) {
                InterfaceC10756o.a aVarMo34079f = null;
                if (!fVarM38350b.f41311d.mo38378h() && (interfaceC10756o = (InterfaceC10756o) c10748g.m38367h(fVarM38350b.f41311d)) != null) {
                    aVarMo34079f = interfaceC10756o.mo34077d();
                }
                if (aVarMo34079f == null) {
                    aVarMo34079f = fVarM38350b.m38411c().mo34079f();
                }
                if (fVarM38350b.f41311d.mo38379j() == C10764w.b.f41385o) {
                    c10746e.m38338r(fVarM38350b.m38412d(), aVarMo34079f, c10747f);
                } else {
                    c10746e.m38342v(aVarMo34079f, c10747f);
                }
                objMo34093c = aVarMo34079f.mo34093c();
            } else if (i3 != 2) {
                objMo34093c = C10748g.m38360u(c10746e, fVarM38350b.f41311d.mo38379j(), false);
            } else {
                int iM38334n = c10746e.m38334n();
                C10750i.a aVarMo34236a2 = fVarM38350b.f41311d.m38408k().mo34236a(iM38334n);
                if (aVarMo34236a2 == null) {
                    codedOutputStream.m38231o0(i2);
                    codedOutputStream.m38241y0(iM38334n);
                    return true;
                }
                objMo34093c = aVarMo34236a2;
            }
            if (fVarM38350b.f41311d.mo38378h()) {
                c10748g.m38365a(fVarM38350b.f41311d, fVarM38350b.m38414f(objMo34093c));
            } else {
                c10748g.m38376v(fVarM38350b.f41311d, fVarM38350b.m38414f(objMo34093c));
            }
        }
        return true;
    }

    @Override // kotlin.reflect.jvm.internal.impl.protobuf.InterfaceC10756o
    /* renamed from: g */
    public InterfaceC10758q<? extends InterfaceC10756o> mo34080g() {
        throw new UnsupportedOperationException("This is supposed to be overridden by subclasses.");
    }

    /* renamed from: m */
    protected void mo38389m() {
    }

    /* renamed from: p */
    protected boolean mo38390p(C10746e c10746e, CodedOutputStream codedOutputStream, C10747f c10747f, int i2) throws IOException {
        return c10746e.m38323P(i2, codedOutputStream);
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d */
    public static abstract class d<MessageType extends d<MessageType>> extends AbstractC10749h implements InterfaceC10757p {

        /* renamed from: g */
        private final C10748g<e> f41298g;

        /* compiled from: GeneratedMessageLite.java */
        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.h$d$a */
        protected class a {

            /* renamed from: a */
            private final Iterator<Map.Entry<e, Object>> f41299a;

            /* renamed from: b */
            private Map.Entry<e, Object> f41300b;

            /* renamed from: c */
            private final boolean f41301c;

            /* synthetic */ a(d dVar, boolean z, a aVar) {
                this(z);
            }

            /* renamed from: a */
            public void m38406a(int i2, CodedOutputStream codedOutputStream) throws IOException {
                while (true) {
                    Map.Entry<e, Object> entry = this.f41300b;
                    if (entry == null || entry.getKey().mo38377f() >= i2) {
                        return;
                    }
                    e key = this.f41300b.getKey();
                    if (this.f41301c && key.mo38380l() == C10764w.c.MESSAGE && !key.mo38378h()) {
                        codedOutputStream.m38222f0(key.mo38377f(), (InterfaceC10756o) this.f41300b.getValue());
                    } else {
                        C10748g.m38364z(key, this.f41300b.getValue(), codedOutputStream);
                    }
                    if (this.f41299a.hasNext()) {
                        this.f41300b = this.f41299a.next();
                    } else {
                        this.f41300b = null;
                    }
                }
            }

            private a(boolean z) {
                Iterator<Map.Entry<e, Object>> itM38373p = d.this.f41298g.m38373p();
                this.f41299a = itM38373p;
                if (itM38373p.hasNext()) {
                    this.f41300b = itM38373p.next();
                }
                this.f41301c = z;
            }
        }

        protected d() {
            this.f41298g = C10748g.m38359t();
        }

        /* renamed from: z */
        private void m38398z(f<MessageType, ?> fVar) {
            if (fVar.m38410b() != mo34461b()) {
                throw new IllegalArgumentException("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
            }
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h
        /* renamed from: m */
        protected void mo38389m() {
            this.f41298g.m38374q();
        }

        @Override // kotlin.reflect.jvm.internal.impl.protobuf.AbstractC10749h
        /* renamed from: p */
        protected boolean mo38390p(C10746e c10746e, CodedOutputStream codedOutputStream, C10747f c10747f, int i2) throws IOException {
            return AbstractC10749h.m38388q(this.f41298g, mo34461b(), c10746e, codedOutputStream, c10747f, i2);
        }

        /* renamed from: s */
        protected boolean m38399s() {
            return this.f41298g.m38372n();
        }

        /* renamed from: t */
        protected int m38400t() {
            return this.f41298g.m38370k();
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: u */
        public final <Type> Type m38401u(f<MessageType, Type> fVar) {
            m38398z(fVar);
            Object objM38367h = this.f41298g.m38367h(fVar.f41311d);
            return objM38367h == null ? fVar.f41309b : (Type) fVar.m38409a(objM38367h);
        }

        /* renamed from: v */
        public final <Type> Type m38402v(f<MessageType, List<Type>> fVar, int i2) {
            m38398z(fVar);
            return (Type) fVar.m38413e(this.f41298g.m38368i(fVar.f41311d, i2));
        }

        /* renamed from: w */
        public final <Type> int m38403w(f<MessageType, List<Type>> fVar) {
            m38398z(fVar);
            return this.f41298g.m38369j(fVar.f41311d);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: x */
        public final <Type> boolean m38404x(f<MessageType, Type> fVar) {
            m38398z(fVar);
            return this.f41298g.m38371m(fVar.f41311d);
        }

        /* renamed from: y */
        protected d<MessageType>.a m38405y() {
            return new a(this, false, null);
        }

        protected d(c<MessageType, ?> cVar) {
            this.f41298g = cVar.m38394p();
        }
    }

    protected AbstractC10749h(b bVar) {
    }
}
