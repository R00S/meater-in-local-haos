package com.google.android.gms.measurement;

import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import cm.aptoide.p092pt.reviews.RateAndReviewsFragment;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.ShowFirstParty;
import com.google.android.gms.common.util.VisibleForTesting;
import com.google.android.gms.measurement.internal.zzfx;
import com.google.android.gms.measurement.internal.zzgt;
import com.google.android.gms.measurement.internal.zzgv;
import com.google.android.gms.measurement.internal.zzgw;
import com.google.android.gms.measurement.internal.zzgx;
import com.google.android.gms.measurement.internal.zzgy;
import com.google.android.gms.measurement.internal.zzha;
import com.google.android.gms.measurement.internal.zzhx;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
@ShowFirstParty
@KeepForSdk
@Deprecated
/* loaded from: classes2.dex */
public class AppMeasurement {

    /* renamed from: a */
    private static volatile AppMeasurement f28522a;

    /* renamed from: b */
    private final zzfx f28523b;

    /* renamed from: c */
    private final zzhx f28524c;

    /* renamed from: d */
    private final boolean f28525d;

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static class ConditionalUserProperty {

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public boolean mActive;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mAppId;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mCreationTimestamp;

        @Keep
        public String mExpiredEventName;

        @Keep
        public Bundle mExpiredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mOrigin;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTimeToLive;

        @Keep
        public String mTimedOutEventName;

        @Keep
        public Bundle mTimedOutEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public String mTriggerEventName;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggerTimeout;

        @Keep
        public String mTriggeredEventName;

        @Keep
        public Bundle mTriggeredEventParams;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public long mTriggeredTimestamp;

        @ShowFirstParty
        @Keep
        @KeepForSdk
        public Object mValue;

        @KeepForSdk
        public ConditionalUserProperty() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* renamed from: a */
        public final Bundle m22665a() {
            Bundle bundle = new Bundle();
            String str = this.mAppId;
            if (str != null) {
                bundle.putString(RateAndReviewsFragment.BundleCons.APP_ID, str);
            }
            String str2 = this.mOrigin;
            if (str2 != null) {
                bundle.putString("origin", str2);
            }
            String str3 = this.mName;
            if (str3 != null) {
                bundle.putString("name", str3);
            }
            Object obj = this.mValue;
            if (obj != null) {
                zzgt.m23250b(bundle, obj);
            }
            String str4 = this.mTriggerEventName;
            if (str4 != null) {
                bundle.putString("trigger_event_name", str4);
            }
            bundle.putLong("trigger_timeout", this.mTriggerTimeout);
            String str5 = this.mTimedOutEventName;
            if (str5 != null) {
                bundle.putString("timed_out_event_name", str5);
            }
            Bundle bundle2 = this.mTimedOutEventParams;
            if (bundle2 != null) {
                bundle.putBundle("timed_out_event_params", bundle2);
            }
            String str6 = this.mTriggeredEventName;
            if (str6 != null) {
                bundle.putString("triggered_event_name", str6);
            }
            Bundle bundle3 = this.mTriggeredEventParams;
            if (bundle3 != null) {
                bundle.putBundle("triggered_event_params", bundle3);
            }
            bundle.putLong("time_to_live", this.mTimeToLive);
            String str7 = this.mExpiredEventName;
            if (str7 != null) {
                bundle.putString("expired_event_name", str7);
            }
            Bundle bundle4 = this.mExpiredEventParams;
            if (bundle4 != null) {
                bundle.putBundle("expired_event_params", bundle4);
            }
            bundle.putLong("creation_timestamp", this.mCreationTimestamp);
            bundle.putBoolean("active", this.mActive);
            bundle.putLong("triggered_timestamp", this.mTriggeredTimestamp);
            return bundle;
        }

        private ConditionalUserProperty(Bundle bundle) {
            Preconditions.m14372k(bundle);
            this.mAppId = (String) zzgt.m23249a(bundle, RateAndReviewsFragment.BundleCons.APP_ID, String.class, null);
            this.mOrigin = (String) zzgt.m23249a(bundle, "origin", String.class, null);
            this.mName = (String) zzgt.m23249a(bundle, "name", String.class, null);
            this.mValue = zzgt.m23249a(bundle, "value", Object.class, null);
            this.mTriggerEventName = (String) zzgt.m23249a(bundle, "trigger_event_name", String.class, null);
            this.mTriggerTimeout = ((Long) zzgt.m23249a(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            this.mTimedOutEventName = (String) zzgt.m23249a(bundle, "timed_out_event_name", String.class, null);
            this.mTimedOutEventParams = (Bundle) zzgt.m23249a(bundle, "timed_out_event_params", Bundle.class, null);
            this.mTriggeredEventName = (String) zzgt.m23249a(bundle, "triggered_event_name", String.class, null);
            this.mTriggeredEventParams = (Bundle) zzgt.m23249a(bundle, "triggered_event_params", Bundle.class, null);
            this.mTimeToLive = ((Long) zzgt.m23249a(bundle, "time_to_live", Long.class, 0L)).longValue();
            this.mExpiredEventName = (String) zzgt.m23249a(bundle, "expired_event_name", String.class, null);
            this.mExpiredEventParams = (Bundle) zzgt.m23249a(bundle, "expired_event_params", Bundle.class, null);
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static final class Event extends zzgw {
        private Event() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface EventInterceptor extends zzgx {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public interface OnEventListener extends zzha {
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static final class Param extends zzgv {
        private Param() {
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-impl@@17.2.0 */
    @ShowFirstParty
    @KeepForSdk
    public static final class UserProperty extends zzgy {
        private UserProperty() {
        }
    }

    private AppMeasurement(zzfx zzfxVar) {
        Preconditions.m14372k(zzfxVar);
        this.f28523b = zzfxVar;
        this.f28524c = null;
        this.f28525d = false;
    }

    /* renamed from: c */
    public static AppMeasurement m22659c(Context context, Bundle bundle) {
        if (f28522a == null) {
            synchronized (AppMeasurement.class) {
                if (f28522a == null) {
                    zzhx zzhxVarM22661f = m22661f(context, bundle);
                    if (zzhxVarM22661f != null) {
                        f28522a = new AppMeasurement(zzhxVarM22661f);
                    } else {
                        f28522a = new AppMeasurement(zzfx.m23204b(context, null, null, bundle));
                    }
                }
            }
        }
        return f28522a;
    }

    @VisibleForTesting
    /* renamed from: d */
    private static AppMeasurement m22660d(Context context, String str, String str2) {
        if (f28522a == null) {
            synchronized (AppMeasurement.class) {
                if (f28522a == null) {
                    zzhx zzhxVarM22661f = m22661f(context, null);
                    if (zzhxVarM22661f != null) {
                        f28522a = new AppMeasurement(zzhxVarM22661f);
                    } else {
                        f28522a = new AppMeasurement(zzfx.m23204b(context, null, null, null));
                    }
                }
            }
        }
        return f28522a;
    }

    /* renamed from: f */
    private static zzhx m22661f(Context context, Bundle bundle) {
        try {
            return (zzhx) Class.forName("com.google.firebase.analytics.FirebaseAnalytics").getDeclaredMethod("getScionFrontendApiImplementation", Context.class, Bundle.class).invoke(null, context, bundle);
        } catch (ClassNotFoundException | Exception unused) {
            return null;
        }
    }

    @Keep
    @Deprecated
    @ShowFirstParty
    @KeepForSdk
    public static AppMeasurement getInstance(Context context) {
        return m22660d(context, null, null);
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: a */
    public void m22662a(OnEventListener onEventListener) {
        if (this.f28525d) {
            this.f28524c.mo23320n(onEventListener);
        } else {
            this.f28523b.m23216H().m23277K(onEventListener);
        }
    }

    @ShowFirstParty
    @KeepForSdk
    /* renamed from: b */
    public void m22663b(String str, String str2, Object obj) throws IllegalStateException {
        Preconditions.m14368g(str);
        if (this.f28525d) {
            this.f28524c.mo23321o(str, str2, obj);
        } else {
            this.f28523b.m23216H().m23285W(str, str2, obj, true);
        }
    }

    @Keep
    public void beginAdUnitExposure(String str) {
        if (this.f28525d) {
            this.f28524c.mo23322u(str);
        } else {
            this.f28523b.m23229U().m23078z(str, this.f28523b.mo22837j().mo14609b());
        }
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void clearConditionalUserProperty(String str, String str2, Bundle bundle) throws IllegalStateException {
        if (this.f28525d) {
            this.f28524c.mo23318l(str, str2, bundle);
        } else {
            this.f28523b.m23216H().m23305y0(str, str2, bundle);
        }
    }

    @VisibleForTesting
    @Keep
    protected void clearConditionalUserPropertyAs(String str, String str2, String str3, Bundle bundle) throws IllegalStateException {
        if (this.f28525d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f28523b.m23216H().m23287Y(str, str2, str3, bundle);
    }

    /* renamed from: e */
    public final void m22664e(boolean z) throws IllegalStateException {
        if (this.f28525d) {
            this.f28524c.mo23314g0(z);
        } else {
            this.f28523b.m23216H().m23304w0(z);
        }
    }

    @Keep
    public void endAdUnitExposure(String str) {
        if (this.f28525d) {
            this.f28524c.mo23308Y(str);
        } else {
            this.f28523b.m23229U().m23076D(str, this.f28523b.mo22837j().mo14609b());
        }
    }

    @Keep
    public long generateEventId() {
        return this.f28525d ? this.f28524c.mo23313e() : this.f28523b.m23217I().m23552w0();
    }

    @Keep
    public String getAppInstanceId() {
        return this.f28525d ? this.f28524c.mo23311c() : this.f28523b.m23216H().m23295g0();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public List<ConditionalUserProperty> getConditionalUserProperties(String str, String str2) {
        List<Bundle> listMo23315i = this.f28525d ? this.f28524c.mo23315i(str, str2) : this.f28523b.m23216H().m23269B(str, str2);
        ArrayList arrayList = new ArrayList(listMo23315i == null ? 0 : listMo23315i.size());
        Iterator<Bundle> it = listMo23315i.iterator();
        while (it.hasNext()) {
            arrayList.add(new ConditionalUserProperty(it.next()));
        }
        return arrayList;
    }

    @VisibleForTesting
    @Keep
    protected List<ConditionalUserProperty> getConditionalUserPropertiesAs(String str, String str2, String str3) {
        if (this.f28525d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        ArrayList<Bundle> arrayListM23270C = this.f28523b.m23216H().m23270C(str, str2, str3);
        int i2 = 0;
        ArrayList arrayList = new ArrayList(arrayListM23270C == null ? 0 : arrayListM23270C.size());
        int size = arrayListM23270C.size();
        while (i2 < size) {
            Bundle bundle = arrayListM23270C.get(i2);
            i2++;
            arrayList.add(new ConditionalUserProperty(bundle));
        }
        return arrayList;
    }

    @Keep
    public String getCurrentScreenClass() {
        return this.f28525d ? this.f28524c.mo23310b() : this.f28523b.m23216H().m23298j0();
    }

    @Keep
    public String getCurrentScreenName() {
        return this.f28525d ? this.f28524c.mo23309a() : this.f28523b.m23216H().m23297i0();
    }

    @Keep
    public String getGmpAppId() {
        return this.f28525d ? this.f28524c.mo23312d() : this.f28523b.m23216H().m23299k0();
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public int getMaxUserProperties(String str) {
        if (this.f28525d) {
            return this.f28524c.mo23316j(str);
        }
        this.f28523b.m23216H();
        Preconditions.m14368g(str);
        return 25;
    }

    @VisibleForTesting
    @Keep
    protected Map<String, Object> getUserProperties(String str, String str2, boolean z) {
        return this.f28525d ? this.f28524c.mo23317k(str, str2, z) : this.f28523b.m23216H().m23272E(str, str2, z);
    }

    @VisibleForTesting
    @Keep
    protected Map<String, Object> getUserPropertiesAs(String str, String str2, String str3, boolean z) {
        if (this.f28525d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        return this.f28523b.m23216H().m23271D(str, str2, str3, z);
    }

    @ShowFirstParty
    @Keep
    public void logEventInternal(String str, String str2, Bundle bundle) {
        if (this.f28525d) {
            this.f28524c.mo23319m(str, str2, bundle);
        } else {
            this.f28523b.m23216H().m23281S(str, str2, bundle);
        }
    }

    @ShowFirstParty
    @Keep
    @KeepForSdk
    public void setConditionalUserProperty(ConditionalUserProperty conditionalUserProperty) throws IllegalStateException {
        Preconditions.m14372k(conditionalUserProperty);
        if (this.f28525d) {
            this.f28524c.mo23307J(conditionalUserProperty.m22665a());
        } else {
            this.f28523b.m23216H().m23274H(conditionalUserProperty.m22665a());
        }
    }

    @VisibleForTesting
    @Keep
    protected void setConditionalUserPropertyAs(ConditionalUserProperty conditionalUserProperty) throws IllegalStateException {
        Preconditions.m14372k(conditionalUserProperty);
        if (this.f28525d) {
            throw new IllegalStateException("Unexpected call on client side");
        }
        this.f28523b.m23216H().m23301p0(conditionalUserProperty.m22665a());
    }

    private AppMeasurement(zzhx zzhxVar) {
        Preconditions.m14372k(zzhxVar);
        this.f28524c = zzhxVar;
        this.f28523b = null;
        this.f28525d = true;
    }
}
