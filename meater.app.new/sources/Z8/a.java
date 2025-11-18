package Z8;

/* compiled from: MiddleOutFallbackStrategy.java */
/* loaded from: classes2.dex */
public class a implements d {

    /* renamed from: a, reason: collision with root package name */
    private final int f19602a;

    /* renamed from: b, reason: collision with root package name */
    private final d[] f19603b;

    /* renamed from: c, reason: collision with root package name */
    private final b f19604c;

    public a(int i10, d... dVarArr) {
        this.f19602a = i10;
        this.f19603b = dVarArr;
        this.f19604c = new b(i10);
    }

    @Override // Z8.d
    public StackTraceElement[] a(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr.length <= this.f19602a) {
            return stackTraceElementArr;
        }
        StackTraceElement[] stackTraceElementArrA = stackTraceElementArr;
        for (d dVar : this.f19603b) {
            if (stackTraceElementArrA.length <= this.f19602a) {
                break;
            }
            stackTraceElementArrA = dVar.a(stackTraceElementArr);
        }
        return stackTraceElementArrA.length > this.f19602a ? this.f19604c.a(stackTraceElementArrA) : stackTraceElementArrA;
    }
}
