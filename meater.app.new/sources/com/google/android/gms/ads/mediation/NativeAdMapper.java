package com.google.android.gms.ads.mediation;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.VideoController;
import com.google.android.gms.internal.ads.zzard;
import java.util.Map;

@zzard
@Deprecated
/* loaded from: classes2.dex */
public class NativeAdMapper {
    protected View mAdChoicesContent;
    protected Bundle mExtras = new Bundle();
    protected boolean mOverrideClickHandling;
    protected boolean mOverrideImpressionRecording;
    private VideoController zzcje;
    private View zzena;
    private boolean zzenb;

    public View getAdChoicesContent() {
        return this.mAdChoicesContent;
    }

    public final Bundle getExtras() {
        return this.mExtras;
    }

    public final boolean getOverrideClickHandling() {
        return this.mOverrideClickHandling;
    }

    public final boolean getOverrideImpressionRecording() {
        return this.mOverrideImpressionRecording;
    }

    public final VideoController getVideoController() {
        return this.zzcje;
    }

    public void handleClick(View view) {
    }

    public boolean hasVideoContent() {
        return this.zzenb;
    }

    public void recordImpression() {
    }

    public void setAdChoicesContent(View view) {
        this.mAdChoicesContent = view;
    }

    public final void setExtras(Bundle bundle) {
        this.mExtras = bundle;
    }

    public void setHasVideoContent(boolean z) {
        this.zzenb = z;
    }

    public void setMediaView(View view) {
        this.zzena = view;
    }

    public final void setOverrideClickHandling(boolean z) {
        this.mOverrideClickHandling = z;
    }

    public final void setOverrideImpressionRecording(boolean z) {
        this.mOverrideImpressionRecording = z;
    }

    @Deprecated
    public void trackView(View view) {
    }

    public void trackViews(View view, Map<String, View> map, Map<String, View> map2) {
    }

    public void untrackView(View view) {
    }

    public final void zza(VideoController videoController) {
        this.zzcje = videoController;
    }

    public final View zzacd() {
        return this.zzena;
    }
}
