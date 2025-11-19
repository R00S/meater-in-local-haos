package I9;

import android.util.Log;
import j9.InterfaceC3755b;
import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;

/* compiled from: EventGDTLogger.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u000eB\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0010¨\u0006\u0012"}, d2 = {"LI9/g;", "LI9/h;", "Lj9/b;", "LK6/j;", "transportFactoryProvider", "<init>", "(Lj9/b;)V", "LI9/z;", "value", "", "c", "(LI9/z;)[B", "sessionEvent", "Loa/F;", "a", "(LI9/z;)V", "Lj9/b;", "b", "com.google.firebase-firebase-sessions"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: I9.g, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1195g implements InterfaceC1196h {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC3755b<K6.j> transportFactoryProvider;

    public C1195g(InterfaceC3755b<K6.j> transportFactoryProvider) {
        C3862t.g(transportFactoryProvider, "transportFactoryProvider");
        this.transportFactoryProvider = transportFactoryProvider;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final byte[] c(SessionEvent value) {
        String strB = A.f6755a.c().b(value);
        C3862t.f(strB, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event Type: " + value.getEventType().name());
        byte[] bytes = strB.getBytes(Ub.d.UTF_8);
        C3862t.f(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override // I9.InterfaceC1196h
    public void a(SessionEvent sessionEvent) {
        C3862t.g(sessionEvent, "sessionEvent");
        this.transportFactoryProvider.get().a("FIREBASE_APPQUALITY_SESSION", SessionEvent.class, K6.c.b("json"), new K6.h() { // from class: I9.f
            @Override // K6.h
            public final Object apply(Object obj) {
                return this.f6862a.c((SessionEvent) obj);
            }
        }).b(K6.d.f(sessionEvent));
    }
}
