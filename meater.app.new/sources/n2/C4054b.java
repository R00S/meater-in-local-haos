package n2;

import U1.InterfaceC1734j;
import X1.C1804a;
import android.net.Uri;
import androidx.media3.exoplayer.source.UnrecognizedInputFormatException;
import java.io.EOFException;
import java.util.List;
import java.util.Map;
import l8.C3915h;
import l8.InterfaceC3914g;
import m8.AbstractC4009y;
import m8.H;
import v2.C4803i;
import v2.I;
import v2.InterfaceC4810p;
import v2.InterfaceC4811q;

/* compiled from: BundledExtractorsAdapter.java */
/* renamed from: n2.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4054b implements androidx.media3.exoplayer.source.w {

    /* renamed from: a, reason: collision with root package name */
    private final v2.u f45608a;

    /* renamed from: b, reason: collision with root package name */
    private InterfaceC4810p f45609b;

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC4811q f45610c;

    public C4054b(v2.u uVar) {
        this.f45608a = uVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ String h(InterfaceC4810p interfaceC4810p) {
        return interfaceC4810p.e().getClass().getSimpleName();
    }

    @Override // androidx.media3.exoplayer.source.w
    public void b(long j10, long j11) {
        ((InterfaceC4810p) C1804a.e(this.f45609b)).b(j10, j11);
    }

    @Override // androidx.media3.exoplayer.source.w
    public void c() {
        InterfaceC4810p interfaceC4810p = this.f45609b;
        if (interfaceC4810p != null) {
            interfaceC4810p.c();
            this.f45609b = null;
        }
        this.f45610c = null;
    }

    @Override // androidx.media3.exoplayer.source.w
    public int d(I i10) {
        return ((InterfaceC4810p) C1804a.e(this.f45609b)).i((InterfaceC4811q) C1804a.e(this.f45610c), i10);
    }

    @Override // androidx.media3.exoplayer.source.w
    public long e() {
        InterfaceC4811q interfaceC4811q = this.f45610c;
        if (interfaceC4811q != null) {
            return interfaceC4811q.getPosition();
        }
        return -1L;
    }

    @Override // androidx.media3.exoplayer.source.w
    public void f() {
        InterfaceC4810p interfaceC4810p = this.f45609b;
        if (interfaceC4810p == null) {
            return;
        }
        InterfaceC4810p interfaceC4810pE = interfaceC4810p.e();
        if (interfaceC4810pE instanceof O2.f) {
            ((O2.f) interfaceC4810pE).m();
        }
    }

    @Override // androidx.media3.exoplayer.source.w
    public void g(InterfaceC1734j interfaceC1734j, Uri uri, Map<String, List<String>> map, long j10, long j11, v2.r rVar) throws UnrecognizedInputFormatException {
        C4803i c4803i = new C4803i(interfaceC1734j, j10, j11);
        this.f45610c = c4803i;
        if (this.f45609b != null) {
            return;
        }
        InterfaceC4810p[] interfaceC4810pArrF = this.f45608a.f(uri, map);
        AbstractC4009y.a aVarZ = AbstractC4009y.z(interfaceC4810pArrF.length);
        if (interfaceC4810pArrF.length == 1) {
            this.f45609b = interfaceC4810pArrF[0];
        } else {
            int length = interfaceC4810pArrF.length;
            int i10 = 0;
            while (true) {
                if (i10 >= length) {
                    break;
                }
                InterfaceC4810p interfaceC4810p = interfaceC4810pArrF[i10];
                try {
                } catch (EOFException unused) {
                    if (this.f45609b != null || c4803i.getPosition() == j10) {
                    }
                } catch (Throwable th) {
                    C1804a.g(this.f45609b != null || c4803i.getPosition() == j10);
                    c4803i.m();
                    throw th;
                }
                if (interfaceC4810p.d(c4803i)) {
                    this.f45609b = interfaceC4810p;
                    C1804a.g(true);
                    c4803i.m();
                    break;
                } else {
                    aVarZ.j(interfaceC4810p.j());
                    boolean z10 = this.f45609b != null || c4803i.getPosition() == j10;
                    C1804a.g(z10);
                    c4803i.m();
                    i10++;
                }
            }
            if (this.f45609b == null) {
                throw new UnrecognizedInputFormatException("None of the available extractors (" + C3915h.h(", ").d(H.l(AbstractC4009y.D(interfaceC4810pArrF), new InterfaceC3914g() { // from class: n2.a
                    @Override // l8.InterfaceC3914g
                    public final Object apply(Object obj) {
                        return C4054b.h((InterfaceC4810p) obj);
                    }
                })) + ") could read the stream.", (Uri) C1804a.e(uri), aVarZ.k());
            }
        }
        this.f45609b.h(rVar);
    }
}
