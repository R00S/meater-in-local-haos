package cm.aptoide.p092pt.database;

import cm.aptoide.p092pt.abtesting.Experiment;
import cm.aptoide.p092pt.abtesting.ExperimentModel;
import cm.aptoide.p092pt.abtesting.ExperimentPersistence;
import cm.aptoide.p092pt.database.room.ExperimentDAO;
import cm.aptoide.p092pt.database.room.RoomExperiment;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9082s;
import p323h.p324a.InterfaceC9066c;
import p323h.p324a.InterfaceC9068e;
import p323h.p324a.InterfaceC9086w;
import p323h.p324a.p326b0.C9065a;
import p323h.p324a.p328y.InterfaceC9098f;
import p456rx.C11231b;
import p456rx.Single;
import p456rx.p460m.InterfaceC11253b;
import p456rx.p460m.InterfaceC11256e;

/* loaded from: classes.dex */
public class RoomExperimentPersistence implements ExperimentPersistence {
    private final ExperimentDAO experimentDAO;
    private final RoomExperimentMapper mapper;

    public RoomExperimentPersistence(ExperimentDAO experimentDAO, RoomExperimentMapper roomExperimentMapper) {
        this.experimentDAO = experimentDAO;
        this.mapper = roomExperimentMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$get$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9086w m7397a(RoomExperiment roomExperiment) throws Exception {
        return AbstractC9082s.m29227f(new ExperimentModel(this.mapper.map(roomExperiment), false));
    }

    static /* synthetic */ ExperimentModel lambda$get$2(Throwable th) {
        return new ExperimentModel(new Experiment(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7398b(String str, Experiment experiment, InterfaceC9066c interfaceC9066c) throws Exception {
        this.experimentDAO.save(this.mapper.map(str, experiment));
        interfaceC9066c.mo29169a();
    }

    @Override // cm.aptoide.p092pt.abtesting.ExperimentPersistence
    public Single<ExperimentModel> get(String str) {
        return C9059d.m29126d(this.experimentDAO.get(str).m29232i(C9065a.m29163b()).m29229d(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.z
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return this.f8485f.m7397a((RoomExperiment) obj);
            }
        })).m39926r(new InterfaceC11256e() { // from class: cm.aptoide.pt.database.x
            @Override // p456rx.p460m.InterfaceC11256e
            public final Object call(Object obj) {
                return RoomExperimentPersistence.lambda$get$2((Throwable) obj);
            }
        }).m39917e(new InterfaceC11253b() { // from class: cm.aptoide.pt.database.o1
            @Override // p456rx.p460m.InterfaceC11253b
            public final void call(Object obj) {
                ((Throwable) obj).printStackTrace();
            }
        });
    }

    @Override // cm.aptoide.p092pt.abtesting.ExperimentPersistence
    public C11231b save(final String str, final Experiment experiment) {
        return C9059d.m29123a(AbstractC9064b.m29157c(new InterfaceC9068e() { // from class: cm.aptoide.pt.database.y
            @Override // p323h.p324a.InterfaceC9068e
            /* renamed from: a */
            public final void mo7421a(InterfaceC9066c interfaceC9066c) throws Exception {
                this.f8481a.m7398b(str, experiment, interfaceC9066c);
            }
        }).m29161f(C9065a.m29163b()));
    }
}
