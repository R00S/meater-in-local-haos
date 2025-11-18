package hc;

import Ba.l;
import Xb.C1849m;
import Xb.InterfaceC1847l;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.h;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import oa.C4172q;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import z7.AbstractC5208j;
import z7.C5200b;
import z7.InterfaceC5203e;

/* compiled from: Tasks.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a \u0010\u0002\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086@¢\u0006\u0004\b\u0002\u0010\u0003\u001a*\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0082@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "Lz7/j;", "a", "(Lz7/j;Lta/d;)Ljava/lang/Object;", "Lz7/b;", "cancellationTokenSource", "b", "(Lz7/j;Lz7/b;Lta/d;)Ljava/lang/Object;", "kotlinx-coroutines-play-services"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: hc.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3535b {

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u0014\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0002*\u0004\u0018\u00018\u00008\u00000\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "Lz7/j;", "kotlin.jvm.PlatformType", "it", "Loa/F;", "a", "(Lz7/j;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc.b$a */
    static final class a<TResult> implements InterfaceC5203e {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC1847l<T> f42376a;

        /* JADX WARN: Multi-variable type inference failed */
        a(InterfaceC1847l<? super T> interfaceC1847l) {
            this.f42376a = interfaceC1847l;
        }

        @Override // z7.InterfaceC5203e
        public final void a(AbstractC5208j<T> abstractC5208j) {
            Exception excJ = abstractC5208j.j();
            if (excJ != null) {
                InterfaceC4588d interfaceC4588d = this.f42376a;
                C4172q.Companion companion = C4172q.INSTANCE;
                interfaceC4588d.resumeWith(C4172q.a(C4173r.a(excJ)));
            } else {
                if (abstractC5208j.m()) {
                    InterfaceC1847l.a.a(this.f42376a, null, 1, null);
                    return;
                }
                InterfaceC4588d interfaceC4588d2 = this.f42376a;
                C4172q.Companion companion2 = C4172q.INSTANCE;
                interfaceC4588d2.resumeWith(C4172q.a(abstractC5208j.k()));
            }
        }
    }

    /* compiled from: Tasks.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "it", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: hc.b$b, reason: collision with other inner class name */
    static final class C0543b extends AbstractC3864v implements l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ C5200b f42377B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0543b(C5200b c5200b) {
            super(1);
            this.f42377B = c5200b;
        }

        public final void a(Throwable th) {
            this.f42377B.a();
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public static final <T> Object a(AbstractC5208j<T> abstractC5208j, InterfaceC4588d<? super T> interfaceC4588d) {
        return b(abstractC5208j, null, interfaceC4588d);
    }

    private static final <T> Object b(AbstractC5208j<T> abstractC5208j, C5200b c5200b, InterfaceC4588d<? super T> interfaceC4588d) throws Exception {
        if (!abstractC5208j.n()) {
            C1849m c1849m = new C1849m(C4696b.c(interfaceC4588d), 1);
            c1849m.x();
            abstractC5208j.b(ExecutorC3534a.f42375B, new a(c1849m));
            if (c5200b != null) {
                c1849m.R(new C0543b(c5200b));
            }
            Object objR = c1849m.r();
            if (objR == C4696b.e()) {
                h.c(interfaceC4588d);
            }
            return objR;
        }
        Exception excJ = abstractC5208j.j();
        if (excJ != null) {
            throw excJ;
        }
        if (!abstractC5208j.m()) {
            return abstractC5208j.k();
        }
        throw new CancellationException("Task " + abstractC5208j + " was cancelled normally.");
    }
}
