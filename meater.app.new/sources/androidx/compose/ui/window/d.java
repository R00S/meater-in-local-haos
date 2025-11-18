package androidx.compose.ui.window;

import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.AbstractC3864v;
import oa.C4153F;
import y0.H;
import y0.I;
import y0.J;
import y0.K;
import y0.Z;

/* compiled from: AndroidPopup.android.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u0006*\u00020\u00002\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Ly0/K;", "", "Ly0/H;", "measurables", "LU0/b;", "constraints", "Ly0/J;", "e", "(Ly0/K;Ljava/util/List;J)Ly0/J;"}, k = 3, mv = {1, 8, 0})
/* loaded from: classes.dex */
public final class d implements I {

    /* renamed from: a, reason: collision with root package name */
    public static final d f23683a = new d();

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class b extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ Z f23685B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Z z10) {
            super(1);
            this.f23685B = z10;
        }

        public final void a(Z.a aVar) {
            Z.a.l(aVar, this.f23685B, 0, 0, 0.0f, 4, null);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class c extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        final /* synthetic */ List<Z> f23686B;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(List<? extends Z> list) {
            super(1);
            this.f23686B = list;
        }

        public final void a(Z.a aVar) {
            int iO = kotlin.collections.r.o(this.f23686B);
            if (iO < 0) {
                return;
            }
            int i10 = 0;
            while (true) {
                Z.a.l(aVar, this.f23686B.get(i10), 0, 0, 0.0f, 4, null);
                if (i10 == iO) {
                    return;
                } else {
                    i10++;
                }
            }
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }
    }

    @Override // y0.I
    public final J e(K k10, List<? extends H> list, long j10) {
        int i10;
        int i11;
        int size = list.size();
        if (size == 0) {
            return K.E1(k10, 0, 0, null, a.f23684B, 4, null);
        }
        int i12 = 0;
        if (size == 1) {
            Z zT = list.get(0).T(j10);
            return K.E1(k10, zT.getWidth(), zT.getHeight(), null, new b(zT), 4, null);
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        for (int i13 = 0; i13 < size2; i13++) {
            arrayList.add(list.get(i13).T(j10));
        }
        int iO = kotlin.collections.r.o(arrayList);
        if (iO >= 0) {
            int iMax = 0;
            int iMax2 = 0;
            while (true) {
                Z z10 = (Z) arrayList.get(i12);
                iMax = Math.max(iMax, z10.getWidth());
                iMax2 = Math.max(iMax2, z10.getHeight());
                if (i12 == iO) {
                    break;
                }
                i12++;
            }
            i10 = iMax;
            i11 = iMax2;
        } else {
            i10 = 0;
            i11 = 0;
        }
        return K.E1(k10, i10, i11, null, new c(arrayList), 4, null);
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ly0/Z$a;", "Loa/F;", "a", "(Ly0/Z$a;)V"}, k = 3, mv = {1, 8, 0})
    public static final class a extends AbstractC3864v implements Ba.l<Z.a, C4153F> {

        /* renamed from: B, reason: collision with root package name */
        public static final a f23684B = new a();

        public a() {
            super(1);
        }

        @Override // Ba.l
        public /* bridge */ /* synthetic */ C4153F invoke(Z.a aVar) {
            a(aVar);
            return C4153F.f46609a;
        }

        public final void a(Z.a aVar) {
        }
    }
}
