package io.sentry;

import io.sentry.cache.InterfaceC9394r;
import io.sentry.clientreport.C9400d;
import io.sentry.clientreport.C9405i;
import io.sentry.clientreport.InterfaceC9403g;
import io.sentry.internal.debugmeta.C9476b;
import io.sentry.internal.debugmeta.InterfaceC9475a;
import io.sentry.internal.gestures.InterfaceC9478a;
import io.sentry.internal.modules.C9484e;
import io.sentry.internal.modules.InterfaceC9481b;
import io.sentry.internal.viewhierarchy.InterfaceC9486a;
import io.sentry.protocol.C9556o;
import io.sentry.protocol.C9565x;
import io.sentry.transport.C9616t;
import io.sentry.transport.C9618v;
import io.sentry.transport.InterfaceC9615s;
import io.sentry.util.C9648s;
import io.sentry.util.C9649t;
import io.sentry.util.C9654u;
import io.sentry.util.thread.C9653d;
import io.sentry.util.thread.InterfaceC9651b;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.CopyOnWriteArraySet;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import org.jetbrains.annotations.ApiStatus;

/* compiled from: SentryOptions.java */
/* renamed from: io.sentry.x4 */
/* loaded from: classes.dex */
public class C9680x4 {
    static final EnumC9587s4 DEFAULT_DIAGNOSTIC_LEVEL = EnumC9587s4.DEBUG;
    private static final String DEFAULT_ENVIRONMENT = "production";

    @ApiStatus.Internal
    public static final String DEFAULT_PROPAGATION_TARGETS = ".*";
    private boolean attachServerName;
    private boolean attachStacktrace;
    private boolean attachThreads;
    private a beforeBreadcrumb;
    private b beforeSend;
    private c beforeSendTransaction;
    private final Set<String> bundleIds;
    private String cacheDirPath;
    InterfaceC9403g clientReportRecorder;
    private final List<InterfaceC9577r1> collectors;
    private int connectionTimeoutMillis;
    private final List<String> contextTags;

    @ApiStatus.Internal
    private InterfaceC9442g4 dateProvider;
    private boolean debug;
    private InterfaceC9475a debugMetaLoader;
    private final List<String> defaultTracePropagationTargets;
    private EnumC9587s4 diagnosticLevel;
    private String dist;
    private String distinctId;
    private String dsn;
    private String dsnHash;
    private boolean enableAutoSessionTracking;
    private boolean enableDeduplication;
    private boolean enableExternalConfiguration;
    private boolean enableNdk;
    private boolean enablePrettySerializationOutput;
    private boolean enableScopeSync;
    private boolean enableShutdownHook;
    private boolean enableTimeToFullDisplayTracing;
    private Boolean enableTracing;
    private boolean enableUncaughtExceptionHandler;
    private boolean enableUserInteractionBreadcrumbs;
    private boolean enableUserInteractionTracing;
    private boolean enabled;
    private InterfaceC9394r envelopeDiskCache;
    private InterfaceC9584s1 envelopeReader;
    private String environment;
    private final List<InterfaceC9496k1> eventProcessors;
    private InterfaceC9366b2 executorService;
    private long flushTimeoutMillis;
    private final C9510m1 fullyDisplayedReporter;
    private final List<InterfaceC9478a> gestureTargetLocators;
    private HostnameVerifier hostnameVerifier;
    private Long idleTimeout;

