package Qa;

import Oa.p;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import jb.C3762F;
import kotlin.collections.V;
import kotlin.jvm.internal.C3862t;
import yb.EnumC5149e;

/* compiled from: JvmBuiltInsSignatures.kt */
/* loaded from: classes3.dex */
public final class x {

    /* renamed from: a, reason: collision with root package name */
    public static final x f14658a;

    /* renamed from: b, reason: collision with root package name */
    private static final Set<String> f14659b;

    /* renamed from: c, reason: collision with root package name */
    private static final Set<String> f14660c;

    /* renamed from: d, reason: collision with root package name */
    private static final Set<String> f14661d;

    /* renamed from: e, reason: collision with root package name */
    private static final Set<String> f14662e;

    /* renamed from: f, reason: collision with root package name */
    private static final Set<String> f14663f;

    /* renamed from: g, reason: collision with root package name */
    private static final Set<String> f14664g;

    /* renamed from: h, reason: collision with root package name */
    private static final Set<String> f14665h;

    static {
        x xVar = new x();
        f14658a = xVar;
        C3762F c3762f = C3762F.f43573a;
        f14659b = V.k(c3762f.f("Collection", "toArray()[Ljava/lang/Object;", "toArray([Ljava/lang/Object;)[Ljava/lang/Object;"), "java/lang/annotation/Annotation.annotationType()Ljava/lang/Class;");
        f14660c = V.j(V.j(V.j(V.j(V.j(V.j(xVar.b(), c3762f.f("List", "sort(Ljava/util/Comparator;)V", "reversed()Ljava/util/List;")), c3762f.e("String", "codePointAt(I)I", "codePointBefore(I)I", "codePointCount(II)I", "compareToIgnoreCase(Ljava/lang/String;)I", "concat(Ljava/lang/String;)Ljava/lang/String;", "contains(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/CharSequence;)Z", "contentEquals(Ljava/lang/StringBuffer;)Z", "endsWith(Ljava/lang/String;)Z", "equalsIgnoreCase(Ljava/lang/String;)Z", "getBytes()[B", "getBytes(II[BI)V", "getBytes(Ljava/lang/String;)[B", "getBytes(Ljava/nio/charset/Charset;)[B", "getChars(II[CI)V", "indexOf(I)I", "indexOf(II)I", "indexOf(Ljava/lang/String;)I", "indexOf(Ljava/lang/String;I)I", "intern()Ljava/lang/String;", "isEmpty()Z", "lastIndexOf(I)I", "lastIndexOf(II)I", "lastIndexOf(Ljava/lang/String;)I", "lastIndexOf(Ljava/lang/String;I)I", "matches(Ljava/lang/String;)Z", "offsetByCodePoints(II)I", "regionMatches(ILjava/lang/String;II)Z", "regionMatches(ZILjava/lang/String;II)Z", "replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(CC)Ljava/lang/String;", "replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;", "replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;", "split(Ljava/lang/String;I)[Ljava/lang/String;", "split(Ljava/lang/String;)[Ljava/lang/String;", "startsWith(Ljava/lang/String;I)Z", "startsWith(Ljava/lang/String;)Z", "substring(II)Ljava/lang/String;", "substring(I)Ljava/lang/String;", "toCharArray()[C", "toLowerCase()Ljava/lang/String;", "toLowerCase(Ljava/util/Locale;)Ljava/lang/String;", "toUpperCase()Ljava/lang/String;", "toUpperCase(Ljava/util/Locale;)Ljava/lang/String;", "trim()Ljava/lang/String;", "isBlank()Z", "lines()Ljava/util/stream/Stream;", "repeat(I)Ljava/lang/String;")), c3762f.e("Double", "isInfinite()Z", "isNaN()Z")), c3762f.e("Float", "isInfinite()Z", "isNaN()Z")), c3762f.e("Enum", "getDeclaringClass()Ljava/lang/Class;", "finalize()V")), c3762f.e("CharSequence", "isEmpty()Z"));
        f14661d = c3762f.f("List", "getFirst()Ljava/lang/Object;", "getLast()Ljava/lang/Object;");
        f14662e = V.j(V.j(V.j(V.j(V.j(V.j(c3762f.e("CharSequence", "codePoints()Ljava/util/stream/IntStream;", "chars()Ljava/util/stream/IntStream;"), c3762f.f("Iterator", "forEachRemaining(Ljava/util/function/Consumer;)V")), c3762f.e("Iterable", "forEach(Ljava/util/function/Consumer;)V", "spliterator()Ljava/util/Spliterator;")), c3762f.e("Throwable", "setStackTrace([Ljava/lang/StackTraceElement;)V", "fillInStackTrace()Ljava/lang/Throwable;", "getLocalizedMessage()Ljava/lang/String;", "printStackTrace()V", "printStackTrace(Ljava/io/PrintStream;)V", "printStackTrace(Ljava/io/PrintWriter;)V", "getStackTrace()[Ljava/lang/StackTraceElement;", "initCause(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "getSuppressed()[Ljava/lang/Throwable;", "addSuppressed(Ljava/lang/Throwable;)V")), c3762f.f("Collection", "spliterator()Ljava/util/Spliterator;", "parallelStream()Ljava/util/stream/Stream;", "stream()Ljava/util/stream/Stream;", "removeIf(Ljava/util/function/Predicate;)Z")), c3762f.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c3762f.f("Map", "getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "forEach(Ljava/util/function/BiConsumer;)V", "replaceAll(Ljava/util/function/BiFunction;)V", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;"));
        f14663f = V.j(V.j(c3762f.f("Collection", "removeIf(Ljava/util/function/Predicate;)Z"), c3762f.f("List", "replaceAll(Ljava/util/function/UnaryOperator;)V", "sort(Ljava/util/Comparator;)V", "addFirst(Ljava/lang/Object;)V", "addLast(Ljava/lang/Object;)V", "removeFirst()Ljava/lang/Object;", "removeLast()Ljava/lang/Object;")), c3762f.f("Map", "computeIfAbsent(Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;", "computeIfPresent(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "compute(Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "merge(Ljava/lang/Object;Ljava/lang/Object;Ljava/util/function/BiFunction;)Ljava/lang/Object;", "putIfAbsent(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "remove(Ljava/lang/Object;Ljava/lang/Object;)Z", "replaceAll(Ljava/util/function/BiFunction;)V", "replace(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "replace(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Z"));
        Set<String> setA = xVar.a();
        String[] strArrB = c3762f.b("D");
        Set setJ = V.j(setA, c3762f.e("Float", (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        String[] strArrB2 = c3762f.b("[C", "[CII", "[III", "[BIILjava/lang/String;", "[BIILjava/nio/charset/Charset;", "[BLjava/lang/String;", "[BLjava/nio/charset/Charset;", "[BII", "[B", "Ljava/lang/StringBuffer;", "Ljava/lang/StringBuilder;");
        f14664g = V.j(setJ, c3762f.e("String", (String[]) Arrays.copyOf(strArrB2, strArrB2.length)));
        String[] strArrB3 = c3762f.b("Ljava/lang/String;Ljava/lang/Throwable;ZZ");
        f14665h = c3762f.e("Throwable", (String[]) Arrays.copyOf(strArrB3, strArrB3.length));
    }

    private x() {
    }

    private final Set<String> a() {
        C3762F c3762f = C3762F.f43573a;
        EnumC5149e enumC5149e = EnumC5149e.BOOLEAN;
        EnumC5149e enumC5149e2 = EnumC5149e.BYTE;
        List listP = kotlin.collections.r.p(enumC5149e, enumC5149e2, EnumC5149e.DOUBLE, EnumC5149e.FLOAT, enumC5149e2, EnumC5149e.INT, EnumC5149e.LONG, EnumC5149e.SHORT);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = listP.iterator();
        while (it.hasNext()) {
            String strJ = ((EnumC5149e) it.next()).u().g().j();
            C3862t.f(strJ, "asString(...)");
            String[] strArrB = c3762f.b("Ljava/lang/String;");
            kotlin.collections.r.D(linkedHashSet, c3762f.e(strJ, (String[]) Arrays.copyOf(strArrB, strArrB.length)));
        }
        return linkedHashSet;
    }

    private final Set<String> b() {
        C3762F c3762f = C3762F.f43573a;
        List<EnumC5149e> listP = kotlin.collections.r.p(EnumC5149e.BOOLEAN, EnumC5149e.CHAR);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (EnumC5149e enumC5149e : listP) {
            String strJ = enumC5149e.u().g().j();
            C3862t.f(strJ, "asString(...)");
            kotlin.collections.r.D(linkedHashSet, c3762f.e(strJ, enumC5149e.s() + "Value()" + enumC5149e.p()));
        }
        return linkedHashSet;
    }

    public final Set<String> c() {
        return f14661d;
    }

    public final Set<String> d() {
        return f14659b;
    }

    public final Set<String> e() {
        return f14664g;
    }

    public final Set<String> f() {
        return f14660c;
    }

    public final Set<String> g() {
        return f14663f;
    }

    public final Set<String> h() {
        return f14665h;
    }

    public final Set<String> i() {
        return f14662e;
    }

    public final boolean j(qb.d fqName) {
        C3862t.g(fqName, "fqName");
        return C3862t.b(fqName, p.a.f13457i) || Oa.p.e(fqName);
    }

    public final boolean k(qb.d fqName) {
        C3862t.g(fqName, "fqName");
        if (j(fqName)) {
            return true;
        }
        qb.b bVarN = c.f14576a.n(fqName);
        if (bVarN == null) {
            return false;
        }
        try {
            return Serializable.class.isAssignableFrom(Class.forName(bVarN.a().b()));
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }
}
