package com.apptionlabs.meater_app.qsg.ui.pairing;

import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.fragment.app.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import c6.h;
import com.airbnb.lottie.LottieAnimationView;
import com.apptionlabs.meater_app.MainActivity;
import com.apptionlabs.meater_app.data.Log;
import com.apptionlabs.meater_app.model.MEATERDevice;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.qsg.ui.pairing.NearbyDevicesFragment;
import com.apptionlabs.meater_app.qsg.ui.pairing.a;
import com.google.android.material.button.MaterialButton;
import e.d;
import f8.l0;
import i7.o;
import ih.t;
import j6.j;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import q5.l;
import t5.x;
import wh.h0;
import wh.m;

/* compiled from: NearbyDevicesFragment.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u001eB\u0007¢\u0006\u0004\bF\u0010GJ\b\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010\u0005\u001a\u00020\u0003H\u0002J\b\u0010\u0006\u001a\u00020\u0003H\u0002J\b\u0010\u0007\u001a\u00020\u0003H\u0002J\u0018\u0010\u000b\u001a\u0004\u0018\u00010\t2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002J\u0016\u0010\u000f\u001a\u00020\r2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002J\b\u0010\u0010\u001a\u00020\u0003H\u0002J\u0010\u0010\u0011\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\tH\u0002J\b\u0010\u0012\u001a\u00020\u0003H\u0016J\b\u0010\u0013\u001a\u00020\u0003H\u0016J\b\u0010\u0014\u001a\u00020\u0003H\u0016J\b\u0010\u0015\u001a\u00020\u0003H\u0016J\b\u0010\u0016\u001a\u00020\u0003H\u0016J\b\u0010\u0017\u001a\u00020\u0003H\u0016J\b\u0010\u0018\u001a\u00020\u0003H\u0016J\u001a\u0010\u001d\u001a\u00020\u00032\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\u0010\u0010\u001e\u001a\u00020\u00032\u0006\u0010\u001c\u001a\u00020\u001bH\u0016J\b\u0010\u001f\u001a\u00020\u0003H\u0016J\b\u0010 \u001a\u00020\u0003H\u0016R\u0016\u0010$\u001a\u00020!8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\"\u0010#R\u001c\u0010'\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010+\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0016\u0010/\u001a\u00020,8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b-\u0010.R\u0018\u00103\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b1\u00102R\u0018\u00107\u001a\u0004\u0018\u0001048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u0010;\u001a\u0002088\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b9\u0010:R0\u0010E\u001a\u0010\u0012\f\u0012\n >*\u0004\u0018\u00010=0=0<8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b?\u0010@\u001a\u0004\bA\u0010B\"\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/pairing/NearbyDevicesFragment;", "Le7/b;", "Lj6/j;", "Lih/u;", "j3", "f3", "d3", "l3", "Ljava/util/ArrayList;", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "deviceList", "Z2", "device", "", "b3", "a3", "k3", "c3", "y2", "I2", "H2", "G2", "L2", "M2", "F2", "Lq5/l$a;", "DevicesListType", "", "position", "q", "a", "v1", "y1", "Li7/o;", "v0", "Li7/o;", "nearByDevicesAdapter", "w0", "Ljava/util/ArrayList;", "nearByDevicesList", "Lx5/a;", "x0", "Lx5/a;", "serviceScanner", "Lcom/apptionlabs/meater_app/qsg/ui/pairing/NearbyDevicesFragment$a;", "y0", "Lcom/apptionlabs/meater_app/qsg/ui/pairing/NearbyDevicesFragment$a;", "screenState", "Landroid/os/Handler;", "z0", "Landroid/os/Handler;", "searchingHandler", "Ljava/lang/Runnable;", "A0", "Ljava/lang/Runnable;", "searchingRunnable", "Lw6/b;", "B0", "Lw6/b;", "meaterDeviceType", "Landroidx/activity/result/c;", "Landroid/content/Intent;", "kotlin.jvm.PlatformType", "C0", "Landroidx/activity/result/c;", "getActivityResultLauncher", "()Landroidx/activity/result/c;", "setActivityResultLauncher", "(Landroidx/activity/result/c;)V", "activityResultLauncher", "<init>", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
/* loaded from: /tmp/meat/meat/classes.dex */
public final class NearbyDevicesFragment extends e7.b implements j {

