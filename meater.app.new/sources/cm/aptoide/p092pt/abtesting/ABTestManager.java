package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.abtesting.BaseExperiment;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class ABTestManager {
    private AbTestRepository abTestRepository;

    public ABTestManager(AbTestRepository abTestRepository) {
        this.abTestRepository = abTestRepository;
    }

    public C11234e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.getExperiment(str, experimentType).m40057E();
    }

    public C11234e<String> getExperimentId(String str) {
        return this.abTestRepository.getExperimentId(str);
    }

    public C11234e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordAction(str, experimentType);
    }

    public C11234e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordImpression(str, experimentType);
    }

    public C11234e<Boolean> recordAction(String str, int i2, BaseExperiment.ExperimentType experimentType) {
        return this.abTestRepository.recordAction(str, i2, experimentType);
    }
}
