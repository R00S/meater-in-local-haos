package T5;

import Xb.C1841i;
import Xb.I;
import android.view.Y;
import android.view.Z;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;

/* compiled from: CustomSettingViewModel.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\r\u0010\u000e\u001a\u00020\b¢\u0006\u0004\b\u000e\u0010\nJ\r\u0010\u000f\u001a\u00020\b¢\u0006\u0004\b\u000f\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"LT5/d;", "Landroidx/lifecycle/Y;", "Lz5/j;", "recipeViewModel", "LG5/a;", "preference", "<init>", "(Lz5/j;LG5/a;)V", "Loa/F;", "h", "()V", "", "j", "()Ljava/lang/String;", "k", "i", "b", "Lz5/j;", "c", "LG5/a;", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class d extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final z5.j recipeViewModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final G5.a preference;

    /* compiled from: CustomSettingViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.CustomSettingViewModel$finishAllRecipes$1", f = "CustomSettingViewModel.kt", l = {65}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16048B;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f16048B;
            if (i10 == 0) {
                C4173r.b(obj);
                K4.a aVar = K4.a.f8678a;
                this.f16048B = 1;
                if (aVar.a(this) == objE) {
                    return objE;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
            }
            return C4153F.f46609a;
        }
    }

    /* compiled from: CustomSettingViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.CustomSettingViewModel$updateOnGoingStepTitle$1", f = "CustomSettingViewModel.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16049B;

        b(InterfaceC4588d<? super b> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new b(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((b) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Recipe recipeG;
            C4696b.e();
            if (this.f16049B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            for (K4.b bVar : K4.a.f8678a.c()) {
                int recipeId = bVar.getRecipeId();
                int stepNumber = bVar.getStepNumber();
                if (recipeId != -1 && (recipeG = x5.g.f52863a.g(recipeId)) != null) {
                    U4.b.t("(CustomSettingViewModel) Step Number : " + stepNumber, new Object[0]);
                    String title = recipeG.n().get(stepNumber).getTitle();
                    if (title != null) {
                        String strF = Q4.l.f(title);
                        K4.a.l(K4.a.f8678a, 0, 0, 0L, bVar.getOngoingRecipeId(), 0L, 0, 0, strF, null, null, null, null, 0L, 8055, null);
                        U4.b.t("(CustomSettingViewModel) Title will be : " + strF, new Object[0]);
                    }
                }
            }
            return C4153F.f46609a;
        }
    }

    public d(z5.j recipeViewModel, G5.a preference) {
        C3862t.g(recipeViewModel, "recipeViewModel");
        C3862t.g(preference, "preference");
        this.recipeViewModel = recipeViewModel;
        this.preference = preference;
    }

    public final void h() {
        this.recipeViewModel.l();
    }

    public final void i() {
        C1841i.d(Z.a(this), null, null, new a(null), 3, null);
    }

    public final String j() {
        String string = Locale.getDefault().toString();
        C3862t.f(string, "toString(...)");
        return string;
    }

    public final void k() {
        C1841i.d(Z.a(this), Xb.Z.b(), null, new b(null), 2, null);
    }
}
