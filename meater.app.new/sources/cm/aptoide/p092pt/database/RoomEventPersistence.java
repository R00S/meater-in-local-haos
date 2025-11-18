package cm.aptoide.p092pt.database;

import cm.aptoide.analytics.implementation.EventsPersistence;
import cm.aptoide.analytics.implementation.data.Event;
import cm.aptoide.p092pt.database.room.EventDAO;
import cm.aptoide.p092pt.database.room.RoomEvent;
import com.fasterxml.jackson.core.JsonProcessingException;
import java.io.IOException;
import java.util.List;
import p319g.p320a.p321a.p322a.C9059d;
import p323h.p324a.AbstractC9064b;
import p323h.p324a.AbstractC9076m;
import p323h.p324a.EnumC9062a;
import p323h.p324a.InterfaceC9066c;
import p323h.p324a.InterfaceC9068e;
import p323h.p324a.InterfaceC9069f;
import p323h.p324a.InterfaceC9079p;
import p323h.p324a.p326b0.C9065a;
import p323h.p324a.p328y.InterfaceC9097e;
import p323h.p324a.p328y.InterfaceC9098f;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public class RoomEventPersistence implements EventsPersistence {
    private final EventDAO eventDAO;
    private final RoomEventMapper mapper;

    public RoomEventPersistence(EventDAO eventDAO, RoomEventMapper roomEventMapper) {
        this.eventDAO = eventDAO;
        this.mapper = roomEventMapper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$getAll$2, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9079p m7392a(List list) throws Exception {
        try {
            return AbstractC9076m.m29195t(this.mapper.map((List<RoomEvent>) list));
        } catch (IOException e2) {
            return AbstractC9076m.m29192h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$3, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9079p m7393b(Event event) throws Exception {
        try {
            return AbstractC9076m.m29195t(this.mapper.map(event));
        } catch (JsonProcessingException e2) {
            return AbstractC9076m.m29192h(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$remove$4, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7394c(RoomEvent roomEvent) throws Exception {
        this.eventDAO.delete(roomEvent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$0, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void m7395d(Event event, InterfaceC9066c interfaceC9066c) throws Exception {
        try {
            this.eventDAO.insert(this.mapper.map(event));
            interfaceC9066c.mo29169a();
        } catch (JsonProcessingException e2) {
            interfaceC9066c.onError(e2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: lambda$save$1, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ InterfaceC9069f m7396e(Event event) throws Exception {
        return C9059d.m29127e(save(event));
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11234e<List<Event>> getAll() {
        return C9059d.m29124b(this.eventDAO.getAll().m29215y(C9065a.m29163b()).m29202j(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.s
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return this.f8463f.m7392a((List) obj);
            }
        }), EnumC9062a.BUFFER);
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11231b remove(List<Event> list) {
        return C9059d.m29123a(AbstractC9076m.m29194s(list).m29202j(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.v
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return this.f8472f.m7393b((Event) obj);
            }
        }).m29215y(C9065a.m29163b()).m29201f(new InterfaceC9097e() { // from class: cm.aptoide.pt.database.t
            @Override // p323h.p324a.p328y.InterfaceC9097e
            /* renamed from: a */
            public final void mo7420a(Object obj) throws Exception {
                this.f8466a.m7394c((RoomEvent) obj);
            }
        }).m29196A().m29230e());
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11231b save(final Event event) {
        return C9059d.m29123a(AbstractC9064b.m29157c(new InterfaceC9068e() { // from class: cm.aptoide.pt.database.u
            @Override // p323h.p324a.InterfaceC9068e
            /* renamed from: a */
            public final void mo7421a(InterfaceC9066c interfaceC9066c) throws Exception {
                this.f8468a.m7395d(event, interfaceC9066c);
            }
        }).m29161f(C9065a.m29163b()));
    }

    @Override // cm.aptoide.analytics.implementation.EventsPersistence
    public C11231b save(List<Event> list) {
        return C9059d.m29123a(AbstractC9076m.m29194s(list).m29206n(new InterfaceC9098f() { // from class: cm.aptoide.pt.database.w
            @Override // p323h.p324a.p328y.InterfaceC9098f
            /* renamed from: a */
            public final Object mo4660a(Object obj) {
                return this.f8475f.m7396e((Event) obj);
            }
        }));
    }
}
