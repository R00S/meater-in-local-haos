package kotlin.reflect.p371y.internal.p374j0.p375b.p377q;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C10817u;
import kotlin.collections.C10824x0;
import kotlin.collections.C10827z;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.p371y.internal.p374j0.p375b.C9917k;
import kotlin.reflect.p371y.internal.p374j0.p380d.p390b.C10108x;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10159b;
import kotlin.reflect.p371y.internal.p374j0.p397f.C10161d;
import kotlin.reflect.p371y.internal.p374j0.p400i.p406u.EnumC10240e;

/* compiled from: JvmBuiltInsSignatures.kt */
/* renamed from: kotlin.f0.y.e.j0.b.q.i */
/* loaded from: classes2.dex */
public final class C9935i {

    /* renamed from: a */
    public static final C9935i f37742a;

    /* renamed from: b */
    private static final Set<String> f37743b;

    /* renamed from: c */
    private static final Set<String> f37744c;

    /* renamed from: d */
    private static final Set<String> f37745d;

    /* renamed from: e */
    private static final Set<String> f37746e;

    /* renamed from: f */
    private static final Set<String> f37747f;

    /* renamed from: g */
    private static final Set<String> f37748g;

    static {
        C9935i c9935i = new C9935i();
        f37742a = c9935i;
        C10108x c10108x = C10108x.f38488a;
        f37743b = C10824x0.m38926m(c10108x.m34050f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f37744c = C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(c9935i.m33003b(), c10108x.m34050f("List", "sort(Ljava/util/Comparator;)V")), c10108x.m34049e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c10108x.m34049e("Double", "isInfinite()Z", "isNaN()Z")), c10108x.m34049e("Float", "isInfinite()Z", "isNaN()Z")), c10108x.m34049e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c10108x.m34049e("CharSequence", "isEmpty()Z"));
        f37745d = C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(C10824x0.m38925l(c10108x.m34049e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c10108x.m34050f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c10108x.m34049e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c10108x.m34049e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c10108x.m34050f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c10108x.m34050f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V")), c10108x.m34050f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f37746e = C10824x0.m38925l(C10824x0.m38925l(c10108x.m34050f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c10108x.m34050f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V")), c10108x.m34050f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setM33002a = c9935i.m33002a();
        String[] strArrM34047b = c10108x.m34047b("D");
        Set setM38925l = C10824x0.m38925l(setM33002a, c10108x.m34049e("Float", (String[]) Arrays.copyOf(strArrM34047b, strArrM34047b.length)));
        String[] strArrM34047b2 = c10108x.m34047b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f37747f = C10824x0.m38925l(setM38925l, c10108x.m34049e("String", (String[]) Arrays.copyOf(strArrM34047b2, strArrM34047b2.length)));
        String[] strArrM34047b3 = c10108x.m34047b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f37748g = c10108x.m34049e("Throwable", (String[]) Arrays.copyOf(strArrM34047b3, strArrM34047b3.length));
    }

    private C9935i() {
    }

    /* renamed from: a */
    private final Set<String> m33002a() {
        C10108x c10108x = C10108x.f38488a;
        EnumC10240e enumC10240e = EnumC10240e.BYTE;
        List listM38891m = C10817u.m38891m(EnumC10240e.BOOLEAN, enumC10240e, EnumC10240e.DOUBLE, EnumC10240e.FLOAT, enumC10240e, EnumC10240e.INT, EnumC10240e.LONG, EnumC10240e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listM38891m.iterator();
        while (it.hasNext()) {
            String strM35455k = ((EnumC10240e) it.next()).m36119y().m35425g().m35455k();
            C9801m.m32345e(strM35455k, "it.wrapperFqName.shortName().asString()");
            String[] strArrM34047b = c10108x.m34047b("Ljava/lang/String;");
            C10827z.m38933z(linkedHashSet, c10108x.m34049e(strM35455k, (String[]) Arrays.copyOf(strArrM34047b, strArrM34047b.length)));
        }
        return linkedHashSet;
    }

    /* renamed from: b */
    private final Set<String> m33003b() {
        C10108x c10108x = C10108x.f38488a;
        List<EnumC10240e> listM38891m = C10817u.m38891m(EnumC10240e.BOOLEAN, EnumC10240e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC10240e enumC10240e : listM38891m) {
            String strM35455k = enumC10240e.m36119y().m35425g().m35455k();
            C9801m.m32345e(strM35455k, "it.wrapperFqName.shortName().asString()");
            C10827z.m38933z(linkedHashSet, c10108x.m34049e(strM35455k, enumC10240e.m36117v() + "Value()" + enumC10240e.m36116u()));
        }
        return linkedHashSet;
    }

    /* renamed from: c */
    public final Set<String> m33004c() {
        return f37743b;
    }

    /* renamed from: d */
    public final Set<String> m33005d() {
        return f37747f;
    }

    /* renamed from: e */
    public final Set<String> m33006e() {
        return f37744c;
    }

    /* renamed from: f */
    public final Set<String> m33007f() {
        return f37746e;
    }

    /* renamed from: g */
    public final Set<String> m33008g() {
        return f37748g;
    }

    /* renamed from: h */
    public final Set<String> m33009h() {
        return f37745d;
    }

    /* renamed from: i */
    public final boolean m33010i(C10161d c10161d) {
        C9801m.m32346f(c10161d, "fqName");
        return C9801m.m32341a(c10161d, C9917k.a.f37576i) || C9917k.m32830e(c10161d);
    }

    /* renamed from: j */
    public final boolean m33011j(C10161d c10161d) {
        C9801m.m32346f(c10161d, "fqName");
        if (m33010i(c10161d)) {
            return true;
        }
        C10159b c10159bM32929n = C9929c.f37667a.m32929n(c10161d);
        if (c10159bM32929n == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(c10159bM32929n.m35409b().m35420b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
