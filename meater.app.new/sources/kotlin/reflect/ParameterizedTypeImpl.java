package kotlin.reflect;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10803n;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9795j;
import kotlin.jvm.internal.C9801m;
import okhttp3.HttpUrl;

/* compiled from: TypesJVM.kt */
@Metadata(m32266d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B)\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\b¢\u0006\u0002\u0010\tJ\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\u0013\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00060\nH\u0016¢\u0006\u0002\u0010\u0011J\n\u0010\u0012\u001a\u0004\u0018\u00010\u0006H\u0016J\b\u0010\u0013\u001a\u00020\u0006H\u0016J\b\u0010\u0014\u001a\u00020\u0015H\u0016J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0015H\u0016R\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\nX\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u000b¨\u0006\u0019"}, m32267d2 = {"Lkotlin/reflect/ParameterizedTypeImpl;", "Ljava/lang/reflect/ParameterizedType;", "Lkotlin/reflect/TypeImpl;", "rawType", "Ljava/lang/Class;", "ownerType", "Ljava/lang/reflect/Type;", "typeArguments", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/Class;Ljava/lang/reflect/Type;Ljava/util/List;)V", HttpUrl.FRAGMENT_ENCODE_SET, "[Ljava/lang/reflect/Type;", "equals", HttpUrl.FRAGMENT_ENCODE_SET, "other", HttpUrl.FRAGMENT_ENCODE_SET, "getActualTypeArguments", "()[Ljava/lang/reflect/Type;", "getOwnerType", "getRawType", "getTypeName", HttpUrl.FRAGMENT_ENCODE_SET, "hashCode", HttpUrl.FRAGMENT_ENCODE_SET, "toString", "kotlin-stdlib"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.u, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
final class ParameterizedTypeImpl implements ParameterizedType, Type {

    /* renamed from: f */
    private final Class<?> f37254f;

    /* renamed from: g */
    private final Type f37255g;

    /* renamed from: h */
    private final Type[] f37256h;

    /* compiled from: TypesJVM.kt */
    @Metadata(m32268k = 3, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.u$a */
    /* synthetic */ class a extends C9795j implements Function1<Type, String> {

        /* renamed from: h */
        public static final a f37257h = new a();

        a() {
            super(1, C9872w.class, "typeToString", "typeToString(Ljava/lang/reflect/Type;)Ljava/lang/String;", 1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: u, reason: merged with bridge method [inline-methods] */
        public final String invoke(Type type) {
            C9801m.m32346f(type, "p0");
            return C9872w.m32458h(type);
        }
    }

    public ParameterizedTypeImpl(Class<?> cls, Type type, List<? extends Type> list) {
        C9801m.m32346f(cls, "rawType");
        C9801m.m32346f(list, "typeArguments");
        this.f37254f = cls;
        this.f37255g = type;
        Object[] array = list.toArray(new Type[0]);
        C9801m.m32344d(array, "null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
        this.f37256h = (Type[]) array;
    }

    public boolean equals(Object other) {
        if (other instanceof ParameterizedType) {
            ParameterizedType parameterizedType = (ParameterizedType) other;
            if (C9801m.m32341a(this.f37254f, parameterizedType.getRawType()) && C9801m.m32341a(this.f37255g, parameterizedType.getOwnerType()) && Arrays.equals(getActualTypeArguments(), parameterizedType.getActualTypeArguments())) {
                return true;
            }
        }
        return false;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type[] getActualTypeArguments() {
        return this.f37256h;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getOwnerType() {
        return this.f37255g;
    }

    @Override // java.lang.reflect.ParameterizedType
    public Type getRawType() {
        return this.f37254f;
    }

    @Override // java.lang.reflect.Type
    public String getTypeName() {
        StringBuilder sb = new StringBuilder();
        Type type = this.f37255g;
        if (type != null) {
            sb.append(C9872w.m32458h(type));
            sb.append("$");
            sb.append(this.f37254f.getSimpleName());
        } else {
            sb.append(C9872w.m32458h(this.f37254f));
        }
        Type[] typeArr = this.f37256h;
        if (!(typeArr.length == 0)) {
            C10803n.m38727G(typeArr, sb, null, "<", ">", 0, null, a.f37257h, 50, null);
        }
        String string = sb.toString();
        C9801m.m32345e(string, "StringBuilder().apply(builderAction).toString()");
        return string;
    }

    public int hashCode() {
        int iHashCode = this.f37254f.hashCode();
        Type type = this.f37255g;
        return (iHashCode ^ (type != null ? type.hashCode() : 0)) ^ Arrays.hashCode(getActualTypeArguments());
    }

    public String toString() {
        return getTypeName();
    }
}
