package androidx.datastore.preferences.protobuf;

import D1.f;
import androidx.datastore.preferences.protobuf.AbstractC2055a;
import androidx.datastore.preferences.protobuf.AbstractC2077x;
import androidx.datastore.preferences.protobuf.AbstractC2077x.a;
import androidx.datastore.preferences.protobuf.C2073t;
import androidx.datastore.preferences.protobuf.C2079z;
import androidx.datastore.preferences.protobuf.P;
import androidx.datastore.preferences.protobuf.r0;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: GeneratedMessageLite.java */
/* renamed from: androidx.datastore.preferences.protobuf.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2077x<MessageType extends AbstractC2077x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2055a<MessageType, BuilderType> {
    private static Map<Object, AbstractC2077x<?, ?>> defaultInstanceMap = new ConcurrentHashMap();
    protected m0 unknownFields = m0.e();
    protected int memoizedSerializedSize = -1;

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$a */
    public static abstract class a<MessageType extends AbstractC2077x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> extends AbstractC2055a.AbstractC0350a<MessageType, BuilderType> {

        /* renamed from: B, reason: collision with root package name */
        private final MessageType f25163B;

        /* renamed from: C, reason: collision with root package name */
        protected MessageType f25164C;

        /* renamed from: D, reason: collision with root package name */
        protected boolean f25165D = false;

        protected a(MessageType messagetype) {
            this.f25163B = messagetype;
            this.f25164C = (MessageType) messagetype.u(f.NEW_MUTABLE_INSTANCE);
        }

        private void A(MessageType messagetype, MessageType messagetype2) {
            b0.a().e(messagetype).a(messagetype, messagetype2);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: q, reason: merged with bridge method [inline-methods] */
        public final MessageType e() {
            MessageType messagetype = (MessageType) j();
            if (messagetype.b()) {
                return messagetype;
            }
            throw AbstractC2055a.AbstractC0350a.p(messagetype);
        }

        @Override // androidx.datastore.preferences.protobuf.P.a
        /* renamed from: r, reason: merged with bridge method [inline-methods] */
        public MessageType j() {
            if (this.f25165D) {
                return this.f25164C;
            }
            this.f25164C.C();
            this.f25165D = true;
            return this.f25164C;
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public BuilderType clone() {
            f.a aVar = (BuilderType) c().g();
            aVar.w(j());
            return aVar;
        }

        protected void t() {
            if (this.f25165D) {
                MessageType messagetype = (MessageType) this.f25164C.u(f.NEW_MUTABLE_INSTANCE);
                A(messagetype, this.f25164C);
                this.f25164C = messagetype;
                this.f25165D = false;
            }
        }

        @Override // androidx.datastore.preferences.protobuf.Q
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public MessageType c() {
            return this.f25163B;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // androidx.datastore.preferences.protobuf.AbstractC2055a.AbstractC0350a
        /* renamed from: v, reason: merged with bridge method [inline-methods] */
        public BuilderType n(MessageType messagetype) {
            return (BuilderType) w(messagetype);
        }

        public BuilderType w(MessageType messagetype) {
            t();
            A(this.f25164C, messagetype);
            return this;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$b */
    protected static class b<T extends AbstractC2077x<T, ?>> extends AbstractC2056b<T> {

        /* renamed from: b, reason: collision with root package name */
        private final T f25166b;

        public b(T t10) {
            this.f25166b = t10;
        }

        @Override // androidx.datastore.preferences.protobuf.Y
        /* renamed from: g, reason: merged with bridge method [inline-methods] */
        public T b(AbstractC2063i abstractC2063i, C2069o c2069o) {
            return (T) AbstractC2077x.H(this.f25166b, abstractC2063i, c2069o);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$c */
    public static abstract class c<MessageType extends c<MessageType, BuilderType>, BuilderType> extends AbstractC2077x<MessageType, BuilderType> implements Q {
        protected C2073t<d> extensions = C2073t.h();

        C2073t<d> L() {
            if (this.extensions.o()) {
                this.extensions = this.extensions.clone();
            }
            return this.extensions;
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2077x, androidx.datastore.preferences.protobuf.Q
        public /* bridge */ /* synthetic */ P c() {
            return super.c();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2077x, androidx.datastore.preferences.protobuf.P
        public /* bridge */ /* synthetic */ P.a d() {
            return super.d();
        }

        @Override // androidx.datastore.preferences.protobuf.AbstractC2077x, androidx.datastore.preferences.protobuf.P
        public /* bridge */ /* synthetic */ P.a g() {
            return super.g();
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$d */
    static final class d implements C2073t.b<d> {

        /* renamed from: B, reason: collision with root package name */
        final int f25167B;

        /* renamed from: C, reason: collision with root package name */
        final r0.b f25168C;

        /* renamed from: D, reason: collision with root package name */
        final boolean f25169D;

        /* renamed from: E, reason: collision with root package name */
        final boolean f25170E;

        @Override // java.lang.Comparable
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public int compareTo(d dVar) {
            return this.f25167B - dVar.f25167B;
        }

        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public int e() {
            return this.f25167B;
        }

        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public r0.b g() {
            return this.f25168C;
        }

        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public r0.c i() {
            return this.f25168C.c();
        }

        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public boolean isPacked() {
            return this.f25170E;
        }

        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public boolean isRepeated() {
            return this.f25169D;
        }

        public C2079z.d<?> j() {
            return null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // androidx.datastore.preferences.protobuf.C2073t.b
        public P.a r(P.a aVar, P p10) {
            return ((a) aVar).w((AbstractC2077x) p10);
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$e */
    public static class e<ContainingType extends P, Type> extends AbstractC2067m<ContainingType, Type> {

        /* renamed from: a, reason: collision with root package name */
        final P f25171a;

        /* renamed from: b, reason: collision with root package name */
        final d f25172b;

        public r0.b a() {
            return this.f25172b.g();
        }

        public P b() {
            return this.f25171a;
        }

        public int c() {
            return this.f25172b.e();
        }

        public boolean d() {
            return this.f25172b.f25169D;
        }
    }

    /* compiled from: GeneratedMessageLite.java */
    /* renamed from: androidx.datastore.preferences.protobuf.x$f */
    public enum f {
        GET_MEMOIZED_IS_INITIALIZED,
        SET_MEMOIZED_IS_INITIALIZED,
        BUILD_MESSAGE_INFO,
        NEW_MUTABLE_INSTANCE,
        NEW_BUILDER,
        GET_DEFAULT_INSTANCE,
        GET_PARSER
    }

    static Object A(Method method, Object obj, Object... objArr) {
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

    protected static final <T extends AbstractC2077x<T, ?>> boolean B(T t10, boolean z10) {
        byte bByteValue = ((Byte) t10.u(f.GET_MEMOIZED_IS_INITIALIZED)).byteValue();
        if (bByteValue == 1) {
            return true;
        }
        if (bByteValue == 0) {
            return false;
        }
        boolean zC = b0.a().e(t10).c(t10);
        if (z10) {
            t10.v(f.SET_MEMOIZED_IS_INITIALIZED, zC ? t10 : null);
        }
        return zC;
    }

    protected static <E> C2079z.i<E> D(C2079z.i<E> iVar) {
        int size = iVar.size();
        return iVar.k(size == 0 ? 10 : size * 2);
    }

    protected static Object F(P p10, String str, Object[] objArr) {
        return new d0(p10, str, objArr);
    }

    protected static <T extends AbstractC2077x<T, ?>> T G(T t10, InputStream inputStream) {
        return (T) s(H(t10, AbstractC2063i.f(inputStream), C2069o.b()));
    }

    static <T extends AbstractC2077x<T, ?>> T H(T t10, AbstractC2063i abstractC2063i, C2069o c2069o) throws InvalidProtocolBufferException {
        T t11 = (T) t10.u(f.NEW_MUTABLE_INSTANCE);
        try {
            f0 f0VarE = b0.a().e(t11);
            f0VarE.h(t11, C2064j.Q(abstractC2063i), c2069o);
            f0VarE.b(t11);
            return t11;
        } catch (IOException e10) {
            if (e10.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e10.getCause());
            }
            throw new InvalidProtocolBufferException(e10.getMessage()).i(t11);
        } catch (RuntimeException e11) {
            if (e11.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e11.getCause());
            }
            throw e11;
        }
    }

    protected static <T extends AbstractC2077x<?, ?>> void I(Class<T> cls, T t10) {
        defaultInstanceMap.put(cls, t10);
    }

    private static <T extends AbstractC2077x<T, ?>> T s(T t10) throws InvalidProtocolBufferException {
        if (t10 == null || t10.b()) {
            return t10;
        }
        throw t10.o().a().i(t10);
    }

    protected static <E> C2079z.i<E> x() {
        return c0.h();
    }

    static <T extends AbstractC2077x<?, ?>> T y(Class<T> cls) throws ClassNotFoundException {
        AbstractC2077x<?, ?> abstractC2077x = defaultInstanceMap.get(cls);
        if (abstractC2077x == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC2077x = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e10) {
                throw new IllegalStateException("Class initialization cannot fail.", e10);
            }
        }
        if (abstractC2077x == null) {
            abstractC2077x = (T) ((AbstractC2077x) p0.i(cls)).c();
            if (abstractC2077x == null) {
                throw new IllegalStateException();
            }
            defaultInstanceMap.put(cls, abstractC2077x);
        }
        return (T) abstractC2077x;
    }

    protected void C() {
        b0.a().e(this).b(this);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: E, reason: merged with bridge method [inline-methods] */
    public final BuilderType g() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    @Override // androidx.datastore.preferences.protobuf.P
    /* renamed from: J, reason: merged with bridge method [inline-methods] */
    public final BuilderType d() {
        BuilderType buildertype = (BuilderType) u(f.NEW_BUILDER);
        buildertype.w(this);
        return buildertype;
    }

    @Override // androidx.datastore.preferences.protobuf.Q
    public final boolean b() {
        return B(this, true);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (c().getClass().isInstance(obj)) {
            return b0.a().e(this).d(this, (AbstractC2077x) obj);
        }
        return false;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public int f() {
        if (this.memoizedSerializedSize == -1) {
            this.memoizedSerializedSize = b0.a().e(this).e(this);
        }
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public final Y<MessageType> h() {
        return (Y) u(f.GET_PARSER);
    }

    public int hashCode() {
        int i10 = this.memoizedHashCode;
        if (i10 != 0) {
            return i10;
        }
        int iG = b0.a().e(this).g(this);
        this.memoizedHashCode = iG;
        return iG;
    }

    @Override // androidx.datastore.preferences.protobuf.P
    public void k(CodedOutputStream codedOutputStream) {
        b0.a().e(this).i(this, C2065k.P(codedOutputStream));
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2055a
    int l() {
        return this.memoizedSerializedSize;
    }

    @Override // androidx.datastore.preferences.protobuf.AbstractC2055a
    void p(int i10) {
        this.memoizedSerializedSize = i10;
    }

    Object r() {
        return u(f.BUILD_MESSAGE_INFO);
    }

    protected final <MessageType extends AbstractC2077x<MessageType, BuilderType>, BuilderType extends a<MessageType, BuilderType>> BuilderType t() {
        return (BuilderType) u(f.NEW_BUILDER);
    }

    public String toString() {
        return S.e(this, super.toString());
    }

    protected Object u(f fVar) {
        return w(fVar, null, null);
    }

    protected Object v(f fVar, Object obj) {
        return w(fVar, obj, null);
    }

    protected abstract Object w(f fVar, Object obj, Object obj2);

    @Override // androidx.datastore.preferences.protobuf.Q
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public final MessageType c() {
        return (MessageType) u(f.GET_DEFAULT_INSTANCE);
    }
}
