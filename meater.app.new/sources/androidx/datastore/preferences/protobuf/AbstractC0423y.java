package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.AbstractC0356a;
import androidx.datastore.preferences.protobuf.AbstractC0423y;
import androidx.datastore.preferences.protobuf.AbstractC0423y.a;
import androidx.datastore.preferences.protobuf.C0357a0;
import androidx.datastore.preferences.protobuf.C0409r1;
import androidx.datastore.preferences.protobuf.C0415u;
import androidx.datastore.preferences.protobuf.InterfaceC0405q0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import p024c.p064l.p065b.C0973f;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.y */
/* loaded from: classes.dex */
public abstract class AbstractC0423y<MessageType extends AbstractC0423y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0356a<MessageType, BuilderType> {
    private static Map<Object, AbstractC0423y<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected C0394m1 unknownFields = C0394m1.m3035e();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$a */
    public static abstract class a<MessageType extends AbstractC0423y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC0356a.a<MessageType, BuilderType> {

        /* renamed from: f */
        private final MessageType f3017f;

        /* renamed from: g */
        protected MessageType f3018g;

        /* renamed from: h */
        protected boolean f3019h = false;

        protected a(MessageType messagetype) {
            this.f3017f = messagetype;
            this.f3018g = (MessageType) messagetype.m3344s(f.NEW_MUTABLE_INSTANCE);
        }

