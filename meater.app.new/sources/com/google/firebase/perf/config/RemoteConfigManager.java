package com.google.firebase.perf.config;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.PackageManager;
import androidx.annotation.Keep;
import j9.InterfaceC3755b;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import v9.C4925a;
import z7.InterfaceC5204f;
import z7.InterfaceC5205g;

@Keep
/* loaded from: classes2.dex */
public class RemoteConfigManager {
    private static final long FETCH_NEVER_HAPPENED_TIMESTAMP_MS = 0;
    private static final String FIREPERF_FRC_NAMESPACE_NAME = "fireperf";
    private static final long MIN_APP_START_CONFIG_FETCH_DELAY_MS = 5000;
    private static final int RANDOM_APP_START_CONFIG_FETCH_DELAY_MS = 25000;
    private final ConcurrentHashMap<String, E9.j> allRcConfigMap;
    private final long appStartConfigFetchDelayInMs;
    private final long appStartTimeInMs;
    private final x cache;
    private final Executor executor;
    private com.google.firebase.remoteconfig.a firebaseRemoteConfig;
    private long firebaseRemoteConfigLastFetchTimestampMs;
    private InterfaceC3755b<com.google.firebase.remoteconfig.c> firebaseRemoteConfigProvider;
    private static final C4925a logger = C4925a.e();
    private static final RemoteConfigManager instance = new RemoteConfigManager();
    private static final long TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS = TimeUnit.HOURS.toMillis(12);

    @SuppressLint({"ThreadPoolCreation"})
    private RemoteConfigManager() {
        this(x.e(), new ThreadPoolExecutor(0, 1, FETCH_NEVER_HAPPENED_TIMESTAMP_MS, TimeUnit.SECONDS, new LinkedBlockingQueue()), null, 5000 + new Random().nextInt(RANDOM_APP_START_CONFIG_FETCH_DELAY_MS), getInitialStartupMillis());
    }

    static long getInitialStartupMillis() {
        com.google.firebase.n nVar;
        try {
            nVar = (com.google.firebase.n) com.google.firebase.f.l().j(com.google.firebase.n.class);
        } catch (IllegalStateException unused) {
            logger.a("Unable to get StartupTime instance.");
            nVar = null;
        }
        return nVar != null ? nVar.c() : System.currentTimeMillis();
    }

    public static RemoteConfigManager getInstance() {
        return instance;
    }

    private E9.j getRemoteConfigValue(String str) {
        triggerRemoteConfigFetchIfNecessary();
        if (!isFirebaseRemoteConfigAvailable() || !this.allRcConfigMap.containsKey(str)) {
            return null;
        }
        E9.j jVar = this.allRcConfigMap.get(str);
        if (jVar.j() != 2) {
            return null;
        }
        logger.b("Fetched value: '%s' for key: '%s' from Firebase Remote Config.", jVar.m(), str);
        return jVar;
    }

    public static int getVersionCode(Context context) {
        try {
            return context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
        } catch (PackageManager.NameNotFoundException unused) {
            return 0;
        }
    }

    private boolean hasAppStartConfigFetchDelayElapsed(long j10) {
        return j10 - this.appStartTimeInMs >= this.appStartConfigFetchDelayInMs;
    }

