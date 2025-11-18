package K4;

import Ba.p;
import H4.i;
import M4.h;
import Xb.C1837g;
import Xb.I;
import Xb.Z;
import ac.InterfaceC1970e;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.r;
import kotlin.coroutines.jvm.internal.f;
import kotlin.coroutines.jvm.internal.l;
import kotlin.jvm.internal.C3862t;
import o4.Recipe;
import o4.Step;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import ua.C4696b;
import x5.C5060e;

/* compiled from: OnGoingRecipeHelper.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0004\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J!\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ5\u0010\u0011\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\r\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0011\u0010\u0012J\u001d\u0010\u0014\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u000b¢\u0006\u0004\b\u0014\u0010\u0015J=\u0010\u0018\u001a\u00020\u00102\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0018\u0010\u0019J\u001d\u0010\u001a\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u001a\u0010\u001bJ\u0097\u0001\u0010'\u001a\u00020\u00102\b\b\u0002\u0010\u001c\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0017\u001a\u00020\u000b2\b\b\u0002\u0010\u0016\u001a\u00020\u000b2\b\b\u0002\u0010\u001d\u001a\u00020\u000b2\b\b\u0002\u0010\u001e\u001a\u00020\u00042\b\b\u0002\u0010\r\u001a\u00020\u00042\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010!2\b\b\u0002\u0010&\u001a\u00020\u000b¢\u0006\u0004\b'\u0010(J\u0015\u0010)\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b+\u0010,J\u0017\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b-\u0010.J\u001b\u00100\u001a\b\u0012\u0004\u0012\u00020\b0/2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b0\u00101J\u0015\u00102\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u0004\u0018\u00010\b2\u0006\u00104\u001a\u00020\u000b¢\u0006\u0004\b5\u0010.J\u0013\u00107\u001a\b\u0012\u0004\u0012\u00020\b06¢\u0006\u0004\b7\u00108J\u0013\u00109\u001a\b\u0012\u0004\u0012\u00020\b06¢\u0006\u0004\b9\u00108¨\u0006:"}, d2 = {"LK4/a;", "", "<init>", "()V", "", "recipeId", "Lo4/o;", "recipe", "LK4/b;", "i", "(ILo4/o;)LK4/b;", "", "onGoingRecipeId", "stepNumber", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "j", "(JIILcom/apptionlabs/meater_app/model/Probe;Lo4/o;)V", "cookID", "m", "(JJ)V", "ongoingRecipeId", "probeId", "n", "(JIIJLo4/o;)V", "o", "(JLo4/o;)V", "id", "cookId", "adapterPosition", "", "stepTitle", "", "elapsedTimeStepCrossed", "internalTempStepCrossed", "cookConfirmed", "cookFinish", "lastStepTimeStamp", "k", "(IIJJJIILjava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;J)V", "b", "(J)V", "a", "(Lta/d;)Ljava/lang/Object;", "e", "(J)LK4/b;", "Lac/e;", "f", "(J)Lac/e;", "h", "(J)I", "deviceId", "g", "", "c", "()Ljava/util/List;", "d", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public static final a f8678a = new a();

    /* compiled from: OnGoingRecipeHelper.kt */
    @f(c = "com.apptionlabs.meater_app.database.OnGoingRecipeHelper$finishAllRecipe$2$1", f = "OnGoingRecipeHelper.kt", l = {}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    /* renamed from: K4.a$a, reason: collision with other inner class name */
    static final class C0170a extends l implements p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f8679B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ i f8680C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C0170a(i iVar, InterfaceC4588d<? super C0170a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f8680C = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return new C0170a(this.f8680C, interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((C0170a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            C4696b.e();
            if (this.f8679B != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            for (b bVar : this.f8680C.b()) {
                MEATERDevice mEATERDeviceO = h.f11978a.o(bVar.getProbeId());
                if (mEATERDeviceO != null && (mEATERDeviceO instanceof Probe)) {
                    ((Probe) mEATERDeviceO).cancelCook(true);
                }
                this.f8680C.a(bVar.getOngoingRecipeId());
            }
            return C4153F.f46609a;
        }
    }

    private a() {
    }

    public static /* synthetic */ void l(a aVar, int i10, int i11, long j10, long j11, long j12, int i12, int i13, String str, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, long j13, int i14, Object obj) {
        aVar.k((i14 & 1) != 0 ? -1 : i10, (i14 & 2) != 0 ? -1 : i11, (i14 & 4) != 0 ? -1L : j10, (i14 & 8) != 0 ? -1L : j11, (i14 & 16) != 0 ? -1L : j12, (i14 & 32) != 0 ? -1 : i12, (i14 & 64) == 0 ? i13 : -1, (i14 & 128) != 0 ? "" : str, (i14 & 256) != 0 ? null : bool, (i14 & 512) != 0 ? null : bool2, (i14 & 1024) != 0 ? null : bool3, (i14 & 2048) != 0 ? null : bool4, (i14 & 4096) != 0 ? -1L : j13);
    }

    public final Object a(InterfaceC4588d<? super C4153F> interfaceC4588d) {
        Object objG;
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        return (iVarOnGoingRecipeDAO == null || (objG = C1837g.g(Z.b(), new C0170a(iVarOnGoingRecipeDAO, null), interfaceC4588d)) != C4696b.e()) ? C4153F.f46609a : objG;
    }

    public final void b(long onGoingRecipeId) {
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        if (iVarOnGoingRecipeDAO != null) {
            iVarOnGoingRecipeDAO.a(onGoingRecipeId);
        }
    }

    public final List<b> c() {
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        return iVarOnGoingRecipeDAO != null ? iVarOnGoingRecipeDAO.b() : new ArrayList();
    }

    public final List<b> d() {
        return LocalStorage.sharedStorage().onGoingRecipeDAO().c();
    }

    public final b e(long onGoingRecipeId) {
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        if (iVarOnGoingRecipeDAO != null) {
            return iVarOnGoingRecipeDAO.g(onGoingRecipeId);
        }
        return null;
    }

    public final InterfaceC1970e<b> f(long onGoingRecipeId) {
        return LocalStorage.sharedStorage().onGoingRecipeDAO().h(onGoingRecipeId);
    }

    public final b g(long deviceId) {
        return LocalStorage.sharedStorage().onGoingRecipeDAO().e(deviceId);
    }

    public final int h(long onGoingRecipeId) {
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        if (iVarOnGoingRecipeDAO != null) {
            return iVarOnGoingRecipeDAO.i(onGoingRecipeId);
        }
        return 0;
    }

    public final b i(int recipeId, Recipe recipe) {
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        b bVar = new b();
        bVar.A(recipeId);
        bVar.C(0);
        if (recipe != null) {
            bVar.B(recipe.q());
            String title = ((Step) r.j0(recipe.n())).getTitle();
            if (title != null) {
                bVar.D(title);
            }
            ArrayList arrayList = new ArrayList();
            Iterator<Step> it = recipe.n().iterator();
            while (it.hasNext()) {
                Integer estimatedDurationMinutes = it.next().getEstimatedDurationMinutes();
                C3862t.d(estimatedDurationMinutes);
                estimatedDurationMinutes.intValue();
                arrayList.add(estimatedDurationMinutes);
            }
            bVar.z(r.s0(arrayList, ",", null, null, 0, null, null, 62, null));
        }
        bVar.x(C5060e.f52836a.a());
        iVarOnGoingRecipeDAO.j(bVar);
        return bVar;
    }

    public final void j(long onGoingRecipeId, int recipeId, int stepNumber, Probe probe, Recipe recipe) {
        C3862t.g(probe, "probe");
        C3862t.g(recipe, "recipe");
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        b bVar = new b();
        bVar.A(recipeId);
        bVar.C(stepNumber);
        bVar.x(onGoingRecipeId);
        bVar.y(probe.getDeviceID());
        bVar.B(recipe.q());
        String title = ((Step) r.j0(recipe.n())).getTitle();
        if (title != null) {
            bVar.D(title);
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Step> it = recipe.n().iterator();
        while (it.hasNext()) {
            Integer estimatedDurationMinutes = it.next().getEstimatedDurationMinutes();
            C3862t.d(estimatedDurationMinutes);
            estimatedDurationMinutes.intValue();
            arrayList.add(estimatedDurationMinutes);
        }
        bVar.z(r.s0(arrayList, ",", null, null, 0, null, null, 62, null));
        iVarOnGoingRecipeDAO.j(bVar);
    }

    public final void k(int id2, int recipeId, long probeId, long ongoingRecipeId, long cookId, int adapterPosition, int stepNumber, String stepTitle, Boolean elapsedTimeStepCrossed, Boolean internalTempStepCrossed, Boolean cookConfirmed, Boolean cookFinish, long lastStepTimeStamp) {
        C3862t.g(stepTitle, "stepTitle");
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        if (iVarOnGoingRecipeDAO != null) {
            b bVarF = id2 != -1 ? iVarOnGoingRecipeDAO.f(id2) : ongoingRecipeId != -1 ? iVarOnGoingRecipeDAO.g(ongoingRecipeId) : iVarOnGoingRecipeDAO.d(recipeId);
            if (bVarF != null) {
                if (probeId != -1) {
                    bVarF.y(probeId);
                }
                if (ongoingRecipeId != -1) {
                    bVarF.x(ongoingRecipeId);
                }
                if (cookId != -1) {
                    bVarF.s(cookId);
                }
                if (adapterPosition != -1) {
                    bVarF.p(adapterPosition);
                }
                if (stepNumber != -1) {
                    bVarF.C(stepNumber);
                }
                if (lastStepTimeStamp != -1) {
                    bVarF.w(lastStepTimeStamp);
                }
                if (stepTitle.length() > 0) {
                    bVarF.D(stepTitle);
                }
                if (elapsedTimeStepCrossed != null) {
                    bVarF.t(elapsedTimeStepCrossed.booleanValue());
                }
                if (internalTempStepCrossed != null) {
                    bVarF.v(internalTempStepCrossed.booleanValue());
                }
                if (cookConfirmed != null) {
                    bVarF.q(cookConfirmed.booleanValue());
                }
                if (cookFinish != null) {
                    bVarF.r(cookFinish.booleanValue());
                }
                iVarOnGoingRecipeDAO.k(bVarF);
            }
        }
    }

    public final void m(long onGoingRecipeId, long cookID) {
        l(this, 0, 0, 0L, onGoingRecipeId, cookID, 0, 0, null, null, null, null, null, 0L, 8167, null);
    }

    public final void n(long ongoingRecipeId, int recipeId, int stepNumber, long probeId, Recipe recipe) {
        C3862t.g(recipe, "recipe");
        String title = recipe.n().get(stepNumber).getTitle();
        if (title == null) {
            title = "";
        }
        l(this, 0, recipeId, probeId, ongoingRecipeId, 0L, 0, stepNumber, title, null, null, null, null, 0L, 7985, null);
    }

    public final void o(long onGoingRecipeId, Recipe recipe) {
        C3862t.g(recipe, "recipe");
        i iVarOnGoingRecipeDAO = LocalStorage.sharedStorage().onGoingRecipeDAO();
        b bVarG = iVarOnGoingRecipeDAO.g(onGoingRecipeId);
        if (bVarG == null || bVarG.getProgressData().length() != 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Step> it = recipe.n().iterator();
        while (it.hasNext()) {
            Integer estimatedDurationMinutes = it.next().getEstimatedDurationMinutes();
            C3862t.d(estimatedDurationMinutes);
            estimatedDurationMinutes.intValue();
            arrayList.add(estimatedDurationMinutes);
        }
        bVarG.z(r.s0(arrayList, ",", null, null, 0, null, null, 62, null));
        iVarOnGoingRecipeDAO.k(bVarG);
    }
}
