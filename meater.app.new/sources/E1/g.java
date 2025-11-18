package E1;

import Ba.p;
import kotlin.Metadata;
import kotlin.coroutines.jvm.internal.l;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: Preferences.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u001aA\u0010\b\u001a\u00020\u0001*\b\u0012\u0004\u0012\u00020\u00010\u00002\"\u0010\u0007\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u0002H\u0086@ø\u0001\u0000¢\u0006\u0004\b\b\u0010\t\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\n"}, d2 = {"LB1/e;", "LE1/d;", "Lkotlin/Function2;", "LE1/a;", "Lta/d;", "Loa/F;", "", "transform", "a", "(LB1/e;LBa/p;Lta/d;)Ljava/lang/Object;", "datastore-preferences-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class g {

    /* compiled from: Preferences.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.datastore.preferences.core.PreferencesKt$edit$2", f = "Preferences.kt", l = {329}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LE1/d;", "it", "<anonymous>", "(LE1/d;)LE1/d;"}, k = 3, mv = {1, 5, 1})
    static final class a extends l implements p<d, InterfaceC4588d<? super d>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f3809B;

        /* renamed from: C, reason: collision with root package name */
        /* synthetic */ Object f3810C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ p<E1.a, InterfaceC4588d<? super C4153F>, Object> f3811D;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(p<? super E1.a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f3811D = pVar;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(d dVar, InterfaceC4588d<? super d> interfaceC4588d) {
            return ((a) create(dVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f3811D, interfaceC4588d);
            aVar.f3810C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f3809B;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                E1.a aVar = (E1.a) this.f3810C;
                C4173r.b(obj);
                return aVar;
            }
            C4173r.b(obj);
            E1.a aVarC = ((d) this.f3810C).c();
            p<E1.a, InterfaceC4588d<? super C4153F>, Object> pVar = this.f3811D;
            this.f3810C = aVarC;
            this.f3809B = 1;
            return pVar.invoke(aVarC, this) == objE ? objE : aVarC;
        }
    }

    public static final Object a(B1.e<d> eVar, p<? super E1.a, ? super InterfaceC4588d<? super C4153F>, ? extends Object> pVar, InterfaceC4588d<? super d> interfaceC4588d) {
        return eVar.a(new a(pVar, null), interfaceC4588d);
    }
}
