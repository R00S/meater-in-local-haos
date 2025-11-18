package androidx.media3.ui;

import U1.B;
import U1.C1725a;
import U1.G;
import U1.K;
import U1.N;
import X1.C1804a;
import X1.L;
import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.opengl.GLSurfaceView;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.view.AttachedSurfaceControl;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import android.window.SurfaceSyncGroup;
import androidx.media3.common.PlaybackException;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.exoplayer.image.ImageOutput;
import androidx.media3.ui.AspectRatioFrameLayout;
import androidx.media3.ui.C2159d;
import androidx.media3.ui.PlayerView;
import e3.C3181B;
import e3.C3183D;
import g1.C3377a;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.List;
import m8.AbstractC4009y;
import t2.C4543f;

/* loaded from: classes.dex */
public class PlayerView extends FrameLayout {

    /* renamed from: B, reason: collision with root package name */
    private final c f28120B;

    /* renamed from: C, reason: collision with root package name */
    private final AspectRatioFrameLayout f28121C;

    /* renamed from: D, reason: collision with root package name */
    private final View f28122D;

    /* renamed from: E, reason: collision with root package name */
    private final View f28123E;

    /* renamed from: F, reason: collision with root package name */
    private final boolean f28124F;

    /* renamed from: G, reason: collision with root package name */
    private final f f28125G;

    /* renamed from: H, reason: collision with root package name */
    private final ImageView f28126H;

    /* renamed from: I, reason: collision with root package name */
    private final ImageView f28127I;

    /* renamed from: J, reason: collision with root package name */
    private final SubtitleView f28128J;

    /* renamed from: K, reason: collision with root package name */
    private final View f28129K;

    /* renamed from: L, reason: collision with root package name */
    private final TextView f28130L;

    /* renamed from: M, reason: collision with root package name */
    private final C2159d f28131M;

    /* renamed from: N, reason: collision with root package name */
    private final FrameLayout f28132N;

    /* renamed from: O, reason: collision with root package name */
    private final FrameLayout f28133O;

    /* renamed from: P, reason: collision with root package name */
    private final Handler f28134P;

    /* renamed from: Q, reason: collision with root package name */
    private final Class<?> f28135Q;

    /* renamed from: R, reason: collision with root package name */
    private final Method f28136R;

    /* renamed from: S, reason: collision with root package name */
    private final Object f28137S;

    /* renamed from: T, reason: collision with root package name */
    private U1.B f28138T;

    /* renamed from: U, reason: collision with root package name */
    private boolean f28139U;

    /* renamed from: V, reason: collision with root package name */
    private d f28140V;

    /* renamed from: W, reason: collision with root package name */
    private C2159d.m f28141W;

    /* renamed from: a0, reason: collision with root package name */
    private int f28142a0;

    /* renamed from: b0, reason: collision with root package name */
    private int f28143b0;

    /* renamed from: c0, reason: collision with root package name */
    private Drawable f28144c0;

    /* renamed from: d0, reason: collision with root package name */
    private int f28145d0;

    /* renamed from: e0, reason: collision with root package name */
    private boolean f28146e0;

    /* renamed from: f0, reason: collision with root package name */
    private CharSequence f28147f0;

    /* renamed from: g0, reason: collision with root package name */
    private int f28148g0;

    /* renamed from: h0, reason: collision with root package name */
    private boolean f28149h0;

    /* renamed from: i0, reason: collision with root package name */
    private boolean f28150i0;

    /* renamed from: j0, reason: collision with root package name */
    private boolean f28151j0;

    /* renamed from: k0, reason: collision with root package name */
    private boolean f28152k0;

    private static class b {
        public static void a(SurfaceView surfaceView) {
            surfaceView.setSurfaceLifecycle(2);
        }
    }

    private final class c implements B.d, View.OnClickListener, C2159d.m, C2159d.InterfaceC0385d {

        /* renamed from: B, reason: collision with root package name */
        private final G.b f28153B = new G.b();

        /* renamed from: C, reason: collision with root package name */
        private Object f28154C;

        public c() {
        }

        @Override // androidx.media3.ui.C2159d.InterfaceC0385d
        public void D(boolean z10) {
            PlayerView.p(PlayerView.this);
        }

        @Override // androidx.media3.ui.C2159d.m
        public void I(int i10) {
            PlayerView.this.b0();
            if (PlayerView.this.f28140V != null) {
                PlayerView.this.f28140V.a(i10);
            }
        }

