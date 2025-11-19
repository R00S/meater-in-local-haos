package J4;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0801i;
import A0.InterfaceC0828g;
import H0.TextStyle;
import J4.Q;
import P5.EnumC1593a;
import P5.EnumC1600h;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import androidx.compose.ui.platform.C2013e0;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.recipe.ui.recipe.stepcontentviews.StepProgressView;
import com.apptionlabs.meater_app.views.DialComponent;
import com.apptionlabs.meater_app.views.ProbeConnectionStatusView;
import i0.C3602t0;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.C1;
import kotlin.C1249A;
import kotlin.C1252D;
import kotlin.C1273Z;
import kotlin.C1290k;
import kotlin.C1291l;
import kotlin.C1293n;
import kotlin.C1491B0;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.C4732V;
import kotlin.C4755j;
import kotlin.C4761m;
import kotlin.C4762m0;
import kotlin.C4764n0;
import kotlin.C4768p0;
import kotlin.C4774s0;
import kotlin.C5030j;
import kotlin.FontWeight;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1555l0;
import kotlin.InterfaceC1559n0;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC1578x;
import kotlin.InterfaceC4718G;
import kotlin.InterfaceC4770q0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.f1;
import kotlin.jvm.internal.C3856m;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import oa.C4173r;
import ta.InterfaceC4588d;
import u0.C4631Q;
import u0.InterfaceC4622H;
import u0.PointerInputChange;
import ua.C4696b;
import y0.InterfaceC5116v;

