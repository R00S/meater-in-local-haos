package kotlinx.coroutines.internal;

import java.util.ArrayDeque;
import java.util.Iterator;
import kotlin.C10568o;
import kotlin.C10773s;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.p442j.internal.CoroutineStackFrame;
import kotlin.jvm.internal.C9801m;
import kotlin.text.C10546u;
import kotlinx.coroutines.CopyableThrowable;
import okhttp3.HttpUrl;

/* compiled from: StackTraceRecovery.kt */
@Metadata(m32266d1 = {"\u0000f\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\b\u001a\u0014\u0010\u0006\u001a\u00060\u0007j\u0002`\b2\u0006\u0010\t\u001a\u00020\u0001H\u0007\u001a9\u0010\n\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\r\u001a\u0002H\u000b2\u0006\u0010\u000e\u001a\u0002H\u000b2\u0010\u0010\u000f\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u0011\u001a\u001e\u0010\u0012\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00102\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002\u001a1\u0010\u0016\u001a\u00020\u00172\u0010\u0010\u0018\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0010\u0010\u000e\u001a\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u0010H\u0002¢\u0006\u0002\u0010\u001a\u001a\u0019\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\fH\u0080Hø\u0001\u0000¢\u0006\u0002\u0010\u001e\u001a+\u0010\u001f\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u00060\u0014j\u0002`\u0015H\u0002¢\u0006\u0002\u0010 \u001a\u001f\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a,\u0010!\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000b2\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030#H\u0080\b¢\u0006\u0002\u0010$\u001a!\u0010%\u001a\u0004\u0018\u0001H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\u001a \u0010&\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0080\b¢\u0006\u0002\u0010\"\u001a\u001f\u0010'\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f2\u0006\u0010\u001d\u001a\u0002H\u000bH\u0000¢\u0006\u0002\u0010\"\u001a1\u0010(\u001a\u0018\u0012\u0004\u0012\u0002H\u000b\u0012\u000e\u0012\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00190)\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010*\u001a\u001c\u0010+\u001a\u00020,*\u00060\u0007j\u0002`\b2\n\u0010-\u001a\u00060\u0007j\u0002`\bH\u0002\u001a#\u0010.\u001a\u00020/*\f\u0012\b\u0012\u00060\u0007j\u0002`\b0\u00192\u0006\u00100\u001a\u00020\u0001H\u0002¢\u0006\u0002\u00101\u001a\u0014\u00102\u001a\u00020\u0017*\u00020\f2\u0006\u0010\r\u001a\u00020\fH\u0000\u001a\u0010\u00103\u001a\u00020,*\u00060\u0007j\u0002`\bH\u0000\u001a\u001b\u00104\u001a\u0002H\u000b\"\b\b\u0000\u0010\u000b*\u00020\f*\u0002H\u000bH\u0002¢\u0006\u0002\u0010\"\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0005\u001a\n \u0003*\u0004\u0018\u00010\u00010\u0001X\u0082\u0004¢\u0006\u0002\n\u0000*\f\b\u0000\u00105\"\u00020\u00142\u00020\u0014*\f\b\u0000\u00106\"\u00020\u00072\u00020\u0007\u0082\u0002\u0004\n\u0002\b\u0019¨\u00067"}, m32267d2 = {"baseContinuationImplClass", HttpUrl.FRAGMENT_ENCODE_SET, "baseContinuationImplClassName", "kotlin.jvm.PlatformType", "stackTraceRecoveryClass", "stackTraceRecoveryClassName", "artificialFrame", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "message", "createFinalException", "E", HttpUrl.FRAGMENT_ENCODE_SET, "cause", "result", "resultStackTrace", "Ljava/util/ArrayDeque;", "(Ljava/lang/Throwable;Ljava/lang/Throwable;Ljava/util/ArrayDeque;)Ljava/lang/Throwable;", "createStackTrace", "continuation", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "mergeRecoveredTraces", HttpUrl.FRAGMENT_ENCODE_SET, "recoveredStacktrace", HttpUrl.FRAGMENT_ENCODE_SET, "([Ljava/lang/StackTraceElement;Ljava/util/ArrayDeque;)V", "recoverAndThrow", HttpUrl.FRAGMENT_ENCODE_SET, "exception", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "recoverFromStackFrame", "(Ljava/lang/Throwable;Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;)Ljava/lang/Throwable;", "recoverStackTrace", "(Ljava/lang/Throwable;)Ljava/lang/Throwable;", "Lkotlin/coroutines/Continuation;", "(Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Throwable;", "tryCopyAndVerify", "unwrap", "unwrapImpl", "causeAndStacktrace", "Lkotlin/Pair;", "(Ljava/lang/Throwable;)Lkotlin/Pair;", "elementWiseEquals", HttpUrl.FRAGMENT_ENCODE_SET, "e", "frameIndex", HttpUrl.FRAGMENT_ENCODE_SET, "methodName", "([Ljava/lang/StackTraceElement;Ljava/lang/String;)I", "initCause", "isArtificial", "sanitizeStackTrace", "CoroutineStackFrame", "StackTraceElement", "kotlinx-coroutines-core"}, m32268k = 2, m32269mv = {1, 6, 0}, m32271xi = 48)
/* renamed from: kotlinx.coroutines.internal.d0 */
/* loaded from: classes3.dex */
public final class C10976d0 {

