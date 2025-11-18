package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import com.google.android.gms.internal.measurement.C2456d1;
import com.google.android.gms.measurement.internal.P2;
import com.google.firebase.analytics.FirebaseAnalytics;
import g7.C3445p;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import v7.D;
import v7.W;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: b, reason: collision with root package name */
    private static volatile AppMeasurement f34725b;

    /* renamed from: a, reason: collision with root package name */
    private final a f34726a;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    public static class ConditionalUserProperty {

        @Keep
        public boolean mActive;

        @Keep
        public String mAppId;

        @Keep
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @Keep
        public String mName;

        @Keep
        public String mOrigin;

        @Keep
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @Keep
        public String mTriggerEventName;

        @Keep
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @Keep
        public long mTriggeredTimestamp;

        @Keep
        public Object mValue;

        public ConditionalUserProperty() {
        }

        ConditionalUserProperty(Bundle bundle) {
            C3445p.k(bundle);
            this.mAppId = (String) D.a(bundle, "app_id", String.class, null);
            this.mOrigin = (String) D.a(bundle, "origin", String.class, null);
            this.mName = (String) D.a(bundle, "name", String.class, null);
            this.mValue = D.a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) D.a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) D.a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) D.a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) D.a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) D.a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) D.a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) D.a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) D.a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) D.a(bundle, "expired_event_params", Bundle.class, null);
            this.mActive = ((Boolean) D.a(bundle, "active", Boolean.class, Boolean.FALSE)).booleanValue();
            this.mCreationTimestamp = ((Long) D.a(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            this.mTriggeredTimestamp = ((Long) D.a(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: com.google.android.gms:play-services-measurement-impl@@22.2.0 */
    static abstract class a implements W {
        private a() {
        }
    }

    private AppMeasurement(P2 p22) {
        this.f34726a = new b(p22);
    }

    private static AppMeasurement a(Context context, String str, String str2) {
        if (f34725b == null) {
            synchronized (AppMeasurement.class) {
                try {
                    if (f34725b == null) {
                        W wB = b(context, null);
                        if (wB != null) {
                            f34725b = new AppMeasurement(wB);
                        } else {
                            f34725b = new AppMeasurement(P2.c(context, new C2456d1(0L, 0L, true, null, null, null, null, null), null));
                        }
                    }
                } finally {
                }
            }
        }
        return f34725b;
    }

    private static W b(Context context, Bundle bundle) {
        return (W) FirebaseAnalytics.class.getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, null);
    }

    @Keep
    @Deprecated
    public static AppMeasurement getInstance(Context context) {
        return a(context, null, null);
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        this.f34726a.b(str);
    }

    @Keep
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) {
        this.f34726a.a(str, str2, bundle);
    }

    @Keep
    public void endAdUnitExposure(String str) {
        this.f34726a.r(str);
    }

    @Keep
    public long generateEventId() {
        return this.f34726a.i();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f34726a.g();
    }

    @Keep
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listD = this.f34726a.d(str, str2);
        ArrayList arrayList = new ArrayList(listD == null ? 0 : listD.size());
        Iterator<Bundle> it = listD.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f34726a.j();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f34726a.e();
    }

    @Keep
    public String getGmpAppId() {
        return this.f34726a.k();
    }

    @Keep
    public int getMaxUserProperties(String str) {
        return this.f34726a.c(str);
    }

    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z10) {
        return this.f34726a.f(str, str2, z10);
    }

    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        this.f34726a.l(str, str2, bundle);
    }

    @Keep
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) {
        C3445p.k(conditionalUserProperty);
        a aVar = this.f34726a;
        Bundle bundle = new Bundle();
        String str = conditionalUserProperty.mAppId;
        if (str != null) {
            bundle.putString("app_id", str);
        }
        String str2 = conditionalUserProperty.mOrigin;
        if (str2 != null) {
            bundle.putString("origin", str2);
        }
        String str3 = conditionalUserProperty.mName;
        if (str3 != null) {
            bundle.putString("name", str3);
        }
        Object obj = conditionalUserProperty.mValue;
        if (obj != null) {
            D.b(bundle, obj);
        }
        String str4 = conditionalUserProperty.mTriggerEventName;
        if (str4 != null) {
            bundle.putString("trigger_event_name", str4);
        }
        bundle.putLong("trigger_timeout", conditionalUserProperty.mTriggerTimeout);
        String str5 = conditionalUserProperty.mTimedOutEventName;
        if (str5 != null) {
            bundle.putString("timed_out_event_name", str5);
        }
        Bundle bundle2 = conditionalUserProperty.mTimedOutEventParams;
        if (bundle2 != null) {
            bundle.putBundle("timed_out_event_params", bundle2);
        }
        String str6 = conditionalUserProperty.mTriggeredEventName;
        if (str6 != null) {
            bundle.putString("triggered_event_name", str6);
        }
        Bundle bundle3 = conditionalUserProperty.mTriggeredEventParams;
        if (bundle3 != null) {
            bundle.putBundle("triggered_event_params", bundle3);
        }
        bundle.putLong("time_to_live", conditionalUserProperty.mTimeToLive);
        String str7 = conditionalUserProperty.mExpiredEventName;
        if (str7 != null) {
            bundle.putString("expired_event_name", str7);
        }
        Bundle bundle4 = conditionalUserProperty.mExpiredEventParams;
        if (bundle4 != null) {
            bundle.putBundle("expired_event_params", bundle4);
        }
        bundle.putLong("creation_timestamp", conditionalUserProperty.mCreationTimestamp);
        bundle.putBoolean("active", conditionalUserProperty.mActive);
        bundle.putLong("triggered_timestamp", conditionalUserProperty.mTriggeredTimestamp);
        aVar.h(bundle);
    }

    private AppMeasurement(W w10) {
        this.f34726a = new com.google.android.gms.measurement.a(w10);
    }
}