/* compiled from: DashboardComponents.kt */
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\t\n\u0002\b\u0003\u001a}\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u0014\u0010\u0015\u001a\u0089\u0001\u0010\u001a\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0017\u001a\u00020\u00162\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e0\f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u001f\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u0016H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a3\u0010#\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00042\b\b\u0002\u0010\"\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0007¢\u0006\u0004\b#\u0010$\u001a9\u0010)\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010&\u001a\u00020%2\u0006\u0010'\u001a\u00020\u00042\b\b\u0002\u0010(\u001a\u00020\bH\u0007¢\u0006\u0004\b)\u0010*\u001a/\u0010,\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010!\u001a\u00020\u00042\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b,\u0010-\u001a'\u0010/\u001a\u00020\u000e2\u0006\u0010!\u001a\u00020\u00042\u0006\u0010.\u001a\u00020\r2\u0006\u0010+\u001a\u00020%H\u0007¢\u0006\u0004\b/\u00100\u001a+\u00101\u001a\u00020\u000e2\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b1\u00102\u001a1\u00103\u001a\u00020\u000e2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001e\u001a\u00020\u00162\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0007¢\u0006\u0004\b3\u00104\u001aA\u00108\u001a\u00020\u000e2\b\b\u0002\u00105\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u00002\b\b\u0002\u00106\u001a\u00020\r2\f\u00107\u001a\b\u0012\u0004\u0012\u00020\u000e0\u0010H\u0007¢\u0006\u0004\b8\u00109\u001a\u001d\u0010=\u001a\u00020\u000e2\u0006\u0010;\u001a\u00020:2\u0006\u0010\u001e\u001a\u00020<¢\u0006\u0004\b=\u0010>\"\u0017\u0010B\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010A\"\u0017\u0010E\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\bD\u0010A¨\u0006L²\u0006\f\u0010F\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010G\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\f\u0010F\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\f\u0010H\u001a\u00020\n8\nX\u008a\u0084\u0002²\u0006\u000e\u0010J\u001a\u00020I8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010J\u001a\u00020I8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010K\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"}, d2 = {"LP5/h;", "contentType", "LP5/a;", "scaleType", "", "recipeTitle", "LK4/b;", "onGoingRecipe", "", "isRevealed", "", "cardOffset", "Lkotlin/Function1;", "LU0/h;", "Loa/F;", "cardHeightIs", "Lkotlin/Function0;", "onExpand", "onCollapse", "onClick", "V", "(LP5/h;LP5/a;Ljava/lang/String;LK4/b;ZFLBa/l;LBa/a;LBa/a;LBa/a;LO/l;I)V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "LT4/v;", "probeSelectionListener", "K", "(LP5/h;LP5/a;Lcom/apptionlabs/meater_app/model/Probe;LK4/b;LT4/v;ZFLBa/l;LBa/a;LBa/a;LBa/a;LO/l;II)V", "Lb0/i;", "modifier", "device", "a0", "(Lb0/i;Lcom/apptionlabs/meater_app/model/Probe;LO/l;I)V", "text", "shouldTrimTitle", "H", "(Ljava/lang/String;ZLP5/h;LK4/b;LO/l;II)V", "", "stepNumber", "stepTitle", "shouldTrimSubtitle", "t0", "(LP5/h;LP5/a;ILjava/lang/String;ZLO/l;II)V", "fontSize", "F", "(LP5/a;Ljava/lang/String;Lb0/i;ILO/l;I)V", "size", "D", "(Ljava/lang/String;FILO/l;I)V", "m0", "(Lb0/i;Lcom/apptionlabs/meater_app/model/Probe;LT4/v;LO/l;II)V", "c0", "(LP5/h;Lb0/i;Lcom/apptionlabs/meater_app/model/Probe;LT4/v;LO/l;I)V", "isThisOnlyOngoingRecipeCard", "actionRowHeight", "onDelete", "A", "(ZLP5/a;LP5/h;FLBa/a;LO/l;II)V", "Landroid/app/Activity;", "activity", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "v0", "(Landroid/app/Activity;Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "a", "getTABLET_LARGE_LANDSCAPE_DIAL_SIZE", "()F", "TABLET_LARGE_LANDSCAPE_DIAL_SIZE", "b", "getTABLET_SMALL_LANDSCAPE_DIAL_SIZE", "TABLET_SMALL_LANDSCAPE_DIAL_SIZE", "offsetTransition", "cardTitle", "maxWidthTitle", "", "localTime", "storedContentType", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class Q {

    /* renamed from: a, reason: collision with root package name */
    private static final float f7385a = U0.h.u(240);

    /* renamed from: b, reason: collision with root package name */
    private static final float f7386b = U0.h.u(200);

    /* compiled from: DashboardComponents.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.dashboard.ui.DashboardComponentsKt$DashboardProbeCard$2$1", f = "DashboardComponents.kt", l = {436}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7387B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7388C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Probe f7389D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7390E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7391F;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(Probe probe, Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2, InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7389D = probe;
            this.f7390E = aVar;
            this.f7391F = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F n(Probe probe, Ba.a aVar, Ba.a aVar2, PointerInputChange pointerInputChange, float f10) {
            if (probe.appearsToHaveCookInProgress() && probe.isOnline()) {
                if (f10 >= 6.0f) {
                    aVar.invoke();
                } else if (f10 < -6.0f) {
                    aVar2.invoke();
                }
            }
            return C4153F.f46609a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            a aVar = new a(this.f7389D, this.f7390E, this.f7391F, interfaceC4588d);
            aVar.f7388C = obj;
            return aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7387B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f7388C;
                final Probe probe = this.f7389D;
                final Ba.a<C4153F> aVar = this.f7390E;
                final Ba.a<C4153F> aVar2 = this.f7391F;
                Ba.p pVar = new Ba.p() { // from class: J4.P
                    @Override // Ba.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return Q.a.n(probe, aVar, aVar2, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                    }
                };
                this.f7387B = 1;
                if (C5030j.g(interfaceC4622H, null, null, null, pVar, this, 7, null) == objE) {
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

        @Override // Ba.p
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }
    }

    /* compiled from: DashboardComponents.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Ba.q<C4762m0.a<Boolean>, InterfaceC1554l, Integer, InterfaceC4718G<Float>> {

        /* renamed from: B, reason: collision with root package name */
        public static final b f7392B = new b();

        b() {
        }

        public final InterfaceC4718G<Float> a(C4762m0.a<Boolean> animateFloat, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(animateFloat, "$this$animateFloat");
            interfaceC1554l.S(1807016520);
            if (C1560o.J()) {
                C1560o.S(1807016520, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardProbeCard.<anonymous> (DashboardComponents.kt:310)");
            }
            C4768p0 c4768p0J = C4755j.j(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, 0, null, 6, null);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c4768p0J;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ InterfaceC4718G<Float> g(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(aVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: DashboardComponents.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.dashboard.ui.DashboardComponentsKt$DashboardRecipeCard$2$1", f = "DashboardComponents.kt", l = {183}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lu0/H;", "Loa/F;", "<anonymous>", "(Lu0/H;)V"}, k = 3, mv = {2, 0, 0})
    static final class c extends kotlin.coroutines.jvm.internal.l implements Ba.p<InterfaceC4622H, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f7393B;

        /* renamed from: C, reason: collision with root package name */
        private /* synthetic */ Object f7394C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7395D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ Ba.a<C4153F> f7396E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(Ba.a<C4153F> aVar, Ba.a<C4153F> aVar2, InterfaceC4588d<? super c> interfaceC4588d) {
            super(2, interfaceC4588d);
            this.f7395D = aVar;
            this.f7396E = aVar2;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F n(Ba.a aVar, Ba.a aVar2, PointerInputChange pointerInputChange, float f10) {
            if (f10 >= 6.0f) {
                aVar.invoke();
            } else if (f10 < -6.0f) {
                aVar2.invoke();
            }
            return C4153F.f46609a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            c cVar = new c(this.f7395D, this.f7396E, interfaceC4588d);
            cVar.f7394C = obj;
            return cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f7393B;
            if (i10 == 0) {
                C4173r.b(obj);
                InterfaceC4622H interfaceC4622H = (InterfaceC4622H) this.f7394C;
                final Ba.a<C4153F> aVar = this.f7395D;
                final Ba.a<C4153F> aVar2 = this.f7396E;
                Ba.p pVar = new Ba.p() { // from class: J4.S
                    @Override // Ba.p
                    public final Object invoke(Object obj2, Object obj3) {
                        return Q.c.n(aVar, aVar2, (PointerInputChange) obj2, ((Float) obj3).floatValue());
                    }
                };
                this.f7393B = 1;
                if (C5030j.g(interfaceC4622H, null, null, null, pVar, this, 7, null) == objE) {
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

        @Override // Ba.p
        /* renamed from: m, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC4622H interfaceC4622H, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((c) create(interfaceC4622H, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }
    }

    /* compiled from: DashboardComponents.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class e implements Ba.q<C4762m0.a<Boolean>, InterfaceC1554l, Integer, InterfaceC4718G<Float>> {

        /* renamed from: B, reason: collision with root package name */
        public static final e f7403B = new e();

        e() {
        }

        public final InterfaceC4718G<Float> a(C4762m0.a<Boolean> animateFloat, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(animateFloat, "$this$animateFloat");
            interfaceC1554l.S(-475487089);
            if (C1560o.J()) {
                C1560o.S(-475487089, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardRecipeCard.<anonymous> (DashboardComponents.kt:114)");
            }
            C4768p0 c4768p0J = C4755j.j(Temperature.MAX_AMBIENT_SECOND_GEN_PROBE, 0, null, 6, null);
            if (C1560o.J()) {
                C1560o.R();
            }
            interfaceC1554l.I();
            return c4768p0J;
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ InterfaceC4718G<Float> g(C4762m0.a<Boolean> aVar, InterfaceC1554l interfaceC1554l, Integer num) {
            return a(aVar, interfaceC1554l, num.intValue());
        }
    }

    /* compiled from: DashboardComponents.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class f {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7404a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7405b;

        static {
            int[] iArr = new int[EnumC1600h.values().length];
            try {
                iArr[EnumC1600h.f14039B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1600h.f14045H.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1600h.f14040C.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1600h.f14041D.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1600h.f14042E.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1600h.f14043F.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1600h.f14044G.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7404a = iArr;
            int[] iArr2 = new int[EnumC1593a.values().length];
            try {
                iArr2[EnumC1593a.f14014C.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[EnumC1593a.f14015D.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[EnumC1593a.f14016E.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[EnumC1593a.f14017F.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            f7405b = iArr2;
        }
    }

    public static final void A(boolean z10, final EnumC1593a scaleType, final EnumC1600h contentType, float f10, final Ba.a<C4153F> onDelete, InterfaceC1554l interfaceC1554l, final int i10, final int i11) {
        b0.i iVarA;
        b0.i iVarM;
        TextStyle labelSmall;
        C3862t.g(scaleType, "scaleType");
        C3862t.g(contentType, "contentType");
        C3862t.g(onDelete, "onDelete");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1543868238);
        boolean z11 = true;
        boolean z12 = (i11 & 1) != 0 ? false : z10;
        float fU = (i11 & 8) != 0 ? U0.h.u(0) : f10;
        if (C1560o.J()) {
            C1560o.S(1543868238, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ActionsRow (DashboardComponents.kt:1142)");
        }
        int i12 = f.f7404a[contentType.ordinal()];
        if (i12 == 5) {
            interfaceC1554lR.S(-474581681);
            iVarA = androidx.compose.foundation.b.a(androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(z0.o0(contentType, scaleType))), D0.b.a(R.color.meater_red, interfaceC1554lR, 6), E.g.c(U0.h.u(14)));
            interfaceC1554lR.I();
        } else if (i12 != 6) {
            interfaceC1554lR.S(-473526224);
            if (z12) {
                interfaceC1554lR.S(-473492713);
                float f11 = 0;
                iVarA = androidx.compose.foundation.b.a(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.d(androidx.compose.foundation.layout.o.j(b0.i.INSTANCE, U0.h.u(f11), U0.h.u(f11)), 0.0f, 1, null), 0.0f, 1, null), D0.b.a(R.color.meater_red, interfaceC1554lR, 6), E.g.c(U0.h.u(14)));
                interfaceC1554lR.I();
            } else {
                interfaceC1554lR.S(-473073903);
                float f12 = 0;
                iVarA = androidx.compose.foundation.b.b(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.o.j(b0.i.INSTANCE, U0.h.u(f12), U0.h.u(f12)), fU), 0.0f, 1, null), D0.b.a(R.color.meater_red, interfaceC1554lR, 6), null, 2, null);
                interfaceC1554lR.I();
            }
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(-474040049);
            iVarA = androidx.compose.foundation.b.a(androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(z0.o0(contentType, scaleType))), D0.b.a(R.color.meater_red, interfaceC1554lR, 6), E.g.c(U0.h.u(14)));
            interfaceC1554lR.I();
        }
        int i13 = f.f7405b[scaleType.ordinal()];
        if (i13 == 1 || i13 == 2) {
            iVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.w(b0.i.INSTANCE, null, false, 3, null), 0.0f, 0.0f, U0.h.u(8), 0.0f, 11, null);
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            iVarM = androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.q(b0.i.INSTANCE, U0.h.u(80)), 0.0f, 0.0f, U0.h.u(8), 0.0f, 11, null);
        }
        b0.i iVar = iVarM;
        if (scaleType.compareTo(EnumC1593a.f14015D) <= 0) {
            interfaceC1554lR.S(-472275002);
            labelSmall = C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getBodyMedium();
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(-472218458);
            labelSmall = C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getLabelSmall();
            interfaceC1554lR.I();
        }
        TextStyle textStyle = labelSmall;
        i.Companion companion = b0.i.INSTANCE;
        interfaceC1554lR.S(1647338711);
        if ((((57344 & i10) ^ 24576) <= 16384 || !interfaceC1554lR.R(onDelete)) && (i10 & 24576) != 16384) {
            z11 = false;
        }
        Object objF = interfaceC1554lR.f();
        if (z11 || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new Ba.a() { // from class: J4.I
                @Override // Ba.a
                public final Object invoke() {
                    return Q.B(onDelete);
                }
            };
            interfaceC1554lR.J(objF);
        }
        interfaceC1554lR.I();
        b0.i iVarE = androidx.compose.foundation.d.d(companion, false, null, null, (Ba.a) objF, 7, null).e(iVarA);
        C0794b c0794b = C0794b.f54a;
        C0794b.d dVarC = c0794b.c();
        c.Companion companion2 = b0.c.INSTANCE;
        y0.I iB = A.U.b(dVarC, companion2.i(), interfaceC1554lR, 54);
        int iA = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarE);
        InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion3.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA, iB, companion3.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE2, companion3.d());
        A.X x10 = A.X.f45a;
        y0.I iA2 = C0799g.a(c0794b.f(), companion2.g(), interfaceC1554lR, 48);
        int iA3 = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
        b0.i iVarE3 = b0.h.e(interfaceC1554lR, companion);
        Ba.a<InterfaceC0828g> aVarA2 = companion3.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA2);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA2 = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA2, iA2, companion3.c());
        C1.b(interfaceC1554lA2, interfaceC1578xF2, companion3.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion3.b();
        if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA3))) {
            interfaceC1554lA2.J(Integer.valueOf(iA3));
            interfaceC1554lA2.k(Integer.valueOf(iA3), pVarB2);
        }
        C1.b(interfaceC1554lA2, iVarE3, companion3.d());
        C0802j c0802j = C0802j.f149a;
        final float f13 = fU;
        C1249A.a(onDelete, androidx.compose.foundation.layout.r.m(companion, U0.h.u(48)), false, null, null, C1227m.f7495a.a(), interfaceC1554lR, ((i10 >> 12) & 14) | 196656, 28);
        C1273Z.b(D0.h.a(R.string.end_cook_title, interfaceC1554lR, 6), iVar, D0.b.a(android.R.color.white, interfaceC1554lR, 6), 0L, null, FontWeight.INSTANCE.e(), T0.c(), 0L, null, R0.i.h(R0.i.INSTANCE.a()), 0L, 0, false, 2, 0, null, textStyle, interfaceC1554lR, 1769472, 3072, 56728);
        interfaceC1554lR.P();
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final boolean z13 = z12;
            w0Y.a(new Ba.p() { // from class: J4.J
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.C(z13, scaleType, contentType, f13, onDelete, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F B(Ba.a aVar) {
        aVar.invoke();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F C(boolean z10, EnumC1593a enumC1593a, EnumC1600h enumC1600h, float f10, Ba.a aVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        A(z10, enumC1593a, enumC1600h, f10, aVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }

    public static final void D(final String text, final float f10, final int i10, InterfaceC1554l interfaceC1554l, final int i11) {
        C3862t.g(text, "text");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(285540034);
        if (C1560o.J()) {
            C1560o.S(285540034, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.CircleStep (DashboardComponents.kt:1030)");
        }
        b0.i iVarA = androidx.compose.foundation.b.a(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.q(b0.i.INSTANCE, f10), f10), D0.b.a(R.color.meater_red, interfaceC1554lR, 6), E.g.f());
        y0.I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.e(), false);
        int iA = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, iVarA);
        InterfaceC0828g.Companion companion = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA, iH, companion.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion.d());
        androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
        int iA2 = R0.i.INSTANCE.a();
        long jE = U0.w.e(i10);
        AbstractC1341l abstractC1341lC = T0.c();
        C1273Z.b(text, null, C3602t0.INSTANCE.f(), jE, null, FontWeight.INSTANCE.e(), abstractC1341lC, 0L, null, R0.i.h(iA2), 0L, 0, false, 0, 0, null, null, interfaceC1554lR, (i11 & 14) | 1769856, 0, 130450);
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.F
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.E(text, f10, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F E(String str, float f10, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        D(str, f10, i10, interfaceC1554l, C1509K0.a(i11 | 1));
        return C4153F.f46609a;
    }

    public static final void F(final EnumC1593a scaleType, final String text, final b0.i modifier, final int i10, InterfaceC1554l interfaceC1554l, final int i11) {
        int i12;
        C3862t.g(scaleType, "scaleType");
        C3862t.g(text, "text");
        C3862t.g(modifier, "modifier");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-477849033);
        if (C1560o.J()) {
            C1560o.S(-477849033, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardCardSubTitle (DashboardComponents.kt:1005)");
        }
        int i13 = f.f7405b[scaleType.ordinal()];
        if (i13 == 1 || i13 == 2) {
            i12 = 2;
        } else {
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = Integer.MAX_VALUE;
        }
        int iB = R0.q.INSTANCE.b();
        int i14 = i11 >> 3;
        C1273Z.b(text, modifier, D0.b.a(R.color.dashboard_step_title, interfaceC1554lR, 6), U0.w.e(i10), null, FontWeight.INSTANCE.e(), T0.c(), 0L, null, null, 0L, iB, false, i12, 0, null, null, interfaceC1554lR, (i14 & 14) | 1769472 | (i14 & 112), 48, 120720);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.G
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.G(scaleType, text, modifier, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F G(EnumC1593a enumC1593a, String str, b0.i iVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        F(enumC1593a, str, iVar, i10, interfaceC1554l, C1509K0.a(i11 | 1));
        return C4153F.f46609a;
    }

    public static final void H(final String text, boolean z10, final EnumC1600h contentType, final K4.b bVar, InterfaceC1554l interfaceC1554l, final int i10, final int i11) {
        TextStyle headlineLarge;
        C3862t.g(text, "text");
        C3862t.g(contentType, "contentType");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1135757259);
        boolean z11 = (i11 & 2) != 0 ? false : z10;
        if (C1560o.J()) {
            C1560o.S(1135757259, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardCardTitle (DashboardComponents.kt:845)");
        }
        interfaceC1554lR.S(-1900454222);
        Object objF = interfaceC1554lR.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = z11 ? (contentType == EnumC1600h.f14039B && bVar == null) ? C1491B0.a(0.6f) : C1491B0.a(0.9f) : C1491B0.a(1.0f);
            interfaceC1554lR.J(objF);
        }
        InterfaceC1555l0 interfaceC1555l0 = (InterfaceC1555l0) objF;
        interfaceC1554lR.I();
        int i12 = z11 ? 1 : Integer.MAX_VALUE;
        if (contentType == EnumC1600h.f14040C || contentType == EnumC1600h.f14041D) {
            interfaceC1554lR.S(1216069484);
            headlineLarge = C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getHeadlineLarge();
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(1216128911);
            headlineLarge = C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getTitleLarge();
            interfaceC1554lR.I();
        }
        C1273Z.b(text, androidx.compose.foundation.layout.r.g(b0.i.INSTANCE, I(interfaceC1555l0)), D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, FontWeight.INSTANCE.c(), T0.a(), 0L, null, null, 0L, R0.q.INSTANCE.b(), false, i12, 0, null, headlineLarge, interfaceC1554lR, (i10 & 14) | 1769472, 48, 55192);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final boolean z12 = z11;
            w0Y.a(new Ba.p() { // from class: J4.z
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.J(text, z12, contentType, bVar, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final float I(InterfaceC1555l0 interfaceC1555l0) {
        return interfaceC1555l0.b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F J(String str, boolean z10, EnumC1600h enumC1600h, K4.b bVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        H(str, z10, enumC1600h, bVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x03c5  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x03cb  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x03dd  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x03e3  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0417  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x042a  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x0470  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x047c  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x0480  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x049f  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x04ad  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x04e3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x04ef  */
    /* JADX WARN: Removed duplicated region for block: B:147:0x04f3  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x0512  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0520  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x0545  */
    /* JADX WARN: Removed duplicated region for block: B:182:0x061c  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0654  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x0660  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0664  */
    /* JADX WARN: Removed duplicated region for block: B:192:0x0683  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x0691  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x06b8  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x06c0  */
    /* JADX WARN: Removed duplicated region for block: B:203:0x06c7  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x06dd  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x078b  */
    /* JADX WARN: Removed duplicated region for block: B:227:0x078d  */
    /* JADX WARN: Removed duplicated region for block: B:230:0x07be  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x08d7  */
    /* JADX WARN: Removed duplicated region for block: B:259:0x0989  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x09a0  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x09bd  */
    /* JADX WARN: Removed duplicated region for block: B:317:0x0c1e  */
    /* JADX WARN: Removed duplicated region for block: B:324:0x0c4b  */
    /* JADX WARN: Removed duplicated region for block: B:327:0x0c7b  */
    /* JADX WARN: Removed duplicated region for block: B:330:0x0c84  */
    /* JADX WARN: Removed duplicated region for block: B:332:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01d3  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01ef  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0205  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x026f  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x02a7  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x02d5  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0304  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0344  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x034a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0387  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x038d  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x039b  */
    @android.annotation.SuppressLint({"UnusedTransitionTargetStateParameter"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void K(final P5.EnumC1600h r50, final P5.EnumC1593a r51, final com.apptionlabs.meater_app.model.Probe r52, final K4.b r53, final T4.v r54, final boolean r55, final float r56, final Ba.l<? super U0.h, oa.C4153F> r57, final Ba.a<oa.C4153F> r58, final Ba.a<oa.C4153F> r59, final Ba.a<oa.C4153F> r60, kotlin.InterfaceC1554l r61, final int r62, final int r63) {
        /*
            Method dump skipped, instructions count: 3386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.Q.K(P5.h, P5.a, com.apptionlabs.meater_app.model.Probe, K4.b, T4.v, boolean, float, Ba.l, Ba.a, Ba.a, Ba.a, O.l, int, int):void");
    }

    private static final String L(InterfaceC1563p0<String> interfaceC1563p0) {
        return interfaceC1563p0.getValue();
    }

    private static final void M(InterfaceC1563p0<String> interfaceC1563p0, String str) {
        interfaceC1563p0.setValue(str);
    }

    private static final float N(x1<Float> x1Var) {
        return x1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0.n O(x1 x1Var, U0.d offset) {
        C3862t.g(offset, "$this$offset");
        return U0.n.b(U0.o.a(Da.a.c(N(x1Var)), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F P(Ba.l lVar, U0.d dVar, InterfaceC5116v coordinates) {
        C3862t.g(coordinates, "coordinates");
        lVar.invoke(U0.h.p(dVar.E0(U0.r.f(coordinates.a()))));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F Q(Ba.a aVar) {
        aVar.invoke();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final StepProgressView R(K4.b bVar, Context context) {
        C3862t.g(context, "context");
        StepProgressView stepProgressView = new StepProgressView(context, null, 2, null);
        List listX0 = Ub.n.x0(bVar.getProgressData(), new String[]{","}, false, 0, 6, null);
        ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listX0, 10));
        Iterator it = listX0.iterator();
        while (it.hasNext()) {
            arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
        }
        stepProgressView.b(arrayList, bVar.getStepNumber());
        stepProgressView.setOnClickListener(new View.OnClickListener() { // from class: J4.y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                Q.S(view);
            }
        });
        return stepProgressView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F T(K4.b bVar, StepProgressView view) {
        C3862t.g(view, "view");
        view.setCurrentStep(bVar.getStepNumber());
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F U(EnumC1600h enumC1600h, EnumC1593a enumC1593a, Probe probe, K4.b bVar, T4.v vVar, boolean z10, float f10, Ba.l lVar, Ba.a aVar, Ba.a aVar2, Ba.a aVar3, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        K(enumC1600h, enumC1593a, probe, bVar, vVar, z10, f10, lVar, aVar, aVar2, aVar3, interfaceC1554l, C1509K0.a(i10 | 1), C1509K0.a(i11));
        return C4153F.f46609a;
    }

    @SuppressLint({"UnusedTransitionTargetStateParameter"})
    public static final void V(final EnumC1600h contentType, final EnumC1593a scaleType, final String recipeTitle, final K4.b onGoingRecipe, final boolean z10, final float f10, final Ba.l<? super U0.h, C4153F> cardHeightIs, final Ba.a<C4153F> onExpand, final Ba.a<C4153F> onCollapse, final Ba.a<C4153F> onClick, InterfaceC1554l interfaceC1554l, final int i10) {
        b0.i iVarS;
        b0.i iVarL;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(recipeTitle, "recipeTitle");
        C3862t.g(onGoingRecipe, "onGoingRecipe");
        C3862t.g(cardHeightIs, "cardHeightIs");
        C3862t.g(onExpand, "onExpand");
        C3862t.g(onCollapse, "onCollapse");
        C3862t.g(onClick, "onClick");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(998901512);
        if (C1560o.J()) {
            C1560o.S(998901512, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardRecipeCard (DashboardComponents.kt:100)");
        }
        interfaceC1554lR.S(-681400903);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        Object obj = objF;
        if (objF == companion.a()) {
            C4732V c4732v = new C4732V(Boolean.valueOf(z10));
            c4732v.h(Boolean.valueOf(!z10));
            interfaceC1554lR.J(c4732v);
            obj = c4732v;
        }
        interfaceC1554lR.I();
        final U0.d dVar = (U0.d) interfaceC1554lR.o(C2013e0.d());
        C4762m0 c4762m0D = C4764n0.d((C4732V) obj, "cardTransition", interfaceC1554lR, C4732V.f50654d | 48, 0);
        e eVar = e.f7403B;
        InterfaceC4770q0<Float, C4761m> interfaceC4770q0I = C4774s0.i(C3856m.f44008a);
        ((Boolean) c4762m0D.g()).booleanValue();
        interfaceC1554lR.S(2099854666);
        if (C1560o.J()) {
            C1560o.S(2099854666, 0, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardRecipeCard.<anonymous> (DashboardComponents.kt:115)");
        }
        float f11 = z10 ? -f10 : 0.0f;
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554lR.I();
        Float fValueOf = Float.valueOf(f11);
        ((Boolean) c4762m0D.k()).booleanValue();
        interfaceC1554lR.S(2099854666);
        if (C1560o.J()) {
            C1560o.S(2099854666, 0, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardRecipeCard.<anonymous> (DashboardComponents.kt:115)");
        }
        float f12 = z10 ? -f10 : 0.0f;
        if (C1560o.J()) {
            C1560o.R();
        }
        interfaceC1554lR.I();
        final x1 x1VarB = C4764n0.b(c4762m0D, fValueOf, Float.valueOf(f12), eVar.g(c4762m0D.i(), interfaceC1554lR, 0), interfaceC4770q0I, "cardOffsetTransition", interfaceC1554lR, 196608);
        int[] iArr = f.f7404a;
        switch (iArr[contentType.ordinal()]) {
            case 1:
            case 2:
                iVarS = androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                break;
            case 3:
            case 4:
                iVarS = androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                break;
            case 5:
                iVarS = androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(z0.o0(contentType, scaleType)));
                break;
            case 6:
                iVarS = androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(z0.o0(contentType, scaleType)));
                break;
            case 7:
                iVarS = androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), null, false, 3, null);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[contentType.ordinal()]) {
            case 1:
            case 2:
                float f13 = 12;
                float f14 = 8;
                iVarL = androidx.compose.foundation.layout.o.l(b0.i.INSTANCE, U0.h.u(f13), U0.h.u(f14), U0.h.u(f14), U0.h.u(f13));
                break;
            case 3:
            case 4:
                float f15 = 24;
                float f16 = 12;
                iVarL = androidx.compose.foundation.layout.o.l(b0.i.INSTANCE, U0.h.u(f15), U0.h.u(f16), U0.h.u(f15), U0.h.u(f16));
                break;
            case 5:
            case 6:
                float f17 = 24;
                iVarL = androidx.compose.foundation.layout.o.l(b0.i.INSTANCE, U0.h.u(f17), U0.h.u(20), U0.h.u(f17), U0.h.u(8));
                break;
            case 7:
                float f18 = 24;
                float f19 = 12;
                iVarL = androidx.compose.foundation.layout.o.l(b0.i.INSTANCE, U0.h.u(f18), U0.h.u(f19), U0.h.u(f18), U0.h.u(f19));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        i.Companion companion2 = b0.i.INSTANCE;
        interfaceC1554lR.S(-681316555);
        boolean zR = interfaceC1554lR.R(x1VarB);
        Object objF2 = interfaceC1554lR.f();
        if (zR || objF2 == companion.a()) {
            objF2 = new Ba.l() { // from class: J4.p
                @Override // Ba.l
                public final Object invoke(Object obj2) {
                    return Q.Y(x1VarB, (U0.d) obj2);
                }
            };
            interfaceC1554lR.J(objF2);
        }
        interfaceC1554lR.I();
        b0.i iVarA = androidx.compose.foundation.layout.l.a(companion2, (Ba.l) objF2);
        C4153F c4153f = C4153F.f46609a;
        interfaceC1554lR.S(-681313758);
        boolean z11 = ((((29360128 & i10) ^ 12582912) > 8388608 && interfaceC1554lR.R(onExpand)) || (i10 & 12582912) == 8388608) | ((((234881024 & i10) ^ 100663296) > 67108864 && interfaceC1554lR.R(onCollapse)) || (i10 & 100663296) == 67108864);
        Object objF3 = interfaceC1554lR.f();
        if (z11 || objF3 == companion.a()) {
            objF3 = new c(onCollapse, onExpand, null);
            interfaceC1554lR.J(objF3);
        }
        interfaceC1554lR.I();
        b0.i iVarC = C4631Q.c(iVarA, c4153f, (Ba.p) objF3);
        interfaceC1554lR.S(-681303720);
        boolean zR2 = interfaceC1554lR.R(dVar) | ((((3670016 & i10) ^ 1572864) > 1048576 && interfaceC1554lR.R(cardHeightIs)) || (i10 & 1572864) == 1048576);
        Object objF4 = interfaceC1554lR.f();
        if (zR2 || objF4 == companion.a()) {
            objF4 = new Ba.l() { // from class: J4.A
                @Override // Ba.l
                public final Object invoke(Object obj2) {
                    return Q.Z(cardHeightIs, dVar, (InterfaceC5116v) obj2);
                }
            };
            interfaceC1554lR.J(objF4);
        }
        interfaceC1554lR.I();
        C1293n.a(onClick, androidx.compose.ui.layout.c.a(iVarC, (Ba.l) objF4).e(iVarS), false, E.g.c(U0.h.u(12)), new C1290k(D0.b.a(R.color.dashboard_card_background, interfaceC1554lR, 6), D0.b.a(R.color.white, interfaceC1554lR, 6), D0.b.a(R.color.grey_66, interfaceC1554lR, 6), D0.b.a(R.color.grey_66, interfaceC1554lR, 6), null), C1291l.f8472a.b(U0.h.u(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC1554lR, (C1291l.f8473b << 18) | 6, 62), null, null, W.c.d(1447354291, true, new d(iVarL, recipeTitle, contentType, onGoingRecipe, scaleType), interfaceC1554lR, 54), interfaceC1554lR, ((i10 >> 27) & 14) | 100663296, 196);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.H
                @Override // Ba.p
                public final Object invoke(Object obj2, Object obj3) {
                    return Q.W(contentType, scaleType, recipeTitle, onGoingRecipe, z10, f10, cardHeightIs, onExpand, onCollapse, onClick, i10, (InterfaceC1554l) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F W(EnumC1600h enumC1600h, EnumC1593a enumC1593a, String str, K4.b bVar, boolean z10, float f10, Ba.l lVar, Ba.a aVar, Ba.a aVar2, Ba.a aVar3, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        V(enumC1600h, enumC1593a, str, bVar, z10, f10, lVar, aVar, aVar2, aVar3, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    private static final float X(x1<Float> x1Var) {
        return x1Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final U0.n Y(x1 x1Var, U0.d offset) {
        C3862t.g(offset, "$this$offset");
        return U0.n.b(U0.o.a(Da.a.c(X(x1Var)), 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F Z(Ba.l lVar, U0.d dVar, InterfaceC5116v coordinates) {
        C3862t.g(coordinates, "coordinates");
        lVar.invoke(U0.h.p(dVar.E0(U0.r.f(coordinates.a()))));
        return C4153F.f46609a;
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x0146  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a0(final b0.i r26, final com.apptionlabs.meater_app.model.Probe r27, kotlin.InterfaceC1554l r28, final int r29) {
        /*
            Method dump skipped, instructions count: 461
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.Q.a0(b0.i, com.apptionlabs.meater_app.model.Probe, O.l, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F b0(b0.i iVar, Probe probe, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        a0(iVar, probe, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void c0(final EnumC1600h contentType, final b0.i modifier, final Probe device, final T4.v vVar, InterfaceC1554l interfaceC1554l, final int i10) {
        C3862t.g(contentType, "contentType");
        C3862t.g(modifier, "modifier");
        C3862t.g(device, "device");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(844859594);
        if (C1560o.J()) {
            C1560o.S(844859594, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DialAndroidView (DashboardComponents.kt:1100)");
        }
        interfaceC1554lR.S(1556468860);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = f1.a(Calendar.getInstance().getTimeInMillis());
            interfaceC1554lR.J(objF);
        }
        final InterfaceC1559n0 interfaceC1559n0 = (InterfaceC1559n0) objF;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1556472012);
        Object objF2 = interfaceC1554lR.f();
        if (objF2 == companion.a()) {
            objF2 = r1.c(contentType, null, 2, null);
            interfaceC1554lR.J(objF2);
        }
        final InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF2;
        interfaceC1554lR.I();
        final Context context = (Context) interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        i.Companion companion2 = b0.i.INSTANCE;
        interfaceC1554lR.S(1556478636);
        Object objF3 = interfaceC1554lR.f();
        if (objF3 == companion.a()) {
            objF3 = new Ba.a() { // from class: J4.t
                @Override // Ba.a
                public final Object invoke() {
                    return Q.h0();
                }
            };
            interfaceC1554lR.J(objF3);
        }
        interfaceC1554lR.I();
        b0.i iVarE = modifier.e(androidx.compose.foundation.d.d(companion2, false, null, null, (Ba.a) objF3, 7, null));
        interfaceC1554lR.S(1556481024);
        boolean zL = interfaceC1554lR.l(context) | ((((i10 & 7168) ^ 3072) > 2048 && interfaceC1554lR.l(vVar)) || (i10 & 3072) == 2048);
        Object objF4 = interfaceC1554lR.f();
        if (zL || objF4 == companion.a()) {
            objF4 = new Ba.l() { // from class: J4.u
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return Q.i0(context, vVar, (Context) obj);
                }
            };
            interfaceC1554lR.J(objF4);
        }
        Ba.l lVar = (Ba.l) objF4;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1556492510);
        Object objF5 = interfaceC1554lR.f();
        if (objF5 == companion.a()) {
            objF5 = new Ba.l() { // from class: J4.v
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return Q.j0((DialComponent) obj);
                }
            };
            interfaceC1554lR.J(objF5);
        }
        Ba.l lVar2 = (Ba.l) objF5;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1556485074);
        boolean zL2 = interfaceC1554lR.l(device) | ((((i10 & 14) ^ 6) > 4 && interfaceC1554lR.R(contentType)) || (i10 & 6) == 4);
        Object objF6 = interfaceC1554lR.f();
        if (zL2 || objF6 == companion.a()) {
            objF6 = new Ba.l() { // from class: J4.w
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return Q.k0(device, contentType, interfaceC1559n0, interfaceC1563p0, (DialComponent) obj);
                }
            };
            interfaceC1554lR.J(objF6);
        }
        interfaceC1554lR.I();
        androidx.compose.ui.viewinterop.e.a(lVar, iVarE, lVar2, null, (Ba.l) objF6, interfaceC1554lR, 384, 8);
        e0(interfaceC1559n0, Calendar.getInstance().getTimeInMillis());
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.x
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.l0(contentType, modifier, device, vVar, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long d0(InterfaceC1559n0 interfaceC1559n0) {
        return interfaceC1559n0.a();
    }

    private static final void e0(InterfaceC1559n0 interfaceC1559n0, long j10) {
        interfaceC1559n0.k(j10);
    }

    private static final EnumC1600h f0(InterfaceC1563p0<EnumC1600h> interfaceC1563p0) {
        return interfaceC1563p0.getValue();
    }

    private static final void g0(InterfaceC1563p0<EnumC1600h> interfaceC1563p0, EnumC1600h enumC1600h) {
        interfaceC1563p0.setValue(enumC1600h);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F h0() {
        U4.b.t("Dial Clicked", new Object[0]);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final DialComponent i0(Context context, T4.v vVar, Context it) {
        C3862t.g(it, "it");
        return new DialComponent(context, Boolean.TRUE, vVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j0(DialComponent it) {
        C3862t.g(it, "it");
        it.l();
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F k0(Probe probe, EnumC1600h enumC1600h, InterfaceC1559n0 interfaceC1559n0, InterfaceC1563p0 interfaceC1563p0, DialComponent it) {
        C3862t.g(it, "it");
        it.r(probe, Long.valueOf(d0(interfaceC1559n0)));
        if (f0(interfaceC1563p0) != enumC1600h) {
            it.p();
            g0(interfaceC1563p0, enumC1600h);
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F l0(EnumC1600h enumC1600h, b0.i iVar, Probe probe, T4.v vVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        c0(enumC1600h, iVar, probe, vVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void m0(final b0.i modifier, final Probe device, T4.v vVar, InterfaceC1554l interfaceC1554l, final int i10, final int i11) {
        C3862t.g(modifier, "modifier");
        C3862t.g(device, "device");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1837359712);
        final T4.v vVar2 = (i11 & 4) != 0 ? null : vVar;
        if (C1560o.J()) {
            C1560o.S(1837359712, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ProbeConnectionStatusView (DashboardComponents.kt:1058)");
        }
        interfaceC1554lR.S(607982973);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = f1.a(Calendar.getInstance().getTimeInMillis());
            interfaceC1554lR.J(objF);
        }
        final InterfaceC1559n0 interfaceC1559n0 = (InterfaceC1559n0) objF;
        interfaceC1554lR.I();
        final Context context = (Context) interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        i.Companion companion2 = b0.i.INSTANCE;
        interfaceC1554lR.S(607990328);
        boolean zL = ((((i10 & 896) ^ 384) > 256 && interfaceC1554lR.l(vVar2)) || (i10 & 384) == 256) | interfaceC1554lR.l(device) | interfaceC1554lR.l(context);
        Object objF2 = interfaceC1554lR.f();
        if (zL || objF2 == companion.a()) {
            objF2 = new Ba.a() { // from class: J4.B
                @Override // Ba.a
                public final Object invoke() {
                    return Q.p0(vVar2, device, context);
                }
            };
            interfaceC1554lR.J(objF2);
        }
        interfaceC1554lR.I();
        b0.i iVarE = modifier.e(androidx.compose.foundation.d.d(companion2, false, null, null, (Ba.a) objF2, 7, null));
        y0.I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.j(), interfaceC1554lR, 48);
        int iA2 = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarE);
        InterfaceC0828g.Companion companion3 = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion3.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA, iA, companion3.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion3.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion3.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
            interfaceC1554lA.J(Integer.valueOf(iA2));
            interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE2, companion3.d());
        C0802j c0802j = C0802j.f149a;
        interfaceC1554lR.S(1358846432);
        boolean zL2 = interfaceC1554lR.l(context);
        Object objF3 = interfaceC1554lR.f();
        if (zL2 || objF3 == companion.a()) {
            objF3 = new Ba.l() { // from class: J4.C
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return Q.q0(context, (Context) obj);
                }
            };
            interfaceC1554lR.J(objF3);
        }
        Ba.l lVar = (Ba.l) objF3;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1358850462);
        boolean zL3 = interfaceC1554lR.l(device);
        Object objF4 = interfaceC1554lR.f();
        if (zL3 || objF4 == companion.a()) {
            objF4 = new Ba.l() { // from class: J4.D
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return Q.r0(device, interfaceC1559n0, (ProbeConnectionStatusView) obj);
                }
            };
            interfaceC1554lR.J(objF4);
        }
        interfaceC1554lR.I();
        androidx.compose.ui.viewinterop.e.b(lVar, modifier, (Ba.l) objF4, interfaceC1554lR, (i10 << 3) & 112, 0);
        interfaceC1554lR.P();
        o0(interfaceC1559n0, Calendar.getInstance().getTimeInMillis());
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final T4.v vVar3 = vVar2;
            w0Y.a(new Ba.p() { // from class: J4.E
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.s0(modifier, device, vVar3, i10, i11, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long n0(InterfaceC1559n0 interfaceC1559n0) {
        return interfaceC1559n0.a();
    }

    private static final void o0(InterfaceC1559n0 interfaceC1559n0, long j10) {
        interfaceC1559n0.k(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F p0(T4.v vVar, Probe probe, Context context) {
        if (vVar != null) {
            vVar.a(probe);
        } else if (probe.getParentDevice() != null) {
            C3862t.e(context, "null cannot be cast to non-null type android.app.Activity");
            MEATERDevice parentDevice = probe.getParentDevice();
            C3862t.d(parentDevice);
            v0((Activity) context, parentDevice);
        } else {
            C3862t.e(context, "null cannot be cast to non-null type android.app.Activity");
            v0((Activity) context, probe);
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProbeConnectionStatusView q0(Context context, Context it) {
        C3862t.g(it, "it");
        return new ProbeConnectionStatusView(context, Boolean.TRUE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F r0(Probe probe, InterfaceC1559n0 interfaceC1559n0, ProbeConnectionStatusView view) {
        C3862t.g(view, "view");
        view.h(probe, Long.valueOf(n0(interfaceC1559n0)));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F s0(b0.i iVar, Probe probe, T4.v vVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        m0(iVar, probe, vVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }

    public static final void t0(final EnumC1600h contentType, final EnumC1593a scaleType, final int i10, final String stepTitle, boolean z10, InterfaceC1554l interfaceC1554l, final int i11, final int i12) {
        float fU;
        int i13;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(stepTitle, "stepTitle");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(690452835);
        boolean z11 = (i12 & 16) != 0 ? false : z10;
        if (C1560o.J()) {
            C1560o.S(690452835, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.StepNumberAndStepTitle (DashboardComponents.kt:895)");
        }
        boolean z12 = scaleType.compareTo(EnumC1593a.f14015D) > 0 ? false : z11;
        interfaceC1554lR.S(1596133576);
        Object objF = interfaceC1554lR.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = C1491B0.a(1.0f);
            interfaceC1554lR.J(objF);
        }
        InterfaceC1555l0 interfaceC1555l0 = (InterfaceC1555l0) objF;
        interfaceC1554lR.I();
        interfaceC1555l0.f(z12 ? 0.5f : 1.0f);
        float fontScale = ((U0.d) interfaceC1554lR.o(C2013e0.d())).getFontScale();
        c.InterfaceC0420c interfaceC0420cL = b0.c.INSTANCE.l();
        i.Companion companion = b0.i.INSTANCE;
        y0.I iB = A.U.b(C0794b.f54a.e(), interfaceC0420cL, interfaceC1554lR, 48);
        int iA = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, companion);
        InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion2.a();
        if (interfaceC1554lR.w() == null) {
            C1550j.c();
        }
        interfaceC1554lR.t();
        if (interfaceC1554lR.getInserting()) {
            interfaceC1554lR.T(aVarA);
        } else {
            interfaceC1554lR.H();
        }
        InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554lR);
        C1.b(interfaceC1554lA, iB, companion2.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion2.d());
        A.X x10 = A.X.f45a;
        int[] iArr = f.f7404a;
        switch (iArr[contentType.ordinal()]) {
            case 1:
                fU = U0.h.u(22);
                break;
            case 2:
                fU = U0.h.u(20);
                break;
            case 3:
                fU = U0.h.u(30);
                break;
            case 4:
                fU = U0.h.u(24);
                break;
            case 5:
            case 6:
                fU = U0.h.u(24);
                break;
            case 7:
                fU = U0.h.u(20);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        float fU2 = U0.h.u(fU * fontScale);
        switch (iArr[contentType.ordinal()]) {
            case 1:
                i13 = 13;
                break;
            case 2:
                i13 = 12;
                break;
            case 3:
            case 4:
                i13 = 20;
                break;
            case 5:
            case 6:
                i13 = 16;
                break;
            case 7:
                i13 = 14;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        int i14 = 18;
        switch (iArr[contentType.ordinal()]) {
            case 1:
            case 2:
            case 5:
            case 6:
            case 7:
                break;
            case 3:
            case 4:
                i14 = 22;
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        D(String.valueOf(i10), fU2, i13, interfaceC1554lR, 0);
        A.Y.a(androidx.compose.foundation.layout.r.q(companion, U0.h.u(8)), interfaceC1554lR, 6);
        F(scaleType, stepTitle, androidx.compose.foundation.layout.r.g(companion, interfaceC1555l0.getValue().floatValue()), i14, interfaceC1554lR, ((i11 >> 3) & 14) | ((i11 >> 6) & 112));
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final boolean z13 = z11;
            w0Y.a(new Ba.p() { // from class: J4.s
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return Q.u0(contentType, scaleType, i10, stepTitle, z13, i11, i12, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F u0(EnumC1600h enumC1600h, EnumC1593a enumC1593a, int i10, String str, boolean z10, int i11, int i12, InterfaceC1554l interfaceC1554l, int i13) {
        t0(enumC1600h, enumC1593a, i10, str, z10, interfaceC1554l, C1509K0.a(i11 | 1), i12);
        return C4153F.f46609a;
    }

    public static final void v0(Activity activity, MEATERDevice device) {
        C3862t.g(activity, "activity");
        C3862t.g(device, "device");
        ConnectionsControllerActivity.n3(activity, device);
    }

    /* compiled from: DashboardComponents.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements Ba.q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ b0.i f7397B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ String f7398C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ EnumC1600h f7399D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ K4.b f7400E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ EnumC1593a f7401F;

        /* compiled from: DashboardComponents.kt */
        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f7402a;

            static {
                int[] iArr = new int[EnumC1600h.values().length];
                try {
                    iArr[EnumC1600h.f14042E.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[EnumC1600h.f14043F.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f7402a = iArr;
            }
        }

        d(b0.i iVar, String str, EnumC1600h enumC1600h, K4.b bVar, EnumC1593a enumC1593a) {
            this.f7397B = iVar;
            this.f7398C = str;
            this.f7399D = enumC1600h;
            this.f7400E = bVar;
            this.f7401F = enumC1593a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final StepProgressView i(K4.b bVar, Context context) {
            C3862t.g(context, "context");
            StepProgressView stepProgressView = new StepProgressView(context, null, 2, null);
            List listX0 = Ub.n.x0(bVar.getProgressData(), new String[]{","}, false, 0, 6, null);
            ArrayList arrayList = new ArrayList(kotlin.collections.r.x(listX0, 10));
            Iterator it = listX0.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Integer.parseInt((String) it.next())));
            }
            stepProgressView.b(arrayList, bVar.getStepNumber());
            stepProgressView.setOnClickListener(new View.OnClickListener() { // from class: J4.V
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    Q.d.j(view);
                }
            });
            return stepProgressView;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final C4153F m(K4.b bVar, StepProgressView view) {
            C3862t.g(view, "view");
            view.setCurrentStep(bVar.getStepNumber());
            return C4153F.f46609a;
        }

        public final void d(InterfaceC0801i Card, InterfaceC1554l interfaceC1554l, int i10) {
            i.Companion companion;
            int i11;
            C3862t.g(Card, "$this$Card");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1447354291, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.DashboardRecipeCard.<anonymous> (DashboardComponents.kt:205)");
            }
            b0.i iVar = this.f7397B;
            String str = this.f7398C;
            EnumC1600h enumC1600h = this.f7399D;
            final K4.b bVar = this.f7400E;
            EnumC1593a enumC1593a = this.f7401F;
            y0.I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554l, 0);
            int iA2 = C1550j.a(interfaceC1554l, 0);
            InterfaceC1578x interfaceC1578xF = interfaceC1554l.F();
            b0.i iVarE = b0.h.e(interfaceC1554l, iVar);
            InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
            Ba.a<InterfaceC0828g> aVarA = companion2.a();
            if (interfaceC1554l.w() == null) {
                C1550j.c();
            }
            interfaceC1554l.t();
            if (interfaceC1554l.getInserting()) {
                interfaceC1554l.T(aVarA);
            } else {
                interfaceC1554l.H();
            }
            InterfaceC1554l interfaceC1554lA = C1.a(interfaceC1554l);
            C1.b(interfaceC1554lA, iA, companion2.c());
            C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
            Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
            if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                interfaceC1554lA.J(Integer.valueOf(iA2));
                interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
            }
            C1.b(interfaceC1554lA, iVarE, companion2.d());
            C0802j c0802j = C0802j.f149a;
            Q.H(str, false, enumC1600h, bVar, interfaceC1554l, 0, 2);
            i.Companion companion3 = b0.i.INSTANCE;
            A.Y.a(androidx.compose.foundation.layout.r.i(companion3, U0.h.u(8)), interfaceC1554l, 6);
            Q.t0(enumC1600h, enumC1593a, bVar.getStepNumber() + 1, bVar.getStepTitle(), false, interfaceC1554l, 0, 16);
            interfaceC1554l.S(-822453550);
            if (enumC1593a.compareTo(EnumC1593a.f14015D) <= 0) {
                int i12 = a.f7402a[enumC1600h.ordinal()];
                if (i12 == 1 || i12 == 2) {
                    companion = companion3;
                    i11 = 6;
                    interfaceC1554l.S(273912616);
                    A.Y.a(InterfaceC0801i.c(c0802j, companion, 1.0f, false, 2, null), interfaceC1554l, 0);
                    interfaceC1554l.I();
                } else {
                    interfaceC1554l.S(274026789);
                    companion = companion3;
                    i11 = 6;
                    A.Y.a(androidx.compose.foundation.layout.r.i(companion, U0.h.u(16)), interfaceC1554l, 6);
                    interfaceC1554l.I();
                }
                if (bVar.getProgressData().length() > 0) {
                    b0.i iVarI = androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(companion, 0.0f, 1, null), U0.h.u(3));
                    interfaceC1554l.S(-822432048);
                    boolean zL = interfaceC1554l.l(bVar);
                    Object objF = interfaceC1554l.f();
                    if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                        objF = new Ba.l() { // from class: J4.T
                            @Override // Ba.l
                            public final Object invoke(Object obj) {
                                return Q.d.i(bVar, (Context) obj);
                            }
                        };
                        interfaceC1554l.J(objF);
                    }
                    Ba.l lVar = (Ba.l) objF;
                    interfaceC1554l.I();
                    interfaceC1554l.S(-822411599);
                    boolean zL2 = interfaceC1554l.l(bVar);
                    Object objF2 = interfaceC1554l.f();
                    if (zL2 || objF2 == InterfaceC1554l.INSTANCE.a()) {
                        objF2 = new Ba.l() { // from class: J4.U
                            @Override // Ba.l
                            public final Object invoke(Object obj) {
                                return Q.d.m(bVar, (StepProgressView) obj);
                            }
                        };
                        interfaceC1554l.J(objF2);
                    }
                    interfaceC1554l.I();
                    androidx.compose.ui.viewinterop.e.b(lVar, iVarI, (Ba.l) objF2, interfaceC1554l, 48, 0);
                }
            } else {
                companion = companion3;
                i11 = 6;
            }
            interfaceC1554l.I();
            interfaceC1554l.S(-822405799);
            if (enumC1600h == EnumC1600h.f14042E) {
                A.Y.a(androidx.compose.foundation.layout.r.i(companion, U0.h.u(i11)), interfaceC1554l, i11);
            }
            interfaceC1554l.I();
            interfaceC1554l.P();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(InterfaceC0801i interfaceC0801i, InterfaceC1554l interfaceC1554l, Integer num) {
            d(interfaceC0801i, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void j(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void S(View view) {
    }
}
