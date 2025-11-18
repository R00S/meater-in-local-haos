package kotlin.reflect.p371y.internal.calls;

import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C10782c0;
import kotlin.collections.C10810q0;
import kotlin.collections.C10819v;
import kotlin.jvm.internal.C9789g;
import kotlin.jvm.internal.C9801m;
import kotlin.reflect.jvm.internal.impl.descriptors.p434r1.p436b.C10703d;
import kotlin.reflect.p371y.internal.calls.Caller;
import okhttp3.HttpUrl;

/* compiled from: AnnotationConstructorCaller.kt */
@Metadata(m32266d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0011\n\u0002\b\u0004\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001:\u0002 !B?\u0012\n\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006¢\u0006\u0002\u0010\u000eJ\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00102\n\u0010\u001d\u001a\u0006\u0012\u0002\b\u00030\u001eH\u0016¢\u0006\u0002\u0010\u001fR\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0011\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\u0003\u001a\u0006\u0012\u0002\b\u00030\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\u0012\u001a\u0004\u0018\u00010\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014R\u0014\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00160\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\u00168VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller;", "Lkotlin/reflect/jvm/internal/calls/Caller;", HttpUrl.FRAGMENT_ENCODE_SET, "jClass", "Ljava/lang/Class;", "parameterNames", HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET, "callMode", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", "origin", "Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", "methods", "Ljava/lang/reflect/Method;", "(Ljava/lang/Class;Ljava/util/List;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;Ljava/util/List;)V", "defaultValues", HttpUrl.FRAGMENT_ENCODE_SET, "erasedParameterTypes", "member", "getMember", "()Ljava/lang/Void;", "parameterTypes", "Ljava/lang/reflect/Type;", "getParameterTypes", "()Ljava/util/List;", "returnType", "getReturnType", "()Ljava/lang/reflect/Type;", "call", "args", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/Object;)Ljava/lang/Object;", "CallMode", "Origin", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
/* renamed from: kotlin.f0.y.e.i0.a, reason: from Kotlin metadata */
/* loaded from: classes2.dex */
public final class AnnotationConstructorCaller implements Caller {

    /* renamed from: a */
    private final Class<?> f37385a;

    /* renamed from: b */
    private final List<String> f37386b;

    /* renamed from: c */
    private final a f37387c;

    /* renamed from: d */
    private final List<Method> f37388d;

    /* renamed from: e */
    private final List<Type> f37389e;

    /* renamed from: f */
    private final List<Class<?>> f37390f;

    /* renamed from: g */
    private final List<Object> f37391g;

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$CallMode;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "CALL_BY_NAME", "POSITIONAL_CALL", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.a$a */
    public enum a {
        CALL_BY_NAME,
        POSITIONAL_CALL
    }

    /* compiled from: AnnotationConstructorCaller.kt */
    @Metadata(m32266d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, m32267d2 = {"Lkotlin/reflect/jvm/internal/calls/AnnotationConstructorCaller$Origin;", HttpUrl.FRAGMENT_ENCODE_SET, "(Ljava/lang/String;I)V", "JAVA", "KOTLIN", "kotlin-reflection"}, m32268k = 1, m32269mv = {1, 7, 1}, m32271xi = 48)
    /* renamed from: kotlin.f0.y.e.i0.a$b */
    public enum b {
        JAVA,
        KOTLIN
    }

    public AnnotationConstructorCaller(Class<?> cls, List<String> list, a aVar, b bVar, List<Method> list2) {
        C9801m.m32346f(cls, "jClass");
        C9801m.m32346f(list, "parameterNames");
        C9801m.m32346f(aVar, "callMode");
        C9801m.m32346f(bVar, "origin");
        C9801m.m32346f(list2, "methods");
        this.f37385a = cls;
        this.f37386b = list;
        this.f37387c = aVar;
        this.f37388d = list2;
        ArrayList arrayList = new ArrayList(C10819v.m38911u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(((Method) it.next()).getGenericReturnType());
        }
        this.f37389e = arrayList;
        List<Method> list3 = this.f37388d;
        ArrayList arrayList2 = new ArrayList(C10819v.m38911u(list3, 10));
        Iterator<T> it2 = list3.iterator();
        while (it2.hasNext()) {
            Class<?> returnType = ((Method) it2.next()).getReturnType();
            C9801m.m32345e(returnType, "it");
            Class<?> clsM38074f = C10703d.m38074f(returnType);
            if (clsM38074f != null) {
                returnType = clsM38074f;
            }
            arrayList2.add(returnType);
        }
        this.f37390f = arrayList2;
        List<Method> list4 = this.f37388d;
        ArrayList arrayList3 = new ArrayList(C10819v.m38911u(list4, 10));
        Iterator<T> it3 = list4.iterator();
        while (it3.hasNext()) {
            arrayList3.add(((Method) it3.next()).getDefaultValue());
        }
        this.f37391g = arrayList3;
        if (this.f37387c == a.POSITIONAL_CALL && bVar == b.JAVA && (!C10782c0.m38606l0(this.f37386b, "value").isEmpty())) {
            throw new UnsupportedOperationException("Positional call of a Java annotation constructor is allowed only if there are no parameters or one parameter named \"value\". This restriction exists because Java annotations (in contrast to Kotlin)do not impose any order on their arguments. Use KCallable#callBy instead.");
        }
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: a */
    public List<Type> mo32637a() {
        return this.f37389e;
    }

    /* renamed from: b */
    public void m32638b(Object[] objArr) {
        Caller.a.m32656a(this, objArr);
    }

    /* renamed from: c */
    public Void m32639c() {
        return null;
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public Object call(Object[] args) {
        C9801m.m32346f(args, "args");
        m32638b(args);
        ArrayList arrayList = new ArrayList(args.length);
        int length = args.length;
        int i2 = 0;
        int i3 = 0;
        while (i2 < length) {
            Object obj = args[i2];
            int i4 = i3 + 1;
            Object objM32653l = (obj == null && this.f37387c == a.CALL_BY_NAME) ? this.f37391g.get(i3) : C9896b.m32653l(obj, this.f37390f.get(i3));
            if (objM32653l == null) {
                C9896b.m32652k(i3, this.f37386b.get(i3), this.f37390f.get(i3));
                throw null;
            }
            arrayList.add(objM32653l);
            i2++;
            i3 = i4;
        }
        return C9896b.m32647f(this.f37385a, C10810q0.m38805q(C10782c0.m38580L0(this.f37386b, arrayList)), this.f37388d);
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    public /* bridge */ /* synthetic */ Member getMember() {
        return (Member) m32639c();
    }

    @Override // kotlin.reflect.p371y.internal.calls.Caller
    /* renamed from: getReturnType */
    public Type getF37428c() {
        return this.f37385a;
    }

    public /* synthetic */ AnnotationConstructorCaller(Class cls, List list, a aVar, b bVar, List list2, int i2, C9789g c9789g) {
        if ((i2 & 16) != 0) {
            list2 = new ArrayList(C10819v.m38911u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                list2.add(cls.getDeclaredMethod((String) it.next(), new Class[0]));
            }
        }
        this(cls, list, aVar, bVar, list2);
    }
}
