package P9;

import com.google.gson.internal.b;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Objects;

/* compiled from: TypeToken.java */
/* loaded from: classes2.dex */
public class a<T> {

    /* renamed from: a, reason: collision with root package name */
    private final Class<? super T> f14135a;

    /* renamed from: b, reason: collision with root package name */
    private final Type f14136b;

    /* renamed from: c, reason: collision with root package name */
    private final int f14137c;

    protected a() {
        Type typeE = e();
        this.f14136b = typeE;
        this.f14135a = (Class<? super T>) b.k(typeE);
        this.f14137c = typeE.hashCode();
    }

    public static <T> a<T> a(Class<T> cls) {
        return new a<>(cls);
    }

    public static a<?> b(Type type) {
        return new a<>(type);
    }

    private Type e() {
        Type genericSuperclass = getClass().getGenericSuperclass();
        if (genericSuperclass instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) genericSuperclass;
            if (parameterizedType.getRawType() == a.class) {
                return b.b(parameterizedType.getActualTypeArguments()[0]);
            }
        } else if (genericSuperclass == a.class) {
            throw new IllegalStateException("TypeToken must be created with a type argument: new TypeToken<...>() {}; When using code shrinkers (ProGuard, R8, ...) make sure that generic signatures are preserved.");
        }
        throw new IllegalStateException("Must only create direct subclasses of TypeToken");
    }

    public final Class<? super T> c() {
        return this.f14135a;
    }

    public final Type d() {
        return this.f14136b;
    }

    public final boolean equals(Object obj) {
        return (obj instanceof a) && b.f(this.f14136b, ((a) obj).f14136b);
    }

    public final int hashCode() {
        return this.f14137c;
    }

    public final String toString() {
        return b.t(this.f14136b);
    }

    private a(Type type) {
        Objects.requireNonNull(type);
        Type typeB = b.b(type);
        this.f14136b = typeB;
        this.f14135a = (Class<? super T>) b.k(typeB);
        this.f14137c = typeB.hashCode();
    }
}
