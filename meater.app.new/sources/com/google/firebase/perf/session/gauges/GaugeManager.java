package com.google.firebase.perf.session.gauges;

import C9.g;
import K8.t;
import android.annotation.SuppressLint;
import android.content.Context;
import androidx.annotation.Keep;
import j9.InterfaceC3755b;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import v9.C4925a;
import z9.C5219a;

@Keep
/* loaded from: classes2.dex */
public class GaugeManager {
    private static final long APPROX_NUMBER_OF_DATA_POINTS_PER_GAUGE_METRIC = 20;
    private static final long INVALID_GAUGE_COLLECTION_FREQUENCY = -1;
    private static final long TIME_TO_WAIT_BEFORE_FLUSHING_GAUGES_QUEUE_MS = 20;
    private C9.d applicationProcessState;
    private final com.google.firebase.perf.config.a configResolver;
    private final t<c> cpuGaugeCollector;
    private ScheduledFuture gaugeManagerDataCollectionJob;
    private final t<ScheduledExecutorService> gaugeManagerExecutor;
    private i gaugeMetadataManager;
    private final t<l> memoryGaugeCollector;
    private String sessionId;
    private final A9.k transportManager;
    private static final C4925a logger = C4925a.e();
    private static final GaugeManager instance = new GaugeManager();

    static /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f38563a;

