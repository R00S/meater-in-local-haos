package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.abtesting.BaseExperiment;
import cm.aptoide.p092pt.logger.Logger;
import cm.aptoide.p092pt.networking.IdsRepository;
import p456rx.AbstractC11243h;
import p456rx.C11234e;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;
import retrofit2.Response;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/* loaded from: classes.dex */
public class ABTestService {
    private static final String EXPERIMENT_DRAFT = "EXPERIMENT_IN_DRAFT_STATE";
    private static final String EXPERIMENT_NOT_FOUND = "EXPERIMENT_NOT_FOUND";
    private static final String EXPERIMENT_OVER = "EXPERIMENT_EXPIRED";
    private static final String EXPERIMENT_PAUSED = "EXPERIMENT_PAUSED";
    private static final String IMPRESSION = "IMPRESSION";
    private final ABTestServiceProvider abTestServiceProvider;
    private final IdsRepository idsRepository;
    private final AbstractC11243h scheduler;

    public interface ABTestingService {
        @GET("assignments/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C11234e<ABTestImpressionResponse> getExperiment(@Path("experimentName") String str, @Path("aptoideId") String str2);

        @POST("events/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C11234e<Response<Void>> recordAction(@Path("experimentName") String str, @Path("aptoideId") String str2, @Body ABTestRequestBody aBTestRequestBody);

        @POST("events/applications/Vanilla/experiments/{experimentName}/users/{aptoideId}")
        C11234e<Response<Void>> recordImpression(@Path("experimentName") String str, @Path("aptoideId") String str2, @Body ABTestRequestBody aBTestRequestBody);
    }

    public ABTestService(ABTestServiceProvider aBTestServiceProvider, IdsRepository idsRepository, AbstractC11243h abstractC11243h) {
        this.abTestServiceProvider = aBTestServiceProvider;
        this.idsRepository = idsRepository;
        this.scheduler = abstractC11243h;
    }

    private C11234e<String> getAptoideId() {
        return this.idsRepository.getUniqueIdentifier().m39915A();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getExperiment$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6835a(BaseExperiment.ExperimentType experimentType, String str, String str2) {
        return this.abTestServiceProvider.getService(experimentType).getExperiment(str, str2).m40065I0(this.scheduler);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getExperiment$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ ExperimentModel m6836b(ABTestImpressionResponse aBTestImpressionResponse) {
        return mapToExperimentModel(aBTestImpressionResponse, false);
    }

    static /* synthetic */ ExperimentModel lambda$getExperiment$2(Throwable th) {
        return new ExperimentModel(new Experiment(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recordAction$7, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6837c(BaseExperiment.ExperimentType experimentType, String str, String str2, String str3) {
        return this.abTestServiceProvider.getService(experimentType).recordAction(str, str3, new ABTestRequestBody(str2));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recordAction$8, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6838d(Response response) {
        Logger.getInstance().m8273d(getClass().getName(), "response : " + response.isSuccessful());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recordImpression$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ C11234e m6839e(BaseExperiment.ExperimentType experimentType, String str, String str2) {
        return this.abTestServiceProvider.getService(experimentType).recordImpression(str, str2, new ABTestRequestBody(IMPRESSION));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$recordImpression$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m6840f(Response response) {
        Logger.getInstance().m8273d(getClass().getName(), "response : " + response.isSuccessful());
    }

    private boolean mapExperimentStatus(ABTestImpressionResponse aBTestImpressionResponse) {
        return aBTestImpressionResponse.getStatus().equals(EXPERIMENT_OVER) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_PAUSED) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_NOT_FOUND) || aBTestImpressionResponse.getStatus().equals(EXPERIMENT_DRAFT);
    }

    private ExperimentModel mapToExperimentModel(ABTestImpressionResponse aBTestImpressionResponse, boolean z) {
        return new ExperimentModel(new Experiment(System.currentTimeMillis(), aBTestImpressionResponse.getPayload(), aBTestImpressionResponse.getAssignment(), mapExperimentStatus(aBTestImpressionResponse)), z);
    }

    public C11234e<ExperimentModel> getExperiment(final String str, final BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.g
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7209f.m6835a(experimentType, str, (String) obj);
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.o
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7224f.m6836b((ABTestImpressionResponse) obj);
            }
        }).m40105p0(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.h
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return ABTestService.lambda$getExperiment$2((Throwable) obj);
            }
        });
    }

    public C11234e<Boolean> recordAction(final String str, final String str2, final BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.l
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7218f.m6837c(experimentType, str, str2, (String) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.abtesting.f
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7208f.m6838d((Response) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.abtesting.j
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.p
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        });
    }

    public C11234e<Boolean> recordImpression(final String str, final BaseExperiment.ExperimentType experimentType) {
        return getAptoideId().m40060G(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.i
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return this.f7213f.m6839e(experimentType, str, (String) obj);
            }
        }).m40119x(new InterfaceC11253b() { // from class: cm.aptoide.pt.abtesting.m
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                this.f7222f.m6840f((Response) obj);
            }
        }).m40117w(new InterfaceC11253b() { // from class: cm.aptoide.pt.abtesting.n
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        }).m40082X(new InterfaceC11256e() { // from class: cm.aptoide.pt.abtesting.k
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return Boolean.TRUE;
            }
        });
    }
}