    /* renamed from: A0, reason: from kotlin metadata */
    private Runnable searchingRunnable;

    /* renamed from: B0, reason: from kotlin metadata */
    private w6.b meaterDeviceType;

    /* renamed from: C0, reason: from kotlin metadata */
    private android.view.result.c<Intent> activityResultLauncher;

    /* renamed from: v0, reason: collision with root package name and from kotlin metadata */
    private o nearByDevicesAdapter;

    /* renamed from: w0, reason: collision with root package name and from kotlin metadata */
    private ArrayList<MEATERDevice> nearByDevicesList;

    /* renamed from: x0, reason: collision with root package name and from kotlin metadata */
    private final x5.a serviceScanner = new x5.a();

    /* renamed from: y0, reason: collision with root package name and from kotlin metadata */
    private a screenState = a.f9856q;

    /* renamed from: z0, reason: collision with root package name and from kotlin metadata */
    private Handler searchingHandler;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NearbyDevicesFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/apptionlabs/meater_app/qsg/ui/pairing/NearbyDevicesFragment$a;", "", "<init>", "(Ljava/lang/String;I)V", "q", "r", "s", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class a {

        /* renamed from: q, reason: collision with root package name */
        public static final a f9856q = new a("SCANNING", 0);

        /* renamed from: r, reason: collision with root package name */
        public static final a f9857r = new a("NO_DEVICE_FOUND", 1);

        /* renamed from: s, reason: collision with root package name */
        public static final a f9858s = new a("DEVICES_FOUND", 2);

        /* renamed from: t, reason: collision with root package name */
        private static final /* synthetic */ a[] f9859t;

        /* renamed from: u, reason: collision with root package name */
        private static final /* synthetic */ ph.a f9860u;