    @ApiStatus.Experimental
    private List<String> ignoredCheckIns;
    private final Set<Class<? extends Throwable>> ignoredExceptionsForType;
    private final List<String> inAppExcludes;
    private final List<String> inAppIncludes;
    private EnumC9447h2 instrumenter;
    private final List<Integration> integrations;
    private InterfaceC9670w1 logger;
    private InterfaceC9651b mainThreadChecker;
    private long maxAttachmentSize;
    private int maxBreadcrumbs;
    private int maxCacheItems;
    private int maxDepth;
    private int maxQueueSize;
    private f maxRequestBodySize;
    private int maxSpans;
    private long maxTraceFileSize;
    private InterfaceC9481b modulesLoader;
    private final List<InterfaceC9689z1> observers;
    private final List<InterfaceC9677x1> optionsObservers;
    private boolean printUncaughtStackTrace;
    private Double profilesSampleRate;
    private d profilesSampler;
    private String proguardUuid;
    private e proxy;
    private int readTimeoutMillis;
    private String release;
    private Double sampleRate;
    private C9556o sdkVersion;
    private boolean sendClientReports;
    private boolean sendDefaultPii;
    private boolean sendModules;
    private String sentryClientName;
    private InterfaceC9373c2 serializer;
    private String serverName;
    private long sessionTrackingIntervalMillis;
    private long shutdownTimeoutMillis;
    private SSLSocketFactory sslSocketFactory;
    private final Map<String, String> tags;
    private boolean traceOptionsRequests;
    private List<String> tracePropagationTargets;
    private boolean traceSampling;
    private Double tracesSampleRate;
    private g tracesSampler;
    private InterfaceC9629u5 transactionPerformanceCollector;
    private InterfaceC9433f2 transactionProfiler;
    private InterfaceC9440g2 transportFactory;
    private InterfaceC9615s transportGate;
    private final List<InterfaceC9486a> viewHierarchyExporters;

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$a */
    /* loaded from: classes2.dex */
    public interface a {
        /* renamed from: a */
        C9657v0 m31943a(C9657v0 c9657v0, C9517n1 c9517n1);
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$b */
    /* loaded from: classes2.dex */
    public interface b {
        /* renamed from: a */
        C9506l4 m31944a(C9506l4 c9506l4, C9517n1 c9517n1);
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$c */
    /* loaded from: classes2.dex */
    public interface c {
        /* renamed from: a */
        C9565x m31945a(C9565x c9565x, C9517n1 c9517n1);
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$d */
    /* loaded from: classes2.dex */
    public interface d {
        /* renamed from: a */
        Double m31946a(C9579r3 c9579r3);
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$e */
    /* loaded from: classes2.dex */
    public static final class e {

        /* renamed from: a */
        private String f37014a;

        /* renamed from: b */
        private String f37015b;

        /* renamed from: c */
        private String f37016c;

        /* renamed from: d */
        private String f37017d;

        public e(String str, String str2, String str3, String str4) {
            this.f37014a = str;
            this.f37015b = str2;
            this.f37016c = str3;
            this.f37017d = str4;
        }

        /* renamed from: a */
        public String m31947a() {
            return this.f37014a;
        }

        /* renamed from: b */
        public String m31948b() {
            return this.f37017d;
        }

        /* renamed from: c */
        public String m31949c() {
            return this.f37015b;
        }

        /* renamed from: d */
        public String m31950d() {
            return this.f37016c;
        }
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$f */
    /* loaded from: classes2.dex */
    public enum f {
        NONE,
        SMALL,
        MEDIUM,
        ALWAYS
    }

    /* compiled from: SentryOptions.java */
    /* renamed from: io.sentry.x4$g */
    /* loaded from: classes2.dex */
    public interface g {
        /* renamed from: a */
        Double m31951a(C9579r3 c9579r3);
    }

    public C9680x4() {
        this(false);
    }

    private void addPackageInfo() {
        C9573q4.m31555c().m31557b("maven:io.sentry:sentry", "6.34.0");
    }

    private C9556o createSdkVersion() {
        C9556o c9556o = new C9556o("sentry.java", "6.34.0");
        c9556o.m31433j("6.34.0");
        return c9556o;
    }

    static C9680x4 empty() {
        return new C9680x4(true);
    }

    public void addBundleId(String str) {
        if (str != null) {
            String strTrim = str.trim();
            if (strTrim.isEmpty()) {
                return;
            }
            this.bundleIds.add(strTrim);
        }
    }

    @ApiStatus.Internal
    public void addCollector(InterfaceC9577r1 interfaceC9577r1) {
        this.collectors.add(interfaceC9577r1);
    }

    public void addContextTag(String str) {
        this.contextTags.add(str);
    }

    public void addEventProcessor(InterfaceC9496k1 interfaceC9496k1) {
        this.eventProcessors.add(interfaceC9496k1);
    }

    public void addIgnoredExceptionForType(Class<? extends Throwable> cls) {
        this.ignoredExceptionsForType.add(cls);
    }

    public void addInAppExclude(String str) {
        this.inAppExcludes.add(str);
    }

    public void addInAppInclude(String str) {
        this.inAppIncludes.add(str);
    }

    public void addIntegration(Integration integration) {
        this.integrations.add(integration);
    }

    public void addOptionsObserver(InterfaceC9677x1 interfaceC9677x1) {
        this.optionsObservers.add(interfaceC9677x1);
    }

    public void addScopeObserver(InterfaceC9689z1 interfaceC9689z1) {
        this.observers.add(interfaceC9689z1);
    }

    @Deprecated
    public void addTracingOrigin(String str) {
        if (this.tracePropagationTargets == null) {
            this.tracePropagationTargets = new CopyOnWriteArrayList();
        }
        if (str.isEmpty()) {
            return;
        }
        this.tracePropagationTargets.add(str);
    }

    boolean containsIgnoredExceptionForType(Throwable th) {
        return this.ignoredExceptionsForType.contains(th.getClass());
    }

