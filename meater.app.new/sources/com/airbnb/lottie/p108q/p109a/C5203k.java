package com.airbnb.lottie.p108q.p109a;

import android.annotation.TargetApi;
import android.graphics.Path;
import android.os.Build;
import com.airbnb.lottie.p112s.p114j.C5258h;
import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

/* compiled from: MergePathsContent.java */
@TargetApi(19)
/* renamed from: com.airbnb.lottie.q.a.k */
/* loaded from: classes.dex */
public class C5203k implements InterfaceC5204l, InterfaceC5201i {

    /* renamed from: d */
    private final String f12555d;

    /* renamed from: f */
    private final C5258h f12557f;

    /* renamed from: a */
    private final Path f12552a = new Path();

    /* renamed from: b */
    private final Path f12553b = new Path();

    /* renamed from: c */
    private final Path f12554c = new Path();

    /* renamed from: e */
    private final List<InterfaceC5204l> f12556e = new ArrayList();

    /* compiled from: MergePathsContent.java */
    /* renamed from: com.airbnb.lottie.q.a.k$a */
    static /* synthetic */ class a {

        /* renamed from: a */
        static final /* synthetic */ int[] f12558a;

        static {
            int[] iArr = new int[C5258h.a.values().length];
            f12558a = iArr;
            try {
                iArr[C5258h.a.Merge.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12558a[C5258h.a.Add.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12558a[C5258h.a.Subtract.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f12558a[C5258h.a.Intersect.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f12558a[C5258h.a.ExcludeIntersections.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    public C5203k(C5258h c5258h) {
        if (Build.VERSION.SDK_INT < 19) {
            throw new IllegalStateException("Merge paths are not supported pre-KitKat.");
        }
        this.f12555d = c5258h.m9659c();
        this.f12557f = c5258h;
    }

    /* renamed from: a */
    private void m9533a() {
        for (int i2 = 0; i2 < this.f12556e.size(); i2++) {
            this.f12554c.addPath(this.f12556e.get(i2).mo9522g());
        }
    }

    @TargetApi(19)
    /* renamed from: c */
    private void m9534c(Path.Op op) {
        this.f12553b.reset();
        this.f12552a.reset();
        for (int size = this.f12556e.size() - 1; size >= 1; size--) {
            InterfaceC5204l interfaceC5204l = this.f12556e.get(size);
            if (interfaceC5204l instanceof C5195c) {
                C5195c c5195c = (C5195c) interfaceC5204l;
                List<InterfaceC5204l> listM9523j = c5195c.m9523j();
                for (int size2 = listM9523j.size() - 1; size2 >= 0; size2--) {
                    Path pathMo9522g = listM9523j.get(size2).mo9522g();
                    pathMo9522g.transform(c5195c.m9524k());
                    this.f12553b.addPath(pathMo9522g);
                }
            } else {
                this.f12553b.addPath(interfaceC5204l.mo9522g());
            }
        }
        InterfaceC5204l interfaceC5204l2 = this.f12556e.get(0);
        if (interfaceC5204l2 instanceof C5195c) {
            C5195c c5195c2 = (C5195c) interfaceC5204l2;
            List<InterfaceC5204l> listM9523j2 = c5195c2.m9523j();
            for (int i2 = 0; i2 < listM9523j2.size(); i2++) {
                Path pathMo9522g2 = listM9523j2.get(i2).mo9522g();
                pathMo9522g2.transform(c5195c2.m9524k());
                this.f12552a.addPath(pathMo9522g2);
            }
        } else {
            this.f12552a.set(interfaceC5204l2.mo9522g());
        }
        this.f12554c.op(this.f12552a, this.f12553b, op);
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5194b
    /* renamed from: b */
    public void mo9513b(List<InterfaceC5194b> list, List<InterfaceC5194b> list2) {
        for (int i2 = 0; i2 < this.f12556e.size(); i2++) {
            this.f12556e.get(i2).mo9513b(list, list2);
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5201i
    /* renamed from: e */
    public void mo9532e(ListIterator<InterfaceC5194b> listIterator) {
        while (listIterator.hasPrevious() && listIterator.previous() != this) {
        }
        while (listIterator.hasPrevious()) {
            InterfaceC5194b interfaceC5194bPrevious = listIterator.previous();
            if (interfaceC5194bPrevious instanceof InterfaceC5204l) {
                this.f12556e.add((InterfaceC5204l) interfaceC5194bPrevious);
                listIterator.remove();
            }
        }
    }

    @Override // com.airbnb.lottie.p108q.p109a.InterfaceC5204l
    /* renamed from: g */
    public Path mo9522g() {
        this.f12554c.reset();
        int i2 = a.f12558a[this.f12557f.m9658b().ordinal()];
        if (i2 == 1) {
            m9533a();
        } else if (i2 == 2) {
            m9534c(Path.Op.UNION);
        } else if (i2 == 3) {
            m9534c(Path.Op.REVERSE_DIFFERENCE);
        } else if (i2 == 4) {
            m9534c(Path.Op.INTERSECT);
        } else if (i2 == 5) {
            m9534c(Path.Op.XOR);
        }
        return this.f12554c;
    }
}
