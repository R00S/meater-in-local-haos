package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.abtesting.BaseExperiment;
import cm.aptoide.p092pt.database.RoomExperimentPersistence;
import java.util.HashMap;
import p456rx.C11231b;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11252a;
import p456rx.p460m.InterfaceC11256e;
import p456rx.schedulers.Schedulers;

/* loaded from: classes.dex */
public class ABTestCenterRepository implements AbTestRepository {
    private AbTestCacheValidator cacheValidator;
    private HashMap<String, ExperimentModel> localCache;
    private RoomExperimentPersistence persistence;
    private ABTestService service;

    public ABTestCenterRepository(ABTestService aBTestService, HashMap<String, ExperimentModel> map, RoomExperimentPersistence roomExperimentPersistence, AbTestCacheValidator abTestCacheValidator) {
        this.service = aBTestService;
        this.localCache = map;
        this.persistence = roomExperimentPersistence;
        this.cacheValidator = abTestCacheValidator;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$cacheExperiment$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6830a(String str, ExperimentModel experimentModel) {
        this.localCache.put(str, experimentModel);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getExperiment$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6831b(String str, ExperimentModel experimentModel) {
        return cacheExperiment(experimentModel, str).m39974b(C11234e.m40025S(experimentModel.getExperiment()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getExperiment$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6832c(String str, ExperimentModel experimentModel) {
        return cacheExperiment(experimentModel, str).m39974b(C11234e.m40025S(experimentModel.getExperiment()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getExperiment$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6833d(final String str, BaseExperiment.ExperimentType experimentType, ExperimentModel experimentModel) {
        if (experimentModel.hasError() || experimentModel.getExperiment().isExpired()) {
            return this.service.getExperiment(str, experimentType).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.e
                @Override // p456rx.p460m.InterfaceC11256e
                public final Object call(Object obj) {
                    return this.f7206f.m6832c(str, (ExperimentModel) obj);
                }
            });
        }
        if (!this.localCache.containsKey(str)) {
            this.localCache.put(str, experimentModel);
        }
        return C11234e.m40025S(experimentModel.getExperiment());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recordAction$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6834e(String str, BaseExperiment.ExperimentType experimentType, Experiment experiment) {
        return this.service.recordAction(str, experiment.getAssignment(), experimentType);
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11231b cacheExperiment(final ExperimentModel experimentModel, final String str) {
        return C11231b.m39952t(new InterfaceC11252a() { // from class: cm.aptoide.pt.abtesting.c
            @Override // p456rx.p460m.InterfaceC11252a
            public final void call() {
                this.f7201f.m6830a(str, experimentModel);
            }
        }).m39973a(this.persistence.save(str, experimentModel.getExperiment()));
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11234e<Experiment> getExperiment(final String str, final BaseExperiment.ExperimentType experimentType) {
        return this.localCache.containsKey(str) ? this.cacheValidator.isExperimentValid(str) ? C11234e.m40025S(this.localCache.get(str).getExperiment()) : this.service.getExperiment(str, experimentType).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.d
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7204f.m6831b(str, (ExperimentModel) obj);
            }
        }) : this.persistence.get(str).m39915A().m40095j0(Schedulers.m40658io()).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.b
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7198f.m6833d(str, experimentType, (ExperimentModel) obj);
            }
        });
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11234e<String> getExperimentId(String str) {
        return C11234e.m40025S(str);
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11234e<Boolean> recordAction(final String str, final BaseExperiment.ExperimentType experimentType) {
        return this.cacheValidator.isCacheValid(str) ? getExperiment(str, null).m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.a
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7195f.m6834e(str, experimentType, (Experiment) obj);
            }
        }) : C11234e.m40025S(Boolean.FALSE);
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11234e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType) {
        return this.cacheValidator.isCacheValid(str) ? this.service.recordImpression(str, experimentType) : C11234e.m40025S(Boolean.FALSE);
    }

    @Override // cm.aptoide.p092pt.abtesting.AbTestRepository
    public C11234e<Boolean> recordAction(String str, int i2, BaseExperiment.ExperimentType experimentType) {
        return recordAction(str, experimentType);
    }
}
