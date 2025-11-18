package T5;

import I4.DeviceInfo;
import P5.EnumC1600h;
import T5.m;
import Xb.C1837g;
import Xb.C1841i;
import Xb.F;
import Xb.G0;
import Xb.I;
import Xb.InterfaceC1867v0;
import Xb.T;
import Xb.Z;
import ac.C1972g;
import ac.H;
import ac.J;
import ac.t;
import android.view.B;
import android.view.Y;
import androidx.compose.runtime.snapshots.SnapshotStateList;
import com.apptionlabs.meater_app.data.DateExtensionKt;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.data.NetworkConstant;
import com.apptionlabs.meater_app.model.CloudMQTTConnectionState;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.PendingRequest;
import com.apptionlabs.meater_app.model.Probe;
import com.google.gson.Gson;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import kotlin.m1;
import o4.Recipe;
import o4.RecipeAnalyticsRequestInput;
import oa.C4153F;
import oa.C4173r;
import ta.AbstractC4585a;
import ta.InterfaceC4588d;
import ua.C4696b;
import y4.C5127b;

/* compiled from: MainActivityViewModel.kt */
@Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0019\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u0019\u0010\u001aJ#\u0010\u001e\u001a\u0018\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d0\u000f¢\u0006\u0004\b\u001e\u0010\u0012J\u0013\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001c0\u000f¢\u0006\u0004\b\u001f\u0010\u0012J\u001d\u0010 \u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d¢\u0006\u0004\b \u0010!J%\u0010#\u001a\u00020\u00182\u0016\u0010\"\u001a\u0012\u0012\u0004\u0012\u00020\u001c0\u001bj\b\u0012\u0004\u0012\u00020\u001c`\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\u0018¢\u0006\u0004\b%\u0010\u001aJ\r\u0010&\u001a\u00020\u0018¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010)\u001a\u0004\u0018\u00010\n2\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0015¢\u0006\u0004\b+\u0010\u0017J\u000f\u0010,\u001a\u00020\u0018H\u0014¢\u0006\u0004\b,\u0010\u001aJ\u0015\u0010-\u001a\u00020\u00182\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b-\u0010.J\r\u0010/\u001a\u00020\u0018¢\u0006\u0004\b/\u0010\u001aJ\u0015\u00102\u001a\u00020\u00182\u0006\u00101\u001a\u000200¢\u0006\u0004\b2\u00103R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0018\u0010=\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u0018\u0010?\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010<R\u001a\u0010C\u001a\b\u0012\u0004\u0012\u00020A0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010BR\u001d\u0010I\u001a\b\u0012\u0004\u0012\u00020A0D8\u0006¢\u0006\f\n\u0004\bE\u0010F\u001a\u0004\bG\u0010HR(\u0010R\u001a\b\u0012\u0004\u0012\u00020K0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bL\u0010M\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u0017\u0010X\u001a\u00020S8\u0006¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR \u0010\\\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020Z0Y0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010BR \u0010^\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0J0@8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010BR#\u0010`\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020]0J0D8\u0006¢\u0006\f\n\u0004\b)\u0010F\u001a\u0004\b_\u0010HR\u0018\u00101\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010aR\u0014\u0010d\u001a\u00020b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010c¨\u0006e"}, d2 = {"LT5/m;", "Landroidx/lifecycle/Y;", "LR5/c;", "videoTutorialViewModel", "Lz5/j;", "recipeViewModel", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "networkConstant", "<init>", "(LR5/c;Lz5/j;Lcom/apptionlabs/meater_app/data/NetworkConstant;)V", "LK4/b;", "onGoingRecipeInfo", "Lo4/q;", "p", "(LK4/b;)Lo4/q;", "Landroidx/lifecycle/B;", "", "v", "()Landroidx/lifecycle/B;", "n", "()Z", "", "w", "()I", "Loa/F;", "l", "()V", "Ljava/util/ArrayList;", "", "Lkotlin/collections/ArrayList;", "y", "x", "t", "()Ljava/util/ArrayList;", "strings", "A", "(Ljava/util/ArrayList;)V", "z", "o", "", "deviceId", "m", "(J)LK4/b;", "E", "g", "D", "(LK4/b;)V", "F", "LP5/h;", "contentType", "B", "(LP5/h;)V", "b", "LR5/c;", "c", "Lz5/j;", "d", "Lcom/apptionlabs/meater_app/data/NetworkConstant;", "LXb/v0;", "e", "LXb/v0;", "currentOfferJob", "f", "cloudStatusJob", "Lac/t;", "Lcom/apptionlabs/meater_app/model/CloudMQTTConnectionState;", "Lac/t;", "_cloudStatus", "Lac/H;", "h", "Lac/H;", "q", "()Lac/H;", "cloudStatus", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "i", "Ljava/util/List;", "s", "()Ljava/util/List;", "C", "(Ljava/util/List;)V", "devices", "Ly4/b;", "j", "Ly4/b;", "u", "()Ly4/b;", "mScanDeviceSet", "Landroidx/compose/runtime/snapshots/k;", "LI4/a;", "k", "_sortedItems", "", "_dashboardList", "r", "dashboardList", "LP5/h;", "LXb/F;", "LXb/F;", "coroutineExceptionHandler", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class m extends Y {

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final R5.c videoTutorialViewModel;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private final z5.j recipeViewModel;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    private final NetworkConstant networkConstant;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 currentOfferJob;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    private InterfaceC1867v0 cloudStatusJob;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    private final t<CloudMQTTConnectionState> _cloudStatus;

    /* renamed from: h, reason: collision with root package name and from kotlin metadata */
    private final H<CloudMQTTConnectionState> cloudStatus;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    private List<? extends MEATERDevice> devices;

    /* renamed from: j, reason: collision with root package name and from kotlin metadata */
    private final C5127b mScanDeviceSet;

    /* renamed from: k, reason: collision with root package name and from kotlin metadata */
    private final t<SnapshotStateList<DeviceInfo>> _sortedItems;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    private final t<List<Object>> _dashboardList;

    /* renamed from: m, reason: collision with root package name and from kotlin metadata */
    private final H<List<Object>> dashboardList;

    /* renamed from: n, reason: collision with root package name and from kotlin metadata */
    private EnumC1600h contentType;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    private final F coroutineExceptionHandler;

    /* compiled from: MainActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.MainActivityViewModel$1", f = "MainActivityViewModel.kt", l = {135}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16127B;

        a(InterfaceC4588d<? super a> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(MEATERDevice mEATERDevice, MEATERDevice mEATERDevice2) {
            return !mEATERDevice2.isMaster() && mEATERDevice2.getParentDeviceID() == mEATERDevice.getDeviceID();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean o(Ba.l lVar, Object obj) {
            return ((Boolean) lVar.invoke(obj)).booleanValue();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new a(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            ArrayList arrayList;
            Object objE = C4696b.e();
            int i10 = this.f16127B;
            if (i10 != 0 && i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C4173r.b(obj);
            do {
                List<K4.b> listD = K4.a.f8678a.d();
                ((SnapshotStateList) m.this._sortedItems.getValue()).clear();
                if (m.this.contentType != null) {
                    if (m.this.contentType == EnumC1600h.f14042E || m.this.contentType == EnumC1600h.f14043F) {
                        List<MEATERDevice> listU = M4.h.f11978a.U(false);
                        C3862t.e(listU, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.MEATERDevice>");
                        arrayList = (ArrayList) listU;
                    } else {
                        M4.h hVar = M4.h.f11978a;
                        List<MEATERDevice> listX = hVar.X(hVar.U(true));
                        C3862t.e(listX, "null cannot be cast to non-null type java.util.ArrayList<com.apptionlabs.meater_app.model.MEATERDevice>");
                        arrayList = (ArrayList) listX;
                    }
                    ArrayList<MEATERDevice> arrayList2 = new ArrayList();
                    for (Object obj2 : arrayList) {
                        if (((MEATERDevice) obj2).isMEATERBlock()) {
                            arrayList2.add(obj2);
                        }
                    }
                    for (final MEATERDevice mEATERDevice : arrayList2) {
                        final Ba.l lVar = new Ba.l() { // from class: T5.k
                            @Override // Ba.l
                            public final Object invoke(Object obj3) {
                                return Boolean.valueOf(m.a.n(mEATERDevice, (MEATERDevice) obj3));
                            }
                        };
                        arrayList.removeIf(new Predicate() { // from class: T5.l
                            @Override // java.util.function.Predicate
                            public final boolean test(Object obj3) {
                                return m.a.o(lVar, obj3);
                            }
                        });
                    }
                    Iterator it = arrayList.iterator();
                    C3862t.f(it, "iterator(...)");
                    while (it.hasNext()) {
                        Object next = it.next();
                        C3862t.f(next, "next(...)");
                        MEATERDevice mEATERDevice2 = (MEATERDevice) next;
                        if (mEATERDevice2.isMEATERProbe()) {
                            ((SnapshotStateList) m.this._sortedItems.getValue()).add(new DeviceInfo(Calendar.getInstance().getTimeInMillis(), mEATERDevice2, K4.a.f8678a.e(((Probe) mEATERDevice2).getOngoingRecipeID())));
                        } else if (mEATERDevice2.isMEATERBlock()) {
                            ArrayList<MEATERDevice> childDevices = mEATERDevice2.getChildDevices();
                            C3862t.f(childDevices, "getChildDevices(...)");
                            if (!childDevices.isEmpty()) {
                                ((SnapshotStateList) m.this._sortedItems.getValue()).add(new DeviceInfo(Calendar.getInstance().getTimeInMillis(), mEATERDevice2, null, 4, null));
                            }
                        }
                    }
                }
                m.this._dashboardList.setValue(kotlin.collections.r.F0(listD, (Iterable) m.this._sortedItems.getValue()));
                this.f16127B = 1;
            } while (T.a(500L, this) != objE);
            return objE;
        }
    }

    /* compiled from: MainActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.MainActivityViewModel$resetOnGoingRecipe$1", f = "MainActivityViewModel.kt", l = {180}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class b extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16129B;

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
            Object objE = C4696b.e();
            int i10 = this.f16129B;
            if (i10 == 0) {
                C4173r.b(obj);
                K4.a aVar = K4.a.f8678a;
                this.f16129B = 1;
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

    /* compiled from: CoroutineExceptionHandler.kt */
    @Metadata(d1 = {"\u0000!\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u00012\u00020\u0002J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"T5/m$c", "Lta/a;", "LXb/F;", "Lta/g;", "context", "", "exception", "Loa/F;", "y", "(Lta/g;Ljava/lang/Throwable;)V", "kotlinx-coroutines-core"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class c extends AbstractC4585a implements F {
        public c(F.Companion companion) {
            super(companion);
        }

        @Override // Xb.F
        public void y(ta.g context, Throwable exception) {
            U4.b.e("Exception", exception);
        }
    }

    /* compiled from: MainActivityViewModel.kt */
    @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.MainActivityViewModel$watchCloudStatus$1", f = "MainActivityViewModel.kt", l = {262, 263}, m = "invokeSuspend")
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
    static final class d extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

        /* renamed from: B, reason: collision with root package name */
        int f16130B;

        /* compiled from: MainActivityViewModel.kt */
        @kotlin.coroutines.jvm.internal.f(c = "com.apptionlabs.meater_app.viewmodel.MainActivityViewModel$watchCloudStatus$1$1", f = "MainActivityViewModel.kt", l = {}, m = "invokeSuspend")
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LXb/I;", "Loa/F;", "<anonymous>", "(LXb/I;)V"}, k = 3, mv = {2, 0, 0})
        static final class a extends kotlin.coroutines.jvm.internal.l implements Ba.p<I, InterfaceC4588d<? super C4153F>, Object> {

            /* renamed from: B, reason: collision with root package name */
            int f16132B;

            /* renamed from: C, reason: collision with root package name */
            final /* synthetic */ m f16133C;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(m mVar, InterfaceC4588d<? super a> interfaceC4588d) {
                super(2, interfaceC4588d);
                this.f16133C = mVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
                return new a(this.f16133C, interfaceC4588d);
            }

            @Override // Ba.p
            public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
                return ((a) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C4696b.e();
                if (this.f16132B != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C4173r.b(obj);
                CloudMQTTConnectionState cloudMQTTConnectionStateP = M4.h.f11978a.K().size() <= 0 ? CloudMQTTConnectionState.DISCONNECTED : E4.i.D().P();
                if (cloudMQTTConnectionStateP == null) {
                    this.f16133C._cloudStatus.setValue(CloudMQTTConnectionState.DISCONNECTED);
                } else {
                    this.f16133C._cloudStatus.setValue(cloudMQTTConnectionStateP);
                }
                return C4153F.f46609a;
            }
        }

        d(InterfaceC4588d<? super d> interfaceC4588d) {
            super(2, interfaceC4588d);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final InterfaceC4588d<C4153F> create(Object obj, InterfaceC4588d<?> interfaceC4588d) {
            return m.this.new d(interfaceC4588d);
        }

        @Override // Ba.p
        public final Object invoke(I i10, InterfaceC4588d<? super C4153F> interfaceC4588d) {
            return ((d) create(i10, interfaceC4588d)).invokeSuspend(C4153F.f46609a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objE = C4696b.e();
            int i10 = this.f16130B;
            if (i10 == 0) {
                C4173r.b(obj);
                this.f16130B = 1;
                if (T.a(500L, this) == objE) {
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
                C4173r.b(obj);
            }
            G0 g0C = Z.c();
            a aVar = new a(m.this, null);
            this.f16130B = 2;
            if (C1837g.g(g0C, aVar, this) == objE) {
                return objE;
            }
            return C4153F.f46609a;
        }
    }

    public m(R5.c videoTutorialViewModel, z5.j recipeViewModel, NetworkConstant networkConstant) {
        C3862t.g(videoTutorialViewModel, "videoTutorialViewModel");
        C3862t.g(recipeViewModel, "recipeViewModel");
        C3862t.g(networkConstant, "networkConstant");
        this.videoTutorialViewModel = videoTutorialViewModel;
        this.recipeViewModel = recipeViewModel;
        this.networkConstant = networkConstant;
        t<CloudMQTTConnectionState> tVarA = J.a(CloudMQTTConnectionState.CONNECTING);
        this._cloudStatus = tVarA;
        this.cloudStatus = tVarA;
        this.devices = new ArrayList();
        this.mScanDeviceSet = new C5127b();
        this._sortedItems = J.a(m1.f());
        t<List<Object>> tVarA2 = J.a(kotlin.collections.r.m());
        this._dashboardList = tVarA2;
        this.dashboardList = C1972g.b(tVarA2);
        this.coroutineExceptionHandler = new c(F.INSTANCE);
        C1841i.d(android.view.Z.a(this), null, null, new a(null), 3, null);
    }

    private final RecipeAnalyticsRequestInput p(K4.b onGoingRecipeInfo) {
        Recipe recipeG = x5.g.f52863a.g(onGoingRecipeInfo.getRecipeId());
        if (recipeG == null) {
            return null;
        }
        RecipeAnalyticsRequestInput recipeAnalyticsRequestInput = new RecipeAnalyticsRequestInput(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262143, null);
        recipeAnalyticsRequestInput.D(Integer.valueOf(onGoingRecipeInfo.getRecipeId()));
        recipeAnalyticsRequestInput.v(Integer.valueOf(recipeG.getDescription().getTotalTimeMinutes()));
        recipeAnalyticsRequestInput.z(Integer.valueOf(recipeG.n().size()));
        recipeAnalyticsRequestInput.I(Integer.valueOf(onGoingRecipeInfo.getStepNumber()));
        recipeAnalyticsRequestInput.H(recipeG.n().get(onGoingRecipeInfo.getStepNumber()).getTitle());
        recipeAnalyticsRequestInput.G(recipeG.n().get(onGoingRecipeInfo.getStepNumber()).getEstimatedDurationMinutes());
        recipeAnalyticsRequestInput.y(x4.g.j());
        recipeAnalyticsRequestInput.x(x4.g.s());
        Date date = new Date();
        date.setTime(onGoingRecipeInfo.getLastStepTimeStamp());
        recipeAnalyticsRequestInput.F(DateExtensionKt.getServerDateFormat().format(date));
        date.setTime(Calendar.getInstance().getTimeInMillis());
        recipeAnalyticsRequestInput.s(DateExtensionKt.getServerDateFormat().format(date));
        long probeId = onGoingRecipeInfo.getProbeId();
        if (probeId != -1) {
            MEATERDevice mEATERDeviceO = M4.h.f11978a.o(probeId);
            C3862t.e(mEATERDeviceO, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.Probe");
            Probe probe = (Probe) mEATERDeviceO;
            recipeAnalyticsRequestInput.u(probe.getDeviceIDString());
            recipeAnalyticsRequestInput.C(Integer.valueOf(probe.getProbeNumber()));
            recipeAnalyticsRequestInput.B(Integer.valueOf(probe.getPeakTemperature()));
            recipeAnalyticsRequestInput.J(Integer.valueOf(probe.getTargetInternalTemperature()));
            String hexString = Long.toHexString(probe.getCookID());
            C3862t.f(hexString, "toHexString(...)");
            Locale locale = Locale.ROOT;
            String upperCase = hexString.toUpperCase(locale);
            C3862t.f(upperCase, "toUpperCase(...)");
            recipeAnalyticsRequestInput.t(upperCase);
            String hexString2 = Long.toHexString(probe.getOngoingRecipeID());
            C3862t.f(hexString2, "toHexString(...)");
            String upperCase2 = hexString2.toUpperCase(locale);
            C3862t.f(upperCase2, "toUpperCase(...)");
            recipeAnalyticsRequestInput.A(upperCase2);
        }
        return recipeAnalyticsRequestInput;
    }

    public final void A(ArrayList<String> strings) {
        C3862t.g(strings, "strings");
        this.videoTutorialViewModel.w(strings);
    }

    public final void B(EnumC1600h contentType) {
        C3862t.g(contentType, "contentType");
        this.contentType = contentType;
    }

    public final void C(List<? extends MEATERDevice> list) {
        C3862t.g(list, "<set-?>");
        this.devices = list;
    }

    public final void D(K4.b onGoingRecipeInfo) {
        C3862t.g(onGoingRecipeInfo, "onGoingRecipeInfo");
        RecipeAnalyticsRequestInput recipeAnalyticsRequestInputP = p(onGoingRecipeInfo);
        if (recipeAnalyticsRequestInputP != null) {
            PendingRequest pendingRequest = new PendingRequest();
            pendingRequest.requestMethod = this.networkConstant.getNetworkConstant().e();
            pendingRequest.requestBody = new Gson().t(recipeAnalyticsRequestInputP);
            LocalStorage.sharedStorage().pendingRequestDAO().b(pendingRequest);
        }
    }

    public final int E() {
        return P5.r.e(x5.g.f52863a.h(), x4.g.t().C());
    }

    public final void F() {
        this.cloudStatusJob = C1841i.d(android.view.Z.a(this), Z.b().s(this.coroutineExceptionHandler), null, new d(null), 2, null);
    }

    @Override // android.view.Y
    protected void g() {
        super.g();
        InterfaceC1867v0 interfaceC1867v0 = this.currentOfferJob;
        if (interfaceC1867v0 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v0, null, 1, null);
        }
        InterfaceC1867v0 interfaceC1867v02 = this.cloudStatusJob;
        if (interfaceC1867v02 != null) {
            InterfaceC1867v0.a.a(interfaceC1867v02, null, 1, null);
        }
    }

    public final void l() {
        this.videoTutorialViewModel.p();
    }

    public final K4.b m(long deviceId) {
        return K4.a.f8678a.g(deviceId);
    }

    public final boolean n() {
        return this.videoTutorialViewModel.n();
    }

    public final void o() {
        this.recipeViewModel.l();
    }

    public final H<CloudMQTTConnectionState> q() {
        return this.cloudStatus;
    }

    public final H<List<Object>> r() {
        return this.dashboardList;
    }

    public final List<MEATERDevice> s() {
        return this.devices;
    }

    public final ArrayList<String> t() {
        return this.videoTutorialViewModel.l();
    }

    /* renamed from: u, reason: from getter */
    public final C5127b getMScanDeviceSet() {
        return this.mScanDeviceSet;
    }

    public final B<Boolean> v() {
        return x5.g.f52863a.e();
    }

    public final int w() {
        return this.videoTutorialViewModel.t();
    }

    public final B<String> x() {
        return this.videoTutorialViewModel.v();
    }

    public final B<ArrayList<String>> y() {
        return this.videoTutorialViewModel.u();
    }

    public final void z() {
        C1841i.d(android.view.Z.a(this), null, null, new b(null), 3, null);
    }
}
