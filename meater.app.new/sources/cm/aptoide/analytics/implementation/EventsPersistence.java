package cm.aptoide.analytics.implementation;

import cm.aptoide.analytics.implementation.data.Event;
import java.util.List;
import p456rx.C11231b;
import p456rx.C11234e;

/* loaded from: classes.dex */
public interface EventsPersistence {
    C11234e<List<Event>> getAll();

    C11231b remove(List<Event> list);

    C11231b save(Event event);

    C11231b save(List<Event> list);
}
