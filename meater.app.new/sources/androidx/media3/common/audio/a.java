package androidx.media3.common.audio;

import X1.C1804a;
import androidx.media3.common.audio.AudioProcessor;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;

/* compiled from: AudioProcessingPipeline.java */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC4009y<AudioProcessor> f26045a;

    /* renamed from: b, reason: collision with root package name */
    private final List<AudioProcessor> f26046b = new ArrayList();

    /* renamed from: c, reason: collision with root package name */
    private ByteBuffer[] f26047c = new ByteBuffer[0];

    /* renamed from: d, reason: collision with root package name */
    private AudioProcessor.a f26048d;

    /* renamed from: e, reason: collision with root package name */
    private AudioProcessor.a f26049e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f26050f;

    public a(AbstractC4009y<AudioProcessor> abstractC4009y) {
        this.f26045a = abstractC4009y;
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26048d = aVar;
        this.f26049e = aVar;
        this.f26050f = false;
    }

    private int c() {
        return this.f26047c.length - 1;
    }

    private void g(ByteBuffer byteBuffer) {
        boolean z10;
        for (boolean z11 = true; z11; z11 = z10) {
            z10 = false;
            int i10 = 0;
            while (i10 <= c()) {
                if (!this.f26047c[i10].hasRemaining()) {
                    AudioProcessor audioProcessor = this.f26046b.get(i10);
                    if (!audioProcessor.d()) {
                        ByteBuffer byteBuffer2 = i10 > 0 ? this.f26047c[i10 - 1] : byteBuffer.hasRemaining() ? byteBuffer : AudioProcessor.f26038a;
                        long jRemaining = byteBuffer2.remaining();
                        audioProcessor.f(byteBuffer2);
                        this.f26047c[i10] = audioProcessor.e();
                        z10 |= jRemaining - ((long) byteBuffer2.remaining()) > 0 || this.f26047c[i10].hasRemaining();
                    } else if (!this.f26047c[i10].hasRemaining() && i10 < c()) {
                        this.f26046b.get(i10 + 1).g();
                    }
                }
                i10++;
            }
        }
    }

    public AudioProcessor.a a(AudioProcessor.a aVar) throws AudioProcessor.UnhandledAudioFormatException {
        if (aVar.equals(AudioProcessor.a.f26040e)) {
            throw new AudioProcessor.UnhandledAudioFormatException(aVar);
        }
        for (int i10 = 0; i10 < this.f26045a.size(); i10++) {
            AudioProcessor audioProcessor = this.f26045a.get(i10);
            AudioProcessor.a aVarH = audioProcessor.h(aVar);
            if (audioProcessor.a()) {
                C1804a.g(!aVarH.equals(AudioProcessor.a.f26040e));
                aVar = aVarH;
            }
        }
        this.f26049e = aVar;
        return aVar;
    }

    public void b() {
        this.f26046b.clear();
        this.f26048d = this.f26049e;
        this.f26050f = false;
        for (int i10 = 0; i10 < this.f26045a.size(); i10++) {
            AudioProcessor audioProcessor = this.f26045a.get(i10);
            audioProcessor.flush();
            if (audioProcessor.a()) {
                this.f26046b.add(audioProcessor);
            }
        }
        this.f26047c = new ByteBuffer[this.f26046b.size()];
        for (int i11 = 0; i11 <= c(); i11++) {
            this.f26047c[i11] = this.f26046b.get(i11).e();
        }
    }

    public ByteBuffer d() {
        if (!f()) {
            return AudioProcessor.f26038a;
        }
        ByteBuffer byteBuffer = this.f26047c[c()];
        if (byteBuffer.hasRemaining()) {
            return byteBuffer;
        }
        g(AudioProcessor.f26038a);
        return this.f26047c[c()];
    }

    public boolean e() {
        return this.f26050f && this.f26046b.get(c()).d() && !this.f26047c[c()].hasRemaining();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        if (this.f26045a.size() != aVar.f26045a.size()) {
            return false;
        }
        for (int i10 = 0; i10 < this.f26045a.size(); i10++) {
            if (this.f26045a.get(i10) != aVar.f26045a.get(i10)) {
                return false;
            }
        }
        return true;
    }

    public boolean f() {
        return !this.f26046b.isEmpty();
    }

    public void h() {
        if (!f() || this.f26050f) {
            return;
        }
        this.f26050f = true;
        this.f26046b.get(0).g();
    }

    public int hashCode() {
        return this.f26045a.hashCode();
    }

    public void i(ByteBuffer byteBuffer) {
        if (!f() || this.f26050f) {
            return;
        }
        g(byteBuffer);
    }

    public void j() {
        for (int i10 = 0; i10 < this.f26045a.size(); i10++) {
            AudioProcessor audioProcessor = this.f26045a.get(i10);
            audioProcessor.flush();
            audioProcessor.b();
        }
        this.f26047c = new ByteBuffer[0];
        AudioProcessor.a aVar = AudioProcessor.a.f26040e;
        this.f26048d = aVar;
        this.f26049e = aVar;
        this.f26050f = false;
    }
}