    public a getBeforeBreadcrumb() {
        return this.beforeBreadcrumb;
    }

    public b getBeforeSend() {
        return this.beforeSend;
    }

    public c getBeforeSendTransaction() {
        return this.beforeSendTransaction;
    }

    public Set<String> getBundleIds() {
        return this.bundleIds;
    }

    public String getCacheDirPath() {
        String str = this.cacheDirPath;
        if (str == null || str.isEmpty()) {
            return null;
        }
        return this.dsnHash != null ? new File(this.cacheDirPath, this.dsnHash).getAbsolutePath() : this.cacheDirPath;
    }

    @ApiStatus.Internal
    public InterfaceC9403g getClientReportRecorder() {
        return this.clientReportRecorder;
    }

    @ApiStatus.Internal
    public List<InterfaceC9577r1> getCollectors() {
        return this.collectors;
    }

    public int getConnectionTimeoutMillis() {
        return this.connectionTimeoutMillis;
    }

    public List<String> getContextTags() {
        return this.contextTags;
    }

    @ApiStatus.Internal
    public InterfaceC9442g4 getDateProvider() {
        return this.dateProvider;
    }

    @ApiStatus.Internal
    public InterfaceC9475a getDebugMetaLoader() {
        return this.debugMetaLoader;
    }

    public EnumC9587s4 getDiagnosticLevel() {
        return this.diagnosticLevel;
    }

    public String getDist() {
        return this.dist;
    }

    @ApiStatus.Internal
    public String getDistinctId() {
        return this.distinctId;
    }

    public String getDsn() {
        return this.dsn;
    }

    public Boolean getEnableTracing() {
        return this.enableTracing;
    }

    public InterfaceC9394r getEnvelopeDiskCache() {
        return this.envelopeDiskCache;
    }

    public InterfaceC9584s1 getEnvelopeReader() {
        return this.envelopeReader;
    }

    public String getEnvironment() {
        String str = this.environment;
        return str != null ? str : DEFAULT_ENVIRONMENT;
    }

    public List<InterfaceC9496k1> getEventProcessors() {
        return this.eventProcessors;
    }

    @ApiStatus.Internal
    public InterfaceC9366b2 getExecutorService() {
        return this.executorService;
    }

    public long getFlushTimeoutMillis() {
        return this.flushTimeoutMillis;
    }

    @ApiStatus.Internal
    public C9510m1 getFullyDisplayedReporter() {
        return this.fullyDisplayedReporter;
    }

    public List<InterfaceC9478a> getGestureTargetLocators() {
        return this.gestureTargetLocators;
    }

    public HostnameVerifier getHostnameVerifier() {
        return this.hostnameVerifier;
    }

    public Long getIdleTimeout() {
        return this.idleTimeout;
    }

    @ApiStatus.Experimental
    public List<String> getIgnoredCheckIns() {
        return this.ignoredCheckIns;
    }

    public Set<Class<? extends Throwable>> getIgnoredExceptionsForType() {
        return this.ignoredExceptionsForType;
    }

    public List<String> getInAppExcludes() {
        return this.inAppExcludes;
    }

    public List<String> getInAppIncludes() {
        return this.inAppIncludes;
    }

    public EnumC9447h2 getInstrumenter() {
        return this.instrumenter;
    }

    public List<Integration> getIntegrations() {
        return this.integrations;
    }

    public InterfaceC9670w1 getLogger() {
        return this.logger;
    }

    public InterfaceC9651b getMainThreadChecker() {
        return this.mainThreadChecker;
    }

    public long getMaxAttachmentSize() {
        return this.maxAttachmentSize;
    }

    public int getMaxBreadcrumbs() {
        return this.maxBreadcrumbs;
    }

    public int getMaxCacheItems() {
        return this.maxCacheItems;
    }

    public int getMaxDepth() {
        return this.maxDepth;
    }

    public int getMaxQueueSize() {
        return this.maxQueueSize;
    }

    public f getMaxRequestBodySize() {
        return this.maxRequestBodySize;
    }

    @ApiStatus.Experimental
    public int getMaxSpans() {
        return this.maxSpans;
    }

    public long getMaxTraceFileSize() {
        return this.maxTraceFileSize;
    }

    @ApiStatus.Internal
    public InterfaceC9481b getModulesLoader() {
        return this.modulesLoader;
    }

    public List<InterfaceC9677x1> getOptionsObservers() {
        return this.optionsObservers;
    }

    public String getOutboxPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "outbox").getAbsolutePath();
    }

    public Double getProfilesSampleRate() {
        return this.profilesSampleRate;
    }

    public d getProfilesSampler() {
        return this.profilesSampler;
    }