    private boolean hasLastFetchBecomeStale(long j10) {
        return j10 - this.firebaseRemoteConfigLastFetchTimestampMs > TIME_AFTER_WHICH_A_FETCH_IS_CONSIDERED_STALE_MS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0(Boolean bool) {
        syncConfigValues(this.firebaseRemoteConfig.h());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(Exception exc) {
        logger.k("Call to Remote Config failed: %s. This may cause a degraded experience with Firebase Performance. Please reach out to Firebase Support https://firebase.google.com/support/", exc);
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
    }

    private boolean shouldFetchAndActivateRemoteConfigValues() {
        long currentSystemTimeMillis = getCurrentSystemTimeMillis();
        return hasAppStartConfigFetchDelayElapsed(currentSystemTimeMillis) && hasLastFetchBecomeStale(currentSystemTimeMillis);
    }

    private void triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch() {
        this.firebaseRemoteConfigLastFetchTimestampMs = getCurrentSystemTimeMillis();
        this.firebaseRemoteConfig.g().f(this.executor, new InterfaceC5205g() { // from class: com.google.firebase.perf.config.y
            @Override // z7.InterfaceC5205g
            public final void a(Object obj) {
                this.f38500a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
            }
        }).d(this.executor, new InterfaceC5204f() { // from class: com.google.firebase.perf.config.z
            @Override // z7.InterfaceC5204f
            public final void d(Exception exc) {
                this.f38501a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
            }
        });
    }

    private void triggerRemoteConfigFetchIfNecessary() {
        if (isFirebaseRemoteConfigAvailable()) {
            if (this.allRcConfigMap.isEmpty()) {
                this.allRcConfigMap.putAll(this.firebaseRemoteConfig.h());
            }
            if (shouldFetchAndActivateRemoteConfigValues()) {
                triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch();
            }
        }
    }

    public B9.g<Boolean> getBoolean(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config boolean value is null.");
            return B9.g.a();
        }
        E9.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return B9.g.e(Boolean.valueOf(remoteConfigValue.n()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.m().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.m(), str);
                }
            }
        }
        return B9.g.a();
    }

    protected long getCurrentSystemTimeMillis() {
        return System.currentTimeMillis();
    }

    public B9.g<Double> getDouble(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config double value is null.");
            return B9.g.a();
        }
        E9.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return B9.g.e(Double.valueOf(remoteConfigValue.l()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.m().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.m(), str);
                }
            }
        }
        return B9.g.a();
    }

    public B9.g<Long> getLong(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config long value is null.");
            return B9.g.a();
        }
        E9.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue != null) {
            try {
                return B9.g.e(Long.valueOf(remoteConfigValue.k()));
            } catch (IllegalArgumentException unused) {
                if (!remoteConfigValue.m().isEmpty()) {
                    logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.m(), str);
                }
            }
        }
        return B9.g.a();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T getRemoteConfigValueOrDefault(String str, T t10) {
        Object objValueOf;
        E9.j remoteConfigValue = getRemoteConfigValue(str);
        if (remoteConfigValue == null) {
            return t10;
        }
        try {
            if (t10 instanceof Boolean) {
                objValueOf = Boolean.valueOf(remoteConfigValue.n());
            } else if (t10 instanceof Double) {
                objValueOf = Double.valueOf(remoteConfigValue.l());
            } else if ((t10 instanceof Long) || (t10 instanceof Integer)) {
                objValueOf = Long.valueOf(remoteConfigValue.k());
            } else {
                if (!(t10 instanceof String)) {
                    T t11 = (T) remoteConfigValue.m();
                    try {
                        logger.b("No matching type found for the defaultValue: '%s', using String.", t10);
                        return t11;
                    } catch (IllegalArgumentException unused) {
                        t10 = t11;
                        if (remoteConfigValue.m().isEmpty()) {
                            return t10;
                        }
                        logger.b("Could not parse value: '%s' for key: '%s'.", remoteConfigValue.m(), str);
                        return t10;
                    }
                }
                objValueOf = remoteConfigValue.m();
            }
            return objValueOf;
        } catch (IllegalArgumentException unused2) {
        }
    }

    public B9.g<String> getString(String str) {
        if (str == null) {
            logger.a("The key to get Remote Config String value is null.");
            return B9.g.a();
        }
        E9.j remoteConfigValue = getRemoteConfigValue(str);
        return remoteConfigValue != null ? B9.g.e(remoteConfigValue.m()) : B9.g.a();
    }

    public boolean isFirebaseRemoteConfigAvailable() {
        InterfaceC3755b<com.google.firebase.remoteconfig.c> interfaceC3755b;
        com.google.firebase.remoteconfig.c cVar;
        if (this.firebaseRemoteConfig == null && (interfaceC3755b = this.firebaseRemoteConfigProvider) != null && (cVar = interfaceC3755b.get()) != null) {
            this.firebaseRemoteConfig = cVar.e(FIREPERF_FRC_NAMESPACE_NAME);
        }
        return this.firebaseRemoteConfig != null;
    }

    public boolean isLastFetchFailed() {
        com.google.firebase.remoteconfig.a aVar = this.firebaseRemoteConfig;
        return aVar == null || aVar.i().a() == 1 || this.firebaseRemoteConfig.i().a() == 2;
    }

    public void setFirebaseRemoteConfigProvider(InterfaceC3755b<com.google.firebase.remoteconfig.c> interfaceC3755b) {
        this.firebaseRemoteConfigProvider = interfaceC3755b;
    }

    protected void syncConfigValues(Map<String, E9.j> map) {
        this.allRcConfigMap.putAll(map);
        for (String str : this.allRcConfigMap.keySet()) {
            if (!map.containsKey(str)) {
                this.allRcConfigMap.remove(str);
            }
        }
        d dVarE = d.e();
        E9.j jVar = this.allRcConfigMap.get(dVarE.c());
        if (jVar == null) {
            logger.a("ExperimentTTID remote config flag does not exist.");
            return;
        }
        try {
            this.cache.m(dVarE.a(), jVar.n());
        } catch (Exception unused) {
            logger.a("ExperimentTTID remote config flag has invalid value, expected boolean.");
        }
    }

    RemoteConfigManager(x xVar, Executor executor, com.google.firebase.remoteconfig.a aVar, long j10, long j11) {
        ConcurrentHashMap<String, E9.j> concurrentHashMap;
        this.firebaseRemoteConfigLastFetchTimestampMs = FETCH_NEVER_HAPPENED_TIMESTAMP_MS;
        this.cache = xVar;
        this.executor = executor;
        this.firebaseRemoteConfig = aVar;
        if (aVar == null) {
            concurrentHashMap = new ConcurrentHashMap<>();
        } else {
            concurrentHashMap = new ConcurrentHashMap<>(aVar.h());
        }
        this.allRcConfigMap = concurrentHashMap;
        this.appStartTimeInMs = j11;
        this.appStartConfigFetchDelayInMs = j10;
    }
}
