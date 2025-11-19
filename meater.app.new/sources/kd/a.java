package kd;

import Ia.d;
import Ub.n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C1802b;
import kotlin.InterfaceC1803c;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;
import oa.EnumC4168m;

/* compiled from: KoinPlatformTools.kt */
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0006\u001a\u00020\u00072\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0006\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\u000b\u0010\fJ\u001b\u0010\r\u001a\u0004\u0018\u00010\u00072\n\u0010\n\u001a\u0006\u0012\u0002\b\u00030\t¢\u0006\u0004\b\r\u0010\fJ\r\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013J-\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u00142\n\u0010\u0016\u001a\u00060\u0001j\u0002`\u00152\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017¢\u0006\u0004\b\u0019\u0010\u001aJ%\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001d\"\u0004\b\u0000\u0010\u001b\"\u0004\b\u0001\u0010\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\u0019\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 \"\u0004\b\u0000\u0010\u001b¢\u0006\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lkd/a;", "", "<init>", "()V", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "", "(Ljava/lang/Exception;)Ljava/lang/String;", "LIa/d;", "kClass", "d", "(LIa/d;)Ljava/lang/String;", "c", "Loa/m;", "b", "()Loa/m;", "LWc/c;", "a", "()LWc/c;", "R", "Lorg/koin/mp/Lockable;", "lock", "Lkotlin/Function0;", "block", "h", "(Ljava/lang/Object;LBa/a;)Ljava/lang/Object;", "K", "V", "", "f", "()Ljava/util/Map;", "", "g", "()Ljava/util/Set;", "koin-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f43922a = new a();

    private a() {
    }

    public final InterfaceC1803c a() {
        return C1802b.f18502a;
    }

    public final EnumC4168m b() {
        return EnumC4168m.f46626B;
    }

    public final String c(d<?> kClass) {
        C3862t.g(kClass, "kClass");
        return kClass.q();
    }

    public final String d(d<?> kClass) {
        C3862t.g(kClass, "kClass");
        String name = Aa.a.b(kClass).getName();
        C3862t.f(name, "getName(...)");
        return name;
    }

    public final String e(Exception e10) {
        C3862t.g(e10, "e");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e10);
        sb2.append("\n\t");
        StackTraceElement[] stackTrace = e10.getStackTrace();
        C3862t.f(stackTrace, "getStackTrace(...)");
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement stackTraceElement : stackTrace) {
            String className = stackTraceElement.getClassName();
            C3862t.f(className, "getClassName(...)");
            if (n.L(className, "sun.reflect", false, 2, null)) {
                break;
            }
            arrayList.add(stackTraceElement);
        }
        sb2.append(r.s0(arrayList, "\n\t", null, null, 0, null, null, 62, null));
        return sb2.toString();
    }

    public final <K, V> Map<K, V> f() {
        return new ConcurrentHashMap();
    }

    public final <K> Set<K> g() {
        Set<K> setNewSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
        C3862t.f(setNewSetFromMap, "newSetFromMap(...)");
        return setNewSetFromMap;
    }

    public final <R> R h(Object lock, Ba.a<? extends R> block) {
        R rInvoke;
        C3862t.g(lock, "lock");
        C3862t.g(block, "block");
        synchronized (lock) {
            rInvoke = block.invoke();
        }
        return rInvoke;
    }
}
