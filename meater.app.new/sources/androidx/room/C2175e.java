package androidx.room;

import kotlin.Metadata;
import kotlin.jvm.internal.C3862t;
import u3.InterfaceC4670h;

/* compiled from: AutoClosingRoomOpenHelperFactory.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u0017\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0002\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000e¨\u0006\u000f"}, d2 = {"Landroidx/room/e;", "Lu3/h$c;", "delegate", "Landroidx/room/c;", "autoCloser", "<init>", "(Lu3/h$c;Landroidx/room/c;)V", "Lu3/h$b;", "configuration", "Landroidx/room/d;", "b", "(Lu3/h$b;)Landroidx/room/d;", "a", "Lu3/h$c;", "Landroidx/room/c;", "room-runtime_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.room.e, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2175e implements InterfaceC4670h.c {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    private final InterfaceC4670h.c delegate;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    private final C2173c autoCloser;

    public C2175e(InterfaceC4670h.c delegate, C2173c autoCloser) {
        C3862t.g(delegate, "delegate");
        C3862t.g(autoCloser, "autoCloser");
        this.delegate = delegate;
        this.autoCloser = autoCloser;
    }

    @Override // u3.InterfaceC4670h.c
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public C2174d a(InterfaceC4670h.b configuration) {
        C3862t.g(configuration, "configuration");
        return new C2174d(this.delegate.a(configuration), this.autoCloser);
    }
}
