package d2;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import androidx.media3.exoplayer.audio.AudioSink;
import androidx.media3.exoplayer.audio.DefaultAudioSink;
import androidx.media3.exoplayer.mediacodec.h;
import androidx.media3.exoplayer.t0;
import com.apptionlabs.meater_app.data.Config;
import j2.C3735e;
import j2.InterfaceC3733c;
import java.util.ArrayList;
import l2.C3896c;
import l2.InterfaceC3895b;
import p2.C4202i;
import p2.InterfaceC4201h;

/* compiled from: DefaultRenderersFactory.java */
/* renamed from: d2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C3032d implements H {

    /* renamed from: a, reason: collision with root package name */
    private final Context f39708a;

    /* renamed from: b, reason: collision with root package name */
    private final androidx.media3.exoplayer.mediacodec.g f39709b;

    /* renamed from: e, reason: collision with root package name */
    private boolean f39712e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f39714g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f39715h;

    /* renamed from: c, reason: collision with root package name */
    private int f39710c = 0;

    /* renamed from: d, reason: collision with root package name */
    private long f39711d = Config.MC_BROADCAST_INTERVAL_WIFI;

    /* renamed from: f, reason: collision with root package name */
    private androidx.media3.exoplayer.mediacodec.l f39713f = androidx.media3.exoplayer.mediacodec.l.f27407a;

    public C3032d(Context context) {
        this.f39708a = context;
        this.f39709b = new androidx.media3.exoplayer.mediacodec.g(context);
    }

    @Override // d2.H
    public t0[] a(Handler handler, androidx.media3.exoplayer.video.j jVar, androidx.media3.exoplayer.audio.e eVar, InterfaceC4201h interfaceC4201h, InterfaceC3895b interfaceC3895b) throws NoSuchMethodException, SecurityException {
        ArrayList<t0> arrayList = new ArrayList<>();
        i(this.f39708a, this.f39710c, this.f39713f, this.f39712e, handler, jVar, this.f39711d, arrayList);
        AudioSink audioSinkC = c(this.f39708a, this.f39714g, this.f39715h);
        if (audioSinkC != null) {
            b(this.f39708a, this.f39710c, this.f39713f, this.f39712e, audioSinkC, handler, eVar, arrayList);
        }
        h(this.f39708a, interfaceC4201h, handler.getLooper(), this.f39710c, arrayList);
        f(this.f39708a, interfaceC3895b, handler.getLooper(), this.f39710c, arrayList);
        d(this.f39708a, this.f39710c, arrayList);
        e(arrayList);
        g(this.f39708a, handler, this.f39710c, arrayList);
        return (t0[]) arrayList.toArray(new t0[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(14:26|30|62|31|32|(2:75|33)|72|41|42|64|43|80|51|56) */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void b(android.content.Context r17, int r18, androidx.media3.exoplayer.mediacodec.l r19, boolean r20, androidx.media3.exoplayer.audio.AudioSink r21, android.os.Handler r22, androidx.media3.exoplayer.audio.e r23, java.util.ArrayList<androidx.media3.exoplayer.t0> r24) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C3032d.b(android.content.Context, int, androidx.media3.exoplayer.mediacodec.l, boolean, androidx.media3.exoplayer.audio.AudioSink, android.os.Handler, androidx.media3.exoplayer.audio.e, java.util.ArrayList):void");
    }

    protected AudioSink c(Context context, boolean z10, boolean z11) {
        return new DefaultAudioSink.g(context).l(z10).k(z11).j();
    }

    protected void d(Context context, int i10, ArrayList<t0> arrayList) {
        arrayList.add(new u2.b());
    }

    protected void e(ArrayList<t0> arrayList) {
        arrayList.add(new C3735e(k(), null));
    }

    protected void f(Context context, InterfaceC3895b interfaceC3895b, Looper looper, int i10, ArrayList<t0> arrayList) {
        arrayList.add(new C3896c(interfaceC3895b, looper));
    }

    protected void h(Context context, InterfaceC4201h interfaceC4201h, Looper looper, int i10, ArrayList<t0> arrayList) {
        arrayList.add(new C4202i(interfaceC4201h, looper));
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:5|(1:7)|8|56|9|10|(8:46|11|12|54|13|14|52|15)|50|26|27|48|28|58|36|41) */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00b9, code lost:
    
        r3 = r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00c3, code lost:
    
        r4 = r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void i(android.content.Context r19, int r20, androidx.media3.exoplayer.mediacodec.l r21, boolean r22, android.os.Handler r23, androidx.media3.exoplayer.video.j r24, long r25, java.util.ArrayList<androidx.media3.exoplayer.t0> r27) throws java.lang.NoSuchMethodException, java.lang.SecurityException {
        /*
            Method dump skipped, instructions count: 251
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: d2.C3032d.i(android.content.Context, int, androidx.media3.exoplayer.mediacodec.l, boolean, android.os.Handler, androidx.media3.exoplayer.video.j, long, java.util.ArrayList):void");
    }

    protected h.b j() {
        return this.f39709b;
    }

    protected InterfaceC3733c.a k() {
        return InterfaceC3733c.a.f43479a;
    }

    public final C3032d l(boolean z10) {
        this.f39712e = z10;
        return this;
    }

    public final C3032d m(int i10) {
        this.f39710c = i10;
        return this;
    }

    protected void g(Context context, Handler handler, int i10, ArrayList<t0> arrayList) {
    }
}