    /* renamed from: a */
    private static final String f41771a;

    /* renamed from: b */
    private static final String f41772b;

    static {
        Object objM37650a;
        Object objM37650a2;
        try {
            Result.a aVar = Result.f40714f;
            objM37650a = Result.m37650a(Class.forName("kotlin.y.j.a.a").getCanonicalName());
        } catch (Throwable th) {
            Result.a aVar2 = Result.f40714f;
            objM37650a = Result.m37650a(C10568o.m37654a(th));
        }
        if (Result.m37651b(objM37650a) != null) {
            objM37650a = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        f41771a = (String) objM37650a;
        try {
            Result.a aVar3 = Result.f40714f;
            objM37650a2 = Result.m37650a(Class.forName("kotlinx.coroutines.internal.d0").getCanonicalName());
        } catch (Throwable th2) {
            Result.a aVar4 = Result.f40714f;
            objM37650a2 = Result.m37650a(C10568o.m37654a(th2));
        }
        if (Result.m37651b(objM37650a2) != null) {
            objM37650a2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        f41772b = (String) objM37650a2;
    }

    /* renamed from: b */
    public static final StackTraceElement m39454b(String str) {
        return new StackTraceElement("\b\b\b(" + str, "\b", "\b", -1);
    }

    /* renamed from: c */
    private static final <E extends Throwable> Pair<E, StackTraceElement[]> m39455c(E e2) {
        boolean z;
        Throwable cause = e2.getCause();
        if (cause == null || !C9801m.m32341a(cause.getClass(), e2.getClass())) {
            return C10773s.m38547a(e2, new StackTraceElement[0]);
        }
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int length = stackTrace.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                z = false;
                break;
            }
            if (m39460h(stackTrace[i2])) {
                z = true;
                break;
            }
            i2++;
        }
        return z ? C10773s.m38547a(cause, stackTrace) : C10773s.m38547a(e2, new StackTraceElement[0]);
    }

