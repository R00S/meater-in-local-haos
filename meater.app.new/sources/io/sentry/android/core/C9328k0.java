package io.sentry.android.core;

import android.app.Application;
import android.content.Context;
import android.content.pm.PackageInfo;
import io.sentry.C9365b1;
import io.sentry.C9372c1;
import io.sentry.C9685y3;
import io.sentry.C9691z3;
import io.sentry.EnumC9587s4;
import io.sentry.InterfaceC9660v3;
import io.sentry.InterfaceC9670w1;
import io.sentry.android.core.cache.C9270b;
import io.sentry.android.core.internal.debugmeta.C9288a;
import io.sentry.android.core.internal.gestures.C9293e;
import io.sentry.android.core.internal.modules.C9300a;
import io.sentry.android.core.internal.util.C9311h;
import io.sentry.android.core.internal.util.C9323t;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.cache.C9395s;
import io.sentry.cache.C9396t;
import io.sentry.compose.gestures.ComposeGestureTargetLocator;
import io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter;
import io.sentry.transport.C9616t;
import io.sentry.util.C9644o;
import io.sentry.util.C9646q;
import java.io.File;
import java.util.ArrayList;

/* compiled from: AndroidOptionsInitializer.java */
/* renamed from: io.sentry.android.core.k0 */
/* loaded from: classes2.dex */
final class C9328k0 {
    /* renamed from: a */
    private static String m30325a(PackageInfo packageInfo, String str) {
        return packageInfo.packageName + "@" + packageInfo.versionName + "+" + str;
    }

    /* renamed from: b */
    private static void m30326b(Context context, SentryAndroidOptions sentryAndroidOptions) {
        sentryAndroidOptions.setCacheDirPath(new File(context.getCacheDir(), "sentry").getAbsolutePath());
    }

