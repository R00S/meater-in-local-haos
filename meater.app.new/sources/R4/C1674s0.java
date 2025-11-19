package R4;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.content.res.Configuration;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.apptionlabs.meater_app.R;
import com.apptionlabs.meater_app.activities.WebViewActivity;

/* compiled from: ProbeCleanFragment.java */
/* renamed from: R4.s0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C1674s0 extends Fragment {

    /* renamed from: G0, reason: collision with root package name */
    L4.T0 f14999G0;

    /* renamed from: H0, reason: collision with root package name */
    private FrameLayout f15000H0;

    private void D2(View view) {
        this.f14999G0.f9621c.setOnClickListener(new View.OnClickListener() { // from class: R4.m0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14980B.E2(view2);
            }
        });
        this.f14999G0.f9624f.setOnClickListener(new View.OnClickListener() { // from class: R4.n0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14982B.F2(view2);
            }
        });
        this.f14999G0.f9627i.setVideoURI(Uri.parse("android.resource://" + T().getPackageName() + "/" + R.raw.anim_cleaning_probe));
        this.f14999G0.f9627i.start();
        this.f14999G0.f9627i.setOnCompletionListener(new MediaPlayer.OnCompletionListener() { // from class: R4.o0
            @Override // android.media.MediaPlayer.OnCompletionListener
            public final void onCompletion(MediaPlayer mediaPlayer) {
                this.f14984a.H2(mediaPlayer);
            }
        });
        this.f14999G0.f9620b.post(new Runnable() { // from class: R4.p0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14986B.I2();
            }
        });
        this.f14999G0.f9622d.setOnClickListener(new View.OnClickListener() { // from class: R4.q0
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                this.f14995B.J2(view2);
            }
        });
        this.f15000H0.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void E2(View view) {
        if (T() != null) {
            T().getOnBackPressedDispatcher().l();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void F2(View view) {
        Intent intent = new Intent(T(), (Class<?>) WebViewActivity.class);
        intent.putExtra("title", "Cleaning your MEATER");
        intent.putExtra("url", "file:///android_asset/cleaning-help.html");
        intent.setPackage(x4.g.h().getPackageName());
        t2(intent);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void G2() {
        this.f14999G0.f9627i.start();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void H2(MediaPlayer mediaPlayer) {
        new Handler(Looper.getMainLooper()).postDelayed(new Runnable() { // from class: R4.r0
            @Override // java.lang.Runnable
            public final void run() {
                this.f14997B.G2();
            }
        }, 2000L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void I2() {
        T();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void J2(View view) {
        x4.g.t().P0(false);
        if (T() == null || T() == null) {
            return;
        }
        T().getOnBackPressedDispatcher().l();
    }

    @Override // androidx.fragment.app.Fragment
    @SuppressLint({"RestrictedApi"})
    public View e1(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        FrameLayout frameLayout = new FrameLayout(Z());
        this.f15000H0 = frameLayout;
        L4.T0 t0C = L4.T0.c(layoutInflater, frameLayout, false);
        this.f14999G0 = t0C;
        D2(t0C.b());
        return this.f15000H0;
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f14999G0.f9627i.pause();
        this.f15000H0.removeAllViews();
        if (T() == null) {
            return;
        }
        L4.T0 t0C = L4.T0.c((LayoutInflater) T().getSystemService("layout_inflater"), null, false);
        this.f14999G0 = t0C;
        D2(t0C.b());
        this.f14999G0.f9627i.start();
    }

    @Override // androidx.fragment.app.Fragment
    public void q1() {
        super.q1();
        this.f14999G0.f9627i.pause();
    }

    @Override // androidx.fragment.app.Fragment
    public void v1() {
        super.v1();
        this.f14999G0.f9627i.start();
    }
}