        @Override // U1.B.d
        public void K(K k10) {
            U1.B b10 = (U1.B) C1804a.e(PlayerView.this.f28138T);
            U1.G gX = b10.R(17) ? b10.X() : U1.G.f16812a;
            if (gX.q()) {
                this.f28154C = null;
            } else if (!b10.R(30) || b10.L().b()) {
                Object obj = this.f28154C;
                if (obj != null) {
                    int iB = gX.b(obj);
                    if (iB != -1) {
                        if (b10.Q() == gX.f(iB, this.f28153B).f16823c) {
                            return;
                        }
                    }
                    this.f28154C = null;
                }
            } else {
                this.f28154C = gX.g(b10.s(), this.f28153B, true).f16822b;
            }
            PlayerView.this.e0(false);
        }

        @Override // U1.B.d
        public void N(int i10) {
            PlayerView.this.a0();
            PlayerView.this.d0();
            PlayerView.this.c0();
        }

        @Override // U1.B.d
        public void U(B.e eVar, B.e eVar2, int i10) {
            if (PlayerView.this.K() && PlayerView.this.f28150i0) {
                PlayerView.this.G();
            }
        }

        @Override // U1.B.d
        public void d(N n10) {
            if (n10.equals(N.f16982e) || PlayerView.this.f28138T == null || PlayerView.this.f28138T.K() == 1) {
                return;
            }
            PlayerView.this.Z();
        }

        @Override // U1.B.d
        public void d0() {
            if (PlayerView.this.f28122D != null) {
                PlayerView.this.f28122D.setVisibility(4);
                if (PlayerView.this.C()) {
                    PlayerView.this.H();
                } else {
                    PlayerView.this.E();
                }
            }
        }

        @Override // U1.B.d
        public void g0(boolean z10, int i10) {
            PlayerView.this.a0();
            PlayerView.this.c0();
        }

        @Override // U1.B.d
        public void i(W1.b bVar) {
            if (PlayerView.this.f28128J != null) {
                PlayerView.this.f28128J.setCues(bVar.f18336a);
            }
        }

        @Override // U1.B.d
        public void k0(int i10, int i11) {
            if (L.f18626a == 34 && (PlayerView.this.f28123E instanceof SurfaceView) && PlayerView.this.f28152k0) {
                f fVar = (f) C1804a.e(PlayerView.this.f28125G);
                Handler handler = PlayerView.this.f28134P;
                SurfaceView surfaceView = (SurfaceView) PlayerView.this.f28123E;
                final PlayerView playerView = PlayerView.this;
                fVar.f(handler, surfaceView, new Runnable() { // from class: e3.l
                    @Override // java.lang.Runnable
                    public final void run() {
                        playerView.invalidate();
                    }
                });
            }
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            PlayerView.this.Y();
        }
    }

    public interface d {
        void a(int i10);
    }

    public interface e {
    }

