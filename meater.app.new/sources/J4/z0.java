package J4;

import A.C0794b;
import A.C0799g;
import A.C0802j;
import A.InterfaceC0801i;
import A0.InterfaceC0828g;
import B.C0879h;
import B.InterfaceC0873b;
import I4.DeviceInfo;
import N.WindowSizeClass;
import P5.EnumC1593a;
import P5.EnumC1600h;
import T4.k;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import b0.c;
import b0.i;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.ConnectionsControllerActivity;
import com.apptionlabs.meater_app.activities.MeaterDetailsActivity;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.MEATERIntent;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.qsg.ui.base.QSGActivity;
import com.apptionlabs.meater_app.recipe.ui.recipe.RecipeStepsActivity;
import e.C3106c;
import e.C3109f;
import f0.C3303d;
import g.C3369a;
import g5.EnumC3427c;
import h.C3469d;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import kotlin.AbstractC1341l;
import kotlin.C1;
import kotlin.C1252D;
import kotlin.C1266S;
import kotlin.C1273Z;
import kotlin.C1277b0;
import kotlin.C1282e;
import kotlin.C1289j;
import kotlin.C1290k;
import kotlin.C1291l;
import kotlin.C1293n;
import kotlin.C1509K0;
import kotlin.C1550j;
import kotlin.C1560o;
import kotlin.FontWeight;
import kotlin.InterfaceC1279c0;
import kotlin.InterfaceC1554l;
import kotlin.InterfaceC1563p0;
import kotlin.InterfaceC1578x;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.W0;
import kotlin.jvm.internal.AbstractC3864v;
import kotlin.jvm.internal.C3862t;
import kotlin.r1;
import kotlin.x1;
import oa.C4153F;
import ra.C4370a;