    public String getProfilingTracesDirPath() {
        String cacheDirPath = getCacheDirPath();
        if (cacheDirPath == null) {
            return null;
        }
        return new File(cacheDirPath, "profiling_traces").getAbsolutePath();
    }

    public String getProguardUuid() {
        return this.proguardUuid;
    }

    public e getProxy() {
        return this.proxy;
    }

    public int getReadTimeoutMillis() {
        return this.readTimeoutMillis;
    }

    public String getRelease() {
        return this.release;
    }

    public Double getSampleRate() {
        return this.sampleRate;
    }

    public List<InterfaceC9689z1> getScopeObservers() {
        return this.observers;
    }

    public C9556o getSdkVersion() {
        return this.sdkVersion;
    }

    public String getSentryClientName() {
        return this.sentryClientName;
    }

    public InterfaceC9373c2 getSerializer() {
        return this.serializer;
    }

    public String getServerName() {
        return this.serverName;
    }

    public long getSessionTrackingIntervalMillis() {
        return this.sessionTrackingIntervalMillis;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public long getShutdownTimeout() {
        return this.shutdownTimeoutMillis;
    }

    public long getShutdownTimeoutMillis() {
        return this.shutdownTimeoutMillis;
    }

    public SSLSocketFactory getSslSocketFactory() {
        return this.sslSocketFactory;
    }

    public Map<String, String> getTags() {
        return this.tags;
    }

    public List<String> getTracePropagationTargets() {
        List<String> list = this.tracePropagationTargets;
        return list == null ? this.defaultTracePropagationTargets : list;
    }

    public Double getTracesSampleRate() {
        return this.tracesSampleRate;
    }

    public g getTracesSampler() {
        return this.tracesSampler;
    }

    @Deprecated
    public List<String> getTracingOrigins() {
        return getTracePropagationTargets();
    }

    @ApiStatus.Internal
    public InterfaceC9629u5 getTransactionPerformanceCollector() {
        return this.transactionPerformanceCollector;
    }

    public InterfaceC9433f2 getTransactionProfiler() {
        return this.transactionProfiler;
    }

    public InterfaceC9440g2 getTransportFactory() {
        return this.transportFactory;
    }

    public InterfaceC9615s getTransportGate() {
        return this.transportGate;
    }

    public final List<InterfaceC9486a> getViewHierarchyExporters() {
        return this.viewHierarchyExporters;
    }

    public boolean isAttachServerName() {
        return this.attachServerName;
    }

    public boolean isAttachStacktrace() {
        return this.attachStacktrace;
    }

    public boolean isAttachThreads() {
        return this.attachThreads;
    }

    public boolean isDebug() {
        return this.debug;
    }

    public boolean isEnableAutoSessionTracking() {
        return this.enableAutoSessionTracking;
    }

    public boolean isEnableDeduplication() {
        return this.enableDeduplication;
    }

    public boolean isEnableExternalConfiguration() {
        return this.enableExternalConfiguration;
    }

    public boolean isEnableNdk() {
        return this.enableNdk;
    }

    public boolean isEnablePrettySerializationOutput() {
        return this.enablePrettySerializationOutput;
    }

    public boolean isEnableScopeSync() {
        return this.enableScopeSync;
    }

    public boolean isEnableShutdownHook() {
        return this.enableShutdownHook;
    }

    public boolean isEnableTimeToFullDisplayTracing() {
        return this.enableTimeToFullDisplayTracing;
    }

    public boolean isEnableUncaughtExceptionHandler() {
        return this.enableUncaughtExceptionHandler;
    }

    public boolean isEnableUserInteractionBreadcrumbs() {
        return this.enableUserInteractionBreadcrumbs;
    }

    public boolean isEnableUserInteractionTracing() {
        return this.enableUserInteractionTracing;
    }

    public boolean isEnabled() {
        return this.enabled;
    }

    public boolean isPrintUncaughtStackTrace() {
        return this.printUncaughtStackTrace;
    }

    public boolean isProfilingEnabled() {
        return (getProfilesSampleRate() != null && getProfilesSampleRate().doubleValue() > 0.0d) || getProfilesSampler() != null;
    }

    public boolean isSendClientReports() {
        return this.sendClientReports;
    }

    public boolean isSendDefaultPii() {
        return this.sendDefaultPii;
    }

    public boolean isSendModules() {
        return this.sendModules;
    }

    public boolean isTraceOptionsRequests() {
        return this.traceOptionsRequests;
    }

    @ApiStatus.Experimental
    public boolean isTraceSampling() {
        return this.traceSampling;
    }

    public boolean isTracingEnabled() {
        Boolean bool = this.enableTracing;
        return bool != null ? bool.booleanValue() : (getTracesSampleRate() == null && getTracesSampler() == null) ? false : true;
    }

    public void merge(C9503l1 c9503l1) {
        if (c9503l1.m30969l() != null) {
            setDsn(c9503l1.m30969l());
        }
        if (c9503l1.m30973p() != null) {
            setEnvironment(c9503l1.m30973p());
        }
        if (c9503l1.m30983z() != null) {
            setRelease(c9503l1.m30983z());
        }
        if (c9503l1.m30968k() != null) {
            setDist(c9503l1.m30968k());
        }
        if (c9503l1.m30930B() != null) {
            setServerName(c9503l1.m30930B());
        }
        if (c9503l1.m30982y() != null) {
            setProxy(c9503l1.m30982y());
        }
        if (c9503l1.m30972o() != null) {
            setEnableUncaughtExceptionHandler(c9503l1.m30972o().booleanValue());
        }
        if (c9503l1.m30979v() != null) {
            setPrintUncaughtStackTrace(c9503l1.m30979v().booleanValue());
        }
        if (c9503l1.m30971n() != null) {
            setEnableTracing(c9503l1.m30971n());
        }
        if (c9503l1.m30933E() != null) {
            setTracesSampleRate(c9503l1.m30933E());
        }
        if (c9503l1.m30980w() != null) {
            setProfilesSampleRate(c9503l1.m30980w());
        }
        if (c9503l1.m30967j() != null) {
            setDebug(c9503l1.m30967j().booleanValue());
        }
        if (c9503l1.m30970m() != null) {
            setEnableDeduplication(c9503l1.m30970m().booleanValue());
        }
        if (c9503l1.m30929A() != null) {
            setSendClientReports(c9503l1.m30929A().booleanValue());
        }
        for (Map.Entry entry : new HashMap(c9503l1.m30931C()).entrySet()) {
            this.tags.put((String) entry.getKey(), (String) entry.getValue());
        }
        Iterator it = new ArrayList(c9503l1.m30978u()).iterator();
        while (it.hasNext()) {
            addInAppInclude((String) it.next());
        }
        Iterator it2 = new ArrayList(c9503l1.m30977t()).iterator();
        while (it2.hasNext()) {
            addInAppExclude((String) it2.next());
        }
        Iterator it3 = new HashSet(c9503l1.m30976s()).iterator();
        while (it3.hasNext()) {
            addIgnoredExceptionForType((Class) it3.next());
        }
        if (c9503l1.m30932D() != null) {
            setTracePropagationTargets(new ArrayList(c9503l1.m30932D()));
        }
        Iterator it4 = new ArrayList(c9503l1.m30966i()).iterator();
        while (it4.hasNext()) {
            addContextTag((String) it4.next());
        }
        if (c9503l1.m30981x() != null) {
            setProguardUuid(c9503l1.m30981x());
        }
        if (c9503l1.m30974q() != null) {
            setIdleTimeout(c9503l1.m30974q());
        }
        Iterator<String> it5 = c9503l1.m30965h().iterator();
        while (it5.hasNext()) {
            addBundleId(it5.next());
        }
        if (c9503l1.m30935G() != null) {
            setEnabled(c9503l1.m30935G().booleanValue());
        }
        if (c9503l1.m30934F() != null) {
            setEnablePrettySerializationOutput(c9503l1.m30934F().booleanValue());
        }
        if (c9503l1.m30936H() != null) {
            setSendModules(c9503l1.m30936H().booleanValue());
        }
        if (c9503l1.m30975r() != null) {
            setIgnoredCheckIns(new ArrayList(c9503l1.m30975r()));
        }
    }

    public void setAttachServerName(boolean z) {
        this.attachServerName = z;
    }

    public void setAttachStacktrace(boolean z) {
        this.attachStacktrace = z;
    }

    public void setAttachThreads(boolean z) {
        this.attachThreads = z;
    }

    public void setBeforeBreadcrumb(a aVar) {
        this.beforeBreadcrumb = aVar;
    }

    public void setBeforeSend(b bVar) {
        this.beforeSend = bVar;
    }

    public void setBeforeSendTransaction(c cVar) {
        this.beforeSendTransaction = cVar;
    }

    public void setCacheDirPath(String str) {
        this.cacheDirPath = str;
    }

    public void setConnectionTimeoutMillis(int i2) {
        this.connectionTimeoutMillis = i2;
    }

    @ApiStatus.Internal
    public void setDateProvider(InterfaceC9442g4 interfaceC9442g4) {
        this.dateProvider = interfaceC9442g4;
    }

    public void setDebug(boolean z) {
        this.debug = z;
    }

    @ApiStatus.Internal
    public void setDebugMetaLoader(InterfaceC9475a interfaceC9475a) {
        if (interfaceC9475a == null) {
            interfaceC9475a = C9476b.m30859b();
        }
        this.debugMetaLoader = interfaceC9475a;
    }

    public void setDiagnosticLevel(EnumC9587s4 enumC9587s4) {
        if (enumC9587s4 == null) {
            enumC9587s4 = DEFAULT_DIAGNOSTIC_LEVEL;
        }
        this.diagnosticLevel = enumC9587s4;
    }

    public void setDist(String str) {
        this.dist = str;
    }

    @ApiStatus.Internal
    public void setDistinctId(String str) {
        this.distinctId = str;
    }

    public void setDsn(String str) {
        this.dsn = str;
        this.dsnHash = C9654u.m31817a(str, this.logger);
    }

    public void setEnableAutoSessionTracking(boolean z) {
        this.enableAutoSessionTracking = z;
    }

    public void setEnableDeduplication(boolean z) {
        this.enableDeduplication = z;
    }

    public void setEnableExternalConfiguration(boolean z) {
        this.enableExternalConfiguration = z;
    }

    public void setEnableNdk(boolean z) {
        this.enableNdk = z;
    }

    public void setEnablePrettySerializationOutput(boolean z) {
        this.enablePrettySerializationOutput = z;
    }

    public void setEnableScopeSync(boolean z) {
        this.enableScopeSync = z;
    }

    public void setEnableShutdownHook(boolean z) {
        this.enableShutdownHook = z;
    }

    public void setEnableTimeToFullDisplayTracing(boolean z) {
        this.enableTimeToFullDisplayTracing = z;
    }

    public void setEnableTracing(Boolean bool) {
        this.enableTracing = bool;
    }

    public void setEnableUncaughtExceptionHandler(boolean z) {
        this.enableUncaughtExceptionHandler = z;
    }

    public void setEnableUserInteractionBreadcrumbs(boolean z) {
        this.enableUserInteractionBreadcrumbs = z;
    }

    public void setEnableUserInteractionTracing(boolean z) {
        this.enableUserInteractionTracing = z;
    }

    public void setEnabled(boolean z) {
        this.enabled = z;
    }

    public void setEnvelopeDiskCache(InterfaceC9394r interfaceC9394r) {
        if (interfaceC9394r == null) {
            interfaceC9394r = C9616t.m31704c();
        }
        this.envelopeDiskCache = interfaceC9394r;
    }

    public void setEnvelopeReader(InterfaceC9584s1 interfaceC9584s1) {
        if (interfaceC9584s1 == null) {
            interfaceC9584s1 = C9678x2.m31939b();
        }
        this.envelopeReader = interfaceC9584s1;
    }

    public void setEnvironment(String str) {
        this.environment = str;
    }

    @ApiStatus.Internal
    public void setExecutorService(InterfaceC9366b2 interfaceC9366b2) {
        if (interfaceC9366b2 != null) {
            this.executorService = interfaceC9366b2;
        }
    }

    public void setFlushTimeoutMillis(long j2) {
        this.flushTimeoutMillis = j2;
    }

    public void setGestureTargetLocators(List<InterfaceC9478a> list) {
        this.gestureTargetLocators.clear();
        this.gestureTargetLocators.addAll(list);
    }

    public void setHostnameVerifier(HostnameVerifier hostnameVerifier) {
        this.hostnameVerifier = hostnameVerifier;
    }

    public void setIdleTimeout(Long l) {
        this.idleTimeout = l;
    }

    @ApiStatus.Experimental
    public void setIgnoredCheckIns(List<String> list) {
        if (list == null) {
            this.ignoredCheckIns = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.ignoredCheckIns = arrayList;
    }

    public void setInstrumenter(EnumC9447h2 enumC9447h2) {
        this.instrumenter = enumC9447h2;
    }

    public void setLogger(InterfaceC9670w1 interfaceC9670w1) {
        this.logger = interfaceC9670w1 == null ? C9690z2.m31959e() : new C9418d1(this, interfaceC9670w1);
    }

    public void setMainThreadChecker(InterfaceC9651b interfaceC9651b) {
        this.mainThreadChecker = interfaceC9651b;
    }

    public void setMaxAttachmentSize(long j2) {
        this.maxAttachmentSize = j2;
    }

    public void setMaxBreadcrumbs(int i2) {
        this.maxBreadcrumbs = i2;
    }

    public void setMaxCacheItems(int i2) {
        this.maxCacheItems = i2;
    }

    public void setMaxDepth(int i2) {
        this.maxDepth = i2;
    }

    public void setMaxQueueSize(int i2) {
        if (i2 > 0) {
            this.maxQueueSize = i2;
        }
    }

    public void setMaxRequestBodySize(f fVar) {
        this.maxRequestBodySize = fVar;
    }

    @ApiStatus.Experimental
    public void setMaxSpans(int i2) {
        this.maxSpans = i2;
    }

    public void setMaxTraceFileSize(long j2) {
        this.maxTraceFileSize = j2;
    }

    @ApiStatus.Internal
    public void setModulesLoader(InterfaceC9481b interfaceC9481b) {
        if (interfaceC9481b == null) {
            interfaceC9481b = C9484e.m30873b();
        }
        this.modulesLoader = interfaceC9481b;
    }

    public void setPrintUncaughtStackTrace(boolean z) {
        this.printUncaughtStackTrace = z;
    }

    public void setProfilesSampleRate(Double d2) {
        if (C9649t.m31807a(d2)) {
            this.profilesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setProfilesSampler(d dVar) {
        this.profilesSampler = dVar;
    }

    @Deprecated
    public void setProfilingEnabled(boolean z) {
        if (getProfilesSampleRate() == null) {
            setProfilesSampleRate(z ? Double.valueOf(1.0d) : null);
        }
    }

    public void setProguardUuid(String str) {
        this.proguardUuid = str;
    }

    public void setProxy(e eVar) {
        this.proxy = eVar;
    }

    public void setReadTimeoutMillis(int i2) {
        this.readTimeoutMillis = i2;
    }

    public void setRelease(String str) {
        this.release = str;
    }

    public void setSampleRate(Double d2) {
        if (C9649t.m31809c(d2)) {
            this.sampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values >= 0.0 and <= 1.0.");
    }

    @ApiStatus.Internal
    public void setSdkVersion(C9556o c9556o) {
        this.sdkVersion = c9556o;
    }

    public void setSendClientReports(boolean z) {
        this.sendClientReports = z;
        if (z) {
            this.clientReportRecorder = new C9400d(this);
        } else {
            this.clientReportRecorder = new C9405i();
        }
    }

    public void setSendDefaultPii(boolean z) {
        this.sendDefaultPii = z;
    }

    public void setSendModules(boolean z) {
        this.sendModules = z;
    }

    public void setSentryClientName(String str) {
        this.sentryClientName = str;
    }

    public void setSerializer(InterfaceC9373c2 interfaceC9373c2) {
        if (interfaceC9373c2 == null) {
            interfaceC9373c2 = C9367b3.m30486g();
        }
        this.serializer = interfaceC9373c2;
    }

    public void setServerName(String str) {
        this.serverName = str;
    }

    public void setSessionTrackingIntervalMillis(long j2) {
        this.sessionTrackingIntervalMillis = j2;
    }

    @ApiStatus.ScheduledForRemoval
    @Deprecated
    public void setShutdownTimeout(long j2) {
        this.shutdownTimeoutMillis = j2;
    }

    public void setShutdownTimeoutMillis(long j2) {
        this.shutdownTimeoutMillis = j2;
    }

    public void setSslSocketFactory(SSLSocketFactory sSLSocketFactory) {
        this.sslSocketFactory = sSLSocketFactory;
    }

    public void setTag(String str, String str2) {
        this.tags.put(str, str2);
    }

    public void setTraceOptionsRequests(boolean z) {
        this.traceOptionsRequests = z;
    }

    @ApiStatus.Internal
    public void setTracePropagationTargets(List<String> list) {
        if (list == null) {
            this.tracePropagationTargets = null;
            return;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : list) {
            if (!str.isEmpty()) {
                arrayList.add(str);
            }
        }
        this.tracePropagationTargets = arrayList;
    }

    @Deprecated
    public void setTraceSampling(boolean z) {
        this.traceSampling = z;
    }

    public void setTracesSampleRate(Double d2) {
        if (C9649t.m31810d(d2)) {
            this.tracesSampleRate = d2;
            return;
        }
        throw new IllegalArgumentException("The value " + d2 + " is not valid. Use null to disable or values between 0.0 and 1.0.");
    }

    public void setTracesSampler(g gVar) {
        this.tracesSampler = gVar;
    }

    @ApiStatus.Internal
    @Deprecated
    public void setTracingOrigins(List<String> list) {
        setTracePropagationTargets(list);
    }

    @ApiStatus.Internal
    public void setTransactionPerformanceCollector(InterfaceC9629u5 interfaceC9629u5) {
        this.transactionPerformanceCollector = interfaceC9629u5;
    }

    public void setTransactionProfiler(InterfaceC9433f2 interfaceC9433f2) {
        if (interfaceC9433f2 == null) {
            interfaceC9433f2 = C9434f3.m30786c();
        }
        this.transactionProfiler = interfaceC9433f2;
    }

    public void setTransportFactory(InterfaceC9440g2 interfaceC9440g2) {
        if (interfaceC9440g2 == null) {
            interfaceC9440g2 = C9441g3.m30813b();
        }
        this.transportFactory = interfaceC9440g2;
    }

    public void setTransportGate(InterfaceC9615s interfaceC9615s) {
        if (interfaceC9615s == null) {
            interfaceC9615s = C9618v.m31706a();
        }
        this.transportGate = interfaceC9615s;
    }

    public void setViewHierarchyExporters(List<InterfaceC9486a> list) {
        this.viewHierarchyExporters.clear();
        this.viewHierarchyExporters.addAll(list);
    }

    private C9680x4(boolean z) {
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.eventProcessors = copyOnWriteArrayList;
        this.ignoredExceptionsForType = new CopyOnWriteArraySet();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        this.integrations = copyOnWriteArrayList2;
        this.bundleIds = new CopyOnWriteArraySet();
        this.shutdownTimeoutMillis = 2000L;
        this.flushTimeoutMillis = 15000L;
        this.enableNdk = true;
        this.logger = C9690z2.m31959e();
        this.diagnosticLevel = DEFAULT_DIAGNOSTIC_LEVEL;
        this.envelopeReader = new C9446h1(new C9585s2(this));
        this.serializer = new C9585s2(this);
        this.maxDepth = 100;
        this.maxCacheItems = 30;
        this.maxQueueSize = 30;
        this.maxBreadcrumbs = 100;
        this.inAppExcludes = new CopyOnWriteArrayList();
        this.inAppIncludes = new CopyOnWriteArrayList();
        this.transportFactory = C9441g3.m30813b();
        this.transportGate = C9618v.m31706a();
        this.attachStacktrace = true;
        this.enableAutoSessionTracking = true;
        this.sessionTrackingIntervalMillis = 30000L;
        this.attachServerName = true;
        this.enableUncaughtExceptionHandler = true;
        this.printUncaughtStackTrace = false;
        this.executorService = C9246a3.m30026c();
        this.connectionTimeoutMillis = 5000;
        this.readTimeoutMillis = 5000;
        this.envelopeDiskCache = C9616t.m31704c();
        this.sendDefaultPii = false;
        this.observers = new CopyOnWriteArrayList();
        this.optionsObservers = new CopyOnWriteArrayList();
        this.tags = new ConcurrentHashMap();
        this.maxAttachmentSize = 20971520L;
        this.enableDeduplication = true;
        this.maxSpans = 1000;
        this.enableShutdownHook = true;
        this.maxRequestBodySize = f.NONE;
        this.traceSampling = true;
        this.maxTraceFileSize = 5242880L;
        this.transactionProfiler = C9434f3.m30786c();
        this.tracePropagationTargets = null;
        this.defaultTracePropagationTargets = Collections.singletonList(DEFAULT_PROPAGATION_TARGETS);
        this.idleTimeout = 3000L;
        this.contextTags = new CopyOnWriteArrayList();
        this.sendClientReports = true;
        this.clientReportRecorder = new C9400d(this);
        this.modulesLoader = C9484e.m30873b();
        this.debugMetaLoader = C9476b.m30859b();
        this.enableUserInteractionTracing = false;
        this.enableUserInteractionBreadcrumbs = true;
        this.instrumenter = EnumC9447h2.SENTRY;
        this.gestureTargetLocators = new ArrayList();
        this.viewHierarchyExporters = new ArrayList();
        this.mainThreadChecker = C9653d.m31816e();
        this.traceOptionsRequests = true;
        this.dateProvider = new C9368b4();
        this.collectors = new ArrayList();
        this.transactionPerformanceCollector = C9427e3.m30761c();
        this.enableTimeToFullDisplayTracing = false;
        this.fullyDisplayedReporter = C9510m1.m31014a();
        this.enabled = true;
        this.enablePrettySerializationOutput = true;
        this.sendModules = true;
        this.ignoredCheckIns = null;
        if (z) {
            return;
        }
        this.executorService = new C9520n4();
        copyOnWriteArrayList2.add(new UncaughtExceptionHandlerIntegration());
        copyOnWriteArrayList2.add(new ShutdownHookIntegration());
        copyOnWriteArrayList.add(new C9592t2(this));
        copyOnWriteArrayList.add(new C9439g1(this));
        if (C9648s.m31806b()) {
            copyOnWriteArrayList.add(new C9686y4());
        }
        setSentryClientName("sentry.java/6.34.0");
        setSdkVersion(createSdkVersion());
        addPackageInfo();
    }
}
