package ac;

import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;

/* compiled from: Distinct.kt */
@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\b\u001a#\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0002\u0010\u0003\u001aY\u0010\n\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00042\u001c\u0010\t\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000b\"$\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\f\"*\u0010\u000f\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u0005\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u0010"}, d2 = {"T", "Lac/e;", "a", "(Lac/e;)Lac/e;", "Lkotlin/Function1;", "", "keySelector", "Lkotlin/Function2;", "", "areEquivalent", "b", "(Lac/e;LBa/l;LBa/p;)Lac/e;", "LBa/l;", "defaultKeySelector", "LBa/p;", "defaultAreEquivalent", "kotlinx-coroutines-core"}, k = 5, mv = {1, 9, 0}, xi = 48, xs = "kotlinx/coroutines/flow/FlowKt")
/* renamed from: ac.l, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final /* synthetic */ class C1977l {

    /* renamed from: a, reason: collision with root package name */
    private static final Ba.l<Object, Object> f20365a = b.f20368B;

    /* renamed from: b, reason: collision with root package name */
    private static final Ba.p<Object, Object, Boolean> f20366b = a.f20367B;

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "old", "new", "", "a", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0})
    /* renamed from: ac.l$a */
    static final class a extends AbstractC3864v implements Ba.p<Object, Object, Boolean> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f20367B = new a();

        a() {
            super(2);
        }

        @Override // Ba.p
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(Object obj, Object obj2) {
            return Boolean.valueOf(C3862t.b(obj, obj2));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <T> InterfaceC1970e<T> a(InterfaceC1970e<? extends T> interfaceC1970e) {
        return interfaceC1970e instanceof H ? interfaceC1970e : b(interfaceC1970e, f20365a, f20366b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final <T> InterfaceC1970e<T> b(InterfaceC1970e<? extends T> interfaceC1970e, Ba.l<? super T, ? extends Object> lVar, Ba.p<Object, Object, Boolean> pVar) {
        if (interfaceC1970e instanceof C1969d) {
            C1969d c1969d = (C1969d) interfaceC1970e;
            if (c1969d.keySelector == lVar && c1969d.areEquivalent == pVar) {
                return interfaceC1970e;
            }
        }
        return new C1969d(interfaceC1970e, lVar, pVar);
    }

    /* compiled from: Distinct.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: ac.l$b */
    static final class b extends AbstractC3864v implements Ba.l<Object, Object> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f20368B = new b();

        b() {
            super(1);
        }

        @Override // Ba.l
        public final Object invoke(Object obj) {
            return obj;
        }
    }
}
