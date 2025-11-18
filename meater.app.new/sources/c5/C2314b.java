package c5;

import P5.Q;
import android.content.Context;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.util.Log;
import android.widget.RemoteViews;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.data.Temperature;
import com.apptionlabs.meater_app.model.DeviceConnectionState;
import com.apptionlabs.meater_app.model.MEATERDeviceType;
import com.apptionlabs.meater_app.model.Probe;
import com.apptionlabs.meater_app.v3protobuf.DeviceCookState;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import va.C4929b;
import va.InterfaceC4928a;

/* compiled from: LiveNotificationController.kt */
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\b\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0015B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001c\u0010\u0013J\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J\u001f\u0010$\u001a\u00020\b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b$\u0010%J\u001f\u0010)\u001a\u00020\b2\u0006\u0010&\u001a\u00020\"2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010+\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b+\u0010,R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-R\"\u00104\u001a\u00020.8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010/\u001a\u0004\b0\u00101\"\u0004\b2\u00103¨\u00065"}, d2 = {"Lc5/b;", "", "Lc5/a;", "model", "<init>", "(Lc5/a;)V", "Lcom/apptionlabs/meater_app/model/Probe;", "probe", "Loa/F;", "g", "(Lcom/apptionlabs/meater_app/model/Probe;)V", "", "temp", "l", "(I)I", "second", "e", "", "f", "(Lcom/apptionlabs/meater_app/model/Probe;)Z", "", "a", "()Ljava/lang/CharSequence;", "timeInSeconds", "j", "(I)Ljava/lang/CharSequence;", "d", "(Lcom/apptionlabs/meater_app/model/Probe;)I", "c", "", "temperatureText", "Landroid/text/SpannableString;", "b", "(Ljava/lang/String;)Landroid/text/SpannableString;", "Landroid/widget/RemoteViews;", "view", "k", "(Ljava/lang/String;Landroid/widget/RemoteViews;)V", "collapsedViews", "Lcom/apptionlabs/meater_app/model/DeviceConnectionState;", "probeConnectionState", "i", "(Landroid/widget/RemoteViews;Lcom/apptionlabs/meater_app/model/DeviceConnectionState;)V", "h", "(Lcom/apptionlabs/meater_app/model/Probe;)Landroid/widget/RemoteViews;", "Lc5/a;", "Lc5/b$a;", "Lc5/b$a;", "getNotificationState", "()Lc5/b$a;", "setNotificationState", "(Lc5/b$a;)V", "notificationState", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: c5.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2314b {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final C2313a model;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private a notificationState;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: LiveNotificationController.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lc5/b$a;", "", "<init>", "(Ljava/lang/String;I)V", "B", "C", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.b$a */
    public static final class a {

        /* renamed from: B, reason: collision with root package name */
        public static final a f31007B = new a("OFFLINE", 0);

        /* renamed from: C, reason: collision with root package name */
        public static final a f31008C = new a("CONNECTED", 1);

        /* renamed from: D, reason: collision with root package name */
        private static final /* synthetic */ a[] f31009D;

        /* renamed from: E, reason: collision with root package name */
        private static final /* synthetic */ InterfaceC4928a f31010E;

        static {
            a[] aVarArrC = c();
            f31009D = aVarArrC;
            f31010E = C4929b.a(aVarArrC);
        }

        private a(String str, int i10) {
        }

        private static final /* synthetic */ a[] c() {
            return new a[]{f31007B, f31008C};
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) f31009D.clone();
        }
    }

    /* compiled from: LiveNotificationController.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: c5.b$b, reason: collision with other inner class name */
    public /* synthetic */ class C0433b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f31011a;

        static {
            int[] iArr = new int[DeviceCookState.values().length];
            try {
                iArr[DeviceCookState.COOK_STATE_COOK_CONFIGURED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_STARTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_READY_FOR_RESTING.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_RESTING.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_SLIGHTLY_UNDERDONE.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_FINISHED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DeviceCookState.COOK_STATE_SLIGHTLY_OVERDONE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f31011a = iArr;
        }
    }

    public C2314b(C2313a model) {
        C3862t.g(model, "model");
        this.model = model;
        this.notificationState = a.f31008C;
    }

    private final CharSequence a() {
        Context contextH = x4.g.h();
        if (this.model.getConnectionState() != DeviceConnectionState.CONNECTED) {
            String string = contextH.getString(R.string.device_disconnected_label);
            C3862t.d(string);
            return string;
        }
        switch (C0433b.f31011a[this.model.getCookState().ordinal()]) {
            case 1:
            case 2:
                if (this.model.getRemainingTime() > 0) {
                    return j(this.model.getRemainingTime());
                }
                String string2 = contextH.getString(R.string.estimate_cook_time_label);
                C3862t.d(string2);
                return string2;
            case 3:
                String string3 = contextH.getString(R.string.remove_from_heat_label);
                C3862t.f(string3, "getString(...)");
                return string3;
            case 4:
                String string4 = contextH.getString(R.string.resting_label);
                C3862t.f(string4, "getString(...)");
                return string4;
            case 5:
            case 6:
            case 7:
                String string5 = contextH.getString(R.string.ready_label);
                C3862t.f(string5, "getString(...)");
                return string5;
            default:
                return "";
        }
    }

    private final SpannableString b(String temperatureText) {
        SpannableString spannableString = new SpannableString(temperatureText);
        try {
            spannableString.setSpan(new RelativeSizeSpan(0.6f), temperatureText.length() - 3, temperatureText.length() - 1, 0);
        } catch (Exception unused) {
        }
        return spannableString;
    }

    private final boolean c(Probe probe) {
        return MEATERDeviceType.INSTANCE.MEATERDeviceTypeHasIndependentAmbient(probe.getMEATERDeviceType());
    }

    private final int d(Probe probe) {
        if (!probe.isBlockProbe()) {
            if (probe.getClipNumber() <= 0) {
                return -1;
            }
            int clipNumber = probe.getClipNumber();
            if (clipNumber == 1) {
                return R.drawable.ic_clip_small_1;
            }
            if (clipNumber == 2) {
                return R.drawable.ic_clip_small_2;
            }
            if (clipNumber == 3) {
                return R.drawable.ic_clip_small_3;
            }
            if (clipNumber != 4) {
                return -1;
            }
            return R.drawable.ic_clip_small_4;
        }
        int probeNumber = probe.getProbeNumber();
        if (probeNumber == 1) {
            return R.drawable.ic_box_1;
        }
        if (probeNumber == 2) {
            return R.drawable.ic_box_2;
        }
        if (probeNumber == 3) {
            return R.drawable.ic_box_3;
        }
        if (probeNumber == 4) {
            return R.drawable.ic_box_4;
        }
        switch (probeNumber) {
            case 17:
                return R.drawable.ic_box_1_grey;
            case 18:
                return R.drawable.ic_box_2_grey;
            case 19:
                return R.drawable.ic_box_3_grey;
            case 20:
                return R.drawable.ic_box_4_grey;
            default:
                return -1;
        }
    }

    private final int e(int second) {
        return second / 60;
    }

    private final boolean f(Probe probe) {
        if (probe.getConnectionState() != this.model.getConnectionState()) {
            return true;
        }
        int iL = l(probe.getInternalTemperature());
        int iL2 = l(this.model.getInternalTemperature());
        int iL3 = l(probe.getAmbientTemperature());
        int iL4 = l(this.model.getAmbientTemperature());
        int iE = e(probe.getTimeRemaining());
        int iE2 = e(this.model.getRemainingTime());
        DeviceCookState cookState = this.model.getCookState();
        DeviceCookState cookState2 = probe.getCookState();
        Log.d("Live_Notificaiton", " lInternal =  " + iL + " , pInternal =  " + iL2 + " , lAmbient =  " + iL3 + " ,  pAmbient =  " + iL4 + " ,  lRemaining =  " + iE + " , pRemaining =  " + iE2 + " , lCookSate =  " + cookState + " , pCookState =  " + cookState2 + " ");
        return (iL == iL2 && iL3 == iL4 && iE == iE2 && cookState == cookState2) ? false : true;
    }

    private final void g(Probe probe) {
        this.model.l(probe.getInternalTemperature());
        this.model.h(probe.getAmbientTemperature());
        this.model.o(probe.getTargetInternalTemperature());
        this.model.k(probe.cookNameForDisplay());
        this.model.n(probe.getTimeRemaining());
        this.model.i(probe.getConnectionState());
        this.model.j(probe.getCookState());
    }

    private final void i(RemoteViews collapsedViews, DeviceConnectionState probeConnectionState) {
        if (this.notificationState.ordinal() == probeConnectionState.ordinal()) {
            return;
        }
        if (probeConnectionState == DeviceConnectionState.CONNECTED) {
            this.notificationState = a.f31008C;
            collapsedViews.setInt(R.id.internalValues, "setBackgroundResource", R.drawable.internal_circle);
            collapsedViews.setInt(R.id.ambientValues, "setBackgroundResource", R.drawable.ambient_circle);
        } else {
            this.notificationState = a.f31008C;
            collapsedViews.setInt(R.id.internalValues, "setBackgroundResource", R.drawable.internal_circle_dim);
            collapsedViews.setInt(R.id.ambientValues, "setBackgroundResource", R.drawable.ambient_circle_dim);
        }
    }

    private final CharSequence j(int timeInSeconds) {
        long[] jArrU = Q.u(Math.max(60, timeInSeconds));
        C3862t.f(jArrU, "hoursAndMinutesForTime(...)");
        long j10 = jArrU[0];
        long j11 = jArrU[1];
        SpannableString spannableString = new SpannableString(String.valueOf(j10));
        spannableString.setSpan(new RelativeSizeSpan(1.18f), 0, spannableString.length(), 0);
        SpannableString spannableString2 = new SpannableString(x4.g.h().getString(R.string.time_string_h));
        spannableString2.setSpan(new RelativeSizeSpan(0.82f), 0, spannableString2.length(), 0);
        SpannableString spannableString3 = new SpannableString(String.valueOf(j11));
        spannableString3.setSpan(new RelativeSizeSpan(1.18f), 0, spannableString3.length(), 0);
        SpannableString spannableString4 = new SpannableString("m");
        spannableString4.setSpan(new RelativeSizeSpan(0.82f), 0, spannableString4.length(), 0);
        if (j10 > 0 && j11 > 0) {
            return TextUtils.concat(spannableString, spannableString2, " ", spannableString3, spannableString4, " " + x4.g.h().getString(R.string.remaining_label)).toString();
        }
        if (j10 > 0) {
            return TextUtils.concat(spannableString, spannableString2, " " + x4.g.h().getString(R.string.remaining_label)).toString();
        }
        return TextUtils.concat(spannableString3, spannableString4, " " + x4.g.h().getString(R.string.remaining_label)).toString();
    }

    private final void k(String temperatureText, RemoteViews view) {
        int length = temperatureText.length();
        if (this.model.getInternalTemperatureTextLength() == length) {
            return;
        }
        this.model.m(length);
        if (length > 5) {
            view.setTextViewTextSize(R.id.internalValues, 1, 12.0f);
        } else {
            view.setTextViewTextSize(R.id.internalValues, 1, 13.0f);
        }
    }

    private final int l(int temp) {
        return x4.g.t().n1() ? Temperature.toFahrenheit(temp) : Temperature.toCelsius(temp);
    }

    public final RemoteViews h(Probe probe) {
        C3862t.g(probe, "probe");
        if (!f(probe)) {
            Log.d("Live_Notificaiton", " NO NEED TO UPDATE ");
            return null;
        }
        g(probe);
        CharSequence charSequenceDisplayTemperature = Temperature.displayTemperature(this.model.getInternalTemperature());
        C3862t.f(charSequenceDisplayTemperature, "displayTemperature(...)");
        String strDisplayTemperature = Temperature.displayTemperature(this.model.getAmbientTemperature());
        C3862t.f(strDisplayTemperature, "displayTemperature(...)");
        String displayName = this.model.getDisplayName();
        RemoteViews remoteViews = new RemoteViews(x4.g.h().getPackageName(), R.layout.notificaiton_collapsed);
        remoteViews.setTextViewText(R.id.cookNameText, displayName);
        if (c(probe)) {
            String strDisplayTemperatureFloatValues = Temperature.displayTemperatureFloatValues(this.model.getInternalTemperature());
            C3862t.f(strDisplayTemperatureFloatValues, "displayTemperatureFloatValues(...)");
            k(strDisplayTemperatureFloatValues, remoteViews);
            charSequenceDisplayTemperature = b(strDisplayTemperatureFloatValues);
        }
        remoteViews.setTextViewText(R.id.internalValues, charSequenceDisplayTemperature);
        if (!probe.canDisplayAmbientTemperature()) {
            strDisplayTemperature = "-";
        }
        remoteViews.setTextViewText(R.id.ambientValues, strDisplayTemperature);
        remoteViews.setTextViewText(R.id.cookStateText, a());
        int iD = d(probe);
        DeviceConnectionState connectionState = probe.getConnectionState();
        C3862t.f(connectionState, "getConnectionState(...)");
        i(remoteViews, connectionState);
        if (iD != -1) {
            remoteViews.setInt(R.id.probeNumber, "setImageResource", iD);
            remoteViews.setViewVisibility(R.id.probeNumber, 0);
        } else {
            remoteViews.setViewVisibility(R.id.probeNumber, 8);
        }
        return remoteViews;
    }
}
