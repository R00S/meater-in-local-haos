package androidx.media3.ui;

import U1.B;
import U1.G;
import U1.I;
import U1.J;
import U1.K;
import X1.C1804a;
import X1.L;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.media3.ui.G;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.apptionlabs.meater_app.data.Config;
import e3.C3180A;
import e3.C3181B;
import e3.C3182C;
import e3.C3183D;
import e3.C3189e;
import e3.InterfaceC3184E;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Formatter;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.CopyOnWriteArrayList;
import m8.AbstractC4009y;

/* compiled from: PlayerControlView.java */
/* renamed from: androidx.media3.ui.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C2159d extends FrameLayout {

    /* renamed from: b1, reason: collision with root package name */
    private static final float[] f28230b1;

    /* renamed from: A0, reason: collision with root package name */
    private final String f28231A0;

    /* renamed from: B, reason: collision with root package name */
    private final w f28232B;

    /* renamed from: B0, reason: collision with root package name */
    private final String f28233B0;

    /* renamed from: C, reason: collision with root package name */
    private final Resources f28234C;

    /* renamed from: C0, reason: collision with root package name */
    private final Drawable f28235C0;

    /* renamed from: D, reason: collision with root package name */
    private final c f28236D;

    /* renamed from: D0, reason: collision with root package name */
    private final Drawable f28237D0;

    /* renamed from: E, reason: collision with root package name */
    private final CopyOnWriteArrayList<m> f28238E;

    /* renamed from: E0, reason: collision with root package name */
    private final String f28239E0;

    /* renamed from: F, reason: collision with root package name */
    private final RecyclerView f28240F;

    /* renamed from: F0, reason: collision with root package name */
    private final String f28241F0;

    /* renamed from: G, reason: collision with root package name */
    private final h f28242G;

    /* renamed from: G0, reason: collision with root package name */
    private final Drawable f28243G0;

    /* renamed from: H, reason: collision with root package name */
    private final e f28244H;

    /* renamed from: H0, reason: collision with root package name */
    private final Drawable f28245H0;

    /* renamed from: I, reason: collision with root package name */
    private final j f28246I;

    /* renamed from: I0, reason: collision with root package name */
    private final String f28247I0;

    /* renamed from: J, reason: collision with root package name */
    private final b f28248J;

    /* renamed from: J0, reason: collision with root package name */
    private final String f28249J0;

    /* renamed from: K, reason: collision with root package name */
    private final InterfaceC3184E f28250K;

    /* renamed from: K0, reason: collision with root package name */
    private U1.B f28251K0;

    /* renamed from: L, reason: collision with root package name */
    private final PopupWindow f28252L;

    /* renamed from: L0, reason: collision with root package name */
    private InterfaceC0385d f28253L0;

    /* renamed from: M, reason: collision with root package name */
    private final int f28254M;

    /* renamed from: M0, reason: collision with root package name */
    private boolean f28255M0;

    /* renamed from: N, reason: collision with root package name */
    private final ImageView f28256N;

    /* renamed from: N0, reason: collision with root package name */
    private boolean f28257N0;

    /* renamed from: O, reason: collision with root package name */
    private final ImageView f28258O;

    /* renamed from: O0, reason: collision with root package name */
    private boolean f28259O0;

    /* renamed from: P, reason: collision with root package name */
    private final ImageView f28260P;

    /* renamed from: P0, reason: collision with root package name */
    private boolean f28261P0;

    /* renamed from: Q, reason: collision with root package name */
    private final View f28262Q;

    /* renamed from: Q0, reason: collision with root package name */
    private boolean f28263Q0;

    /* renamed from: R, reason: collision with root package name */
    private final View f28264R;

    /* renamed from: R0, reason: collision with root package name */
    private boolean f28265R0;

    /* renamed from: S, reason: collision with root package name */
    private final TextView f28266S;

    /* renamed from: S0, reason: collision with root package name */
    private int f28267S0;

    /* renamed from: T, reason: collision with root package name */
    private final TextView f28268T;

    /* renamed from: T0, reason: collision with root package name */
    private int f28269T0;

    /* renamed from: U, reason: collision with root package name */
    private final ImageView f28270U;

    /* renamed from: U0, reason: collision with root package name */
    private int f28271U0;

    /* renamed from: V, reason: collision with root package name */
    private final ImageView f28272V;

    /* renamed from: V0, reason: collision with root package name */
    private long[] f28273V0;

    /* renamed from: W, reason: collision with root package name */
    private final ImageView f28274W;

    /* renamed from: W0, reason: collision with root package name */
    private boolean[] f28275W0;

    /* renamed from: X0, reason: collision with root package name */
    private long[] f28276X0;

    /* renamed from: Y0, reason: collision with root package name */
    private boolean[] f28277Y0;

    /* renamed from: Z0, reason: collision with root package name */
    private long f28278Z0;

    /* renamed from: a0, reason: collision with root package name */
    private final ImageView f28279a0;

    /* renamed from: a1, reason: collision with root package name */
    private boolean f28280a1;

    /* renamed from: b0, reason: collision with root package name */
    private final ImageView f28281b0;

    /* renamed from: c0, reason: collision with root package name */
    private final ImageView f28282c0;

    /* renamed from: d0, reason: collision with root package name */
    private final View f28283d0;

    /* renamed from: e0, reason: collision with root package name */
    private final View f28284e0;

    /* renamed from: f0, reason: collision with root package name */
    private final View f28285f0;

    /* renamed from: g0, reason: collision with root package name */
    private final TextView f28286g0;

    /* renamed from: h0, reason: collision with root package name */
    private final TextView f28287h0;

    /* renamed from: i0, reason: collision with root package name */
    private final G f28288i0;

    /* renamed from: j0, reason: collision with root package name */
    private final StringBuilder f28289j0;

    /* renamed from: k0, reason: collision with root package name */
    private final Formatter f28290k0;

    /* renamed from: l0, reason: collision with root package name */
    private final G.b f28291l0;

    /* renamed from: m0, reason: collision with root package name */
    private final G.c f28292m0;

    /* renamed from: n0, reason: collision with root package name */
    private final Runnable f28293n0;

    /* renamed from: o0, reason: collision with root package name */
    private final Drawable f28294o0;

    /* renamed from: p0, reason: collision with root package name */
    private final Drawable f28295p0;

    /* renamed from: q0, reason: collision with root package name */
    private final Drawable f28296q0;

    /* renamed from: r0, reason: collision with root package name */
    private final Drawable f28297r0;

    /* renamed from: s0, reason: collision with root package name */
    private final Drawable f28298s0;

    /* renamed from: t0, reason: collision with root package name */
    private final String f28299t0;

    /* renamed from: u0, reason: collision with root package name */
    private final String f28300u0;

    /* renamed from: v0, reason: collision with root package name */
    private final String f28301v0;

    /* renamed from: w0, reason: collision with root package name */
    private final Drawable f28302w0;

    /* renamed from: x0, reason: collision with root package name */
    private final Drawable f28303x0;

    /* renamed from: y0, reason: collision with root package name */
    private final float f28304y0;

    /* renamed from: z0, reason: collision with root package name */
    private final float f28305z0;

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$b */
    final class b extends l {
        private b() {
            super();
        }

        private boolean Q(J j10) {
            for (int i10 = 0; i10 < this.f28326E.size(); i10++) {
                if (j10.f16904A.containsKey(this.f28326E.get(i10).f28323a.a())) {
                    return true;
                }
            }
            return false;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void S(View view) {
            if (C2159d.this.f28251K0 == null || !C2159d.this.f28251K0.R(29)) {
                return;
            }
            ((U1.B) L.i(C2159d.this.f28251K0)).A(C2159d.this.f28251K0.b0().a().D(1).N(1, false).C());
            C2159d.this.f28242G.L(1, C2159d.this.getResources().getString(C3181B.f40327w));
            C2159d.this.f28252L.dismiss();
        }

        @Override // androidx.media3.ui.C2159d.l
        public void M(i iVar) {
            iVar.f28320B.setText(C3181B.f40327w);
            iVar.f28321C.setVisibility(Q(((U1.B) C1804a.e(C2159d.this.f28251K0)).b0()) ? 4 : 0);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.e
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28328B.S(view);
                }
            });
        }

        @Override // androidx.media3.ui.C2159d.l
        public void O(String str) {
            C2159d.this.f28242G.L(1, str);
        }

        public void R(List<k> list) {
            this.f28326E = list;
            J jB0 = ((U1.B) C1804a.e(C2159d.this.f28251K0)).b0();
            if (list.isEmpty()) {
                C2159d.this.f28242G.L(1, C2159d.this.getResources().getString(C3181B.f40328x));
                return;
            }
            if (!Q(jB0)) {
                C2159d.this.f28242G.L(1, C2159d.this.getResources().getString(C3181B.f40327w));
                return;
            }
            for (int i10 = 0; i10 < list.size(); i10++) {
                k kVar = list.get(i10);
                if (kVar.a()) {
                    C2159d.this.f28242G.L(1, kVar.f28325c);
                    return;
                }
            }
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$c */
    private final class c implements B.d, G.a, View.OnClickListener, PopupWindow.OnDismissListener {
        private c() {
        }

        @Override // androidx.media3.ui.G.a
        public void D(G g10, long j10) {
            C2159d.this.f28265R0 = true;
            if (C2159d.this.f28287h0 != null) {
                C2159d.this.f28287h0.setText(L.n0(C2159d.this.f28289j0, C2159d.this.f28290k0, j10));
            }
            C2159d.this.f28232B.V();
        }

        @Override // androidx.media3.ui.G.a
        public void I(G g10, long j10) {
            if (C2159d.this.f28287h0 != null) {
                C2159d.this.f28287h0.setText(L.n0(C2159d.this.f28289j0, C2159d.this.f28290k0, j10));
            }
        }

        @Override // androidx.media3.ui.G.a
        public void L(G g10, long j10, boolean z10) {
            C2159d.this.f28265R0 = false;
            if (!z10 && C2159d.this.f28251K0 != null) {
                C2159d c2159d = C2159d.this;
                c2159d.l0(c2159d.f28251K0, j10);
            }
            C2159d.this.f28232B.W();
        }

        @Override // U1.B.d
        public void o0(U1.B b10, B.c cVar) {
            if (cVar.a(4, 5, 13)) {
                C2159d.this.v0();
            }
            if (cVar.a(4, 5, 7, 13)) {
                C2159d.this.x0();
            }
            if (cVar.a(8, 13)) {
                C2159d.this.y0();
            }
            if (cVar.a(9, 13)) {
                C2159d.this.C0();
            }
            if (cVar.a(8, 9, 11, 0, 16, 17, 13)) {
                C2159d.this.u0();
            }
            if (cVar.a(11, 0, 13)) {
                C2159d.this.D0();
            }
            if (cVar.a(12, 13)) {
                C2159d.this.w0();
            }
            if (cVar.a(2, 13)) {
                C2159d.this.E0();
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            U1.B b10 = C2159d.this.f28251K0;
            if (b10 == null) {
                return;
            }
            C2159d.this.f28232B.W();
            if (C2159d.this.f28258O == view) {
                if (b10.R(9)) {
                    b10.d0();
                    return;
                }
                return;
            }
            if (C2159d.this.f28256N == view) {
                if (b10.R(7)) {
                    b10.D();
                    return;
                }
                return;
            }
            if (C2159d.this.f28262Q == view) {
                if (b10.K() == 4 || !b10.R(12)) {
                    return;
                }
                b10.e0();
                return;
            }
            if (C2159d.this.f28264R == view) {
                if (b10.R(11)) {
                    b10.g0();
                    return;
                }
                return;
            }
            if (C2159d.this.f28260P == view) {
                L.w0(b10, C2159d.this.f28261P0);
                return;
            }
            if (C2159d.this.f28270U == view) {
                if (b10.R(15)) {
                    b10.S(X1.z.a(b10.W(), C2159d.this.f28271U0));
                    return;
                }
                return;
            }
            if (C2159d.this.f28272V == view) {
                if (b10.R(14)) {
                    b10.p(!b10.a0());
                    return;
                }
                return;
            }
            if (C2159d.this.f28283d0 == view) {
                C2159d.this.f28232B.V();
                C2159d c2159d = C2159d.this;
                c2159d.V(c2159d.f28242G, C2159d.this.f28283d0);
                return;
            }
            if (C2159d.this.f28284e0 == view) {
                C2159d.this.f28232B.V();
                C2159d c2159d2 = C2159d.this;
                c2159d2.V(c2159d2.f28244H, C2159d.this.f28284e0);
            } else if (C2159d.this.f28285f0 == view) {
                C2159d.this.f28232B.V();
                C2159d c2159d3 = C2159d.this;
                c2159d3.V(c2159d3.f28248J, C2159d.this.f28285f0);
            } else if (C2159d.this.f28279a0 == view) {
                C2159d.this.f28232B.V();
                C2159d c2159d4 = C2159d.this;
                c2159d4.V(c2159d4.f28246I, C2159d.this.f28279a0);
            }
        }

        @Override // android.widget.PopupWindow.OnDismissListener
        public void onDismiss() {
            if (C2159d.this.f28280a1) {
                C2159d.this.f28232B.W();
            }
        }
    }

    /* compiled from: PlayerControlView.java */
    @Deprecated
    /* renamed from: androidx.media3.ui.d$d, reason: collision with other inner class name */
    public interface InterfaceC0385d {
        void D(boolean z10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$e */
    final class e extends RecyclerView.h<i> {

        /* renamed from: E, reason: collision with root package name */
        private final String[] f28308E;

        /* renamed from: F, reason: collision with root package name */
        private final float[] f28309F;

        /* renamed from: G, reason: collision with root package name */
        private int f28310G;

        public e(String[] strArr, float[] fArr) {
            this.f28308E = strArr;
            this.f28309F = fArr;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void K(int i10, View view) {
            if (i10 != this.f28310G) {
                C2159d.this.setPlaybackSpeed(this.f28309F[i10]);
            }
            C2159d.this.f28252L.dismiss();
        }

        public String J() {
            return this.f28308E[this.f28310G];
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void w(i iVar, final int i10) {
            String[] strArr = this.f28308E;
            if (i10 < strArr.length) {
                iVar.f28320B.setText(strArr[i10]);
            }
            if (i10 == this.f28310G) {
                iVar.itemView.setSelected(true);
                iVar.f28321C.setVisibility(0);
            } else {
                iVar.itemView.setSelected(false);
                iVar.f28321C.setVisibility(4);
            }
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.f
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28329B.K(i10, view);
                }
            });
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: M, reason: merged with bridge method [inline-methods] */
        public i y(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2159d.this.getContext()).inflate(e3.z.f40498f, viewGroup, false));
        }

        public void N(float f10) {
            int i10 = 0;
            float f11 = Float.MAX_VALUE;
            int i11 = 0;
            while (true) {
                float[] fArr = this.f28309F;
                if (i10 >= fArr.length) {
                    this.f28310G = i11;
                    return;
                }
                float fAbs = Math.abs(f10 - fArr[i10]);
                if (fAbs < f11) {
                    i11 = i10;
                    f11 = fAbs;
                }
                i10++;
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f28308E.length;
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$f */
    public interface f {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$g */
    final class g extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        private final TextView f28312B;

        /* renamed from: C, reason: collision with root package name */
        private final TextView f28313C;

        /* renamed from: D, reason: collision with root package name */
        private final ImageView f28314D;

        public g(View view) {
            super(view);
            if (L.f18626a < 26) {
                view.setFocusable(true);
            }
            this.f28312B = (TextView) view.findViewById(e3.x.f40486v);
            this.f28313C = (TextView) view.findViewById(e3.x.f40459O);
            this.f28314D = (ImageView) view.findViewById(e3.x.f40484t);
            view.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.g
                @Override // android.view.View.OnClickListener
                public final void onClick(View view2) {
                    this.f28331B.e(view2);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void e(View view) {
            C2159d.this.i0(getBindingAdapterPosition());
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$h */
    private class h extends RecyclerView.h<g> {

        /* renamed from: E, reason: collision with root package name */
        private final String[] f28316E;

        /* renamed from: F, reason: collision with root package name */
        private final String[] f28317F;

        /* renamed from: G, reason: collision with root package name */
        private final Drawable[] f28318G;

        public h(String[] strArr, Drawable[] drawableArr) {
            this.f28316E = strArr;
            this.f28317F = new String[strArr.length];
            this.f28318G = drawableArr;
        }

        private boolean M(int i10) {
            if (C2159d.this.f28251K0 == null) {
                return false;
            }
            if (i10 == 0) {
                return C2159d.this.f28251K0.R(13);
            }
            if (i10 != 1) {
                return true;
            }
            return C2159d.this.f28251K0.R(30) && C2159d.this.f28251K0.R(29);
        }

        public boolean I() {
            return M(1) || M(0);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: J, reason: merged with bridge method [inline-methods] */
        public void w(g gVar, int i10) {
            if (M(i10)) {
                gVar.itemView.setLayoutParams(new RecyclerView.r(-1, -2));
            } else {
                gVar.itemView.setLayoutParams(new RecyclerView.r(0, 0));
            }
            gVar.f28312B.setText(this.f28316E[i10]);
            if (this.f28317F[i10] == null) {
                gVar.f28313C.setVisibility(8);
            } else {
                gVar.f28313C.setText(this.f28317F[i10]);
            }
            if (this.f28318G[i10] == null) {
                gVar.f28314D.setVisibility(8);
            } else {
                gVar.f28314D.setImageDrawable(this.f28318G[i10]);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: K, reason: merged with bridge method [inline-methods] */
        public g y(ViewGroup viewGroup, int i10) {
            return C2159d.this.new g(LayoutInflater.from(C2159d.this.getContext()).inflate(e3.z.f40497e, viewGroup, false));
        }

        public void L(int i10, String str) {
            this.f28317F[i10] = str;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            return this.f28316E.length;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public long i(int i10) {
            return i10;
        }
    }

    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$i */
    private static class i extends RecyclerView.G {

        /* renamed from: B, reason: collision with root package name */
        public final TextView f28320B;

        /* renamed from: C, reason: collision with root package name */
        public final View f28321C;

        public i(View view) {
            super(view);
            if (L.f18626a < 26) {
                view.setFocusable(true);
            }
            this.f28320B = (TextView) view.findViewById(e3.x.f40462R);
            this.f28321C = view.findViewById(e3.x.f40472h);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$k */
    static final class k {

        /* renamed from: a, reason: collision with root package name */
        public final K.a f28323a;

        /* renamed from: b, reason: collision with root package name */
        public final int f28324b;

        /* renamed from: c, reason: collision with root package name */
        public final String f28325c;

        public k(K k10, int i10, int i11, String str) {
            this.f28323a = k10.a().get(i10);
            this.f28324b = i11;
            this.f28325c = str;
        }

        public boolean a() {
            return this.f28323a.g(this.f28324b);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$l */
    abstract class l extends RecyclerView.h<i> {

        /* renamed from: E, reason: collision with root package name */
        protected List<k> f28326E = new ArrayList();

        protected l() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void K(U1.B b10, U1.H h10, k kVar, View view) {
            if (b10.R(29)) {
                b10.A(b10.b0().a().I(new I(h10, AbstractC4009y.H(Integer.valueOf(kVar.f28324b)))).N(kVar.f28323a.c(), false).C());
                O(kVar.f28325c);
                C2159d.this.f28252L.dismiss();
            }
        }

        protected void J() {
            this.f28326E = Collections.emptyList();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L */
        public void w(i iVar, int i10) {
            final U1.B b10 = C2159d.this.f28251K0;
            if (b10 == null) {
                return;
            }
            if (i10 == 0) {
                M(iVar);
                return;
            }
            final k kVar = this.f28326E.get(i10 - 1);
            final U1.H hA = kVar.f28323a.a();
            boolean z10 = b10.b0().f16904A.get(hA) != null && kVar.a();
            iVar.f28320B.setText(kVar.f28325c);
            iVar.f28321C.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.i
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28333B.K(b10, hA, kVar, view);
                }
            });
        }

        protected abstract void M(i iVar);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: N, reason: merged with bridge method [inline-methods] */
        public i y(ViewGroup viewGroup, int i10) {
            return new i(LayoutInflater.from(C2159d.this.getContext()).inflate(e3.z.f40498f, viewGroup, false));
        }

        protected abstract void O(String str);

        @Override // androidx.recyclerview.widget.RecyclerView.h
        public int h() {
            if (this.f28326E.isEmpty()) {
                return 0;
            }
            return this.f28326E.size() + 1;
        }
    }

    /* compiled from: PlayerControlView.java */
    @Deprecated
    /* renamed from: androidx.media3.ui.d$m */
    public interface m {
        void I(int i10);
    }

    static {
        U1.w.a("media3.ui");
        f28230b1 = new float[]{0.25f, 0.5f, 0.75f, 1.0f, 1.25f, 1.5f, 2.0f};
    }

    public C2159d(Context context, AttributeSet attributeSet, int i10, AttributeSet attributeSet2) throws Throwable {
        int i11;
        final C2159d c2159d;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        int i22;
        int i23;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        c cVar;
        final C2159d c2159d2;
        boolean z18;
        int i29;
        boolean z19;
        int i30;
        boolean z20;
        int resourceId;
        int resourceId2;
        int resourceId3;
        int resourceId4;
        int resourceId5;
        int resourceId6;
        int resourceId7;
        int resourceId8;
        int resourceId9;
        int resourceId10;
        int resourceId11;
        int resourceId12;
        int resourceId13;
        int resourceId14;
        int resourceId15;
        int resourceId16;
        int resourceId17;
        super(context, attributeSet, i10);
        int i31 = e3.z.f40494b;
        int i32 = e3.v.f40431g;
        int i33 = e3.v.f40430f;
        int i34 = e3.v.f40429e;
        int i35 = e3.v.f40438n;
        int i36 = e3.v.f40432h;
        int i37 = e3.v.f40439o;
        int i38 = e3.v.f40428d;
        int i39 = e3.v.f40427c;
        int i40 = e3.v.f40434j;
        int i41 = e3.v.f40435k;
        int i42 = e3.v.f40433i;
        int i43 = e3.v.f40437m;
        int i44 = e3.v.f40436l;
        int i45 = e3.v.f40442r;
        int i46 = e3.v.f40441q;
        int i47 = e3.v.f40443s;
        this.f28261P0 = true;
        this.f28267S0 = 5000;
        this.f28271U0 = 0;
        this.f28269T0 = 200;
        if (attributeSet2 != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet2, C3183D.f40400y, i10, 0);
            try {
                resourceId = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40332A, i31);
                resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40338G, i32);
                resourceId3 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40337F, i33);
                resourceId4 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40336E, i34);
                resourceId5 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40333B, i35);
                resourceId6 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40339H, i36);
                resourceId7 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40344M, i37);
                resourceId8 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40335D, i38);
                resourceId9 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40334C, i39);
                resourceId10 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40341J, i40);
                resourceId11 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40342K, i41);
                resourceId12 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40340I, i42);
                resourceId13 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40354W, i43);
                resourceId14 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40353V, i44);
                resourceId15 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40356Y, i45);
                resourceId16 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40355X, i46);
                resourceId17 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40359a0, i47);
                c2159d = this;
            } catch (Throwable th) {
                th = th;
            }
            try {
                c2159d.f28267S0 = typedArrayObtainStyledAttributes.getInt(C3183D.f40351T, c2159d.f28267S0);
                c2159d.f28271U0 = X(typedArrayObtainStyledAttributes, c2159d.f28271U0);
                boolean z21 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40348Q, true);
                boolean z22 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40345N, true);
                boolean z23 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40347P, true);
                boolean z24 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40346O, true);
                boolean z25 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40349R, false);
                boolean z26 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40350S, false);
                boolean z27 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40352U, false);
                c2159d.setTimeBarMinUpdateInterval(typedArrayObtainStyledAttributes.getInt(C3183D.f40357Z, c2159d.f28269T0));
                boolean z28 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40401z, true);
                typedArrayObtainStyledAttributes.recycle();
                i27 = resourceId14;
                i26 = resourceId;
                z17 = z28;
                i12 = resourceId6;
                i13 = resourceId7;
                i14 = resourceId8;
                i15 = resourceId9;
                i16 = resourceId10;
                i17 = resourceId11;
                i18 = resourceId12;
                i19 = resourceId13;
                i20 = resourceId15;
                i21 = resourceId16;
                i11 = resourceId17;
                z10 = z21;
                z11 = z22;
                z12 = z23;
                z13 = z24;
                z14 = z25;
                z15 = z26;
                z16 = z27;
                i22 = resourceId2;
                i23 = resourceId3;
                i24 = resourceId5;
                i25 = resourceId4;
            } catch (Throwable th2) {
                th = th2;
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = i47;
            c2159d = this;
            i12 = i36;
            i13 = i37;
            i14 = i38;
            i15 = i39;
            i16 = i40;
            i17 = i41;
            i18 = i42;
            i19 = i43;
            i20 = i45;
            i21 = i46;
            z10 = true;
            z11 = true;
            z12 = true;
            z13 = true;
            z14 = false;
            z15 = false;
            z16 = false;
            z17 = true;
            i22 = i32;
            i23 = i33;
            i24 = i35;
            i25 = i34;
            i26 = i31;
            i27 = i44;
        }
        LayoutInflater.from(context).inflate(i26, c2159d);
        c2159d.setDescendantFocusability(262144);
        c cVar2 = new c();
        c2159d.f28236D = cVar2;
        c2159d.f28238E = new CopyOnWriteArrayList<>();
        c2159d.f28291l0 = new G.b();
        c2159d.f28292m0 = new G.c();
        StringBuilder sb2 = new StringBuilder();
        c2159d.f28289j0 = sb2;
        int i48 = i24;
        c2159d.f28290k0 = new Formatter(sb2, Locale.getDefault());
        c2159d.f28273V0 = new long[0];
        c2159d.f28275W0 = new boolean[0];
        c2159d.f28276X0 = new long[0];
        c2159d.f28277Y0 = new boolean[0];
        c2159d.f28293n0 = new Runnable() { // from class: e3.f
            @Override // java.lang.Runnable
            public final void run() {
                this.f40412B.x0();
            }
        };
        c2159d.f28286g0 = (TextView) c2159d.findViewById(e3.x.f40477m);
        c2159d.f28287h0 = (TextView) c2159d.findViewById(e3.x.f40449E);
        ImageView imageView = (ImageView) c2159d.findViewById(e3.x.f40460P);
        c2159d.f28279a0 = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(cVar2);
        }
        ImageView imageView2 = (ImageView) c2159d.findViewById(e3.x.f40483s);
        c2159d.f28281b0 = imageView2;
        b0(imageView2, new View.OnClickListener() { // from class: e3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40413B.g0(view);
            }
        });
        ImageView imageView3 = (ImageView) c2159d.findViewById(e3.x.f40488x);
        c2159d.f28282c0 = imageView3;
        b0(imageView3, new View.OnClickListener() { // from class: e3.g
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                this.f40413B.g0(view);
            }
        });
        View viewFindViewById = c2159d.findViewById(e3.x.f40456L);
        c2159d.f28283d0 = viewFindViewById;
        if (viewFindViewById != null) {
            viewFindViewById.setOnClickListener(cVar2);
        }
        View viewFindViewById2 = c2159d.findViewById(e3.x.f40448D);
        c2159d.f28284e0 = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setOnClickListener(cVar2);
        }
        View viewFindViewById3 = c2159d.findViewById(e3.x.f40467c);
        c2159d.f28285f0 = viewFindViewById3;
        if (viewFindViewById3 != null) {
            viewFindViewById3.setOnClickListener(cVar2);
        }
        int i49 = e3.x.f40451G;
        G g10 = (G) c2159d.findViewById(i49);
        View viewFindViewById4 = c2159d.findViewById(e3.x.f40452H);
        if (g10 != null) {
            c2159d.f28288i0 = g10;
            i28 = i12;
            cVar = cVar2;
            c2159d2 = c2159d;
            z18 = z13;
            i29 = i48;
            z19 = z12;
            i30 = i25;
        } else if (viewFindViewById4 != null) {
            i28 = i12;
            cVar = cVar2;
            z18 = z13;
            i29 = i48;
            z19 = z12;
            i30 = i25;
            C2157b c2157b = new C2157b(context, null, 0, attributeSet2, C3182C.f40331a);
            c2157b.setId(i49);
            c2157b.setLayoutParams(viewFindViewById4.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById4.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById4);
            viewGroup.removeView(viewFindViewById4);
            viewGroup.addView(c2157b, iIndexOfChild);
            c2159d2 = this;
            c2159d2.f28288i0 = c2157b;
        } else {
            i28 = i12;
            cVar = cVar2;
            c2159d2 = c2159d;
            z18 = z13;
            i29 = i48;
            z19 = z12;
            i30 = i25;
            c2159d2.f28288i0 = null;
        }
        G g11 = c2159d2.f28288i0;
        c cVar3 = cVar;
        if (g11 != null) {
            g11.a(cVar3);
        }
        Resources resources = context.getResources();
        c2159d2.f28234C = resources;
        ImageView imageView4 = (ImageView) c2159d2.findViewById(e3.x.f40447C);
        c2159d2.f28260P = imageView4;
        if (imageView4 != null) {
            imageView4.setOnClickListener(cVar3);
        }
        ImageView imageView5 = (ImageView) c2159d2.findViewById(e3.x.f40450F);
        c2159d2.f28256N = imageView5;
        if (imageView5 != null) {
            imageView5.setImageDrawable(L.Y(context, resources, i28));
            imageView5.setOnClickListener(cVar3);
        }
        ImageView imageView6 = (ImageView) c2159d2.findViewById(e3.x.f40489y);
        c2159d2.f28258O = imageView6;
        if (imageView6 != null) {
            imageView6.setImageDrawable(L.Y(context, resources, i30));
            imageView6.setOnClickListener(cVar3);
        }
        Typeface typefaceG = i1.h.g(context, e3.w.f40444a);
        ImageView imageView7 = (ImageView) c2159d2.findViewById(e3.x.f40454J);
        TextView textView = (TextView) c2159d2.findViewById(e3.x.f40455K);
        if (imageView7 != null) {
            imageView7.setImageDrawable(L.Y(context, resources, i13));
            c2159d2.f28264R = imageView7;
            c2159d2.f28268T = null;
        } else if (textView != null) {
            textView.setTypeface(typefaceG);
            c2159d2.f28268T = textView;
            c2159d2.f28264R = textView;
        } else {
            c2159d2.f28268T = null;
            c2159d2.f28264R = null;
        }
        View view = c2159d2.f28264R;
        if (view != null) {
            view.setOnClickListener(c2159d2.f28236D);
        }
        ImageView imageView8 = (ImageView) c2159d2.findViewById(e3.x.f40481q);
        TextView textView2 = (TextView) c2159d2.findViewById(e3.x.f40482r);
        if (imageView8 != null) {
            imageView8.setImageDrawable(L.Y(context, resources, i29));
            c2159d2.f28262Q = imageView8;
            c2159d2.f28266S = null;
        } else if (textView2 != null) {
            textView2.setTypeface(typefaceG);
            c2159d2.f28266S = textView2;
            c2159d2.f28262Q = textView2;
        } else {
            c2159d2.f28266S = null;
            c2159d2.f28262Q = null;
        }
        View view2 = c2159d2.f28262Q;
        if (view2 != null) {
            view2.setOnClickListener(c2159d2.f28236D);
        }
        ImageView imageView9 = (ImageView) c2159d2.findViewById(e3.x.f40453I);
        c2159d2.f28270U = imageView9;
        if (imageView9 != null) {
            imageView9.setOnClickListener(c2159d2.f28236D);
        }
        ImageView imageView10 = (ImageView) c2159d2.findViewById(e3.x.f40457M);
        c2159d2.f28272V = imageView10;
        if (imageView10 != null) {
            imageView10.setOnClickListener(c2159d2.f28236D);
        }
        c2159d2.f28304y0 = resources.getInteger(e3.y.f40492b) / 100.0f;
        c2159d2.f28305z0 = resources.getInteger(e3.y.f40491a) / 100.0f;
        ImageView imageView11 = (ImageView) c2159d2.findViewById(e3.x.f40464T);
        c2159d2.f28274W = imageView11;
        if (imageView11 != null) {
            imageView11.setImageDrawable(L.Y(context, resources, i11));
            c2159d2.p0(false, imageView11);
        }
        w wVar = new w(c2159d2);
        c2159d2.f28232B = wVar;
        wVar.X(z17);
        h hVar = c2159d2.new h(new String[]{resources.getString(C3181B.f40312h), c2159d2.f28234C.getString(C3181B.f40329y)}, new Drawable[]{L.Y(context, resources, e3.v.f40440p), L.Y(context, c2159d2.f28234C, e3.v.f40426b)});
        c2159d2.f28242G = hVar;
        c2159d2.f28254M = c2159d2.f28234C.getDimensionPixelSize(e3.u.f40421a);
        RecyclerView recyclerView = (RecyclerView) LayoutInflater.from(context).inflate(e3.z.f40496d, (ViewGroup) null);
        c2159d2.f28240F = recyclerView;
        recyclerView.setAdapter(hVar);
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        PopupWindow popupWindow = new PopupWindow((View) recyclerView, -2, -2, true);
        c2159d2.f28252L = popupWindow;
        if (L.f18626a < 23) {
            z20 = false;
            popupWindow.setBackgroundDrawable(new ColorDrawable(0));
        } else {
            z20 = false;
        }
        popupWindow.setOnDismissListener(c2159d2.f28236D);
        c2159d2.f28280a1 = true;
        c2159d2.f28250K = new C3189e(getResources());
        c2159d2.f28235C0 = L.Y(context, c2159d2.f28234C, i20);
        c2159d2.f28237D0 = L.Y(context, c2159d2.f28234C, i21);
        c2159d2.f28239E0 = c2159d2.f28234C.getString(C3181B.f40306b);
        c2159d2.f28241F0 = c2159d2.f28234C.getString(C3181B.f40305a);
        c2159d2.f28246I = new j();
        c2159d2.f28248J = new b();
        c2159d2.f28244H = c2159d2.new e(c2159d2.f28234C.getStringArray(e3.s.f40419a), f28230b1);
        c2159d2.f28294o0 = L.Y(context, c2159d2.f28234C, i22);
        c2159d2.f28295p0 = L.Y(context, c2159d2.f28234C, i23);
        c2159d2.f28243G0 = L.Y(context, c2159d2.f28234C, i14);
        c2159d2.f28245H0 = L.Y(context, c2159d2.f28234C, i15);
        c2159d2.f28296q0 = L.Y(context, c2159d2.f28234C, i16);
        c2159d2.f28297r0 = L.Y(context, c2159d2.f28234C, i17);
        c2159d2.f28298s0 = L.Y(context, c2159d2.f28234C, i18);
        c2159d2.f28302w0 = L.Y(context, c2159d2.f28234C, i19);
        c2159d2.f28303x0 = L.Y(context, c2159d2.f28234C, i27);
        c2159d2.f28247I0 = c2159d2.f28234C.getString(C3181B.f40308d);
        c2159d2.f28249J0 = c2159d2.f28234C.getString(C3181B.f40307c);
        c2159d2.f28299t0 = c2159d2.f28234C.getString(C3181B.f40314j);
        c2159d2.f28300u0 = c2159d2.f28234C.getString(C3181B.f40315k);
        c2159d2.f28301v0 = c2159d2.f28234C.getString(C3181B.f40313i);
        c2159d2.f28231A0 = c2159d2.f28234C.getString(C3181B.f40318n);
        c2159d2.f28233B0 = c2159d2.f28234C.getString(C3181B.f40317m);
        c2159d2.f28232B.Y((ViewGroup) c2159d2.findViewById(e3.x.f40469e), true);
        c2159d2.f28232B.Y(c2159d2.f28262Q, z11);
        c2159d2.f28232B.Y(c2159d2.f28264R, z10);
        c2159d2.f28232B.Y(c2159d2.f28256N, z19);
        c2159d2.f28232B.Y(c2159d2.f28258O, z18);
        c2159d2.f28232B.Y(c2159d2.f28272V, z14);
        c2159d2.f28232B.Y(c2159d2.f28279a0, z15);
        c2159d2.f28232B.Y(c2159d2.f28274W, z16);
        c2159d2.f28232B.Y(c2159d2.f28270U, c2159d2.f28271U0 == 0 ? z20 : true);
        c2159d2.addOnLayoutChangeListener(new View.OnLayoutChangeListener() { // from class: e3.h
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view3, int i50, int i51, int i52, int i53, int i54, int i55, int i56, int i57) {
                this.f40414a.h0(view3, i50, i51, i52, i53, i54, i55, i56, i57);
            }
        });
    }

    private void A0() {
        p0(this.f28242G.I(), this.f28283d0);
    }

    private void B0() {
        this.f28240F.measure(0, 0);
        this.f28252L.setWidth(Math.min(this.f28240F.getMeasuredWidth(), getWidth() - (this.f28254M * 2)));
        this.f28252L.setHeight(Math.min(getHeight() - (this.f28254M * 2), this.f28240F.getMeasuredHeight()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void C0() {
        ImageView imageView;
        if (e0() && this.f28257N0 && (imageView = this.f28272V) != null) {
            U1.B b10 = this.f28251K0;
            if (!this.f28232B.A(imageView)) {
                p0(false, this.f28272V);
                return;
            }
            if (b10 == null || !b10.R(14)) {
                p0(false, this.f28272V);
                this.f28272V.setImageDrawable(this.f28303x0);
                this.f28272V.setContentDescription(this.f28233B0);
            } else {
                p0(true, this.f28272V);
                this.f28272V.setImageDrawable(b10.a0() ? this.f28302w0 : this.f28303x0);
                this.f28272V.setContentDescription(b10.a0() ? this.f28231A0 : this.f28233B0);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x00dd A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void D0() {
        /*
            Method dump skipped, instructions count: 344
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.C2159d.D0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E0() {
        a0();
        p0(this.f28246I.h() > 0, this.f28279a0);
        A0();
    }

    private static boolean T(U1.B b10, G.c cVar) {
        U1.G gX;
        int iP;
        if (!b10.R(17) || (iP = (gX = b10.X()).p()) <= 1 || iP > 100) {
            return false;
        }
        for (int i10 = 0; i10 < iP; i10++) {
            if (gX.n(i10, cVar).f16856m == -9223372036854775807L) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void V(RecyclerView.h<?> hVar, View view) {
        this.f28240F.setAdapter(hVar);
        B0();
        this.f28280a1 = false;
        this.f28252L.dismiss();
        this.f28280a1 = true;
        this.f28252L.showAsDropDown(view, (getWidth() - this.f28252L.getWidth()) - this.f28254M, (-this.f28252L.getHeight()) - this.f28254M);
    }

    private AbstractC4009y<k> W(K k10, int i10) {
        AbstractC4009y.a aVar = new AbstractC4009y.a();
        AbstractC4009y<K.a> abstractC4009yA = k10.a();
        for (int i11 = 0; i11 < abstractC4009yA.size(); i11++) {
            K.a aVar2 = abstractC4009yA.get(i11);
            if (aVar2.c() == i10) {
                for (int i12 = 0; i12 < aVar2.f16977a; i12++) {
                    if (aVar2.h(i12)) {
                        U1.s sVarB = aVar2.b(i12);
                        if ((sVarB.f17152e & 2) == 0) {
                            aVar.a(new k(k10, i11, i12, this.f28250K.a(sVarB)));
                        }
                    }
                }
            }
        }
        return aVar.k();
    }

    private static int X(TypedArray typedArray, int i10) {
        return typedArray.getInt(C3183D.f40343L, i10);
    }

    private void a0() {
        this.f28246I.J();
        this.f28248J.J();
        U1.B b10 = this.f28251K0;
        if (b10 != null && b10.R(30) && this.f28251K0.R(29)) {
            K kL = this.f28251K0.L();
            this.f28248J.R(W(kL, 1));
            if (this.f28232B.A(this.f28279a0)) {
                this.f28246I.Q(W(kL, 3));
            } else {
                this.f28246I.Q(AbstractC4009y.G());
            }
        }
    }

    private static void b0(View view, View.OnClickListener onClickListener) {
        if (view == null) {
            return;
        }
        view.setVisibility(8);
        view.setOnClickListener(onClickListener);
    }

    @SuppressLint({"InlinedApi"})
    private static boolean d0(int i10) {
        return i10 == 90 || i10 == 89 || i10 == 85 || i10 == 79 || i10 == 126 || i10 == 127 || i10 == 87 || i10 == 88;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(View view) {
        t0(!this.f28255M0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void h0(View view, int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17) {
        int i18 = i13 - i11;
        int i19 = i17 - i15;
        if (!(i12 - i10 == i16 - i14 && i18 == i19) && this.f28252L.isShowing()) {
            B0();
            this.f28252L.update(view, (getWidth() - this.f28252L.getWidth()) - this.f28254M, (-this.f28252L.getHeight()) - this.f28254M, -1, -1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void i0(int i10) {
        if (i10 == 0) {
            V(this.f28244H, (View) C1804a.e(this.f28283d0));
        } else if (i10 == 1) {
            V(this.f28248J, (View) C1804a.e(this.f28283d0));
        } else {
            this.f28252L.dismiss();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l0(U1.B b10, long j10) {
        if (this.f28263Q0) {
            if (b10.R(17) && b10.R(10)) {
                U1.G gX = b10.X();
                int iP = gX.p();
                int i10 = 0;
                while (true) {
                    long jD = gX.n(i10, this.f28292m0).d();
                    if (j10 < jD) {
                        break;
                    }
                    if (i10 == iP - 1) {
                        j10 = jD;
                        break;
                    } else {
                        j10 -= jD;
                        i10++;
                    }
                }
                b10.m(i10, j10);
            }
        } else if (b10.R(5)) {
            b10.B(j10);
        }
        x0();
    }

    private boolean m0() {
        U1.B b10 = this.f28251K0;
        return (b10 == null || !b10.R(1) || (this.f28251K0.R(17) && this.f28251K0.X().q())) ? false : true;
    }

    private void p0(boolean z10, View view) {
        if (view == null) {
            return;
        }
        view.setEnabled(z10);
        view.setAlpha(z10 ? this.f28304y0 : this.f28305z0);
    }

    private void q0() {
        U1.B b10 = this.f28251K0;
        int iG = (int) ((b10 != null ? b10.G() : 15000L) / 1000);
        TextView textView = this.f28266S;
        if (textView != null) {
            textView.setText(String.valueOf(iG));
        }
        View view = this.f28262Q;
        if (view != null) {
            view.setContentDescription(this.f28234C.getQuantityString(C3180A.f40298a, iG, Integer.valueOf(iG)));
        }
    }

    private void r0(ImageView imageView, boolean z10) {
        if (imageView == null) {
            return;
        }
        if (z10) {
            imageView.setImageDrawable(this.f28243G0);
            imageView.setContentDescription(this.f28247I0);
        } else {
            imageView.setImageDrawable(this.f28245H0);
            imageView.setContentDescription(this.f28249J0);
        }
    }

    private static void s0(View view, boolean z10) {
        if (view == null) {
            return;
        }
        if (z10) {
            view.setVisibility(0);
        } else {
            view.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPlaybackSpeed(float f10) {
        U1.B b10 = this.f28251K0;
        if (b10 == null || !b10.R(13)) {
            return;
        }
        U1.B b11 = this.f28251K0;
        b11.e(b11.h().b(f10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u0() {
        boolean zR;
        boolean zR2;
        boolean zR3;
        boolean zR4;
        boolean zR5;
        if (e0() && this.f28257N0) {
            U1.B b10 = this.f28251K0;
            if (b10 != null) {
                zR = (this.f28259O0 && T(b10, this.f28292m0)) ? b10.R(10) : b10.R(5);
                zR3 = b10.R(7);
                zR4 = b10.R(11);
                zR5 = b10.R(12);
                zR2 = b10.R(9);
            } else {
                zR = false;
                zR2 = false;
                zR3 = false;
                zR4 = false;
                zR5 = false;
            }
            if (zR4) {
                z0();
            }
            if (zR5) {
                q0();
            }
            p0(zR3, this.f28256N);
            p0(zR4, this.f28264R);
            p0(zR5, this.f28262Q);
            p0(zR2, this.f28258O);
            G g10 = this.f28288i0;
            if (g10 != null) {
                g10.setEnabled(zR);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void v0() {
        if (e0() && this.f28257N0 && this.f28260P != null) {
            boolean zI1 = L.i1(this.f28251K0, this.f28261P0);
            Drawable drawable = zI1 ? this.f28294o0 : this.f28295p0;
            int i10 = zI1 ? C3181B.f40311g : C3181B.f40310f;
            this.f28260P.setImageDrawable(drawable);
            this.f28260P.setContentDescription(this.f28234C.getString(i10));
            p0(m0(), this.f28260P);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void w0() {
        U1.B b10 = this.f28251K0;
        if (b10 == null) {
            return;
        }
        this.f28244H.N(b10.h().f16775a);
        this.f28242G.L(0, this.f28244H.J());
        A0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x0() {
        long jI;
        long jC0;
        if (e0() && this.f28257N0) {
            U1.B b10 = this.f28251K0;
            if (b10 == null || !b10.R(16)) {
                jI = 0;
                jC0 = 0;
            } else {
                jI = this.f28278Z0 + b10.I();
                jC0 = this.f28278Z0 + b10.c0();
            }
            TextView textView = this.f28287h0;
            if (textView != null && !this.f28265R0) {
                textView.setText(L.n0(this.f28289j0, this.f28290k0, jI));
            }
            G g10 = this.f28288i0;
            if (g10 != null) {
                g10.setPosition(jI);
                this.f28288i0.setBufferedPosition(jC0);
            }
            removeCallbacks(this.f28293n0);
            int iK = b10 == null ? 1 : b10.K();
            if (b10 == null || !b10.N()) {
                if (iK == 4 || iK == 1) {
                    return;
                }
                postDelayed(this.f28293n0, 1000L);
                return;
            }
            G g11 = this.f28288i0;
            long jMin = Math.min(g11 != null ? g11.getPreferredUpdateDelay() : 1000L, 1000 - (jI % 1000));
            float f10 = b10.h().f16775a;
            postDelayed(this.f28293n0, L.q(f10 > 0.0f ? (long) (jMin / f10) : 1000L, this.f28269T0, 1000L));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void y0() {
        ImageView imageView;
        if (e0() && this.f28257N0 && (imageView = this.f28270U) != null) {
            if (this.f28271U0 == 0) {
                p0(false, imageView);
                return;
            }
            U1.B b10 = this.f28251K0;
            if (b10 == null || !b10.R(15)) {
                p0(false, this.f28270U);
                this.f28270U.setImageDrawable(this.f28296q0);
                this.f28270U.setContentDescription(this.f28299t0);
                return;
            }
            p0(true, this.f28270U);
            int iW = b10.W();
            if (iW == 0) {
                this.f28270U.setImageDrawable(this.f28296q0);
                this.f28270U.setContentDescription(this.f28299t0);
            } else if (iW == 1) {
                this.f28270U.setImageDrawable(this.f28297r0);
                this.f28270U.setContentDescription(this.f28300u0);
            } else {
                if (iW != 2) {
                    return;
                }
                this.f28270U.setImageDrawable(this.f28298s0);
                this.f28270U.setContentDescription(this.f28301v0);
            }
        }
    }

    private void z0() {
        U1.B b10 = this.f28251K0;
        int iJ0 = (int) ((b10 != null ? b10.j0() : Config.MC_BROADCAST_INTERVAL_WIFI) / 1000);
        TextView textView = this.f28268T;
        if (textView != null) {
            textView.setText(String.valueOf(iJ0));
        }
        View view = this.f28264R;
        if (view != null) {
            view.setContentDescription(this.f28234C.getQuantityString(C3180A.f40299b, iJ0, Integer.valueOf(iJ0)));
        }
    }

    @Deprecated
    public void S(m mVar) {
        C1804a.e(mVar);
        this.f28238E.add(mVar);
    }

    public boolean U(KeyEvent keyEvent) {
        int keyCode = keyEvent.getKeyCode();
        U1.B b10 = this.f28251K0;
        if (b10 == null || !d0(keyCode)) {
            return false;
        }
        if (keyEvent.getAction() != 0) {
            return true;
        }
        if (keyCode == 90) {
            if (b10.K() == 4 || !b10.R(12)) {
                return true;
            }
            b10.e0();
            return true;
        }
        if (keyCode == 89 && b10.R(11)) {
            b10.g0();
            return true;
        }
        if (keyEvent.getRepeatCount() != 0) {
            return true;
        }
        if (keyCode == 79 || keyCode == 85) {
            L.w0(b10, this.f28261P0);
            return true;
        }
        if (keyCode == 87) {
            if (!b10.R(9)) {
                return true;
            }
            b10.d0();
            return true;
        }
        if (keyCode == 88) {
            if (!b10.R(7)) {
                return true;
            }
            b10.D();
            return true;
        }
        if (keyCode == 126) {
            L.v0(b10);
            return true;
        }
        if (keyCode != 127) {
            return true;
        }
        L.u0(b10);
        return true;
    }

    public void Y() {
        this.f28232B.C();
    }

    public void Z() {
        this.f28232B.F();
    }

    public boolean c0() {
        return this.f28232B.I();
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return U(keyEvent) || super.dispatchKeyEvent(keyEvent);
    }

    public boolean e0() {
        return getVisibility() == 0;
    }

    void f0() {
        Iterator<m> it = this.f28238E.iterator();
        while (it.hasNext()) {
            it.next().I(getVisibility());
        }
    }

    public U1.B getPlayer() {
        return this.f28251K0;
    }

    public int getRepeatToggleModes() {
        return this.f28271U0;
    }

    public boolean getShowShuffleButton() {
        return this.f28232B.A(this.f28272V);
    }

    public boolean getShowSubtitleButton() {
        return this.f28232B.A(this.f28279a0);
    }

    public int getShowTimeoutMs() {
        return this.f28267S0;
    }

    public boolean getShowVrButton() {
        return this.f28232B.A(this.f28274W);
    }

    @Deprecated
    public void j0(m mVar) {
        this.f28238E.remove(mVar);
    }

    void k0() {
        ImageView imageView = this.f28260P;
        if (imageView != null) {
            imageView.requestFocus();
        }
    }

    public void n0() {
        this.f28232B.b0();
    }

    void o0() {
        v0();
        u0();
        y0();
        C0();
        E0();
        w0();
        D0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f28232B.O();
        this.f28257N0 = true;
        if (c0()) {
            this.f28232B.W();
        }
        o0();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f28232B.P();
        this.f28257N0 = false;
        removeCallbacks(this.f28293n0);
        this.f28232B.V();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        this.f28232B.Q(z10, i10, i11, i12, i13);
    }

    public void setAnimationEnabled(boolean z10) {
        this.f28232B.X(z10);
    }

    @Deprecated
    public void setOnFullScreenModeChangedListener(InterfaceC0385d interfaceC0385d) {
        this.f28253L0 = interfaceC0385d;
        s0(this.f28281b0, interfaceC0385d != null);
        s0(this.f28282c0, interfaceC0385d != null);
    }

    public void setPlayer(U1.B b10) {
        C1804a.g(Looper.myLooper() == Looper.getMainLooper());
        C1804a.a(b10 == null || b10.Y() == Looper.getMainLooper());
        U1.B b11 = this.f28251K0;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.H(this.f28236D);
        }
        this.f28251K0 = b10;
        if (b10 != null) {
            b10.C(this.f28236D);
        }
        o0();
    }

    public void setRepeatToggleModes(int i10) {
        this.f28271U0 = i10;
        U1.B b10 = this.f28251K0;
        if (b10 != null && b10.R(15)) {
            int iW = this.f28251K0.W();
            if (i10 == 0 && iW != 0) {
                this.f28251K0.S(0);
            } else if (i10 == 1 && iW == 2) {
                this.f28251K0.S(1);
            } else if (i10 == 2 && iW == 1) {
                this.f28251K0.S(2);
            }
        }
        this.f28232B.Y(this.f28270U, i10 != 0);
        y0();
    }

    public void setShowFastForwardButton(boolean z10) {
        this.f28232B.Y(this.f28262Q, z10);
        u0();
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        this.f28259O0 = z10;
        D0();
    }

    public void setShowNextButton(boolean z10) {
        this.f28232B.Y(this.f28258O, z10);
        u0();
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        this.f28261P0 = z10;
        v0();
    }

    public void setShowPreviousButton(boolean z10) {
        this.f28232B.Y(this.f28256N, z10);
        u0();
    }

    public void setShowRewindButton(boolean z10) {
        this.f28232B.Y(this.f28264R, z10);
        u0();
    }

    public void setShowShuffleButton(boolean z10) {
        this.f28232B.Y(this.f28272V, z10);
        C0();
    }

    public void setShowSubtitleButton(boolean z10) {
        this.f28232B.Y(this.f28279a0, z10);
    }

    public void setShowTimeoutMs(int i10) {
        this.f28267S0 = i10;
        if (c0()) {
            this.f28232B.W();
        }
    }

    public void setShowVrButton(boolean z10) {
        this.f28232B.Y(this.f28274W, z10);
    }

    public void setTimeBarMinUpdateInterval(int i10) {
        this.f28269T0 = L.p(i10, 16, 1000);
    }

    public void setVrButtonListener(View.OnClickListener onClickListener) {
        ImageView imageView = this.f28274W;
        if (imageView != null) {
            imageView.setOnClickListener(onClickListener);
            p0(onClickListener != null, this.f28274W);
        }
    }

    public void t0(boolean z10) {
        if (this.f28255M0 == z10) {
            return;
        }
        this.f28255M0 = z10;
        r0(this.f28281b0, z10);
        r0(this.f28282c0, z10);
        InterfaceC0385d interfaceC0385d = this.f28253L0;
        if (interfaceC0385d != null) {
            interfaceC0385d.D(z10);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: PlayerControlView.java */
    /* renamed from: androidx.media3.ui.d$j */
    final class j extends l {
        private j() {
            super();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void R(View view) {
            if (C2159d.this.f28251K0 == null || !C2159d.this.f28251K0.R(29)) {
                return;
            }
            C2159d.this.f28251K0.A(C2159d.this.f28251K0.b0().a().D(3).H(-3).J(null).M(0).C());
            C2159d.this.f28252L.dismiss();
        }

        @Override // androidx.media3.ui.C2159d.l, androidx.recyclerview.widget.RecyclerView.h
        /* renamed from: L, reason: merged with bridge method [inline-methods] */
        public void w(i iVar, int i10) {
            super.w(iVar, i10);
            if (i10 > 0) {
                iVar.f28321C.setVisibility(this.f28326E.get(i10 + (-1)).a() ? 0 : 4);
            }
        }

        @Override // androidx.media3.ui.C2159d.l
        public void M(i iVar) {
            boolean z10;
            iVar.f28320B.setText(C3181B.f40328x);
            int i10 = 0;
            while (true) {
                if (i10 >= this.f28326E.size()) {
                    z10 = true;
                    break;
                } else {
                    if (this.f28326E.get(i10).a()) {
                        z10 = false;
                        break;
                    }
                    i10++;
                }
            }
            iVar.f28321C.setVisibility(z10 ? 0 : 4);
            iVar.itemView.setOnClickListener(new View.OnClickListener() { // from class: androidx.media3.ui.h
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    this.f28332B.R(view);
                }
            });
        }

        public void Q(List<k> list) {
            boolean z10 = false;
            int i10 = 0;
            while (true) {
                if (i10 >= list.size()) {
                    break;
                }
                if (list.get(i10).a()) {
                    z10 = true;
                    break;
                }
                i10++;
            }
            if (C2159d.this.f28279a0 != null) {
                ImageView imageView = C2159d.this.f28279a0;
                C2159d c2159d = C2159d.this;
                imageView.setImageDrawable(z10 ? c2159d.f28235C0 : c2159d.f28237D0);
                C2159d.this.f28279a0.setContentDescription(z10 ? C2159d.this.f28239E0 : C2159d.this.f28241F0);
            }
            this.f28326E = list;
        }

        @Override // androidx.media3.ui.C2159d.l
        public void O(String str) {
        }
    }

    public void setProgressUpdateListener(f fVar) {
    }
}