/* compiled from: MainScreen.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\u001aI\u0010\r\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u0006\u0010\u000b\u001a\u00020\nH\u0007¢\u0006\u0004\b\r\u0010\u000e\u001a[\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0001\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u000b\u001a\u00020\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018\u001aW\u0010\u001f\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015H\u0007¢\u0006\u0004\b\u001f\u0010 \u001a\u0017\u0010!\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u0019H\u0007¢\u0006\u0004\b!\u0010\"\u001a'\u0010%\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010$\u001a\u00020#H\u0007¢\u0006\u0004\b%\u0010&\u001a;\u0010)\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010(\u001a\u00020'2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b)\u0010*\u001a;\u0010-\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+2\b\u0010$\u001a\u0004\u0018\u00010#2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0007¢\u0006\u0004\b-\u0010.\u001a'\u00100\u001a\u00020\f2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010,\u001a\u00020+2\u0006\u0010/\u001a\u00020\u000fH\u0007¢\u0006\u0004\b0\u00101\u001a5\u00105\u001a\u0002042\b\b\u0002\u00103\u001a\u0002022\u0006\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\u001c\u001a\u00020\u001bH\u0007¢\u0006\u0004\b5\u00106\u001a\u001d\u00109\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b9\u0010:\u001a\u001d\u0010;\u001a\u00020\f2\u0006\u00108\u001a\u0002072\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b;\u0010<\u001a\u0015\u0010=\u001a\u00020\f2\u0006\u00108\u001a\u000207¢\u0006\u0004\b=\u0010>\u001a\u001d\u0010?\u001a\u00020\u001d2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b?\u0010@\"\u001a\u0010E\u001a\u00020\u001d8\u0006X\u0086D¢\u0006\f\n\u0004\bA\u0010B\u001a\u0004\bC\u0010D\"\u001a\u0010H\u001a\u00020\u001d8\u0006X\u0086D¢\u0006\f\n\u0004\bF\u0010B\u001a\u0004\bG\u0010D\"\u0017\u0010M\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L¨\u0006P²\u0006\u000e\u0010N\u001a\u0002028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010N\u001a\u0002028\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010/\u001a\u00020\u000f8\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010O\u001a\u0002028\n@\nX\u008a\u008e\u0002"}, d2 = {"LN/c;", "windowSize", "", "LF3/a;", "displayFeatures", "", "dashboardInfoList", "LO/x1;", "Lcom/apptionlabs/meater_app/model/CloudMQTTConnectionState;", "cloudStatus", "LT5/m;", "viewModel", "Loa/F;", "e0", "(LN/c;Ljava/util/List;Ljava/util/List;LO/x1;LT5/m;LO/l;I)V", "LU0/h;", "topPadding", "items", "Landroidx/lifecycle/Y;", "LT4/v;", "probeSelectionListener", "LT4/k;", "emptyViewListener", "i0", "(LN/c;Ljava/util/List;FLjava/util/List;Landroidx/lifecycle/Y;LT4/v;LT4/k;LO/l;II)V", "LP5/h;", "contentType", "LP5/a;", "scaleType", "", "columnCount", "h0", "(FLjava/util/List;LP5/h;LP5/a;ILT4/v;LT4/k;LO/l;II)V", "b0", "(LP5/h;LO/l;I)V", "LK4/b;", "onGoingRecipe", "x", "(LP5/h;LP5/a;LK4/b;LO/l;I)V", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Z", "(LP5/h;LP5/a;Lcom/apptionlabs/meater_app/model/MEATERDevice;LK4/b;LT4/v;LO/l;I)V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "N", "(LP5/h;LP5/a;Lcom/apptionlabs/meater_app/model/Probe;LK4/b;LT4/v;LO/l;I)V", "cardHeightIs", "J", "(LP5/h;Lcom/apptionlabs/meater_app/model/Probe;FLO/l;I)V", "", "isThisOnlyOngoingRecipeCard", "Lb0/i;", "m0", "(ZLP5/h;LK4/b;LP5/a;)Lb0/i;", "Landroid/app/Activity;", "activity", "q0", "(Landroid/app/Activity;Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "p0", "(Landroid/app/Activity;LK4/b;)V", "r0", "(Landroid/app/Activity;)V", "o0", "(LP5/h;LP5/a;)I", "a", "I", "getTABLET_LARGE_LANDSCAPE_CARD_SIZE", "()I", "TABLET_LARGE_LANDSCAPE_CARD_SIZE", "b", "getTABLET_SMALL_LANDSCAPE_CARD_SIZE", "TABLET_SMALL_LANDSCAPE_CARD_SIZE", "c", "F", "getTABLET_LANDSCAPE_CARD_SIZE_FOR_BOX", "()F", "TABLET_LANDSCAPE_CARD_SIZE_FOR_BOX", "isCardRevealed", "probeConnectionStatus", "app_playstoreLiveRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class z0 {

    /* renamed from: a, reason: collision with root package name */
    private static final int f7605a = 250;

    /* renamed from: b, reason: collision with root package name */
    private static final int f7606b = 230;

    /* renamed from: c, reason: collision with root package name */
    private static final float f7607c = U0.h.u(252);

    /* compiled from: MainScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class a implements Ba.q<InterfaceC0801i, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ MEATERDevice f7608B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ EnumC1600h f7609C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ EnumC1593a f7610D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ K4.b f7611E;

        /* renamed from: F, reason: collision with root package name */
        final /* synthetic */ T4.v f7612F;

        /* compiled from: Comparisons.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u00002\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00018\u00008\u00002\u000e\u0010\u0003\u001a\n \u0001*\u0004\u0018\u00018\u00008\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "kotlin.jvm.PlatformType", "a", "b", "", "compare", "(Ljava/lang/Object;Ljava/lang/Object;)I", "<anonymous>"}, k = 3, mv = {2, 0, 0})
        /* renamed from: J4.z0$a$a, reason: collision with other inner class name */
        public static final class C0154a<T> implements Comparator {
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.Comparator
            public final int compare(T t10, T t11) {
                return C4370a.d(Integer.valueOf(((MEATERDevice) t10).getProbeNumber()), Integer.valueOf(((MEATERDevice) t11).getProbeNumber()));
            }
        }

        a(MEATERDevice mEATERDevice, EnumC1600h enumC1600h, EnumC1593a enumC1593a, K4.b bVar, T4.v vVar) {
            this.f7608B = mEATERDevice;
            this.f7609C = enumC1600h;
            this.f7610D = enumC1593a;
            this.f7611E = bVar;
            this.f7612F = vVar;
        }

        public final void a(InterfaceC0801i Card, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(Card, "$this$Card");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(1045484739, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.CreateDeviceCardGrouping.<anonymous> (MainScreen.kt:634)");
            }
            MEATERDevice mEATERDevice = this.f7608B;
            if (mEATERDevice instanceof Probe) {
                interfaceC1554l.S(819278810);
                z0.N(this.f7609C, this.f7610D, (Probe) this.f7608B, this.f7611E, this.f7612F, interfaceC1554l, 0);
                interfaceC1554l.I();
            } else if (mEATERDevice.isMaster()) {
                interfaceC1554l.S(819660048);
                ArrayList<MEATERDevice> childDevices = this.f7608B.getChildDevices();
                C3862t.f(childDevices, "getChildDevices(...)");
                List<MEATERDevice> listO0 = kotlin.collections.r.O0(childDevices, new C0154a());
                for (MEATERDevice mEATERDevice2 : listO0) {
                    interfaceC1554l.S(819821062);
                    if (this.f7612F != null && !mEATERDevice2.getShouldShowAsConnected()) {
                        interfaceC1554l.I();
                    } else if (this.f7612F == null || !mEATERDevice2.appearsToHaveCookInProgress()) {
                        EnumC1600h enumC1600h = this.f7609C;
                        EnumC1593a enumC1593a = this.f7610D;
                        C3862t.e(mEATERDevice2, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
                        Probe probe = (Probe) mEATERDevice2;
                        z0.N(enumC1600h, enumC1593a, probe, K4.a.f8678a.e(probe.getOngoingRecipeID()), this.f7612F, interfaceC1554l, 0);
                        if (probe.getDeviceID() != ((MEATERDevice) kotlin.collections.r.u0(listO0)).getDeviceID()) {
                            float f10 = 2;
                            androidx.compose.foundation.layout.d.a(androidx.compose.foundation.b.b(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(f10), 0.0f, U0.h.u(f10), 0.0f, 10, null), U0.h.u((float) 0.5d)), D0.b.a(R.color.grey_d8, interfaceC1554l, 6), null, 2, null), interfaceC1554l, 0);
                        }
                        interfaceC1554l.I();
                    } else {
                        interfaceC1554l.I();
                    }
                }
                interfaceC1554l.I();
            } else {
                interfaceC1554l.S(821353330);
                interfaceC1554l.I();
            }
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(InterfaceC0801i interfaceC0801i, InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC0801i, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: MainScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class b implements Ba.q<A.W, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ String f7613B;

        b(String str) {
            this.f7613B = str;
        }

        public final void a(A.W TextButton, InterfaceC1554l interfaceC1554l, int i10) {
            C3862t.g(TextButton, "$this$TextButton");
            if ((i10 & 17) == 16 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(2119899834, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.EmptyScreen.<anonymous>.<anonymous> (MainScreen.kt:499)");
            }
            b0.i iVarW = androidx.compose.foundation.layout.r.w(b0.i.INSTANCE, null, false, 3, null);
            long jA = D0.b.a(R.color.primary_color_dark, interfaceC1554l, 6);
            AbstractC1341l abstractC1341lC = T0.c();
            C1273Z.b(this.f7613B, iVarW, jA, 0L, null, FontWeight.INSTANCE.d(), abstractC1341lC, 0L, null, null, 0L, 0, false, 0, 0, null, C1252D.f7860a.c(interfaceC1554l, C1252D.f7861b).getBodyMedium(), interfaceC1554l, 1769520, 0, 65432);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.W w10, InterfaceC1554l interfaceC1554l, Integer num) {
            a(w10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: MainScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class c implements Ba.p<InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ InterfaceC1279c0 f7614B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ x1<CloudMQTTConnectionState> f7615C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ C3109f<Intent, C3369a> f7616D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ T5.m f7617E;

        /* JADX WARN: Multi-variable type inference failed */
        c(InterfaceC1279c0 interfaceC1279c0, x1<? extends CloudMQTTConnectionState> x1Var, C3109f<Intent, C3369a> c3109f, T5.m mVar) {
            this.f7614B = interfaceC1279c0;
            this.f7615C = x1Var;
            this.f7616D = c3109f;
            this.f7617E = mVar;
        }

        public final void a(InterfaceC1554l interfaceC1554l, int i10) {
            if ((i10 & 3) == 2 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(-1033825484, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreen.<anonymous> (MainScreen.kt:126)");
            }
            D0.d(this.f7614B, this.f7615C, this.f7616D, this.f7617E, interfaceC1554l, C3109f.f39940c << 6);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.p
        public /* bridge */ /* synthetic */ C4153F invoke(InterfaceC1554l interfaceC1554l, Integer num) {
            a(interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: MainScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class d implements Ba.q<A.N, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ WindowSizeClass f7618B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List<F3.a> f7619C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ List<Object> f7620D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ T5.m f7621E;

        /* JADX WARN: Multi-variable type inference failed */
        d(WindowSizeClass windowSizeClass, List<? extends F3.a> list, List<? extends Object> list2, T5.m mVar) {
            this.f7618B = windowSizeClass;
            this.f7619C = list;
            this.f7620D = list2;
            this.f7621E = mVar;
        }

        public final void a(A.N it, InterfaceC1554l interfaceC1554l, int i10) {
            int i11;
            C3862t.g(it, "it");
            if ((i10 & 6) == 0) {
                i11 = i10 | (interfaceC1554l.R(it) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if ((i11 & 19) == 18 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(319752713, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreen.<anonymous> (MainScreen.kt:134)");
            }
            z0.i0(this.f7618B, this.f7619C, U0.h.u(it.getTop() + U0.h.u(8)), this.f7620D, this.f7621E, null, null, interfaceC1554l, 0, 96);
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.q
        public /* bridge */ /* synthetic */ C4153F g(A.N n10, InterfaceC1554l interfaceC1554l, Integer num) {
            a(n10, interfaceC1554l, num.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0001\u001a\u00028\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"T", "it", "", "a", "(Ljava/lang/Object;)Ljava/lang/Void;"}, k = 3, mv = {2, 0, 0})
    public static final class e extends AbstractC3864v implements Ba.l {

        /* renamed from: B, reason: collision with root package name */
        public static final e f7622B = new e();

        public e() {
            super(1);
        }

        @Override // Ba.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Void invoke(Object obj) {
            return null;
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\"\u0004\b\u0000\u0010\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "", "index", "", "a", "(I)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0})
    public static final class f extends AbstractC3864v implements Ba.l<Integer, Object> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Ba.l f7623B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ List f7624C;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Ba.l lVar, List list) {
            super(1);
            this.f7623B = lVar;
            this.f7624C = list;
        }

        public final Object a(int i10) {
            return this.f7623B.invoke(this.f7624C.get(i10));
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ Object invoke(Integer num) {
            return a(num.intValue());
        }
    }

    /* compiled from: LazyGridDsl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000*\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0002H\u000b¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"T", "LB/o;", "", "it", "Loa/F;", "a", "(LB/o;ILO/l;I)V"}, k = 3, mv = {2, 0, 0})
    public static final class g extends AbstractC3864v implements Ba.r<B.o, Integer, InterfaceC1554l, Integer, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List f7625B;

        /* renamed from: C, reason: collision with root package name */
        final /* synthetic */ EnumC1600h f7626C;

        /* renamed from: D, reason: collision with root package name */
        final /* synthetic */ EnumC1593a f7627D;

        /* renamed from: E, reason: collision with root package name */
        final /* synthetic */ T4.v f7628E;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(List list, EnumC1600h enumC1600h, EnumC1593a enumC1593a, T4.v vVar) {
            super(4);
            this.f7625B = list;
            this.f7626C = enumC1600h;
            this.f7627D = enumC1593a;
            this.f7628E = vVar;
        }

        public final void a(B.o oVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
            int i12;
            if ((i11 & 6) == 0) {
                i12 = (interfaceC1554l.R(oVar) ? 4 : 2) | i11;
            } else {
                i12 = i11;
            }
            if ((i11 & 48) == 0) {
                i12 |= interfaceC1554l.h(i10) ? 32 : 16;
            }
            if ((i12 & 147) == 146 && interfaceC1554l.u()) {
                interfaceC1554l.C();
                return;
            }
            if (C1560o.J()) {
                C1560o.S(699646206, i12, -1, "androidx.compose.foundation.lazy.grid.items.<anonymous> (LazyGridDsl.kt:464)");
            }
            Object obj = this.f7625B.get(i10);
            interfaceC1554l.S(-1420083973);
            if (obj instanceof DeviceInfo) {
                interfaceC1554l.S(-1420044604);
                DeviceInfo deviceInfo = (DeviceInfo) obj;
                z0.Z(this.f7626C, this.f7627D, deviceInfo.getDevice(), deviceInfo.getOnGoingRecipe(), this.f7628E, interfaceC1554l, 0);
                interfaceC1554l.I();
            } else if (obj instanceof K4.b) {
                interfaceC1554l.S(-1419611720);
                z0.x(this.f7626C, this.f7627D, (K4.b) obj, interfaceC1554l, 0);
                interfaceC1554l.I();
            } else {
                interfaceC1554l.S(-1419356497);
                interfaceC1554l.I();
            }
            interfaceC1554l.I();
            if (C1560o.J()) {
                C1560o.R();
            }
        }

        @Override // Ba.r
        public /* bridge */ /* synthetic */ C4153F k(B.o oVar, Integer num, InterfaceC1554l interfaceC1554l, Integer num2) {
            a(oVar, num.intValue(), interfaceC1554l, num2.intValue());
            return C4153F.f46609a;
        }
    }

    /* compiled from: MainScreen.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class h {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7629a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f7630b;

        static {
            int[] iArr = new int[EnumC1600h.values().length];
            try {
                iArr[EnumC1600h.f14039B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC1600h.f14040C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC1600h.f14041D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC1600h.f14042E.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC1600h.f14043F.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC1600h.f14044G.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC1600h.f14045H.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f7629a = iArr;
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
            f7630b = iArr2;
        }
    }

    private static final float A(InterfaceC1563p0<U0.h> interfaceC1563p0) {
        return interfaceC1563p0.getValue().getValue();
    }

    private static final void B(InterfaceC1563p0<U0.h> interfaceC1563p0, float f10) {
        interfaceC1563p0.setValue(U0.h.p(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F C(InterfaceC1563p0 interfaceC1563p0) {
        interfaceC1563p0.setValue(Boolean.FALSE);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F D(InterfaceC1563p0 interfaceC1563p0, InterfaceC1563p0 interfaceC1563p02) {
        z(interfaceC1563p02, false);
        interfaceC1563p0.setValue(Boolean.TRUE);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F E(InterfaceC1563p0 interfaceC1563p0, U0.h hVar) {
        B(interfaceC1563p0, hVar.getValue());
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F F(InterfaceC1563p0 interfaceC1563p0) {
        z(interfaceC1563p0, true);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F G(InterfaceC1563p0 interfaceC1563p0) {
        z(interfaceC1563p0, false);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F H(Activity activity, K4.b bVar) {
        p0(activity, bVar);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F I(EnumC1600h enumC1600h, EnumC1593a enumC1593a, K4.b bVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        x(enumC1600h, enumC1593a, bVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void J(final EnumC1600h contentType, final Probe probe, final float f10, InterfaceC1554l interfaceC1554l, final int i10) {
        C3862t.g(contentType, "contentType");
        C3862t.g(probe, "probe");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1195052418);
        if (C1560o.J()) {
            C1560o.S(-1195052418, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.ConnectionLostOverlay (MainScreen.kt:791)");
        }
        interfaceC1554lR.S(238053223);
        Object objF = interfaceC1554lR.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = r1.c(Boolean.valueOf(!probe.getShouldShowAsConnected()), null, 2, null);
            interfaceC1554lR.J(objF);
        }
        InterfaceC1563p0 interfaceC1563p0 = (InterfaceC1563p0) objF;
        interfaceC1554lR.I();
        if (K(interfaceC1563p0)) {
            switch (h.f7629a[contentType.ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 6:
                case 7:
                    interfaceC1554lR.S(-1209882359);
                    b0.i iVarB = androidx.compose.foundation.b.b(C3303d.a(androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.i(b0.i.INSTANCE, f10), 0.0f, 1, null), E.g.e(U0.h.u(12), 0.0f, 0.0f, 0.0f, 14, null)), D0.b.a(R.color.dashboard_white_transparent, interfaceC1554lR, 6), null, 2, null);
                    y0.I iA = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554lR, 0);
                    int iA2 = C1550j.a(interfaceC1554lR, 0);
                    InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
                    b0.i iVarE = b0.h.e(interfaceC1554lR, iVarB);
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
                    C1.b(interfaceC1554lA, iA, companion.c());
                    C1.b(interfaceC1554lA, interfaceC1578xF, companion.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion.b();
                    if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
                        interfaceC1554lA.J(Integer.valueOf(iA2));
                        interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
                    }
                    C1.b(interfaceC1554lA, iVarE, companion.d());
                    C0802j c0802j = C0802j.f149a;
                    interfaceC1554lR.P();
                    interfaceC1554lR.I();
                    break;
                case 4:
                case 5:
                    interfaceC1554lR.S(-1209205319);
                    b0.i iVarB2 = androidx.compose.foundation.b.b(C3303d.a(androidx.compose.foundation.layout.r.d(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), 0.0f, 1, null), E.g.e(U0.h.u(12), 0.0f, 0.0f, 0.0f, 14, null)), D0.b.a(R.color.dashboard_white_transparent, interfaceC1554lR, 6), null, 2, null);
                    y0.I iA3 = C0799g.a(C0794b.f54a.f(), b0.c.INSTANCE.k(), interfaceC1554lR, 0);
                    int iA4 = C1550j.a(interfaceC1554lR, 0);
                    InterfaceC1578x interfaceC1578xF2 = interfaceC1554lR.F();
                    b0.i iVarE2 = b0.h.e(interfaceC1554lR, iVarB2);
                    InterfaceC0828g.Companion companion2 = InterfaceC0828g.INSTANCE;
                    Ba.a<InterfaceC0828g> aVarA2 = companion2.a();
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
                    C1.b(interfaceC1554lA2, iA3, companion2.c());
                    C1.b(interfaceC1554lA2, interfaceC1578xF2, companion2.e());
                    Ba.p<InterfaceC0828g, Integer, C4153F> pVarB2 = companion2.b();
                    if (interfaceC1554lA2.getInserting() || !C3862t.b(interfaceC1554lA2.f(), Integer.valueOf(iA4))) {
                        interfaceC1554lA2.J(Integer.valueOf(iA4));
                        interfaceC1554lA2.k(Integer.valueOf(iA4), pVarB2);
                    }
                    C1.b(interfaceC1554lA2, iVarE2, companion2.d());
                    C0802j c0802j2 = C0802j.f149a;
                    interfaceC1554lR.P();
                    interfaceC1554lR.I();
                    break;
                default:
                    interfaceC1554lR.S(238058229);
                    interfaceC1554lR.I();
                    throw new NoWhenBranchMatchedException();
            }
        }
        L(interfaceC1563p0, !probe.getShouldShowAsConnected());
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.q0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.M(contentType, probe, f10, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean K(InterfaceC1563p0<Boolean> interfaceC1563p0) {
        return interfaceC1563p0.getValue().booleanValue();
    }

    private static final void L(InterfaceC1563p0<Boolean> interfaceC1563p0, boolean z10) {
        interfaceC1563p0.setValue(Boolean.valueOf(z10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F M(EnumC1600h enumC1600h, Probe probe, float f10, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        J(enumC1600h, probe, f10, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    /* JADX WARN: Type inference failed for: r14v1 */
    /* JADX WARN: Type inference failed for: r14v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7, types: [b0.c$b, b0.c$c, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v8 */
    /* JADX WARN: Type inference failed for: r14v9 */
    @SuppressLint({"UnusedTransitionTargetStateParameter"})
    public static final void N(final EnumC1600h contentType, final EnumC1593a scaleType, final Probe probe, final K4.b bVar, final T4.v vVar, InterfaceC1554l interfaceC1554l, final int i10) {
        final InterfaceC1563p0 interfaceC1563p0;
        InterfaceC1563p0 interfaceC1563p02;
        ?? r14;
        InterfaceC1563p0 interfaceC1563p03;
        androidx.compose.foundation.layout.f fVar;
        i.Companion companion;
        ?? r142;
        boolean z10;
        final InterfaceC1563p0 interfaceC1563p04;
        final InterfaceC1563p0 interfaceC1563p05;
        boolean z11;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(probe, "probe");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(94470249);
        if (C1560o.J()) {
            C1560o.S(94470249, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.CreateDeviceCard (MainScreen.kt:696)");
        }
        Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        C3862t.e(objO, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) objO;
        interfaceC1554lR.S(708631708);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion2 = InterfaceC1554l.INSTANCE;
        if (objF == companion2.a()) {
            objF = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF);
        }
        final InterfaceC1563p0 interfaceC1563p06 = (InterfaceC1563p0) objF;
        interfaceC1554lR.I();
        interfaceC1554lR.S(708634011);
        Object objF2 = interfaceC1554lR.f();
        if (objF2 == companion2.a()) {
            objF2 = r1.c(U0.h.p(U0.h.u(0)), null, 2, null);
            interfaceC1554lR.J(objF2);
        }
        InterfaceC1563p0 interfaceC1563p07 = (InterfaceC1563p0) objF2;
        interfaceC1554lR.I();
        interfaceC1554lR.S(708640433);
        Object objF3 = interfaceC1554lR.f();
        if (objF3 == companion2.a()) {
            objF3 = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF3);
        }
        final InterfaceC1563p0 interfaceC1563p08 = (InterfaceC1563p0) objF3;
        interfaceC1554lR.I();
        interfaceC1554lR.S(708641937);
        if (((Boolean) interfaceC1563p08.getValue()).booleanValue()) {
            interfaceC1554lR.S(708646726);
            Object objF4 = interfaceC1554lR.f();
            if (objF4 == companion2.a()) {
                objF4 = new Ba.a() { // from class: J4.i0
                    @Override // Ba.a
                    public final Object invoke() {
                        return z0.S(interfaceC1563p08);
                    }
                };
                interfaceC1554lR.J(objF4);
            }
            Ba.a aVar = (Ba.a) objF4;
            interfaceC1554lR.I();
            int i11 = i10 >> 6;
            interfaceC1563p0 = interfaceC1563p08;
            interfaceC1563p02 = interfaceC1563p07;
            r14 = 0;
            Z.c(probe, bVar, aVar, interfaceC1554lR, (i11 & 14) | 384 | (i11 & 112), 0);
        } else {
            interfaceC1563p0 = interfaceC1563p08;
            interfaceC1563p02 = interfaceC1563p07;
            r14 = 0;
        }
        interfaceC1554lR.I();
        i.Companion companion3 = b0.i.INSTANCE;
        c.Companion companion4 = b0.c.INSTANCE;
        y0.I iH = androidx.compose.foundation.layout.d.h(companion4.o(), r14);
        int iA = C1550j.a(interfaceC1554lR, r14);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, companion3);
        InterfaceC0828g.Companion companion5 = InterfaceC0828g.INSTANCE;
        Ba.a<InterfaceC0828g> aVarA = companion5.a();
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
        C1.b(interfaceC1554lA, iH, companion5.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion5.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion5.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion5.d());
        androidx.compose.foundation.layout.f fVar2 = androidx.compose.foundation.layout.f.f22255a;
        interfaceC1554lR.S(1310712220);
        if (probe.appearsToHaveCookInProgress()) {
            if (probe.isOnline() || !O(interfaceC1563p06)) {
                z11 = false;
            } else {
                z11 = false;
                P(interfaceC1563p06, false);
            }
            float fQ = Q(interfaceC1563p02);
            interfaceC1554lR.S(1310725323);
            Object objF5 = interfaceC1554lR.f();
            if (objF5 == companion2.a()) {
                objF5 = new Ba.a() { // from class: J4.j0
                    @Override // Ba.a
                    public final Object invoke() {
                        return z0.T(interfaceC1563p0, interfaceC1563p06);
                    }
                };
                interfaceC1554lR.J(objF5);
            }
            interfaceC1554lR.I();
            companion = companion3;
            z10 = z11;
            interfaceC1563p03 = interfaceC1563p06;
            fVar = fVar2;
            r142 = 0;
            Q.A(false, scaleType, contentType, fQ, (Ba.a) objF5, interfaceC1554lR, (i10 & 112) | 24576 | ((i10 << 6) & 896), 1);
        } else {
            interfaceC1563p03 = interfaceC1563p06;
            fVar = fVar2;
            companion = companion3;
            r142 = 0;
            z10 = false;
        }
        interfaceC1554lR.I();
        boolean zO = O(interfaceC1563p03);
        float fA = U0.a(80.0f);
        interfaceC1554lR.S(1310739650);
        Object objF6 = interfaceC1554lR.f();
        if (objF6 == companion2.a()) {
            interfaceC1563p04 = interfaceC1563p02;
            objF6 = new Ba.l() { // from class: J4.k0
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return z0.U(interfaceC1563p04, (U0.h) obj);
                }
            };
            interfaceC1554lR.J(objF6);
        } else {
            interfaceC1563p04 = interfaceC1563p02;
        }
        Ba.l lVar = (Ba.l) objF6;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1310741126);
        Object objF7 = interfaceC1554lR.f();
        if (objF7 == companion2.a()) {
            interfaceC1563p05 = interfaceC1563p03;
            objF7 = new Ba.a() { // from class: J4.l0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.V(interfaceC1563p05);
                }
            };
            interfaceC1554lR.J(objF7);
        } else {
            interfaceC1563p05 = interfaceC1563p03;
        }
        Ba.a aVar2 = (Ba.a) objF7;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1310742791);
        Object objF8 = interfaceC1554lR.f();
        if (objF8 == companion2.a()) {
            objF8 = new Ba.a() { // from class: J4.m0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.W(interfaceC1563p05);
                }
            };
            interfaceC1554lR.J(objF8);
        }
        Ba.a aVar3 = (Ba.a) objF8;
        interfaceC1554lR.I();
        interfaceC1554lR.S(1310744402);
        int i12 = 57344 & i10;
        boolean zL = ((((i12 ^ 24576) <= 16384 || !interfaceC1554lR.l(vVar)) && (i10 & 24576) != 16384) ? z10 : true) | interfaceC1554lR.l(probe) | interfaceC1554lR.l(activity) | interfaceC1554lR.l(bVar);
        Object objF9 = interfaceC1554lR.f();
        if (zL || objF9 == companion2.a()) {
            objF9 = new Ba.a() { // from class: J4.o0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.X(vVar, probe, activity, bVar);
                }
            };
            interfaceC1554lR.J(objF9);
        }
        interfaceC1554lR.I();
        int i13 = i10 & 14;
        Q.K(contentType, scaleType, probe, bVar, vVar, zO, fA, lVar, aVar2, aVar3, (Ba.a) objF9, interfaceC1554lR, i13 | 918552576 | (i10 & 112) | (i10 & 896) | (i10 & 7168) | i12, 0);
        int i14 = (i10 >> 3) & 112;
        boolean z12 = z10;
        J(contentType, probe, Q(interfaceC1563p04), interfaceC1554lR, i13 | i14);
        interfaceC1554lR.S(1310763936);
        if (Config.INSTANCE.getInstance().DEBUG_UI_ENABLED && (contentType == EnumC1600h.f14042E || contentType == EnumC1600h.f14043F)) {
            Q.a0(fVar.a(androidx.compose.foundation.layout.o.m(androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.r.w(companion, r142, z12, 3, r142), r142, z12, 3, r142), U0.h.u(24), 0.0f, 0.0f, 0.0f, 14, null), companion4.d()), probe, interfaceC1554lR, i14);
        }
        interfaceC1554lR.I();
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.p0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.Y(contentType, scaleType, probe, bVar, vVar, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean O(InterfaceC1563p0<Boolean> interfaceC1563p0) {
        return interfaceC1563p0.getValue().booleanValue();
    }

    private static final void P(InterfaceC1563p0<Boolean> interfaceC1563p0, boolean z10) {
        interfaceC1563p0.setValue(Boolean.valueOf(z10));
    }

    private static final float Q(InterfaceC1563p0<U0.h> interfaceC1563p0) {
        return interfaceC1563p0.getValue().getValue();
    }

    private static final void R(InterfaceC1563p0<U0.h> interfaceC1563p0, float f10) {
        interfaceC1563p0.setValue(U0.h.p(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F S(InterfaceC1563p0 interfaceC1563p0) {
        interfaceC1563p0.setValue(Boolean.FALSE);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F T(InterfaceC1563p0 interfaceC1563p0, InterfaceC1563p0 interfaceC1563p02) {
        P(interfaceC1563p02, false);
        interfaceC1563p0.setValue(Boolean.TRUE);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F U(InterfaceC1563p0 interfaceC1563p0, U0.h hVar) {
        R(interfaceC1563p0, hVar.getValue());
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F V(InterfaceC1563p0 interfaceC1563p0) {
        P(interfaceC1563p0, true);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F W(InterfaceC1563p0 interfaceC1563p0) {
        P(interfaceC1563p0, false);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F X(T4.v vVar, Probe probe, Activity activity, K4.b bVar) {
        if (vVar != null) {
            vVar.a(probe);
        } else if (probe.getOngoingRecipeID() == -1) {
            q0(activity, probe);
        } else if (bVar != null) {
            p0(activity, bVar);
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F Y(EnumC1600h enumC1600h, EnumC1593a enumC1593a, Probe probe, K4.b bVar, T4.v vVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        N(enumC1600h, enumC1593a, probe, bVar, vVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void Z(final EnumC1600h contentType, final EnumC1593a scaleType, final MEATERDevice device, final K4.b bVar, final T4.v vVar, InterfaceC1554l interfaceC1554l, final int i10) {
        InterfaceC1554l interfaceC1554l2;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(device, "device");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1873704074);
        if (C1560o.J()) {
            C1560o.S(-1873704074, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.CreateDeviceCardGrouping (MainScreen.kt:585)");
        }
        int i11 = h.f7629a[contentType.ordinal()];
        boolean z10 = false;
        b0.i iVarI = (i11 == 4 || i11 == 5) ? androidx.compose.foundation.layout.o.i(androidx.compose.foundation.layout.r.l(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(o0(contentType, scaleType))), U0.h.u(2)) : androidx.compose.foundation.layout.r.s(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), null, false, 3, null);
        boolean z11 = device instanceof Probe;
        if (device.isMaster()) {
            ArrayList<MEATERDevice> childDevices = device.getChildDevices();
            C3862t.f(childDevices, "getChildDevices(...)");
            if (!childDevices.isEmpty()) {
                z10 = true;
            }
        }
        if (z11 || z10) {
            interfaceC1554l2 = interfaceC1554lR;
            C1293n.b(b0.i.INSTANCE.e(iVarI), E.g.c(U0.h.u(12)), new C1290k(D0.b.a(R.color.dashboard_card_background, interfaceC1554lR, 6), D0.b.a(R.color.white, interfaceC1554lR, 6), D0.b.a(R.color.grey_66, interfaceC1554lR, 6), D0.b.a(R.color.grey_66, interfaceC1554lR, 6), null), C1291l.f8472a.b(U0.h.u(2), 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, interfaceC1554lR, (C1291l.f8473b << 18) | 6, 62), null, W.c.d(1045484739, true, new a(device, contentType, scaleType, bVar, vVar), interfaceC1554lR, 54), interfaceC1554lR, 196608, 16);
        } else {
            interfaceC1554l2 = interfaceC1554lR;
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554l2.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.u0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.a0(contentType, scaleType, device, bVar, vVar, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F a0(EnumC1600h enumC1600h, EnumC1593a enumC1593a, MEATERDevice mEATERDevice, K4.b bVar, T4.v vVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        Z(enumC1600h, enumC1593a, mEATERDevice, bVar, vVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void b0(final EnumC1600h contentType, InterfaceC1554l interfaceC1554l, final int i10) throws Resources.NotFoundException {
        String strA;
        String strA2;
        C3862t.g(contentType, "contentType");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(1747636941);
        if (C1560o.J()) {
            C1560o.S(1747636941, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.EmptyScreen (MainScreen.kt:453)");
        }
        boolean zIsEmpty = M4.h.f11978a.K().isEmpty();
        final boolean z10 = !zIsEmpty;
        Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        C3862t.e(objO, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) objO;
        if (zIsEmpty) {
            interfaceC1554lR.S(1574338033);
            strA = D0.h.a(R.string.currently_no_paired_devices, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(1574265586);
            strA = D0.h.a(R.string.currently_no_paired_probes, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        }
        String str = strA;
        if (zIsEmpty) {
            interfaceC1554lR.S(1574506766);
            strA2 = D0.h.a(R.string.menu_dropdown_main_add_devices, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(1574449602);
            strA2 = D0.h.a(R.string.my_devices, interfaceC1554lR, 6);
            interfaceC1554lR.I();
        }
        i.Companion companion = b0.i.INSTANCE;
        b0.i iVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.d(androidx.compose.foundation.b.b(companion, D0.b.a(R.color.dashboard_background, interfaceC1554lR, 6), null, 2, null), 0.0f, 1, null), 0.0f, 1, null);
        y0.I iA = C0799g.a(C0794b.f54a.b(), b0.c.INSTANCE.g(), interfaceC1554lR, 54);
        int iA2 = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, iVarH);
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
        C1.b(interfaceC1554lA, iA, companion2.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA2))) {
            interfaceC1554lA.J(Integer.valueOf(iA2));
            interfaceC1554lA.k(Integer.valueOf(iA2), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion2.d());
        C0802j c0802j = C0802j.f149a;
        C1273Z.b(str, androidx.compose.foundation.layout.r.w(companion, null, false, 3, null), D0.b.a(R.color.black_color, interfaceC1554lR, 6), 0L, null, FontWeight.INSTANCE.d(), T0.c(), 0L, null, null, 0L, R0.q.INSTANCE.b(), false, 1, 0, null, C1252D.f7860a.c(interfaceC1554lR, C1252D.f7861b).getBodyMedium(), interfaceC1554lR, 1769520, 3120, 55192);
        b0.i iVarM = androidx.compose.foundation.layout.o.m(companion, 0.0f, U0.h.u(2), 0.0f, 0.0f, 13, null);
        interfaceC1554lR.S(76017215);
        boolean zC = interfaceC1554lR.c(z10) | interfaceC1554lR.l(activity);
        Object objF = interfaceC1554lR.f();
        if (zC || objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new Ba.a() { // from class: J4.v0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.c0(z10, activity);
                }
            };
            interfaceC1554lR.J(objF);
        }
        interfaceC1554lR.I();
        C1289j.b((Ba.a) objF, iVarM, false, null, null, null, null, null, null, W.c.d(2119899834, true, new b(strA2), interfaceC1554lR, 54), interfaceC1554lR, 805306416, 508);
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.w0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.d0(contentType, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F c0(boolean z10, Activity activity) {
        if (z10) {
            ConnectionsControllerActivity.n3(activity, ThisDevice.INSTANCE);
        } else {
            r0(activity);
        }
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F d0(EnumC1600h enumC1600h, int i10, InterfaceC1554l interfaceC1554l, int i11) throws Resources.NotFoundException {
        b0(enumC1600h, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void e0(final WindowSizeClass windowSize, final List<? extends F3.a> displayFeatures, final List<? extends Object> dashboardInfoList, final x1<? extends CloudMQTTConnectionState> cloudStatus, final T5.m viewModel, InterfaceC1554l interfaceC1554l, final int i10) {
        C3862t.g(windowSize, "windowSize");
        C3862t.g(displayFeatures, "displayFeatures");
        C3862t.g(dashboardInfoList, "dashboardInfoList");
        C3862t.g(cloudStatus, "cloudStatus");
        C3862t.g(viewModel, "viewModel");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-643068808);
        if (C1560o.J()) {
            C1560o.S(-643068808, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreen (MainScreen.kt:115)");
        }
        C3469d c3469d = new C3469d();
        interfaceC1554lR.S(1470335977);
        Object objF = interfaceC1554lR.f();
        if (objF == InterfaceC1554l.INSTANCE.a()) {
            objF = new Ba.l() { // from class: J4.c0
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return z0.f0((C3369a) obj);
                }
            };
            interfaceC1554lR.J(objF);
        }
        interfaceC1554lR.I();
        C1266S.a(null, W.c.d(-1033825484, true, new c(C1277b0.f8228a.d(C1282e.j(0.0f, 0.0f, 0.0f, interfaceC1554lR, 0, 7), null, interfaceC1554lR, C1277b0.f8234g << 6, 2), cloudStatus, C3106c.a(c3469d, (Ba.l) objF, interfaceC1554lR, 48), viewModel), interfaceC1554lR, 54), null, null, null, 0, 0L, 0L, null, W.c.d(319752713, true, new d(windowSize, displayFeatures, dashboardInfoList, viewModel), interfaceC1554lR, 54), interfaceC1554lR, 805306416, 509);
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.n0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.g0(windowSize, displayFeatures, dashboardInfoList, cloudStatus, viewModel, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F f0(C3369a c3369a) {
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F g0(WindowSizeClass windowSizeClass, List list, List list2, x1 x1Var, T5.m mVar, int i10, InterfaceC1554l interfaceC1554l, int i11) {
        e0(windowSizeClass, list, list2, x1Var, mVar, interfaceC1554l, C1509K0.a(i10 | 1));
        return C4153F.f46609a;
    }

    public static final void h0(final float f10, final List<? extends Object> items, final EnumC1600h contentType, final EnumC1593a scaleType, int i10, T4.v vVar, T4.k kVar, InterfaceC1554l interfaceC1554l, final int i11, final int i12) throws Resources.NotFoundException {
        float fU;
        float fU2;
        float fU3;
        T4.k kVar2;
        C3862t.g(items, "items");
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-1136276279);
        final int i13 = (i12 & 16) != 0 ? 1 : i10;
        final T4.v vVar2 = (i12 & 32) != 0 ? null : vVar;
        T4.k kVar3 = (i12 & 64) != 0 ? null : kVar;
        if (C1560o.J()) {
            C1560o.S(-1136276279, i11, -1, "com.apptionlabs.meater_app.dashboard.ui.MainScreenView (MainScreen.kt:338)");
        }
        int[] iArr = h.f7629a;
        switch (iArr[contentType.ordinal()]) {
            case 1:
                fU = U0.h.u(12);
                break;
            case 2:
            case 3:
                fU = U0.h.u(32);
                break;
            case 4:
            case 5:
                fU = U0.h.u(32);
                break;
            case 6:
                fU = U0.h.u(32);
                break;
            case 7:
                fU = U0.h.u(12);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[contentType.ordinal()]) {
            case 1:
                fU2 = U0.h.u(0);
                break;
            case 2:
            case 3:
                fU2 = U0.h.u(16);
                break;
            case 4:
            case 5:
                fU2 = U0.h.u(24);
                break;
            case 6:
                fU2 = U0.h.u(16);
                break;
            case 7:
                fU2 = U0.h.u(0);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        switch (iArr[contentType.ordinal()]) {
            case 1:
                fU3 = U0.h.u(12);
                break;
            case 2:
            case 3:
                fU3 = U0.h.u(24);
                break;
            case 4:
            case 5:
                fU3 = U0.h.u(24);
                break;
            case 6:
                fU3 = U0.h.u(24);
                break;
            case 7:
                fU3 = U0.h.u(16);
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        if (items.isEmpty()) {
            kVar2 = kVar3;
            interfaceC1554lR.S(1600288046);
            if (kVar2 != null) {
                k.a.a(kVar2, false, 1, null);
            } else {
                b0(contentType, interfaceC1554lR, (i11 >> 6) & 14);
            }
            interfaceC1554lR.I();
        } else {
            interfaceC1554lR.S(1598791490);
            if (kVar3 != null) {
                kVar3.a(false);
            }
            b0.i iVarH = androidx.compose.foundation.layout.r.h(androidx.compose.foundation.layout.r.d(androidx.compose.foundation.b.b(b0.i.INSTANCE, D0.b.a(R.color.dashboard_background, interfaceC1554lR, 6), null, 2, null), 0.0f, 1, null), 0.0f, 1, null);
            InterfaceC0873b.a aVar = new InterfaceC0873b.a(i13);
            A.N nD = androidx.compose.foundation.layout.o.d(fU, f10, fU, fU);
            C0794b c0794b = C0794b.f54a;
            C0794b.e eVarM = c0794b.m(fU2);
            C0794b.e eVarM2 = c0794b.m(fU3);
            interfaceC1554lR.S(1159974425);
            boolean zL = interfaceC1554lR.l(items) | ((((i11 & 896) ^ 384) > 256 && interfaceC1554lR.R(contentType)) || (i11 & 384) == 256) | ((((i11 & 7168) ^ 3072) > 2048 && interfaceC1554lR.R(scaleType)) || (i11 & 3072) == 2048) | ((((458752 & i11) ^ 196608) > 131072 && interfaceC1554lR.l(vVar2)) || (i11 & 196608) == 131072);
            Object objF = interfaceC1554lR.f();
            if (zL || objF == InterfaceC1554l.INSTANCE.a()) {
                objF = new Ba.l() { // from class: J4.s0
                    @Override // Ba.l
                    public final Object invoke(Object obj) {
                        return z0.k0(items, contentType, scaleType, vVar2, (B.C) obj);
                    }
                };
                interfaceC1554lR.J(objF);
            }
            interfaceC1554lR.I();
            kVar2 = kVar3;
            C0879h.a(aVar, iVarH, null, nD, false, eVarM2, eVarM, null, false, (Ba.l) objF, interfaceC1554lR, 0, 404);
            interfaceC1554lR.I();
        }
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            final T4.k kVar4 = kVar2;
            final T4.v vVar3 = vVar2;
            w0Y.a(new Ba.p() { // from class: J4.t0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.l0(f10, items, contentType, scaleType, i13, vVar3, kVar4, i11, i12, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x011e  */
    @android.annotation.SuppressLint({"UnusedMaterial3ScaffoldPaddingParameter", "MutableCollectionMutableState"})
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void i0(final N.WindowSizeClass r19, final java.util.List<? extends F3.a> r20, final float r21, final java.util.List<? extends java.lang.Object> r22, final android.view.Y r23, T4.v r24, T4.k r25, kotlin.InterfaceC1554l r26, final int r27, final int r28) {
        /*
            Method dump skipped, instructions count: 689
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: J4.z0.i0(N.c, java.util.List, float, java.util.List, androidx.lifecycle.Y, T4.v, T4.k, O.l, int, int):void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F j0(WindowSizeClass windowSizeClass, List list, float f10, List list2, android.view.Y y10, T4.v vVar, T4.k kVar, int i10, int i11, InterfaceC1554l interfaceC1554l, int i12) {
        i0(windowSizeClass, list, f10, list2, y10, vVar, kVar, interfaceC1554l, C1509K0.a(i10 | 1), i11);
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F k0(List list, EnumC1600h enumC1600h, EnumC1593a enumC1593a, T4.v vVar, B.C LazyVerticalGrid) {
        C3862t.g(LazyVerticalGrid, "$this$LazyVerticalGrid");
        LazyVerticalGrid.a(list.size(), null, null, new f(e.f7622B, list), W.c.b(699646206, true, new g(list, enumC1600h, enumC1593a, vVar)));
        return C4153F.f46609a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C4153F l0(float f10, List list, EnumC1600h enumC1600h, EnumC1593a enumC1593a, int i10, T4.v vVar, T4.k kVar, int i11, int i12, InterfaceC1554l interfaceC1554l, int i13) throws Resources.NotFoundException {
        h0(f10, list, enumC1600h, enumC1593a, i10, vVar, kVar, interfaceC1554l, C1509K0.a(i11 | 1), i12);
        return C4153F.f46609a;
    }

    @SuppressLint({"ModifierFactoryUnreferencedReceiver", "ModifierFactoryExtensionFunction"})
    public static final b0.i m0(boolean z10, EnumC1600h contentType, K4.b bVar, EnumC1593a scaleType) {
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        switch (h.f7629a[contentType.ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 6:
            case 7:
                return C3303d.b(androidx.compose.foundation.layout.i.a(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), A.I.Max));
            case 4:
                return C3303d.b(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(o0(contentType, scaleType))));
            case 5:
                return C3303d.b(androidx.compose.foundation.layout.r.i(androidx.compose.foundation.layout.r.h(b0.i.INSTANCE, 0.0f, 1, null), U0.h.u(o0(contentType, scaleType))));
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    public static /* synthetic */ b0.i n0(boolean z10, EnumC1600h enumC1600h, K4.b bVar, EnumC1593a enumC1593a, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            bVar = null;
        }
        return m0(z10, enumC1600h, bVar, enumC1593a);
    }

    public static final int o0(EnumC1600h contentType, EnumC1593a scaleType) {
        int i10;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        int i11 = h.f7629a[contentType.ordinal()];
        if (i11 == 4) {
            int i12 = h.f7630b[scaleType.ordinal()];
            if (i12 == 1 || i12 == 2) {
                return f7605a;
            }
            if (i12 != 3 && i12 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = f7605a;
        } else {
            if (i11 != 5) {
                return 0;
            }
            int i13 = h.f7630b[scaleType.ordinal()];
            if (i13 == 1 || i13 == 2) {
                return f7606b;
            }
            if (i13 != 3 && i13 != 4) {
                throw new NoWhenBranchMatchedException();
            }
            i10 = f7606b;
        }
        return i10 + 30;
    }

    public static final void p0(Activity activity, K4.b onGoingRecipe) {
        C3862t.g(activity, "activity");
        C3862t.g(onGoingRecipe, "onGoingRecipe");
        Intent intent = new Intent(activity, (Class<?>) RecipeStepsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_ONGOING_RECIPE_ID, onGoingRecipe.getOngoingRecipeId());
        intent.putExtra(MEATERIntent.EXTRA_RECIPE_ID, onGoingRecipe.getRecipeId());
        activity.startActivity(intent);
    }

    public static final void q0(Activity activity, MEATERDevice device) {
        C3862t.g(activity, "activity");
        C3862t.g(device, "device");
        Intent intent = new Intent(activity, (Class<?>) MeaterDetailsActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_DEVICE_ID, device.getDeviceID());
        activity.startActivity(intent);
    }

    public static final void r0(Activity activity) {
        C3862t.g(activity, "activity");
        int iX = x4.g.t().x();
        EnumC3427c enumC3427c = EnumC3427c.f41920Y;
        if (iX != enumC3427c.getProgress()) {
            x4.g.t().o0(enumC3427c.getProgress());
        }
        com.apptionlabs.meater_app.views.X.f32816z = true;
        Intent intent = new Intent(activity, (Class<?>) QSGActivity.class);
        intent.putExtra(MEATERIntent.EXTRA_QSG_FROM_INSIDE_APP, true);
        activity.startActivity(intent);
    }

    public static final void x(final EnumC1600h contentType, final EnumC1593a scaleType, final K4.b onGoingRecipe, InterfaceC1554l interfaceC1554l, final int i10) {
        InterfaceC1563p0 interfaceC1563p0;
        C3862t.g(contentType, "contentType");
        C3862t.g(scaleType, "scaleType");
        C3862t.g(onGoingRecipe, "onGoingRecipe");
        InterfaceC1554l interfaceC1554lR = interfaceC1554l.r(-989802209);
        if (C1560o.J()) {
            C1560o.S(-989802209, i10, -1, "com.apptionlabs.meater_app.dashboard.ui.CardWithoutDevice (MainScreen.kt:517)");
        }
        Object objO = interfaceC1554lR.o(androidx.compose.ui.platform.M.g());
        C3862t.e(objO, "null cannot be cast to non-null type android.app.Activity");
        final Activity activity = (Activity) objO;
        interfaceC1554lR.S(-193313040);
        Object objF = interfaceC1554lR.f();
        InterfaceC1554l.Companion companion = InterfaceC1554l.INSTANCE;
        if (objF == companion.a()) {
            objF = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF);
        }
        final InterfaceC1563p0 interfaceC1563p02 = (InterfaceC1563p0) objF;
        interfaceC1554lR.I();
        interfaceC1554lR.S(-193310737);
        Object objF2 = interfaceC1554lR.f();
        if (objF2 == companion.a()) {
            objF2 = r1.c(U0.h.p(U0.h.u(0)), null, 2, null);
            interfaceC1554lR.J(objF2);
        }
        final InterfaceC1563p0 interfaceC1563p03 = (InterfaceC1563p0) objF2;
        interfaceC1554lR.I();
        interfaceC1554lR.S(-193308571);
        Object objF3 = interfaceC1554lR.f();
        if (objF3 == companion.a()) {
            objF3 = r1.c(Boolean.FALSE, null, 2, null);
            interfaceC1554lR.J(objF3);
        }
        final InterfaceC1563p0 interfaceC1563p04 = (InterfaceC1563p0) objF3;
        interfaceC1554lR.I();
        interfaceC1554lR.S(-193307069);
        if (((Boolean) interfaceC1563p04.getValue()).booleanValue()) {
            interfaceC1554lR.S(-193303174);
            Object objF4 = interfaceC1554lR.f();
            if (objF4 == companion.a()) {
                objF4 = new Ba.a() { // from class: J4.x0
                    @Override // Ba.a
                    public final Object invoke() {
                        return z0.C(interfaceC1563p04);
                    }
                };
                interfaceC1554lR.J(objF4);
            }
            interfaceC1554lR.I();
            interfaceC1563p0 = interfaceC1563p04;
            Z.c(null, onGoingRecipe, (Ba.a) objF4, interfaceC1554lR, ((i10 >> 3) & 112) | 384, 1);
        } else {
            interfaceC1563p0 = interfaceC1563p04;
        }
        interfaceC1554lR.I();
        b0.i iVarN0 = n0(true, contentType, null, scaleType, 4, null);
        y0.I iH = androidx.compose.foundation.layout.d.h(b0.c.INSTANCE.o(), false);
        int iA = C1550j.a(interfaceC1554lR, 0);
        InterfaceC1578x interfaceC1578xF = interfaceC1554lR.F();
        b0.i iVarE = b0.h.e(interfaceC1554lR, iVarN0);
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
        C1.b(interfaceC1554lA, iH, companion2.c());
        C1.b(interfaceC1554lA, interfaceC1578xF, companion2.e());
        Ba.p<InterfaceC0828g, Integer, C4153F> pVarB = companion2.b();
        if (interfaceC1554lA.getInserting() || !C3862t.b(interfaceC1554lA.f(), Integer.valueOf(iA))) {
            interfaceC1554lA.J(Integer.valueOf(iA));
            interfaceC1554lA.k(Integer.valueOf(iA), pVarB);
        }
        C1.b(interfaceC1554lA, iVarE, companion2.d());
        androidx.compose.foundation.layout.f fVar = androidx.compose.foundation.layout.f.f22255a;
        float fA = A(interfaceC1563p03);
        interfaceC1554lR.S(389589683);
        Object objF5 = interfaceC1554lR.f();
        if (objF5 == companion.a()) {
            final InterfaceC1563p0 interfaceC1563p05 = interfaceC1563p0;
            objF5 = new Ba.a() { // from class: J4.y0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.D(interfaceC1563p05, interfaceC1563p02);
                }
            };
            interfaceC1554lR.J(objF5);
        }
        interfaceC1554lR.I();
        int i11 = i10 & 112;
        Q.A(true, scaleType, contentType, fA, (Ba.a) objF5, interfaceC1554lR, i11 | 24582 | ((i10 << 6) & 896), 0);
        String recipeTitle = onGoingRecipe.getRecipeTitle();
        boolean zY = y(interfaceC1563p02);
        float fA2 = U0.a(80.0f);
        interfaceC1554lR.S(389602230);
        Object objF6 = interfaceC1554lR.f();
        if (objF6 == companion.a()) {
            objF6 = new Ba.l() { // from class: J4.d0
                @Override // Ba.l
                public final Object invoke(Object obj) {
                    return z0.E(interfaceC1563p03, (U0.h) obj);
                }
            };
            interfaceC1554lR.J(objF6);
        }
        Ba.l lVar = (Ba.l) objF6;
        interfaceC1554lR.I();
        interfaceC1554lR.S(389603706);
        Object objF7 = interfaceC1554lR.f();
        if (objF7 == companion.a()) {
            objF7 = new Ba.a() { // from class: J4.e0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.F(interfaceC1563p02);
                }
            };
            interfaceC1554lR.J(objF7);
        }
        Ba.a aVar = (Ba.a) objF7;
        interfaceC1554lR.I();
        interfaceC1554lR.S(389605371);
        Object objF8 = interfaceC1554lR.f();
        if (objF8 == companion.a()) {
            objF8 = new Ba.a() { // from class: J4.f0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.G(interfaceC1563p02);
                }
            };
            interfaceC1554lR.J(objF8);
        }
        Ba.a aVar2 = (Ba.a) objF8;
        interfaceC1554lR.I();
        interfaceC1554lR.S(389606566);
        boolean zL = interfaceC1554lR.l(activity) | interfaceC1554lR.l(onGoingRecipe);
        Object objF9 = interfaceC1554lR.f();
        if (zL || objF9 == companion.a()) {
            objF9 = new Ba.a() { // from class: J4.g0
                @Override // Ba.a
                public final Object invoke() {
                    return z0.H(activity, onGoingRecipe);
                }
            };
            interfaceC1554lR.J(objF9);
        }
        interfaceC1554lR.I();
        Q.V(contentType, scaleType, recipeTitle, onGoingRecipe, zY, fA2, lVar, aVar, aVar2, (Ba.a) objF9, interfaceC1554lR, (i10 & 14) | 114819072 | i11 | ((i10 << 3) & 7168));
        interfaceC1554lR.P();
        if (C1560o.J()) {
            C1560o.R();
        }
        W0 w0Y = interfaceC1554lR.y();
        if (w0Y != null) {
            w0Y.a(new Ba.p() { // from class: J4.h0
                @Override // Ba.p
                public final Object invoke(Object obj, Object obj2) {
                    return z0.I(contentType, scaleType, onGoingRecipe, i10, (InterfaceC1554l) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final boolean y(InterfaceC1563p0<Boolean> interfaceC1563p0) {
        return interfaceC1563p0.getValue().booleanValue();
    }

    private static final void z(InterfaceC1563p0<Boolean> interfaceC1563p0, boolean z10) {
        interfaceC1563p0.setValue(Boolean.valueOf(z10));
    }
}
