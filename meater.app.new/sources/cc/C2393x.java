package cc;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlinx.coroutines.internal.UndeliveredElementException;
import oa.C4153F;
import oa.C4158c;

/* compiled from: OnUndeliveredElement.kt */
@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0004\u001aE\u0010\u0007\u001a\u0004\u0018\u00010\u0005\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a?\u0010\u000b\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000b\u0010\f\u001aK\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00020\u0001\"\u0004\b\u0000\u0010\u0000*\u0018\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00028\u0000`\u00032\u0006\u0010\u0004\u001a\u00028\u00002\u0006\u0010\n\u001a\u00020\tH\u0000¢\u0006\u0004\b\u000e\u0010\u000f**\b\u0000\u0010\u0010\u001a\u0004\b\u0000\u0010\u0000\"\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u00012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0011"}, d2 = {"E", "Lkotlin/Function1;", "Loa/F;", "Lkotlinx/coroutines/internal/OnUndeliveredElement;", "element", "Lkotlinx/coroutines/internal/UndeliveredElementException;", "undeliveredElementException", "c", "(LBa/l;Ljava/lang/Object;Lkotlinx/coroutines/internal/UndeliveredElementException;)Lkotlinx/coroutines/internal/UndeliveredElementException;", "Lta/g;", "context", "b", "(LBa/l;Ljava/lang/Object;Lta/g;)V", "", "a", "(LBa/l;Ljava/lang/Object;Lta/g;)LBa/l;", "OnUndeliveredElement", "kotlinx-coroutines-core"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: cc.x, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2393x {

    /* compiled from: OnUndeliveredElement.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"E", "", "<anonymous parameter 0>", "Loa/F;", "a", "(Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: cc.x$a */
    static final class a extends AbstractC3864v implements Ba.l<Throwable, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l<E, C4153F> f31206B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ E f31207C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ ta.g f31208D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Ba.l<? super E, C4153F> lVar, E e10, ta.g gVar) {
            super(1);
            this.f31206B = lVar;
            this.f31207C = e10;
            this.f31208D = gVar;
        }

        public final void a(Throwable th) {
            C2393x.b(this.f31206B, this.f31207C, this.f31208D);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Throwable th) {
            a(th);
            return C4153F.f46609a;
        }
    }

    public static final <E> Ba.l<Throwable, C4153F> a(Ba.l<? super E, C4153F> lVar, E e10, ta.g gVar) {
        return new a(lVar, e10, gVar);
    }

    public static final <E> void b(Ba.l<? super E, C4153F> lVar, E e10, ta.g gVar) {
        UndeliveredElementException undeliveredElementExceptionC = c(lVar, e10, null);
        if (undeliveredElementExceptionC != null) {
            Xb.G.a(gVar, undeliveredElementExceptionC);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <E> UndeliveredElementException c(Ba.l<? super E, C4153F> lVar, E e10, UndeliveredElementException undeliveredElementException) {
        try {
            lVar.invoke(e10);
        } catch (Throwable th) {
            if (undeliveredElementException == null || undeliveredElementException.getCause() == th) {
                return new UndeliveredElementException("Exception in undelivered element handler for " + e10, th);
            }
            C4158c.a(undeliveredElementException, th);
        }
        return undeliveredElementException;
    }

    public static /* synthetic */ UndeliveredElementException d(Ba.l lVar, Object obj, UndeliveredElementException undeliveredElementException, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            undeliveredElementException = null;
        }
        return c(lVar, obj, undeliveredElementException);
    }
}
