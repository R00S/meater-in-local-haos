package k2;

import X1.C1804a;
import android.media.LoudnessCodecController;
import android.media.LoudnessCodecController$OnLoudnessCodecUpdateListener;
import android.media.MediaCodec;
import android.os.Bundle;
import java.util.HashSet;
import java.util.Iterator;
import k2.h;

/* compiled from: LoudnessCodecController.java */
/* loaded from: classes.dex */
public final class h {

    /* renamed from: a, reason: collision with root package name */
    private final HashSet<MediaCodec> f43736a;

    /* renamed from: b, reason: collision with root package name */
    private final b f43737b;

    /* renamed from: c, reason: collision with root package name */
    private LoudnessCodecController f43738c;

    /* compiled from: LoudnessCodecController.java */
    class a implements LoudnessCodecController$OnLoudnessCodecUpdateListener {
        a() {
        }

        public Bundle onLoudnessCodecUpdate(MediaCodec mediaCodec, Bundle bundle) {
            return h.this.f43737b.a(bundle);
        }
    }

    public h() {
        this(b.f43740a);
    }

    public void b(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = this.f43738c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            C1804a.g(this.f43736a.add(mediaCodec));
        }
    }

    public void c() {
        this.f43736a.clear();
        LoudnessCodecController loudnessCodecController = this.f43738c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
        }
    }

    public void d(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!this.f43736a.remove(mediaCodec) || (loudnessCodecController = this.f43738c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void e(int i10) {
        LoudnessCodecController loudnessCodecController = this.f43738c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.f43738c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i10, com.google.common.util.concurrent.g.a(), new a());
        this.f43738c = loudnessCodecControllerCreate;
        Iterator<MediaCodec> it = this.f43736a.iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec(it.next())) {
                it.remove();
            }
        }
    }

    public h(b bVar) {
        this.f43736a = new HashSet<>();
        this.f43737b = bVar;
    }

    /* compiled from: LoudnessCodecController.java */
    public interface b {

        /* renamed from: a, reason: collision with root package name */
        public static final b f43740a = new b() { // from class: k2.i
            @Override // k2.h.b
            public final Bundle a(Bundle bundle) {
                return h.b.b(bundle);
            }
        };

        Bundle a(Bundle bundle);

        /* JADX INFO: Access modifiers changed from: private */
        static /* synthetic */ Bundle b(Bundle bundle) {
            return bundle;
        }
    }
}
