package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.abtesting.Experiment;
import cm.aptoide.p092pt.database.room.RoomExperiment;

/* loaded from: classes.dex */
public class RoomExperimentMapper {
    public RoomExperiment map(String str, Experiment experiment) {
        return new RoomExperiment(str, experiment.getRequestTime(), experiment.getAssignment(), experiment.getPayload(), experiment.isPartOfExperiment(), experiment.isExperimentOver());
    }

    public Experiment map(RoomExperiment roomExperiment) {
        return new Experiment(roomExperiment.getRequestTime(), roomExperiment.getAssignment(), roomExperiment.getPayload(), roomExperiment.isPartOfExperiment(), roomExperiment.isExperimentOver());
    }
}
