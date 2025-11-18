package p241e.p254e.p256b.p257a.p258i;

import android.content.Context;
import java.io.Closeable;
import java.io.IOException;
import javax.inject.Singleton;
import p241e.p254e.p256b.p257a.p258i.p260b0.p261j.InterfaceC8825j0;

/* compiled from: TransportRuntimeComponent.java */
@Singleton
/* renamed from: e.e.b.a.i.v */
/* loaded from: classes2.dex */
abstract class AbstractC8879v implements Closeable {

    /* compiled from: TransportRuntimeComponent.java */
    /* renamed from: e.e.b.a.i.v$a */
    interface a {
        /* renamed from: a */
        a mo28145a(Context context);

        /* renamed from: c */
        AbstractC8879v mo28147c();
    }

    AbstractC8879v() {
    }

    /* renamed from: a */
    abstract InterfaceC8825j0 mo28143a();

    /* renamed from: b */
    abstract C8878u mo28144b();

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        mo28143a().close();
    }
}