        static {
            int[] iArr = new int[C9.d.values().length];
            f38563a = iArr;
            try {
                iArr[C9.d.BACKGROUND.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f38563a[C9.d.FOREGROUND.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    @SuppressLint({"ThreadPoolCreation"})
    private GaugeManager() {
        this(new t(new InterfaceC3755b() { // from class: com.google.firebase.perf.session.gauges.f
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return Executors.newSingleThreadScheduledExecutor();
            }
        }), A9.k.k(), com.google.firebase.perf.config.a.g(), null, new t(new InterfaceC3755b() { // from class: com.google.firebase.perf.session.gauges.g
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return GaugeManager.lambda$new$0();
            }
        }), new t(new InterfaceC3755b() { // from class: com.google.firebase.perf.session.gauges.h
            @Override // j9.InterfaceC3755b
            public final Object get() {
                return GaugeManager.lambda$new$1();
            }
        }));
    }

    private long getCpuGaugeCollectionFrequencyMs(C9.d dVar) {
        int i10 = a.f38563a[dVar.ordinal()];
        long jZ = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.z() : this.configResolver.y();
        return c.f(jZ) ? INVALID_GAUGE_COLLECTION_FREQUENCY : jZ;
    }

    private C9.f getGaugeMetadata() {
        return C9.f.g0().L(this.gaugeMetadataManager.a()).M(this.gaugeMetadataManager.b()).N(this.gaugeMetadataManager.c()).e();
    }

    public static synchronized GaugeManager getInstance() {
        return instance;
    }

    private long getMemoryGaugeCollectionFrequencyMs(C9.d dVar) {
        int i10 = a.f38563a[dVar.ordinal()];
        long jC = i10 != 1 ? i10 != 2 ? -1L : this.configResolver.C() : this.configResolver.B();
        return l.e(jC) ? INVALID_GAUGE_COLLECTION_FREQUENCY : jC;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ c lambda$new$0() {
        return new c();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ l lambda$new$1() {
        return new l();
    }

    private boolean startCollectingCpuMetrics(long j10, B9.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Cpu Metrics collection frequency. Did not collect Cpu Metrics.");
            return false;
        }
        this.cpuGaugeCollector.get().k(j10, lVar);
        return true;
    }

    private boolean startCollectingMemoryMetrics(long j10, B9.l lVar) {
        if (j10 == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.a("Invalid Memory Metrics collection frequency. Did not collect Memory Metrics.");
            return false;
        }
        this.memoryGaugeCollector.get().j(j10, lVar);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: syncFlush, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public void lambda$stopCollectingGauges$3(String str, C9.d dVar) {
        g.b bVarP0 = C9.g.p0();
        while (!this.cpuGaugeCollector.get().f38570a.isEmpty()) {
            bVarP0.M(this.cpuGaugeCollector.get().f38570a.poll());
        }
        while (!this.memoryGaugeCollector.get().f38593b.isEmpty()) {
            bVarP0.L(this.memoryGaugeCollector.get().f38593b.poll());
        }
        bVarP0.O(str);
        this.transportManager.A(bVarP0.e(), dVar);
    }

    public void collectGaugeMetricOnce(B9.l lVar) {
        collectGaugeMetricOnce(this.cpuGaugeCollector.get(), this.memoryGaugeCollector.get(), lVar);
    }

    public void initializeGaugeMetadataManager(Context context) {
        this.gaugeMetadataManager = new i(context);
    }

    public boolean logGaugeMetadata(String str, C9.d dVar) {
        if (this.gaugeMetadataManager == null) {
            return false;
        }
        this.transportManager.A(C9.g.p0().O(str).N(getGaugeMetadata()).e(), dVar);
        return true;
    }

    public void startCollectingGauges(C5219a c5219a, final C9.d dVar) {
        if (this.sessionId != null) {
            stopCollectingGauges();
        }
        long jStartCollectingGauges = startCollectingGauges(dVar, c5219a.d());
        if (jStartCollectingGauges == INVALID_GAUGE_COLLECTION_FREQUENCY) {
            logger.j("Invalid gauge collection frequency. Unable to start collecting Gauges.");
            return;
        }
        final String strH = c5219a.h();
        this.sessionId = strH;
        this.applicationProcessState = dVar;
        try {
            long j10 = jStartCollectingGauges * 20;
            this.gaugeManagerDataCollectionJob = this.gaugeManagerExecutor.get().scheduleAtFixedRate(new Runnable() { // from class: com.google.firebase.perf.session.gauges.e
                @Override // java.lang.Runnable
                public final void run() {
                    this.f38579B.lambda$startCollectingGauges$2(strH, dVar);
                }
            }, j10, j10, TimeUnit.MILLISECONDS);
        } catch (RejectedExecutionException e10) {
            logger.j("Unable to start collecting Gauges: " + e10.getMessage());
        }
    }

    public void stopCollectingGauges() {
        final String str = this.sessionId;
        if (str == null) {
            return;
        }
        final C9.d dVar = this.applicationProcessState;
        this.cpuGaugeCollector.get().l();
        this.memoryGaugeCollector.get().k();
        ScheduledFuture scheduledFuture = this.gaugeManagerDataCollectionJob;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.gaugeManagerExecutor.get().schedule(new Runnable() { // from class: com.google.firebase.perf.session.gauges.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f38576B.lambda$stopCollectingGauges$3(str, dVar);
            }
        }, 20L, TimeUnit.MILLISECONDS);
        this.sessionId = null;
        this.applicationProcessState = C9.d.APPLICATION_PROCESS_STATE_UNKNOWN;
    }

    private static void collectGaugeMetricOnce(c cVar, l lVar, B9.l lVar2) {
        cVar.c(lVar2);
        lVar.c(lVar2);
    }

    GaugeManager(t<ScheduledExecutorService> tVar, A9.k kVar, com.google.firebase.perf.config.a aVar, i iVar, t<c> tVar2, t<l> tVar3) {
        this.gaugeManagerDataCollectionJob = null;
        this.sessionId = null;
        this.applicationProcessState = C9.d.APPLICATION_PROCESS_STATE_UNKNOWN;
        this.gaugeManagerExecutor = tVar;
        this.transportManager = kVar;
        this.configResolver = aVar;
        this.gaugeMetadataManager = iVar;
        this.cpuGaugeCollector = tVar2;
        this.memoryGaugeCollector = tVar3;
    }

    private long startCollectingGauges(C9.d dVar, B9.l lVar) {
        long cpuGaugeCollectionFrequencyMs = getCpuGaugeCollectionFrequencyMs(dVar);
        if (!startCollectingCpuMetrics(cpuGaugeCollectionFrequencyMs, lVar)) {
            cpuGaugeCollectionFrequencyMs = -1;
        }
        long memoryGaugeCollectionFrequencyMs = getMemoryGaugeCollectionFrequencyMs(dVar);
        return startCollectingMemoryMetrics(memoryGaugeCollectionFrequencyMs, lVar) ? cpuGaugeCollectionFrequencyMs == INVALID_GAUGE_COLLECTION_FREQUENCY ? memoryGaugeCollectionFrequencyMs : Math.min(cpuGaugeCollectionFrequencyMs, memoryGaugeCollectionFrequencyMs) : cpuGaugeCollectionFrequencyMs;
    }
}
