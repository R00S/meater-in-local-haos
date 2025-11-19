package Y;

import Ba.p;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.jvm.internal.W;

/* compiled from: ListSaver.kt */
@Metadata(d1 = {"\u0000$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u001aa\u0010\n\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\t0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u001e\u0010\u0005\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00028\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u00040\u00022\u001a\u0010\u0007\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0004\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0006¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Original", "Saveable", "Lkotlin/Function2;", "LY/l;", "", "save", "Lkotlin/Function1;", "restore", "LY/j;", "", "a", "(LBa/p;LBa/l;)LY/j;", "runtime-saveable_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public final class a {

    /* JADX INFO: Add missing generic type declarations: [Original] */
    /* compiled from: ListSaver.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Original", "Saveable", "LY/l;", "it", "", "a", "(LY/l;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 8, 0})
    /* renamed from: Y.a$a, reason: collision with other inner class name */
    static final class C0278a<Original> extends AbstractC3864v implements p<l, Original, Object> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ p<l, Original, List<Saveable>> f19134B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C0278a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar) {
            super(2);
            this.f19134B = pVar;
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(l lVar, Original original) {
            List list = (List) this.f19134B.invoke(lVar, original);
            int size = list.size();
            for (int i10 = 0; i10 < size; i10++) {
                Object obj = list.get(i10);
                if (obj != null && !lVar.a(obj)) {
                    throw new IllegalArgumentException("item can't be saved");
                }
            }
            List list2 = list;
            if (list2.isEmpty()) {
                return null;
            }
            return new ArrayList(list2);
        }
    }

    public static final <Original, Saveable> j<Original, Object> a(p<? super l, ? super Original, ? extends List<? extends Saveable>> pVar, Ba.l<? super List<? extends Saveable>, ? extends Original> lVar) {
        C0278a c0278a = new C0278a(pVar);
        C3862t.e(lVar, "null cannot be cast to non-null type kotlin.Function1<kotlin.Any, Original of androidx.compose.runtime.saveable.ListSaverKt.listSaver?>");
        return k.a(c0278a, (Ba.l) W.f(lVar, 1));
    }
}
