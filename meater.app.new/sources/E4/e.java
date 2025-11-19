package E4;

import Ub.n;
import android.widget.Toast;
import com.apptionlabs.meater_app.data.Config;
import java.io.IOException;
import java.nio.ByteBuffer;
import kotlin.Metadata;
import kotlin.jvm.internal.C3854k;
import kotlin.jvm.internal.C3862t;
import nd.s;
import oc.E;

/* compiled from: FirmwareDownloadHelper.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"LE4/e;", "", "a", "b", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* compiled from: FirmwareDownloadHelper.kt */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ!\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006H\u0002¢\u0006\u0004\b\u000b\u0010\nJ\u001d\u0010\f\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"LE4/e$a;", "", "<init>", "()V", "", "url", "LE4/e$b;", "firmwareDownloaderCallback", "Loa/F;", "b", "(Ljava/lang/String;LE4/e$b;)V", "d", "c", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* renamed from: E4.e$a, reason: from kotlin metadata */
    public static final class Companion {

        /* compiled from: FirmwareDownloadHelper.kt */
        @Metadata(d1 = {"\u0000)\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J+\u0010\b\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tJ%\u0010\f\u001a\u00020\u00072\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u00032\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"E4/e$a$a", "Lnd/d;", "Loc/E;", "Lnd/b;", "call", "Lnd/s;", "response", "Loa/F;", "onResponse", "(Lnd/b;Lnd/s;)V", "", "t", "onFailure", "(Lnd/b;Ljava/lang/Throwable;)V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* renamed from: E4.e$a$a, reason: collision with other inner class name */
        public static final class C0066a implements nd.d<E> {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ String f3873a;

            /* renamed from: b, reason: collision with root package name */
            final /* synthetic */ b f3874b;

            C0066a(String str, b bVar) {
                this.f3873a = str;
                this.f3874b = bVar;
            }

            @Override // nd.d
            public void onFailure(nd.b<E> call, Throwable t10) {
                C3862t.g(call, "call");
                C3862t.g(t10, "t");
                e.INSTANCE.d(this.f3873a, this.f3874b);
            }

            @Override // nd.d
            public void onResponse(nd.b<E> call, s<E> response) throws NumberFormatException {
                byte[] bArrA;
                C3862t.g(call, "call");
                C3862t.g(response, "response");
                if (!response.f()) {
                    e.INSTANCE.d(this.f3873a, this.f3874b);
                    return;
                }
                String strC = response.e().c("Content-Length");
                if (strC != null) {
                    if (n.U0(strC).toString().length() <= 0) {
                        strC = null;
                    }
                    if (strC != null) {
                        String str = this.f3873a;
                        b bVar = this.f3874b;
                        long j10 = Long.parseLong(strC);
                        try {
                            E eA = response.a();
                            C3862t.d(eA);
                            bArrA = eA.a();
                        } catch (IOException e10) {
                            e10.printStackTrace();
                            e.INSTANCE.d(str, bVar);
                            bArrA = null;
                        }
                        U4.b.m("Content-Length", Long.valueOf(j10));
                        U4.b.m("FW byte length", bArrA != null ? Integer.valueOf(bArrA.length) : null);
                        if (bArrA != null && j10 == bArrA.length) {
                            bVar.b(ByteBuffer.wrap(bArrA));
                        } else {
                            U4.b.m("Firmware image length doesn't match http Content-Length", new Object[0]);
                            bVar.a();
                        }
                    }
                }
            }
        }

        public /* synthetic */ Companion(C3854k c3854k) {
            this();
        }

        private final void b(String url, b firmwareDownloaderCallback) {
            F5.a aVarG = x4.f.g(x4.f.f52783a, false, null, 3, null);
            nd.b<E> bVarB = aVarG != null ? aVarG.B(url) : null;
            if (bVarB != null) {
                bVarB.enqueue(new C0066a(url, firmwareDownloaderCallback));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void d(String url, b firmwareDownloaderCallback) {
            if (Config.INSTANCE.getInstance().EXTRA_LOGGING_ENABLE) {
                Toast.makeText(x4.g.h(), "Firmware failed to download from =" + url, 1).show();
            }
            if (firmwareDownloaderCallback != null) {
                firmwareDownloaderCallback.a();
            }
        }

        public final void c(String url, b firmwareDownloaderCallback) {
            C3862t.g(url, "url");
            C3862t.g(firmwareDownloaderCallback, "firmwareDownloaderCallback");
            U4.b.m("Firmware downloading ", url);
            b(url, firmwareDownloaderCallback);
        }

        private Companion() {
        }
    }

    /* compiled from: FirmwareDownloadHelper.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\bf\u0018\u00002\u00020\u0001J\u0019\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\u0007\u001a\u00020\u0004H&¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LE4/e$b;", "", "Ljava/nio/ByteBuffer;", "firmwareImage", "Loa/F;", "b", "(Ljava/nio/ByteBuffer;)V", "a", "()V", "app_playstoreLiveRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface b {
        void a();

        void b(ByteBuffer firmwareImage);
    }
}