        static {
            a[] g10 = g();
            f9859t = g10;
            f9860u = ph.b.a(g10);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] g() {
            return new a[]{f9856q, f9857r, f9858s};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f9859t.clone();
        }
    }

    /* compiled from: NearbyDevicesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* loaded from: /tmp/meat/meat/classes.dex */
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f9861a;

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ int[] f9862b;

        static {
            int[] iArr = new int[w6.b.values().length];
            try {
                iArr[w6.b.f19359s.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w6.b.f19360t.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w6.b.f19361u.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[w6.b.f19362v.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[w6.b.f19364x.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[w6.b.f19363w.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[w6.b.f19365y.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f9861a = iArr;
            int[] iArr2 = new int[MEATERDeviceType.values().length];
            try {
                iArr2[MEATERDeviceType.BLOCK.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr2[MEATERDeviceType.SECOND_GENERATION_PLUS.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr2[MEATERDeviceType.PLUS.ordinal()] = 4;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr2[MEATERDeviceType.PLUS_SE.ordinal()] = 5;
            } catch (NoSuchFieldError unused12) {
            }
            f9862b = iArr2;
        }
    }

    /* compiled from: NearbyDevicesFragment.kt */
    @Metadata(d1 = {"\u0000\u001b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0016\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¨\u0006\u0007"}, d2 = {"com/apptionlabs/meater_app/qsg/ui/pairing/NearbyDevicesFragment$c", "Lc6/h$b;", "", "Lcom/apptionlabs/meater_app/model/MEATERDevice;", "devices", "Lih/u;", "a", "app_playstoreLiveRelease"}, k = 1, mv = {1, 9, 0})
    /* loaded from: /tmp/meat/meat/classes.dex */
    public static final class c implements h.b {
        c() {
        }

        @Override // c6.h.b
        public void a(List<? extends MEATERDevice> list) {
            o oVar;
            m.f(list, "devices");
            Iterator<? extends MEATERDevice> it = list.iterator();
            while (true) {
                oVar = null;
                if (!it.hasNext()) {
                    break;
                }
                MEATERDevice next = it.next();
                MEATERDeviceType mEATERDeviceType = next.getMEATERDeviceType();
                String shortDeviceIDString = next.shortDeviceIDString();
                boolean isPaired = next.isPaired();
                w6.b bVar = NearbyDevicesFragment.this.meaterDeviceType;
                if (bVar == null) {
                    m.t("meaterDeviceType");
                    bVar = null;
                }
                Log.info("listenForUpdatesToAllDevices***", " device type : " + mEATERDeviceType + " deviceId: " + shortDeviceIDString + "  isPaired : " + isPaired + " selected Type = " + bVar + " device Type" + next.getMEATERDeviceType() + "since advertising " + (System.currentTimeMillis() - next.getLastSeenAdvertising()));
                if (!next.isPaired() && next.isOnline() && h.f8879a.T(next)) {
                    ArrayList arrayList = NearbyDevicesFragment.this.nearByDevicesList;
                    if (arrayList == null) {
                        m.t("nearByDevicesList");
                        arrayList = null;
                    }
                    if (!arrayList.contains(next) && NearbyDevicesFragment.this.c3(next)) {
                        o oVar2 = NearbyDevicesFragment.this.nearByDevicesAdapter;
                        if (oVar2 == null) {
                            m.t("nearByDevicesAdapter");
                        } else {
                            oVar = oVar2;
                        }
                        oVar.J(next);
                    }
                }
            }
            o oVar3 = NearbyDevicesFragment.this.nearByDevicesAdapter;
            if (oVar3 == null) {
                m.t("nearByDevicesAdapter");
            } else {
                oVar = oVar3;
            }
            oVar.n();
        }
    }

    public NearbyDevicesFragment() {
        android.view.result.c<Intent> a22 = a2(new d(), new android.view.result.b() { // from class: i7.h
            @Override // android.view.result.b
            public final void a(Object obj) {
                NearbyDevicesFragment.Y2((android.view.result.a) obj);
            }
        });
        m.e(a22, "registerForActivityResult(...)");
        this.activityResultLauncher = a22;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void Y2(android.view.result.a aVar) {
        m.f(aVar, "result");
        aVar.b();
    }

    private final MEATERDevice Z2(ArrayList<MEATERDevice> deviceList) {
        Iterator<MEATERDevice> it = deviceList.iterator();
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            m.c(next);
            if (b3(next)) {
                return next;
            }
        }
        return null;
    }

    private final boolean a3(ArrayList<MEATERDevice> deviceList) {
        Iterator<MEATERDevice> it = deviceList.iterator();
        int i10 = 0;
        while (it.hasNext()) {
            MEATERDevice next = it.next();
            m.c(next);
            if (b3(next)) {
                i10++;
            }
        }
        if (i10 != 1) {
            return false;
        }
        return true;
    }

    private final boolean b3(MEATERDevice device) {
        MEATERDeviceType mEATERDeviceType = device.getMEATERDeviceType();
        m.e(mEATERDeviceType, "getMEATERDeviceType(...)");
        if ((device.isMEATERProbe() && C2() == w6.b.f19359s) || ((mEATERDeviceType == MEATERDeviceType.PLUS && C2() == w6.b.f19360t) || ((mEATERDeviceType == MEATERDeviceType.PLUS_SE && C2() == w6.b.f19362v) || ((mEATERDeviceType == MEATERDeviceType.BLOCK && C2() == w6.b.f19364x) || ((mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_PLUS && C2() == w6.b.f19361u) || (mEATERDeviceType == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK && C2() == w6.b.f19365y)))))) {
            return true;
        }
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean c3(MEATERDevice device) {
        w6.b bVar = this.meaterDeviceType;
        w6.b bVar2 = null;
        if (bVar == null) {
            m.t("meaterDeviceType");
            bVar = null;
        }
        if (bVar == w6.b.f19364x && device.getMEATERDeviceType() == MEATERDeviceType.BLOCK) {
            return true;
        }
        w6.b bVar3 = this.meaterDeviceType;
        if (bVar3 == null) {
            m.t("meaterDeviceType");
            bVar3 = null;
        }
        if (bVar3 == w6.b.f19365y && device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_FOUR_PROBE_BLOCK) {
            return true;
        }
        w6.b bVar4 = this.meaterDeviceType;
        if (bVar4 == null) {
            m.t("meaterDeviceType");
            bVar4 = null;
        }
        if (bVar4 == w6.b.f19363w && device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_TWO_PROBE_BLOCK) {
            return true;
        }
        w6.b bVar5 = this.meaterDeviceType;
        if (bVar5 == null) {
            m.t("meaterDeviceType");
            bVar5 = null;
        }
        if (bVar5 == w6.b.f19360t && device.getMEATERDeviceType() == MEATERDeviceType.PLUS) {
            return true;
        }
        w6.b bVar6 = this.meaterDeviceType;
        if (bVar6 == null) {
            m.t("meaterDeviceType");
            bVar6 = null;
        }
        if (bVar6 == w6.b.f19359s && device.isMEATERProbe() && device.getProbeNumber() == 0) {
            return true;
        }
        w6.b bVar7 = this.meaterDeviceType;
        if (bVar7 == null) {
            m.t("meaterDeviceType");
            bVar7 = null;
        }
        if (bVar7 == w6.b.f19361u && device.getMEATERDeviceType() == MEATERDeviceType.SECOND_GENERATION_PLUS) {
            return true;
        }
        w6.b bVar8 = this.meaterDeviceType;
        if (bVar8 == null) {
            m.t("meaterDeviceType");
        } else {
            bVar2 = bVar8;
        }
        if (bVar2 == w6.b.f19362v && device.getMEATERDeviceType() == MEATERDeviceType.PLUS_SE) {
            return true;
        }
        return false;
    }

    private final void d3() {
        this.screenState = a.f9858s;
        LottieAnimationView lottieAnimationView = A2().Q;
        m.e(lottieAnimationView, "animationView");
        g6.d.g(lottieAnimationView);
        RecyclerView recyclerView = A2().f8504b0;
        m.e(recyclerView, "nearByDevices");
        g6.d.j(recyclerView);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.g(materialButton);
        MaterialButton materialButton2 = A2().U;
        m.e(materialButton2, "buttonSkip");
        g6.d.g(materialButton2);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.j(appCompatTextView);
        A2().f8513k0.setText(A0(2132018279));
        A2().f8512j0.setText(A0(2132018278));
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: i7.l
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyDevicesFragment.e3(NearbyDevicesFragment.this, view);
            }
        });
        switch (b.f9861a[C2().ordinal()]) {
            case 1:
                AppCompatTextView appCompatTextView2 = A2().f8516n0;
                h0 h0Var = h0.a;
                Locale locale = Locale.US;
                String A0 = A0(2132018273);
                m.e(A0, "getString(...)");
                String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018144)}, 1));
                m.e(format, "format(locale, format, *args)");
                appCompatTextView2.setText(format);
                return;
            case 2:
            case 3:
            case 4:
                A2().f8512j0.setText(A0(2132018278));
                A2().f8516n0.setText(z2(2132018273));
                return;
            case 5:
            case 6:
            case 7:
                A2().f8512j0.setText(A0(2132018278));
                A2().f8516n0.setText(z2(2132018273));
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void e3(NearbyDevicesFragment nearbyDevicesFragment, View view) {
        m.f(nearbyDevicesFragment, "this$0");
        switch (b.f9861a[nearbyDevicesFragment.C2().ordinal()]) {
            case 1:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.e());
                return;
            case 2:
            case 3:
            case 4:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.g());
                return;
            case 5:
            case 6:
            case 7:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.f());
                return;
            default:
                return;
        }
    }

    private final void f3() {
        this.screenState = a.f9857r;
        LottieAnimationView lottieAnimationView = A2().Q;
        m.e(lottieAnimationView, "animationView");
        g6.d.j(lottieAnimationView);
        RecyclerView recyclerView = A2().f8504b0;
        m.e(recyclerView, "nearByDevices");
        g6.d.g(recyclerView);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.g(progressBar);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.j(materialButton);
        AppCompatTextView appCompatTextView = A2().f8516n0;
        m.e(appCompatTextView, "whyDoINeed");
        g6.d.j(appCompatTextView);
        A2().f8513k0.setText(A0(2132018310));
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8511i0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().f8516n0.setOnClickListener(new View.OnClickListener() { // from class: i7.i
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyDevicesFragment.g3(NearbyDevicesFragment.this, view);
            }
        });
        AppCompatTextView appCompatTextView2 = A2().f8511i0;
        m.e(appCompatTextView2, "reSelect");
        g6.d.j(appCompatTextView2);
        A2().f8511i0.setOnClickListener(new View.OnClickListener() { // from class: i7.j
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyDevicesFragment.h3(NearbyDevicesFragment.this, view);
            }
        });
        A2().Q.setAnimation(D2().t().w());
        switch (b.f9861a[C2().ordinal()]) {
            case 1:
                A2().f8512j0.setText(A0(2132017423));
                AppCompatTextView appCompatTextView3 = A2().f8516n0;
                h0 h0Var = h0.a;
                Locale locale = Locale.US;
                String A0 = A0(2132018273);
                m.e(A0, "getString(...)");
                String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018144)}, 1));
                m.e(format, "format(locale, format, *args)");
                appCompatTextView3.setText(format);
                break;
            case 2:
                A2().f8512j0.setText(A0(2132017423));
                A2().f8516n0.setText(z2(2132018273));
                break;
            case 3:
                h0 h0Var2 = h0.a;
                String string = com.apptionlabs.meater_app.app.a.i().getString(2132018977);
                m.e(string, "getString(...)");
                String format2 = String.format(string, Arrays.copyOf(new Object[]{15}, 1));
                m.e(format2, "format(format, *args)");
                TextView textView = A2().f8512j0;
                String string2 = com.apptionlabs.meater_app.app.a.i().getString(2132017421);
                m.e(string2, "getString(...)");
                String format3 = String.format(string2, Arrays.copyOf(new Object[]{format2}, 1));
                m.e(format3, "format(format, *args)");
                textView.setText(format3);
                A2().f8516n0.setText(z2(2132018273));
                break;
            case 4:
                A2().f8512j0.setText(A0(2132017423));
                A2().f8516n0.setText(z2(2132018273));
                break;
            case 5:
            case 6:
            case 7:
                A2().f8512j0.setText(A0(2132017422));
                A2().f8516n0.setText(z2(2132018273));
                break;
        }
        A2().Q.v();
        x5.b bVar = new x5.b();
        if (!bVar.getHaveWarnedUserAboutLocationServicesDisabled()) {
            s c22 = c2();
            m.e(c22, "requireActivity(...)");
            bVar.a(c22, true, new ArrayList());
        }
        if (D2().y()) {
            MaterialButton materialButton2 = A2().U;
            m.e(materialButton2, "buttonSkip");
            g6.d.j(materialButton2);
            A2().U.setOnClickListener(new View.OnClickListener() { // from class: i7.k
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    NearbyDevicesFragment.i3(NearbyDevicesFragment.this, view);
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void g3(NearbyDevicesFragment nearbyDevicesFragment, View view) {
        m.f(nearbyDevicesFragment, "this$0");
        switch (b.f9861a[nearbyDevicesFragment.C2().ordinal()]) {
            case 1:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.e());
                return;
            case 2:
            case 3:
            case 4:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.h());
                return;
            case 5:
            case 6:
            case 7:
                l0.H(nearbyDevicesFragment.Y(), i6.c.INSTANCE.j());
                return;
            default:
                return;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void h3(NearbyDevicesFragment nearbyDevicesFragment, View view) {
        m.f(nearbyDevicesFragment, "this$0");
        nearbyDevicesFragment.D2().I(w6.d.f19376v);
        t a10 = com.apptionlabs.meater_app.qsg.ui.pairing.a.a();
        m.e(a10, "actionToChooseProductFragment(...)");
        androidx.navigation.fragment.a.a(nearbyDevicesFragment).S(a10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i3(NearbyDevicesFragment nearbyDevicesFragment, View view) {
        m.f(nearbyDevicesFragment, "this$0");
        if (nearbyDevicesFragment.D2().s() == w6.d.N) {
            nearbyDevicesFragment.c2().finish();
        } else {
            nearbyDevicesFragment.t2(new Intent(nearbyDevicesFragment.e2(), (Class<?>) MainActivity.class));
            nearbyDevicesFragment.c2().finish();
        }
    }

    private final void j3() {
        this.screenState = a.f9856q;
        LottieAnimationView lottieAnimationView = A2().Q;
        m.e(lottieAnimationView, "animationView");
        g6.d.j(lottieAnimationView);
        RecyclerView recyclerView = A2().f8504b0;
        m.e(recyclerView, "nearByDevices");
        g6.d.g(recyclerView);
        MaterialButton materialButton = A2().S;
        m.e(materialButton, "button");
        g6.d.g(materialButton);
        MaterialButton materialButton2 = A2().U;
        m.e(materialButton2, "buttonSkip");
        g6.d.g(materialButton2);
        ProgressBar progressBar = A2().Z;
        m.e(progressBar, "loading");
        g6.d.j(progressBar);
        AppCompatTextView appCompatTextView = A2().f8511i0;
        m.e(appCompatTextView, "reSelect");
        g6.d.g(appCompatTextView);
        AppCompatTextView appCompatTextView2 = A2().f8516n0;
        m.e(appCompatTextView2, "whyDoINeed");
        g6.d.g(appCompatTextView2);
        A2().Q.setAnimation(D2().t().E());
        A2().f8516n0.setPaintFlags(A2().f8516n0.getPaintFlags() | 8);
        A2().Q.v();
        H2();
    }

    private final void k3() {
        if (!x.l() && x.q() == null && x.r() != null) {
            this.activityResultLauncher.a(new Intent("android.bluetooth.adapter.action.REQUEST_ENABLE"));
        }
    }

    private final void l3() {
        j3();
        k3();
        this.serviceScanner.b();
        this.searchingHandler = new Handler(Looper.getMainLooper());
        Runnable runnable = new Runnable() { // from class: i7.g
            @Override // java.lang.Runnable
            public final void run() {
                NearbyDevicesFragment.m3(NearbyDevicesFragment.this);
            }
        };
        this.searchingRunnable = runnable;
        Handler handler = this.searchingHandler;
        if (handler != null) {
            m.c(runnable);
            handler.postDelayed(runnable, 10000L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void m3(NearbyDevicesFragment nearbyDevicesFragment) {
        m.f(nearbyDevicesFragment, "this$0");
        ArrayList<MEATERDevice> arrayList = nearbyDevicesFragment.nearByDevicesList;
        ArrayList<MEATERDevice> arrayList2 = null;
        if (arrayList == null) {
            m.t("nearByDevicesList");
            arrayList = null;
        }
        int size = arrayList.size();
        if (size != 0) {
            if (size != 1) {
                ArrayList<MEATERDevice> arrayList3 = nearbyDevicesFragment.nearByDevicesList;
                if (arrayList3 == null) {
                    m.t("nearByDevicesList");
                    arrayList3 = null;
                }
                if (nearbyDevicesFragment.a3(arrayList3)) {
                    ArrayList<MEATERDevice> arrayList4 = nearbyDevicesFragment.nearByDevicesList;
                    if (arrayList4 == null) {
                        m.t("nearByDevicesList");
                    } else {
                        arrayList2 = arrayList4;
                    }
                    MEATERDevice Z2 = nearbyDevicesFragment.Z2(arrayList2);
                    if (Z2 != null) {
                        Z2.setLastSeenAdvertising(System.currentTimeMillis());
                        Z2.setModified(true);
                        h.f8879a.K(Z2);
                        a.C0139a b10 = com.apptionlabs.meater_app.qsg.ui.pairing.a.b(Z2.getDeviceID());
                        m.e(b10, "actionToPairingCompleteScreen(...)");
                        androidx.navigation.fragment.a.a(nearbyDevicesFragment).S(b10);
                        return;
                    }
                    nearbyDevicesFragment.d3();
                    return;
                }
                nearbyDevicesFragment.d3();
                return;
            }
            ArrayList<MEATERDevice> arrayList5 = nearbyDevicesFragment.nearByDevicesList;
            if (arrayList5 == null) {
                m.t("nearByDevicesList");
            } else {
                arrayList2 = arrayList5;
            }
            MEATERDevice mEATERDevice = arrayList2.get(0);
            m.e(mEATERDevice, "get(...)");
            MEATERDevice mEATERDevice2 = mEATERDevice;
            if (nearbyDevicesFragment.b3(mEATERDevice2)) {
                h.f8879a.K(mEATERDevice2);
                a.C0139a b11 = com.apptionlabs.meater_app.qsg.ui.pairing.a.b(mEATERDevice2.getDeviceID());
                m.e(b11, "actionToPairingCompleteScreen(...)");
                androidx.navigation.fragment.a.a(nearbyDevicesFragment).S(b11);
                return;
            }
            nearbyDevicesFragment.d3();
            return;
        }
        if (nearbyDevicesFragment.R0()) {
            nearbyDevicesFragment.f3();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void n3(NearbyDevicesFragment nearbyDevicesFragment, View view) {
        m.f(nearbyDevicesFragment, "this$0");
        nearbyDevicesFragment.l3();
    }

    @Override // e7.b
    public void F2() {
        A2().f8506d0.setProgress(100);
        A2().f8507e0.setProgress(100);
        A2().f8508f0.setProgress(100);
    }

    @Override // e7.b
    public void G2() {
        this.nearByDevicesList = new ArrayList<>();
        this.meaterDeviceType = C2();
        A2().f8504b0.setLayoutManager(new LinearLayoutManager(e2()));
        ArrayList<MEATERDevice> arrayList = this.nearByDevicesList;
        o oVar = null;
        if (arrayList == null) {
            m.t("nearByDevicesList");
            arrayList = null;
        }
        this.nearByDevicesAdapter = new o(arrayList);
        RecyclerView recyclerView = A2().f8504b0;
        o oVar2 = this.nearByDevicesAdapter;
        if (oVar2 == null) {
            m.t("nearByDevicesAdapter");
            oVar2 = null;
        }
        recyclerView.setAdapter(oVar2);
        o oVar3 = this.nearByDevicesAdapter;
        if (oVar3 == null) {
            m.t("nearByDevicesAdapter");
        } else {
            oVar = oVar3;
        }
        oVar.N(this);
        h.f8879a.y(this, new c());
        if (!x.l()) {
            x.p();
        }
    }

    @Override // e7.b
    public void H2() {
        switch (b.f9861a[C2().ordinal()]) {
            case 1:
                A2().f8512j0.setText(A0(2132018110));
                return;
            case 2:
            case 3:
            case 4:
                A2().f8512j0.setText(A0(2132018109));
                return;
            case 5:
            case 6:
            case 7:
                A2().f8512j0.setText(A0(2132017354));
                return;
            default:
                return;
        }
    }

    @Override // e7.b
    public void I2() {
        if (b.f9861a[C2().ordinal()] == 1) {
            AppCompatTextView appCompatTextView = A2().f8513k0;
            h0 h0Var = h0.a;
            Locale locale = Locale.US;
            String A0 = A0(2132018111);
            m.e(A0, "getString(...)");
            String format = String.format(locale, A0, Arrays.copyOf(new Object[]{A0(2132018143)}, 1));
            m.e(format, "format(locale, format, *args)");
            appCompatTextView.setText(format);
            return;
        }
        A2().f8513k0.setText(z2(2132018111));
    }

    @Override // e7.b
    public void L2() {
        A2().S.setText(A0(2132018850));
        A2().S.setOnClickListener(new View.OnClickListener() { // from class: i7.f
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                NearbyDevicesFragment.n3(NearbyDevicesFragment.this, view);
            }
        });
    }

    @Override // j6.j
    public void q(l.a aVar, int i10) {
        ArrayList<MEATERDevice> arrayList = this.nearByDevicesList;
        if (arrayList == null) {
            m.t("nearByDevicesList");
            arrayList = null;
        }
        MEATERDevice mEATERDevice = arrayList.get(i10);
        m.e(mEATERDevice, "get(...)");
        MEATERDevice mEATERDevice2 = mEATERDevice;
        h.f8879a.K(mEATERDevice2);
        int i11 = b.f9862b[mEATERDevice2.getMEATERDeviceType().ordinal()];
        if (i11 != 1) {
            if (i11 != 2) {
                if (i11 != 3) {
                    if (i11 != 4) {
                        if (i11 != 5) {
                            D2().J(w6.b.f19359s);
                        } else {
                            D2().J(w6.b.f19362v);
                        }
                    } else {
                        D2().J(w6.b.f19360t);
                    }
                } else {
                    D2().J(w6.b.f19361u);
                }
            } else {
                D2().J(w6.b.f19365y);
            }
        } else {
            D2().J(w6.b.f19364x);
        }
        a.C0139a b10 = com.apptionlabs.meater_app.qsg.ui.pairing.a.b(mEATERDevice2.getDeviceID());
        m.e(b10, "actionToPairingCompleteScreen(...)");
        androidx.navigation.fragment.a.a(this).S(b10);
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        l3();
    }

    @Override // androidx.fragment.app.Fragment
    public void y1() {
        super.y1();
        this.serviceScanner.d();
        Handler handler = this.searchingHandler;
        if (handler != null) {
            Runnable runnable = this.searchingRunnable;
            m.c(runnable);
            handler.removeCallbacks(runnable);
        }
        this.searchingHandler = null;
    }

    @Override // e7.b
    public void y2() {
        w6.d B2 = B2();
        w6.d dVar = w6.d.K;
        if (B2.compareTo(dVar) > 0) {
            return;
        }
        D2().I(dVar);
    }

    @Override // e7.b
    public void M2() {
    }

    @Override // j6.j
    public void a(int i10) {
    }
}
