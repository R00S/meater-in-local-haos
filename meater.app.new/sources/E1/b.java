package E1;

import Ba.p;
import ac.InterfaceC1970e;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: PreferenceDataStoreFactory.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J7\u0010\n\u001a\u00020\u00022\"\u0010\t\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u0007\u0012\u0006\u0012\u0004\u0018\u00010\b0\u0006H\u0096@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\fR\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0011"}, d2 = {"LE1/b;", "LB1/e;", "LE1/d;", "delegate", "<init>", "(LB1/e;)V", "Lkotlin/Function2;", "Lta/d;", "", "transform", "a", "(LBa/p;Lta/d;)Ljava/lang/Object;", "LB1/e;", "Lac/e;", "f", "()Lac/e;", "data", "datastore-preferences-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class b implements B1.e<d> {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final B1.e<d> delegate;

    /* compiled from: PreferenceDataStoreFactory.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferenceDataStore$updateData$2", f = "PreferenceDataStoreFactory.kt", l = {85}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/d;", "it", "<anonymous>", "(LE1/d;)LE1/d;"}, k = 3, mv = {1, 5, 1})
    static final class a extends l implements p<d, InterfaceC4588d<? super d>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3801B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f3802C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<d, InterfaceC4588d<? super d>, Object> f3803D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super d, ? super InterfaceC4588d<? super d>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3803D = pVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC4588d<? super d> interfaceC4588d) {
            return ((a) create(dVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f3803D, interfaceC4588d);
            aVar.f3802C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f3801B;
            if (i10 == 0) {
                C4173r.b(obj);
                d dVar = (d) this.f3802C;
                p<d, InterfaceC4588d<? super d>, Object> pVar = this.f3803D;
                this.f3801B = 1;
                obj = pVar.invoke(dVar, this);
                if (obj == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            d dVar2 = (d) obj;
            ((E1.a) dVar2).f();
            return dVar2;
        }
    }

    public b(B1.e<d> delegate) {
        C3862t.g(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // B1.e
    public Object a(p<? super d, ? super InterfaceC4588d<? super d>, ? extends Object> pVar, InterfaceC4588d<? super d> interfaceC4588d) {
        return this.delegate.a(new a(pVar, null), interfaceC4588d);
    }

    @Override // B1.e
    public InterfaceC1970e<d> f() {
        return this.delegate.f();
    }
}
