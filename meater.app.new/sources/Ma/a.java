package Ma;

import Ma.h;
import Xa.C1822f;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.collections.r;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0000\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\r\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002\u0015\u0017BA\u0012\n\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0005¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\u0010\u0011\u001a\u0006\u0012\u0002\b\u00030\u0010H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0018R \u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001d\u0010\u0018\u001a\u0004\b\u0015\u0010\u001eR\u001e\u0010!\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00030\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018R\u001c\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00120\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0018R\u0016\u0010%\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001b\u0010$R\u0014\u0010(\u001a\u00020\u001c8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b&\u0010'¨\u0006)"}, d2 = {"LMa/a;", "LMa/h;", "", "Ljava/lang/Class;", "jClass", "", "", "parameterNames", "LMa/a$a;", "callMode", "LMa/a$b;", "origin", "Ljava/lang/reflect/Method;", "methods", "<init>", "(Ljava/lang/Class;Ljava/util/List;LMa/a$a;LMa/a$b;Ljava/util/List;)V", "", "args", "", "call", "([Ljava/lang/Object;)Ljava/lang/Object;", "a", "Ljava/lang/Class;", "b", "Ljava/util/List;", "c", "LMa/a$a;", "d", "Ljava/lang/reflect/Type;", "e", "()Ljava/util/List;", "parameterTypes", "f", "erasedParameterTypes", "g", "defaultValues", "()Ljava/lang/Void;", "member", "getReturnType", "()Ljava/lang/reflect/Type;", "returnType", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final Class<?> jClass;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final List<String> parameterNames;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final EnumC0189a callMode;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final List<Method> methods;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private final List<Type> parameterTypes;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private final List<Class<?>> erasedParameterTypes;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final List<Object> defaultValues;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LMa/a$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: Ma.a$a, reason: collision with other inner class name */
    public static final class EnumC0189a {

        /* renamed from: B, reason: collision with root package name */
        public static final EnumC0189a f12139B = new EnumC0189a("CALL_BY_NAME", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final EnumC0189a f12140C = new EnumC0189a("POSITIONAL_CALL", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ EnumC0189a[] f12141D;

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f12142E;

        static {
            EnumC0189a[] enumC0189aArrC = c();
            f12141D = enumC0189aArrC;
            f12142E = C4929b.a(enumC0189aArrC);
        }

        private EnumC0189a(String str, int i10) {
        }

        private static final /* synthetic */ EnumC0189a[] c() {
            return new EnumC0189a[]{f12139B, f12140C};
        }

        public static EnumC0189a valueOf(String str) {
            return (EnumC0189a) Enum.valueOf(EnumC0189a.class, str);
        }

        public static EnumC0189a[] values() {
            return (EnumC0189a[]) f12141D.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"LMa/a$b;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "kotlin-reflection"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class b {

        /* renamed from: B, reason: collision with root package name */
        public static final b f12143B = new b("JAVA", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final b f12144C = new b("KOTLIN", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ b[] f12145D;

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f12146E;

        static {
            b[] bVarArrC = c();
            f12145D = bVarArrC;
            f12146E = C4929b.a(bVarArrC);
        }

        private b(String str, int i10) {
        }

        private static final /* synthetic */ b[] c() {
            return new b[]{f12143B, f12144C};
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) f12145D.clone();
        }
    }

    public a(Class<?> jClass, List<String> parameterNames, EnumC0189a callMode, b origin, List<Method> methods) {
        C3862t.g(jClass, "jClass");
        C3862t.g(parameterNames, "parameterNames");
        C3862t.g(callMode, "callMode");
        C3862t.g(origin, "origin");
        C3862t.g(methods, "methods");
        this.jClass = jClass;
        this.parameterNames = parameterNames;
        this.callMode = callMode;
        this.methods = methods;
        List<Method> list = methods;
        ArrayList arrayList = new ArrayList(r.x(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.parameterTypes = arrayList;
        List<Method> list2 = this.methods;
        ArrayList arrayList2 = new ArrayList(r.x(list2, 10));
        Iterator<T> it2 = list2.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            C3862t.d(returnType);
            Class<?> clsK = C1822f.k(returnType);
            if (clsK != null) {
                returnType = clsK;
            }
            arrayList2.add(returnType);
        }
        this.erasedParameterTypes = arrayList2;
        List<Method> list3 = this.methods;
        ArrayList arrayList3 = new ArrayList(r.x(list3, 10));
        Iterator<T> it3 = list3.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.defaultValues = arrayList3;
        if (this.callMode == EnumC0189a.f12140C && origin == b.f12143B && !r.C0(this.parameterNames, "value").isEmpty()) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // Ma.h
    public List<Type> a() {
        return this.parameterTypes;
    }

    @Override // Ma.h
    public /* bridge */ /* synthetic */ Member b() {
        return (Member) d();
    }

    public void c(Object[] objArr) {
        h.a.a(this, objArr);
    }

    @Override // Ma.h
    public Object call(Object[] args) {
        C3862t.g(args, "args");
        c(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            Object obj = args[i10];
            int i12 = i11 + 1;
            Object objQ = (obj == null && this.callMode == EnumC0189a.f12139B) ? this.defaultValues.get(i11) : f.q(obj, this.erasedParameterTypes.get(i11));
            if (objQ == null) {
                f.p(i11, this.parameterNames.get(i11), this.erasedParameterTypes.get(i11));
                throw null;
            }
            arrayList.add(objQ);
            i10++;
            i11 = i12;
        }
        return f.g(this.jClass, M.p(r.e1(this.parameterNames, arrayList)), this.methods);
    }

    public Void d() {
        return null;
    }

    @Override // Ma.h
    public Type getReturnType() {
        return this.jClass;
    }

    public /* synthetic */ a(Class cls, List list, EnumC0189a enumC0189a, b bVar, List list2, int i10, C3854k c3854k) {
        List list3;
        if ((i10 & 16) != 0) {
            List list4 = list;
            ArrayList arrayList = new ArrayList(r.x(list4, 10));
            Iterator it = list4.iterator();
            while (it.hasNext()) {
                arrayList.add(cls.getDeclaredMethod((String) it.next(), null));
            }
            list3 = arrayList;
        } else {
            list3 = list2;
        }
        this(cls, list, enumC0189a, bVar, list3);
    }
}
