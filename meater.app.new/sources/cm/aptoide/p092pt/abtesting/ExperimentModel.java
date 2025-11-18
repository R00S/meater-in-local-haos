package cm.aptoide.p092pt.abtesting;

/* loaded from: classes.dex */
public class ExperimentModel {
    private Experiment experiment;
    private boolean hasError;

    public ExperimentModel(Experiment experiment, boolean z) {
        this.experiment = experiment;
        this.hasError = z;
    }

    public Experiment getExperiment() {
        return this.experiment;
    }

    public boolean hasError() {
        return this.hasError;
    }
}
