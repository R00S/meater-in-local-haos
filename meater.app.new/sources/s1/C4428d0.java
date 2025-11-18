package s1;

import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.Metadata;
import kotlin.jvm.internal.C3860q;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: View.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\"\u001b\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\u0001*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\b"}, d2 = {"Landroid/view/View;", "LTb/h;", "Landroid/view/ViewParent;", "b", "(Landroid/view/View;)LTb/h;", "ancestors", "a", "allViews", "core-ktx_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: s1.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4428d0 {

    /* compiled from: View.kt */
    @kotlin.coroutines.jvm.internal.f(c = "androidx.core.view.ViewKt$allViews$1", f = "View.kt", l = {410, 412}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LTb/j;", "Landroid/view/View;", "Loa/F;", "<anonymous>", "(LTb/j;)V"}, k = 3, mv = {1, 8, 0})
    /* renamed from: s1.d0$a */
    static final class a extends kotlin.coroutines.jvm.internal.k implements Ba.p<Tb.j<? super View>, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: C, reason: collision with root package name */
        int f49135C;

        /* renamed from: D, reason: collision with root package name */
        private /* synthetic */ Object f49136D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ View f49137E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(View view, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f49137E = view;
        }

        @Override // Ba.p
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Tb.j<? super View> jVar, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(jVar, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f49137E, interfaceC4588d);
            aVar.f49136D = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Tb.j jVar;
            Object objE = C4696b.e();
            int i10 = this.f49135C;
            if (i10 == 0) {
                C4173r.b(obj);
                jVar = (Tb.j) this.f49136D;
                View view = this.f49137E;
                this.f49136D = jVar;
                this.f49135C = 1;
                if (jVar.b(view, this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C4173r.b(obj);
                    return C4153F.f46609a;
                }
                jVar = (Tb.j) this.f49136D;
                C4173r.b(obj);
            }
            View view2 = this.f49137E;
            if (view2 instanceof ViewGroup) {
                Tb.h<View> hVarB = C4426c0.b((ViewGroup) view2);
                this.f49136D = null;
                this.f49135C = 2;
                if (jVar.d(hVarB, this) == objE) {
                    return objE;
                }
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: View.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: s1.d0$b */
    /* synthetic */ class b extends C3860q implements Ba.l<ViewParent, ViewParent> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f49138B = new b();

        b() {
            super(1, ViewParent.class, "getParent", "getParent()Landroid/view/ViewParent;", 0);
        }

        @Override // Ba.l
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public final ViewParent invoke(ViewParent viewParent) {
            return viewParent.getParent();
        }
    }

    public static final Tb.h<View> a(View view) {
        return Tb.k.b(new a(view, null));
    }

    public static final Tb.h<ViewParent> b(View view) {
        return Tb.k.i(view.getParent(), b.f49138B);
    }
}
