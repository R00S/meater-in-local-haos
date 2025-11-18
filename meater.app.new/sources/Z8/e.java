package Z8;

import java.util.Stack;

/* compiled from: TrimmedThrowableData.java */
/* loaded from: classes2.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public final String f19607a;

    /* renamed from: b, reason: collision with root package name */
    public final String f19608b;

    /* renamed from: c, reason: collision with root package name */
    public final StackTraceElement[] f19609c;

    /* renamed from: d, reason: collision with root package name */
    public final e f19610d;

    private e(String str, String str2, StackTraceElement[] stackTraceElementArr, e eVar) {
        this.f19607a = str;
        this.f19608b = str2;
        this.f19609c = stackTraceElementArr;
        this.f19610d = eVar;
    }

    public static e a(Throwable th, d dVar) {
        Stack stack = new Stack();
        while (th != null) {
            stack.push(th);
            th = th.getCause();
        }
        e eVar = null;
        while (!stack.isEmpty()) {
            Throwable th2 = (Throwable) stack.pop();
            eVar = new e(th2.getLocalizedMessage(), th2.getClass().getName(), dVar.a(th2.getStackTrace()), eVar);
        }
        return eVar;
    }
}
