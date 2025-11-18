package com.google.android.gms.internal.ads;

import java.io.Closeable;
import java.io.EOFException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

/* loaded from: classes2.dex */
public class zzdsu implements zzbe, Closeable, Iterator<zzbd> {

    /* renamed from: f */
    private static final zzbd f25956f = new C6727gy("eof ");

    /* renamed from: g */
    private static zzdtc f25957g = zzdtc.m19860b(zzdsu.class);

    /* renamed from: h */
    protected zzba f25958h;

    /* renamed from: i */
    protected zzdsw f25959i;

    /* renamed from: j */
    private zzbd f25960j = null;

    /* renamed from: k */
    long f25961k = 0;

    /* renamed from: l */
    long f25962l = 0;

    /* renamed from: m */
    long f25963m = 0;

    /* renamed from: n */
    private List<zzbd> f25964n = new ArrayList();

    /* JADX INFO: Access modifiers changed from: private */
    @Override // java.util.Iterator
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final zzbd next() {
        zzbd zzbdVarMo17211a;
        zzbd zzbdVar = this.f25960j;
        if (zzbdVar != null && zzbdVar != f25956f) {
            this.f25960j = null;
            return zzbdVar;
        }
        zzdsw zzdswVar = this.f25959i;
        if (zzdswVar == null || this.f25961k >= this.f25963m) {
            this.f25960j = f25956f;
            throw new NoSuchElementException();
        }
        try {
            synchronized (zzdswVar) {
                this.f25959i.mo15978d1(this.f25961k);
                zzbdVarMo17211a = this.f25958h.mo17211a(this.f25959i, this);
                this.f25961k = this.f25959i.mo15979k0();
            }
            return zzbdVarMo17211a;
        } catch (EOFException unused) {
            throw new NoSuchElementException();
        } catch (IOException unused2) {
            throw new NoSuchElementException();
        }
    }

    public void close() throws IOException {
        this.f25959i.close();
    }

    /* renamed from: d */
    public void mo19853d(zzdsw zzdswVar, long j2, zzba zzbaVar) throws IOException {
        this.f25959i = zzdswVar;
        long jMo15979k0 = zzdswVar.mo15979k0();
        this.f25962l = jMo15979k0;
        this.f25961k = jMo15979k0;
        zzdswVar.mo15978d1(zzdswVar.mo15979k0() + j2);
        this.f25963m = zzdswVar.mo15979k0();
        this.f25958h = zzbaVar;
    }

    /* renamed from: e */
    public final List<zzbd> m19857e() {
        return (this.f25959i == null || this.f25960j == f25956f) ? this.f25964n : new zzdta(this.f25964n, this);
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        zzbd zzbdVar = this.f25960j;
        if (zzbdVar == f25956f) {
            return false;
        }
        if (zzbdVar != null) {
            return true;
        }
        try {
            this.f25960j = (zzbd) next();
            return true;
        } catch (NoSuchElementException unused) {
            this.f25960j = f25956f;
            return false;
        }
    }

    @Override // java.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append("[");
        for (int i2 = 0; i2 < this.f25964n.size(); i2++) {
            if (i2 > 0) {
                sb.append(";");
            }
            sb.append(this.f25964n.get(i2).toString());
        }
        sb.append("]");
        return sb.toString();
    }
}
