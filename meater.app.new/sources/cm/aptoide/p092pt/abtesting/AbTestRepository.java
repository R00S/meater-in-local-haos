package cm.aptoide.p092pt.abtesting;

import cm.aptoide.p092pt.abtesting.BaseExperiment;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface AbTestRepository {
    C11231b cacheExperiment(ExperimentModel experimentModel, String str);

    C11234e<Experiment> getExperiment(String str, BaseExperiment.ExperimentType experimentType);

    C11234e<String> getExperimentId(String str);

    C11234e<Boolean> recordAction(String str, int i2, BaseExperiment.ExperimentType experimentType);

    C11234e<Boolean> recordAction(String str, BaseExperiment.ExperimentType experimentType);

    C11234e<Boolean> recordImpression(String str, BaseExperiment.ExperimentType experimentType);
}