    /* renamed from: c */
    static void m30327c(SentryAndroidOptions sentryAndroidOptions, Context context, C9344s0 c9344s0, C9265b1 c9265b1, C9278f0 c9278f0) {
        if (sentryAndroidOptions.getCacheDirPath() != null && (sentryAndroidOptions.getEnvelopeDiskCache() instanceof C9616t)) {
            sentryAndroidOptions.setEnvelopeDiskCache(new C9270b(sentryAndroidOptions));
        }
        sentryAndroidOptions.addEventProcessor(new C9365b1(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9350v0(context, c9344s0, sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9279f1(sentryAndroidOptions, c9278f0));
        sentryAndroidOptions.addEventProcessor(new ScreenshotEventProcessor(sentryAndroidOptions, c9344s0));
        sentryAndroidOptions.addEventProcessor(new ViewHierarchyEventProcessor(sentryAndroidOptions));
        sentryAndroidOptions.addEventProcessor(new C9338p0(context, sentryAndroidOptions, c9344s0));
        sentryAndroidOptions.setTransportGate(new C9334n0(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setTransactionProfiler(new C9332m0(context, sentryAndroidOptions, c9344s0, new C9323t(context, sentryAndroidOptions, c9344s0)));
        sentryAndroidOptions.setModulesLoader(new C9300a(context, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.setDebugMetaLoader(new C9288a(context, sentryAndroidOptions.getLogger()));
        boolean zM30152b = c9265b1.m30152b("androidx.core.view.ScrollingView", sentryAndroidOptions);
        boolean zM30152b2 = c9265b1.m30152b("androidx.compose.ui.node.Owner", sentryAndroidOptions);
        if (sentryAndroidOptions.getGestureTargetLocators().isEmpty()) {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new C9293e(zM30152b));
            if (zM30152b2 && c9265b1.m30152b("io.sentry.compose.gestures.ComposeGestureTargetLocator", sentryAndroidOptions)) {
                arrayList.add(new ComposeGestureTargetLocator(sentryAndroidOptions.getLogger()));
            }
            sentryAndroidOptions.setGestureTargetLocators(arrayList);
        }
        if (sentryAndroidOptions.getViewHierarchyExporters().isEmpty() && zM30152b2 && c9265b1.m30152b("io.sentry.compose.viewhierarchy.ComposeViewHierarchyExporter", sentryAndroidOptions)) {
            ArrayList arrayList2 = new ArrayList(1);
            arrayList2.add(new ComposeViewHierarchyExporter(sentryAndroidOptions.getLogger()));
            sentryAndroidOptions.setViewHierarchyExporters(arrayList2);
        }
        sentryAndroidOptions.setMainThreadChecker(C9311h.m30273e());
        if (sentryAndroidOptions.getCollectors().isEmpty()) {
            sentryAndroidOptions.addCollector(new C9326j0());
            sentryAndroidOptions.addCollector(new C9281g0(sentryAndroidOptions.getLogger(), c9344s0));
        }
        sentryAndroidOptions.setTransactionPerformanceCollector(new C9372c1(sentryAndroidOptions));
        if (sentryAndroidOptions.getCacheDirPath() != null) {
            sentryAndroidOptions.addScopeObserver(new C9396t(sentryAndroidOptions));
            sentryAndroidOptions.addOptionsObserver(new C9395s(sentryAndroidOptions));
        }
    }

    /* renamed from: d */
    static void m30328d(Context context, final SentryAndroidOptions sentryAndroidOptions, C9344s0 c9344s0, C9265b1 c9265b1, C9278f0 c9278f0, boolean z, boolean z2) {
        C9644o c9644o = new C9644o(new C9644o.a() { // from class: io.sentry.android.core.s
            @Override // io.sentry.util.C9644o.a
            /* renamed from: a */
            public final Object mo30402a() {
                return Boolean.valueOf(C9270b.m30157P(sentryAndroidOptions));
            }
        });
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C9685y3(new InterfaceC9660v3() { // from class: io.sentry.android.core.q
            @Override // io.sentry.InterfaceC9660v3
            /* renamed from: a */
            public final String mo30388a() {
                return sentryAndroidOptions.getCacheDirPath();
            }
        }), c9644o));
        sentryAndroidOptions.addIntegration(new NdkIntegration(m30329e(c9344s0) ? c9265b1.m30153c("io.sentry.android.ndk.SentryNdk", sentryAndroidOptions.getLogger()) : null));
        sentryAndroidOptions.addIntegration(EnvelopeFileObserverIntegration.m30120b());
        sentryAndroidOptions.addIntegration(new SendCachedEnvelopeIntegration(new C9691z3(new InterfaceC9660v3() { // from class: io.sentry.android.core.r
            @Override // io.sentry.InterfaceC9660v3
            /* renamed from: a */
            public final String mo30388a() {
                return sentryAndroidOptions.getOutboxPath();
            }
        }), c9644o));
        sentryAndroidOptions.addIntegration(new AppLifecycleIntegration());
        sentryAndroidOptions.addIntegration(C9336o0.m30353a(context, c9344s0));
        if (context instanceof Application) {
            Application application = (Application) context;
            sentryAndroidOptions.addIntegration(new ActivityLifecycleIntegration(application, c9344s0, c9278f0));
            sentryAndroidOptions.addIntegration(new CurrentActivityIntegration(application));
            sentryAndroidOptions.addIntegration(new UserInteractionIntegration(application, c9265b1));
            if (z) {
                sentryAndroidOptions.addIntegration(new FragmentLifecycleIntegration(application, true, true));
            }
        } else {
            sentryAndroidOptions.getLogger().mo30214c(EnumC9587s4.WARNING, "ActivityLifecycle, FragmentLifecycle and UserInteraction Integrations need an Application class to be installed.", new Object[0]);
        }
        if (z2) {
            sentryAndroidOptions.addIntegration(new SentryTimberIntegration());
        }
        sentryAndroidOptions.addIntegration(new AppComponentsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new SystemEventsBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new NetworkBreadcrumbsIntegration(context, c9344s0, sentryAndroidOptions.getLogger()));
        sentryAndroidOptions.addIntegration(new TempSensorBreadcrumbsIntegration(context));
        sentryAndroidOptions.addIntegration(new PhoneStateBreadcrumbsIntegration(context));
    }

    /* renamed from: e */
    private static boolean m30329e(C9344s0 c9344s0) {
        return c9344s0.m30406d() >= 16;
    }

    /* renamed from: i */
    static void m30333i(SentryAndroidOptions sentryAndroidOptions, Context context, InterfaceC9670w1 interfaceC9670w1, C9344s0 c9344s0) {
        C9646q.m31802c(context, "The context is required.");
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        C9646q.m31802c(sentryAndroidOptions, "The options object is required.");
        C9646q.m31802c(interfaceC9670w1, "The ILogger object is required.");
        sentryAndroidOptions.setLogger(interfaceC9670w1);
        sentryAndroidOptions.setDateProvider(new C9285h1());
        C9273d1.m30164a(context, sentryAndroidOptions, c9344s0);
        m30326b(context, sentryAndroidOptions);
        m30334j(sentryAndroidOptions, context, c9344s0);
    }

    /* renamed from: j */
    private static void m30334j(SentryAndroidOptions sentryAndroidOptions, Context context, C9344s0 c9344s0) {
        PackageInfo packageInfoM30418j = C9346t0.m30418j(context, sentryAndroidOptions.getLogger(), c9344s0);
        if (packageInfoM30418j != null) {
            if (sentryAndroidOptions.getRelease() == null) {
                sentryAndroidOptions.setRelease(m30325a(packageInfoM30418j, C9346t0.m30419k(packageInfoM30418j, c9344s0)));
            }
            String str = packageInfoM30418j.packageName;
            if (str != null && !str.startsWith("android.")) {
                sentryAndroidOptions.addInAppInclude(str);
            }
        }
        if (sentryAndroidOptions.getDistinctId() == null) {
            try {
                sentryAndroidOptions.setDistinctId(C9262a1.m30148a(context));
            } catch (RuntimeException e2) {
                sentryAndroidOptions.getLogger().mo30213b(EnumC9587s4.ERROR, "Could not generate distinct Id.", e2);
            }
        }
    }
}
