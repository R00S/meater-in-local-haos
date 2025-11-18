package io.sentry.android.core;

import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import io.sentry.C9573q4;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9670w1;
import io.sentry.protocol.C9556o;
import io.sentry.util.C9646q;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import okhttp3.HttpUrl;

/* compiled from: ManifestMetadataReader.java */
/* renamed from: io.sentry.android.core.d1 */
/* loaded from: classes2.dex */
final class C9273d1 {
    /* renamed from: a */
    static void m30164a(Context context, SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0) {
        C9646q.m31802c(context, "The application context is required.");
        C9646q.m31802c(sentryAndroidOptions, "The options object is required.");
        try {
            Bundle bundleM30165b = m30165b(context, sentryAndroidOptions.getLogger(), c9344s0);
            InterfaceC9670w1 logger = sentryAndroidOptions.getLogger();
            if (bundleM30165b != null) {
                sentryAndroidOptions.setDebug(m30167d(bundleM30165b, logger, "io.sentry.debug", sentryAndroidOptions.isDebug()));
                if (sentryAndroidOptions.isDebug()) {
                    String strName = sentryAndroidOptions.getDiagnosticLevel().name();
                    Locale locale = Locale.ROOT;
                    String strM30172i = m30172i(bundleM30165b, logger, "io.sentry.debug.level", strName.toLowerCase(locale));
                    if (strM30172i != null) {
                        sentryAndroidOptions.setDiagnosticLevel(EnumC9587s4.valueOf(strM30172i.toUpperCase(locale)));
                    }
                }
                sentryAndroidOptions.setAnrEnabled(m30167d(bundleM30165b, logger, "io.sentry.anr.enable", sentryAndroidOptions.isAnrEnabled()));
                sentryAndroidOptions.setEnableAutoSessionTracking(m30167d(bundleM30165b, logger, "io.sentry.auto-session-tracking.enable", m30167d(bundleM30165b, logger, "io.sentry.session-tracking.enable", sentryAndroidOptions.isEnableAutoSessionTracking())));
                if (sentryAndroidOptions.getSampleRate() == null) {
                    Double dM30169f = m30169f(bundleM30165b, logger, "io.sentry.sample-rate");
                    if (dM30169f.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setSampleRate(dM30169f);
                    }
                }
                sentryAndroidOptions.setAnrReportInDebug(m30167d(bundleM30165b, logger, "io.sentry.anr.report-debug", sentryAndroidOptions.isAnrReportInDebug()));
                sentryAndroidOptions.setAnrTimeoutIntervalMillis(m30171h(bundleM30165b, logger, "io.sentry.anr.timeout-interval-millis", sentryAndroidOptions.getAnrTimeoutIntervalMillis()));
                String strM30172i2 = m30172i(bundleM30165b, logger, "io.sentry.dsn", sentryAndroidOptions.getDsn());
                boolean zM30167d = m30167d(bundleM30165b, logger, "io.sentry.enabled", sentryAndroidOptions.isEnabled());
                if (!zM30167d || (strM30172i2 != null && strM30172i2.isEmpty())) {
                    sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.DEBUG, "Sentry enabled flag set to false or DSN is empty: disabling sentry-android", new Object[0]);
                } else if (strM30172i2 == null) {
                    sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.FATAL, "DSN is required. Use empty string to disable SDK.", new Object[0]);
                }
                sentryAndroidOptions.setEnabled(zM30167d);
                sentryAndroidOptions.setDsn(strM30172i2);
                sentryAndroidOptions.setEnableNdk(m30167d(bundleM30165b, logger, "io.sentry.ndk.enable", sentryAndroidOptions.isEnableNdk()));
                sentryAndroidOptions.setEnableScopeSync(m30167d(bundleM30165b, logger, "io.sentry.ndk.scope-sync.enable", sentryAndroidOptions.isEnableScopeSync()));
                sentryAndroidOptions.setRelease(m30172i(bundleM30165b, logger, "io.sentry.release", sentryAndroidOptions.getRelease()));
                sentryAndroidOptions.setEnvironment(m30172i(bundleM30165b, logger, "io.sentry.environment", sentryAndroidOptions.getEnvironment()));
                sentryAndroidOptions.setSessionTrackingIntervalMillis(m30171h(bundleM30165b, logger, "io.sentry.session-tracking.timeout-interval-millis", sentryAndroidOptions.getSessionTrackingIntervalMillis()));
                sentryAndroidOptions.setEnableActivityLifecycleBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.activity-lifecycle", sentryAndroidOptions.isEnableActivityLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableAppLifecycleBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.app-lifecycle", sentryAndroidOptions.isEnableAppLifecycleBreadcrumbs()));
                sentryAndroidOptions.setEnableSystemEventBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.system-events", sentryAndroidOptions.isEnableSystemEventBreadcrumbs()));
                sentryAndroidOptions.setEnableAppComponentBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.app-components", sentryAndroidOptions.isEnableAppComponentBreadcrumbs()));
                sentryAndroidOptions.setEnableUserInteractionBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.user-interaction", sentryAndroidOptions.isEnableUserInteractionBreadcrumbs()));
                sentryAndroidOptions.setEnableNetworkEventBreadcrumbs(m30167d(bundleM30165b, logger, "io.sentry.breadcrumbs.network-events", sentryAndroidOptions.isEnableNetworkEventBreadcrumbs()));
                sentryAndroidOptions.setEnableUncaughtExceptionHandler(m30167d(bundleM30165b, logger, "io.sentry.uncaught-exception-handler.enable", sentryAndroidOptions.isEnableUncaughtExceptionHandler()));
                sentryAndroidOptions.setAttachThreads(m30167d(bundleM30165b, logger, "io.sentry.attach-threads", sentryAndroidOptions.isAttachThreads()));
                sentryAndroidOptions.setAttachScreenshot(m30167d(bundleM30165b, logger, "io.sentry.attach-screenshot", sentryAndroidOptions.isAttachScreenshot()));
                sentryAndroidOptions.setAttachViewHierarchy(m30167d(bundleM30165b, logger, "io.sentry.attach-view-hierarchy", sentryAndroidOptions.isAttachViewHierarchy()));
                sentryAndroidOptions.setSendClientReports(m30167d(bundleM30165b, logger, "io.sentry.send-client-reports", sentryAndroidOptions.isSendClientReports()));
                sentryAndroidOptions.setCollectAdditionalContext(m30167d(bundleM30165b, logger, "io.sentry.additional-context", sentryAndroidOptions.isCollectAdditionalContext()));
                if (sentryAndroidOptions.getEnableTracing() == null) {
                    sentryAndroidOptions.setEnableTracing(m30168e(bundleM30165b, logger, "io.sentry.traces.enable", null));
                }
                if (sentryAndroidOptions.getTracesSampleRate() == null) {
                    Double dM30169f2 = m30169f(bundleM30165b, logger, "io.sentry.traces.sample-rate");
                    if (dM30169f2.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setTracesSampleRate(dM30169f2);
                    }
                }
                sentryAndroidOptions.setTraceSampling(m30167d(bundleM30165b, logger, "io.sentry.traces.trace-sampling", sentryAndroidOptions.isTraceSampling()));
                sentryAndroidOptions.setEnableAutoActivityLifecycleTracing(m30167d(bundleM30165b, logger, "io.sentry.traces.activity.enable", sentryAndroidOptions.isEnableAutoActivityLifecycleTracing()));
                sentryAndroidOptions.setEnableActivityLifecycleTracingAutoFinish(m30167d(bundleM30165b, logger, "io.sentry.traces.activity.auto-finish.enable", sentryAndroidOptions.isEnableActivityLifecycleTracingAutoFinish()));
                sentryAndroidOptions.setProfilingEnabled(m30167d(bundleM30165b, logger, "io.sentry.traces.profiling.enable", sentryAndroidOptions.isProfilingEnabled()));
                if (sentryAndroidOptions.getProfilesSampleRate() == null) {
                    Double dM30169f3 = m30169f(bundleM30165b, logger, "io.sentry.traces.profiling.sample-rate");
                    if (dM30169f3.doubleValue() != -1.0d) {
                        sentryAndroidOptions.setProfilesSampleRate(dM30169f3);
                    }
                }
                sentryAndroidOptions.setEnableUserInteractionTracing(m30167d(bundleM30165b, logger, "io.sentry.traces.user-interaction.enable", sentryAndroidOptions.isEnableUserInteractionTracing()));
                sentryAndroidOptions.setEnableTimeToFullDisplayTracing(m30167d(bundleM30165b, logger, "io.sentry.traces.time-to-full-display.enable", sentryAndroidOptions.isEnableTimeToFullDisplayTracing()));
                long jM30171h = m30171h(bundleM30165b, logger, "io.sentry.traces.idle-timeout", -1L);
                if (jM30171h != -1) {
                    sentryAndroidOptions.setIdleTimeout(Long.valueOf(jM30171h));
                }
                List<String> listM30170g = m30170g(bundleM30165b, logger, "io.sentry.traces.trace-propagation-targets");
                if (!bundleM30165b.containsKey("io.sentry.traces.trace-propagation-targets") && (listM30170g == null || listM30170g.isEmpty())) {
                    listM30170g = m30170g(bundleM30165b, logger, "io.sentry.traces.tracing-origins");
                }
                if ((bundleM30165b.containsKey("io.sentry.traces.trace-propagation-targets") || bundleM30165b.containsKey("io.sentry.traces.tracing-origins")) && listM30170g == null) {
                    sentryAndroidOptions.setTracePropagationTargets(Collections.emptyList());
                } else if (listM30170g != null) {
                    sentryAndroidOptions.setTracePropagationTargets(listM30170g);
                }
                sentryAndroidOptions.setEnableFramesTracking(m30167d(bundleM30165b, logger, "io.sentry.traces.frames-tracking", true));
                sentryAndroidOptions.setProguardUuid(m30172i(bundleM30165b, logger, "io.sentry.proguard-uuid", sentryAndroidOptions.getProguardUuid()));
                C9556o sdkVersion = sentryAndroidOptions.getSdkVersion();
                if (sdkVersion == null) {
                    sdkVersion = new C9556o(HttpUrl.FRAGMENT_ENCODE_SET, HttpUrl.FRAGMENT_ENCODE_SET);
                }
                sdkVersion.m31431h(m30173j(bundleM30165b, logger, "io.sentry.sdk.name", sdkVersion.m31428e()));
                sdkVersion.m31433j(m30173j(bundleM30165b, logger, "io.sentry.sdk.version", sdkVersion.m31430g()));
                sentryAndroidOptions.setSdkVersion(sdkVersion);
                sentryAndroidOptions.setSendDefaultPii(m30167d(bundleM30165b, logger, "io.sentry.send-default-pii", sentryAndroidOptions.isSendDefaultPii()));
                List<String> listM30170g2 = m30170g(bundleM30165b, logger, "io.sentry.gradle-plugin-integrations");
                if (listM30170g2 != null) {
                    Iterator<String> it = listM30170g2.iterator();
                    while (it.hasNext()) {
                        C9573q4.m31555c().m31556a(it.next());
                    }
                }
                sentryAndroidOptions.setEnableRootCheck(m30167d(bundleM30165b, logger, "io.sentry.enable-root-check", sentryAndroidOptions.isEnableRootCheck()));
                sentryAndroidOptions.setSendModules(m30167d(bundleM30165b, logger, "io.sentry.send-modules", sentryAndroidOptions.isSendModules()));
            }
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.INFO, "Retrieving configuration from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            sentryAndroidOptions.getLogger().mo30213b(EnumC9587s4.ERROR, "Failed to read configuration from android manifest metadata.", th);
        }
    }

    /* renamed from: b */
    private static Bundle m30165b(Context context, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0) throws PackageManager.NameNotFoundException {
        if (c9344s0 == null) {
            c9344s0 = new C9344s0(interfaceC9670w1);
        }
        return C9346t0.m30409a(context, 128L, c9344s0).metaData;
    }

    /* renamed from: c */
    static boolean m30166c(Context context, InterfaceC9670w1 interfaceC9670w1) {
        C9646q.m31802c(context, "The application context is required.");
        try {
            Bundle bundleM30165b = m30165b(context, interfaceC9670w1, null);
            zM30167d = bundleM30165b != null ? m30167d(bundleM30165b, interfaceC9670w1, "io.sentry.auto-init", true) : true;
            interfaceC9670w1.mo30214c(EnumC9587s4.INFO, "Retrieving auto-init from AndroidManifest.xml", new Object[0]);
        } catch (Throwable th) {
            interfaceC9670w1.mo30213b(EnumC9587s4.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        return zM30167d;
    }

    /* renamed from: d */
    private static boolean m30167d(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str, boolean z) {
        boolean z2 = bundle.getBoolean(str, z);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z2));
        return z2;
    }

    /* renamed from: e */
    private static Boolean m30168e(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str, Boolean bool) {
        if (bundle.getSerializable(str) == null) {
            interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s used default %s", str, bool);
            return bool;
        }
        boolean z = bundle.getBoolean(str, bool != null);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, Boolean.valueOf(z));
        return Boolean.valueOf(z);
    }

    /* renamed from: f */
    private static Double m30169f(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str) {
        Double dValueOf = Double.valueOf(Float.valueOf(bundle.getFloat(str, -1.0f)).doubleValue());
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, dValueOf);
        return dValueOf;
    }

    /* renamed from: g */
    private static List<String> m30170g(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str) {
        String string = bundle.getString(str);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, string);
        if (string != null) {
            return Arrays.asList(string.split(",", -1));
        }
        return null;
    }

    /* renamed from: h */
    private static long m30171h(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str, long j2) {
        long j3 = bundle.getInt(str, (int) j2);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, Long.valueOf(j3));
        return j3;
    }

    /* renamed from: i */
    private static String m30172i(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, string);
        return string;
    }

    /* renamed from: j */
    private static String m30173j(Bundle bundle, InterfaceC9670w1 interfaceC9670w1, String str, String str2) {
        String string = bundle.getString(str, str2);
        interfaceC9670w1.mo30214c(EnumC9587s4.DEBUG, "%s read: %s", str, string);
        return string;
    }
}