    /* renamed from: d */
    private static final <E extends Throwable> E m39456d(E e2, E e3, ArrayDeque<StackTraceElement> arrayDeque) {
        arrayDeque.addFirst(m39454b("Coroutine boundary"));
        StackTraceElement[] stackTrace = e2.getStackTrace();
        int iM39459g = m39459g(stackTrace, f41771a);
        int i2 = 0;
        if (iM39459g == -1) {
            Object[] array = arrayDeque.toArray(new StackTraceElement[0]);
            if (array == null) {
                throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T of kotlin.collections.ArraysKt__ArraysJVMKt.toTypedArray>");
            }
            e3.setStackTrace((StackTraceElement[]) array);
            return e3;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[arrayDeque.size() + iM39459g];
        for (int i3 = 0; i3 < iM39459g; i3++) {
            stackTraceElementArr[i3] = stackTrace[i3];
        }
        Iterator<StackTraceElement> it = arrayDeque.iterator();
        while (it.hasNext()) {
            int i4 = i2 + 1;
            stackTraceElementArr[i2 + iM39459g] = it.next();
            i2 = i4;
        }
        e3.setStackTrace(stackTraceElementArr);
        return e3;
    }

    /* renamed from: e */
    private static final ArrayDeque<StackTraceElement> m39457e(CoroutineStackFrame coroutineStackFrame) {
        ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<>();
        StackTraceElement stackTraceElement = coroutineStackFrame.getStackTraceElement();
        if (stackTraceElement != null) {
            arrayDeque.add(stackTraceElement);
        }
        while (coroutineStackFrame != null) {
            coroutineStackFrame = coroutineStackFrame.getCallerFrame();
            if (coroutineStackFrame == null) {
                break;
            }
            StackTraceElement stackTraceElement2 = coroutineStackFrame.getStackTraceElement();
            if (stackTraceElement2 != null) {
                arrayDeque.add(stackTraceElement2);
            }
        }
        return arrayDeque;
    }

    /* renamed from: f */
    private static final boolean m39458f(StackTraceElement stackTraceElement, StackTraceElement stackTraceElement2) {
        return stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && C9801m.m32341a(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && C9801m.m32341a(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && C9801m.m32341a(stackTraceElement.getClassName(), stackTraceElement2.getClassName());
    }

    /* renamed from: g */
    private static final int m39459g(StackTraceElement[] stackTraceElementArr, String str) {
        int length = stackTraceElementArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (C9801m.m32341a(str, stackTraceElementArr[i2].getClassName())) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static final boolean m39460h(StackTraceElement stackTraceElement) {
        return C10546u.m37511E(stackTraceElement.getClassName(), "\b\b\b", false, 2, null);
    }

    /* renamed from: i */
    private static final void m39461i(StackTraceElement[] stackTraceElementArr, ArrayDeque<StackTraceElement> arrayDeque) {
        int length = stackTraceElementArr.length;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                i2 = -1;
                break;
            } else if (m39460h(stackTraceElementArr[i2])) {
                break;
            } else {
                i2++;
            }
        }
        int i3 = i2 + 1;
        int length2 = stackTraceElementArr.length - 1;
        if (i3 > length2) {
            return;
        }
        while (true) {
            if (m39458f(stackTraceElementArr[length2], arrayDeque.getLast())) {
                arrayDeque.removeLast();
            }
            arrayDeque.addFirst(stackTraceElementArr[length2]);
            if (length2 == i3) {
                return;
            } else {
                length2--;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: j */
    public static final <E extends Throwable> E m39462j(E e2, CoroutineStackFrame coroutineStackFrame) {
        Pair pairM39455c = m39455c(e2);
        Throwable th = (Throwable) pairM39455c.m37646a();
        StackTraceElement[] stackTraceElementArr = (StackTraceElement[]) pairM39455c.m37647b();
        Throwable thM39463k = m39463k(th);
        if (thM39463k == null) {
            return e2;
        }
        ArrayDeque<StackTraceElement> arrayDequeM39457e = m39457e(coroutineStackFrame);
        if (arrayDequeM39457e.isEmpty()) {
            return e2;
        }
        if (th != e2) {
            m39461i(stackTraceElementArr, arrayDequeM39457e);
        }
        return (E) m39456d(th, thM39463k, arrayDequeM39457e);
    }

    /* renamed from: k */
    private static final <E extends Throwable> E m39463k(E e2) {
        E e3 = (E) C10987j.m39502g(e2);
        if (e3 == null) {
            return null;
        }
        if ((e2 instanceof CopyableThrowable) || C9801m.m32341a(e3.getMessage(), e2.getMessage())) {
            return e3;
        }
        return null;
    }

    /* renamed from: l */
    public static final <E extends Throwable> E m39464l(E e2) {
        E e3 = (E) e2.getCause();
        if (e3 != null && C9801m.m32341a(e3.getClass(), e2.getClass())) {
            StackTraceElement[] stackTrace = e2.getStackTrace();
            int length = stackTrace.length;
            boolean z = false;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                if (m39460h(stackTrace[i2])) {
                    z = true;
                    break;
                }
                i2++;
            }
            if (z) {
                return e3;
            }
        }
        return e2;
    }
}
