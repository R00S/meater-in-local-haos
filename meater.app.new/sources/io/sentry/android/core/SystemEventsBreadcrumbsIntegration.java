package io.sentry.android.core;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import io.sentry.C9471i2;
import io.sentry.C9517n1;
import io.sentry.C9657v0;
import io.sentry.C9680x4;
import io.sentry.EnumC9587s4;
import io.sentry.Integration;
import io.sentry.InterfaceC9658v1;
import io.sentry.InterfaceC9670w1;
import io.sentry.util.C9646q;
import io.sentry.util.C9654u;
import java.io.Closeable;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes2.dex */
public final class SystemEventsBreadcrumbsIntegration implements Integration, Closeable {

    /* renamed from: f */
    private final Context f35838f;

    /* renamed from: g */
    C9259a f35839g;

    /* renamed from: h */
    private SentryAndroidOptions f35840h;

    /* renamed from: i */
    private final List<String> f35841i;

    /* renamed from: io.sentry.android.core.SystemEventsBreadcrumbsIntegration$a */
    static final class C9259a extends BroadcastReceiver {

        /* renamed from: a */
        private final InterfaceC9658v1 f35842a;

        /* renamed from: b */
        private final InterfaceC9670w1 f35843b;

        C9259a(InterfaceC9658v1 interfaceC9658v1, InterfaceC9670w1 interfaceC9670w1) {
            this.f35842a = interfaceC9658v1;
            this.f35843b = interfaceC9670w1;
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            C9657v0 c9657v0 = new C9657v0();
            c9657v0.m31844p("system");
            c9657v0.m31840l("device.event");
            String action = intent.getAction();
            String strM31819c = C9654u.m31819c(action);
            if (strM31819c != null) {
                c9657v0.m31841m("action", strM31819c);
            }
            Bundle extras = intent.getExtras();
            HashMap map = new HashMap();
            if (extras != null && !extras.isEmpty()) {
                for (String str : extras.keySet()) {
                    try {
                        Object obj = extras.get(str);
                        if (obj != null) {
                            map.put(str, obj.toString());
                        }
                    } catch (Throwable th) {
                        this.f35843b.mo30212a(EnumC9587s4.ERROR, th, "%s key of the %s action threw an error.", str, action);
                    }
                }
                c9657v0.m31841m("extras", map);
            }
            c9657v0.m31842n(EnumC9587s4.INFO);
            C9517n1 c9517n1 = new C9517n1();
            c9517n1.m31079j("android:intent", intent);
            this.f35842a.mo31153n(c9657v0, c9517n1);
        }
    }

    public SystemEventsBreadcrumbsIntegration(Context context) {
        this(context, m30139b());
    }

    /* renamed from: b */
    private static List<String> m30139b() {
        ArrayList arrayList = new ArrayList();
        arrayList.add("android.appwidget.action.APPWIDGET_DELETED");
        arrayList.add("android.appwidget.action.APPWIDGET_DISABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_ENABLED");
        arrayList.add("android.appwidget.action.APPWIDGET_HOST_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_RESTORED");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE");
        arrayList.add("android.appwidget.action.APPWIDGET_UPDATE_OPTIONS");
        arrayList.add("android.intent.action.ACTION_POWER_CONNECTED");
        arrayList.add("android.intent.action.ACTION_POWER_DISCONNECTED");
        arrayList.add("android.intent.action.ACTION_SHUTDOWN");
        arrayList.add("android.intent.action.AIRPLANE_MODE");
        arrayList.add("android.intent.action.BATTERY_LOW");
        arrayList.add("android.intent.action.BATTERY_OKAY");
        arrayList.add("android.intent.action.BOOT_COMPLETED");
        arrayList.add("android.intent.action.CAMERA_BUTTON");
        arrayList.add("android.intent.action.CONFIGURATION_CHANGED");
        arrayList.add("android.intent.action.CONTENT_CHANGED");
        arrayList.add("android.intent.action.DATE_CHANGED");
        arrayList.add("android.intent.action.DEVICE_STORAGE_LOW");
        arrayList.add("android.intent.action.DEVICE_STORAGE_OK");
        arrayList.add("android.intent.action.DOCK_EVENT");
        arrayList.add("android.intent.action.DREAMING_STARTED");
        arrayList.add("android.intent.action.DREAMING_STOPPED");
        arrayList.add("android.intent.action.INPUT_METHOD_CHANGED");
        arrayList.add("android.intent.action.LOCALE_CHANGED");
        arrayList.add("android.intent.action.REBOOT");
        arrayList.add("android.intent.action.SCREEN_OFF");
        arrayList.add("android.intent.action.SCREEN_ON");
        arrayList.add("android.intent.action.TIMEZONE_CHANGED");
        arrayList.add("android.intent.action.TIME_SET");
        arrayList.add("android.os.action.DEVICE_IDLE_MODE_CHANGED");
        arrayList.add("android.os.action.POWER_SAVE_MODE_CHANGED");
        arrayList.add("android.intent.action.APP_ERROR");
        arrayList.add("android.intent.action.BUG_REPORT");
        arrayList.add("android.intent.action.MEDIA_BAD_REMOVAL");
        arrayList.add("android.intent.action.MEDIA_MOUNTED");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTABLE");
        arrayList.add("android.intent.action.MEDIA_UNMOUNTED");
        return arrayList;
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: a */
    public /* synthetic */ void mo30003a() {
        C9471i2.m30845a(this);
    }

    @Override // io.sentry.Integration
    /* renamed from: c */
    public void mo30001c(InterfaceC9658v1 interfaceC9658v1, C9680x4 c9680x4) {
        C9646q.m31802c(interfaceC9658v1, "Hub is required");
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) C9646q.m31802c(c9680x4 instanceof SentryAndroidOptions ? (SentryAndroidOptions) c9680x4 : null, "SentryAndroidOptions is required");
        this.f35840h = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "SystemEventsBreadcrumbsIntegration enabled: %s", Boolean.valueOf(this.f35840h.isEnableSystemEventBreadcrumbs()));
        if (this.f35840h.isEnableSystemEventBreadcrumbs()) {
            this.f35839g = new C9259a(interfaceC9658v1, this.f35840h.getLogger());
            IntentFilter intentFilter = new IntentFilter();
            Iterator<String> it = this.f35841i.iterator();
            while (it.hasNext()) {
                intentFilter.addAction(it.next());
            }
            try {
                C9346t0.m30422n(this.f35838f, c9680x4, this.f35839g, intentFilter);
                this.f35840h.getLogger().mo30214c(EnumC9587s4.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                mo30003a();
            } catch (Throwable th) {
                this.f35840h.setEnableSystemEventBreadcrumbs(false);
                this.f35840h.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        C9259a c9259a = this.f35839g;
        if (c9259a != null) {
            this.f35838f.unregisterReceiver(c9259a);
            this.f35839g = null;
            SentryAndroidOptions sentryAndroidOptions = this.f35840h;
            if (sentryAndroidOptions != null) {
                sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "SystemEventsBreadcrumbsIntegration remove.", new Object[0]);
            }
        }
    }

    @Override // io.sentry.InterfaceC9490j2
    /* renamed from: d */
    public /* synthetic */ String mo30004d() {
        return C9471i2.m30846b(this);
    }

    public SystemEventsBreadcrumbsIntegration(Context context, List<String> list) {
        this.f35838f = (Context) C9646q.m31802c(context, "Context is required");
        this.f35841i = (List) C9646q.m31802c(list, "Actions list is required");
    }
}