        /* renamed from: v */
        private void m3348v(MessageType messagetype, MessageType messagetype2) {
            C0361b1.m2578a().m2582e(messagetype).mo2692a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0.a
        /* renamed from: o, reason: merged with bridge method [inline-methods] */
        public final MessageType mo3158c() {
            MessageType messagetype = (MessageType) mo3157J0();
            if (messagetype.isInitialized()) {
                return messagetype;
            }
            throw AbstractC0356a.a.m2552n(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public MessageType mo3157J0() {
            if (this.f3019h) {
                return this.f3018g;
            }
            this.f3018g.m3339B();
            this.f3019h = true;
            return this.f3018g;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            C0973f.a aVar = (BuilderType) mo3201b().mo3154f();
            aVar.m3355u(mo3157J0());
            return aVar;
        }

        /* renamed from: r */
        protected void m3352r() {
            if (this.f3019h) {
                MessageType messagetype = (MessageType) this.f3018g.m3344s(f.NEW_MUTABLE_INSTANCE);
                m3348v(messagetype, this.f3018g);
                this.f3018g = messagetype;
                this.f3019h = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0408r0
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public MessageType mo3201b() {
            return this.f3017f;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC0356a.a
        /* renamed from: t, reason: merged with bridge method [inline-methods] */
        public BuilderType mo2553l(MessageType messagetype) {
            return (BuilderType) m3355u(messagetype);
        }

        /* renamed from: u */
        public BuilderType m3355u(MessageType messagetype) {
            m3352r();
            m3348v(this.f3018g, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$b */
    protected static class b<T extends AbstractC0423y<T, ?>> extends AbstractC0359b<T> {

        /* renamed from: b */
        private final T f3020b;

        public b(T t) {
            this.f3020b = t;
        }

        @Override // androidx.datastore.preferences.protobuf.InterfaceC0424y0
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T mo3356b(AbstractC0383j abstractC0383j, C0401p c0401p) throws InvalidProtocolBufferException {
            return (T) AbstractC0423y.m3333G(this.f3020b, abstractC0383j, c0401p);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC0423y<MessageType, BuilderType> implements InterfaceC0408r0 {
        protected C0415u<d> extensions = C0415u.m3278h();

        /* renamed from: J */
        C0415u<d> m3358J() {
            if (this.extensions.m3294o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0423y, androidx.datastore.preferences.protobuf.InterfaceC0408r0
        /* renamed from: b */
        public /* bridge */ /* synthetic */ InterfaceC0405q0 mo3201b() {
            return super.mo3201b();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0423y, androidx.datastore.preferences.protobuf.InterfaceC0405q0
        /* renamed from: d */
        public /* bridge */ /* synthetic */ InterfaceC0405q0.a mo3152d() {
            return super.mo3152d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC0423y, androidx.datastore.preferences.protobuf.InterfaceC0405q0
        /* renamed from: f */
        public /* bridge */ /* synthetic */ InterfaceC0405q0.a mo3154f() {
            return super.mo3154f();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$d */
    static final class d implements C0415u.b<d> {

        /* renamed from: f */
        final C0357a0.d<?> f3021f;

        /* renamed from: g */
        final int f3022g;

        /* renamed from: h */
        final C0409r1.b f3023h;

        /* renamed from: i */
        final boolean f3024i;

        /* renamed from: j */
        final boolean f3025j;

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: B */
        public InterfaceC0405q0.a mo3300B(InterfaceC0405q0.a aVar, InterfaceC0405q0 interfaceC0405q0) {
            return ((a) aVar).m3355u((AbstractC0423y) interfaceC0405q0);
        }

        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: f */
        public int mo3301f() {
            return this.f3022g;
        }

        @Override // java.lang.Comparable
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f3022g - dVar.f3022g;
        }

        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: h */
        public boolean mo3302h() {
            return this.f3024i;
        }

        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: j */
        public C0409r1.b mo3303j() {
            return this.f3023h;
        }

        /* renamed from: k */
        public C0357a0.d<?> m3360k() {
            return this.f3021f;
        }

        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: l */
        public C0409r1.c mo3304l() {
            return this.f3023h.m3205g();
        }

        @Override // androidx.datastore.preferences.protobuf.C0415u.b
        /* renamed from: m */
        public boolean mo3305m() {
            return this.f3025j;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$e */
    public static class e<ContainingType extends InterfaceC0405q0, Type> extends AbstractC0395n<ContainingType, Type> {

        /* renamed from: a */
        final InterfaceC0405q0 f3026a;

        /* renamed from: b */
        final d f3027b;

        /* renamed from: a */
        public C0409r1.b m3361a() {
            return this.f3027b.mo3303j();
        }

        /* renamed from: b */
        public InterfaceC0405q0 m3362b() {
            return this.f3026a;
        }

        /* renamed from: c */
        public int m3363c() {
            return this.f3027b.mo3301f();
        }

        /* renamed from: d */
        public boolean m3364d() {
            return this.f3027b.f3024i;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.y$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    /* renamed from: A */
    protected static final <T extends AbstractC0423y<T, ?>> boolean m3329A(T t, boolean z) {
        byte bByteValue = ((Byte) t.m3344s(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zMo2698g = C0361b1.m2578a().m2582e(t).mo2698g(t);
        if (z) {
            t.m3345t(f.SET_MEMOIZED_IS_INITIALIZED, zMo2698g ? t : null);
        }
        return zMo2698g;
    }

    /* renamed from: C */
    protected static <E> C0357a0.i<E> m3330C(C0357a0.i<E> iVar) {
        int size = iVar.size();
        return iVar.mo2570J(size == 0 ? 10 : size * 2);
    }

    /* renamed from: E */
    protected static Object m3331E(InterfaceC0405q0 interfaceC0405q0, String str, Object[] objArr) {
        return new C0367d1(interfaceC0405q0, str, objArr);
    }

    /* renamed from: F */
    protected static <T extends AbstractC0423y<T, ?>> T m3332F(T t, InputStream inputStream) throws InvalidProtocolBufferException {
        return (T) m3335q(m3333G(t, AbstractC0383j.m2849f(inputStream), C0401p.m3078b()));
    }

    /* renamed from: G */
    static <T extends AbstractC0423y<T, ?>> T m3333G(T t, AbstractC0383j abstractC0383j, C0401p c0401p) throws InvalidProtocolBufferException {
        T t2 = (T) t.m3344s(f.NEW_MUTABLE_INSTANCE);
        try {
            InterfaceC0373f1 interfaceC0373f1M2582e = C0361b1.m2578a().m2582e(t2);
            interfaceC0373f1M2582e.mo2696e(t2, C0386k.m2918P(abstractC0383j), c0401p);
            interfaceC0373f1M2582e.mo2697f(t2);
            return t2;
        } catch (IOException e2) {
            if (e2.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e2.getCause());
            }
            throw new InvalidProtocolBufferException(e2.getMessage()).m2540i(t2);
        } catch (RuntimeException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw e3;
        }
    }

    /* renamed from: H */
    protected static <T extends AbstractC0423y<?, ?>> void m3334H(Class<T> cls, T t) {
        defaultInstanceMap.put(cls, t);
    }

    /* renamed from: q */
    private static <T extends AbstractC0423y<T, ?>> T m3335q(T t) throws InvalidProtocolBufferException {
        if (t == null || t.isInitialized()) {
            return t;
        }
        throw t.m2547m().m2541a().m2540i(t);
    }

    /* renamed from: v */
    protected static <E> C0357a0.i<E> m3336v() {
        return C0364c1.m2588g();
    }

    /* renamed from: w */
    static <T extends AbstractC0423y<?, ?>> T m3337w(Class<T> cls) throws ClassNotFoundException {
        AbstractC0423y<?, ?> abstractC0423y = defaultInstanceMap.get(cls);
        if (abstractC0423y == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC0423y = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e2) {
                throw new IllegalStateException("Class initialization cannot fail.", e2);
            }
        }
        if (abstractC0423y == null) {
            abstractC0423y = (T) ((AbstractC0423y) C0403p1.m3106i(cls)).mo3201b();
            if (abstractC0423y == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC0423y);
        }
        return (T) abstractC0423y;
    }

    /* renamed from: y */
    static Object m3338y(Method method, Object obj, Object... objArr) {
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

    /* renamed from: B */
    protected void m3339B() {
        C0361b1.m2578a().m2582e(this).mo2697f(this);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo3154f() {
        return (BuilderType) m3344s(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: I, reason: merged with bridge method [inline-methods] */
    public final BuilderType mo3152d() {
        BuilderType buildertype = (BuilderType) m3344s(f.NEW_BUILDER);
        buildertype.m3355u(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: e */
    public int mo3153e() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = C0361b1.m2578a().m2582e(this).mo2700i(this);
        }
        return this.memoizedSerializedSize;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (mo3201b().getClass().isInstance(obj)) {
            return C0361b1.m2578a().m2582e(this).mo2693b(this, (AbstractC0423y) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: g */
    public final InterfaceC0424y0<MessageType> mo3155g() {
        return (InterfaceC0424y0) m3344s(f.GET_PARSER);
    }

    public int hashCode() {
        int i2 = this.memoizedHashCode;
        if (i2 != 0) {
            return i2;
        }
        int iMo2695d = C0361b1.m2578a().m2582e(this).mo2695d(this);
        this.memoizedHashCode = iMo2695d;
        return iMo2695d;
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0405q0
    /* renamed from: i */
    public void mo3156i(CodedOutputStream codedOutputStream) throws IOException {
        C0361b1.m2578a().m2582e(this).mo2699h(this, C0389l.m2942P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0408r0
    public final boolean isInitialized() {
        return m3329A(this, true);
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0356a
    /* renamed from: j */
    int mo2545j() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC0356a
    /* renamed from: n */
    void mo2548n(int i2) {
        this.memoizedSerializedSize = i2;
    }

    /* renamed from: p */
    Object m3342p() throws Exception {
        return m3344s(f.BUILD_MESSAGE_INFO);
    }

    /* renamed from: r */
    protected final <MessageType extends AbstractC0423y<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType m3343r() {
        return (BuilderType) m3344s(f.NEW_BUILDER);
    }

    /* renamed from: s */
    protected Object m3344s(f fVar) {
        return mo3346u(fVar, null, null);
    }

    /* renamed from: t */
    protected Object m3345t(f fVar, Object obj) {
        return mo3346u(fVar, obj, null);
    }

    public String toString() {
        return C0411s0.m3214e(this, super.toString());
    }

    /* renamed from: u */
    protected abstract Object mo3346u(f fVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.InterfaceC0408r0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public final MessageType mo3201b() {
        return (MessageType) m3344s(f.GET_DEFAULT_INSTANCE);
    }
}