    public PlayerView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    private static void A(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(L.Y(context, resources, e3.v.f40425a));
        imageView.setBackgroundColor(resources.getColor(e3.t.f40420a, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean C() {
        U1.B b10 = this.f28138T;
        return b10 != null && this.f28137S != null && b10.R(30) && b10.L().c(4);
    }

    private boolean D() {
        U1.B b10 = this.f28138T;
        return b10 != null && b10.R(30) && b10.L().c(2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void E() {
        H();
        ImageView imageView = this.f28126H;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
        }
    }

    private void F() {
        ImageView imageView = this.f28127I;
        if (imageView != null) {
            imageView.setImageResource(R.color.transparent);
            this.f28127I.setVisibility(4);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void H() {
        ImageView imageView = this.f28126H;
        if (imageView != null) {
            imageView.setVisibility(4);
        }
    }

    @SuppressLint({"InlinedApi"})
    private boolean I(int i10) {
        return i10 == 19 || i10 == 270 || i10 == 22 || i10 == 271 || i10 == 20 || i10 == 269 || i10 == 21 || i10 == 268 || i10 == 23;
    }

    private boolean J() {
        Drawable drawable;
        ImageView imageView = this.f28126H;
        return (imageView == null || (drawable = imageView.getDrawable()) == null || drawable.getAlpha() == 0) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean K() {
        U1.B b10 = this.f28138T;
        return b10 != null && b10.R(16) && this.f28138T.k() && this.f28138T.o();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ Object L(Object obj, Method method, Object[] objArr) {
        if (!method.getName().equals("onImageAvailable")) {
            return null;
        }
        P((Bitmap) objArr[1]);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void M(Bitmap bitmap) {
        setImage(new BitmapDrawable(getResources(), bitmap));
        if (D()) {
            return;
        }
        X();
        y();
    }

    private void N(boolean z10) {
        if (!(K() && this.f28150i0) && h0()) {
            boolean z11 = this.f28131M.c0() && this.f28131M.getShowTimeoutMs() <= 0;
            boolean zU = U();
            if (z10 || z11 || zU) {
                W(zU);
            }
        }
    }

    private void P(final Bitmap bitmap) {
        this.f28134P.post(new Runnable() { // from class: e3.j
            @Override // java.lang.Runnable
            public final void run() {
                this.f40416B.M(bitmap);
            }
        });
    }

    private boolean R(U1.B b10) {
        byte[] bArr;
        if (b10 == null || !b10.R(18) || (bArr = b10.h0().f17420i) == null) {
            return false;
        }
        return S(new BitmapDrawable(getResources(), BitmapFactory.decodeByteArray(bArr, 0, bArr.length)));
    }

    private boolean S(Drawable drawable) {
        if (this.f28127I != null && drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicWidth > 0 && intrinsicHeight > 0) {
                float width = intrinsicWidth / intrinsicHeight;
                ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
                if (this.f28142a0 == 2) {
                    width = getWidth() / getHeight();
                    scaleType = ImageView.ScaleType.CENTER_CROP;
                }
                O(this.f28121C, width);
                this.f28127I.setScaleType(scaleType);
                this.f28127I.setImageDrawable(drawable);
                this.f28127I.setVisibility(0);
                return true;
            }
        }
        return false;
    }

    private static void T(AspectRatioFrameLayout aspectRatioFrameLayout, int i10) {
        aspectRatioFrameLayout.setResizeMode(i10);
    }

    private boolean U() {
        U1.B b10 = this.f28138T;
        if (b10 == null) {
            return true;
        }
        int iK = b10.K();
        return this.f28149h0 && !(this.f28138T.R(17) && this.f28138T.X().q()) && (iK == 1 || iK == 4 || !((U1.B) C1804a.e(this.f28138T)).o());
    }

    private void W(boolean z10) {
        if (h0()) {
            this.f28131M.setShowTimeoutMs(z10 ? 0 : this.f28148g0);
            this.f28131M.n0();
        }
    }

    private void X() {
        ImageView imageView = this.f28126H;
        if (imageView != null) {
            imageView.setVisibility(0);
            f0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Y() {
        if (!h0() || this.f28138T == null) {
            return;
        }
        if (!this.f28131M.c0()) {
            N(true);
        } else if (this.f28151j0) {
            this.f28131M.Y();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void Z() {
        U1.B b10 = this.f28138T;
        N nU = b10 != null ? b10.u() : N.f16982e;
        int i10 = nU.f16986a;
        int i11 = nU.f16987b;
        O(this.f28121C, this.f28124F ? 0.0f : (i11 == 0 || i10 == 0) ? 0.0f : (i10 * nU.f16989d) / i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0020  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void a0() {
        /*
            r4 = this;
            android.view.View r0 = r4.f28129K
            if (r0 == 0) goto L2b
            U1.B r0 = r4.f28138T
            r1 = 0
            if (r0 == 0) goto L20
            int r0 = r0.K()
            r2 = 2
            if (r0 != r2) goto L20
            int r0 = r4.f28145d0
            r3 = 1
            if (r0 == r2) goto L21
            if (r0 != r3) goto L20
            U1.B r0 = r4.f28138T
            boolean r0 = r0.o()
            if (r0 == 0) goto L20
            goto L21
        L20:
            r3 = r1
        L21:
            android.view.View r0 = r4.f28129K
            if (r3 == 0) goto L26
            goto L28
        L26:
            r1 = 8
        L28:
            r0.setVisibility(r1)
        L2b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.media3.ui.PlayerView.a0():void");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b0() {
        C2159d c2159d = this.f28131M;
        if (c2159d == null || !this.f28139U) {
            setContentDescription(null);
        } else if (c2159d.c0()) {
            setContentDescription(this.f28151j0 ? getResources().getString(C3181B.f40309e) : null);
        } else {
            setContentDescription(getResources().getString(C3181B.f40316l));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void c0() {
        if (K() && this.f28150i0) {
            G();
        } else {
            N(false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void d0() {
        TextView textView = this.f28130L;
        if (textView != null) {
            CharSequence charSequence = this.f28147f0;
            if (charSequence != null) {
                textView.setText(charSequence);
                this.f28130L.setVisibility(0);
            } else {
                U1.B b10 = this.f28138T;
                if (b10 != null) {
                    b10.E();
                }
                this.f28130L.setVisibility(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void e0(boolean z10) {
        U1.B b10 = this.f28138T;
        boolean z11 = false;
        boolean z12 = (b10 == null || !b10.R(30) || b10.L().b()) ? false : true;
        if (!this.f28146e0 && (!z12 || z10)) {
            F();
            y();
            E();
        }
        if (z12) {
            boolean zD = D();
            boolean zC = C();
            if (!zD && !zC) {
                y();
                E();
            }
            View view = this.f28122D;
            if (view != null && view.getVisibility() == 4 && J()) {
                z11 = true;
            }
            if (zC && !zD && z11) {
                y();
                X();
            } else if (zD && !zC && z11) {
                E();
            }
            if (zD || zC || !g0() || !(R(b10) || S(this.f28144c0))) {
                F();
            }
        }
    }

    private void f0() {
        Drawable drawable;
        ImageView imageView = this.f28126H;
        if (imageView == null || (drawable = imageView.getDrawable()) == null) {
            return;
        }
        int intrinsicWidth = drawable.getIntrinsicWidth();
        int intrinsicHeight = drawable.getIntrinsicHeight();
        if (intrinsicWidth <= 0 || intrinsicHeight <= 0) {
            return;
        }
        float width = intrinsicWidth / intrinsicHeight;
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_XY;
        if (this.f28143b0 == 1) {
            width = getWidth() / getHeight();
            scaleType = ImageView.ScaleType.CENTER_CROP;
        }
        if (this.f28126H.getVisibility() == 0) {
            O(this.f28121C, width);
        }
        this.f28126H.setScaleType(scaleType);
    }

    private boolean g0() {
        if (this.f28142a0 == 0) {
            return false;
        }
        C1804a.i(this.f28127I);
        return true;
    }

    private boolean h0() {
        if (!this.f28139U) {
            return false;
        }
        C1804a.i(this.f28131M);
        return true;
    }

    static /* synthetic */ e p(PlayerView playerView) {
        playerView.getClass();
        return null;
    }

    private void setImage(Drawable drawable) {
        ImageView imageView = this.f28126H;
        if (imageView == null) {
            return;
        }
        imageView.setImageDrawable(drawable);
        f0();
    }

    private void setImageOutput(U1.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f28135Q;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C1804a.e(this.f28136R)).invoke(b10, C1804a.e(this.f28137S));
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void x(U1.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        Class<?> cls = this.f28135Q;
        if (cls == null || !cls.isAssignableFrom(b10.getClass())) {
            return;
        }
        try {
            ((Method) C1804a.e(this.f28136R)).invoke(b10, null);
        } catch (IllegalAccessException | InvocationTargetException e10) {
            throw new RuntimeException(e10);
        }
    }

    private void y() {
        View view = this.f28122D;
        if (view != null) {
            view.setVisibility(0);
        }
    }

    private static void z(Context context, Resources resources, ImageView imageView) {
        imageView.setImageDrawable(L.Y(context, resources, e3.v.f40425a));
        imageView.setBackgroundColor(resources.getColor(e3.t.f40420a));
    }

    public boolean B(KeyEvent keyEvent) {
        return h0() && this.f28131M.U(keyEvent);
    }

    public void G() {
        C2159d c2159d = this.f28131M;
        if (c2159d != null) {
            c2159d.Y();
        }
    }

    protected void O(AspectRatioFrameLayout aspectRatioFrameLayout, float f10) {
        if (aspectRatioFrameLayout != null) {
            aspectRatioFrameLayout.setAspectRatio(f10);
        }
    }

    public void Q() {
        View view = this.f28123E;
        if (view instanceof GLSurfaceView) {
            ((GLSurfaceView) view).onPause();
        }
    }

    public void V() {
        W(U());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        f fVar;
        super.dispatchDraw(canvas);
        if (L.f18626a == 34 && (fVar = this.f28125G) != null && this.f28152k0) {
            fVar.e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        U1.B b10 = this.f28138T;
        if (b10 != null && b10.R(16) && this.f28138T.k()) {
            return super.dispatchKeyEvent(keyEvent);
        }
        boolean zI = I(keyEvent.getKeyCode());
        if (zI && h0() && !this.f28131M.c0()) {
            N(true);
            return true;
        }
        if (B(keyEvent) || super.dispatchKeyEvent(keyEvent)) {
            N(true);
            return true;
        }
        if (zI && h0()) {
            N(true);
        }
        return false;
    }

    public List<C1725a> getAdOverlayInfos() {
        ArrayList arrayList = new ArrayList();
        FrameLayout frameLayout = this.f28133O;
        if (frameLayout != null) {
            arrayList.add(new C1725a.C0256a(frameLayout, 4).b("Transparent overlay does not impact viewability").a());
        }
        C2159d c2159d = this.f28131M;
        if (c2159d != null) {
            arrayList.add(new C1725a.C0256a(c2159d, 1).a());
        }
        return AbstractC4009y.B(arrayList);
    }

    public ViewGroup getAdViewGroup() {
        return (ViewGroup) C1804a.j(this.f28132N, "exo_ad_overlay must be present for ad playback");
    }

    public int getArtworkDisplayMode() {
        return this.f28142a0;
    }

    public boolean getControllerAutoShow() {
        return this.f28149h0;
    }

    public boolean getControllerHideOnTouch() {
        return this.f28151j0;
    }

    public int getControllerShowTimeoutMs() {
        return this.f28148g0;
    }

    public Drawable getDefaultArtwork() {
        return this.f28144c0;
    }

    public int getImageDisplayMode() {
        return this.f28143b0;
    }

    public FrameLayout getOverlayFrameLayout() {
        return this.f28133O;
    }

    public U1.B getPlayer() {
        return this.f28138T;
    }

    public int getResizeMode() {
        C1804a.i(this.f28121C);
        return this.f28121C.getResizeMode();
    }

    public SubtitleView getSubtitleView() {
        return this.f28128J;
    }

    @Deprecated
    public boolean getUseArtwork() {
        return this.f28142a0 != 0;
    }

    public boolean getUseController() {
        return this.f28139U;
    }

    public View getVideoSurfaceView() {
        return this.f28123E;
    }

    @Override // android.view.View
    public boolean onTrackballEvent(MotionEvent motionEvent) {
        if (!h0() || this.f28138T == null) {
            return false;
        }
        N(true);
        return true;
    }

    @Override // android.view.View
    public boolean performClick() {
        Y();
        return super.performClick();
    }

    public void setArtworkDisplayMode(int i10) {
        C1804a.g(i10 == 0 || this.f28127I != null);
        if (this.f28142a0 != i10) {
            this.f28142a0 = i10;
            e0(false);
        }
    }

    public void setAspectRatioListener(AspectRatioFrameLayout.b bVar) {
        C1804a.i(this.f28121C);
        this.f28121C.setAspectRatioListener(bVar);
    }

    public void setControllerAnimationEnabled(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setAnimationEnabled(z10);
    }

    public void setControllerAutoShow(boolean z10) {
        this.f28149h0 = z10;
    }

    public void setControllerHideDuringAds(boolean z10) {
        this.f28150i0 = z10;
    }

    public void setControllerHideOnTouch(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28151j0 = z10;
        b0();
    }

    @Deprecated
    public void setControllerOnFullScreenModeChangedListener(C2159d.InterfaceC0385d interfaceC0385d) {
        C1804a.i(this.f28131M);
        this.f28131M.setOnFullScreenModeChangedListener(interfaceC0385d);
    }

    public void setControllerShowTimeoutMs(int i10) {
        C1804a.i(this.f28131M);
        this.f28148g0 = i10;
        if (this.f28131M.c0()) {
            V();
        }
    }

    public void setControllerVisibilityListener(d dVar) {
        if (dVar != null) {
            setControllerVisibilityListener((C2159d.m) null);
        }
    }

    public void setCustomErrorMessage(CharSequence charSequence) {
        C1804a.g(this.f28130L != null);
        this.f28147f0 = charSequence;
        d0();
    }

    public void setDefaultArtwork(Drawable drawable) {
        if (this.f28144c0 != drawable) {
            this.f28144c0 = drawable;
            e0(false);
        }
    }

    public void setEnableComposeSurfaceSyncWorkaround(boolean z10) {
        this.f28152k0 = z10;
    }

    public void setErrorMessageProvider(U1.o<? super PlaybackException> oVar) {
        if (oVar != null) {
            d0();
        }
    }

    public void setFullscreenButtonClickListener(e eVar) {
        C1804a.i(this.f28131M);
        this.f28131M.setOnFullScreenModeChangedListener(this.f28120B);
    }

    public void setFullscreenButtonState(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.t0(z10);
    }

    public void setImageDisplayMode(int i10) {
        C1804a.g(this.f28126H != null);
        if (this.f28143b0 != i10) {
            this.f28143b0 = i10;
            f0();
        }
    }

    public void setKeepContentOnPlayerReset(boolean z10) {
        if (this.f28146e0 != z10) {
            this.f28146e0 = z10;
            e0(false);
        }
    }

    public void setPlayer(U1.B b10) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        C1804a.g(Looper.myLooper() == Looper.getMainLooper());
        C1804a.a(b10 == null || b10.Y() == Looper.getMainLooper());
        U1.B b11 = this.f28138T;
        if (b11 == b10) {
            return;
        }
        if (b11 != null) {
            b11.H(this.f28120B);
            if (b11.R(27)) {
                View view = this.f28123E;
                if (view instanceof TextureView) {
                    b11.t((TextureView) view);
                } else if (view instanceof SurfaceView) {
                    b11.T((SurfaceView) view);
                }
            }
            x(b11);
        }
        SubtitleView subtitleView = this.f28128J;
        if (subtitleView != null) {
            subtitleView.setCues(null);
        }
        this.f28138T = b10;
        if (h0()) {
            this.f28131M.setPlayer(b10);
        }
        a0();
        d0();
        e0(true);
        if (b10 == null) {
            G();
            return;
        }
        if (b10.R(27)) {
            View view2 = this.f28123E;
            if (view2 instanceof TextureView) {
                b10.f0((TextureView) view2);
            } else if (view2 instanceof SurfaceView) {
                b10.z((SurfaceView) view2);
            }
            if (!b10.R(30) || b10.L().d(2)) {
                Z();
            }
        }
        if (this.f28128J != null && b10.R(28)) {
            this.f28128J.setCues(b10.O().f18336a);
        }
        b10.C(this.f28120B);
        setImageOutput(b10);
        N(false);
    }

    public void setRepeatToggleModes(int i10) {
        C1804a.i(this.f28131M);
        this.f28131M.setRepeatToggleModes(i10);
    }

    public void setResizeMode(int i10) {
        C1804a.i(this.f28121C);
        this.f28121C.setResizeMode(i10);
    }

    public void setShowBuffering(int i10) {
        if (this.f28145d0 != i10) {
            this.f28145d0 = i10;
            a0();
        }
    }

    public void setShowFastForwardButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowFastForwardButton(z10);
    }

    @Deprecated
    public void setShowMultiWindowTimeBar(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowMultiWindowTimeBar(z10);
    }

    public void setShowNextButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowNextButton(z10);
    }

    public void setShowPlayButtonIfPlaybackIsSuppressed(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowPlayButtonIfPlaybackIsSuppressed(z10);
    }

    public void setShowPreviousButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowPreviousButton(z10);
    }

    public void setShowRewindButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowRewindButton(z10);
    }

    public void setShowShuffleButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowShuffleButton(z10);
    }

    public void setShowSubtitleButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowSubtitleButton(z10);
    }

    public void setShowVrButton(boolean z10) {
        C1804a.i(this.f28131M);
        this.f28131M.setShowVrButton(z10);
    }

    public void setShutterBackgroundColor(int i10) {
        View view = this.f28122D;
        if (view != null) {
            view.setBackgroundColor(i10);
        }
    }

    @Deprecated
    public void setUseArtwork(boolean z10) {
        setArtworkDisplayMode(!z10 ? 1 : 0);
    }

    public void setUseController(boolean z10) {
        boolean z11 = true;
        C1804a.g((z10 && this.f28131M == null) ? false : true);
        if (!z10 && !hasOnClickListeners()) {
            z11 = false;
        }
        setClickable(z11);
        if (this.f28139U == z10) {
            return;
        }
        this.f28139U = z10;
        if (h0()) {
            this.f28131M.setPlayer(this.f28138T);
        } else {
            C2159d c2159d = this.f28131M;
            if (c2159d != null) {
                c2159d.Y();
                this.f28131M.setPlayer(null);
            }
        }
        b0();
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        View view = this.f28123E;
        if (view instanceof SurfaceView) {
            view.setVisibility(i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PlayerView(Context context, AttributeSet attributeSet, int i10) throws NoSuchMethodException, SecurityException, IllegalArgumentException {
        int i11;
        int i12;
        boolean z10;
        boolean z11;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        boolean z12;
        boolean z13;
        int i19;
        boolean z14;
        boolean z15;
        a aVar;
        boolean z16;
        Class<ExoPlayer> cls;
        Object objNewProxyInstance;
        Method method;
        int i20;
        super(context, attributeSet, i10);
        c cVar = new c();
        this.f28120B = cVar;
        this.f28134P = new Handler(Looper.getMainLooper());
        if (isInEditMode()) {
            this.f28121C = null;
            this.f28122D = null;
            this.f28123E = null;
            this.f28124F = false;
            this.f28125G = null;
            this.f28126H = null;
            this.f28127I = null;
            this.f28128J = null;
            this.f28129K = null;
            this.f28130L = null;
            this.f28131M = null;
            this.f28132N = null;
            this.f28133O = null;
            this.f28135Q = null;
            this.f28136R = null;
            this.f28137S = null;
            ImageView imageView = new ImageView(context);
            if (L.f18626a >= 23) {
                A(context, getResources(), imageView);
            } else {
                z(context, getResources(), imageView);
            }
            addView(imageView);
            return;
        }
        int i21 = e3.z.f40495c;
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = context.getTheme().obtainStyledAttributes(attributeSet, C3183D.f40361b0, i10, 0);
            try {
                int i22 = C3183D.f40385n0;
                boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(i22);
                int color = typedArrayObtainStyledAttributes.getColor(i22, 0);
                int resourceId = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40377j0, i21);
                boolean z17 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40389p0, true);
                int i23 = typedArrayObtainStyledAttributes.getInt(C3183D.f40363c0, 1);
                int resourceId2 = typedArrayObtainStyledAttributes.getResourceId(C3183D.f40367e0, 0);
                int i24 = typedArrayObtainStyledAttributes.getInt(C3183D.f40373h0, 0);
                boolean z18 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40391q0, true);
                int i25 = typedArrayObtainStyledAttributes.getInt(C3183D.f40387o0, 1);
                int i26 = typedArrayObtainStyledAttributes.getInt(C3183D.f40379k0, 0);
                i11 = typedArrayObtainStyledAttributes.getInt(C3183D.f40383m0, 5000);
                boolean z19 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40371g0, true);
                z15 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40365d0, true);
                int integer = typedArrayObtainStyledAttributes.getInteger(C3183D.f40381l0, 0);
                this.f28146e0 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40375i0, this.f28146e0);
                boolean z20 = typedArrayObtainStyledAttributes.getBoolean(C3183D.f40369f0, true);
                typedArrayObtainStyledAttributes.recycle();
                i15 = resourceId2;
                z11 = z19;
                z14 = z20;
                z13 = z17;
                i12 = resourceId;
                z10 = z18;
                i18 = color;
                i16 = i26;
                i13 = i24;
                i19 = i23;
                z12 = zHasValue;
                i17 = i25;
                i14 = integer;
            } catch (Throwable th) {
                typedArrayObtainStyledAttributes.recycle();
                throw th;
            }
        } else {
            i11 = 5000;
            i12 = i21;
            z10 = true;
            z11 = true;
            i13 = 0;
            i14 = 0;
            i15 = 0;
            i16 = 0;
            i17 = 1;
            i18 = 0;
            z12 = false;
            z13 = true;
            i19 = 1;
            z14 = true;
            z15 = true;
        }
        LayoutInflater.from(context).inflate(i12, this);
        setDescendantFocusability(262144);
        AspectRatioFrameLayout aspectRatioFrameLayout = (AspectRatioFrameLayout) findViewById(e3.x.f40473i);
        this.f28121C = aspectRatioFrameLayout;
        if (aspectRatioFrameLayout != null) {
            T(aspectRatioFrameLayout, i16);
        }
        View viewFindViewById = findViewById(e3.x.f40458N);
        this.f28122D = viewFindViewById;
        if (viewFindViewById != null && z12) {
            viewFindViewById.setBackgroundColor(i18);
        }
        if (aspectRatioFrameLayout == null || i17 == 0) {
            aVar = null;
            this.f28123E = null;
            z16 = false;
        } else {
            ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-1, -1);
            if (i17 == 2) {
                this.f28123E = new TextureView(context);
            } else if (i17 == 3) {
                try {
                    int i27 = u2.l.f50392N;
                    this.f28123E = (View) u2.l.class.getConstructor(Context.class).newInstance(context);
                    z16 = true;
                    this.f28123E.setLayoutParams(layoutParams);
                    this.f28123E.setOnClickListener(cVar);
                    this.f28123E.setClickable(false);
                    aspectRatioFrameLayout.addView(this.f28123E, 0);
                    aVar = null;
                } catch (Exception e10) {
                    throw new IllegalStateException("spherical_gl_surface_view requires an ExoPlayer dependency", e10);
                }
            } else if (i17 != 4) {
                SurfaceView surfaceView = new SurfaceView(context);
                if (L.f18626a >= 34) {
                    b.a(surfaceView);
                }
                this.f28123E = surfaceView;
            } else {
                try {
                    int i28 = C4543f.f49836C;
                    this.f28123E = (View) C4543f.class.getConstructor(Context.class).newInstance(context);
                } catch (Exception e11) {
                    throw new IllegalStateException("video_decoder_gl_surface_view requires an ExoPlayer dependency", e11);
                }
            }
            z16 = false;
            this.f28123E.setLayoutParams(layoutParams);
            this.f28123E.setOnClickListener(cVar);
            this.f28123E.setClickable(false);
            aspectRatioFrameLayout.addView(this.f28123E, 0);
            aVar = null;
        }
        this.f28124F = z16;
        this.f28125G = L.f18626a == 34 ? new f() : null;
        this.f28132N = (FrameLayout) findViewById(e3.x.f40465a);
        this.f28133O = (FrameLayout) findViewById(e3.x.f40446B);
        this.f28126H = (ImageView) findViewById(e3.x.f40485u);
        this.f28143b0 = i13;
        try {
            cls = ExoPlayer.class;
            ImageOutput imageOutput = ImageOutput.f27232a;
            method = cls.getMethod("setImageOutput", ImageOutput.class);
            objNewProxyInstance = Proxy.newProxyInstance(ImageOutput.class.getClassLoader(), new Class[]{ImageOutput.class}, new InvocationHandler() { // from class: e3.i
                @Override // java.lang.reflect.InvocationHandler
                public final Object invoke(Object obj, Method method2, Object[] objArr) {
                    return this.f40415a.L(obj, method2, objArr);
                }
            });
        } catch (ClassNotFoundException | NoSuchMethodException unused) {
            cls = null;
            objNewProxyInstance = null;
            method = null;
        }
        this.f28135Q = cls;
        this.f28136R = method;
        this.f28137S = objNewProxyInstance;
        ImageView imageView2 = (ImageView) findViewById(e3.x.f40466b);
        this.f28127I = imageView2;
        this.f28142a0 = (!z13 || i19 == 0 || imageView2 == null) ? 0 : i19;
        if (i15 != 0) {
            this.f28144c0 = C3377a.e(getContext(), i15);
        }
        SubtitleView subtitleView = (SubtitleView) findViewById(e3.x.f40461Q);
        this.f28128J = subtitleView;
        if (subtitleView != null) {
            subtitleView.d();
            subtitleView.e();
        }
        View viewFindViewById2 = findViewById(e3.x.f40470f);
        this.f28129K = viewFindViewById2;
        if (viewFindViewById2 != null) {
            viewFindViewById2.setVisibility(8);
        }
        this.f28145d0 = i14;
        TextView textView = (TextView) findViewById(e3.x.f40478n);
        this.f28130L = textView;
        if (textView != null) {
            textView.setVisibility(8);
        }
        int i29 = e3.x.f40474j;
        C2159d c2159d = (C2159d) findViewById(i29);
        View viewFindViewById3 = findViewById(e3.x.f40475k);
        if (c2159d != null) {
            this.f28131M = c2159d;
            i20 = 0;
        } else if (viewFindViewById3 != null) {
            i20 = 0;
            C2159d c2159d2 = new C2159d(context, null, 0, attributeSet);
            this.f28131M = c2159d2;
            c2159d2.setId(i29);
            c2159d2.setLayoutParams(viewFindViewById3.getLayoutParams());
            ViewGroup viewGroup = (ViewGroup) viewFindViewById3.getParent();
            int iIndexOfChild = viewGroup.indexOfChild(viewFindViewById3);
            viewGroup.removeView(viewFindViewById3);
            viewGroup.addView(c2159d2, iIndexOfChild);
        } else {
            i20 = 0;
            this.f28131M = null;
        }
        C2159d c2159d3 = this.f28131M;
        this.f28148g0 = c2159d3 != null ? i11 : i20;
        this.f28151j0 = z11;
        this.f28149h0 = z15;
        this.f28150i0 = z14;
        this.f28139U = (!z10 || c2159d3 == null) ? i20 : 1;
        if (c2159d3 != null) {
            c2159d3.Z();
            this.f28131M.S(this.f28120B);
        }
        if (z10) {
            setClickable(true);
        }
        b0();
    }

    @Deprecated
    public void setControllerVisibilityListener(C2159d.m mVar) {
        C1804a.i(this.f28131M);
        C2159d.m mVar2 = this.f28141W;
        if (mVar2 == mVar) {
            return;
        }
        if (mVar2 != null) {
            this.f28131M.j0(mVar2);
        }
        this.f28141W = mVar;
        if (mVar != null) {
            this.f28131M.S(mVar);
            setControllerVisibilityListener((d) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class f {

        /* renamed from: a, reason: collision with root package name */
        SurfaceSyncGroup f28156a;

        private f() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public /* synthetic */ void d(SurfaceView surfaceView, Runnable runnable) {
            AttachedSurfaceControl rootSurfaceControl = surfaceView.getRootSurfaceControl();
            if (rootSurfaceControl == null) {
                return;
            }
            SurfaceSyncGroup surfaceSyncGroupA = e3.m.a("exo-sync-b-334901521");
            this.f28156a = surfaceSyncGroupA;
            C1804a.g(surfaceSyncGroupA.add(rootSurfaceControl, new Runnable() { // from class: androidx.media3.ui.y
                @Override // java.lang.Runnable
                public final void run() {
                    PlayerView.f.c();
                }
            }));
            runnable.run();
            rootSurfaceControl.applyTransactionOnDraw(e3.n.a());
        }

        public void e() {
            SurfaceSyncGroup surfaceSyncGroup = this.f28156a;
            if (surfaceSyncGroup != null) {
                surfaceSyncGroup.markSyncReady();
                this.f28156a = null;
            }
        }

        public void f(Handler handler, final SurfaceView surfaceView, final Runnable runnable) {
            handler.post(new Runnable() { // from class: androidx.media3.ui.x
                @Override // java.lang.Runnable
                public final void run() {
                    this.f28391B.d(surfaceView, runnable);
                }
            });
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static /* synthetic */ void c() {
        }
    }
}
