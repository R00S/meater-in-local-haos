package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.AbstractC2891a;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x;
import com.google.crypto.tink.shaded.protobuf.AbstractC2913x.a;
import com.google.crypto.tink.shaded.protobuf.C2895e;
import com.google.crypto.tink.shaded.protobuf.C2909t;
import com.google.crypto.tink.shaded.protobuf.C2915z;
import com.google.crypto.tink.shaded.protobuf.P;
import com.google.crypto.tink.shaded.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: com.google.crypto.tink.shaded.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC2913x<MessageType extends AbstractC2913x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2891a<MessageType, BuilderType> {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC2913x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize = -1;
    protected m0 unknownFields = m0.c();

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$a */
    public static abstract class a<MessageType extends AbstractC2913x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2891a.AbstractC0485a<MessageType, BuilderType> {

        /* renamed from: B, reason: collision with root package name */
        private final MessageType f38039B;

        /* renamed from: C, reason: collision with root package name */
        protected MessageType f38040C;

        protected a(MessageType messagetype) {
            this.f38039B = messagetype;
            if (messagetype.H()) {
                throw new IllegalArgumentException("Default instance must be immutable.");
            }
            this.f38040C = (MessageType) C();
        }

        private static <MessageType> void B(MessageType messagetype, MessageType messagetype2) {
            b0.a().d(messagetype).a(messagetype, messagetype2);
        }

        private MessageType C() {
            return (MessageType) this.f38039B.N();
        }

        public BuilderType A(MessageType messagetype) {
            if (c().equals(messagetype)) {
                return this;
            }
            s();
            B(this.f38040C, messagetype);
            return this;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        public final boolean b() {
            return AbstractC2913x.G(this.f38040C, false);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P.a
        /* renamed from: p, reason: merged with bridge method [inline-methods] */
        public final MessageType e() {
            MessageType messagetype = (MessageType) j();
            if (messagetype.b()) {
                return messagetype;
            }
            throw AbstractC2891a.AbstractC0485a.o(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public MessageType j() {
            if (!this.f38040C.H()) {
                return this.f38040C;
            }
            this.f38040C.I();
            return this.f38040C;
        }

        @Override // 
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            BuilderType buildertype = (BuilderType) c().g();
            buildertype.f38040C = (MessageType) j();
            return buildertype;
        }

        protected final void s() {
            if (this.f38040C.H()) {
                return;
            }
            t();
        }

        protected void t() {
            MessageType messagetype = (MessageType) C();
            B(messagetype, this.f38040C);
            this.f38040C = messagetype;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Q
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public MessageType c() {
            return this.f38039B;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a.AbstractC0485a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType m(MessageType messagetype) {
            return (BuilderType) A(messagetype);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.P.a
        /* renamed from: w, reason: merged with bridge method [inline-methods] */
        public BuilderType f0(AbstractC2899i abstractC2899i, C2905o c2905o) throws IOException {
            s();
            try {
                b0.a().d(this.f38040C).j(this.f38040C, C2900j.Q(abstractC2899i), c2905o);
                return this;
            } catch (RuntimeException e10) {
                if (e10.getCause() instanceof IOException) {
                    throw ((IOException) e10.getCause());
                }
                throw e10;
            }
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$b */
    protected static class b<T extends AbstractC2913x<T, ?>> extends AbstractC2892b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f38041b;

        public b(T t10) {
            this.f38041b = t10;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC2899i abstractC2899i, C2905o c2905o) {
            return (T) AbstractC2913x.S(this.f38041b, abstractC2899i, c2905o);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC2913x<MessageType, BuilderType> implements Q {
        protected C2909t<d> extensions = C2909t.h();

        C2909t<d> X() {
            if (this.extensions.n()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.Q
        public /* bridge */ /* synthetic */ P c() {
            return super.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2913x, com.google.crypto.tink.shaded.protobuf.P
        public /* bridge */ /* synthetic */ P.a g() {
            return super.g();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$d */
    static final class d implements C2909t.b<d> {

        /* renamed from: B, reason: collision with root package name */
        final C2915z.d<?> f38042B;

        /* renamed from: C, reason: collision with root package name */
        final int f38043C;

        /* renamed from: D, reason: collision with root package name */
        final r0.b f38044D;

        /* renamed from: E, reason: collision with root package name */
        final boolean f38045E;

        /* renamed from: F, reason: collision with root package name */
        final boolean f38046F;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f38043C - dVar.f38043C;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public int e() {
            return this.f38043C;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public r0.b g() {
            return this.f38044D;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public r0.c i() {
            return this.f38044D.c();
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public boolean isPacked() {
            return this.f38046F;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public boolean isRepeated() {
            return this.f38045E;
        }

        public C2915z.d<?> j() {
            return this.f38042B;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.google.crypto.tink.shaded.protobuf.C2909t.b
        public P.a o(P.a aVar, P p10) {
            return ((a) aVar).A((AbstractC2913x) p10);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$e */
    public static class e<ContainingType extends P, Type> extends AbstractC2903m<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f38047a;

        /* renamed from: b, reason: collision with root package name */
        final d f38048b;

        public r0.b a() {
            return this.f38048b.g();
        }

        public P b() {
            return this.f38047a;
        }

        public int c() {
            return this.f38048b.e();
        }

        public boolean d() {
            return this.f38048b.f38045E;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: com.google.crypto.tink.shaded.protobuf.x$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    protected static <E> C2915z.i<E> A() {
        return c0.h();
    }

    static <T extends AbstractC2913x<?, ?>> T B(Class<T> cls) throws ClassNotFoundException {
        AbstractC2913x<?, ?> abstractC2913x = defaultInstanceMap.get(cls);
        if (abstractC2913x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2913x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2913x == null) {
            abstractC2913x = (T) ((AbstractC2913x) p0.k(cls)).c();
            if (abstractC2913x == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC2913x);
        }
        return (T) abstractC2913x;
    }

    static Object F(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends AbstractC2913x<T, ?>> boolean G(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.x(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = b0.a().d(t10).c(t10);
        if (z10) {
            t10.y(f.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    protected static <E> C2915z.i<E> K(C2915z.i<E> iVar) {
        int size = iVar.size();
        return iVar.k(size == 0 ? 10 : size * 2);
    }

    protected static Object M(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    protected static <T extends AbstractC2913x<T, ?>> T O(T t10, AbstractC2898h abstractC2898h, C2905o c2905o) {
        return (T) r(R(t10, abstractC2898h, c2905o));
    }

    protected static <T extends AbstractC2913x<T, ?>> T P(T t10, InputStream inputStream, C2905o c2905o) {
        return (T) r(S(t10, AbstractC2899i.f(inputStream), c2905o));
    }

    protected static <T extends AbstractC2913x<T, ?>> T Q(T t10, byte[] bArr, C2905o c2905o) {
        return (T) r(T(t10, bArr, 0, bArr.length, c2905o));
    }

    private static <T extends AbstractC2913x<T, ?>> T R(T t10, AbstractC2898h abstractC2898h, C2905o c2905o) throws InvalidProtocolBufferException {
        AbstractC2899i abstractC2899iB = abstractC2898h.B();
        T t11 = (T) S(t10, abstractC2899iB, c2905o);
        try {
            abstractC2899iB.a(0);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            throw e10.k(t11);
        }
    }

    static <T extends AbstractC2913x<T, ?>> T S(T t10, AbstractC2899i abstractC2899i, C2905o c2905o) throws InvalidProtocolBufferException {
        T t11 = (T) t10.N();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.j(t11, C2900j.Q(abstractC2899i), c2905o);
            f0VarD.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.k(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).k(t11);
        } catch (RuntimeException e13) {
            if (e13.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e13.getCause());
            }
            throw e13;
        }
    }

    private static <T extends AbstractC2913x<T, ?>> T T(T t10, byte[] bArr, int i10, int i11, C2905o c2905o) throws InvalidProtocolBufferException {
        T t11 = (T) t10.N();
        try {
            f0 f0VarD = b0.a().d(t11);
            f0VarD.h(t11, bArr, i10, i10 + i11, new C2895e.b(c2905o));
            f0VarD.b(t11);
            return t11;
        } catch (InvalidProtocolBufferException e10) {
            e = e10;
            if (e.a()) {
                e = new InvalidProtocolBufferException(e);
            }
            throw e.k(t11);
        } catch (UninitializedMessageException e11) {
            throw e11.a().k(t11);
        } catch (IOException e12) {
            if (e12.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e12.getCause());
            }
            throw new InvalidProtocolBufferException(e12).k(t11);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.m().k(t11);
        }
    }

    protected static <T extends AbstractC2913x<?, ?>> void U(Class<T> cls, T t10) {
        t10.J();
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends AbstractC2913x<T, ?>> T r(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.b()) {
            return t10;
        }
        throw t10.o().a().k(t10);
    }

    private int v(f0<?> f0Var) {
        return f0Var == null ? b0.a().d(this).e(this) : f0Var.e(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public final MessageType c() {
        return (MessageType) x(f.GET_DEFAULT_INSTANCE);
    }

    int D() {
        return this.memoizedHashCode;
    }

    boolean E() {
        return D() == 0;
    }

    boolean H() {
        return (this.memoizedSerializedSize & MUTABLE_FLAG_MASK) != 0;
    }

    protected void I() {
        b0.a().d(this).b(this);
        J();
    }

    void J() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    /* renamed from: L, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    MessageType N() {
        return (MessageType) x(f.NEW_MUTABLE_INSTANCE);
    }

    void V(int i10) {
        this.memoizedHashCode = i10;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    /* renamed from: W, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        return (BuilderType) ((a) x(f.NEW_BUILDER)).A(this);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a
    int a() {
        return this.memoizedSerializedSize & Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.Q
    public final boolean b() {
        return G(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            return b0.a().d(this).d(this, (AbstractC2913x) obj);
        }
        return false;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public int f() {
        return m(null);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public final Y<MessageType> h() {
        return (Y) x(f.GET_PARSER);
    }

    public int hashCode() {
        if (H()) {
            return u();
        }
        if (E()) {
            V(u());
        }
        return D();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.P
    public void k(CodedOutputStream codedOutputStream) {
        b0.a().d(this).i(this, C2901k.P(codedOutputStream));
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a
    int m(f0 f0Var) {
        if (!H()) {
            if (a() != Integer.MAX_VALUE) {
                return a();
            }
            int iV = v(f0Var);
            p(iV);
            return iV;
        }
        int iV2 = v(f0Var);
        if (iV2 >= 0) {
            return iV2;
        }
        throw new IllegalStateException("serialized size must be non-negative, was " + iV2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractC2891a
    void p(int i10) {
        if (i10 >= 0) {
            this.memoizedSerializedSize = (i10 & Integer.MAX_VALUE) | (this.memoizedSerializedSize & MUTABLE_FLAG_MASK);
        } else {
            throw new IllegalStateException("serialized size must be non-negative, was " + i10);
        }
    }

    Object q() {
        return x(f.BUILD_MESSAGE_INFO);
    }

    void s() {
        this.memoizedHashCode = 0;
    }

    void t() {
        p(Integer.MAX_VALUE);
    }

    public String toString() {
        return S.f(this, super.toString());
    }

    int u() {
        return b0.a().d(this).g(this);
    }

    protected final <MessageType extends AbstractC2913x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType w() {
        return (BuilderType) x(f.NEW_BUILDER);
    }

    protected Object x(f fVar) {
        return z(fVar, null, null);
    }

    protected Object y(f fVar, Object obj) {
        return z(fVar, obj, null);
    }

    protected abstract Object z(f fVar, Object obj, Object obj2);
}
