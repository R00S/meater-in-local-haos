package com.google.protobuf;

import com.google.protobuf.AbstractC2941a;
import com.google.protobuf.AbstractC2962w;
import com.google.protobuf.AbstractC2962w.a;
import com.google.protobuf.C2958s;
import com.google.protobuf.C2964y;
import com.google.protobuf.P;
import com.google.protobuf.r0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: com.google.protobuf.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2962w<MessageType extends AbstractC2962w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2941a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2962w<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$a */
    public static abstract class a<MessageType extends AbstractC2962w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2941a.AbstractC0499a<MessageType, BuilderType> {

        /* renamed from: B, reason: collision with root package name */
        private final MessageType f39469B;

        /* renamed from: C, reason: collision with root package name */
        protected MessageType f39470C;

        protected a(MessageType messagetype) {
            this.f39469B = messagetype;
            if (messagetype.O()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f39470C = (MessageType) J();
        }

        private static <MessageType> void I(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType J() {
            return (MessageType) this.f39469B.V();
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: A, reason: merged with bridge method [inline-methods] */
        public MessageType j() {
            if (!this.f39470C.O()) {
                return this.f39470C;
            }
            this.f39470C.P();
            return this.f39470C;
        }

        /* renamed from: B, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().g();
            buildertype.f39470C = (MessageType) j();
            return buildertype;
        }

        protected final void C() {
            if (this.f39470C.O()) {
                return;
            }
            D();
        }

        protected void D() {
            MessageType messagetype = (MessageType) J();
            I(messagetype, this.f39470C);
            this.f39470C = messagetype;
        }

        @Override // com.google.protobuf.Q
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public MessageType c() {
            return this.f39469B;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.protobuf.AbstractC2941a.AbstractC0499a
        /* renamed from: F, reason: merged with bridge method [inline-methods] */
        public BuilderType t(MessageType messagetype) {
            return (BuilderType) H(messagetype);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: G, reason: merged with bridge method [inline-methods] */
        public BuilderType U0(AbstractC2948h abstractC2948h, C2954n c2954n) throws IOException {
            C();
            try {
                b0.a().d(this.f39470C).i(this.f39470C, C2949i.Q(abstractC2948h), c2954n);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }

        public BuilderType H(MessageType messagetype) {
            if (c().equals(messagetype)) {
                return this;
            }
            C();
            I(this.f39470C, messagetype);
            return this;
        }

        @Override // com.google.protobuf.Q
        public final boolean b() {
            return AbstractC2962w.N(this.f39470C, false);
        }

        @Override // com.google.protobuf.P.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public final MessageType e() {
            MessageType messagetype = (MessageType) j();
            if (messagetype.b()) {
                return messagetype;
            }
            throw AbstractC2941a.AbstractC0499a.v(messagetype);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$b */
    protected static class b<T extends AbstractC2962w<T, ?>> extends AbstractC2942b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f39471b;

        public b(T t10) {
            this.f39471b = t10;
        }

        @Override // com.google.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC2948h abstractC2948h, C2954n c2954n) {
            return (T) AbstractC2962w.W(this.f39471b, abstractC2948h, c2954n);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC2962w<MessageType, BuilderType> implements Q {
        protected C2958s<d> extensions = C2958s.h();

        C2958s<d> a0() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.protobuf.AbstractC2962w, com.google.protobuf.Q
        public /* bridge */ /* synthetic */ P c() {
            return super.c();
        }

        @Override // com.google.protobuf.AbstractC2962w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // com.google.protobuf.AbstractC2962w, com.google.protobuf.P
        public /* bridge */ /* synthetic */ P.a g() {
            return super.g();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$d */
    static final class d implements C2958s.b<d> {

        /* renamed from: B, reason: collision with root package name */
        final C2964y.d<?> f39472B;

        /* renamed from: C, reason: collision with root package name */
        final int f39473C;

        /* renamed from: D, reason: collision with root package name */
        final r0.b f39474D;

        /* renamed from: E, reason: collision with root package name */
        final boolean f39475E;

        /* renamed from: F, reason: collision with root package name */
        final boolean f39476F;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f39473C - dVar.f39473C;
        }

        @Override // com.google.protobuf.C2958s.b
        public int e() {
            return this.f39473C;
        }

        @Override // com.google.protobuf.C2958s.b
        public r0.b g() {
            return this.f39474D;
        }

        @Override // com.google.protobuf.C2958s.b
        public r0.c i() {
            return this.f39474D.c();
        }

        @Override // com.google.protobuf.C2958s.b
        public boolean isPacked() {
            return this.f39476F;
        }

        @Override // com.google.protobuf.C2958s.b
        public boolean isRepeated() {
            return this.f39475E;
        }

        public C2964y.d<?> j() {
            return this.f39472B;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.protobuf.C2958s.b
        public P.a m(P.a aVar, P p10) {
            return ((a) aVar).H((AbstractC2962w) p10);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$e */
    public static class e<ContainingType extends P, Type> extends AbstractC2952l<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f39477a;

        /* renamed from: b, reason: collision with root package name */
        final d f39478b;

        public r0.b a() {
            return this.f39478b.g();
        }

        public P b() {
            return this.f39477a;
        }

        public int c() {
            return this.f39478b.e();
        }

        public boolean d() {
            return this.f39478b.f39475E;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.protobuf.w$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    private int B(f0<?> f0Var) {
        return f0Var == null ? b0.a().d(this).e(this) : f0Var.e(this);
    }

    protected static C2964y.g G() {
        return C2963x.j();
    }

    protected static <E> C2964y.i<E> H() {
        return c0.h();
    }

    static <T extends AbstractC2962w<?, ?>> T I(Class<T> cls) throws ClassNotFoundException {
        AbstractC2962w<?, ?> abstractC2962w = defaultInstanceMap.get(cls);
        if (abstractC2962w == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2962w = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2962w == null) {
            abstractC2962w = (T) ((AbstractC2962w) p0.k(cls)).c();
            if (abstractC2962w == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC2962w);
        }
        return (T) abstractC2962w;
    }

    static Object M(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends AbstractC2962w<T, ?>> boolean N(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.D(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = b0.a().d(t10).c(t10);
        if (z10) {
            t10.E(f.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [com.google.protobuf.y$g] */
    protected static C2964y.g R(C2964y.g gVar) {
        int size = gVar.size();
        return gVar.k2(size == 0 ? 10 : size * 2);
    }

    protected static <E> C2964y.i<E> S(C2964y.i<E> iVar) {
        int size = iVar.size();
        return iVar.k2(size == 0 ? 10 : size * 2);
    }

    protected static Object U(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    static <T extends AbstractC2962w<T, ?>> T W(T t10, AbstractC2948h abstractC2948h, C2954n c2954n) throws InvalidProtocolBufferException {
        T t11 = (T) t10.V();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.i(t11, C2949i.Q(abstractC2948h), c2954n);
            f0VarD.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.j(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().j(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).j(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    protected static <T extends AbstractC2962w<?, ?>> void X(Class<T> cls, T t10) {
        t10.Q();
        defaultInstanceMap.put(cls, t10);
    }

    int A() {
        return b0.a().d(this).g(this);
    }

    protected final <MessageType extends AbstractC2962w<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType C() {
        return (BuilderType) D(f.NEW_BUILDER);
    }

    protected Object D(f fVar) {
        return F(fVar, null, null);
    }

    protected Object E(f fVar, Object obj) {
        return F(fVar, obj, null);
    }

    protected abstract Object F(f fVar, Object obj, Object obj2);

    @Override // com.google.protobuf.Q
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final MessageType c() {
        return (MessageType) D(f.GET_DEFAULT_INSTANCE);
    }

    int K() {
        return this.memoizedHashCode;
    }

    boolean L() {
        return K() == 0;
    }

    boolean O() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void P() {
        b0.a().d(this).b(this);
        Q();
    }

    void Q() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.P
    /* renamed from: T, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) D(f.NEW_BUILDER);
    }

    MessageType V() {
        return (MessageType) D(f.NEW_MUTABLE_INSTANCE);
    }

    void Y(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.protobuf.P
    /* renamed from: Z, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        return (BuilderType) ((a) D(f.NEW_BUILDER)).H(this);
    }

    @Override // com.google.protobuf.Q
    public final boolean b() {
        return N(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).d(this, (AbstractC2962w) obj);
        }
        return false;
    }

    @Override // com.google.protobuf.P
    public int f() {
        return s(null);
    }

    @Override // com.google.protobuf.P
    public final Y<MessageType> h() {
        return (Y) D(f.GET_PARSER);
    }

    public int hashCode() {
        if (O()) {
            return A();
        }
        if (L()) {
            Y(A());
        }
        return K();
    }

    @Override // com.google.protobuf.P
    public void l(CodedOutputStream codedOutputStream) {
        b0.a().d(this).h(this, C2950j.P(codedOutputStream));
    }

    @Override // com.google.protobuf.AbstractC2941a
    int r() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.protobuf.AbstractC2941a
    int s(f0 f0Var) {
        if (!O()) {
            if (r() != Integer.MAX_VALUE) {
                return r();
            }
            int iB = B(f0Var);
            v(iB);
            return iB;
        }
        int iB2 = B(f0Var);
        if (iB2 >= 0) {
            return iB2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iB2);
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    @Override // com.google.protobuf.AbstractC2941a
    void v(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object x() {
        return D(f.BUILD_MESSAGE_INFO);
    }

    void y() {
        this.memoizedHashCode = 0;
    }

    void z() {
        v(Integer.MAX_VALUE);
    }
}
