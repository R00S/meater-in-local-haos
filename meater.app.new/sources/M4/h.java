package M4;

import P5.C1597e;
import P5.Q;
import T4.A;
import T4.p;
import T5.j;
import V4.l;
import ac.H;
import ac.J;
import ac.t;
import android.view.E;
import android.view.InterfaceC2114v;
import android.view.a0;
import android.view.c0;
import com.apptionlabs.meater_app.data.Config;
import com.apptionlabs.meater_app.data.LocalStorage;
import com.apptionlabs.meater_app.model.DeviceConnectionMethod;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERBlock;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.MEATERPlus;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.model.ProbeEventLog;
import com.apptionlabs.meater_app.model.ThisDevice;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import com.apptionlabs.meater_app.v3protobuf.MEATERCloudState;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.r;
import kotlin.jvm.internal.C3862t;

/* compiled from: MEATERDeviceManager.kt */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0085\u0001xB\t\b\u0003¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\b\u001a\u00020\u00072\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0014\u0010\fJ\u0015\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b\u0015\u0010\fJ\u0017\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ+\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040 2\u0006\u0010\u0005\u001a\u00020\u00042\f\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00040\nH\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040 H\u0002¢\u0006\u0004\b$\u0010%J\u000f\u0010&\u001a\u00020\u0007H\u0002¢\u0006\u0004\b&\u0010'J\u0011\u0010)\u001a\u0004\u0018\u00010(H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010,\u001a\u00020\u00072\u0006\u0010+\u001a\u00020\u0016H\u0002¢\u0006\u0004\b,\u0010-J\u0015\u0010/\u001a\b\u0012\u0004\u0012\u00020.0\nH\u0002¢\u0006\u0004\b/\u0010\fJ+\u00100\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010\u0011J\u0017\u00104\u001a\u0002032\u0006\u00102\u001a\u000201H\u0002¢\u0006\u0004\b4\u00105J\u0013\u00106\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b6\u0010\fJ\u0017\u00109\u001a\u0004\u0018\u00010\u00042\u0006\u00108\u001a\u000207¢\u0006\u0004\b9\u0010:J\u0013\u0010;\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b;\u0010\fJ\u0013\u0010<\u001a\b\u0012\u0004\u0012\u00020\u00160\n¢\u0006\u0004\b<\u0010\fJ\u0013\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\b=\u0010\fJ\u0013\u0010>\u001a\b\u0012\u0004\u0012\u00020.0\n¢\u0006\u0004\b>\u0010\fJ\u000f\u0010?\u001a\u0004\u0018\u00010(¢\u0006\u0004\b?\u0010*J\u001b\u0010A\u001a\b\u0012\u0004\u0012\u00020.0\n2\u0006\u0010@\u001a\u000207¢\u0006\u0004\bA\u0010BJ\r\u0010C\u001a\u00020\u0007¢\u0006\u0004\bC\u0010'J\u001b\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010D\u001a\u00020\u0007¢\u0006\u0004\bE\u0010FJ\r\u0010G\u001a\u00020\u0018¢\u0006\u0004\bG\u0010\u0003J\u0015\u0010I\u001a\u00020\u00182\u0006\u0010\u000f\u001a\u00020H¢\u0006\u0004\bI\u0010JJ\r\u0010K\u001a\u00020\u0018¢\u0006\u0004\bK\u0010\u0003J\r\u0010L\u001a\u00020\u0018¢\u0006\u0004\bL\u0010\u0003J\u0015\u0010M\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bM\u0010NJ\r\u0010O\u001a\u00020\u0007¢\u0006\u0004\bO\u0010'J\u0015\u0010P\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bP\u0010QJ\u0015\u0010R\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bR\u0010QJ#\u0010V\u001a\u00020\u00182\f\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\u0006\u0010U\u001a\u00020T¢\u0006\u0004\bV\u0010WJ\u001b\u0010X\u001a\u00020\u00182\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\bX\u0010YJ\r\u0010Z\u001a\u00020\u0007¢\u0006\u0004\bZ\u0010'J\r\u0010[\u001a\u00020\u0007¢\u0006\u0004\b[\u0010'J\r\u0010\\\u001a\u00020\u0018¢\u0006\u0004\b\\\u0010\u0003J\u0015\u0010_\u001a\u00020\u00182\u0006\u0010^\u001a\u00020]¢\u0006\u0004\b_\u0010`J!\u0010a\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\ba\u0010\u0013J!\u0010b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\n¢\u0006\u0004\bb\u0010\u0013J\u0015\u0010c\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bc\u0010NJ\u0015\u0010d\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bd\u0010NJ\u0015\u0010f\u001a\u00020e2\u0006\u0010\u0017\u001a\u00020\u0004¢\u0006\u0004\bf\u0010gJ\u001d\u0010i\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u00042\u0006\u0010h\u001a\u00020\u0007¢\u0006\u0004\bi\u0010jJ3\u0010n\u001a\u00020\u0018\"\f\b\u0000\u0010c*\u00020k*\u0002012\u0006\u00102\u001a\u00028\u00002\u0006\u0010@\u001a\u0002072\u0006\u0010m\u001a\u00020l¢\u0006\u0004\bn\u0010oJ3\u0010q\u001a\u00020\u0018\"\f\b\u0000\u0010c*\u00020k*\u0002012\u0006\u00102\u001a\u00028\u00002\u0006\u0010D\u001a\u00020\u00072\u0006\u0010m\u001a\u00020p¢\u0006\u0004\bq\u0010rJ+\u0010s\u001a\u00020\u0018\"\f\b\u0000\u0010c*\u00020k*\u0002012\u0006\u00102\u001a\u00028\u00002\u0006\u0010m\u001a\u00020p¢\u0006\u0004\bs\u0010tJ#\u0010u\u001a\u00020\u0018\"\f\b\u0000\u0010c*\u00020k*\u0002012\u0006\u00102\u001a\u00028\u0000¢\u0006\u0004\bu\u0010vR \u0010z\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0w8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010yR$\u0010\u0080\u0001\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040 0{8\u0006¢\u0006\f\n\u0004\b|\u0010}\u001a\u0004\b~\u0010\u007fR\u001a\u0010\u0084\u0001\u001a\u00030\u0081\u00018\u0006@\u0006X\u0087\u000e¢\u0006\b\n\u0006\b\u0082\u0001\u0010\u0083\u0001¨\u0006\u0086\u0001"}, d2 = {"LM4/h;", "", "<init>", "()V", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "parent", "child", "", "m", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;Lcom/apptionlabs/meater_app/model/MEATERDevice;)Z", "", "h", "()Ljava/util/List;", "deviceList", "Lcom/apptionlabs/meater_app/model/MEATERDeviceType;", "type", "n", "(Ljava/util/List;Lcom/apptionlabs/meater_app/model/MEATERDeviceType;)Ljava/util/List;", "t", "(Ljava/util/List;)Ljava/util/List;", "W", "V", "Lcom/apptionlabs/meater_app/model/Probe;", "device", "Loa/F;", "k", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "", "oldCount", "e0", "(I)Z", "list", "Ljava/util/ArrayList;", "l", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;Ljava/util/List;)Ljava/util/ArrayList;", "devices", "g0", "(Ljava/util/ArrayList;)V", "w", "()Z", "Lcom/apptionlabs/meater_app/model/MEATERPlus;", "G", "()Lcom/apptionlabs/meater_app/model/MEATERPlus;", "probe", "v", "(Lcom/apptionlabs/meater_app/model/Probe;)Z", "LT4/p;", "f", "M", "Landroidx/lifecycle/c0;", "owner", "LT5/j;", "F", "(Landroidx/lifecycle/c0;)LT5/j;", "i", "", "theID", "o", "(J)Lcom/apptionlabs/meater_app/model/MEATERDevice;", "K", "L", "E", "O", "H", "deviceID", "g", "(J)Ljava/util/List;", "Q", "withParent", "U", "(Z)Ljava/util/List;", "d0", "Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;", "q", "(Lcom/apptionlabs/meater_app/model/DeviceConnectionMethod;)V", "p", "r", "J", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)Z", "I", "c0", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "f0", "newProbes", "Lcom/apptionlabs/meater_app/model/MEATERBlock;", "block", "a0", "(Ljava/util/List;Lcom/apptionlabs/meater_app/model/MEATERBlock;)V", "Z", "(Ljava/util/List;)V", "u", "x", "N", "Lcom/apptionlabs/meater_app/v3protobuf/MEATERCloudState;", "state", "e", "(Lcom/apptionlabs/meater_app/v3protobuf/MEATERCloudState;)V", "X", "Y", "T", "S", "", "b0", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)D", "shouldPair", "j", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;Z)V", "Landroidx/lifecycle/v;", "LM4/h$a;", "listener", "A", "(Landroidx/lifecycle/v;JLM4/h$a;)V", "LM4/h$b;", "C", "(Landroidx/lifecycle/v;ZLM4/h$b;)V", "y", "(Landroidx/lifecycle/v;LM4/h$b;)V", "P", "(Landroidx/lifecycle/v;)V", "Lac/t;", "b", "Lac/t;", "_allDevices", "Lac/H;", "c", "Lac/H;", "s", "()Lac/H;", "allDevices", "LO4/a;", "d", "LO4/a;", "connectDirectlyToBlockProbes", "a", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    public static final h f11978a;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private static final t<ArrayList<MEATERDevice>> _allDevices;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    private static final H<ArrayList<MEATERDevice>> allDevices;

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    public static O4.a connectDirectlyToBlockProbes;

    /* renamed from: e, reason: collision with root package name */
    public static final int f11982e;

    /* compiled from: MEATERDeviceManager.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"LM4/h$a;", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "device", "Loa/F;", "a", "(Lcom/apptionlabs/meater_app/model/MEATERDevice;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface a {
        void a(MEATERDevice device);
    }

    /* compiled from: MEATERDeviceManager.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bæ\u0080\u0001\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H&¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"LM4/h$b;", "", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "devices", "Loa/F;", "a", "(Ljava/util/List;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a(List<? extends MEATERDevice> devices);
    }

    /* compiled from: MEATERDeviceManager.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class c {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f11983a;

        static {
            int[] iArr = new int[O4.a.values().length];
            try {
                iArr[O4.a.f13232B.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[O4.a.f13233C.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[O4.a.f13234D.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f11983a = iArr;
        }
    }

    static {
        h hVar = new h();
        f11978a = hVar;
        t<ArrayList<MEATERDevice>> tVarA = J.a(new ArrayList());
        _allDevices = tVarA;
        allDevices = tVarA;
        connectDirectlyToBlockProbes = O4.a.f13232B;
        hVar.N();
        f11982e = 8;
    }

    private h() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void B(long j10, a aVar, MEATERDevice mEATERDevice) {
        MEATERDevice mEATERDeviceO = f11978a.o(j10);
        if (mEATERDeviceO != null) {
            aVar.a(mEATERDeviceO);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void D(b bVar, boolean z10, List list) {
        bVar.a(f11978a.U(z10));
    }

    private final j F(c0 owner) {
        return (j) new a0(owner).b(j.class);
    }

    private final MEATERPlus G() {
        Object next;
        Iterator<T> it = _allDevices.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MEATERDevice mEATERDevice = (MEATERDevice) next;
            Probe probeRelatedProbe = mEATERDevice.relatedProbe();
            if (mEATERDevice.isMEATERPlus() && ((!mEATERDevice.isPaired() && mEATERDevice.isOnline()) || probeRelatedProbe == null || probeRelatedProbe.getConnectionState() != DeviceConnectionState.CONNECTED)) {
                break;
            }
        }
        if (next instanceof MEATERPlus) {
            return (MEATERPlus) next;
        }
        return null;
    }

    private final List<MEATERDevice> M(List<? extends MEATERDevice> deviceList, MEATERDeviceType type) {
        ArrayList arrayList = new ArrayList();
        List<MEATERDevice> listG = M4.c.g(n(deviceList, type));
        C3862t.f(listG, "sortDevicesByDateProbeNumAndDeviceID(...)");
        for (MEATERDevice mEATERDevice : listG) {
            arrayList.add(mEATERDevice);
            ArrayList arrayList2 = new ArrayList();
            for (Object obj : deviceList) {
                if (((MEATERDevice) obj).getParentDeviceID() == mEATERDevice.getDeviceID()) {
                    arrayList2.add(obj);
                }
            }
            List<MEATERDevice> listI = (type == MEATERDeviceType.BLOCK || type == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) ? M4.c.i(arrayList2) : M4.c.g(arrayList2);
            C3862t.d(listI);
            arrayList.addAll(listI);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean R(MEATERDevice it) {
        C3862t.g(it, "it");
        return !it.isPaired();
    }

    private final List<MEATERDevice> V() {
        return X(K());
    }

    private final List<MEATERDevice> W() {
        return Y(K());
    }

    private final boolean e0(int oldCount) {
        return oldCount <= 5 && h().size() > 5;
    }

    private final List<p> f() {
        ArrayList arrayList = new ArrayList(K());
        arrayList.addAll(l.g0().t());
        arrayList.add(ThisDevice.INSTANCE);
        return arrayList;
    }

    private final void g0(ArrayList<MEATERDevice> devices) {
        if (devices.isEmpty()) {
            return;
        }
        Iterator<T> it = devices.iterator();
        while (it.hasNext()) {
            U4.b.o("Will save modified device %s to disk", ((MEATERDevice) it.next()).getDebugLogDescription());
        }
        LocalStorage.sharedStorage().deviceDAO().g(devices);
    }

    private final List<MEATERDevice> h() {
        List<MEATERDevice> listK = K();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((MEATERDevice) obj).deviceIsConnectedOverBLE()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final void k(Probe device) {
        K4.b bVarG = K4.a.f8678a.g(device.getDeviceID());
        if (bVarG != null) {
            String stepTitle = bVarG.getStepTitle();
            if (stepTitle.length() <= 0) {
                U4.b.t("(MeaterDeviceManager) Step Title is Empty, Hence Skipped to Set in Probe", new Object[0]);
                return;
            }
            device.setOnGoingRecipeStepTitle(stepTitle);
            U4.b.t("(MeaterDeviceManager) Set Recipe Step Title to Probe : " + stepTitle, new Object[0]);
        }
    }

    private final ArrayList<MEATERDevice> l(MEATERDevice parent, List<? extends MEATERDevice> list) {
        ArrayList<MEATERDevice> arrayList = new ArrayList<>();
        Iterator<MEATERDevice> it = parent.getChildDevices().iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            Iterator<? extends MEATERDevice> it2 = list.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    arrayList.add(next);
                    break;
                }
                if (next.getDeviceID() == it2.next().getDeviceID()) {
                    break;
                }
            }
        }
        return arrayList;
    }

    private final boolean m(MEATERDevice parent, MEATERDevice child) {
        ArrayList<MEATERDevice> childDevices = parent.getChildDevices();
        C3862t.f(childDevices, "getChildDevices(...)");
        if (childDevices != null && childDevices.isEmpty()) {
            return false;
        }
        Iterator<T> it = childDevices.iterator();
        while (it.hasNext()) {
            if (((MEATERDevice) it.next()).getDeviceID() == child.getDeviceID()) {
                return true;
            }
        }
        return false;
    }

    private final List<MEATERDevice> n(List<? extends MEATERDevice> deviceList, MEATERDeviceType type) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : deviceList) {
            if (((MEATERDevice) obj).getMEATERDeviceType() == type) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final List<MEATERDevice> t(List<? extends MEATERDevice> deviceList) {
        ArrayList arrayList = new ArrayList();
        for (Object obj : deviceList) {
            if (((MEATERDevice) obj).isNumberedProbe()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    private final boolean v(Probe probe) {
        ArrayList<Long> pairedProbeIdentifiers;
        List<MEATERDevice> listK = K();
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        for (MEATERDevice mEATERDevice : listK) {
            if (mEATERDevice.isMEATERBlock() && mEATERDevice.getConnectionState() == DeviceConnectionState.CONNECTED && mEATERDevice.isRemoteClientConnection()) {
                MEATERBlock mEATERBlock = mEATERDevice instanceof MEATERBlock ? (MEATERBlock) mEATERDevice : null;
                if (mEATERBlock != null && (pairedProbeIdentifiers = mEATERBlock.getPairedProbeIdentifiers()) != null && !pairedProbeIdentifiers.isEmpty()) {
                    for (Long l10 : pairedProbeIdentifiers) {
                        long deviceID = probe.getDeviceID();
                        if (l10 != null && l10.longValue() == deviceID) {
                            return true;
                        }
                    }
                }
            }
        }
        return false;
    }

    private final boolean w() {
        List<MEATERDevice> listK = K();
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        for (MEATERDevice mEATERDevice : listK) {
            Probe probeRelatedProbe = mEATERDevice.relatedProbe();
            if (mEATERDevice.isMEATERPlus() && (probeRelatedProbe == null || probeRelatedProbe.getConnectionState() != DeviceConnectionState.CONNECTED)) {
                return true;
            }
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void z(b bVar, List list) {
        bVar.a(_allDevices.getValue());
    }

    public final <T extends InterfaceC2114v & c0> void A(T owner, final long deviceID, final a listener) {
        C3862t.g(owner, "owner");
        C3862t.g(listener, "listener");
        F(owner).i(deviceID).h(owner, new E() { // from class: M4.e
            @Override // android.view.E
            public final void b(Object obj) {
                h.B(deviceID, listener, (MEATERDevice) obj);
            }
        });
    }

    public final <T extends InterfaceC2114v & c0> void C(T owner, final boolean withParent, final b listener) {
        C3862t.g(owner, "owner");
        C3862t.g(listener, "listener");
        F(owner).k().h(owner, new E() { // from class: M4.g
            @Override // android.view.E
            public final void b(Object obj) {
                h.D(listener, withParent, (List) obj);
            }
        });
    }

    public final List<MEATERDevice> E() {
        ArrayList<MEATERDevice> value = _allDevices.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((MEATERDevice) obj).haveMASTERConnection()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final MEATERPlus H() {
        Object next;
        Iterator<T> it = K().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            MEATERDevice mEATERDevice = (MEATERDevice) next;
            if (mEATERDevice.isMEATERPlus()) {
                MEATERPlus mEATERPlus = mEATERDevice instanceof MEATERPlus ? (MEATERPlus) mEATERDevice : null;
                if ((mEATERPlus != null ? mEATERPlus.getOtaUpdateInProgress() : null) != null) {
                    break;
                }
            }
        }
        if (next instanceof MEATERPlus) {
            return (MEATERPlus) next;
        }
        return null;
    }

    public final boolean I() {
        return h().isEmpty();
    }

    public final boolean J(MEATERDevice device) {
        C3862t.g(device, "device");
        int size = h().size();
        j(device, true);
        return e0(size);
    }

    public final List<MEATERDevice> K() {
        ArrayList<MEATERDevice> value = _allDevices.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            if (((MEATERDevice) obj).isPaired()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<Probe> L() {
        List<MEATERDevice> listK = K();
        ArrayList<MEATERDevice> arrayList = new ArrayList();
        for (Object obj : listK) {
            if (((MEATERDevice) obj).isMEATERProbe()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (MEATERDevice mEATERDevice : arrayList) {
            Probe probe = mEATERDevice instanceof Probe ? (Probe) mEATERDevice : null;
            if (probe != null) {
                arrayList2.add(probe);
            }
        }
        return arrayList2;
    }

    public final void N() {
        t<ArrayList<MEATERDevice>> tVar = _allDevices;
        tVar.getValue().clear();
        U4.b.o("OnStart Of App, Devices in db", new Object[0]);
        ArrayList<MEATERDevice> value = tVar.getValue();
        List<MEATERDevice> listA = LocalStorage.sharedStorage().deviceDAO().a();
        ArrayList arrayList = new ArrayList();
        for (MEATERDevice mEATERDevice : listA) {
            MEATERDevice mEATERDeviceNewDevice = MEATERDevice.newDevice(mEATERDevice.getProbeNumber(), mEATERDevice.getDeviceID());
            if (mEATERDeviceNewDevice != null) {
                mEATERDeviceNewDevice.setDeviceID(mEATERDevice.getDeviceID());
                mEATERDeviceNewDevice.setParentDeviceID(mEATERDevice.getParentDeviceID());
                mEATERDeviceNewDevice.setProbeNumber(mEATERDevice.getProbeNumber());
                mEATERDeviceNewDevice.setMacAddress(mEATERDevice.getMacAddress());
                mEATERDeviceNewDevice.setFirmwareRevision(mEATERDevice.getFirmwareRevision());
                mEATERDeviceNewDevice.setPaired(mEATERDevice.isPaired());
                mEATERDeviceNewDevice.setDatePaired(mEATERDevice.getDatePaired());
                mEATERDeviceNewDevice.setClipNumber(mEATERDevice.getClipNumber());
                mEATERDeviceNewDevice.setHaveNotifiedUserOfLowBattery(mEATERDevice.haveNotifiedUserOfLowBattery());
                mEATERDeviceNewDevice.setHaveNotifiedUserOfEmptyBattery(mEATERDevice.haveNotifiedUserOfEmptyBattery());
                U4.b.o("Device id : %s device isPaired: %s", mEATERDevice.getDeviceIDString(), Boolean.valueOf(mEATERDevice.isPaired()));
            } else {
                mEATERDeviceNewDevice = null;
            }
            if (mEATERDeviceNewDevice != null) {
                arrayList.add(mEATERDeviceNewDevice);
            }
        }
        value.addAll(arrayList);
        U4.b.o("Assign parents ", new Object[0]);
        ArrayList<MEATERDevice> value2 = _allDevices.getValue();
        ArrayList<MEATERDevice> arrayList2 = new ArrayList();
        for (Object obj : value2) {
            if (((MEATERDevice) obj).getParentDeviceID() != 0) {
                arrayList2.add(obj);
            }
        }
        for (MEATERDevice mEATERDevice2 : arrayList2) {
            h hVar = f11978a;
            MEATERDevice mEATERDeviceO = hVar.o(mEATERDevice2.getParentDeviceID());
            if (mEATERDeviceO != null) {
                U4.b.o("Device parentId id : %s child id : %s", mEATERDeviceO.getDeviceIDString(), mEATERDeviceO.getDeviceIDString());
                mEATERDeviceO.addChild(mEATERDevice2);
            }
            if (mEATERDevice2 instanceof Probe) {
                hVar.k((Probe) mEATERDevice2);
            }
        }
    }

    public final List<p> O() {
        ArrayList<MEATERDevice> value = _allDevices.getValue();
        ArrayList arrayList = new ArrayList();
        for (Object obj : value) {
            MEATERDevice mEATERDevice = (MEATERDevice) obj;
            if (mEATERDevice.isPaired()) {
                if (mEATERDevice.getParentDevice() != null) {
                    MEATERDevice parentDevice = mEATERDevice.getParentDevice();
                    C3862t.d(parentDevice);
                    if (!parentDevice.haveMASTERConnection()) {
                    }
                }
                if (mEATERDevice.getConnectionState() != DeviceConnectionState.CONNECTED || mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK || mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD) {
                    arrayList.add(obj);
                }
            }
        }
        return arrayList;
    }

    public final <T extends InterfaceC2114v & c0> void P(T owner) {
        C3862t.g(owner, "owner");
        F(owner).j().n(owner);
    }

    public final boolean Q() {
        return r.J(_allDevices.getValue(), new Ba.l() { // from class: M4.f
            @Override // Ba.l
            public final Object invoke(Object obj) {
                return Boolean.valueOf(h.R((MEATERDevice) obj));
            }
        });
    }

    public final boolean S(MEATERDevice device) {
        C3862t.g(device, "device");
        if ((!Config.INSTANCE.getInstance().CONNECT_DIRECTLY_TO_PROBES && device.isMEATERProbe()) || MEATERDeviceType.INSTANCE.MEATERDeviceShouldNotConnectDireclty(device.getMEATERDeviceType())) {
            return false;
        }
        if (device.isBlockProbe()) {
            return x4.g.t().h();
        }
        if (!T(device) || device.getMacAddress() == null) {
            return false;
        }
        if ((device.isMEATERBlock() && !((MEATERBlock) device).isSupportsBLEKeepAlive()) || !device.isPaired()) {
            return false;
        }
        MEATERPlus mEATERPlusH = H();
        if ((mEATERPlusH != null && mEATERPlusH != device) || b0(device) > 0.0d) {
            return false;
        }
        C1597e c1597eA = C1597e.INSTANCE.a();
        String strA = Q.A(device.getDeviceID());
        C3862t.f(strA, "longToReverseEndianHexString(...)");
        if (!c1597eA.d(strA)) {
            return false;
        }
        if (device.isBlockProbe()) {
            int i10 = c.f11983a[connectDirectlyToBlockProbes.ordinal()];
            if (i10 == 1) {
                connectDirectlyToBlockProbes = O4.a.f13234D;
                U4.b.a("Enable direct Block Probe pairing for " + device, new Object[0]);
            } else {
                if (i10 == 2) {
                    U4.b.a("BlockProbeConnectionMethod.Disabled directly for Block Probe pairing for " + device, new Object[0]);
                    return false;
                }
                if (i10 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
            }
        }
        List<MEATERDevice> listI = i();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listI) {
            if (!C3862t.b((MEATERDevice) obj, device)) {
                arrayList.add(obj);
            }
        }
        return arrayList.size() < 6;
    }

    public final boolean T(MEATERDevice device) {
        C3862t.g(device, "device");
        return b0(device) <= 0.0d;
    }

    public final List<MEATERDevice> U(boolean withParent) {
        return withParent ? V() : W();
    }

    public final List<MEATERDevice> X(List<? extends MEATERDevice> deviceList) {
        C3862t.g(deviceList, "deviceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = r.p(MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK, MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK, MEATERDeviceType.BLOCK, MEATERDeviceType.SECOND_GENERATION_PLUS_PRO, MEATERDeviceType.SECOND_GENERATION_PLUS, MEATERDeviceType.PLUS, MEATERDeviceType.PLUS_SE).iterator();
        while (it.hasNext()) {
            linkedHashSet.addAll(M(deviceList, (MEATERDeviceType) it.next()));
        }
        linkedHashSet.addAll(M4.c.i(t(deviceList)));
        linkedHashSet.addAll(M4.c.g(deviceList));
        return new ArrayList(linkedHashSet);
    }

    public final List<MEATERDevice> Y(List<? extends MEATERDevice> deviceList) {
        C3862t.g(deviceList, "deviceList");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.addAll(M(deviceList, MEATERDeviceType.BLOCK));
        linkedHashSet.addAll(M(deviceList, MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK));
        linkedHashSet.addAll(M4.c.i(t(deviceList)));
        linkedHashSet.addAll(M4.c.g(deviceList));
        ArrayList arrayList = new ArrayList();
        Iterator it = linkedHashSet.iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            Object next = it.next();
            C3862t.f(next, "next(...)");
            MEATERDevice mEATERDevice = (MEATERDevice) next;
            if (mEATERDevice instanceof A) {
                arrayList.add(mEATERDevice);
            }
        }
        return arrayList;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x000f A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void Z(java.util.List<? extends com.apptionlabs.meater_app.model.MEATERDevice> r14) {
        /*
            r13 = this;
            java.lang.String r0 = "devices"
            kotlin.jvm.internal.C3862t.g(r14, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
        Lf:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lf8
            java.lang.Object r2 = r14.next()
            com.apptionlabs.meater_app.model.MEATERDevice r2 = (com.apptionlabs.meater_app.model.MEATERDevice) r2
            boolean r3 = r2.isModified()
            ac.t<java.util.ArrayList<com.apptionlabs.meater_app.model.MEATERDevice>> r4 = M4.h._allDevices
            java.lang.Object r5 = r4.getValue()
            java.util.ArrayList r5 = (java.util.ArrayList) r5
            boolean r5 = r5.contains(r2)
            r6 = 1
            if (r5 != 0) goto L38
            java.lang.Object r3 = r4.getValue()
            java.util.ArrayList r3 = (java.util.ArrayList) r3
            r3.add(r2)
            r3 = r6
        L38:
            com.apptionlabs.meater_app.model.MEATERDevice r4 = r2.getParentDevice()
            long r7 = r2.getParentDeviceID()
            com.apptionlabs.meater_app.model.MEATERDevice r5 = r13.o(r7)
            r7 = 0
            java.lang.String r8 = "Parent of %s: %s -> %s"
            if (r4 == 0) goto L6f
            if (r5 == r4) goto L6f
            java.lang.String r3 = r2.getDebugLogDescription()
            java.lang.String r9 = r4.getDebugLogDescription()
            if (r5 == 0) goto L5a
            java.lang.String r10 = r5.getDebugLogDescription()
            goto L5b
        L5a:
            r10 = r7
        L5b:
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r9, r10}
            U4.b.o(r8, r3)
            r4.removeChild(r2)
            boolean r3 = r4.isPaired()
            if (r3 == 0) goto L6e
            r1 = r6
            r3 = r1
            goto L6f
        L6e:
            r3 = r6
        L6f:
            if (r5 == 0) goto Leb
            boolean r9 = r5.isPaired()
            if (r9 == 0) goto L7b
            if (r4 == r5) goto L87
            r1 = r6
            goto L87
        L7b:
            boolean r4 = r2.isPaired()
            if (r4 == 0) goto L87
            r3 = 0
            r2.setParentDeviceID(r3)
            goto Lf
        L87:
            boolean r4 = r5.isMEATERPlus()
            if (r4 == 0) goto Lb4
            com.apptionlabs.meater_app.model.Probe r4 = r5.relatedProbe()
            if (r4 == 0) goto Lb4
            long r9 = r4.getDeviceID()
            long r11 = r2.getDeviceID()
            int r9 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
            if (r9 == 0) goto Lb4
            java.lang.String r9 = r4.getDebugLogDescription()
            java.lang.String r10 = r5.getDebugLogDescription()
            java.lang.Object[] r9 = new java.lang.Object[]{r9, r10, r7}
            U4.b.o(r8, r9)
            r5.removeChild(r4)
            r0.add(r4)
        Lb4:
            boolean r4 = r13.m(r5, r2)
            if (r4 != 0) goto Lcd
            java.lang.String r3 = r2.getDebugLogDescription()
            java.lang.String r4 = r5.getDebugLogDescription()
            java.lang.Object[] r3 = new java.lang.Object[]{r3, r7, r4}
            U4.b.o(r8, r3)
            r5.addChild(r2)
            r3 = r6
        Lcd:
            boolean r4 = r5.isPaired()
            if (r4 == 0) goto Leb
            boolean r4 = r2.isPaired()
            if (r4 != 0) goto Leb
            r2.setPaired(r6)
            java.lang.String r1 = r2.getDebugLogDescription()
            java.lang.Object[] r1 = new java.lang.Object[]{r1}
            java.lang.String r3 = "Paring %s: NO -> YES"
            U4.b.o(r3, r1)
            r1 = r6
            goto Lec
        Leb:
            r6 = r3
        Lec:
            if (r6 == 0) goto Lf1
            r0.add(r2)
        Lf1:
            if (r1 == 0) goto Lf
            r2.notifyStateUpdated()
            goto Lf
        Lf8:
            r13.g0(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: M4.h.Z(java.util.List):void");
    }

    public final void a0(List<? extends MEATERDevice> newProbes, MEATERBlock block) {
        boolean z10;
        C3862t.g(newProbes, "newProbes");
        C3862t.g(block, "block");
        ArrayList<MEATERDevice> arrayList = new ArrayList<>();
        t<ArrayList<MEATERDevice>> tVar = _allDevices;
        if (!tVar.getValue().contains(block)) {
            tVar.getValue().add(block);
            arrayList.add(block);
        }
        Iterator<MEATERDevice> it = l(block, newProbes).iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            C3862t.f(next, "next(...)");
            MEATERDevice mEATERDevice = next;
            U4.b.o("Parent of %s: %s -> %s", mEATERDevice.getDebugLogDescription(), block.getDebugLogDescription(), null);
            block.removeChild(mEATERDevice);
            arrayList.add(mEATERDevice);
            if (block.isPaired() && mEATERDevice.isPaired()) {
                mEATERDevice.setPaired(false);
                U4.b.o("Paring %s: YES -> NO", mEATERDevice.getDebugLogDescription());
            }
        }
        for (MEATERDevice mEATERDevice2 : newProbes) {
            if (mEATERDevice2.getParentDeviceID() == block.getDeviceID() || mEATERDevice2.getConnectionState() != DeviceConnectionState.CONNECTED) {
                MEATERDevice parentDevice = mEATERDevice2.getParentDevice();
                boolean z11 = true;
                if (parentDevice == null || parentDevice.getDeviceID() == block.getDeviceID()) {
                    z10 = false;
                } else {
                    U4.b.o("Parent of %s: %s -> %s", mEATERDevice2.getDebugLogDescription(), parentDevice.getDebugLogDescription(), null);
                    parentDevice.removeChild(mEATERDevice2);
                    z10 = true;
                }
                if (!m(block, mEATERDevice2) && (mEATERDevice2.getConnectionMethod() == DeviceConnectionMethod.MEATER_LINK || mEATERDevice2.getConnectionMethod() == DeviceConnectionMethod.MEATER_CLOUD)) {
                    U4.b.o("Parent of %s: %s -> %s", mEATERDevice2.getDebugLogDescription(), null, block.getDebugLogDescription());
                    block.addChild(mEATERDevice2);
                    z10 = true;
                }
                if (!block.isPaired() || mEATERDevice2.isPaired()) {
                    z11 = z10;
                } else {
                    mEATERDevice2.setPaired(true);
                    U4.b.o("Paring %s: NO -> YES", mEATERDevice2.getDebugLogDescription());
                }
                if (z11) {
                    arrayList.add(mEATERDevice2);
                }
            }
        }
        g0(arrayList);
    }

    public final double b0(MEATERDevice device) {
        C3862t.g(device, "device");
        if (!device.isMEATERProbe()) {
            return 0.0d;
        }
        Probe probe = (Probe) device;
        boolean zV = v(probe);
        if ((probe.isPaired() && !w() && !zV) || probe.isRemotelyConnected()) {
            return 0.0d;
        }
        if (device.getFirstSeenAdvertising() == 0) {
            return 9.223372036854776E18d;
        }
        return Math.max(0.0d, (probe.isBlockProbe() ? (connectDirectlyToBlockProbes == O4.a.f13232B || zV) ? 30.0d : 0.0d : G() != null ? 7.5d : 5.0d) - ((System.currentTimeMillis() - device.getFirstSeenAdvertising()) / 1000));
    }

    public final void c0(MEATERDevice device) {
        C3862t.g(device, "device");
        j(device, false);
        device.disconnectImmediately();
    }

    public final void d0() {
        Iterator<T> it = _allDevices.getValue().iterator();
        while (it.hasNext()) {
            f11978a.c0((MEATERDevice) it.next());
        }
    }

    public final void e(MEATERCloudState state) {
        C3862t.g(state, "state");
        List<Probe> listL = L();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = listL.iterator();
        while (it.hasNext()) {
            ProbeEventLog eventLog = ((Probe) it.next()).getEventLog();
            if (eventLog != null) {
                arrayList.add(eventLog);
            }
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ((ProbeEventLog) it2.next()).meaterCloudStateChanged(state);
        }
    }

    public final void f0(MEATERDevice device) {
        C3862t.g(device, "device");
        if (device.isModified()) {
            LocalStorage.sharedStorage().deviceDAO().h(device);
        }
    }

    public final List<p> g(long deviceID) {
        List<p> listF = f();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listF) {
            if (((p) obj).getDeviceID() == deviceID) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final List<MEATERDevice> i() {
        List<MEATERDevice> listK = K();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listK) {
            MEATERDevice mEATERDevice = (MEATERDevice) obj;
            if (mEATERDevice.getParentDevice() == null && mEATERDevice.getConnectionState() == DeviceConnectionState.CONNECTED) {
                if (mEATERDevice.getConnectionMethod() != DeviceConnectionMethod.BLUETOOTH) {
                    if (mEATERDevice.isMEATERBlock()) {
                        C3862t.e(mEATERDevice, "null cannot be cast to non-null type com.apptionlabs.meater_app.model.MEATERBlock");
                        if (((MEATERBlock) mEATERDevice).isSupportsBLEKeepAlive()) {
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final void j(MEATERDevice device, boolean shouldPair) {
        C3862t.g(device, "device");
        if (device.isPaired() == shouldPair) {
            return;
        }
        device.setPaired(shouldPair);
        ArrayList<MEATERDevice> arrayList = new ArrayList<>();
        arrayList.add(device);
        Iterator it = new ArrayList(device.getChildDevices()).iterator();
        C3862t.f(it, "iterator(...)");
        while (it.hasNext()) {
            MEATERDevice mEATERDevice = (MEATERDevice) it.next();
            mEATERDevice.setPaired(shouldPair);
            if (!shouldPair) {
                device.removeChild(mEATERDevice);
            }
            arrayList.add(mEATERDevice);
        }
        if (!shouldPair) {
            MEATERDevice parentDevice = device.getParentDevice();
            if (parentDevice != null) {
                parentDevice.disconnectChild();
            } else {
                device.disconnectAllChildren();
            }
        }
        LocalStorage.sharedStorage().deviceDAO().g(arrayList);
    }

    public final MEATERDevice o(long theID) {
        Object next;
        Iterator<T> it = _allDevices.getValue().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((MEATERDevice) next).getDeviceID() == theID) {
                break;
            }
        }
        return (MEATERDevice) next;
    }

    public final void p() {
        List<MEATERDevice> listK = K();
        ArrayList<MEATERDevice> arrayList = new ArrayList();
        for (Object obj : listK) {
            MEATERDevice mEATERDevice = (MEATERDevice) obj;
            if (mEATERDevice.getParentDevice() == null && mEATERDevice.getConnectionMethod().isBluetoothConnectionMethod() && mEATERDevice.getConnectionState() != DeviceConnectionState.OFFLINE) {
                arrayList.add(obj);
            }
        }
        for (MEATERDevice mEATERDevice2 : arrayList) {
            mEATERDevice2.disconnectImmediately();
            mEATERDevice2.updateState();
        }
    }

    public final void q(DeviceConnectionMethod type) {
        C3862t.g(type, "type");
        List<MEATERDevice> listK = K();
        ArrayList<MEATERDevice> arrayList = new ArrayList();
        for (Object obj : listK) {
            MEATERDevice mEATERDevice = (MEATERDevice) obj;
            if (mEATERDevice.getParentDevice() == null && mEATERDevice.getConnectionMethod() == type && mEATERDevice.getConnectionState() == DeviceConnectionState.CONNECTED) {
                arrayList.add(obj);
            }
        }
        for (MEATERDevice mEATERDevice2 : arrayList) {
            mEATERDevice2.attemptToReconnectIfNeeded();
            mEATERDevice2.updateState();
        }
    }

    public final void r() {
        List<MEATERDevice> listK = K();
        ArrayList<MEATERDevice> arrayList = new ArrayList();
        for (Object obj : listK) {
            MEATERDevice mEATERDevice = (MEATERDevice) obj;
            if (mEATERDevice.isBlockProbe() && mEATERDevice.getConnectionMethod() == DeviceConnectionMethod.BLUETOOTH) {
                arrayList.add(obj);
            }
        }
        for (MEATERDevice mEATERDevice2 : arrayList) {
            mEATERDevice2.disconnectImmediately();
            mEATERDevice2.updateState();
        }
    }

    public final H<ArrayList<MEATERDevice>> s() {
        return allDevices;
    }

    public final boolean u() {
        List<MEATERDevice> listK = K();
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        for (MEATERDevice mEATERDevice : listK) {
            Probe probeRelatedProbe = mEATERDevice.relatedProbe();
            if (mEATERDevice.isMEATERPlus() || mEATERDevice.isMEATERProbe()) {
                if (mEATERDevice.getBleConnection() != null && probeRelatedProbe != null && probeRelatedProbe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
                    return true;
                }
            }
        }
        return false;
    }

    public final boolean x() {
        List<MEATERDevice> listK = K();
        if ((listK instanceof Collection) && listK.isEmpty()) {
            return false;
        }
        Iterator<T> it = listK.iterator();
        while (it.hasNext()) {
            Probe probeRelatedProbe = ((MEATERDevice) it.next()).relatedProbe();
            if (probeRelatedProbe != null && probeRelatedProbe.getCookState() != DeviceCookState.COOK_STATE_NOT_STARTED) {
                return true;
            }
        }
        return false;
    }

    public final <T extends InterfaceC2114v & c0> void y(T owner, final b listener) {
        C3862t.g(owner, "owner");
        C3862t.g(listener, "listener");
        F(owner).j().h(owner, new E() { // from class: M4.d
            @Override // android.view.E
            public final void b(Object obj) {
                h.z(listener, (List) obj);
            }
        });
    }
}
