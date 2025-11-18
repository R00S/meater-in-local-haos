package kotlin;

import Ba.l;
import Ha.f;
import Q.b;
import Xb.InterfaceC1847l;
import h0.C3478i;
import java.util.concurrent.CancellationException;
import kotlin.C5026f;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4172q;

/* compiled from: BringIntoViewRequestPriorityQueue.kt */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\r\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lx/c;", "", "<init>", "()V", "Lx/f$a;", "request", "", "c", "(Lx/f$a;)Z", "Loa/F;", "d", "", "cause", "b", "(Ljava/lang/Throwable;)V", "LQ/b;", "a", "LQ/b;", "requests", "foundation_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: x.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5023c {

    /* renamed from: b, reason: collision with root package name */
    public static final int f52331b = b.f14177E;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final b<C5026f.a> requests = new b<>(new C5026f.a[16], 0);

    /* compiled from: BringIntoViewRequestPriorityQueue.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: x.c$a */
    static final class a extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ C5026f.a f52334C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(C5026f.a aVar) {
            super(1);
            this.f52334C = aVar;
        }

        public final void a(Throwable th) {
            C5023c.this.requests.B(this.f52334C);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public final void b(Throwable cause) {
        b<C5026f.a> bVar = this.requests;
        int size = bVar.getSize();
        InterfaceC1847l[] interfaceC1847lArr = new InterfaceC1847l[size];
        for (int i10 = 0; i10 < size; i10++) {
            interfaceC1847lArr[i10] = bVar.t()[i10].a();
        }
        for (int i11 = 0; i11 < size; i11++) {
            interfaceC1847lArr[i11].M(cause);
        }
        if (!this.requests.x()) {
            throw new IllegalStateException("uncancelled requests present");
        }
    }

    public final boolean c(C5026f.a request) {
        C3478i c3478iInvoke = request.b().invoke();
        if (c3478iInvoke == null) {
            InterfaceC1847l<C4153F> interfaceC1847lA = request.a();
            C4172q.Companion companion = C4172q.INSTANCE;
            interfaceC1847lA.resumeWith(C4172q.a(C4153F.f46609a));
            return false;
        }
        request.a().R(new a(request));
        f fVar = new f(0, this.requests.getSize() - 1);
        int first = fVar.getFirst();
        int last = fVar.getLast();
        if (first <= last) {
            while (true) {
                C3478i c3478iInvoke2 = this.requests.t()[last].b().invoke();
                if (c3478iInvoke2 != null) {
                    C3478i c3478iM = c3478iInvoke.m(c3478iInvoke2);
                    if (C3862t.b(c3478iM, c3478iInvoke)) {
                        this.requests.a(last + 1, request);
                        return true;
                    }
                    if (!C3862t.b(c3478iM, c3478iInvoke2)) {
                        CancellationException cancellationException = new CancellationException("bringIntoView call interrupted by a newer, non-overlapping call");
                        int size = this.requests.getSize() - 1;
                        if (size <= last) {
                            while (true) {
                                this.requests.t()[last].a().M(cancellationException);
                                if (size == last) {
                                    break;
                                }
                                size++;
                            }
                        }
                    }
                }
                if (last == first) {
                    break;
                }
                last--;
            }
        }
        this.requests.a(0, request);
        return true;
    }

    public final void d() {
        f fVar = new f(0, this.requests.getSize() - 1);
        int first = fVar.getFirst();
        int last = fVar.getLast();
        if (first <= last) {
            while (true) {
                this.requests.t()[first].a().resumeWith(C4172q.a(C4153F.f46609a));
                if (first == last) {
                    break;
                } else {
                    first++;
                }
            }
        }
        this.requests.l();
    }
}
